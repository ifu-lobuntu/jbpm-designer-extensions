package org.jbpm.designer.emf.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.dd.cmmn.di.Plane;
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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.server.diagram.json.Bounds;
import org.jbpm.designer.server.diagram.json.Diagram;
import org.jbpm.designer.server.diagram.json.Point;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.server.diagram.json.StencilSet;
import org.jbpm.designer.server.diagram.json.StencilType;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.stencilset.linkage.Property;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.designer.web.profile.IDiagramProfile.IDiagramUnmarshaller;
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
        System.out.println("=================XMI IN:");
        System.out.println(xmlModel);
        try {
            Diagram json = convert(getResource(xmlModel));
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
            String s = om.writeValueAsString(json);
            System.out.println("=================JSON OUT:");
            System.out.println(s);
            return s;
        } catch (RuntimeException e) {
            throw e;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    protected Diagram convert(XMLResource resource) {
        shapeMap = new ShapeMap(resource);
        helper = profile.createEmfToJsonHelper(shapeMap);
        org.eclipse.dd.cmmn.di.Diagram emfDiagram = helper.getDiagram(0);
        Plane plane = (Plane) emfDiagram.getRootElement();
        EObject modelElement = plane.getModelElement();
        Diagram result = new Diagram(shapeMap.getId(modelElement), new StencilType(profile.getDiagramStencilId()), new StencilSet(profile.getStencilSetURL(),
                profile.getStencilSetNamespaceURL()));
        result.setBounds(new Bounds(new Point(0.0, 0.0), new Point(1400.0, 1000.0)));
        helper.linkElements(plane, result);
        LinkedStencil linkedStencil = this.profile.getLinkedStencilSet().getLinkedStencil(result.getStencilId());
        createAllShapes(result, plane);
        helper.doSwitch(linkedStencil, result, modelElement);
        setProperties(plane, modelElement, result);
        result.getProperties().put("diagramelementid", shapeMap.getId(plane));
        addLinkedShapes(plane, result);
        if (validate) {
            super.profile.getLinkedStencilSet().validateDiagram(result, shapeMap);
        }

        return result;
    }

    private void addLinkedShapes(DiagramElement parentDiagramElement, Shape parentShape) {
        for (DiagramElement de : parentDiagramElement.getOwnedElement()) {
            Shape shape = shapeMap.getShape(de);
            if (shape != null) {
                if (de instanceof Edge) {
                    Edge ce = (Edge) de;
                    if (ce.getSource() != null) {
                        shapeMap.getShape(ce.getSource()).addOutgoing(shape);
                    } else {
                        System.out.println();
                    }
                    if (ce.getTarget() != null) {
                        Shape targetShape = shapeMap.getShape(ce.getTarget());
                        shape.addOutgoing(targetShape);
                    } else {
                        System.out.println();
                    }
                } else {
                    addLinkedShapes(de, shape);
                }
                if (de.getModelElement() != null) {
                    StencilInfo stencil = helper.findStencilByElement(de.getModelElement(), de);
                    LinkedStencil linkedStencil = this.profile.getLinkedStencilSet().getLinkedStencil(stencil.getStencilId());
                    helper.doSwitch(linkedStencil, shape, de.getModelElement());
                }
            }
        }
    }

    private void createAllShapes(Shape parentShape, DiagramElement parentDiagramElement) {
        for (DiagramElement de : parentDiagramElement.getOwnedElement()) {
            EObject me = de.getModelElement();
            StencilInfo stencil = helper.findStencilByElement(me, de);
            String resourceId = me == null ? shapeMap.getId(de) : shapeMap.getId(me);
            Shape shape = new Shape(resourceId, new StencilType(stencil.getStencilId()));
            if (de instanceof org.eclipse.dd.cmmn.di.Shape) {
                org.eclipse.dd.cmmn.di.Shape cs = (org.eclipse.dd.cmmn.di.Shape) de;
                Point upperLeft = new Point(new Double(cs.getBounds().getX()), new Double(cs.getBounds().getY()));
                Point lowerRight = new Point(upperLeft.getX() + cs.getBounds().getWidth(), upperLeft.getY() + cs.getBounds().getHeight());
                shape.setBounds(new Bounds(lowerRight, upperLeft));
            } else if (de instanceof Edge) {
                Edge ce = (Edge) de;
                EList<org.eclipse.dd.cmmn.dc.Point> waypoints = ce.getWaypoint();
                if (ce.getSource() != null) {
                    org.eclipse.dd.cmmn.dc.Bounds sourceBounds = ((org.eclipse.dd.cmmn.di.Shape) ce.getSource()).getBounds();
                    shape.getDockers().add(new Point(sourceBounds.getWidth() / 2d, sourceBounds.getHeight() / 2d));
                }
                for (int i = 1; i < waypoints.size() - 1; i++) {
                    org.eclipse.dd.cmmn.dc.Point waypoint = waypoints.get(i);
                    shape.getDockers().add(new Point((double) waypoint.getX(), (double) waypoint.getY()));
                }
                if (ce.getTarget() != null) {
                    org.eclipse.dd.cmmn.dc.Bounds targetBounds = ((org.eclipse.dd.cmmn.di.Shape) ce.getTarget()).getBounds();
                    shape.getDockers().add(new Point(targetBounds.getWidth() / 2d, targetBounds.getHeight() / 2d));
                }
            }
            setProperties(de, me, shape);
            shape.getProperties().put("diagramelementid", shapeMap.getId(de));
            parentShape.getChildShapes().add(shape);
            shapeMap.linkElements(de, shape);
            helper.linkElements(de, shape);
            createAllShapes(shape, de);
        }
    }

    private void setProperties(DiagramElement diagramElement, EObject mee, Shape shape) {
        StencilInfo stencil = helper.findStencilByElement(mee, diagramElement);
        LinkedStencil sv = profile.getLinkedStencilSet().getLinkedStencil(stencil.getStencilId());
        if (sv == null) {
            throw new IllegalArgumentException("No stencil found in the stencilSet definition for '" + stencil.getStencilId() + "'");
        }
        for (Property property : sv.getProperties().values()) {
            Object val = null;
            if (property.getBinding() == null || property.getBinding().trim().length() == 1) {
                EStructuralFeature eStructuralFeature = colorAttributes.get(property.getId());
                if (eStructuralFeature == null) {
                    if (mee != null) {
                        eStructuralFeature = mee.eClass().getEStructuralFeature(property.getId());
                        if (eStructuralFeature == null) {
                            // TODO validate
                            System.out.println(mee.eClass().getName() + "." + property.getId() + " does not exist");
                        } else {
                            val = mee.eGet(eStructuralFeature);
                        }
                    }
                } else {
                    FeatureMap map = diagramElement.getAnyAttribute();
                    if (map != null) {
                        val = map.get(eStructuralFeature, true);
                    }
                }
            } else if(mee!=null){
                String[] split = property.getBinding().trim().split("\\.");
                EObject currentTarget = mee;
                for (int i = 0; i < split.length; i++) {
                    String featureName = split[i];
                    if (featureName.endsWith("]")) {
                        featureName = featureName.substring(0, featureName.indexOf("["));
                    }
                    EStructuralFeature f = currentTarget.eClass().getEStructuralFeature(featureName);
                    val = currentTarget.eGet(f);
                    if (val == null) {
                        break;
                    } else {
                        if (val instanceof List && split[i].endsWith("]")) {
                            String index = split[i];
                            int idx = Integer.valueOf(index.substring(index.indexOf('[') + 1, index.length() - 1));
                            val = ((List<?>) val).get(idx);
                        }
                        if (i < split.length - 1) {
                            currentTarget = (EObject) val;
                        }
                    }
                }
            }
            if (val != null) {
                shape.putProperty(property.getId().toLowerCase(), convertToString(val));
            }
        }
    }

    private String convertToString(Object val) {
        if (val instanceof EObject) {
            EObject eObject = (EObject) val;
            return shapeMap.getId(eObject);
        } else if (val instanceof Enumerator) {
            return ((Enumerator) val).getName();
        } else if (val instanceof BasicEList) {
            BasicEList list = (BasicEList) val;
            StringBuilder sb = new StringBuilder();
            for (Object object : list) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(convertToString(object));
            }
            return sb.toString();
        }
        return val.toString();
    }

    private XMLResource getResource(String xmlModel) throws UnsupportedEncodingException, IOException {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, profile.prepareResourceSet(resourceSet));
        setUriHandler(resourceSet);
        resourceSet.getPackageRegistry().put(DiPackage.eNS_URI, DiPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DcPackage.eNS_URI, DcPackage.eINSTANCE);
        XMLResource resource = (XMLResource) resourceSet.createResource(URI.createURI("inputStream://dummyUriWithValidSuffix.xml"));
        resource.setEncoding("UTF-8");
        Map<String, Object> options = buildDefaultResourceOptions();
        InputStream is = new ByteArrayInputStream(xmlModel.getBytes("UTF-8"));
        resource.load(is, options);
        EcoreUtil.resolveAll(resourceSet);
        if (!resource.getErrors().isEmpty()) {
            String errorMessages = "";
            for (Resource.Diagnostic error : resource.getErrors()) {
                errorMessages += error.getMessage() + "\n";
            }
            profile.fire(errorMessages, NotificationEvent.NotificationType.ERROR);
        }

        if (!resource.getWarnings().isEmpty()) {
            String warningMessages = "";
            for (Resource.Diagnostic warning : resource.getWarnings()) {
                warningMessages += warning.getMessage() + "\n";
            }
            profile.fire(warningMessages, NotificationEvent.NotificationType.WARNING);
        }

        EList<Diagnostic> warnings = resource.getWarnings();

        if (warnings != null && !warnings.isEmpty()) {
            for (Diagnostic diagnostic : warnings) {
                profile.logInfo("Warning: " + diagnostic.getMessage());
            }
        }
        return resource;
    }

    public Map<String, Object> buildDefaultResourceOptions() {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
        options.put(XMLResource.OPTION_DISABLE_NOTIFY, true);
        options.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
        options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
        return options;
    }

}