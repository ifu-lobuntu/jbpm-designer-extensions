package org.jbpm.designer.meas;


import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.type.MeasureLibraryTypeDefinition;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.smm.SMMPackage;
import org.omg.smm.impl.SMMPackageImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import javax.enterprise.context.ApplicationScoped;

/**
 * The implementation of the SMM Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class MeasureLibraryProfileImpl extends AbstractEmfDiagramProfile {
    static Logger LOGGER = LoggerFactory.getLogger(MeasureLibraryProfileImpl.class);
    static {
        try {
            ensureVfsUriHandlerPresent();
            SMMPackageImpl.init();
            SMMDIPackageImpl.init();
        } catch (Throwable t) {
            LOGGER.error("Could not initialize SMM EMF",t);
        }
    }

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
    public Resource.Factory getResourceFactory() {
        return new SMMDIResourceFactoryImpl();
    }
}
