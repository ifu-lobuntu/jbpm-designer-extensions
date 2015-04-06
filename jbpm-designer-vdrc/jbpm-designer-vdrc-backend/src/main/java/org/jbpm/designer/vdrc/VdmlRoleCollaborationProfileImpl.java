package org.jbpm.designer.vdrc;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlRoleCollaborationProfileImpl extends AbstractEmfDiagramProfile implements IVdmlCollaborationDiagramProfile{

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
    public EPackage[] getEPackages() {
        return ddPackages(VDMLPackage.eINSTANCE, VDMLDIPackage.eINSTANCE);
    }

    @Override
    public Factory getResourceFactory() {
        return new VDMLResourceFactoryImpl();
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
    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcol", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
    }
}
