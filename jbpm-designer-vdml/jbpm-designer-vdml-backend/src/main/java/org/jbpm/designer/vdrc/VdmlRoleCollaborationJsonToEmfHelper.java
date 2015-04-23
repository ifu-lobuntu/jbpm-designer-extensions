package org.jbpm.designer.vdrc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdlib.VdmlLibraryJsonToEmfHelper;
import org.jbpm.designer.vdlib.VdmlLibraryStencil;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.designer.vdml.VDMLRoleCollaborationOrphanFilter;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.dd.dc.DCFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.BusinessItemLibraryElement;
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
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape targetShape = shapeMap.get(sr);
            if (targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_TANGIBLE_DELIVERABLE_FLOW.getStencilId())||targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_INTANGIBLE_DELIVERABLE_FLOW.getStencilId())) {
                DeliverableFlow flow = (DeliverableFlow) shapeMap.getModelElement(targetShape.getResourceId());
                String providingActivityName = targetShape.getProperty("providingActivityName");
                if (providingActivityName == null || providingActivityName.trim().isEmpty()) {
                    providingActivityName = object.getName() + "DefaultActivity";
                }
                Activity a = findOrCreatePerformerWork(object, providingActivityName);
                OutputPort op = VDMLFactory.eINSTANCE.createOutputPort();
                op.setName("ti" + object.getName());
                op.setOutput(flow);
                a.getContainedPort().add(op);
            }
        }
        return super.caseRole(object);
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
        object.setDeliverable(buildBusinessItem("deliverableDefinition"));
        if ((object.getDeliverable() == null || object.getDeliverable().getDefinition() == null || object.getDeliverable().getDefinition().eResource() == null)
                && object.getName() != null && object.getName().trim().length() > 0) {
            try {
                if ("true".equals(sourceShape.getProperty("syncBusinessItem"))) {
                    ValueDeliveryModel vdm = null;
                    UMLDiagram dgm = null;
                    Package pkg = null;
                    for (EObject eo : object.eResource().getContents()) {
                        if (eo instanceof ValueDeliveryModel) {
                            vdm = (ValueDeliveryModel) eo;
                        } else if (eo instanceof UMLDiagram) {
                            dgm = (UMLDiagram) eo;
                        } else if (eo instanceof Package) {
                            pkg = (Package) eo;
                        }
                    }
                    BusinessItemDefinition bid = null;
                    BusinessItemLibrary bil = VdmlLibraryJsonToEmfHelper.findOrCreateBusinessItemLibrary(pkg, vdm);
                    for (BusinessItemLibraryElement bile : bil.getBusinessItemLibraryElement()) {
                        if (bile instanceof BusinessItemDefinition && bile.getName().equals(object.getName())) {
                            bid = (BusinessItemDefinition) bile;
                            break;
                        }
                    }
                    if (bid == null) {
                        bid = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
                        bid.setName(object.getName());
                        vdm.getBusinessItemLibrary().get(0).getBusinessItemLibraryElement().add(bid);
                        org.eclipse.uml2.uml.Class cls = UMLFactory.eINSTANCE.createClass();
                        cls.setName(bid.getName());
                        pkg.getOwnedTypes().add(cls);
                        cls.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(bid);
                    }
                    if (object.getDeliverable() == null) {
                        BusinessItem bi = VDMLFactory.eINSTANCE.createBusinessItem();
                        bi.setDefinition(bid);
                        object.setDeliverable(bi);
                        owningCollaboration.getBusinessItem().add(bi);
                    } else {
                        object.getDeliverable().setDefinition(bid);
                    }
                    object.getDeliverable().setName(object.getName());
                    object.getDeliverable().getDefinition().setName(object.getName());
                    vdm.eResource().setModified(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        if (sourceShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_TANGIBLE_DELIVERABLE_FLOW.getStencilId())||sourceShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_INTANGIBLE_DELIVERABLE_FLOW.getStencilId())) {
            for (ShapeReference sr : sourceShape.getOutgoing()) {
                Shape targetShape = shapeMap.get(sr);
                if (targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.ROLE.getStencilId())) {
                    Role role = (Role) shapeMap.getModelElement(targetShape.getResourceId());
                    String receivingActivityName = sourceShape.getProperty("receivingActivityName");
                    if (receivingActivityName == null || receivingActivityName.trim().isEmpty()) {
                        receivingActivityName = role.getName() + "DefaultActivity";
                    }
                    Activity a = findOrCreatePerformerWork(role, receivingActivityName);
                    InputPort ip = VDMLFactory.eINSTANCE.createInputPort();
                    ip.setName("from" + object.getName());
                    ip.setInput(object);
                    a.getContainedPort().add(ip);
                }
            }
        }
        return super.caseDeliverableFlow(object);
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
