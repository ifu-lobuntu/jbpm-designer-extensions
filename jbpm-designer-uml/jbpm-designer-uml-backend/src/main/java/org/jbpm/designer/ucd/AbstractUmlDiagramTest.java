package org.jbpm.designer.ucd;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.impl.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Style;
public class AbstractUmlDiagramTest {

    protected AbstractClassDiagramProfileImpl profile = new ClassDiagramProfileImpl();{
        profile.setUriHandler(new TestUriHandler());
    }
    protected GenericEmfToJsonDiagramUnmarshaller unmarshaller;
    protected GenericJsonToEmfDiagramMarshaller marshaller; 
    protected XMLResource inputResource;
    protected ResourceSet resourceSet;
    protected UMLDiagram inputDiagram;
    protected Package jbpmPackage;
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
    protected Package cmmnTypes;

    public AbstractUmlDiagramTest() {
        super();
    }

    public void setup() throws Exception {
        resourceSet=new ResourceSetImpl();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        profile.prepareResourceSet(resourceSet);
        this.cmmnTypes=(Package)resourceSet.getResource(URI.createURI(ClassDiagramProfileImpl.CMMNTYPES_PATHMAP), false).getContents().get(0);
        unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile,URI.createURI("file:/dummy.ucd"),true);
        marshaller = new GenericJsonToEmfDiagramMarshaller(profile,URI.createURI("file:/dummy.ucd"));
        inputResource = (XMLResource) resourceSet.createResource(URI.createURI("file:/dummy.ucd"));
        inputDiagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        jbpmPackage=UMLFactory.eINSTANCE.createPackage();
        profile.loadLinkedStencilSet("../jbpm-designer-uml-client/src/main/resources/org/jbpm/designer/public/stencilsets/ucd/ucd.json");
        profile.initializeLocalPlugins("../jbpm-designer-uml-client/src/main/resources/org/jbpm/designer/public/profiles/ucd.xml");
        inputDiagram.setUmlElement(jbpmPackage);
        inputResource.getContents().add(jbpmPackage);
        inputResource.getContents().add(inputDiagram);
    }

    protected XMLResource assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        XMLResource outputResource = marshaller.getResource(json, "");
        Set<EClassifier> idsToIgnore=new HashSet<EClassifier>();
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLDiagram());
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLStyle());
        idsToIgnore.add(DCPackage.eINSTANCE.getColor());
        idsToIgnore.add(UMLPackage.eINSTANCE.getProperty());//for associations
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural());
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralInteger());
        idsToIgnore.add(EcorePackage.eINSTANCE.getEAnnotation());
        GenericEcoreComparator v = new GenericEcoreComparator(inputResource, outputResource,idsToIgnore);
        v.setDebugInfo(json, profile);
        v.validate();
        return outputResource;
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        resource.save(writer, profile.buildDefaultResourceOptions());
        String string = writer.toString();
        return string;
    }

    protected void addEdge(Element modelElement, Element from, Element to) {
        UMLEdge edge = UMLDIFactory.eINSTANCE.createUMLEdge();
        UMLShape fromShape = (UMLShape) elementDiagramElementMap.get(from);
        edge.setSourceShape(fromShape);
        UMLShape toShape = (UMLShape) elementDiagramElementMap.get(to);
        edge.setTargetShape(toShape);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, fromShape);
        Point middle = DCFactory.eINSTANCE.createPoint();
        edge.getWaypoint().add(middle);
        middle.setX(50d);
        middle.setY(60d);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, toShape);
        edge.setUmlElement(modelElement);
        edge.setLocalStyle(buildTestStyle());
        inputDiagram.getOwnedUmlDiagramElement().add(edge);
    }

    private Style buildTestStyle() {
        Style style = UMLDIFactory.eINSTANCE.createUMLStyle();
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

    protected void addShapeFor(Element element, int... boundsInfo) {
        addShapeToParent(element, this.inputDiagram, boundsInfo);
    }

    protected void addShapeToParent(Element element, DiagramElement parentShape, int... boundsInfo) {
        UMLShape shape = UMLDIFactory.eINSTANCE.createUMLShape();
        parentShape.getOwnedElement().add(shape);
        shape.setUmlElement(element);
        shape.setBounds(DCFactory.eINSTANCE.createBounds());
        Bounds bounds = shape.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10d);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10d);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300d);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300d);
        shape.setLocalStyle(buildTestStyle());
        this.elementDiagramElementMap.put(element, shape);
    }
    protected UMLCompartment addCompartmentFor(Element parentElement, EReference feature, int... boundsInfo) {
        UMLCompartment compartment = UMLDIFactory.eINSTANCE.createUMLCompartment();
        compartment.setFeatureName(feature.getName());
        this.elementDiagramElementMap.get(parentElement) .getOwnedElement().add(compartment);
        compartment.setBounds(DCFactory.eINSTANCE.createBounds());
        Bounds bounds = compartment.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10d);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10d);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300d);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300d);
        compartment.setLocalStyle(buildTestStyle());
        this.elementCompartmentMap.put(new CompartmentKey(parentElement, feature), compartment);
        return compartment;
    }
    protected void addShapeToCompartment(Element parentElement, EReference feature, Element element, int... boundsInfo) {
        UMLCompartment comp= (UMLCompartment) this.elementCompartmentMap.get(new CompartmentKey(parentElement, feature));
        addShapeToParent(element, comp, boundsInfo);
    }
}