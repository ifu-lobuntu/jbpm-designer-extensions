package org.jbpm.designer.vdan.impl;

import org.jbpm.designer.vdan.VdmlActivityNetworkProfileImpl;
import org.junit.Test;

public class ActivityNetworkDiagramStubTest {
    @Test
    public void testIt() throws Exception{
        VdmlActivityNetworkProfileImpl p = new VdmlActivityNetworkProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-vdan-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdmlactivitynetwork/vdmlactivitynetwork.json");
         p.createUnmarshaller().parseModel(p.getModelStub(),p,"");
    }
}
