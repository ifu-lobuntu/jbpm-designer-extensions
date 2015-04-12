package org.jbpm.designer.vdpe;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlPropositionExchangeTypeDefinition;
import org.jbpm.designer.vdml.AbstractVdmlDiagramProfile;
import org.jbpm.designer.vdml.CollaborationType;
import org.jbpm.designer.vdml.IVdmlCollaborationDiagramProfile;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlPropositionExchangeProfileImpl extends AbstractVdmlDiagramProfile implements IVdmlCollaborationDiagramProfile {

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
    public CollaborationType getDefaultForCollaborationType() {
        return null;
    }

}
