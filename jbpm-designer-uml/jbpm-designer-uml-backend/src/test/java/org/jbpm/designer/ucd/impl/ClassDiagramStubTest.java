package org.jbpm.designer.ucd.impl;

import org.jbpm.designer.ucd.ClassDiagramProfileImpl;
import org.junit.Test;

public class ClassDiagramStubTest {
    @Test
    public void testIt() throws Exception{
        ClassDiagramProfileImpl p = new ClassDiagramProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-uml-client/src/main/resources/org/jbpm/designer/public/stencilsets/classdiagram/classdiagram.json");
         p.createUnmarshaller().parseModel(p.getModelStub(),p,"");
    }
}
