package org.jbpm.designer.extensions.emf.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.extensions.diagram.Bounds;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Point;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.diagram.StencilSet;
import org.jbpm.designer.extensions.diagram.StencilType;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.designer.web.profile.IDiagramProfile.IDiagramUnmarshaller;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;
import org.uberfire.workbench.events.NotificationEvent;

public final class GenericEmfToJsonDiagramUnmarshaller extends AbstractEmfJsonMarshaller implements IDiagramUnmarshaller {

    private boolean validate;
    private ShapeMap shapeMap;
    private EmfToJsonHelper helper;

    public GenericEmfToJsonDiagramUnmarshaller(IEmfDiagramProfile profile) {
        super(profile);
    }

    /**
     * For tests only
     */
    public GenericEmfToJsonDiagramUnmarshaller(IEmfDiagramProfile profile, boolean validate) {
        super(profile);
        this.validate = validate;
    }

    public String parseModel(String xmlModel, IDiagramProfile profile, String preProcessingData) throws Exception {
        try {
            XMLResource resource = getResource(xmlModel);
            // super.writeResource(resource, "==================XML IN");
            Diagram json = convert(resource);
            // super.writeDiagram(json, "==================JSON OUT");
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            om.configure(SerializationConfig.Feature.INDENT_OUTPUT, false);
            String s = om.writeValueAsString(json);
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public Diagram convert(XMLResource resource) {

        shapeMap = new ShapeMap(resource);
        helper = profile.createEmfToJsonHelper(shapeMap);
        helper.preprocessResource();
        org.omg.dd.di.Diagram emfDiagram = helper.getDiagram(0);
        EObject modelElement = getModelElement(emfDiagram);
        Diagram result = new Diagram(shapeMap.getId(modelElement), new StencilType(profile.getDiagramStencilId()), new StencilSet(profile.getStencilSetURL(),
                profile.getStencilSetNamespaceURL()));
        result.setBounds(new Bounds(new Point(0.0, 0.0), new Point(1400.0, 1000.0)));
        helper.linkElements(emfDiagram, result);
        LinkedStencil linkedStencil = this.profile.getLinkedStencilSet().getLinkedStencil(result.getStencilId());
        createShapesRecursively(result, emfDiagram);
        helper.doSwitch(linkedStencil, result, modelElement);
        setProperties(emfDiagram, modelElement, result);
        result.getProperties().put("diagramelementid", shapeMap.getId(emfDiagram));
        addLinkedShapes(emfDiagram, result);
        if (validate) {
            super.profile.getLinkedStencilSet().validateDiagram(result, shapeMap);
        }

        return result;
    }

    private void addLinkedShapes(DiagramElement parentDiagramElement, Shape parentShape) {
        if (parentDiagramElement instanceof BoundariedShape) {
            for (org.omg.dd.di.Shape shape : ((BoundariedShape) parentDiagramElement).getBoundaryShapes()) {
                Shape out = shapeMap.getShape(shape);
                parentShape.getOutgoing().add(new ShapeReference(out.getResourceId()));
                Point upperLeft = out.getUpperLeft();
                Point lowerRight = out.getLowerRight();
                if (upperLeft != null && upperLeft.getX() != null && upperLeft.getY() != null && lowerRight != null && lowerRight.getY() != null) {
                    double absoluteX = (upperLeft.getX() + lowerRight.getX()) / 2;
                    double absoluteY = (upperLeft.getY() + lowerRight.getY()) / 2;
                    out.getDockers().add(
                            new Point(absoluteX - parentShape.getBounds().getUpperLeft().getX(), absoluteY - parentShape.getBounds().getUpperLeft().getY()));
                }
            }
        }
        for (DiagramElement de : parentDiagramElement.getOwnedElement()) {
            Shape shape = shapeMap.getShape(de);
            if (shape != null) {
                if (de instanceof Edge) {
                    Edge ce = (Edge) de;
                    if (ce.getSource() != null) {
                        shapeMap.getShape(ce.getSource()).addOutgoing(shape);
                    }
                    if (ce.getTarget() != null) {
                        Shape targetShape = shapeMap.getShape(ce.getTarget());
                        shape.addOutgoing(targetShape);
                    }
                } else {
                    addLinkedShapes(de, shape);
                }
                if (de.getModelElement().size() > 0) {
                    StencilInfo stencil = helper.findStencilByElement(getModelElement(de), de);
                    LinkedStencil linkedStencil = this.profile.getLinkedStencilSet().getLinkedStencil(stencil.getStencilId());
                    helper.doSwitch(linkedStencil, shape, getModelElement(de));
                }
            }
        }
    }

    private void createShapesRecursively(Shape parentShape, DiagramElement parentDiagramElement) {
        for (DiagramElement de : parentDiagramElement.getOwnedElement()) {
            EObject me = getModelElement(de);
            if (shouldGenerateJson(de, me)) {
                StencilInfo stencil = helper.findStencilByElement(me, de);
                String resourceId = me == null ? shapeMap.getId(de) : shapeMap.getId(me);
                Shape shape = new Shape(resourceId, new StencilType(stencil.getStencilId()));
                if (de instanceof org.omg.dd.di.Shape) {
                    org.omg.dd.di.Shape cs = (org.omg.dd.di.Shape) de;
                    Point upperLeft = new Point(new Double(cs.getBounds().getX()), new Double(cs.getBounds().getY()));
                    Point lowerRight = new Point(upperLeft.getX() + cs.getBounds().getWidth(), upperLeft.getY() + cs.getBounds().getHeight());
                    shape.setBounds(new Bounds(lowerRight, upperLeft));
                } else if (de instanceof Edge) {
                    Edge ce = (Edge) de;
                    EList<org.omg.dd.dc.Point> waypoints = ce.getWaypoint();
                    if (ce.getSource() != null) {
                        org.omg.dd.dc.Bounds sourceBounds = ((org.omg.dd.di.Shape) ce.getSource()).getBounds();
                        shape.getDockers().add(new Point(sourceBounds.getWidth() / 2d, sourceBounds.getHeight() / 2d));
                    }
                    for (int i = 1; i < waypoints.size() - 1; i++) {
                        org.omg.dd.dc.Point waypoint = waypoints.get(i);
                        shape.getDockers().add(new Point((double) waypoint.getX(), (double) waypoint.getY()));
                    }
                    if (ce.getTarget() != null) {
                        org.omg.dd.dc.Bounds targetBounds = ((org.omg.dd.di.Shape) ce.getTarget()).getBounds();
                        shape.getDockers().add(new Point(targetBounds.getWidth() / 2d, targetBounds.getHeight() / 2d));
                    }
                }
                setProperties(de, me, shape);
                shape.getProperties().put("diagramelementid", shapeMap.getId(de));
                parentShape.getChildShapes().add(shape);
                shapeMap.linkElements(de, shape);
                helper.linkElements(de, shape);
                createShapesRecursively(shape, de);
            }
        }
    }

    protected boolean shouldGenerateJson(DiagramElement de, EObject me) {
        boolean generateJson = true;
        if (!shouldHaveShape(me)) {
            generateJson = false;
        } else if (de instanceof Edge) {
            Edge edge = (Edge) de;
            if (!(shouldHaveShape(getModelElement(edge.getSource())) || shouldHaveShape(getModelElement(edge.getTarget())))) {
                generateJson = false;
            }
        }
        return generateJson;
    }

    private void setProperties(DiagramElement diagramElement, EObject mee, Shape shape) {
        StencilInfo stencil = helper.findStencilByElement(mee, diagramElement);
        LinkedStencil sv = profile.getLinkedStencilSet().getLinkedStencil(stencil.getStencilId());
        if (sv == null) {
            throw new IllegalArgumentException("No stencil found in the stencilSet definition for '" + stencil.getStencilId() + "'");
        }
        for (LinkedProperty property : sv.getProperties().values()) {
            Object val = null;
            if (property.getBinding() != null && property.getBinding().trim().length() > 0) {
                val = resolveBinding(mee, val, property.getBinding());
            } else if (property.getViewBinding() != null && property.getViewBinding().trim().length() > 0) {
                val = resolveBinding(diagramElement, val, property.getViewBinding());
            } else if (mee != null) {
                if (mee != null) {
                    EStructuralFeature eStructuralFeature = mee.eClass().getEStructuralFeature(property.getId());
                    if (eStructuralFeature == null) {
                        // TODO validate
                        System.out.println(mee.eClass().getName() + "." + property.getId() + " does not exist");
                    } else {
                        val = mee.eGet(eStructuralFeature);
                    }
                }
            }
            if (val != null) {
                shape.putProperty(property.getId().toLowerCase(), convertToString(property, val));
            }
        }
    }

    protected Object resolveBinding(EObject mee, Object val, String binding) {
        String[] split = binding.trim().split("\\.");
        Object currentTarget = mee;
        for (int i = 0; i < split.length; i++) {
            String featureName = split[i];
            EStructuralFeature f = getStructuralFeature(currentTarget, featureName);
            if (f == null) {
                throw new IllegalStateException("The type " + currentTarget.getClass().getSimpleName() + " does not have feature '" + featureName + "'");
            }
            val = getValue(currentTarget, f);
            if (val == null) {
                break;
            } else {
                if (val instanceof List && split[i].endsWith("]")) {
                    String index = split[i];
                    int idx = Integer.valueOf(index.substring(index.indexOf('[') + 1, index.length() - 1));
                    List<?> listVal = (List<?>) val;
                    if (listVal.size() <= idx) {
                        return null;
                    }
                    val = listVal.get(idx);
                }
                currentTarget = val;
            }
        }
        return val;
    }

    private String convertToString(LinkedProperty property, Object val) {
        if (val instanceof Color) {
            Color c = (Color) val;
            String red = formatColorQuantity(c.getRed());
            String green = formatColorQuantity(c.getGreen());
            String blue = formatColorQuantity(c.getBlue());
            return "#" + red + green + blue;
        } else if (val instanceof EObject) {
            EObject eObject = (EObject) val;
            if (property.getReference() != null) {
                return convertToEObjectReference(property, eObject);
            } else {
                return shapeMap.getId(eObject);
            }
        } else if (val instanceof QName) {
            if (property.getReference() != null) {
                Resource res = shapeMap.getResource().getResourceSet().getResource(URI.createURI(((QName) val).getNamespaceURI()), true);
                if (res != null) {
                    EObject eObject = res.getEObject(((QName) val).getLocalPart());
                    String platformString = res.getURI().toPlatformString(true);
                    if (platformString == null) {
                        platformString = res.getURI().toString();
                    }
                    Object name = eObject.eGet(eObject.eClass().getEStructuralFeature(property.getReference().getNameFeature()));
                    return name + "|" + platformString;

                }
            }
            return val.toString();
        } else if (val instanceof Enumerator) {
            return ((Enumerator) val).getName();
        } else if (val instanceof BasicEList) {
            @SuppressWarnings("rawtypes")
            BasicEList list = (BasicEList) val;
            StringBuilder sb = new StringBuilder();
            for (Object object : list) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(convertToString(property, object));
            }
            return sb.toString();
        } else {
            String s = this.helper.convertToString(property, val);
            if (s != null) {
                return s;
            }
        }
        return val.toString();
    }

    private String convertToEObjectReference(LinkedProperty property, EObject eObject) {
        Resource eResource = eObject.eResource();
        String platformString = eResource.getURI().toPlatformString(true);
        if (platformString == null) {
            platformString = eResource.getURI().toString();
        }
        Object name = eObject.eGet(eObject.eClass().getEStructuralFeature(property.getReference().getNameFeature()));
        return name + "|" + platformString;
    }

    private String formatColorQuantity(Integer blue2) {
        String blue = Integer.toHexString(blue2).toUpperCase();
        if (blue.length() == 1) {
            blue = "0" + blue;
        }
        return blue;
    }

    private XMLResource getResource(String xmlModel) throws UnsupportedEncodingException, IOException {
        ResourceSet resourceSet = new ResourceSetImpl();
        profile.prepareResourceSet(resourceSet);
        resourceSet.getLoadOptions().putAll(profile.buildDefaultResourceOptions());

        XMLResource resource = (XMLResource) resourceSet.createResource(URI.createURI("file:/dummy." + profile.getSerializedModelExtension()));
        resource.getDefaultSaveOptions().putAll(profile.buildDefaultResourceOptions());
        resource.getDefaultLoadOptions().putAll(profile.buildDefaultResourceOptions());
        resource.setEncoding("UTF-8");
        Map<String, Object> options = profile.buildDefaultResourceOptions();
        InputStream is = new ByteArrayInputStream(xmlModel.getBytes("UTF-8"));
        resource.load(is, options);
        EcoreUtil.resolveAll(resourceSet);
        EList<Resource> resources = resourceSet.getResources();
        for (Resource resource2 : resources) {
            if (!resource2.getErrors().isEmpty()) {
                String errorMessages = "";
                for (Resource.Diagnostic error : resource2.getErrors()) {
                    ((Throwable) error).printStackTrace();
                    errorMessages += error.getMessage() + "\n";
                }
                profile.fire(errorMessages, NotificationEvent.NotificationType.ERROR);
            }
            if (!resource2.getWarnings().isEmpty()) {
                String warningMessages = "";
                for (Resource.Diagnostic warning : resource2.getWarnings()) {
                    warningMessages += warning.getMessage() + "\n";
                }
                profile.fire(warningMessages, NotificationEvent.NotificationType.WARNING);
            }
            EList<Diagnostic> warnings = resource2.getWarnings();
            if (warnings != null && !warnings.isEmpty()) {
                for (Diagnostic diagnostic : warnings) {
                    profile.logInfo("Warning: " + diagnostic.getMessage());
                }
            }
        }
        return resource;
    }

}