package org.jbpm.designer.vdpe;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.DefaultPotentialReferenceHelper;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlPropositionExchangeTypeDefinition;
import org.jbpm.designer.vdml.CollaborationType;
import org.jbpm.designer.vdml.IVdmlCollaborationDiagramProfile;
import org.jbpm.designer.vdml.VdmlPotentialReferenceHelper;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlPropositionExchangeProfileImpl extends AbstractEmfDiagramProfile implements IVdmlCollaborationDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdpe/vdpe.json";

    public VdmlPropositionExchangeProfileImpl() {
    }

    public String getTitle() {
        return "VDML Proposition Exchange";
    }

    public String getName() {
        return "vdpe";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/vdpe#";
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new VdmlPropositionExchangeEmfToJsonHelper(resource);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(VDMLPackage.eINSTANCE, VDMLDIPackage.eINSTANCE,SMMPackage.eINSTANCE);
    }

    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcol", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
    }

    @Override
    public Factory getResourceFactory() {
        return new VDMLResourceFactoryImpl();
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new VdmlPropositionExchangeJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new VdmlPropositionExchangeTypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return "PropositionExchangeDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdpe.xml";
    }

    @Override
    public void populateModelStub(XMLResource rs) {
    }

    @Override
    protected DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new VdmlPotentialReferenceHelper(this);
    }
    @Override
    public CollaborationType getDefaultForCollaborationType() {
        return null;
    }

}
