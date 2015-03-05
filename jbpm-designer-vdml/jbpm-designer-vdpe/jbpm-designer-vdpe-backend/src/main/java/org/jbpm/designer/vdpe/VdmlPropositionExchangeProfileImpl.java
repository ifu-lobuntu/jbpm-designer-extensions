package org.jbpm.designer.vdpe;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.jbpm.designer.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.emf.util.EmfToJsonHelper;
import org.jbpm.designer.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.emf.util.JsonToEmfHelper;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlPropositionExchangeTypeDefinition;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdml.util.VdmlResourceFactoryImpl;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlPropositionExchangeProfileImpl extends AbstractEmfDiagramProfile implements IEmfDiagramProfile, IDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdmlpropositionexchange/vdmlpropositionexchange.json";

    public VdmlPropositionExchangeProfileImpl() {
    }

    public String getTitle() {
        return "VDML Proposition Exchange";
    }

    public String getName() {
        return "vdmlpropositionexchange";
    }


    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/vdmlpropositionexchange.0#";
    }

    @Override
    public ResourceFactoryImpl prepareResourceSet(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put(VdmlPackage.eNS_URI, VdmlPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(VdmlDiPackage.eNS_URI, VdmlDiPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(getSerializedModelExtension(), new VdmlResourceFactoryImpl());
        resourceSet.getPackageRegistry().put(DiPackage.eNS_URI, DiPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DcPackage.eNS_URI, DcPackage.eINSTANCE);
        return new VdmlResourceFactoryImpl();
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new VdmlPropositionExchangeEmfToJsonHelper(resource);
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
        return "VdmlPropositionExchangeDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdpe.xml";
    }

}
