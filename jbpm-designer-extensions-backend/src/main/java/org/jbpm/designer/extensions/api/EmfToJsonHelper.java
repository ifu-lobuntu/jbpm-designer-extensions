package org.jbpm.designer.extensions.api;

import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;

public interface EmfToJsonHelper {

    void linkElements(DiagramElement diagramElement, Shape shape);

    void doSwitch(LinkedStencil validator, Shape targetShape, EObject me);

    Diagram getDiagram(int i);

    StencilInfo findStencilByElement(EObject me, DiagramElement de);

    String convertToString(LinkedProperty property, Object val);
    
    void preprocessResource();

}