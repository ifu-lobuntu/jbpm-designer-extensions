package org.jbpm.designer.vdcm;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlEmfToJsonHelper;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.DCFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VdmlElement;

public class VdmlCapabilityManagementEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper {

    public VdmlCapabilityManagementEmfToJsonHelper(ShapeMap resource) {
        super(resource, VdmlCapabilityManagementStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        for (Shape shape : targetShape.getChildShapes()) {
            if(shape.getStencilId().equals(VdmlCapabilityManagementStencil.ORG_UNIT.getStencilId())){
                shape.putProperty("name", object.getName());
                shape.putProperty("description", object.getDescription());
            }
        }
        return super.caseCollaboration(object);
    }
    @Override
    public Object caseCapabilityOffer(CapabilityOffer object) {
        putMeasuredCharacteristic("heatIndexMeasure", object.getHeatIndex());
        return super.caseCapabilityOffer(object);
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
    public Object caseStore(Store object) {
        putMeasuredCharacteristic("durationMeasure", object.getDuration());
        putMeasuredCharacteristic("inventoryLevelMeasure", object.getInventoryLevel());
        putBusinessItem(object.getResource(),"resourceDefinition");
        return super.caseStore(object);
    }
    @Override
    public Object casePool(Pool object) {
        putMeasuredCharacteristic("poolSizeMeasure", object.getPoolSize());
        return super.casePool(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, org.omg.dd.di.DiagramElement de) {
        return VdmlCapabilityManagementStencil.findStencilByElement(me, (VDMLDiagramElement) de);
    }

    public void preprocessResource() {
        Map<VdmlElement, VDMLDiagramElement> map = buildVdmlElementToDiagramElementMap();
        VDMLShape thisOrgUnitShape=null;
        for (VDMLDiagramElement ve : VdmlHelper.getDiagram(shapeMap.getResource()).getOwnedVdmlDiagramElement()) {
            if(ve instanceof VDMLShape && ve.getVdmlElement()==null){
                thisOrgUnitShape=(VDMLShape) ve;
            }
        }
        if(thisOrgUnitShape==null){
            thisOrgUnitShape = VDMLDIFactory.eINSTANCE.createVDMLShape();
            thisOrgUnitShape.setId(EcoreUtil.generateUUID());
            org.omg.dd.dc.Bounds bounds = DCFactory.eINSTANCE.createBounds();
            bounds.setX(10d);
            bounds.setY(10d);
            bounds.setWidth(500d);
            bounds.setHeight(500d);
            thisOrgUnitShape.setBounds(bounds);
            thisOrgUnitShape.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
            getDiagram().getOwnedVdmlDiagramElement().add(thisOrgUnitShape);
        }
        buildRoleShapes(map, 200d, 100d,thisOrgUnitShape);
    }
}
