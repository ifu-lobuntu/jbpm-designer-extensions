package org.jbpm.designer.vdan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.DefaultPotentialReferenceHelper;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.repository.UriUtils;
import org.jbpm.designer.type.VdmlActivityNetworkTypeDefinition;
import org.jbpm.designer.util.Utils;
import org.jbpm.designer.vdrc.VdmlPotentialReferenceHelper;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the VDML Activity Network profile for Process Designer.
 *
 */
@ApplicationScoped
public class VdmlActivityNetworkProfileImpl extends AbstractEmfDiagramProfile {

    private static final String STENCILSET_PATH = "stencilsets/vdan/vdan.json";

    public VdmlActivityNetworkProfileImpl() {
    }

    public String getTitle() {
        return "VDML Activity Network";
    }

    public String getName() {
        return "vdan";
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
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        CapabilityMethod cm = VDMLFactory.eINSTANCE.createCapabilityMethod();
        vdm.getCollaboration().add(cm);
        cm.setId("${processid}");
        cm.setName("${processid}");
        rs.getContents().add(vdm);
        VDMLDiagram dgm=VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        vdm.getDiagram().add(dgm);
        dgm.setVdmlElement(cm);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(VDMLPackage.eINSTANCE,VDMLDIPackage.eINSTANCE);
    }

    @Override
    public Factory getResourceFactory() {
        return new VDMLResourceFactoryImpl();
    }
    @Override
    protected DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new VdmlPotentialReferenceHelper(this);
    }
}
