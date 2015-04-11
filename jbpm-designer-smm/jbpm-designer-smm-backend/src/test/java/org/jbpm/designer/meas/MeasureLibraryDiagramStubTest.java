package org.jbpm.designer.meas;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class MeasureLibraryDiagramStubTest {
    @Test
    public void testIt() throws Exception{
        MeasureLibraryProfileImpl p = new MeasureLibraryProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-smm-client/src/main/resources/org/jbpm/designer/public/stencilsets/meas/meas.json");
        p.initializeLocalPlugins("../jbpm-designer-smm-client/src/main/resources/org/jbpm/designer/public/profiles/meas.xml");
         p.createUnmarshaller(URI.createFileURI("dummy.meas")).parseModel(p.getModelStub(),p,"");
    }
}
