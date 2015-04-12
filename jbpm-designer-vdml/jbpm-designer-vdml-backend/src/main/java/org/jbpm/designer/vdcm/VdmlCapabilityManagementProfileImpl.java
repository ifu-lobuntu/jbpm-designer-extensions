package org.jbpm.designer.vdcm;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.type.VdmlCapabilityManagementDiagramTypeDefinition;
import org.jbpm.designer.vdml.AbstractVdmlDiagramProfile;
import org.jbpm.designer.vdml.CollaborationType;
import org.jbpm.designer.vdml.IVdmlCollaborationDiagramProfile;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the VDML Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlCapabilityManagementProfileImpl extends AbstractVdmlDiagramProfile implements IVdmlCollaborationDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdcm/vdcm.json";

    public VdmlCapabilityManagementProfileImpl() {
    }

    public String getTitle() {
        return "VDML Capability Management";
    }

    public String getName() {
        return "vdcm";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/vdcm#";
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new VdmlCapabilityManagementEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new VdmlCapabilityManagementJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new VdmlCapabilityManagementDiagramTypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return "VdmlCapabilityManagementDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdcm.xml";
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
    }

    @Override
    public CollaborationType getDefaultForCollaborationType() {
        return CollaborationType.ORG_UNIT;
    }

}
