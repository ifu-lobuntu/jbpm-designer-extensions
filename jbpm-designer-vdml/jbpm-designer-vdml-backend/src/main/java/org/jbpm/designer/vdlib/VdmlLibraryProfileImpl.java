package org.jbpm.designer.vdlib;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.impl.DefaultPotentialReferenceHelper;
import org.jbpm.designer.type.VdmlLibraryTypeDefinition;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.vdml.VdmlPotentialReferenceHelper;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.util.VDMLDIResourceFactoryImpl;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the VDML Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlLibraryProfileImpl extends AbstractClassDiagramProfileImpl{

    private static final String STENCILSET_PATH = "stencilsets/vdlib/vdlib.json";

    public VdmlLibraryProfileImpl() {
    }

    public String getTitle() {
        return "VDML Library";
    }

    public String getName() {
        return "vdlib";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/vdlib#";
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new VdmlLibraryEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new VdmlLibraryJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new VdmlLibraryTypeDefinition();
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdlib.xml";
    }

    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcol", new VDMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcm", new VDMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdrc", new VDMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdpe", new VDMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdlib", new UMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
        super.populateModelStub(rs);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(UMLPackage.eINSTANCE, UMLDIPackage.eINSTANCE, VDMLPackage.eINSTANCE, SMMPackage.eINSTANCE);
    }

    @Override
    public DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new VdmlPotentialReferenceHelper(this);
    }


}
