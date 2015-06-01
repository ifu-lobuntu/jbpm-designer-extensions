package org.jbpm.designer.meas;

import org.eclipse.emf.common.util.URI;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl;
import org.junit.Test;
import org.uberfire.backend.vfs.PathFactory;

public class MeasureLibraryDiagramStubTest {
    static{
        UMLDIPackageImpl.init();
    }
    @Test
    public void testIt() throws Exception{
        MeasureLibraryProfileImpl p = new MeasureLibraryProfileImpl();
        p.loadLinkedStencilSet("../jbpm-designer-smm-client/src/main/resources/org/jbpm/designer/public/stencilsets/meas/meas.json");
        p.initializeLocalPlugins("../jbpm-designer-smm-client/src/main/resources/org/jbpm/designer/public/profiles/meas.xml");
         p.createUnmarshaller(URI.createFileURI("test.meas")).parseModel(p.getModelStub(PathFactory.newPath("test.meas", "/project1/src/main/resources/pkg1/test.meas")),p,"");
    }
}
