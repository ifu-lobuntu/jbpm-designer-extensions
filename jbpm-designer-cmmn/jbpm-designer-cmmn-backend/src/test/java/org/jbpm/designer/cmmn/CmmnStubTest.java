package org.jbpm.designer.cmmn;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.uberfire.backend.vfs.PathFactory;

public class CmmnStubTest {
    @Test
    public void testIt() throws Exception{
        CmmnProfileImpl p = new CmmnProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn/cmmn.json");
        p.initializeLocalPlugins("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/profiles/cmmn.xml");
         p.createUnmarshaller(URI.createURI("platform:/resource/project/src/main/resources/dummy.cmmn")).parseModel(p.getModelStub(PathFactory.newPath("dummy.cmmn", "/project/src/main/resources/dummy.cmmn")),p,"");
    }
}
