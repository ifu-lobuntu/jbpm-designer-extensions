package org.jbpm.designer.vdpe;

import org.eclipse.dd.cmmn.di.Diagram;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.emf.util.EmfToJsonHelper;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.emf.util.StencilInfo;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;
import org.pavanecce.vdml.metamodel.vdml.CapabilityMethod;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel;
import org.pavanecce.vdml.metamodel.vdml.util.VdmlSwitch;

public class VdmlPropositionExchangeEmfToJsonHelper extends VdmlSwitch<Object> implements EmfToJsonHelper {
    protected Shape targetShape;
    private ShapeMap resource;

    public VdmlPropositionExchangeEmfToJsonHelper(ShapeMap resource) {
        super();
        this.resource = resource;
    }

    @Override
    public void doSwitch(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
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
    public void linkElements(DiagramElement diagramElement, Shape shape) {
    }

    @Override
    public Diagram getDiagram(int i) {
        ValueDeliveryModel dr = (ValueDeliveryModel) resource.getResource().getContents().get(0);
        return dr.getDiagram().get(i);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        return VdmlPropositionExchangeStencil.findStencilByElement(me, de);
    }
}
