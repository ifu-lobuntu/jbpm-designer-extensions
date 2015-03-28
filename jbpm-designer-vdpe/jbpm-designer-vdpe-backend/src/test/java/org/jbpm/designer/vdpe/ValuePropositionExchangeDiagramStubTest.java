package org.jbpm.designer.vdpe;

import org.jbpm.designer.vdpe.VdmlPropositionExchangeProfileImpl;
import org.junit.Test;

public class ValuePropositionExchangeDiagramStubTest {
    @Test
    public void testIt() throws Exception {
        VdmlPropositionExchangeProfileImpl p = new VdmlPropositionExchangeProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-vdpe-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdpe/vdpe.json");
        p.initializeLocalPlugins("../jbpm-designer-vdpe-client/src/main/resources/org/jbpm/designer/public/profiles/vdpe.xml");
        p.createUnmarshaller().parseModel(p.getModelStub(), p, "");
    }
}
