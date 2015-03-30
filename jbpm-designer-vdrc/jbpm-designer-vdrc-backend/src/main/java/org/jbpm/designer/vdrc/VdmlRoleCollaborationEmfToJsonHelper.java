package org.jbpm.designer.vdrc;

import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.util.VDMLSwitch;

public class VdmlRoleCollaborationEmfToJsonHelper extends VDMLSwitch<Object> implements EmfToJsonHelper {
    protected Shape targetShape;
    private ShapeMap resource;

    public VdmlRoleCollaborationEmfToJsonHelper(ShapeMap resource) {
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
        return VdmlRoleCollaborationStencil.findStencilByElement(me, de);
    }

    @Override
    public String convertToString(LinkedProperty property, Object val) {
        // TODO Auto-generated method stub
        return null;
    }
}
