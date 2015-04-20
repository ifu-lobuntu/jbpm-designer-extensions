package org.jbpm.designer.vdlib;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.impl.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.ucd.AbstractUmlDiagramTest;
import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.junit.Before;
import org.omg.smm.Characteristic;
import org.omg.smm.DirectMeasure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.vdml.ValueDeliveryModel;

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
                URI.createPlatformResourceURI("jbpm-designer-vdml-client/target/test.vdlib", true), true);
        this.marshaller = new GenericJsonToEmfDiagramMarshaller(profile, URI.createPlatformResourceURI("jbpm-designer-vdml-client/target/test.vdlib", true));
        resourceSet = new ResourceSetImpl();
        tuh.getFile(URI.createPlatformResourceURI(measureFile, true)).delete();
        tuh.getFile(getCollaborationUri()).delete();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(tuh);
        this.profile.setUriHandler(tuh);
        profile.prepareResourceSet(resourceSet);
        this.cmmnTypes = (Package) resourceSet.getResource(URI.createURI(ClassDiagramProfileImpl.CMMNTYPES_PATHMAP), false).getContents().get(0);
        inputResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI("jbpm-designer-vdml-client/target/test.vdlib", true));
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
        vdm = VdmlLibraryJsonToEmfHelper.findOrcreateValueDeliveryModel(jbpmPackage);
        VdmlLibraryJsonToEmfHelper.findOrCreateBusinessItemLibrary(jbpmPackage, vdm);
        VdmlLibraryJsonToEmfHelper.findOrCreateCapabilityLibrary(jbpmPackage, vdm);
        saveCollaborationResource();
        measureResource.save(tuh.createOutputStream(measureUri, profile.buildDefaultResourceOptions()), profile.buildDefaultResourceOptions());
    }

    protected URI getCollaborationUri() {
        return URI.createPlatformResourceURI(collaborationFile, true);
    }

    protected void saveCollaborationResource() throws IOException {
        collaborationResource.save(tuh.createOutputStream(getCollaborationUri(), profile.buildDefaultResourceOptions()), profile.buildDefaultResourceOptions());
    }

    public Class addCarrierClass(String value) {
        Class clss = UMLFactory.eINSTANCE.createClass();
        clss.setName(value);
        collaborationResource.setID(clss, EcoreUtil.generateUUID());
        this.jbpmPackage.getOwnedTypes().add(clss);
        return clss;
    }

}