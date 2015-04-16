package org.jbpm.designer.meas;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.type.MeasureLibraryTypeDefinition;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.smm.SMMPackage;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the SMM Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class MeasureLibraryProfileImpl extends AbstractEmfDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/meas/meas.json";

    public MeasureLibraryProfileImpl() {
    }

    public String getTitle() {
        return "SMM Measure Library";
    }

    public String getName() {
        return "meas";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/meas#";
    }

    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet);
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new MeasureLibraryEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new MeasureLibraryJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new MeasureLibraryTypeDefinition();
    }

    @Override
    public boolean useIdAttribute() {
        return false;
    }

    @Override
    public String getDiagramStencilId() {
        return "MeasureLibraryDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "meas.xml";
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
        MeasureLibrary lib = SMMFactory.eINSTANCE.createMeasureLibrary();
        rs.setID(lib, "${processid}");
        lib.setName("${processid}");
        rs.getContents().add(lib);
        SMMDiagram dgm = SMMDIFactory.eINSTANCE.createSMMDiagram();
        lib.getOwnedDiagram().add(dgm);
        dgm.setSmmElement(lib);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(SMMPackage.eINSTANCE, SMMDIPackage.eINSTANCE);
    }

    @Override
    public Factory getResourceFactory() {
        return new SMMDIResourceFactoryImpl();
    }
}
