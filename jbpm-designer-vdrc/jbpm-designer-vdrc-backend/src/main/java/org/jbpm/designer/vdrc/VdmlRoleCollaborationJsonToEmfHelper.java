package org.jbpm.designer.vdrc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class VdmlRoleCollaborationJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper implements JsonToEmfHelper {

    public VdmlRoleCollaborationJsonToEmfHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseRole(Role object) {
        String[] split = sourceShape.getProperty("performedActivities").split(",");
        Set<String> performedActivities = new HashSet<String>(Arrays.asList(split));
        for (String string : performedActivities) {
            Activity a = findOrCreatePerformerWork(object, string);
        }
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape targetShape = shapeMap.get(sr);
            if (targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_DELIVERABLE_FLOW.getStencilId())) {
                DeliverableFlow flow = (DeliverableFlow) shapeMap.getModelElement(targetShape.getResourceId());
                String providingActivityName = targetShape.getProperty("providingActivityName");
                if(providingActivityName==null || providingActivityName.trim().isEmpty()){
                    providingActivityName=object.getName()+"DefaultActivity";
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
    public Object caseDeliverableFlow(DeliverableFlow object) {
        if (sourceShape.getStencilId().equals(VdmlRoleCollaborationStencil.NEW_DELIVERABLE_FLOW.getStencilId())) {
            for (ShapeReference sr : sourceShape.getOutgoing()) {
                Shape targetShape = shapeMap.get(sr);
                if (targetShape.getStencilId().equals(VdmlRoleCollaborationStencil.ROLE.getStencilId())) {
                    Role role = (Role) shapeMap.getModelElement(targetShape.getResourceId());
                    String receivingActivityName = sourceShape.getProperty("receivingActivityName");
                    if(receivingActivityName==null || receivingActivityName.trim().isEmpty()){
                        receivingActivityName=role.getName()+"DefaultActivity";
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
    public void postprocessResource(XMLResource resource) {
        ValueDeliveryModel vdm = (ValueDeliveryModel) resource.getContents().get(0);
        Map<VdmlElement, VDMLDiagramElement> map = new HashMap<VdmlElement, VDMLDiagramElement>();
        buildMap(vdm.getDiagram().get(0), map, VDMLPackage.eINSTANCE.getRole(), VDMLPackage.eINSTANCE.getDeliverableFlow());
        Collaboration coll = vdm.getCollaboration().get(0);
        removeOrphanedRoles(map, coll);
        removeOrphanedFlows(map, coll);
    }


    protected void removeOrphanedFlows(Map<VdmlElement, VDMLDiagramElement> map, Collaboration coll) {
        for (DeliverableFlow flow : new ArrayList<DeliverableFlow>(coll.getFlow())) {
            if (!map.containsKey(flow)) {
                if (shouldHaveEdge(flow)) {
                    InputPort recipient = flow.getRecipient();
                    OutputPort provider = flow.getProvider();
                    removePortAndDependencies(coll, provider);
                    removePortAndDependencies(coll, recipient);
                }
            }
        }
    }
    private boolean shouldHaveEdge(DeliverableFlow flow) {
        Role receivingRole = RoleCollaborationUtil.getRoleFor(flow.getRecipient());
        Role providingRole = RoleCollaborationUtil.getRoleFor(flow.getProvider());
        boolean asdf = receivingRole != null && providingRole != null && receivingRole != providingRole;
        return asdf;
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlRoleCollaborationStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        return VdmlRoleCollaborationStencil.createElement(stencilId);
    }
}
