package org.jbpm.designer.vdpe;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;

public class ValuePropositionExchangeDiagramMarshallingTests extends AbstractVdpeDiagramMarshallingTest {
    @Test
    public void testBasicDiagram() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValuePropositionComponent valuePropositionComponent = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        valuePropositionComponent.setName("Component1");
        valueProposition.getComponent().add(valuePropositionComponent);
        addShapeFor(valueProposition, valuePropositionComponent);
        addEdge(null, role1, valueProposition);
        addEdge(null, valueProposition, role2);
        saveCollaborationResource();
        assertOutputValid();
    }

    @Test
    public void testDynamicDiagramGeneration() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        Role role3 = addRole("AnotherRole", false);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValuePropositionComponent valuePropositionComponent = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        valuePropositionComponent.setName("Component1");
        valueProposition.getComponent().add(valuePropositionComponent);
        addShapeFor(valueProposition, valuePropositionComponent);
        addEdge(null, role1, valueProposition);
        addEdge(null, valueProposition, role2);
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        assertNotNull(json.findChildShapeById(role3.getId()));
    }

    @Test
    public void testRoleDeletion() throws Exception {
        // Test that we can delete the role, its activities and associated
        // flows.
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        Role role3 = addRole("AnotherRole", false);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValueProposition valueProposition2 = addValueProposition(role2, role1);
        ValueProposition valueProposition3 = addValueProposition(role3, role1);
        Activity act1 = addActivity(role1, false);
        Activity act2 = addActivity(role2, false);
        saveCollaborationResource();
        collaborationResource.save(System.out, profile.buildDefaultResourceOptions());
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(role2.getId()));
        XMLResource outputResource = marshaller.convert(json);
        ValueDeliveryModel vdm = (ValueDeliveryModel) outputResource.getContents().get(0);
        XMLResource vdrc = (XMLResource) vdm.getDiagram().get(0).getVdmlElement().eResource();
        print(vdrc);
        assertNotNull(vdrc.getEObject(role1.getId()));
        assertNotNull(vdrc.getEObject(role3.getId()));
        assertNotNull(vdrc.getEObject(act1.getId()));
        assertNotNull(vdrc.getEObject(valueProposition3.getId()));
        assertNotNull(vdrc.getEObject(valueProposition.getId()));
        assertNull(vdrc.getEObject(role2.getId()));
        assertNull(vdrc.getEObject(act2.getId()));
        assertNull(vdrc.getEObject(valueProposition2.getId()));
    }
    @Test
    public void testValuePropositionElementDeletion() throws Exception {
        // Test that we can delete the role, its activities and associated
        // flows.
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        Role role3 = addRole("AnotherRole", false);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValueProposition valueProposition2 = addValueProposition(role2, role1);
        ValueProposition valueProposition3 = addValueProposition(role3, role1);
        Activity act1 = addActivity(role1, false);
        saveCollaborationResource();
        collaborationResource.save(System.out, profile.buildDefaultResourceOptions());
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(valueProposition2.getId()));
        XMLResource outputResource = marshaller.convert(json);
        ValueDeliveryModel vdm = (ValueDeliveryModel) outputResource.getContents().get(0);
        XMLResource vdrc = (XMLResource) vdm.getDiagram().get(0).getVdmlElement().eResource();
        print(vdrc);
        assertNotNull(vdrc.getEObject(role1.getId()));
        assertNotNull(vdrc.getEObject(role3.getId()));
        assertNotNull(vdrc.getEObject(act1.getId()));
        assertNotNull(vdrc.getEObject(valueProposition3.getId()));
        assertNotNull(vdrc.getEObject(valueProposition.getId()));
        assertNull(vdrc.getEObject(valueProposition2.getId()));
    }

}
