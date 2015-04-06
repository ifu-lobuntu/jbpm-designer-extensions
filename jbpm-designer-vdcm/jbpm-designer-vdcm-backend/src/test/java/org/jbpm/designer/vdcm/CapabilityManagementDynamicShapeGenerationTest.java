package org.jbpm.designer.vdcm;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.junit.Test;
import org.omg.vdml.Role;

public class CapabilityManagementDynamicShapeGenerationTest extends AbstractVdcmDiagramMarshallingTest {

    @Test
    public void testRole() throws Exception {
        Role role1 = addRole("MyRole", false);
        Role role2 = addRole("YourRole", false);
        saveCollaborationResource();
        Diagram json = unmarshaller.convert(diagramResource);
        print(diagramResource);
        print(collaborationResource);
        XMLResource xml = marshaller.convert(json);
        print(collaborationResource);
        assertDiagramElementPresent(role1, xml);
        assertDiagramElementPresent(role2, xml);
    }
}
