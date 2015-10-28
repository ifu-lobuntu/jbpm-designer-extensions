package org.jbpm.designer.vdpe;

import java.io.IOException;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.junit.Before;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueProposition;

public class AbstractVdpeDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    public AbstractVdpeDiagramMarshallingTest() {
        super();
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

    protected XMLResource assertOutputValid() throws Exception {
        return super.assertConversionValid(diagramResource);
    }
}