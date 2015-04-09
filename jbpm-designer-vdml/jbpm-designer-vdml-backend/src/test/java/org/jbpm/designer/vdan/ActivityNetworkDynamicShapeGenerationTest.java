package org.jbpm.designer.vdan;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.vdml.VdmlHelper;
import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;

public class ActivityNetworkDynamicShapeGenerationTest extends AbstractVdanDiagramMarshallingTest {

    @Test
    public void testDeliverableFlow() throws Exception {
        Role role1 = addRole("MyRole", false);
        Activity activity1 = addActivity(role1, false);
        Role role2 = addRole("YourRole", false);
        Activity activity2 = addActivity(role2, false);
        role1.getPerformedWork().add(activity1);
        DeliverableFlow deliverableFlow1 = addDeliverableFlow(activity1, activity2, "Flow1");
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        print(diagramResource);
        print(collaborationResource);
        XMLResource xml = marshaller.convert(json);
        print(collaborationResource);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertDiagramElementPresent(role1, xml);
        assertDiagramElementPresent(role2, xml);
        assertDiagramElementPresent(activity1, xml);
        assertDiagramElementPresent(activity2, xml);
        assertDiagramElementPresent(deliverableFlow1, xml);
        assertDiagramElementPresent(deliverableFlow1.getRecipient(), xml);
        assertDiagramElementPresent(deliverableFlow1.getProvider(), xml);
    }
}
