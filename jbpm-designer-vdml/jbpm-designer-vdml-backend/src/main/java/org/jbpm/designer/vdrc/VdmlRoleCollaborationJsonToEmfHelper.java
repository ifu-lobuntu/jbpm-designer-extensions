package org.jbpm.designer.vdrc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
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
            if (targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_DELIVERABLE_FLOW.getStencilId())) {
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
        return new OrphanFilter() {

            @Override
            public boolean shouldHaveDiagramElement(VdmlElement e) {
                if (e instanceof DeliverableFlow) {
                    DeliverableFlow flow = (DeliverableFlow) e;
                    Role receivingRole = VdmlHelper.getRoleResponsibleFor(flow.getRecipient());
                    Role providingRole = VdmlHelper.getRoleResponsibleFor(flow.getProvider());
                    return receivingRole != null && providingRole != null && receivingRole != providingRole;
                } else {
                    return true;
                }
            }
        };
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        if (sourceShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_DELIVERABLE_FLOW.getStencilId())) {
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
