package org.jbpm.designer.ucd;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.ClassDiagramTypeDefinition;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class ClassDiagramProfileImpl extends AbstractEmfDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/classdiagram/classdiagram.json";

    public ClassDiagramProfileImpl() {
    }

    public String getTitle() {
        return "Class Diagram";
    }

    public String getName() {
        return "classdiagram";
    }
public static void main(String[] args) {
    System.out.println(new ClassDiagramProfileImpl().getModelStub());
}

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/classdiagram.0#";
    }

    @Override
    public ResourceFactoryImpl prepareResourceSet(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(UMLDIPackage.eNS_URI, UMLDIPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(getSerializedModelExtension(), new UMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
        resourceSet.getPackageRegistry().put(DIPackage.eNS_URI, DIPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DCPackage.eNS_URI, DCPackage.eINSTANCE);
        URL url = UMLDiagram.class.getResource("/libraries/cmmntypes.uml");
        Resource cmmnTypes = resourceSet.createResource(URI.createURI("libraries/cmmntypes.uml"));
        try {
            cmmnTypes.load(url.openStream(), Collections.emptyMap());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new UMLDIResourceFactoryImpl();
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new ClassDiagramEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new ClassDiagramJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new ClassDiagramTypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return "ClassDiagram";
    }
    @Override
    public boolean useIdAttribute() {
        return false;
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "classdiagram.xml";
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
        Package pkg = UMLFactory.eINSTANCE.createPackage();
        pkg.setName("{processid}");
        rs.getContents().add(pkg);
        UMLDiagram dgm=UMLDIFactory.eINSTANCE.createUMLDiagram();
        rs.getContents().add(dgm);
        dgm.setUmlElement(pkg);
    }

}
