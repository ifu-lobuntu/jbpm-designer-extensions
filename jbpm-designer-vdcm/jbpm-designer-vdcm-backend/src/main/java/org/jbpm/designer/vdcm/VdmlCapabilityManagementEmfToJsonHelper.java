package org.jbpm.designer.vdcm;

import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.vdrc.AbstractVdmlEmfToJsonHelper;
import org.jbpm.designer.vdrc.BoundaryShapePosition;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VdmlElement;

public class VdmlCapabilityManagementEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper {

    public VdmlCapabilityManagementEmfToJsonHelper(ShapeMap resource) {
        super(resource, VdmlCapabilityManagementStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        targetShape.getProperties().put("collaborationtype", object.eClass().getName());
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseCapabilityMethod(CapabilityMethod object) {
        return super.caseCapabilityMethod(object);
    }

    @Override
    public Object caseRole(Role object) {
        return super.caseRole(object);
    }

    @Override
    public Object caseActivity(Activity object) {
        return super.caseActivity(object);
    }

    @Override
    public Object caseInputPort(InputPort object) {
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        return super.caseOutputPort(object);
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseInputDelegation(InputDelegation object) {
        return super.caseInputDelegation(object);
    }

    @Override
    public Object caseOutputDelegation(OutputDelegation object) {
        return super.caseOutputDelegation(object);
    }

    @Override
    public Object caseStore(Store object) {
        return super.caseStore(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, org.omg.dd.di.DiagramElement de) {
        return VdmlCapabilityManagementStencil.findStencilByElement(me, de);
    }

    public void preprocessResource() {
        Map<VdmlElement, VDMLDiagramElement> map = buildVdmlElementToDiagramElementMap();
        if(!map.containsKey(owningCollaboration)){
            VDMLShape shape = VDMLDIFactory.eINSTANCE.createVDMLShape();
            shape.setVdmlElement(owningCollaboration);
            shape.setId(EcoreUtil.generateUUID());
            org.omg.dd.dc.Bounds bounds = DCFactory.eINSTANCE.createBounds();
            bounds.setX(10d);
            bounds.setY(10d);
            bounds.setWidth(500d);
            bounds.setHeight(500d);
            shape.setBounds(bounds);
            shape.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
            getDiagram().getOwnedVdmlDiagramElement().add(shape);
            map.put(owningCollaboration, shape);
        }
        buildRoleShapes(map, 200d, 100d,map.get(owningCollaboration));
    }
}
