package org.jbpm.designer.vdpe;

import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Role;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.VdmlElement;

public class VdmlPropositionExchangeJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    public VdmlPropositionExchangeJsonToEmfHelper(ShapeMap shapeMap) {
        super(shapeMap, VdmlPropositionExchangeStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        return super.caseRole(object);
    }

    @Override
    public Object caseValueProposition(ValueProposition object) {
        return super.caseValueProposition(object);
    }

    @Override
    public Object caseValuePropositionComponent(ValuePropositionComponent object) {
        object.setValueMeasurement(buildMeasuredCharacteristic("valueMeasure"));
        object.setSatisfactionLevel(buildMeasuredCharacteristic("satisfactionLevelMeasure"));
        object.setPercentageWeight(buildMeasuredCharacteristic("percentageWeightMeasure"));
        return super.caseValuePropositionComponent(object);
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        VdmlPropositionExchangeStencil st = VdmlPropositionExchangeStencil.findStencilById(stencilId);
        if (st != null && st.getElementType() != null) {
            return (VdmlElement) super.create(st.getElementType());
        }
        return null;
    }
}
