package org.jbpm.designer.vdrc;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlRoleCollaborationTypeDefinition;
import org.jbpm.designer.vdml.AbstractVdmlDiagramProfile;
import org.jbpm.designer.vdml.CollaborationType;
import org.jbpm.designer.vdml.IVdmlDiagramProfile;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlRoleCollaborationProfileImpl extends AbstractVdmlDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdrc/vdrc.json";

    public VdmlRoleCollaborationProfileImpl() {
    }

    public String getTitle() {
        return "VDML Role Collaboration";
    }

    public String getName() {
        return "vdrc";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/vdrc#";
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap shapeMap) {
        return new VdmlRoleCollaborationEmfToJsonHelper(shapeMap);
    }


    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new VdmlRoleCollaborationJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new VdmlRoleCollaborationTypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return "RoleCollaborationDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdrc.xml";
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
        //Done elsewhere
    }
    @Override
    public CollaborationType getDefaultForCollaborationType() {
        return CollaborationType.BUSINESS_NETWORK;
    }
}
