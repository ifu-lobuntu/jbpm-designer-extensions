package org.jbpm.designer.cmmn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.jbpmext.JbpmextPackage;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.Bpmn2EmfProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.IEmfProfile;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.type.Cmmn1TypeDefinition;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.DocumentRoot;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TStage;
import org.omg.cmmn.util.CMMNResourceFactoryImpl;
import org.omg.dd.dc.DCFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
@ApplicationScoped
public class CmmnProfileImpl extends AbstractEmfDiagramProfile {
    @Inject
    CmmnCalledElementHelper calledElementHelper;
    private static final String STENCILSET_PATH = "stencilsets/cmmn/cmmn.json";
    Map<String,EStructuralFeature> customFeatures=new HashMap<String, EStructuralFeature>();{
        customFeatures.put("externalProcess", JbpmextPackage.eINSTANCE.getDocumentRoot_ExternalProcess());
    }
    static Logger _logger = LoggerFactory.getLogger(CmmnProfileImpl.class);

    public CmmnProfileImpl() {
    }

    protected void populateModelStub(XMLResource inputResource) {
        TDefinitions inputDefinitions = CMMNFactory.eINSTANCE.createTDefinitions();
        DocumentRoot root = CMMNFactory.eINSTANCE.createDocumentRoot();
        root.setDefinitions(inputDefinitions);
        CMMNDiagram inputDiagram = CMMNDIFactory.eINSTANCE.createCMMNDiagram();
        inputDefinitions.getDiagram().add(inputDiagram);
        inputResource.getContents().add(root);
        TCase tCase = createCase(inputDefinitions);
        inputDefinitions.getCase().add(tCase);
        inputDiagram.setCmmnElement(inputDefinitions);
        tCase.setCasePlanModel(CMMNFactory.eINSTANCE.createTStage());
        TStage casePlanModel = tCase.getCasePlanModel();
        casePlanModel.setAutoComplete(true);
        tCase.setName("${processid}");
        tCase.setId("${processid}");
        CMMNShape caseShape = CMMNDIFactory.eINSTANCE.createCMMNShape();
        inputDiagram.getOwnedCmmnDiagramElement().add(caseShape);
        caseShape.setCmmnElement(tCase);
        caseShape.setBounds(DCFactory.eINSTANCE.createBounds());
        caseShape.getBounds().setX(10d);
        caseShape.getBounds().setY(10d);
        caseShape.getBounds().setWidth(600d);
        caseShape.getBounds().setHeight(300d);
    }


    private TCase createCase(TDefinitions inputDefinitions) {
        TCase tCase = CMMNFactory.eINSTANCE.createTCase();
        inputDefinitions.getCase().add(tCase);
        inputDefinitions.setTargetNamespace("http://asdf.com/");
        tCase.setCaseFileModel(CMMNFactory.eINSTANCE.createTCaseFile());
        return tCase;
    }


    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    public String getTitle() {
        return "CMMN Case Designer";
    }

    public String getProfileDefinitionFileName() {
        return "cmmn.xml";
    }

    public String getName() {
        return "cmmn";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/cmmn#";
    }


    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new CmmnEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new CmmnJsonToEmfHelper(resource);
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new Cmmn1TypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return CmmnStencil.CMMN_DIAGRAM.getStencilId();
    }

    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
        new Bpmn2EmfProfile().prepareResourceSet(resourceSet);
        IEmfProfile cd = getOtherProfile("classdiagram");
        if(cd!=null){
            cd.prepareResourceSet(resourceSet);
        }
        UriHelper.setPlatformUriHandler(resourceSet, getUriHandler());
    }
    @Override
    public boolean processRequest(HttpServletRequest req, HttpServletResponse resp, String action, String processId) throws IOException {
        return calledElementHelper.processRequest(req, resp, action, processId, this);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(Bpmn2Package.eINSTANCE, UMLPackage.eINSTANCE,CMMNPackage.eINSTANCE,CMMNDIPackage.eINSTANCE,JbpmextPackage.eINSTANCE);
    }

    @Override
    public Factory getResourceFactory() {
        return new CMMNResourceFactoryImpl();
    }
    @Override
    public EStructuralFeature demandFeature(String name) {
        return customFeatures.get(name);
    }
}
