package org.jbpm.designer.vdrc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.uml2.uml.Package;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.ucd.UmlHelper;
import org.jbpm.designer.vdlib.VdmlLibHelper;
import org.jbpm.designer.vdlib.VdmlLibraryStencil;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.designer.vdml.VDMLRoleCollaborationOrphanFilter;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class VdmlRoleCollaborationJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {

    public VdmlRoleCollaborationJsonToEmfHelper(ShapeMap resource) {
        super(resource, VdmlRoleCollaborationStencil.class);
    }

    @Override
    public Object caseRole(Role object) {
        String pcs = sourceShape.getProperty("performedActivities");
        if (pcs != null && pcs.trim().length() > 0) {
            String[] split = pcs.split(",");
            Set<String> performedActivities = new HashSet<String>(Arrays.asList(split));
            for (String string : performedActivities) {
                Activity a = findOrCreatePerformerWork(object, string);
            }
        }
        for (ShapeReference sr1 : sourceShape.getOutgoing()) {
            Shape edgeShape = shapeMap.get(sr1);
            if (edgeShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_TANGIBLE_DELIVERABLE_FLOW.getStencilId())
                    || edgeShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_INTANGIBLE_DELIVERABLE_FLOW.getStencilId())) {
                createActivities(object, edgeShape);
            }
        }
        return super.caseRole(object);
    }

    protected void createActivities(Role sourceRole, Shape edgeShape) {
        DeliverableFlow flow = (DeliverableFlow) shapeMap.getModelElement(edgeShape.getResourceId());
        String providingActivityName = edgeShape.getProperty("providingActivityName");
        if (providingActivityName == null || providingActivityName.trim().isEmpty()) {
            providingActivityName = sourceRole.getName() + "DefaultActivity";
        }
        Activity providingActivity = findOrCreatePerformerWork(sourceRole, providingActivityName);
        OutputPort op = VDMLFactory.eINSTANCE.createOutputPort();
        op.setOutput(flow);
        providingActivity.getContainedPort().add(op);
        for (ShapeReference sr2 : edgeShape.getOutgoing()) {
            Shape targetShape = shapeMap.get(sr2);
            if (targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.ROLE.getStencilId())) {
                Role targetRole = (Role) shapeMap.getModelElement(targetShape.getResourceId());
                String receivingActivityName = edgeShape.getProperty("receivingActivityName");
                if (receivingActivityName == null || receivingActivityName.trim().isEmpty()) {
                    receivingActivityName = targetRole.getName() + "DefaultActivity";
                }
                Activity receivingActivity = findOrCreatePerformerWork(targetRole, receivingActivityName);
                InputPort ip = VDMLFactory.eINSTANCE.createInputPort();
                ip.setInput(flow);
                ip.setName(flow.getName() +"From"+sourceRole.getName());
                op.setName(flow.getName() +"To"+targetRole.getName());
                receivingActivity.getContainedPort().add(ip);
            }
        }
    }

    private Activity findOrCreatePerformerWork(Role object, String string) {
        Activity a = null;
        for (Activity activity : object.getPerformedWork()) {
            if (activity.getName().equals(string)) {
                a = activity;
                break;
            }
        }
        if (a == null) {
            a = VDMLFactory.eINSTANCE.createActivity();
            a.setName(string);
            object.getPerformedWork().add(a);
            ((Collaboration) object.eContainer()).getActivity().add(a);
        }
        return a;
    }

    @Override
    protected OrphanFilter getOrphanFilter() {
        return new VDMLRoleCollaborationOrphanFilter();
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        String flowName = object.getName();
        if ("true".equals(sourceShape.getProperty("syncBusinessItem"))) {
            if (object.getDeliverable() != null && object.getDeliverable().getDefinition() != null) {
                Package pkg = UmlHelper.findPackageIn(object.eResource());
                pkg.getOwnedType(object.getDeliverable().getDefinition().getName()).setName(flowName);
                object.getDeliverable().setName(flowName);
                object.getDeliverable().getDefinition().setName(flowName);
            } else {
                ValueDeliveryModel vdm = VdmlHelper.getValueDeliveryModelIn(object.eResource());
                org.eclipse.uml2.uml.Class cls = VdmlLibHelper.findOrCreateBusinessItemDefinitionClass(flowName, vdm);
                BusinessItemDefinition bid1 = (BusinessItemDefinition) cls.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
                BusinessItem deliverable = VdmlHelper.findOrCreateBusinessItemFor(bid1, owningCollaboration);
                object.setDeliverable(deliverable);
                object.getDeliverable().setName(flowName);
                object.getDeliverable().getDefinition().setName(flowName);
                cls.setName(flowName);
                vdm.eResource().setModified(true);
            }
        } else {
            object.setDeliverable(buildBusinessItem("deliverableDefinition"));
        }
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        return null;// NB!! Don't do super it removes the deliverable
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlRoleCollaborationStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        return (VdmlElement) super.create(VdmlRoleCollaborationStencil.findStencilById(stencilId).getElementType());
    }
}
