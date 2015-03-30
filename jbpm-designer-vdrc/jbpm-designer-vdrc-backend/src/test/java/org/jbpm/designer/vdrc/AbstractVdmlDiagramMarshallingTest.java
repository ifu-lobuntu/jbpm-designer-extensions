package org.jbpm.designer.vdrc;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.vdrc.VdmlRoleCollaborationProfileImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.junit.Before;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Style;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.PortContainer;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class AbstractVdmlDiagramMarshallingTest {

    protected XMLResource inputResource;
    protected ResourceSet resourceSet;
    protected VDMLDiagram inputDiagram;
    protected ValueDeliveryModel valueDeliveryModel;
    protected Map<VdmlElement, VDMLDiagramElement> elementDiagramElementMap = new HashMap<VdmlElement, VDMLDiagramElement>();
    public CapabilityMethod capabilityMethod;
    private AbstractEmfDiagramProfile profile;
    private GenericEmfToJsonDiagramUnmarshaller unmarshaller;
    private GenericJsonToEmfDiagramMarshaller marshaller;

    public AbstractVdmlDiagramMarshallingTest() {
        super();
    }

    @Before
    public void setup() throws Exception {
        profile = createProfile();
        profile.setUriHandler(new TestUriHandler());
        unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile, true);
        marshaller = new GenericJsonToEmfDiagramMarshaller(profile);
        resourceSet = new ResourceSetImpl();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        profile.prepareResourceSet(resourceSet);
        inputResource = (XMLResource) resourceSet.createResource(URI.createURI("file:/dummy2." + profile.getSerializedModelExtension()));
        valueDeliveryModel = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        inputDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        inputResource.getContents().add(valueDeliveryModel);
        valueDeliveryModel.getDiagram().add(inputDiagram);
        profile.loadLinkedStencilSet("../jbpm-designer-vdrc-client/src/main/resources/org/jbpm/designer/public/" + profile.getStencilSetPath());
        profile.initializeLocalPlugins("../jbpm-designer-vdrc-client/src/main/resources/org/jbpm/designer/public/profiles/vdrc.xml");
        this.capabilityMethod = VDMLFactory.eINSTANCE.createCapabilityMethod();
        inputDiagram.setVdmlElement(capabilityMethod);
        capabilityMethod.setName("MyCapability");
        valueDeliveryModel.getCollaboration().add(capabilityMethod);
        elementDiagramElementMap.put(capabilityMethod, inputDiagram);
    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlRoleCollaborationProfileImpl();
    }

    protected void assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        XMLResource outputResource = marshaller.getResource(json, "");
        new GenericEcoreComparator(inputResource, outputResource).validate();
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, options);
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
        edge.setLocalStyle(buildTestStyle());
    }

    private Style buildTestStyle() {
        Style style = VDMLDIFactory.eINSTANCE.createVDMLStyle();
        style.setFillColor(buildTestColor());
        style.setStrokeColor(buildTestColor());
        style.setFontColor(buildTestColor());
        style.setFontSize(23d);
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
        shape.setLocalStyle(buildTestStyle());
        this.elementDiagramElementMap.put(element, shape);
        return shape;
    }

    protected void addOutputPort(VdmlElement parent, PortContainer pc, String outputPortName) {
        OutputPort activityOutputPort = VDMLFactory.eINSTANCE.createOutputPort();
        activityOutputPort.setName(outputPortName);
        pc.getContainedPort().add(activityOutputPort);
        DiagramElement boundariedShape = this.elementDiagramElementMap.get(pc);
        VDMLShape portShape = addShapeFor(parent, activityOutputPort);
        if (boundariedShape instanceof BoundariedShape) {
            ((BoundariedShape) boundariedShape).getBoundaryShapes().add(portShape);
        }
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

}