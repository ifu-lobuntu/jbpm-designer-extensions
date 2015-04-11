package org.jbpm.designer.ucd;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class ClassDiagramStubTest {
    @Test
    public void testIt() throws Exception {
        ClassDiagramProfileImpl p = new ClassDiagramProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-uml-client/src/main/resources/org/jbpm/designer/public/stencilsets/ucd/ucd.json");
        p.initializeLocalPlugins("../jbpm-designer-uml-client/src/main/resources/org/jbpm/designer/public/profiles/ucd.xml");
        p.createUnmarshaller(URI.createFileURI("dummy.ucd")).parseModel(p.getModelStub(), p, "");
    }
}
