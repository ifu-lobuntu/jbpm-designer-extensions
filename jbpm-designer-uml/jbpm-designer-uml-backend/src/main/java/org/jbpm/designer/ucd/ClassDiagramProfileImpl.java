package org.jbpm.designer.ucd;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory;
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

    public static final String CMMNTYPES_PATHMAP = "pathmap://jbpm-cmmn/libraries/cmmntypes.uml";
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

    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", getResourceFactory());
        URL url = UMLDiagram.class.getResource("/libraries/cmmntypes.uml");
        URI uri = URI.createURI(CMMNTYPES_PATHMAP);
        resourceSet.getURIConverter().getURIMap().put(uri, URI.createURI(url.toExternalForm()));
        Resource cmmnTypes = resourceSet.createResource(uri);
        try {
            cmmnTypes.load(url.openStream(), Collections.emptyMap());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Factory getResourceFactory() {
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
        UMLDiagram dgm = UMLDIFactory.eINSTANCE.createUMLDiagram();
        rs.getContents().add(dgm);
        dgm.setUmlElement(pkg);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(UMLPackage.eINSTANCE, UMLDIPackage.eINSTANCE);
    }

}
