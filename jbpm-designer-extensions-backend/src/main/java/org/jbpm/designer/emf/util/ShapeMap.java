package org.jbpm.designer.emf.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.server.diagram.json.ShapeReference;

public class ShapeMap {
    private class Mapping {
        Shape shape;
        DiagramElement diagramElement;

        public Mapping(Shape shape, DiagramElement diagramElement) {
            super();
            this.shape = shape;
            this.diagramElement = diagramElement;
        }

    }

    private Map<String, Mapping> shapeMap = new HashMap<String, Mapping>();
    private Map<DiagramElement, Shape> diagramElementToShapeMap = new HashMap<DiagramElement, Shape>();
    private Map<EObject, DiagramElement> modelElementToDiagramElementMap = new HashMap<EObject, DiagramElement>();
    private XMLResource resource;

    public ShapeMap(XMLResource resource) {
        super();
        this.resource = resource;
    }

    public void linkElements(DiagramElement diagramElement, Shape shape) {
        this.shapeMap.put(shape.getResourceId(), new Mapping(shape, diagramElement));
        if(diagramElement.getModelElement()!=null){
            this.modelElementToDiagramElementMap.put(diagramElement.getModelElement(), diagramElement);
        }
        this.diagramElementToShapeMap.put(diagramElement, shape);
    }

    public Shape getShape(DiagramElement de) {
        return diagramElementToShapeMap.get(de);
    }

    public DiagramElement getDiagramElement(Shape shape) {
        return shapeMap.get(shape.getResourceId()).diagramElement;
    }

    public Collection<Shape> values() {
        Set<Shape> result = new HashSet<Shape>();
        for (Mapping mapping : shapeMap.values()) {
            result.add(mapping.shape);
        }
        return result;
    }

    public Shape get(String resourceId) {
        return shapeMap.get(resourceId).shape;
    }

    public Shape get(ShapeReference ref) {
        return get(ref.getResourceId());
    }

    public Map<Shape, Set<Shape>> buildIncomingMap() {
        Map<Shape, Set<Shape>> incomingMap = new HashMap<Shape, Set<Shape>>();
        for (Shape shape : values()) {
            for (ShapeReference sr : shape.getOutgoing()) {
                Shape outgoing = get(sr);
                Set<Shape> set = incomingMap.get(outgoing);
                if (set == null) {
                    incomingMap.put(outgoing, set = new HashSet<Shape>());
                }
                set.add(shape);
            }
        }
        return incomingMap;
    }

    public XMLResource getResource() {
        return resource;
    }

    public EObject getModelElement(String resourceId) {
        Mapping mapping = this.shapeMap.get(resourceId);
        return mapping.diagramElement.getModelElement();
    }

    public DiagramElement getDiagramElement(String resourceId) {
        return this.shapeMap.get(resourceId).diagramElement;
    }

    public Shape getShape(EObject element) {
        return get(getId(element));
    }

    public String getId(EObject modelElement) {
        EAttribute eidAttribute = modelElement.eClass().getEIDAttribute();
        String idVal=null;
        if (eidAttribute != null) {
            idVal = (String) modelElement.eGet(eidAttribute);
        }
        if (idVal == null) {
            return resource.getID(modelElement);
        }
        return idVal;
    }
}
