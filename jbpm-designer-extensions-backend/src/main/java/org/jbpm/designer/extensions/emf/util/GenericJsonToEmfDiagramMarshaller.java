package org.jbpm.designer.extensions.emf.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
//import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
//import org.jbpm.cmmn.dd.cmmndi.CMMNLabel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.extensions.stencilset.linkage.Property;
import org.jbpm.designer.extensions.stencilset.linkage.StencilSet;
import org.jbpm.designer.web.profile.IDiagramProfile.IDiagramMarshaller;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;

public class GenericJsonToEmfDiagramMarshaller extends AbstractEmfJsonMarshaller implements IDiagramMarshaller {
    private ShapeMap shapeMap;
    private JsonToEmfHelper helper;

    public GenericJsonToEmfDiagramMarshaller(IEmfDiagramProfile cmmnProfileImpl) {
        super(cmmnProfileImpl);
    }

    @Override
    public String parseModel(String jsonModel, String preProcessingData) throws Exception {
        StringWriter writer = new StringWriter();
        getResource(jsonModel, preProcessingData).save(writer, null);
        return writer.toString();
    }

    @Override
    public org.eclipse.bpmn2.Definitions getDefinitions(String jsonModel, String preProcessingData) throws Exception {
        return null;
    }

    @Override
    public XMLResource getResource(String jsonModel, String preProcessingData) throws Exception {
        try {
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            Diagram d = om.readValue(jsonModel, Diagram.class);
            writeDiagram(d);
            XMLResource resource = convert(d);
            StringWriter writer = new StringWriter();
            resource.save(writer, null);
            profile.logInfo("=================XMI OUT:");
            profile.logInfo(writer.toString());
            return resource;
        } catch (Exception e) {
            throw e;
        }

    }

    private void writeDiagram(Diagram d) throws JsonGenerationException, JsonMappingException, IOException {
        profile.logInfo("=================JSON IN:");
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        String s = om.writeValueAsString(d);
        profile.logInfo(s);
    }

    private XMLResource convert(Diagram json) {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, profile.prepareResourceSet(resourceSet));
        super.setUriHandler(resourceSet);
        XMLResource result = (XMLResource) resourceSet.createResource(URI.createURI("file://test.xml"));
        result.setEncoding("UTF-8");
        this.shapeMap = new ShapeMap(result);
        this.helper = profile.createJsonToEmfHelper(shapeMap);
        org.omg.dd.di.Diagram emfDiagram = helper.prepareEmfDiagram(json, result);
        this.shapeMap.linkElements(emfDiagram, json);
        LinkedStencil ls = getStencil(json);
        setAttributes(json, emfDiagram, ls);
        setDiagramElementId(json, emfDiagram);
        createEmfElementsFromShapes(emfDiagram, json);
        linkEdgesRecursively(emfDiagram, json);
        writeModelBindingsRecursively(emfDiagram, json, ls);
        linkAndRefineEmfElementsRecursively(json);
        return result;
    }

    private void createEmfElementsFromShapes(DiagramElement parentDiagramElement, Shape parentShape) {
        for (Shape childShape : parentShape.getChildShapes()) {
            LinkedStencil sv = getStencil(childShape);
            DiagramElement de = createEmfElements(parentDiagramElement, childShape);
            setDiagramElementId(childShape, de);
            setAttributes(childShape, de, sv);
            createEmfElementsFromShapes(de, childShape);
        }
    }

    private void setDiagramElementId(Shape childShape, DiagramElement de) {
        String id = childShape.getProperties().get("diagramelementid");
        if (id == null || id.equals("null") || id.trim().isEmpty()) {
            id = EcoreUtil.generateUUID();
        }
        if (profile.useIdAttribute()) {
            de.setId(id);
        } else {
            shapeMap.getResource().setID(de, id);
        }
    }

    private DiagramElement createEmfElements(DiagramElement parentDiagramElement, Shape shape) {
        DiagramElement de = helper.createElements(shape);
        if (!de.getModelElement().isEmpty()) {
            setId(shape, getModelElement(de));
        }
        parentDiagramElement.getOwnedElement().add(de);
        shapeMap.linkElements(de, shape);
        if (de instanceof org.omg.dd.di.Shape) {
            Bounds bounds = DCFactory.eINSTANCE.createBounds();
            if (shape.getBounds().getUpperLeft().getX() != null) {
                bounds.setX(shape.getBounds().getUpperLeft().getX().doubleValue());
                bounds.setY(shape.getBounds().getUpperLeft().getY().doubleValue());
                bounds.setHeight((double) shape.getHeight());
                bounds.setWidth((double) shape.getWidth());
            }
            ((org.omg.dd.di.Shape) de).setBounds(bounds);
        }
        return de;
    }

    private void setId(Shape shape, EObject modelElement) {
        EAttribute eidAttribute = modelElement.eClass().getEIDAttribute();
        if (eidAttribute != null && profile.useIdAttribute()) {
            modelElement.eSet(eidAttribute, shape.getResourceId());
        } else {
            shapeMap.getResource().setID(modelElement, shape.getResourceId());
        }
    }

    private void writeModelBindingsRecursively(DiagramElement de, Shape shape, LinkedStencil ls) {
        EObject modelElement = getModelElement(de);
        if (de instanceof Edge) {
            Edge edge = (Edge) de;
            writeEdgeModelBindings(ls, modelElement, edge);

        } else if (modelElement != null && de instanceof BoundariedShape) {
            BoundariedShape boundariedShape = (BoundariedShape) de;
            writeBoundaryBindings(modelElement, boundariedShape);
        }
        for (Shape childShape : shape.getChildShapes()) {
            LinkedStencil childStencil = profile.getLinkedStencilSet().getLinkedStencil(childShape.getStencilId());
            DiagramElement childDiagramElement = shapeMap.getDiagramElement(childShape);
            writeChildBinding(de, childStencil, childDiagramElement);
            writeModelBindingsRecursively(childDiagramElement, childShape, childStencil);
        }
    }

    private void writeChildBinding(DiagramElement de, LinkedStencil childStencil, DiagramElement childDiagramElement) {
        if (hasValue(childStencil.getStencil().getChildBinding())) {
            EObject childModelElement = getModelElement(childDiagramElement);
            writeBinding(getModelElement(de), childStencil.getStencil().getChildBinding(), childModelElement);
        }
    }

    private void writeBoundaryBindings(EObject modelElement, BoundariedShape boundariedShape) {
        for (org.omg.dd.di.Shape bs : boundariedShape.getBoundaryShapes()) {
            EObject boundaryModelElement = getModelElement(bs);
            Shape boundaryShape = shapeMap.getShape(bs);
            LinkedStencil boundaryStencil = profile.getLinkedStencilSet().getLinkedStencil(boundaryShape.getStencilId());
            if (hasValue(boundaryStencil.getStencil().getBoundaryBinding())) {
                writeBinding(modelElement, boundaryStencil.getStencil().getBoundaryBinding(), boundaryModelElement);
            }
        }
    }

    private void writeEdgeModelBindings(LinkedStencil ls, EObject modelElement, Edge edge) {
        EObject targetModelElement = getModelElement(edge.getTarget());
        EObject sourceModelElement = getModelElement(edge.getSource());
        if (hasValue(ls.getStencil().getTargetBinding())) {
            EObject elementToModify;
            if (modelElement == null) {
                // Directly set the target on the source
                elementToModify = sourceModelElement;
            } else {
                elementToModify = modelElement;
            }
            if (elementToModify != null) {
                writeBinding(elementToModify, ls.getStencil().getTargetBinding(), targetModelElement);
            }
        }
        if (hasValue(ls.getStencil().getSourceBinding()) && sourceModelElement != null) {
            if (modelElement != null) {
                writeBinding(modelElement, ls.getStencil().getSourceBinding(), sourceModelElement);
            }
        }
    }

    private void linkEdgesRecursively(DiagramElement de, Shape shape) {
        System.out.println(shape.getStencilId() + " " +shape.getOutgoing().size());
        if (de instanceof Edge) {
            List<ShapeReference> outgoings = shape.getOutgoing();
            Edge edge = (Edge) de;
            if (outgoings.size() > 0) {
                ShapeReference target = outgoings.get(0);
                StencilSet ss = profile.getLinkedStencilSet().getStencilSet();
                EStructuralFeature targetFeature = edge.eClass().getEStructuralFeature(ss.getEdgeTargetBinding());
                if (targetFeature == null) {
                    throw new IllegalStateException("The type " + edge.eClass() + " does not have feature '" + ss.getEdgeTargetBinding() + "'");
                }
                edge.eSet(targetFeature, shapeMap.getDiagramElement(target.getResourceId()));
            }
        } else {
            List<ShapeReference> outgoings = shape.getOutgoing();
            for (ShapeReference og : outgoings) {
                DiagramElement edge = shapeMap.getDiagramElement(og.getResourceId());
                if (edge instanceof Edge) {
                    StencilSet ss = profile.getLinkedStencilSet().getStencilSet();
                    EStructuralFeature sourceFeature = edge.eClass().getEStructuralFeature(ss.getEdgeSourceBinding());
                    if (sourceFeature == null) {
                        throw new IllegalStateException("The type " + edge.eClass() + " does not have feature '" + ss.getEdgeTargetBinding() + "'");
                    }
                    edge.eSet(sourceFeature, de);
                    
                } else if (de instanceof BoundariedShape && edge instanceof org.omg.dd.di.Shape) {
                    ((BoundariedShape) de).getBoundaryShapes().add((org.omg.dd.di.Shape) edge);
                }
            }
        }
        for (Shape childShape : shape.getChildShapes()) {
            linkEdgesRecursively(shapeMap.getDiagramElement(childShape), childShape);
        }
    }

    private void setAttributes(Shape sourceShape, DiagramElement de, LinkedStencil sv) {
        EObject me = getModelElement(de);
        for (Property property : sv.getProperties().values()) {
            String stringValue = sourceShape.getProperty(property.getId().toLowerCase());
            if (hasValue(stringValue)) {
                if (hasValue(property.getBinding())) {
                    writeBinding(me, property.getBinding(), stringValue);
                } else if (hasValue(property.getViewBinding())) {
                    writeBinding(de, property.getViewBinding(), stringValue);
                } else if (me != null) {
                    EStructuralFeature eStructuralFeature = me.eClass().getEStructuralFeature(property.getId());
                    if (eStructuralFeature instanceof EAttribute && !((EAttribute) eStructuralFeature).isID()) {
                        setFeatureValue(me, eStructuralFeature, stringValue);
                    }
                }
            }
        }
    }

    private boolean hasValue(String binding) {
        return binding != null && binding.trim().length() > 0;
    }

    protected void writeBinding(EObject objectToModify, String binding, String stringValue) {
        String[] split = binding.trim().split("\\.");
        EObject currentTarget = createIntermediateObjects(objectToModify, split);
        EStructuralFeature a = currentTarget.eClass().getEStructuralFeature(split[split.length - 1]);
        setFeatureValue(currentTarget, a, stringValue);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected void writeBinding(EObject objectToModify, String binding, EObject value) {
        String[] split = binding.trim().split("\\.");
        EObject currentTarget = createIntermediateObjects(objectToModify, split);
        EStructuralFeature a = currentTarget.eClass().getEStructuralFeature(split[split.length - 1]);
        if (a.isMany()) {
            Object val = currentTarget.eGet(a);
            EList list = (EList) val;
            list.add(value);
        } else {
            currentTarget.eSet(a, value);
        }
    }

    private EObject createIntermediateObjects(EObject me, String[] split) {
        EObject currentTarget = me;
        for (int i = 0; i < split.length - 1; i++) {
            String featureName = split[i];
            if (featureName.endsWith("]")) {
                featureName = featureName.substring(0, featureName.indexOf("["));
            }
            EStructuralFeature sf = currentTarget.eClass().getEStructuralFeature(featureName);
            Object currentValue = currentTarget.eGet(sf);
            if (currentValue == null) {
                if (sf instanceof EReference && ((EReference) sf).isContainment()) {
                    currentValue = helper.create((EClass) sf.getEType());
                    currentTarget.eSet(sf, currentValue);
                } else {
                    // Any default creation of non-containment should be done in
                    // custom code (Stencil enum or switch)
                    throw new IllegalStateException("Property not found or null and not containment " + "split[i]");
                }
            }
            if (currentValue instanceof List) {
                String index = split[i];
                if (index.endsWith("]")) {
                    int idx = Integer.parseInt(index.substring(index.indexOf("[") + 1, index.length() - 1));
                    List listValue = (List) currentValue;
                    if (sf instanceof EReference && ((EReference) sf).isContainment()) {
                        while (listValue.size() <= idx) {
                            listValue.add(helper.create((EClass) sf.getEType()));
                        }
                    }
                    currentTarget = (EObject) listValue.get(idx);
                } else {
                    throw new IllegalStateException("Feature '" + featureName + "' requires an index");
                }
            } else {
                currentTarget = (EObject) currentValue;
            }
        }
        return currentTarget;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void setFeatureValue(EObject me, EStructuralFeature a, String stringValue) {
        Class<?> type = a.getEType().getInstanceClass();
        if (a.isMany()) {
            Object val = me.eGet(a);
            EList list = (EList) val;
            list.clear();
            String[] split = stringValue.split("\\,");
            for (String string : split) {
                list.add(convert(string, type));
            }
        } else {
            me.eSet(a, convert(stringValue, type));
        }
    }

    private void linkAndRefineEmfElementsRecursively(Shape sourceShape) {
        EObject me = shapeMap.getModelElement(sourceShape.getResourceId());
        DiagramElement diagramElement = shapeMap.getDiagramElement(sourceShape);
        if (me != null) {
            LinkedStencil sv = getStencil(sourceShape);
            setReferences(sourceShape, me, sv);
            helper.doSwitch(sv, sourceShape);
        }
        for (Shape shape : sourceShape.getChildShapes()) {
            linkAndRefineEmfElementsRecursively(shape);
        }
        if (diagramElement instanceof Edge) {
            addDefaultDockers(sourceShape, (Edge) diagramElement);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void setReferences(Shape sourceShape, EObject me, LinkedStencil sv) {
        for (EReference a : me.eClass().getEAllReferences()) {
            String val = sourceShape.getProperty(a.getName());
            if (hasValue(val)) {
                if (a.isMany()) {
                    EList list = (EList) me.eGet(a);
                    list.clear();
                    if (val != null) {
                        String[] split = val.split(",");
                        for (String id : split) {
                            list.add(shapeMap.getModelElement(id));
                        }
                    }
                } else {
                    me.eSet(a, shapeMap.getModelElement(val));
                }
            }
        }
    }

    private Object convert(String string, Class<?> targetType) {
        if (string == null || string.trim().isEmpty()) {
            return null;
        }
        if (targetType == String.class) {
            return string;
        } else if (targetType == Boolean.class || targetType == boolean.class) {
            return string.equalsIgnoreCase("true");
        } else if (targetType == Integer.class || targetType == int.class) {
            return Integer.valueOf(string);
        } else if (targetType == Double.class || targetType == double.class) {
            return Double.valueOf(string);
        } else if (targetType == Color.class) {
            Color c = DCFactory.eINSTANCE.createColor();
            if (string.startsWith("#")) {
                c.setRed(Integer.decode("#" + string.substring(1, 3)));
                c.setGreen(Integer.decode("#" + string.substring(3, 5)));
                c.setBlue(Integer.decode("#" + string.substring(5, 7)));
            }
            return c;
        } else if (Enumerator.class.isAssignableFrom(targetType)) {
            Object[] enumConstants = targetType.getEnumConstants();
            for (Object object : enumConstants) {
                if (((Enumerator) object).getName().equals(string)) {
                    return object;
                }
            }
            return null;
        }
        return string;
    }

    private LinkedStencil getStencil(Shape shape) {
        return profile.getLinkedStencilSet().getLinkedStencil(shape.getStencilId());
    }

    private void addDefaultDockers(Shape shape, Edge edge) {
        addWaypointToCenterOf(edge, edge.getSource());
        List<org.jbpm.designer.extensions.diagram.Point> dockers = shape.getDockers();
        for (int i = 1; i < dockers.size() - 1; i++) {
            Point wp = DCFactory.eINSTANCE.createPoint();
            wp.setX(dockers.get(i).getX().doubleValue());
            wp.setY(dockers.get(i).getY().doubleValue());
            edge.getWaypoint().add(wp);
        }
        addWaypointToCenterOf(edge, edge.getTarget());
    }

    public static void addWaypointToCenterOf(Edge edge, DiagramElement source) {
        Point start = DCFactory.eINSTANCE.createPoint();
        if (source instanceof org.omg.dd.di.Shape) {
            Bounds sourceBounds = ((org.omg.dd.di.Shape) source).getBounds();
            start.setX(sourceBounds.getX() + (sourceBounds.getWidth() / 2));
            start.setY(sourceBounds.getY() + (sourceBounds.getHeight() / 2));
        } else {
            System.out.println();
        }
        edge.getWaypoint().add(start);
    }
}
