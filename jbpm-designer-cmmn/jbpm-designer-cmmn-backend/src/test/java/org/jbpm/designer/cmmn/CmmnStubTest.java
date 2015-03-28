package org.jbpm.designer.cmmn;

import org.jbpm.designer.cmmn.CmmnProfileImpl;
import org.junit.Test;

public class CmmnStubTest {
    @Test
    public void testIt() throws Exception{
        CmmnProfileImpl p = new CmmnProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn/cmmn.json");
        p.initializeLocalPlugins("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/profiles/cmmn.xml");
         p.createUnmarshaller().parseModel(p.getModelStub(),p,"");
    }
}
