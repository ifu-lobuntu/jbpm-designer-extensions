package org.jbpm.designer.ucd;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.color.color.ColorPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.uml2.di.umldi.UMLDIPackage;
import org.eclipse.uml2.di.umldi.UMLDiagram;
import org.eclipse.uml2.di.umldi.util.UMLDIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.jbpm.designer.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.emf.util.EmfToJsonHelper;
import org.jbpm.designer.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.emf.util.JsonToEmfHelper;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.type.ClassDiagramTypeDefinition;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class ClassDiagramProfileImpl extends AbstractEmfDiagramProfile implements IEmfDiagramProfile, IDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/classdiagram/classdiagram.json";

    public ClassDiagramProfileImpl() {
    }

    public String getTitle() {
        return "Class Diagram";
    }

    public String getName() {
        return "classdiagram";
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
        resourceSet.getPackageRegistry().put(DiPackage.eNS_URI, DiPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DcPackage.eNS_URI, DcPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ColorPackage.eNS_URI, ColorPackage.eINSTANCE);
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

}
