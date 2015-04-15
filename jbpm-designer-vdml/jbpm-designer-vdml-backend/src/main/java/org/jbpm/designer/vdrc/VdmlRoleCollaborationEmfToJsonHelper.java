package org.jbpm.designer.vdrc;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlEmfToJsonHelper;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.Assignment;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Participant;
import org.omg.vdml.Role;
import org.omg.vdml.VdmlElement;

public class VdmlRoleCollaborationEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper implements EmfToJsonHelper {
    public VdmlRoleCollaborationEmfToJsonHelper(ShapeMap shapeMap) {
        super(shapeMap, VdmlRoleCollaborationStencil.class);

    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        StringBuilder sb = new StringBuilder();
        Iterator<Activity> iterator = object.getPerformedWork().iterator();
        while (iterator.hasNext()) {
            Activity activity = iterator.next();
            sb.append(activity.getName());
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        targetShape.putProperty("performedActivities", sb.toString());
        return super.caseRole(object);
    }


    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        if (object.getProvider() != null) {
            targetShape.putProperty("providingActivityName", ((VdmlElement) object.getProvider().eContainer()).getName());
        }
        if (object.getRecipient() != null) {
            targetShape.putProperty("receivingActivityName", ((VdmlElement) object.getRecipient().eContainer()).getName());
        }
        return super.caseDeliverableFlow(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        return VdmlRoleCollaborationStencil.findStencilByElement(me, de);
    }

    public void preprocessResource() {
        Map<VdmlElement, VDMLDiagramElement> map = buildVdmlElementToDiagramElementMap();
        buildRoleShapes(map, 200d, 70d);
        buildDeliverableFlowEdges(map);
    }

    private void buildDeliverableFlowEdges(Map<VdmlElement, VDMLDiagramElement> map) {
        OrphanFilter of = getOrphanFilter();
        TreeIterator<EObject> allContents = owningCollaboration.eAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof DeliverableFlow && of.shouldHaveDiagramElement((VdmlElement) eObject) && !map.containsKey(eObject)) {
                DeliverableFlow d = (DeliverableFlow) eObject;
                // Create flow
                VDMLEdge edge = VDMLDIFactory.eINSTANCE.createVDMLEdge();
                getDiagram().getOwnedVdmlDiagramElement().add(edge);
                edge.setId(EcoreUtil.generateUUID());
                edge.setVdmlElement(d);
                edge.setSourceShape((VDMLShape) map.get(VdmlHelper.getRoleResponsibleFor(d.getProvider())));
                edge.setTargetShape((VDMLShape) map.get(VdmlHelper.getRoleResponsibleFor(d.getRecipient())));
                map.put(d, edge);
            }
        }
    }

}
