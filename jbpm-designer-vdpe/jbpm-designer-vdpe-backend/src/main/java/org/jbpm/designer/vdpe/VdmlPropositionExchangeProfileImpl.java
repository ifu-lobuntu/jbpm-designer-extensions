package org.jbpm.designer.vdpe;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlPropositionExchangeTypeDefinition;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlPropositionExchangeProfileImpl extends AbstractEmfDiagramProfile {

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
        return ddPackages(VDMLPackage.eINSTANCE,VDMLDIPackage.eINSTANCE);
    }
    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdrc", getResourceFactory());
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

}
