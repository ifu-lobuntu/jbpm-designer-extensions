package org.jbpm.designer.vdpe;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlEmfToJsonHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.VdmlElement;

public class VdmlPropositionExchangeEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper {

    public VdmlPropositionExchangeEmfToJsonHelper(ShapeMap resource) {
        super(resource,VdmlPropositionExchangeStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        targetShape.getProperties().put("collaborationtype", object.eClass().getName());
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseValuePropositionComponent(ValuePropositionComponent object) {
        putMeasuredCharacteristic("valueMeasure", object.getValueMeasurement());
        putMeasuredCharacteristic("satisfactionLevelMeausure", object.getSatisfactionLevel());
        putMeasuredCharacteristic("percentageWeightMeasure", object.getPercentageWeight());
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
    public void preprocessResource() {
        Map<VdmlElement, VDMLDiagramElement> map = buildVdmlElementToDiagramElementMap();
        buildRoleShapes(map, 200d, 70d);
    }

}
