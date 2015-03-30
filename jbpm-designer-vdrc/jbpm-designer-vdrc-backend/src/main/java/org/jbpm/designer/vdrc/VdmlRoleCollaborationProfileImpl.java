package org.jbpm.designer.vdrc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.util.Utils;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
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
public class VdmlRoleCollaborationProfileImpl extends AbstractEmfDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdrc/vdrc.json";
    @Inject
    @RequestScoped
    Instance<HttpServletRequest> request;

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
        return "VdmlPropositionExchangeDiagram";
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "vdrc.xml";
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        CapabilityMethod cm = VDMLFactory.eINSTANCE.createCapabilityMethod();
        vdm.getCollaboration().add(cm);
        cm.setId("${processid}");
        cm.setName("${processid}");
        rs.getContents().add(vdm);
        VDMLDiagram dgm = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        vdm.getDiagram().add(dgm);
        dgm.setVdmlElement(cm);
    }

    @Override
    public String determineURI() {
        return Utils.getEncodedParam(request.get(), "assetid");
    }
}
