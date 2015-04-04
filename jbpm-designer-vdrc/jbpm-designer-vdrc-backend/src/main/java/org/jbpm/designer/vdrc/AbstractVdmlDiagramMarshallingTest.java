package org.jbpm.designer.vdrc;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Style;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.PortContainer;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public abstract class AbstractVdmlDiagramMarshallingTest {
    protected Map<String, Object> emptyOptions ;
    String roleCollaborationFile;;
    protected XMLResource collaborationResource;
    protected XMLResource measureResource;
    protected MeasureLibrary measureLibrary;
    protected ResourceSet resourceSet;
    protected VDMLDiagram inputDiagram;
    protected ValueDeliveryModel valueDeliveryModel;
    protected Map<VdmlElement, VDMLDiagramElement> elementDiagramElementMap = new HashMap<VdmlElement, VDMLDiagramElement>();
    public CapabilityMethod capabilityMethod;
    protected AbstractEmfDiagramProfile profile;
    protected GenericEmfToJsonDiagramUnmarshaller unmarshaller;
    protected GenericJsonToEmfDiagramMarshaller marshaller;
    private String measureLibraryFileName;

    public AbstractVdmlDiagramMarshallingTest() {
        super();
    }

    protected void saveCollaborationResource() throws IOException {
        TestUriHandler tuh = new TestUriHandler();
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(roleCollaborationFile, true), emptyOptions);
        collaborationResource.save(os, emptyOptions);
    }
    protected void saveMeasureLibraryResource() throws IOException {
        TestUriHandler tuh = new TestUriHandler();
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(measureLibraryFileName, true), emptyOptions);
        measureResource.save(os, emptyOptions);
    }


    protected abstract String getDiagramFileName();

    protected abstract String getClientProjectName();

    protected abstract AbstractEmfDiagramProfile createProfile();
    
    public void setup() throws Exception {
        profile = createProfile();
        emptyOptions=profile.buildDefaultResourceOptions();
        this.roleCollaborationFile = "/" + getClientProjectName() + "/target/test.vdrc";
        this.measureLibraryFileName= "/" + getClientProjectName() + "/target/test.meas";
        profile.setUriHandler(new TestUriHandler());
        unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile, true);
        marshaller = new GenericJsonToEmfDiagramMarshaller(profile, URI.createPlatformResourceURI(getDiagramFileName(), true));
        resourceSet = new ResourceSetImpl();
        
        // To make sure it is usable from other profiles
        new VdmlRoleCollaborationProfileImpl().prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        profile.prepareResourceSet(resourceSet);
        collaborationResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI(roleCollaborationFile, true));
        valueDeliveryModel = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        inputDiagram = createDiagram();
        collaborationResource.getContents().add(valueDeliveryModel);
        profile.loadLinkedStencilSet("../" + getClientProjectName() + "/src/main/resources/org/jbpm/designer/public/" + profile.getStencilSetPath());
        profile.initializeLocalPlugins("../" + getClientProjectName() + "/src/main/resources/org/jbpm/designer/public/profiles/"
                + profile.getProfileDefinitionFileName());
        this.capabilityMethod = VDMLFactory.eINSTANCE.createCapabilityMethod();
        inputDiagram.setVdmlElement(capabilityMethod);
        capabilityMethod.setName("MyCapability");
        valueDeliveryModel.getCollaboration().add(capabilityMethod);
        elementDiagramElementMap.put(capabilityMethod, inputDiagram);
        measureLibrary=SMMFactory.eINSTANCE.createMeasureLibrary();
        measureLibrary.setName("DinkyDonky");
        measureResource=(XMLResource) resourceSet.createResource(URI.createPlatformResourceURI(measureLibraryFileName,true));
        measureResource.getContents().add(measureLibrary);
    }

    protected void assertDiagramElementPresent(VdmlElement ve, XMLResource r) {
        TreeIterator<EObject> allContents = r.getAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof VDMLDiagramElement && ((VDMLDiagramElement) eObject).getVdmlElement().getId().equals(ve.getId())) {
                return;
            }
        }
        throw new AssertionError("Could not find diagramElement for " + ve.getName());
    }

    protected Activity addActivity(Role role1, boolean addShape) {
        Activity act = VDMLFactory.eINSTANCE.createActivity();
        act.setName(role1.getName() + "Activity");
        act.setPerformingRole(role1);
        capabilityMethod.getActivity().add(act);
        if (addShape) {
            addShapeFor(role1, role1);
        }
        return act;
    }

    protected Role addRole(String value, boolean addShape) {
        Role role1 = VDMLFactory.eINSTANCE.createRole();
        role1.setName(value);
        role1.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role1);
        if (addShape) {
            addShapeFor(capabilityMethod, role1);
        }
        return role1;
    }

    protected VDMLDiagram createDiagram() {
        inputDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        valueDeliveryModel.getDiagram().add(inputDiagram);
        return inputDiagram;
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, profile.buildDefaultResourceOptions());
        String string = writer.toString();
        return string;
    }

    protected void addEdge(VdmlElement modelElement, VdmlElement from, VdmlElement to) {
        VDMLEdge edge = VDMLDIFactory.eINSTANCE.createVDMLEdge();
        VDMLShape fromShape = (VDMLShape) elementDiagramElementMap.get(from);
        edge.setSourceShape(fromShape);
        VDMLShape toShape = (VDMLShape) elementDiagramElementMap.get(to);
        edge.setTargetShape(toShape);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, fromShape);
        Point middle = DCFactory.eINSTANCE.createPoint();
        edge.getWaypoint().add(middle);
        middle.setX(50d);
        middle.setY(60d);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, toShape);
        inputDiagram.getOwnedVdmlDiagramElement().add(edge);
        edge.setVdmlElement(modelElement);
        edge.setLocalStyle(buildTestStyle(modelElement == null));
    }

    private Style buildTestStyle(boolean isSimple) {
        Style style = VDMLDIFactory.eINSTANCE.createVDMLStyle();
        if (!isSimple) {
            style.setFillColor(buildTestColor());
            style.setFontColor(buildTestColor());
            style.setFontSize(23d);
        }
        style.setStrokeColor(buildTestColor());

        return style;
    }

    private Color buildTestColor() {
        Color fillColor = DCFactory.eINSTANCE.createColor();
        fillColor.setRed(77);
        fillColor.setGreen(66);
        fillColor.setBlue(55);
        return fillColor;
    }

    protected VDMLShape addShapeFor(VdmlElement parentElement, VdmlElement element, int... boundsInfo) {
        VDMLDiagramElement parentDiagramElement = elementDiagramElementMap.get(parentElement);
        VDMLShape shape = VDMLDIFactory.eINSTANCE.createVDMLShape();
        String nsURI = shape.eClass().getESuperTypes().get(0).getEPackage().getNsURI();
        parentDiagramElement.getOwnedElement().add(shape);
        shape.setVdmlElement(element);
        shape.setBounds(DCFactory.eINSTANCE.createBounds());
        Bounds bounds = shape.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10d);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10d);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300d);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300d);
        shape.setLocalStyle(buildTestStyle(false));
        this.elementDiagramElementMap.put(element, shape);
        return shape;
    }
    protected void addOutputPort(VdmlElement parent, PortContainer pc, String outputPortName) {
        OutputPort activityOutputPort = addOutputPort(pc, outputPortName);
        DiagramElement boundariedShape = this.elementDiagramElementMap.get(pc);
        VDMLShape portShape = addShapeFor(parent, activityOutputPort);
        if (boundariedShape instanceof BoundariedShape) {
            ((BoundariedShape) boundariedShape).getBoundaryShapes().add(portShape);
        }
    }

    protected OutputPort addOutputPort(PortContainer pc, String outputPortName) {
        OutputPort activityOutputPort = VDMLFactory.eINSTANCE.createOutputPort();
        activityOutputPort.setName(outputPortName);
        pc.getContainedPort().add(activityOutputPort);
        return activityOutputPort;
    }

    protected void addInputPort(VdmlElement parent, PortContainer pc, String inputPortName) {
        InputPort activityInputPort = VDMLFactory.eINSTANCE.createInputPort();
        activityInputPort.setName(inputPortName);
        pc.getContainedPort().add(activityInputPort);
        DiagramElement boundariedShape = this.elementDiagramElementMap.get(pc);
        VDMLShape portShape = addShapeFor(parent, activityInputPort);
        if (boundariedShape instanceof BoundariedShape) {
            ((BoundariedShape) boundariedShape).getBoundaryShapes().add(portShape);
        }
    }

    protected void print(Diagram json) throws Exception {
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        String s = om.writeValueAsString(json);
        System.out.println(s);
    }

    protected void print(XMLResource resource) throws Exception {
        resource.save(System.out, profile.buildDefaultResourceOptions());
    }
}