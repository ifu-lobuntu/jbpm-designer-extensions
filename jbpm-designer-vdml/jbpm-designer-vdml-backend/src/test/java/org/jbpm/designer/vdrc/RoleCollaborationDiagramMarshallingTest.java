package org.jbpm.designer.vdrc;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Point;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.StencilType;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.designer.vdml.VdmlHelper;
import org.junit.Before;
import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.Assignment;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;

public class RoleCollaborationDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    @Before
    public void deleteModel() throws Exception {
        super.setup();
        TestUriHandler tuh = new TestUriHandler();
        tuh.getFile(URI.createPlatformResourceURI(collaborationFile, true)).delete();
    }

    @Test
    public void testDynamicDiagramConstruction() throws Exception {
        // Test that the diagram dynamicall generates the diagram based on the
        // model
        Role role1 = addRole("MyRole", false);
        Role role2 = addRole("YourRole", false);
        Activity act1 = addActivity(role1, false);
        Activity act2 = addActivity(role2, false);
        DeliverableFlow df = addDeliverableFlow(act1, act2, "FromMeToYou");
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        assertEquals("MyRoleActivity", json.findChildShapeById(df.getId()).getProperty("providingActivityName"));
        assertEquals("YourRoleActivity", json.findChildShapeById(df.getId()).getProperty("receivingActivityName"));
        assertEquals("MyRoleActivity", json.findChildShapeById(role1.getId()).getProperty("performedActivities"));
        assertEquals("YourRoleActivity", json.findChildShapeById(role2.getId()).getProperty("performedActivities"));
        XMLResource outputResource = marshaller.convert(json);
        Collaboration coll = VdmlHelper.getCollaboration(outputResource);

        assertEquals("MyRole", ((Role) coll.eResource().getEObject(role1.getId())).getName());
        assertDiagramElementPresent(role1, outputResource);
        assertEquals("YourRole", ((Role) coll.eResource().getEObject(role2.getId())).getName());
        assertDiagramElementPresent(role2, outputResource);
        assertEquals("MyRoleActivity", ((Activity) coll.eResource().getEObject(act1.getId())).getName());
        assertEquals("YourRoleActivity", ((Activity) coll.eResource().getEObject(act2.getId())).getName());
        assertEquals("FromMeToYou", ((DeliverableFlow) coll.eResource().getEObject(df.getId())).getName());
        assertDiagramElementPresent(df, outputResource);
    }

    public void testExternalFlowDeletion() throws Exception {
        // Test that if a DeliverableFlow was deleted by the
        // ActivityNetworkDiagram, we remove it from the diagram
        // Implement this logic in ActivityNetworkDiagrams, as the resource
        // won'tsave with dangling references
    }

    @Test
    public void testFlowCreation() throws Exception {
        // Test that we can create a flow from here, and sort out the creation
        // of the ports and activities
        Role role1 = addRole("MyRole", false);
        Role role2 = addRole("YourRole", false);
        Activity act1 = addActivity(role1, false);
        Activity act2 = addActivity(role2, false);
        DeliverableFlow df = addDeliverableFlow(act1, act2, "FromMeToYou");
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        Shape role1Shape = json.findChildShapeById(role1.getId());
        Shape role3Shape = new Shape("role3id", new StencilType(VdmlRoleCollaborationStencil.ROLE.getStencilId()));
        role3Shape.setBounds(new org.jbpm.designer.extensions.diagram.Bounds(new Point(1d, 2d), new Point(1d, 2d)));
        json.getChildShapes().add(role3Shape);
        role3Shape.putProperty("name", "AnotherRole");
        role3Shape.putProperty("performedActivities", "Activity1,Activity2");
        role3Shape.putProperty("diagramElementId", role3Shape.getResourceId() + "de");
        Shape deliverableFlowShape = new Shape("deliverableflow", new StencilType(VdmlRoleCollaborationStencil.NEW_INTANGIBLE_DELIVERABLE_FLOW.getStencilId()));
        deliverableFlowShape.putProperty("name", "ANewDeliverableFlow");
        deliverableFlowShape.putProperty("diagramElementId", deliverableFlowShape.getResourceId() + "de");
        role3Shape.addOutgoing(deliverableFlowShape);
        deliverableFlowShape.addOutgoing(role1Shape);
        deliverableFlowShape.putProperty("providingActivityName", "Activity1");
        deliverableFlowShape.putProperty("receivingActivityName", "MyRoleActivity");
        json.getChildShapes().add(deliverableFlowShape);
        XMLResource outputResource = marshaller.convert(json);
        Collaboration coll = VdmlHelper.getCollaboration(outputResource);

        assertEquals("MyRole", ((Role) coll.eResource().getEObject(role1.getId())).getName());
        assertDiagramElementPresent(role1, outputResource);
        assertEquals("YourRole", ((Role) coll.eResource().getEObject(role2.getId())).getName());
        assertDiagramElementPresent(role2, outputResource);
        assertEquals("MyRoleActivity", ((Activity) coll.eResource().getEObject(act1.getId())).getName());
        assertEquals("YourRoleActivity", ((Activity) coll.eResource().getEObject(act2.getId())).getName());
        assertEquals("FromMeToYou", ((DeliverableFlow) coll.eResource().getEObject(df.getId())).getName());
        Role anotherRole = (Role) coll.eResource().getEObject(role3Shape.getResourceId());
        assertEquals("AnotherRole", anotherRole.getName());
        assertEquals(2, anotherRole.getPerformedWork().size());
        DeliverableFlow deliverableFlow = (DeliverableFlow) coll.eResource().getEObject(deliverableFlowShape.getResourceId());
        Activity fromActivity = (Activity) deliverableFlow.getProvider().eContainer();
        assertEquals("Activity1", fromActivity.getName());
        Activity toActivity = (Activity) deliverableFlow.getRecipient().eContainer();
        assertEquals("MyRoleActivity", toActivity.getName());
        assertDiagramElementPresent(df, outputResource);
    }

    @Test
    public void testAssignment() throws Exception {
        Role role1 = addRole("MyRole", true);
        // HACK should be created in other collaboration
        Role role2 = addRole("AssignedRole", true);
        Assignment a = VDMLFactory.eINSTANCE.createAssignment();
        role1.getRoleAssignment().add(a);
        a.setParticipant(role2);
        saveCollaborationResource();
        saveDiagramResource();
        assertTrue(unmarshaller.convert(diagramResource).findChildShapeById(role1.getId()).getProperty("assignedParticipants").contains(role2.getName()));
        XMLResource outputDiagram = assertConversionValid(diagramResource);
        new GenericEcoreComparator(VdmlHelper.getCollaboration(diagramResource), VdmlHelper.getCollaboration(outputDiagram));
    }

    @Test
    public void testFlowDeletion() throws Exception {
        // Test that we can delete the role, its activities and associated
        // flows.
        Role role1 = addRole("MyRole", false);
        Role role2 = addRole("YourRole", false);
        Activity act1 = addActivity(role1, false);
        Activity act2 = addActivity(role2, false);
        DeliverableFlow df = addDeliverableFlow(act1, act2, "FromMeToYou");
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(df.getId()));
        XMLResource outputResource = marshaller.convert(json);
        Collaboration coll = VdmlHelper.getCollaboration(outputResource);
        assertNotNull(coll.eResource().getEObject(role2.getId()));
        assertNotNull(coll.eResource().getEObject(act2.getId()));
        assertNull(coll.eResource().getEObject(df.getId()));
    }

    @Test
    public void testRoleDeletion() throws Exception {
        // Test that we can delete the role, its activities and associated
        // flows.
        Role role1 = addRole("MyRole", false);
        Role role2 = addRole("YourRole", false);
        Activity act1 = addActivity(role1, false);
        Activity act2 = addActivity(role2, false);
        DeliverableFlow df = addDeliverableFlow(act1, act2, "FromMeToYou");
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(role2.getId()));
        json.deleteShape(json.findChildShapeById(df.getId()));
        saveCollaborationResource();
        XMLResource outputResource = marshaller.convert(json);
        assertNull(outputResource.getEObject(role2.getId()));
        assertNull(outputResource.getEObject(act2.getId()));
        assertNull(outputResource.getEObject(df.getId()));
    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlRoleCollaborationProfileImpl();
    }

}
