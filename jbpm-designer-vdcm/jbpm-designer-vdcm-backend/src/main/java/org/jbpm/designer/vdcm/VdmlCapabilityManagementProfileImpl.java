package org.jbpm.designer.vdcm;

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
import org.jbpm.designer.type.VdmlCapabilityManagementDiagramTypeDefinition;
import org.jbpm.designer.vdrc.CollaborationType;
import org.jbpm.designer.vdrc.IVdmlCollaborationDiagramProfile;
import org.jbpm.designer.vdrc.VdmlPotentialReferenceHelper;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the VDML Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlCapabilityManagementProfileImpl extends AbstractEmfDiagramProfile implements IVdmlCollaborationDiagramProfile {

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
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcol", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(VDMLPackage.eINSTANCE, VDMLDIPackage.eINSTANCE, SMMPackage.eINSTANCE);
    }

    @Override
    public Factory getResourceFactory() {
        return new VDMLResourceFactoryImpl();
    }

    @Override
    protected DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new VdmlPotentialReferenceHelper(this);
    }

    @Override
    public CollaborationType getDefaultForCollaborationType() {
        return CollaborationType.ORG_UNIT;
    }

}
