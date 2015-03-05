package org.jbpm.designer.ucd.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dd.cmmn.dc.Bounds;
import org.eclipse.dd.cmmn.dc.DcFactory;
import org.eclipse.dd.cmmn.dc.Point;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Node;
import org.eclipse.dd.cmmn.di.Shape;
import org.eclipse.dd.color.color.ColorPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.di.umldi.DocumentRoot;
import org.eclipse.uml2.di.umldi.UMLCompartment;
import org.eclipse.uml2.di.umldi.UMLDIFactory;
import org.eclipse.uml2.di.umldi.UMLDIPackage;
import org.eclipse.uml2.di.umldi.UMLDiagram;
import org.eclipse.uml2.di.umldi.UMLEdge;
import org.eclipse.uml2.di.umldi.UMLPlane;
import org.eclipse.uml2.di.umldi.UMLShape;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.emf.util.GenericEcoreComparator;
import org.jbpm.designer.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.emf.util.TestUriHandler;
import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.junit.Before;
public class AbstractClassDiagramMarshallingTest {

    protected ClassDiagramProfileImpl profile = new ClassDiagramProfileImpl();{
        profile.setUriHandler(new TestUriHandler());
    }
    protected GenericEmfToJsonDiagramUnmarshaller unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile,true);
    protected GenericJsonToEmfDiagramMarshaller marshaller = new GenericJsonToEmfDiagramMarshaller(profile);
    protected XMLResource inputResource;
    protected ResourceSet resourceSet;
    protected UMLDiagram inputDiagram;
    protected Package jbpmPackage;
    protected DocumentRoot documentRoot;
    protected Map<CompartmentKey, DiagramElement> elementCompartmentMap = new HashMap<CompartmentKey, DiagramElement>();
    class CompartmentKey{

        Element element;
        EReference feature;

        public CompartmentKey(Element element, EReference feature) {
            super();
            this.element = element;
            this.feature = feature;
        }
        @Override
        public int hashCode() {
            return element.hashCode() + feature.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            CompartmentKey other = (CompartmentKey) obj;
            return this.element==other.element && this.feature==other.feature;
        }
    }
    protected Map<Element, DiagramElement> elementDiagramElementMap = new HashMap<Element, DiagramElement>();
    protected UMLPlane plane;
    protected Package cmmnTypes;

    public AbstractClassDiagramMarshallingTest() {
        super();
    }

    @Before
    public void setup() throws Exception {
        resourceSet=new ResourceSetImpl();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        profile.prepareResourceSet(resourceSet);
        this.cmmnTypes=(Package)resourceSet.getResource(URI.createURI("libraries/cmmntypes.uml"), false).getContents().get(0);

        inputResource = (XMLResource) resourceSet.createResource(URI.createURI("file:/dummy.ucd"));
        inputDiagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        documentRoot=UMLDIFactory.eINSTANCE.createDocumentRoot();
        inputResource.getContents().add(documentRoot);
        jbpmPackage=UMLFactory.eINSTANCE.createPackage();
        documentRoot.getPackages().add(jbpmPackage);
        documentRoot.getDiagram().add(inputDiagram);
        UMLPlane casePlane = UMLDIFactory.eINSTANCE.createUMLPlane();
        inputDiagram.setUmlPlane(casePlane);
        profile.loadLinkedStencilSet("../jbpm-designer-uml-client/src/main/resources/org/jbpm/designer/public/stencilsets/classdiagram/classdiagram.json");
        this.plane = createPlane();
        plane.setUmlElement(jbpmPackage);
    }

    private UMLPlane createPlane() {
        UMLPlane plane = inputDiagram.getUmlPlane();
        plane.setUmlElement(jbpmPackage);
        return plane;
    }

    protected void assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        // System.out.println(xmlString);
        // System.out.println(json);
        XMLResource outputResource = marshaller.getResource(json, "");
        // System.out.println(buildXmlString((Cmmn1ResourceImpl)
        // outputResource));
        Set<EClass> idsToIgnore=new HashSet<EClass>();
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getDocumentRoot());
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLDiagram());
        idsToIgnore.add(UMLPackage.eINSTANCE.getProperty());//for associations
        new GenericEcoreComparator(inputResource, outputResource,idsToIgnore).validate();
//        inputResource=(XMLResource) outputResource;
//        xmlString = buildXmlString(inputResource);
//        json = unmarshaller.parseModel(xmlString, profile, "");
//        outputResource = marshaller.getResource(json, "");
//        new GenericEcoreComparator(inputResource, outputResource).validate();
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, options);
        String string = writer.toString();
        return string;
    }

    protected void addEdge(Element modelElement, Element from, Element to) {
        UMLEdge edge = UMLDIFactory.eINSTANCE.createUMLEdge();
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
        edge.setUmlElement(modelElement);
        edge.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_Color(), "#0000000");
        edge.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_BorderColor(), "#000000");
        edge.getAnyAttribute().set(ColorPackage.eINSTANCE.getDocumentRoot_FontSize(), 12);
    }


    protected void addShapeFor(Element element, int... boundsInfo) {
        Node parentShape = this.plane;
        addShapeToParent(element, parentShape, boundsInfo);
    }

    protected void addShapeToParent(Element element, Node parentShape, int... boundsInfo) {
        UMLShape shape = UMLDIFactory.eINSTANCE.createUMLShape();
        parentShape.getOwnedElement().add(shape);
        shape.setUmlElement(element);
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
    protected UMLCompartment addCompartmentFor(Element parentElement, EReference feature, int... boundsInfo) {
        UMLCompartment compartment = UMLDIFactory.eINSTANCE.createUMLCompartment();
        compartment.setFeatureName(feature.getName());
        this.elementDiagramElementMap.get(parentElement) .getOwnedElement().add(compartment);
        compartment.setBounds(DcFactory.eINSTANCE.createBounds());
        Bounds bounds = compartment.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300);
        this.elementCompartmentMap.put(new CompartmentKey(parentElement, feature), compartment);
        return compartment;
    }
    protected void addShapeToCompartment(Element parentElement, EReference feature, Element element, int... boundsInfo) {
        UMLCompartment comp= (UMLCompartment) this.elementCompartmentMap.get(new CompartmentKey(parentElement, feature));
        addShapeToParent(element, comp, boundsInfo);
    }

}