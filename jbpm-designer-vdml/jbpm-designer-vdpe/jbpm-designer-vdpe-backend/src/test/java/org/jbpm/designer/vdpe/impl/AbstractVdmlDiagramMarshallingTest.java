package org.jbpm.designer.vdpe.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.dd.cmmn.dc.Bounds;
import org.eclipse.dd.cmmn.dc.DcFactory;
import org.eclipse.dd.cmmn.dc.Point;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Shape;
import org.eclipse.dd.color.color.ColorPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.emf.util.GenericEcoreComparator;
import org.jbpm.designer.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.emf.util.TestUriHandler;
import org.junit.Before;
import org.pavanecce.vdml.metamodel.vdml.CapabilityMethod;
import org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlFactory;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLShape;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiFactory;

public abstract class AbstractVdmlDiagramMarshallingTest {

    protected XMLResource inputResource;
    protected ResourceSet resourceSet;
    protected VDMLDiagram inputDiagram;
    protected ValueDeliveryModel valueDeliveryModel;
    protected Map<VdmlElement, DiagramElement> elementDiagramElementMap = new HashMap<VdmlElement, DiagramElement>();
    public CapabilityMethod capabilityMethod;
    private VDMLPlane plane;
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
        inputResource = (XMLResource) resourceSet.createResource(URI.createURI("file:/dummy."+profile.getSerializedModelExtension()));
        valueDeliveryModel = VdmlFactory.eINSTANCE.createValueDeliveryModel();
        inputDiagram = VdmlDiFactory.eINSTANCE.createVDMLDiagram();
        inputResource.getContents().add(valueDeliveryModel);
        valueDeliveryModel.getDiagram().add(inputDiagram);
        plane = VdmlDiFactory.eINSTANCE.createVDMLPlane();
        inputDiagram.setVDMLPlane(plane);
        profile.loadLinkedStencilSet("../jbpm-designer-client/src/main/resources/org/jbpm/designer/public/"+profile.getStencilSetPath());
        plane.setVDMLElement(valueDeliveryModel);
        this.capabilityMethod = VdmlFactory.eINSTANCE.createCapabilityMethod();
        plane.setVDMLElement(capabilityMethod);
        capabilityMethod.setName("MyCapability");
        valueDeliveryModel.getCollaboration().add(capabilityMethod);
        elementDiagramElementMap.put(capabilityMethod, plane);
    }

    protected abstract AbstractEmfDiagramProfile createProfile();

    protected void assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        // System.out.println(xmlString);
        // System.out.println(json);
        XMLResource outputResource = marshaller.getResource(json, "");
        // System.out.println(buildXmlString((Cmmn1ResourceImpl)
        // outputResource));
        new GenericEcoreComparator(inputResource, outputResource).validate();
        // inputResource=(XMLResource) outputResource;
        // xmlString = buildXmlString(inputResource);
        // json = unmarshaller.parseModel(xmlString, profile, "");
        // outputResource = marshaller.getResource(json, "");
        // new GenericEcoreComparator(inputResource, outputResource).validate();
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, options);
        String string = writer.toString();
        return string;
    }

    protected void addEdge(VdmlElement modelElement, VdmlElement from, VdmlElement to) {
        VDMLEdge edge = VdmlDiFactory.eINSTANCE.createVDMLEdge();
        Shape fromShape = (Shape) elementDiagramElementMap.get(from);
        edge.setSourceElement(fromShape);
        Shape toShape = (Shape) elementDiagramElementMap.get(to);
        edge.setTargetElement(toShape);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, fromShape);
        Point middle = DcFactory.eINSTANCE.createPoint();
        edge.getWaypoint().add(middle);
        middle.setX(50);
        middle.setY(60);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, toShape);
        plane.getPlaneElement().add(edge);
        edge.setVDMLElement(modelElement);
        edge.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_Color(), "#0000000");
        edge.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_BorderColor(), "#000000");
        edge.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_FontSize(), 12);
    }

    protected void addShapeFor(VdmlElement parentElement, VdmlElement element, int... boundsInfo) {
        DiagramElement parentDiagramElement = elementDiagramElementMap.get(parentElement);
        VDMLShape shape = VdmlDiFactory.eINSTANCE.createVDMLShape();
        String nsURI = shape.eClass().getESuperTypes().get(0).getEPackage().getNsURI();
        parentDiagramElement.getOwnedElement().add(shape);
        shape.setVDMLElement(element);
        shape.setBounds(DcFactory.eINSTANCE.createBounds());
        Bounds bounds = shape.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300);
        shape.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_BackgroundColor(), "#FFFFFFF");
        shape.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_Color(), "#0000000");
        shape.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_BorderColor(), "#000000");
        shape.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_FontSize(), 12);
        this.elementDiagramElementMap.put(element, shape);
    }

}