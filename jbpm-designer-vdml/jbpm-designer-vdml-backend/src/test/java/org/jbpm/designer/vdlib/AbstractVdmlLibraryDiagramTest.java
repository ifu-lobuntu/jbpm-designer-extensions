package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.impl.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.ucd.AbstractUmlDiagramTest;
import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.junit.Before;
import org.omg.dd.dc.DCPackage;
import org.omg.smm.Characteristic;
import org.omg.smm.DirectMeasure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class AbstractVdmlLibraryDiagramTest extends AbstractUmlDiagramTest {

    protected XMLResource measureResource;
    protected String measureFile = "/jbpm-designer-vdml-backend/target/test.meas";
    protected XMLResource collaborationResource;
    protected String collaborationFile = "/jbpm-designer-vdml-backend/target/test.vdcol";
    protected Characteristic characteristic;
    protected DirectMeasure measure;
    protected TestUriHandler tuh;
    protected MeasureLibrary measureLibrary;
    protected ValueDeliveryModel vdm;
    

    public AbstractVdmlLibraryDiagramTest() {
        super();
    }

    @Before
    public void setup() throws Exception {
        this.tuh = new TestUriHandler();
        this.profile = new VdmlLibraryProfileImpl();
        this.unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile,
                URI.createPlatformResourceURI("jbpm-designer-vdml-backend/target/test.vdlib", true), true);
        this.marshaller = new GenericJsonToEmfDiagramMarshaller(profile, URI.createPlatformResourceURI("jbpm-designer-vdml-backend/target/test.vdlib", true));
        resourceSet = new ResourceSetImpl();
        tuh.getFile(URI.createPlatformResourceURI(measureFile, true)).delete();
        tuh.getFile(getCollaborationUri()).delete();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(tuh);
        this.profile.setUriHandler(tuh);
        profile.prepareResourceSet(resourceSet);
        this.cmmnTypes = (Package) resourceSet.getResource(URI.createURI(ClassDiagramProfileImpl.CMMNTYPES_PATHMAP), false).getContents().get(0);
        inputResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI("jbpm-designer-vdml-backend/target/test.vdlib", true));
        inputDiagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        jbpmPackage = UMLFactory.eINSTANCE.createPackage();
        profile.loadLinkedStencilSet("../jbpm-designer-vdml-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdlib/vdlib.json");
        profile.initializeLocalPlugins("../jbpm-designer-vdml-client/src/main/resources/org/jbpm/designer/public/profiles/vdlib.xml");
        inputDiagram.setUmlElement(jbpmPackage);
        collaborationResource= (XMLResource) resourceSet.createResource(getCollaborationUri());
        collaborationResource.getContents().add(jbpmPackage);
        inputResource.getContents().add(inputDiagram);
        collaborationResource.setID(jbpmPackage, EcoreUtil.generateUUID());
        URI measureUri = URI.createPlatformResourceURI(measureFile, true);
        tuh.getFile(measureUri).delete();
        measureResource = (XMLResource) this.resourceSet.createResource(measureUri);
        this.measureLibrary = SMMFactory.eINSTANCE.createMeasureLibrary();
        this.characteristic = SMMFactory.eINSTANCE.createCharacteristic();
        this.characteristic.setName("Age");
        measureLibrary.getMeasureElements().add(this.characteristic);
        this.measure = SMMFactory.eINSTANCE.createDirectMeasure();
        this.measure.setName("Age");
        measureLibrary.getMeasureElements().add(measure);
        measure.setTrait(characteristic);
        measureResource.getContents().add(measureLibrary);
        vdm = VdmlUmlHelper.findOrcreateValueDeliveryModel(jbpmPackage);
        CapabilityMethod cm = VDMLFactory.eINSTANCE.createCapabilityMethod();
        cm.setName("MyCapability");
        vdm.getCollaboration().add(cm);
        VdmlUmlHelper.findOrCreateBusinessItemLibrary(jbpmPackage, vdm);
        VdmlUmlHelper.findOrCreateCapabilityLibrary(jbpmPackage, vdm);
        VdmlUmlHelper.findOrCreateStoreLibrary(jbpmPackage, vdm);
        saveCollaborationResource();
        measureResource.save(tuh.createOutputStream(measureUri, profile.buildDefaultResourceOptions()), profile.buildDefaultResourceOptions());
    }

    protected URI getCollaborationUri() {
        return URI.createPlatformResourceURI(collaborationFile, true);
    }

    protected void saveCollaborationResource() throws IOException {
        collaborationResource.save(tuh.createOutputStream(getCollaborationUri(), profile.buildDefaultResourceOptions()), profile.buildDefaultResourceOptions());
    }
    protected XMLResource assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        Set<EClassifier> idsToIgnore =new HashSet<EClassifier>();
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLDiagram());
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLStyle());
        idsToIgnore.add(DCPackage.eINSTANCE.getColor());
        idsToIgnore.add(UMLPackage.eINSTANCE.getProperty());//for associations
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural());
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralInteger());
        idsToIgnore.add(EcorePackage.eINSTANCE.getEAnnotation());
        saveEmptyCollaborationResource();
        XMLResource outputResource = marshaller.getResource(json, "");
        XMLResource outputCollaborationResource = (XMLResource) outputResource.getResourceSet().getResource(getCollaborationUri(), true);
        outputCollaborationResource.save(System.out,null);
        GenericEcoreComparator v = new GenericEcoreComparator(this.collaborationResource, outputCollaborationResource,idsToIgnore);
        v.setDebugInfo("",profile);
        v.validate();
        return outputResource;
    }

    private void saveEmptyCollaborationResource() throws IOException {
        ResourceSet rst =new ResourceSetImpl();
        profile.prepareResourceSet(rst);
        XMLResource tmpCollaborationResource= (XMLResource) rst.createResource(getCollaborationUri());
        Package jbpmPackage = UMLFactory.eINSTANCE.createPackage();
        tmpCollaborationResource= (XMLResource) resourceSet.createResource(getCollaborationUri());
        tmpCollaborationResource.getContents().add(jbpmPackage);
        tmpCollaborationResource.setID(jbpmPackage, this.collaborationResource.getID(this.jbpmPackage));
        ValueDeliveryModel vdm = VdmlUmlHelper.findOrcreateValueDeliveryModel(jbpmPackage);
        CapabilityMethod cm = VDMLFactory.eINSTANCE.createCapabilityMethod();
        cm.setName("MyCapability");
        cm.setId(VdmlHelper.getCollaboration(this.collaborationResource).getId());
        vdm.getCollaboration().add(cm);
        VdmlUmlHelper.findOrCreateBusinessItemLibrary(jbpmPackage, vdm);
        VdmlUmlHelper.findOrCreateCapabilityLibrary(jbpmPackage, vdm);
        VdmlUmlHelper.findOrCreateStoreLibrary(jbpmPackage, vdm);
        tmpCollaborationResource.save(new FileOutputStream(tuh.getFile(getCollaborationUri())), profile.buildDefaultResourceOptions());
    }

    public Class addCarrierClass(String value) {
        Class clss = UMLFactory.eINSTANCE.createClass();
        clss.setName(value);
        collaborationResource.setID(clss, EcoreUtil.generateUUID());
        this.jbpmPackage.getOwnedTypes().add(clss);
        return clss;
    }

}