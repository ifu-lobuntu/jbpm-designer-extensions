package org.jbpm.designer.vdml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.impl.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.impl.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.vdlib.VdmlLibraryStencil;
import org.jbpm.designer.vdrc.VdmlRoleCollaborationProfileImpl;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.*;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Style;
import org.omg.smm.Characteristic;
import org.omg.smm.DirectMeasure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.vdml.*;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;

public abstract class AbstractVdmlDiagramMarshallingTest {
    protected Map<String, Object> emptyOptions;
    protected String collaborationFile;
    protected XMLResource collaborationResource;

    private String measureLibraryFileName;
    protected XMLResource measureResource;
    protected MeasureLibrary measureLibrary;
    protected Characteristic characteristic1;
    protected DirectMeasure measure1;
    protected Characteristic characteristic2;
    protected DirectMeasure measure2;

    protected BusinessItemDefinition businessItemDefinition1;
    protected BusinessItemDefinition businessItemDefinition2;

    protected ResourceSet resourceSet;
    protected VDMLDiagram inputDiagram;
    protected ValueDeliveryModel valueDeliveryModel;
    protected Map<VdmlElement, VDMLDiagramElement> elementDiagramElementMap = new HashMap<VdmlElement, VDMLDiagramElement>();
    protected Collaboration collaboration;
    protected AbstractEmfDiagramProfile profile;
    protected GenericEmfToJsonDiagramUnmarshaller unmarshaller;
    protected GenericJsonToEmfDiagramMarshaller marshaller;
    protected TestUriHandler tuh = new TestUriHandler();
    protected XMLResource diagramResource;
    protected Package pkg;

    public AbstractVdmlDiagramMarshallingTest() {
        super();
    }

    protected void saveCollaborationResource() throws IOException {
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(collaborationFile, true), emptyOptions);
        collaborationResource.save(os, emptyOptions);
    }

    protected void saveMeasureLibraryResource() throws IOException {
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(measureLibraryFileName, true), emptyOptions);
        measureResource.save(os, emptyOptions);
    }

    protected final String getDiagramFileName() {
        if (profile == null) {
            profile = createProfile();
        }
        return "/jbpm-designer-vdml-backend/target/test." + profile.getSerializedModelExtension();
    }

    protected abstract AbstractEmfDiagramProfile createProfile();

    public void setup() throws Exception {
        UMLDIPackage.eINSTANCE.getNsURI();// init UML
        this.tuh = new TestUriHandler();
        profile = createProfile();
        emptyOptions = profile.buildDefaultResourceOptions();
        this.collaborationFile = "/jbpm-designer-vdml-backend/target/test.vdcol";
        tuh.getFile(URI.createPlatformResourceURI(getDiagramFileName(), true)).delete();
        tuh.getFile(URI.createPlatformResourceURI(collaborationFile, true)).delete();
        profile.setUriHandler(tuh);
        unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile, URI.createPlatformResourceURI(getDiagramFileName(), true), true);
        marshaller = new GenericJsonToEmfDiagramMarshaller(profile, URI.createPlatformResourceURI(getDiagramFileName(), true));
        resourceSet = new ResourceSetImpl();

        // To make sure it is usable from other profiles
        new VdmlRoleCollaborationProfileImpl().prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdlib", new UMLDIResourceFactoryImpl());
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        profile.prepareResourceSet(resourceSet);
        collaborationResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI(collaborationFile, true));
        valueDeliveryModel = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        valueDeliveryModel.setId(EcoreUtil.generateUUID());
        inputDiagram = createDiagram();
        collaborationResource.getContents().add(valueDeliveryModel);
        profile.loadLinkedStencilSet("../" + "jbpm-designer-vdml-client" + "/src/main/resources/org/jbpm/designer/public/" + profile.getStencilSetPath());
        profile.initializeLocalPlugins("../" + "jbpm-designer-vdml-client" + "/src/main/resources/org/jbpm/designer/public/profiles/"
                + profile.getProfileDefinitionFileName());
        this.collaboration = createCollaboration();
        inputDiagram.setVdmlElement(collaboration);
        collaboration.setName("MyCollaboration");
        valueDeliveryModel.getCollaboration().add(collaboration);
        elementDiagramElementMap.put(collaboration, inputDiagram);
        collaborationResource.getContents().add(pkg = UMLFactory.eINSTANCE.createPackage());
        pkg.setName("MyPackage");
        collaborationResource.setID(pkg, EcoreUtil.generateUUID());

        VdmlUmlHelper.findOrCreateBusinessItemLibrary(pkg, valueDeliveryModel);
        VdmlUmlHelper.findOrCreateCapabilityLibrary(pkg, valueDeliveryModel);
        VdmlUmlHelper.findOrCreateStoreLibrary(pkg, valueDeliveryModel);
        buildTestMeasureLibrary();
        addBusinessItemDefs(this.valueDeliveryModel);
        saveCollaborationResource();
    }

    protected void buildTestMeasureLibrary() throws IOException {
        this.measureLibraryFileName = "/" + "jbpm-designer-vdml-client" + "/target/test.meas";
        tuh.getFile(URI.createPlatformResourceURI(measureLibraryFileName, true)).delete();
        measureLibrary = SMMFactory.eINSTANCE.createMeasureLibrary();
        measureLibrary.setName("DinkyDonky");
        measureResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI(measureLibraryFileName, true));
        measureResource.getContents().add(measureLibrary);
        this.characteristic1 = SMMFactory.eINSTANCE.createCharacteristic();
        this.characteristic1.setName("Age");
        measureLibrary.getMeasureElements().add(this.characteristic1);
        this.characteristic2 = SMMFactory.eINSTANCE.createCharacteristic();
        this.characteristic2.setName("Gender");
        measureLibrary.getMeasureElements().add(this.characteristic2);
        this.measure1 = SMMFactory.eINSTANCE.createDirectMeasure();
        this.measure1.setName("Age");
        measureLibrary.getMeasureElements().add(measure1);
        measure1.setTrait(characteristic1);
        this.measure2 = SMMFactory.eINSTANCE.createDirectMeasure();
        this.measure2.setName("Gender");
        measureLibrary.getMeasureElements().add(measure2);
        measure2.setTrait(characteristic2);
        measureResource.save(tuh.createOutputStream(measureResource.getURI(), profile.buildDefaultResourceOptions()), profile.buildDefaultResourceOptions());
    }

    private void addBusinessItemDefs(ValueDeliveryModel vdm) {
        BusinessItemLibrary bil = vdm.getBusinessItemLibrary().get(0);
        this.businessItemDefinition1 = (BusinessItemDefinition) VdmlUmlHelper.findOrCreateBusinessItemDefinitionClass("Invoice", vdm)
                .getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
        this.businessItemDefinition2 = (BusinessItemDefinition) VdmlUmlHelper.findOrCreateBusinessItemDefinitionClass("Payment", vdm)
                .getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
    }

    protected void addMeasuredCharacteristic(Characteristic characteristic1, EList<MeasuredCharacteristic> measuredCharacteristic) {
        MeasuredCharacteristic mc = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
        mc.setCharacteristicDefinition(characteristic1);
        mc.setName(characteristic1.getName());
        measuredCharacteristic.add(mc);
    }


    protected Collaboration createCollaboration() {
        return VDMLFactory.eINSTANCE.createCapabilityMethod();
    }

    protected void assertDiagramElementPresent(VdmlElement ve, XMLResource r) {
        TreeIterator<EObject> allContents = r.getAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof VDMLDiagramElement) {
                VDMLDiagramElement de = (VDMLDiagramElement) eObject;
                if (de.getVdmlElement() != null && de.getVdmlElement().getId().equals(ve.getId())) {
                    return;
                }
            }
        }
        throw new AssertionError("Could not find diagramElement for " + ve.getName());
    }

    protected Activity addActivity(Role role1, boolean addShape) {
        Activity act = VDMLFactory.eINSTANCE.createActivity();
        act.setName(role1.getName() + "Activity");
        act.setPerformingRole(role1);
        collaboration.getActivity().add(act);
        if (addShape) {
            addShapeFor(role1, role1);
        }
        return act;
    }

    protected Role addRole(String value, boolean addShape) {
        Role role1 = addRole(value, this.collaboration);
        if (addShape) {
            addShapeFor(this.collaboration, role1);
        }
        return role1;
    }

    protected Role addRole(String value, Collaboration c) {
        Role role1 = VdmlHelper.createRole(c);
        role1.setName(value);
        role1.setDescription("My Role's Description");
        c.getCollaborationRole().add(role1);
        return role1;
    }

    protected final VDMLDiagram createDiagram() {
        diagramResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI(getDiagramFileName(), true));
        VDMLDiagram inputDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        diagramResource.getContents().add(inputDiagram);
        inputDiagram.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        return inputDiagram;
    }

    protected String buildXmlString(XMLResource resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, profile.buildDefaultResourceOptions());
        String string = writer.toString();
        return string;
    }

    protected DeliverableFlow addDeliverableFlow(Activity act1, Activity act2, String name) {
        DeliverableFlow df = VDMLFactory.eINSTANCE.createDeliverableFlow();
        OutputPort op = VDMLFactory.eINSTANCE.createOutputPort();
        df.setProvider(op);
        act1.getContainedPort().add(op);
        InputPort ip = VDMLFactory.eINSTANCE.createInputPort();
        df.setRecipient(ip);
        act2.getContainedPort().add(ip);
        collaboration.getFlow().add(df);
        df.setName(name);
        return df;
    }

    protected VDMLEdge addEdge(VdmlElement modelElement, VdmlElement from, VdmlElement to) {
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
        return edge;
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
        VDMLShape shape = createShape(element, boundsInfo);
        VDMLDiagramElement parentDiagramElement = elementDiagramElementMap.get(parentElement);
        parentDiagramElement.getOwnedElement().add(shape);
        return shape;
    }

    protected VDMLShape createShape(VdmlElement element, int... boundsInfo) {
        VDMLShape shape = VDMLDIFactory.eINSTANCE.createVDMLShape();
        String nsURI = shape.eClass().getESuperTypes().get(0).getEPackage().getNsURI();
        shape.setVdmlElement(element);
        shape.setBounds(DCFactory.eINSTANCE.createBounds());
        Bounds bounds = shape.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10d);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10d);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300d);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300d);
        shape.setLocalStyle(buildTestStyle(false));
        if (element != null) {
            this.elementDiagramElementMap.put(element, shape);
        }
        return shape;
    }

    protected void addOutputPort(VdmlElement parent, PortContainer pc, String outputPortName) {
        OutputPort activityOutputPort = addOutputPort(pc, outputPortName);
        DiagramElement boundariedShape = this.elementDiagramElementMap.get(pc);
        VDMLShape portShape = addShapeFor(parent, activityOutputPort);
        if (boundariedShape instanceof BoundariedShape) {
            ((BoundariedShape) boundariedShape).getBoundaryShapes().add(portShape);
        }
        if(parent instanceof Role){
            activityOutputPort.setHandler((Role) parent);
        }
    }

    protected OutputPort addOutputPort(PortContainer pc, String outputPortName) {
        OutputPort activityOutputPort = VDMLFactory.eINSTANCE.createOutputPort();
        activityOutputPort.setName(outputPortName);
        pc.getContainedPort().add(activityOutputPort);
        return activityOutputPort;
    }

    protected void addInputPort(VdmlElement parent, PortContainer pc, String inputPortName) {
        InputPort activityInputPort = addInputPort(pc, inputPortName);
        DiagramElement boundariedShape = this.elementDiagramElementMap.get(pc);
        VDMLShape portShape = addShapeFor(parent, activityInputPort);
        if (boundariedShape instanceof BoundariedShape) {
            ((BoundariedShape) boundariedShape).getBoundaryShapes().add(portShape);
        }
        if(parent instanceof Role){
            activityInputPort.setHandler((Role) parent);
        }
    }

    protected InputPort addInputPort(PortContainer pc, String inputPortName) {
        InputPort activityInputPort = VDMLFactory.eINSTANCE.createInputPort();
        activityInputPort.setName(inputPortName);
        pc.getContainedPort().add(activityInputPort);
        return activityInputPort;
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
    public static interface CollaborationInitializer{
        void initialize(ValueDeliveryModel vdm);
    }
    protected XMLResource assertOutputValid(CollaborationInitializer initializer) throws IOException, Exception {
        String xmlString = buildXmlString(diagramResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        Set<EClassifier> idsToIgnore =new HashSet<EClassifier>();
        idsToIgnore.add(VDMLPackage.eINSTANCE.getMeasuredCharacteristic());
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLDiagram());
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLStyle());
        idsToIgnore.add(DCPackage.eINSTANCE.getColor());
        idsToIgnore.add(UMLPackage.eINSTANCE.getProperty());//for associations
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural());
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralInteger());
        idsToIgnore.add(EcorePackage.eINSTANCE.getEAnnotation());
        idsToIgnore.add(VDMLPackage.eINSTANCE.getBusinessItem());
        idsToIgnore.add(VDMLPackage.eINSTANCE.getDelegationContext());
        idsToIgnore.add(VDMLPackage.eINSTANCE.getInputDelegation());
        idsToIgnore.add(VDMLPackage.eINSTANCE.getOutputDelegation());
        idsToIgnore.add(VDMLPackage.eINSTANCE.getAssignment());
        saveEmptyCollaborationResource(initializer);
        XMLResource outputResource = marshaller.getResource(json, "");
        XMLResource outputCollaborationResource = (XMLResource) outputResource.getResourceSet().getResource(this.collaborationResource.getURI(), true);
        GenericEcoreComparator v = new GenericEcoreComparator(this.collaborationResource, outputCollaborationResource,idsToIgnore);
        v.setDebugInfo(json,profile);
        v.validate();
        return outputResource;
    }

    private void saveEmptyCollaborationResource(CollaborationInitializer initializer) throws IOException {
        ResourceSet rst =new ResourceSetImpl();
        profile.prepareResourceSet(rst);
        XMLResource tmpCollaborationResource= (XMLResource) rst.createResource(this.collaborationResource.getURI());
        tmpCollaborationResource= (XMLResource) resourceSet.createResource(this.collaborationResource.getURI());
        Package jbpmPackage = UMLFactory.eINSTANCE.createPackage();
        jbpmPackage.setName(pkg.getName());
        tmpCollaborationResource.getContents().add(jbpmPackage);
        tmpCollaborationResource.setID(jbpmPackage, this.collaborationResource.getID(this.pkg));
        ValueDeliveryModel vdm = VdmlUmlHelper.findOrcreateValueDeliveryModel(jbpmPackage);
        vdm.setId(this.valueDeliveryModel.getId());
        CapabilityMethod cm = VDMLFactory.eINSTANCE.createCapabilityMethod();
        cm.setName(collaboration.getName());
        cm.setId(VdmlHelper.getCollaboration(this.collaborationResource).getId());
        vdm.getCollaboration().add(cm);
        VdmlUmlHelper.findOrCreateBusinessItemLibrary(jbpmPackage, vdm);
        VdmlUmlHelper.findOrCreateCapabilityLibrary(jbpmPackage, vdm);
        VdmlUmlHelper.findOrCreateStoreLibrary(jbpmPackage, vdm);
        org.eclipse.uml2.uml.Class invoice = VdmlUmlHelper.findOrCreateBusinessItemDefinitionClass("Invoice", vdm);
        tmpCollaborationResource.setID(invoice, this.collaborationResource.getID(VdmlUmlHelper.findOrCreateBusinessItemDefinitionClass("Invoice",this.valueDeliveryModel)));
        BusinessItemDefinition bid1 = (BusinessItemDefinition) invoice
                .getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
        bid1.setId(this.businessItemDefinition1.getId());
        Class payment = VdmlUmlHelper.findOrCreateBusinessItemDefinitionClass("Payment", vdm);
        tmpCollaborationResource.setID(payment, this.collaborationResource.getID(VdmlUmlHelper.findOrCreateBusinessItemDefinitionClass("Payment",this.valueDeliveryModel)));
        BusinessItemDefinition bid2 = (BusinessItemDefinition) payment
                .getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
        bid2.setId(this.businessItemDefinition2.getId());
        if(initializer!=null){
            initializer.initialize(vdm);
        }
        tmpCollaborationResource.save(new FileOutputStream(tuh.getFile(this.collaborationResource.getURI())), profile.buildDefaultResourceOptions());
    }

    protected XMLResource assertConversionValid(XMLResource drscasdf) throws IOException, Exception {
        String xmlString = buildXmlString(drscasdf);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        XMLResource outputResource = marshaller.getResource(json, "");
//         print(outputResource);
        new GenericEcoreComparator(drscasdf, outputResource).validate();
        return outputResource;
    }

    protected final void saveDiagramResource() throws IOException {
        TestUriHandler tuh = new TestUriHandler();
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(getDiagramFileName(), true), emptyOptions);
        diagramResource.save(os, emptyOptions);
    }

    protected MeasuredCharacteristic buildMeasuredCharacteristic(Characteristic characteristic) {
        MeasuredCharacteristic measuredCharacteristic = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
        measuredCharacteristic.setCharacteristicDefinition(characteristic);
        measuredCharacteristic.setName(characteristic.getName());
        return measuredCharacteristic;
    }
}