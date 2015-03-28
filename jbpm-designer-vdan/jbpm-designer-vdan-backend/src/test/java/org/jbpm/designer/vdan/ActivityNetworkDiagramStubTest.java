package org.jbpm.designer.vdan;

import org.jbpm.designer.vdan.VdmlActivityNetworkProfileImpl;
import org.junit.Test;

public class ActivityNetworkDiagramStubTest {
    @Test
    public void testIt() throws Exception {
        VdmlActivityNetworkProfileImpl p = new VdmlActivityNetworkProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-vdan-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdan/vdan.json");
        p.initializeLocalPlugins("../jbpm-designer-vdan-client/src/main/resources/org/jbpm/designer/public/profiles/vdan.xml");
        p.createUnmarshaller().parseModel(p.getModelStub(), p, "");
    }
}
