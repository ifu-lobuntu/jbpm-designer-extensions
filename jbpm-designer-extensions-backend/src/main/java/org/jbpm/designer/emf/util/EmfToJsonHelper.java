package org.jbpm.designer.emf.util;

import org.eclipse.dd.cmmn.di.Diagram;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;

public interface EmfToJsonHelper {

    void linkElements(DiagramElement diagramElement, Shape shape);

    void doSwitch(LinkedStencil validator, Shape targetShape, EObject me);

    Diagram getDiagram(int i);

    StencilInfo findStencilByElement(EObject me, DiagramElement de);

}