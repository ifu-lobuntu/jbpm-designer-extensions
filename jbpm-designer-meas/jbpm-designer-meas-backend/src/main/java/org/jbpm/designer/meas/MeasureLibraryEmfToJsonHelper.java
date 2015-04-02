package org.jbpm.designer.meas;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.util.SMMSwitch;

public class MeasureLibraryEmfToJsonHelper extends SMMSwitch<Object> implements EmfToJsonHelper {
    protected Shape targetShape;
    private ShapeMap shapeMap;

    public MeasureLibraryEmfToJsonHelper(ShapeMap resource) {
        super();
        this.shapeMap = resource;
    }

    @Override
    public void doSwitch(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }


    @Override
    public void linkElements(org.omg.dd.di.DiagramElement diagramElement, Shape shape) {
    }

    @Override
    public org.omg.dd.di.Diagram getDiagram(int i) {
        MeasureLibrary dr = (MeasureLibrary) shapeMap.getResource().getContents().get(0);
        return dr.getOwnedDiagram().get(i);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, org.omg.dd.di.DiagramElement de) {
        return MeasureLibraryStencil.findStencilByElement(me, de);
    }

    @Override
    public String convertToString(LinkedProperty property, Object val) {
        return null;
    }

    @Override
    public void preprocessResource(XMLResource resource) {
    }
}
