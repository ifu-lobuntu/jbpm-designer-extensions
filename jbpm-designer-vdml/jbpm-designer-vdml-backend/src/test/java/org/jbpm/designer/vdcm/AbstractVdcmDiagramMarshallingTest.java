package org.jbpm.designer.vdcm;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.junit.Before;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Pool;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;

public class AbstractVdcmDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    protected XMLResource diagramResource;
    protected String diagramFile = "/jbpm-designer-vdml-backend/target/test.vdcm";
    protected XMLResource capabilityMethodResource;
    protected CapabilityMethod capabilityMethod;
    protected String capbilityMethodFile = "/jbpm-designer-vdml-backend/target/cpm.vdcol";

    public AbstractVdcmDiagramMarshallingTest() {
        super();
    }

    @Override
    protected String getDiagramFileName() {
        return diagramFile;
    }

    @Before
    public void setup() throws Exception {
        tuh.getFile(URI.createPlatformResourceURI(capbilityMethodFile, true)).delete();
        tuh.getFile(URI.createPlatformResourceURI(getDiagramFileName(), true)).delete();
        super.setup();
        capabilityMethodResource=(XMLResource) super.resourceSet.createResource(URI.createPlatformResourceURI(capbilityMethodFile, true));
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.getCollaboration().add(capabilityMethod=VDMLFactory.eINSTANCE.createCapabilityMethod());
        capabilityMethod.setName("TheExternalCapabilityMethod");
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(capbilityMethodFile, true), emptyOptions);
        capabilityMethodResource.getContents().add(vdm);
        capabilityMethodResource.save(os, emptyOptions);
    }
    protected Collaboration createCollaboration() {
        return VDMLFactory.eINSTANCE.createOrgUnit();
    }
    protected Store addStore(String value, boolean addShape) {
        Store store = VDMLFactory.eINSTANCE.createStore();
        store.setName(value);
        store.setDescription(value + " Description");
        ((OrgUnit)collaboration).getOwnedStore().add(store);
        if (addShape) {
            addShapeFor(collaboration, store);
        }
        return store;
    }
    protected Pool addPool(String value, boolean addShape) {
        Pool pool = VDMLFactory.eINSTANCE.createPool();
        pool.setName(value);
        pool.setDescription(value + " Description");
        ((OrgUnit)collaboration).getOwnedStore().add(pool);
        if (addShape) {
            addShapeFor(collaboration, pool);
        }
        return pool;
    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlCapabilityManagementProfileImpl();
    }
    protected void saveCapabilityMethodResource() throws IOException {
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(capbilityMethodFile, true), emptyOptions);
        capabilityMethodResource.save(os, emptyOptions);
    }
    protected void saveDiagramResource() throws IOException {
        OutputStream os = tuh.createOutputStream(URI.createPlatformResourceURI(getDiagramFileName(), true), emptyOptions);
        diagramResource.save(os, emptyOptions);
    }

    protected VDMLDiagram createDiagram() {
        diagramResource = (XMLResource) resourceSet.createResource(URI.createPlatformResourceURI(diagramFile, true));
        VDMLDiagram inputDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        ValueDeliveryModel valueDeliveryModel = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        diagramResource.getContents().add(valueDeliveryModel);
        valueDeliveryModel.getDiagram().add(inputDiagram);
        inputDiagram.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        return inputDiagram;
    }


    protected XMLResource assertOutputValid() throws IOException, Exception {
        return assertConversionValid(diagramResource);
    }

    protected XMLResource assertConversionValid(XMLResource drscasdf) throws IOException, Exception {
        String xmlString = buildXmlString(drscasdf);
        System.out.println(xmlString);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        System.out.println(json);
        XMLResource outputResource = marshaller.getResource(json, "");
        print(outputResource);
        new GenericEcoreComparator(drscasdf.getContents().get(0), outputResource.getContents().get(0)).validate();
        return outputResource;
    }}