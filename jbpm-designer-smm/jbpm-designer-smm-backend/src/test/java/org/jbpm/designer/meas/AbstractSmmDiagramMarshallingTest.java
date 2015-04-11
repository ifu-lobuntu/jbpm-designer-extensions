package org.jbpm.designer.meas;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.SMMDiagramElement;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.jbpm.smm.dd.smmdi.SMMShape;
import org.junit.Before;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.Style;
import org.omg.smm.Measure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.smm.SMMPackage;
import org.omg.smm.SmmElement;

public class AbstractSmmDiagramMarshallingTest {

    protected XMLResource inputResource;
    protected ResourceSet resourceSet;
    protected SMMDiagram inputDiagram;
    protected MeasureLibrary measureLibrary;
    protected Map<SmmElement, SMMDiagramElement> elementDiagramElementMap = new HashMap<SmmElement, SMMDiagramElement>();
    private AbstractEmfDiagramProfile profile;
    private GenericEmfToJsonDiagramUnmarshaller unmarshaller;
    private GenericJsonToEmfDiagramMarshaller marshaller;

    public AbstractSmmDiagramMarshallingTest() {
        super();
    }
    private void addTrait(Measure m){
        m.setTrait(SMMFactory.eINSTANCE.createCharacteristic());
        if(m.getName()==null){
            throw new IllegalStateException();
        }
        m.getTrait().setName(m.getName());
        measureLibrary.getMeasureElements().add(m.getTrait());
    }
    @Before
    public void setup() throws Exception {
        profile = createProfile();
        profile.setUriHandler(new TestUriHandler());
        unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile, URI.createURI("file:/dummy." + profile.getSerializedModelExtension()), true);
        marshaller = new GenericJsonToEmfDiagramMarshaller(profile,URI.createURI("file:/dummy." + profile.getSerializedModelExtension()));
        resourceSet = new ResourceSetImpl();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        profile.prepareResourceSet(resourceSet);
        inputResource = (XMLResource) resourceSet.createResource(URI.createURI("file:/dummy." + profile.getSerializedModelExtension()));
        measureLibrary = SMMFactory.eINSTANCE.createMeasureLibrary();
        inputResource.getContents().add(measureLibrary);
        inputDiagram = SMMDIFactory.eINSTANCE.createSMMDiagram();
        inputDiagram.setSmmElement(measureLibrary);
        measureLibrary.getOwnedDiagram().add(inputDiagram);
        profile.loadLinkedStencilSet("../jbpm-designer-smm-client/src/main/resources/org/jbpm/designer/public/" + profile.getStencilSetPath());
        profile.initializeLocalPlugins("../jbpm-designer-smm-client/src/main/resources/org/jbpm/designer/public/profiles/meas.xml");
        elementDiagramElementMap.put(measureLibrary, inputDiagram);
    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new MeasureLibraryProfileImpl();
    }

    protected void assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        XMLResource outputResource = marshaller.getResource(json, "");
        Set<EClassifier> ignoreIdsOf = new HashSet<EClassifier>();
        ignoreIdsOf.add(SMMDIPackage.eINSTANCE.getSMMStyle());
        ignoreIdsOf.add(DIPackage.eINSTANCE.getStyle());
        ignoreIdsOf.add(DCPackage.eINSTANCE.getColor());
        ignoreIdsOf.add(DCPackage.eINSTANCE.getBounds());
        ignoreIdsOf.add(SMMPackage.eINSTANCE.getCharacteristic());
        new GenericEcoreComparator(inputResource, outputResource, ignoreIdsOf).validate();
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, options);
        String string = writer.toString();
        return string;
    }

    protected void addEdge(SmmElement modelElement, SmmElement from, SmmElement to) {
        SMMEdge edge = SMMDIFactory.eINSTANCE.createSMMEdge();
        SMMShape fromShape = (SMMShape) elementDiagramElementMap.get(from);
        edge.setSourceShape(fromShape);
        SMMShape toShape = (SMMShape) elementDiagramElementMap.get(to);
        edge.setTargetShape(toShape);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, fromShape);
        Point middle = DCFactory.eINSTANCE.createPoint();
        edge.getWaypoint().add(middle);
        middle.setX(50d);
        middle.setY(60d);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, toShape);
        inputDiagram.getOwnedSmmDiagramElement().add(edge);
        edge.setSmmElement(modelElement);
        edge.setLocalStyle(buildTestStyle());
    }

    private Style buildTestStyle() {
        Style style = SMMDIFactory.eINSTANCE.createSMMStyle();
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

    protected SMMShape addShapeFor(SmmElement parentElement, SmmElement element, int... boundsInfo) {
        if(element instanceof Measure){
            addTrait((Measure) element);
        }
        SMMDiagramElement parentDiagramElement = elementDiagramElementMap.get(parentElement);
        SMMShape shape = SMMDIFactory.eINSTANCE.createSMMShape();
        String nsURI = shape.eClass().getESuperTypes().get(0).getEPackage().getNsURI();
        parentDiagramElement.getOwnedElement().add(shape);
        shape.setSmmElement(element);
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

}