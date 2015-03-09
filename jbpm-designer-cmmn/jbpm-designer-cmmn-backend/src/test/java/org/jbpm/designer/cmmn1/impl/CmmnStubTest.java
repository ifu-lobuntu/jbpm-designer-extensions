package org.jbpm.designer.cmmn1.impl;

import org.junit.Test;

public class CmmnStubTest {
    @Test
    public void testIt() throws Exception{
        CmmnProfileImpl p = new CmmnProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn1.0/cmmn1.0.json");
         p.createUnmarshaller().parseModel(p.getModelStub(),p,"");
    }
}
