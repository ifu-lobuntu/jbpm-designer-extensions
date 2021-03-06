package org.jbpm.designer.meas;

import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
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
    public void refineJsonShape(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }

    @Override
    public void linkElements(org.omg.dd.di.DiagramElement diagramElement, Shape shape) {
    }

    @Override
    public org.omg.dd.di.Diagram getDiagram() {
        MeasureLibrary dr = (MeasureLibrary) shapeMap.getResource().getContents().get(0);
        for (SMMDiagram smmDiagram : dr.getOwnedDiagram()) {
            return smmDiagram;
        }
        return null;
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
    public void preprocessResource() {
    }
}
