package org.jbpm.designer.vdrc;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Role;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class VdmlRoleCollaborationEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper implements EmfToJsonHelper {
    public VdmlRoleCollaborationEmfToJsonHelper(ShapeMap resource) {
        super(resource);
    }

    public void preprocessResource(XMLResource resource) {
        Map<VdmlElement, VDMLDiagramElement> map = buildMap(resource);
        ValueDeliveryModel vdm = (ValueDeliveryModel) resource.getContents().get(0);
        VDMLDiagram vd = vdm.getDiagram().get(0);
        buildRoleShapes(resource, map, vd, 70d);
        buildDeliverableFlowEdges(resource, map, vd);
    }

    private void buildDeliverableFlowEdges(XMLResource resource, Map<VdmlElement, VDMLDiagramElement> map, VDMLDiagram vd) {
        TreeIterator<EObject> allContents = resource.getAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof DeliverableFlow && !map.containsKey(eObject)) {
                DeliverableFlow d = (DeliverableFlow) eObject;
                Role receivingRole = RoleCollaborationUtil.getRoleFor(d.getRecipient());
                Role providingRole = RoleCollaborationUtil.getRoleFor(d.getProvider());
                if (receivingRole != null && providingRole != null && receivingRole != providingRole) {
                    // Create flow
                    VDMLEdge edge = VDMLDIFactory.eINSTANCE.createVDMLEdge();
                    vd.getOwnedVdmlDiagramElement().add(edge);
                    edge.setId(EcoreUtil.generateUUID());
                    edge.setVdmlElement(d);
                    edge.setSourceShape((VDMLShape) map.get(providingRole));
                    edge.setTargetShape((VDMLShape) map.get(receivingRole));
                    map.put(d, edge);
                }
            }
        }
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
    public Object caseCapabilityMethod(CapabilityMethod object) {
        return super.caseCapabilityMethod(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        return VdmlRoleCollaborationStencil.findStencilByElement(me, de);
    }
}
