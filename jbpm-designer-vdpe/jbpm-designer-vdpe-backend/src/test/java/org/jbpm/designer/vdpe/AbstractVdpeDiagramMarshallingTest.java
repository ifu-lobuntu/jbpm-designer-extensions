package org.jbpm.designer.vdpe;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdrc.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.junit.Before;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
public class AbstractVdpeDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {


    protected XMLResource diagramResource;
    protected String diagramFile="/jbpm-designer-vdpe-backend/target/test.vdpe";
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
        return "jbpm-designer-vdpe-client";
    }

}