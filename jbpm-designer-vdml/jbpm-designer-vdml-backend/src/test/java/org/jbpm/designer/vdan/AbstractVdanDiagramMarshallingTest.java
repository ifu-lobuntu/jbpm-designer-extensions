package org.jbpm.designer.vdan;

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

public class AbstractVdanDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    protected XMLResource diagramResource;
    protected String diagramFile = "/jbpm-designer-vdml-backend/target/test.vdan";

    public AbstractVdanDiagramMarshallingTest() {
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
        return new VdmlActivityNetworkProfileImpl();
    }
    
    protected ValueProposition addValueProposition(Role role1, Role role2, boolean addShape) {
        ValueProposition valueProposition = VDMLFactory.eINSTANCE.createValueProposition();
        valueProposition.setName("Safd");
        role1.getProvidedProposition().add(valueProposition);
        valueProposition.setRecipient(role2);
        if(addShape){
            addShapeFor(collaboration, valueProposition);
        }
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

    protected void assertConversionValid(XMLResource drscasdf) throws IOException, Exception {
        String xmlString = buildXmlString(drscasdf);
//        System.out.println(xmlString);
        String json = unmarshaller.parseModel(xmlString, profile, "");
//        System.out.println(json);
        XMLResource outputResource = marshaller.getResource(json, "");
//        print(outputResource);
        new GenericEcoreComparator(drscasdf, outputResource).validate();
    }
}