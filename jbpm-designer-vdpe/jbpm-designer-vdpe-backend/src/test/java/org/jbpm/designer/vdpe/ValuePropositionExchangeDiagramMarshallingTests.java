package org.jbpm.designer.vdpe;

import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdpe.VdmlPropositionExchangeProfileImpl;
import org.junit.Test;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueProposition;

public class ValuePropositionExchangeDiagramMarshallingTests extends AbstractVdmlDiagramMarshallingTest {
    @Test
    public void testIt() throws Exception{
        Role role1 = addRole("MyRole");
        Role role2 = addRole("YourRole");
        ValueProposition valueProposition = VDMLFactory.eINSTANCE.createValueProposition();
        valueProposition.setName("Safd");
        role1.getProvidedProposition().add(valueProposition);
        valueProposition.setRecipient(role2);
        addShapeFor(capabilityMethod, valueProposition);
        addEdge(null, role1,valueProposition);
        addEdge(null, valueProposition,role2);
        super.assertOutputValid();
    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlPropositionExchangeProfileImpl();
    }

    private Role addRole(String value) {
        Role role1 = VDMLFactory.eINSTANCE.createRole();
        role1.setName(value);
        role1.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role1);
        addShapeFor(capabilityMethod, role1);
        return role1;
    }
}
