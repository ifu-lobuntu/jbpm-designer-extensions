package org.jbpm.designer.vdrc;

import org.jbpm.designer.vdrc.VdmlRoleCollaborationProfileImpl;
import org.junit.Test;

public class ValuePropositionExchangeDiagramStubTest {
    @Test
    public void testIt() throws Exception {
        VdmlRoleCollaborationProfileImpl p = new VdmlRoleCollaborationProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-vdrc-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdrc/vdrc.json");
        p.initializeLocalPlugins("../jbpm-designer-vdrc-client/src/main/resources/org/jbpm/designer/public/profiles/vdrc.xml");
        p.createUnmarshaller().parseModel(p.getModelStub(), p, "");
    }
}
