package org.jbpm.designer.emf.util;

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
import org.eclipse.bpmn2.Definitions;
//import org.eclipse.cmmndi.CMMNEdge;
//import org.eclipse.cmmndi.CMMNLabel;
import org.eclipse.dd.cmmn.dc.Bounds;
import org.eclipse.dd.cmmn.dc.DcFactory;
import org.eclipse.dd.cmmn.dc.Point;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.dd.cmmn.di.Label;
import org.eclipse.dd.cmmn.di.Plane;
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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.server.diagram.json.Diagram;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.server.diagram.json.ShapeReference;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.stencilset.linkage.Property;
import org.jbpm.designer.web.profile.IDiagramProfile.IDiagramMarshaller;

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
    public Definitions getDefinitions(String jsonModel, String preProcessingData) throws Exception {
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
            System.out.println("=================XMI OUT:");
            System.out.println(writer.toString());
            return resource;
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeDiagram(Diagram d) throws JsonGenerationException, JsonMappingException, IOException {
        System.out.println("=================JSON IN:");
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        String s = om.writeValueAsString(d);
        System.out.println(s);
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
        Plane cmmnPlane = helper.prepareEmfDiagram(json, result);
        this.shapeMap.linkElements(cmmnPlane, json);
        setAttributes(json, cmmnPlane.getModelElement(), profile.getLinkedStencilSet().getLinkedStencil(json.getStencilId()));
        setDiagramElementId(json, cmmnPlane);
        createEmfElementsFromShapes(cmmnPlane, json);
        linkEdgesRecursively(json);
        linkAndRefineEmfElementsRecursively(json);
        return result;
    }

    private void createEmfElementsFromShapes(DiagramElement parentDiagramElement, Shape parentShape) {
        for (Shape childShape : parentShape.getChildShapes()) {
            LinkedStencil sv = getStencil(childShape);
            DiagramElement de = createEmfElements(parentDiagramElement, childShape);
            setDiagramElementId(childShape, de);
            Label label = helper.setupDiagramElement(de.getModelElement(), de);
            setLabelStyle(label, childShape);
            setAttributes(childShape, de.getModelElement(), sv);
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
        EObject modelElement = helper.createElement(shape.getStencilId());
        if (modelElement != null) {
            setId(shape, modelElement);
        }
        DiagramElement de = helper.createDiagramElement(shape.getStencilId());
        parentDiagramElement.getOwnedElement().add(de);
        helper.linkElements(shape, de, modelElement);
        shapeMap.linkElements(de, shape);
        if (de instanceof org.eclipse.dd.cmmn.di.Shape) {
            Bounds bounds = DcFactory.eINSTANCE.createBounds();
            if (shape.getBounds().getUpperLeft().getX() != null) {
                bounds.setX(shape.getBounds().getUpperLeft().getX().floatValue());
                bounds.setY(shape.getBounds().getUpperLeft().getY().floatValue());
                bounds.setHeight((float) shape.getHeight());
                bounds.setWidth((float) shape.getWidth());
            }
            ((org.eclipse.dd.cmmn.di.Shape) de).setBounds(bounds);
        } else if (de instanceof Edge) {
            Edge edge = (Edge) de;
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

    private void linkEdgesRecursively(Shape shape) {
        DiagramElement de = shapeMap.getDiagramElement(shape);
        if (de instanceof Edge) {
            List<ShapeReference> outgoings = shape.getOutgoing();
            Edge edge = (Edge) de;
            if (outgoings.size() > 0) {
                ShapeReference target = outgoings.get(0);
                helper.setTargetElement(edge, target);
            }
        } else {
            List<ShapeReference> outgoings = shape.getOutgoing();
            for (ShapeReference og : outgoings) {
                DiagramElement edge = shapeMap.getDiagramElement(og.getResourceId());
                if (edge instanceof Edge) {
                    helper.setSourceElement((Edge) edge, shape);
                }
            }
        }
        for (Shape childShape : shape.getChildShapes()) {
            linkEdgesRecursively(childShape);
        }
    }

    private void setAttributes(Shape sourceShape, EObject me, LinkedStencil sv) {
        for (Property property : sv.getProperties().values()) {
            String stringValue = sourceShape.getProperty(property.getId().toLowerCase());
            if (stringValue != null) {
                if (property.getBinding() == null || property.getBinding().trim().length() == 0) {
                    EStructuralFeature eStructuralFeature = colorAttributes.get(property.getId());
                    if (eStructuralFeature == null) {
                        if (me != null) {
                            eStructuralFeature = me.eClass().getEStructuralFeature(property.getId());
                            if (eStructuralFeature instanceof EAttribute) {
                                EAttribute a = (EAttribute) eStructuralFeature;
                                if (!a.isID()) {
                                    setAttribute(me, a, stringValue);
                                }
                            }
                        }
                    } else {
                        FeatureMap map = shapeMap.getDiagramElement(sourceShape.getResourceId()).getAnyAttribute();
                        if (map != null) {
                            map.set(eStructuralFeature, convert(stringValue, eStructuralFeature.getEType().getInstanceClass()));
                        }
                    }
                } else if (me != null) {
                    String[] split = property.getBinding().trim().split("\\.");
                    EObject currentTarget = createIntermediateObjects(me, split);
                    EStructuralFeature a = currentTarget.eClass().getEStructuralFeature(split[split.length - 1]);
                    if (a instanceof EAttribute) {
                        setAttribute(currentTarget, (EAttribute) a, stringValue);
                    }
                }
            }
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
                    currentTarget = (EObject) ((List) currentValue).get(idx);
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
    private void setAttribute(EObject me, EAttribute a, String stringValue) {
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

    private void setReferences(Shape sourceShape, EObject me, LinkedStencil sv) {
        for (EReference a : me.eClass().getEAllReferences()) {
            if (sv.getProperties().containsKey(a.getName())) {
                String val = sourceShape.getProperty(a.getName());
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

    private void setLabelStyle(Label label, Shape shape) {
        if (label != null) {
            // label.setLabelStyle(CmmnDiFactory.eINSTANCE.createCMMNLabelStyle());
            // Font font = DcFactory.eINSTANCE.createFont();
            // label.getLabelStyle().setFont(font);
        }
    }

    private void addDefaultDockers(Shape shape, Edge edge) {
        addWaypointToCenterOf(edge, edge.getSource());
        List<org.jbpm.designer.server.diagram.json.Point> dockers = shape.getDockers();
        for (int i = 1; i < dockers.size() - 1; i++) {
            Point wp = DcFactory.eINSTANCE.createPoint();
            wp.setX(dockers.get(i).getX().floatValue());
            wp.setY(dockers.get(i).getY().floatValue());
            edge.getWaypoint().add(wp);
        }
        addWaypointToCenterOf(edge, edge.getTarget());
    }

    public static void addWaypointToCenterOf(Edge edge, DiagramElement source) {
        Point start = DcFactory.eINSTANCE.createPoint();
        if (source instanceof org.eclipse.dd.cmmn.di.Shape) {
            Bounds sourceBounds = ((org.eclipse.dd.cmmn.di.Shape) source).getBounds();
            start.setX(sourceBounds.getX() + (sourceBounds.getWidth() / 2));
            start.setY(sourceBounds.getY() + (sourceBounds.getHeight() / 2));
        } else {
            System.out.println();
        }
        edge.getWaypoint().add(start);
    }

}
