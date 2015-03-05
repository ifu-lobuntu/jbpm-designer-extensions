package org.jbpm.designer.vdpe.impl;

import org.jbpm.designer.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdpe.VdmlPropositionExchangeProfileImpl;
import org.junit.Test;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.ValueProposition;
import org.pavanecce.vdml.metamodel.vdml.VdmlFactory;

public class ValuePropositionExchangeDiagramMarshallingTests extends AbstractVdmlDiagramMarshallingTest {
    @Test
    public void testIt() throws Exception{
        Role role1 = addRole("MyRole");
        Role role2 = addRole("YourRole");
        ValueProposition valueProposition = VdmlFactory.eINSTANCE.createValueProposition();
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
        Role role1 = VdmlFactory.eINSTANCE.createRole();
        role1.setName(value);
        role1.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role1);
        addShapeFor(capabilityMethod, role1);
        return role1;
    }
}
