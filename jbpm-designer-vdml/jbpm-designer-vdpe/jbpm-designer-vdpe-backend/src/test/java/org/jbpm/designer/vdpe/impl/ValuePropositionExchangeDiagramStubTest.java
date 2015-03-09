package org.jbpm.designer.vdpe.impl;

import org.jbpm.designer.vdpe.VdmlPropositionExchangeProfileImpl;
import org.junit.Test;

public class ValuePropositionExchangeDiagramStubTest {
    @Test
    public void testIt() throws Exception{
        VdmlPropositionExchangeProfileImpl p = new VdmlPropositionExchangeProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-vdpe-client/src/main/resources/org/jbpm/designer/public/stencilsets/vdmlpropositionexchange/vdmlpropositionexchange.json");
         p.createUnmarshaller().parseModel(p.getModelStub(),p,"");
    }
}
