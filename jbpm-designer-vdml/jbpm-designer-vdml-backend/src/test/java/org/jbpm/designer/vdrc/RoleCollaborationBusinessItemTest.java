package org.jbpm.designer.vdrc;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdlib.VdmlLibHelper;
import org.jbpm.designer.vdlib.VdmlLibraryStencil;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.designer.vdml.VdmlHelper;
import org.junit.Before;
import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Role;

public class RoleCollaborationBusinessItemTest extends AbstractVdmlDiagramMarshallingTest {

    @Before
    public void deleteModel() throws Exception {
        super.setup();
        TestUriHandler tuh = new TestUriHandler();
        tuh.getFile(URI.createPlatformResourceURI(collaborationFile, true)).delete();
    }

    @Test
    public void testRoleBusinessItemCreation() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        Activity act1 = addActivity(role1, true);
        Activity act2 = addActivity(role2, true);
        DeliverableFlow df = addDeliverableFlow(act1, act2, "FromMeToYou");
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        json.findChildShapeById(df.getId()).putProperty("syncBusinessItem", "true");
        XMLResource outputResource = marshaller.convert(json);
        DeliverableFlow found= (DeliverableFlow) VdmlHelper.getCollaboration(outputResource).eResource().getEObject(df.getId());
        assertNotNull(found.getDeliverable());
        assertNotNull(found.getDeliverable().getDefinition());
        assertEquals(found.getName(),found.getDeliverable().getName());
        assertEquals(found.getName(),found.getDeliverable().getDefinition().getName());
    }
    @Test
    public void testRoleBusinessItemSync() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        Activity act1 = addActivity(role1, true);
        Activity act2 = addActivity(role2, true);
        DeliverableFlow df = addDeliverableFlow(act1, act2, "FromMeToYou");
        Class bidClass = VdmlLibHelper.findOrCreateBusinessItemDefinitionClass(df.getName(), super.valueDeliveryModel);
        BusinessItemDefinition bid = (BusinessItemDefinition) bidClass.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
        df.setDeliverable(VdmlHelper.findOrCreateBusinessItemFor(bid, super.collaboration));
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        json.findChildShapeById(df.getId()).putProperty("syncBusinessItem", "true");
        json.findChildShapeById(df.getId()).putProperty("name", "TheDeliverable");
        XMLResource outputResource = marshaller.convert(json);
        DeliverableFlow found= (DeliverableFlow) VdmlHelper.getCollaboration(outputResource).eResource().getEObject(df.getId());
        assertNotNull(found.getDeliverable());
        assertNotNull(found.getDeliverable().getDefinition());
        assertEquals("TheDeliverable",found.getName());
        assertEquals("TheDeliverable",found.getDeliverable().getName());
        assertEquals("TheDeliverable",found.getDeliverable().getDefinition().getName());
    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlRoleCollaborationProfileImpl();
    }

}
