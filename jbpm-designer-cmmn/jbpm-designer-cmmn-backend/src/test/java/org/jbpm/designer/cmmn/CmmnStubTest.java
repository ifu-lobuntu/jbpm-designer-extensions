package org.jbpm.designer.cmmn;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class CmmnStubTest {
    @Test
    public void testIt() throws Exception{
        CmmnProfileImpl p = new CmmnProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn/cmmn.json");
        p.initializeLocalPlugins("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/profiles/cmmn.xml");
         p.createUnmarshaller(URI.createURI("file:/dummy.cmmn")).parseModel(p.getModelStub(),p,"");
    }
}
