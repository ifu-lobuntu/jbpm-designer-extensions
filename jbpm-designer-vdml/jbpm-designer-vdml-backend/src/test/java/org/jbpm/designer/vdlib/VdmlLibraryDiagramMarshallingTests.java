package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.ucd.AbstractUmlDiagramTest;
import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.junit.Before;
import org.junit.Test;
import org.omg.smm.Characteristic;
import org.omg.smm.DirectMeasure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.ValueDeliveryModel;

public class VdmlLibraryDiagramMarshallingTests extends AbstractUmlDiagramTest {
    protected XMLResource measureResource;
    protected String measureFile = "/jbpm-designer-vdml-backend/target/test.meas";
    private Characteristic characteristic;
    private DirectMeasure measure;
    private TestUriHandler tuh;
    private MeasureLibrary ml;
    private ValueDeliveryModel vdm;

    @Before
    public void setup() throws Exception {
        super.profile = new VdmlLibraryProfileImpl();
        super.unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile, URI.createPlatformResourceURI("jbpm-designer-vdml-client/target/test.vdlib", true), true);
        super.marshaller = new GenericJsonToEmfDiagramMarshaller(profile, URI.createPlatformResourceURI("jbpm-designer-vdml-client/target/test.vdlib", true));

        resourceSet = new ResourceSetImpl();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        this.tuh = new TestUriHandler();
        uriHandlers.add(tuh);
        super.profile.setUriHandler(tuh);
        profile.prepareResourceSet(resourceSet);
        this.cmmnTypes = (Package) resourceSet.getResource(URI.createURI(ClassDiagramProfileImpl.CMMNTYPES_PATHMAP), false).getContents().get(0);
        inputResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI("jbpm-designer-vdml-client/target/test.vdlib", true));
        inputDiagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        jbpmPackage = UMLFactory.eINSTANCE.createPackage();
        profile.loadLinkedStencilSet("../jbpm-designer-vdml-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdlib/vdlib.json");
        profile.initializeLocalPlugins("../jbpm-designer-vdml-client/src/main/resources/org/jbpm/designer/public/profiles/vdlib.xml");
        inputDiagram.setUmlElement(jbpmPackage);
        inputResource.getContents().add(jbpmPackage);
        inputResource.getContents().add(inputDiagram);
        inputResource.setID(jbpmPackage, EcoreUtil.generateUUID());
        URI measureUri = URI.createPlatformResourceURI(measureFile, true);
        tuh.getFile(measureUri).delete();
        measureResource = (XMLResource) super.resourceSet.createResource(measureUri);
        this.ml = SMMFactory.eINSTANCE.createMeasureLibrary();
        this.characteristic = SMMFactory.eINSTANCE.createCharacteristic();
        this.characteristic.setName("Age");
        ml.getMeasureElements().add(this.characteristic);
        this.measure = SMMFactory.eINSTANCE.createDirectMeasure();
        this.measure.setName("Age");
        ml.getMeasureElements().add(measure);
        measure.setTrait(characteristic);
        measureResource.getContents().add(ml);
        vdm = VdmlLibraryJsonToEmfHelper.createValueDeliveryModel(inputResource, jbpmPackage);
        VdmlLibraryJsonToEmfHelper.createBusinessItemLibrary(inputResource, jbpmPackage, vdm);
        inputResource.getContents().add(vdm);
        measureResource.save(tuh.createOutputStream(measureUri, profile.buildDefaultResourceOptions()),profile.buildDefaultResourceOptions());
    }

    @Test
    public void testIt() throws Exception {
        Class clss = UMLFactory.eINSTANCE.createClass();
        clss.setName("MyBusinessItemDefinition");
        inputResource.setID(clss, EcoreUtil.generateUUID());
        super.jbpmPackage.getOwnedTypes().add(clss);
        BusinessItemDefinition def = VdmlLibraryJsonToEmfHelper.createBusinessDefinition(inputResource, clss, vdm.getBusinessItemLibrary().get(0));
        def.setIsFungible(false);
        def.setIsShareable(true);
        addShapeFor(clss);
        UMLCompartment comp = addCompartmentFor(clss, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Property characteristicDef = UMLFactory.eINSTANCE.createProperty();
        characteristicDef.setName(characteristic.getName());
        characteristicDef.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss.getOwnedAttributes().add(characteristicDef);
        def.getCharacteristicDefinition().add(characteristic);
        addShapeToCompartment(clss, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), characteristicDef);
        print(inputResource);
        assertOutputValid();
    }
}
