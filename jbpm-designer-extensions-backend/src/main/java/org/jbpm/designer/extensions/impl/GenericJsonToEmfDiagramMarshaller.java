package org.jbpm.designer.extensions.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
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
    JsonToEmfHelper helper;
    private URI uri;

    public GenericJsonToEmfDiagramMarshaller(IEmfDiagramProfile emfProfile, URI uri) {
        super(emfProfile);
        this.uri = uri;
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
            // writeDiagram(d, "======JSON IN");
            XMLResource resource = convert(d);
            // writeResource(resource, "======XML OUT");
            return resource;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private Object fillList(EStructuralFeature sf, List listValue, String index, boolean hasValue) {
        if (index.endsWith("]")) {
            int idx = Integer.parseInt(index.substring(index.indexOf("[") + 1, index.length() - 1));
            if (sf instanceof EReference && hasValue) {
                while (listValue.size() <= idx) {
                    listValue.add(helper.create((EClass) sf.getEType()));
                }
            }
            if(listValue.size()<=idx){
                return null;
            }else{
                return listValue.get(idx);
            }
        } else {
            throw new IllegalStateException("Feature '" + index + "' requires an index");
        }
    }

    public XMLResource convert(Diagram json) throws IOException {
        ResourceSet resourceSet = new ResourceSetImpl();
        profile.prepareResourceSet(resourceSet);
        XMLResource result = constructResource(resourceSet);
        this.shapeMap = new ShapeMap(result);
        this.helper = profile.createJsonToEmfHelper(shapeMap);
        org.omg.dd.di.Diagram emfDiagram = helper.prepareEmfDiagram(json, result);
        this.shapeMap.linkElements(emfDiagram, json);
        LinkedStencil ls = getStencil(json);
        setAttributes(json, emfDiagram, ls, false);
        setDiagramElementId(json, emfDiagram);
        createEmfElementsFromShapes(emfDiagram, json);
        linkEdgesRecursively(emfDiagram, json);
        writeModelBindingsRecursively(emfDiagram, json, ls);
        linkAndRefineEmfElementsRecursively(json);
        removeFromContainer(collectOrphanedEdges(emfDiagram));
        removeFromContainer(collectOrphanedShapes(emfDiagram));
        result.setModified(true);
        this.helper.postprocessResource();
        //TODO maybe clean up the orphanedEdges again?
        result.getDefaultLoadOptions().putAll(profile.buildDefaultResourceOptions());
        result.getDefaultSaveOptions().putAll(profile.buildDefaultResourceOptions());
        return result;
    }

    protected XMLResource constructResource(ResourceSet resourceSet) {
        XMLResource result = null;
        if (profile.mergeOnUpdate()) {
            result = (XMLResource) resourceSet.getResource(uri, true);
        } else {
            result = (XMLResource) resourceSet.createResource(uri);
        }
        result.setEncoding("UTF-8");
        return result;
    }

    private Set<DiagramElement> collectOrphanedEdges(org.omg.dd.di.Diagram emfDiagram) {
        Set<DiagramElement> edgesToRemove = new HashSet<DiagramElement>();
        TreeIterator<EObject> eAllContents = emfDiagram.eAllContents();
        while (eAllContents.hasNext()) {
            EObject next = eAllContents.next();
            if (next instanceof Edge) {
                Edge edge = (Edge) next;
                if (!(shouldHaveShape(getModelElement(edge.getSource())) || shouldHaveShape(getModelElement(edge.getTarget())) || shouldHaveShape(getModelElement(edge)))) {
                    edgesToRemove.add((Edge) next);
                }
            } else if (next instanceof BoundariedShape) {
                Iterator<org.omg.dd.di.Shape> iterator = ((BoundariedShape) next).getBoundaryShapes().iterator();
                while (iterator.hasNext()) {
                    if (!shouldHaveShape(iterator.next())) {
                        edgesToRemove.add((Edge) next);
                    }
                }
            }
        }
        return edgesToRemove;
    }

    @SuppressWarnings("rawtypes")
    private void removeFromContainer(Set<DiagramElement> des) {
        for (DiagramElement de : des) {
            if (de.eContainingFeature().isMany()) {
                List list = (List) de.eContainer().eGet(de.eContainingFeature());
                list.remove(de);
            } else {
                de.eContainer().eSet(de.eContainingFeature(), null);
            }
        }
    }

    private Set<DiagramElement> collectOrphanedShapes(org.omg.dd.di.Diagram emfDiagram) {
        Set<DiagramElement> orphans = new HashSet<DiagramElement>();
        TreeIterator<EObject> eAllContents = emfDiagram.eAllContents();
        while (eAllContents.hasNext()) {
            EObject next = eAllContents.next();
            if (next instanceof org.omg.dd.di.Shape) {
                org.omg.dd.di.Shape shape = (org.omg.dd.di.Shape) next;
                if (!shouldHaveShape(getModelElement(shape))) {
                    orphans.add(shape);
                }
            }
        }
        return orphans;
    }

    private void createEmfElementsFromShapes(DiagramElement parentDiagramElement, Shape parentShape) {
        for (Shape childShape : parentShape.getChildShapes()) {
            LinkedStencil sv = getStencil(childShape);
            DiagramElement de = createEmfElements(parentDiagramElement, childShape);
            setDiagramElementId(childShape, de);
            setAttributes(childShape, de, sv, false);
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
        try {
            parentDiagramElement.getOwnedElement().add(de);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
            if (de instanceof Compartment) {
                de = (DiagramElement) de.eContainer();
            }
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

    private void setAttributes(Shape sourceShape, DiagramElement de, LinkedStencil sv, boolean late) {
        EObject me = getModelElement(de);
        for (LinkedProperty property : sv.getProperties().values()) {
            if (property.getProperty().isBindLate() == late) {
                String stringValue = sourceShape.getProperty(property.getId().toLowerCase());
                if (hasValue(property.getBinding())) {
                    writeBinding(me, property, property.getBinding(), stringValue);
                } else if (hasValue(property.getViewBinding())) {
                    writeBinding(de, property, property.getViewBinding(), stringValue);
                } else if (me != null) {
                    EStructuralFeature eStructuralFeature = me.eClass().getEStructuralFeature(property.getId());
                    if (eStructuralFeature == null){
                        if(property.getReference()!=null || property.getExpectedType()!=null){
                            sourceShape.putUnboundProperty(property.getId(),convert(property, stringValue, property.getExpectedType()));
                        }
                    }else if(!(eStructuralFeature instanceof EAttribute && ((EAttribute) eStructuralFeature).isID())) {
                        setFeatureValue(me, property, eStructuralFeature, stringValue);
                    }
                }
            }
        }
    }

    private boolean hasValue(String binding) {
        return binding != null && binding.trim().length() > 0;
    }

    protected void writeBinding(EObject objectToModify, LinkedProperty property, String binding, String stringValue) {
        String[] split = binding.trim().split("\\.");
        Object currentTarget = createIntermediateObjects(objectToModify, split, hasValue(stringValue));
        if (currentTarget != null) {
            EStructuralFeature a = getStructuralFeature(currentTarget, split[split.length - 1]);
            setFeatureValue(currentTarget, property, a, stringValue);
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected void writeBinding(EObject objectToModify, String binding, EObject value) {
        String[] split = binding.trim().split("\\.");
        Object currentTarget = createIntermediateObjects(objectToModify, split, value != null);
        if (currentTarget != null) {
            EStructuralFeature a = getStructuralFeature(currentTarget, split[split.length - 1]);
            if (a == null) {
                throw new IllegalStateException("Feature '" + split[split.length - 1] + "' not found on class '" + objectToModify.eClass().getName());
            }
            if (a.isMany()) {
                Object val = getValue(currentTarget, a);
                EList list = (EList) val;
                list.add(value);
            } else {
                setValueOn(currentTarget, a, value);
            }
        }
    }

    private Object createIntermediateObjects(EObject me, String[] split, boolean hasValue) {
        Object currentTarget = me;
        for (int i = 0; i < split.length - 1; i++) {
            String featureName = split[i];
            EStructuralFeature sf = getStructuralFeature(currentTarget, featureName);
            if (sf == null) {
                throw new IllegalStateException("Type '" + currentTarget.getClass().getSimpleName() + "' does not define a feature '" + featureName + "'");
            }
            Object currentValue = getValue(currentTarget, sf);
            if (currentValue == null) {
                if (hasValue) {
                    if (sf instanceof EReference) {
                        currentValue = helper.create((EClass) sf.getEType());
                        setValueOn(currentTarget, sf, currentValue);
                    }
                }
            }
            if (currentValue instanceof FeatureMap) {
                currentTarget = (FeatureMap) currentValue;
            } else if (currentValue instanceof List) {
                List listValue = (List) currentValue;
                String index = split[i];
                currentTarget = fillList(sf, listValue, index,hasValue);
            } else {
                currentTarget = (EObject) currentValue;
            }
            if (currentTarget == null) {
                break;
            }
        }
        return currentTarget;
    }

    private void setValueOn(Object currentTarget, EStructuralFeature sf, Object currentValue) {
        if(sf.getEType().getInstanceClass().isPrimitive() && currentValue==null){
            return;
        }
        if (currentTarget instanceof EObject) {
            ((EObject) currentTarget).eSet(sf, currentValue);
        } else if (currentTarget instanceof FeatureMap) {
            ((FeatureMap) currentTarget).set(sf, currentValue);
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void setFeatureValue(Object targetObject, LinkedProperty property, EStructuralFeature a, String stringValue) {
        Class<?> type = a.getEType().getInstanceClass();
        if (a.isMany()) {
            Object val = getValue(targetObject, a);
            EList list = (EList) val;
            list.clear();
            if (hasValue(stringValue)) {
                String[] split = stringValue.split("\\,");
                for (String string : split) {
                    Collection convert = (Collection) convert(property, string, type);
                    try {
                        list.addAll(convert);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            setValueOn(targetObject, a, convert(property, stringValue, type));
        }
    }

    private void linkAndRefineEmfElementsRecursively(Shape sourceShape) {
        EObject me = shapeMap.getModelElement(sourceShape.getResourceId());
        DiagramElement diagramElement = shapeMap.getDiagramElement(sourceShape);
        LinkedStencil sv = getStencil(sourceShape);
        setAttributes(sourceShape, diagramElement, sv, true);
        if (me != null) {
            helper.refineEmfElements(sv, sourceShape);
        }
        for (Shape shape : sourceShape.getChildShapes()) {
            linkAndRefineEmfElementsRecursively(shape);
        }
        if (diagramElement instanceof Edge) {
            addDefaultDockers(sourceShape, (Edge) diagramElement);
        }
    }

    private Object convert(LinkedProperty property, String string, Class<?> targetType) {
        if (string == null || string.trim().isEmpty()) {
            return null;
        }
        if (property.getReference() != null && string.indexOf("|") > 0) {
            if(property.getReference().isMultiSelect()){
                EList list = new BasicEList();
                for (String ref : string.split("\\,")) {
                    EObject resolved = (EObject) resolveEObject(property, ref, targetType);
                    if(!(resolved.eIsProxy() || resolved.eResource()==null)){
                        list.add(resolved);
                    }
                }
                return list;
            }else{
                return resolveEObject(property, string, targetType);
            }
        } else if (targetType == String.class) {
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
        } else {
            Object val = helper.convertFromString(property, string, targetType);
            if (val != null) {
                return val;
            }
        }
        return string;
    }

    private Object resolveEObject(LinkedProperty property, String string, Class<?> targetType) {
        EObject ref = UriHelper.resolveEObject(shapeMap.getResource().getResourceSet(), string.split("\\|"), property.getClassFeatureMap());
        if (targetType!=null && javax.xml.namespace.QName.class.isAssignableFrom(targetType)) {
            return new QName(ref.eResource().getURI().toString(), ref.eResource().getURIFragment(ref), "");
        }
        return ref;
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
