package org.jbpm.designer.vdcm;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.vdrc.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.junit.Before;
import org.omg.vdml.Collaboration;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Pool;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;

public class AbstractVdcmDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    protected XMLResource diagramResource;
    protected String diagramFile = "/jbpm-designer-vdcm-backend/target/test.vdcm";

    public AbstractVdcmDiagramMarshallingTest() {
        super();
    }

    @Override
    protected String getDiagramFileName() {
        return diagramFile;
    }

    @Before
    public void setup() throws Exception {
        super.setup();
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
    protected void saveDiagramResource() throws IOException {
        TestUriHandler tuh = new TestUriHandler();
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

    @Override
    protected String getClientProjectName() {
        return "jbpm-designer-vdcm-client";
    }

    protected void assertOutputValid() throws IOException, Exception {
        assertConversionValid(diagramResource);
    }

    protected void assertConversionValid(XMLResource drscasdf) throws IOException, Exception {
        String xmlString = buildXmlString(drscasdf);
        System.out.println(xmlString);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        System.out.println(json);
        XMLResource outputResource = marshaller.getResource(json, "");
        print(outputResource);
        new GenericEcoreComparator(drscasdf, outputResource).validate();
    }
}