package org.jbpm.designer.meas;

import org.jbpm.designer.meas.MeasureLibraryProfileImpl;
import org.junit.Test;

public class MeasureLibraryDiagramStubTest {
    @Test
    public void testIt() throws Exception{
        MeasureLibraryProfileImpl p = new MeasureLibraryProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-meas-client/src/main/resources/org/jbpm/designer/public/stencilsets/meas/meas.json");
        p.initializeLocalPlugins("../jbpm-designer-meas-client/src/main/resources/org/jbpm/designer/public/profiles/meas.xml");
         p.createUnmarshaller().parseModel(p.getModelStub(),p,"");
    }
}
