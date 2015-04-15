package org.jbpm.designer.vdpe;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.junit.Before;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueProposition;

public class AbstractVdpeDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    protected XMLResource diagramResource;
    protected String diagramFile = "/jbpm-designer-vdml-backend/target/test.vdpe";

    public AbstractVdpeDiagramMarshallingTest() {
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

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlPropositionExchangeProfileImpl();
    }

    protected ValueProposition addValueProposition(Role role1, Role role2) {
        ValueProposition valueProposition = VDMLFactory.eINSTANCE.createValueProposition();
        valueProposition.setName("Safd");
        role1.getProvidedProposition().add(valueProposition);
        valueProposition.setRecipient(role2);
        addShapeFor(collaboration, valueProposition);
        return valueProposition;
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

    protected void assertOutputValid() throws IOException, Exception {
        assertConversionValid(diagramResource);
    }

}