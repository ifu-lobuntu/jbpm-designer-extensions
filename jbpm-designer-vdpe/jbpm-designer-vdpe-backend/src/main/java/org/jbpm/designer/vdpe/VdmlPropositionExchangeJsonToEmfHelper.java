package org.jbpm.designer.vdpe;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdrc.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.smm.Measure;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.VdmlElement;

public class VdmlPropositionExchangeJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    public VdmlPropositionExchangeJsonToEmfHelper(ShapeMap resource) {
        super(resource);
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
    protected EClass[] getManagedClasses() {
        return new EClass[] { VDMLPackage.eINSTANCE.getRole(), VDMLPackage.eINSTANCE.getValueProposition(),
                VDMLPackage.eINSTANCE.getValuePropositionComponent() };
    }

    @Override
    public Object caseValuePropositionComponent(ValuePropositionComponent object) {
        Measure valueMeasure = (Measure) sourceShape.getUnboundProperty("valueMeasure");
        if (valueMeasure != null) {
            object.setValueMeasurement(ensureMeasuredCharacteristicDefinition(valueMeasure, object.getValueMeasurement()));
        }
        return super.caseValuePropositionComponent(object);
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createElement(stencilId);
    }
}
