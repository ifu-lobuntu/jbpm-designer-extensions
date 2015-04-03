package org.jbpm.designer.vdpe;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.vdrc.AbstractVdmlEmfToJsonHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.VdmlElement;

public class VdmlPropositionExchangeEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper {

    public VdmlPropositionExchangeEmfToJsonHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        targetShape.getProperties().put("collaborationtype", object.eClass().getName());
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseValuePropositionComponent(ValuePropositionComponent object) {
        MeasuredCharacteristic vm = object.getValueMeasurement();
        if (vm != null && vm.getCharacteristicDefinition() != null && vm.getCharacteristicDefinition().getMeasure().size() > 0) {
            targetShape.putProperty("valueMeasure", toString(vm.getCharacteristicDefinition().getMeasure().get(0)));
        }
        return super.caseValuePropositionComponent(object);
    }

    @Override
    public Object caseCapabilityMethod(CapabilityMethod object) {
        return super.caseCapabilityMethod(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        return VdmlPropositionExchangeStencil.findStencilByElement(me, de);
    }

    @Override
    public void preprocessResource(XMLResource resource) {
        Map<VdmlElement, VDMLDiagramElement> map = buildMap(resource);
        ValueDeliveryModel vdm = (ValueDeliveryModel) resource.getContents().get(0);
        VDMLDiagram vd = vdm.getDiagram().get(0);
        buildRoleShapes(resource, map, vd, 70d);
    }
}
