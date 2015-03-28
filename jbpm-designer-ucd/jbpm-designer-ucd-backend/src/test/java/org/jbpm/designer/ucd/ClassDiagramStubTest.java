package org.jbpm.designer.ucd;

import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.junit.Test;

public class ClassDiagramStubTest {
    @Test
    public void testIt() throws Exception {
        ClassDiagramProfileImpl p = new ClassDiagramProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-ucd-client/src/main/resources/org/jbpm/designer/public/stencilsets/ucd/ucd.json");
        p.initializeLocalPlugins("../jbpm-designer-ucd-client/src/main/resources/org/jbpm/designer/public/profiles/ucd.xml");
        p.createUnmarshaller().parseModel(p.getModelStub(), p, "");
    }
}
