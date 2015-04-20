package org.jbpm.designer.vdan;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.IEmfBasedFormBuilder;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlActivityNetworkTypeDefinition;
import org.jbpm.designer.vdml.AbstractVdmlDiagramProfile;
import org.jbpm.designer.vdml.CollaborationType;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the VDML Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlActivityNetworkProfileImpl extends AbstractVdmlDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdan/vdan.json";
    @Inject
    @ProfileName("vdan")
    VdmlActivityNetworkFormBuilder formBuilder;
    public VdmlActivityNetworkProfileImpl() {
    }

    public String getTitle() {
        return "VDML Activity Network";
    }

    public String getName() {
        return "vdan";
    }
    @Override
    public IEmfBasedFormBuilder getFormBuilder() {
        return formBuilder;
    }
    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/vdan#";
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new VdmlActivityNetworkEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new VdmlActivityNetworkJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new VdmlActivityNetworkTypeDefinition();
    }
    @Override
    public String getDiagramStencilId() {
        return "VdmlActivityNetworkDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdan.xml";
    }
    @Override
    protected void populateModelStub(XMLResource rs) {
    }

    @Override
    public CollaborationType getDefaultForCollaborationType() {
        return CollaborationType.CAPABILITY_METHOD;
    }
}
