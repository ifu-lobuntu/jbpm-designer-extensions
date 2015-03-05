package org.jbpm.designer.emf.util;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.dd.cmmn.di.Label;
import org.eclipse.dd.cmmn.di.Plane;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.server.diagram.json.Diagram;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.server.diagram.json.ShapeReference;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;

public interface JsonToEmfHelper {

    void linkElements(Shape shape, DiagramElement de, EObject modelElement);

    void doSwitch(LinkedStencil sv, Shape sourceShape);
//TODO merge with createDiagramElement and pass the resourceId
    EObject createElement(String stencilId);

    DiagramElement createDiagramElement(String stencilId);

    Plane prepareEmfDiagram(Diagram json, XMLResource result);

    Label setupDiagramElement(EObject modelElement, DiagramElement de);

    EObject create(EClass eType);

    void setTargetElement(Edge edge, ShapeReference target);

    void setSourceElement(Edge edge, Shape source);

}