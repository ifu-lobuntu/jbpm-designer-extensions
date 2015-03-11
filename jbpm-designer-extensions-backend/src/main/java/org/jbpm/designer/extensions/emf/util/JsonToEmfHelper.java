package org.jbpm.designer.extensions.emf.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.omg.dd.di.DiagramElement;

public interface JsonToEmfHelper {

    DiagramElement createElements(Shape shape);

    void doSwitch(LinkedStencil sv, Shape sourceShape);

    org.omg.dd.di.Diagram prepareEmfDiagram(Diagram json, XMLResource result);

    EObject create(EClass eType);

    Object convertFromString(LinkedProperty property, String string, Class<?> targetType);


}