package org.jbpm.designer.cmmn;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.jbpmext.JbpmextPackage;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.IEmfBasedFormBuilder;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.impl.Bpmn2EmfProfile;
import org.jbpm.designer.extensions.impl.DefaultPotentialReferenceHelper;
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
    private static final String STENCILSET_PATH = "stencilsets/cmmn/cmmn.json";
    static Map<String,EStructuralFeature> customFeatures=new HashMap<String, EStructuralFeature>();
    static {
        customFeatures.put("externalProcess", JbpmextPackage.eINSTANCE.getDocumentRoot_ExternalProcess());
        customFeatures.put("vdmlElement", JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement());
    }
    static Logger _logger = LoggerFactory.getLogger(CmmnProfileImpl.class);
    @Inject
    @ProfileName("cmmn")
    private CmmnFormBuilder formBuilder;
    
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
        String[] otherProfiles={"ucd","vdlib","vdcm"};
        for (String otherProfileName : otherProfiles) {
            IEmfProfile otherProfile = getOtherProfile(otherProfileName);
            if(otherProfile!=null){
                otherProfile.prepareResourceSet(resourceSet);
            }
        }
        UriHelper.setPlatformUriHandler(resourceSet, getUriHandler());
    }
    @Override
    public DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new CmmnPotentialReferenceHelper(this);
    }
    @Override
    public EPackage[] getEPackages() {
        try{
        return ddPackages(Bpmn2Package.eINSTANCE, UMLPackage.eINSTANCE,CMMNPackage.eINSTANCE,CMMNDIPackage.eINSTANCE,JbpmextPackage.eINSTANCE);
        }catch(Throwable t){
            t.printStackTrace();
            return new EPackage[0]; 
        }
    }
    @Override
    public IEmfBasedFormBuilder getFormBuilder() {
        return this.formBuilder;
    }
    @Override
    public Factory getResourceFactory() {
        return new CMMNResourceFactoryImpl();
    }
    @Override
    public EStructuralFeature demandFeature(String name) {
        return customFeatures.get(name);
    }
    @Override
    public Map<String, Object> buildDefaultResourceOptions() {
        Map<String, Object> options = super.buildDefaultResourceOptions();
        options.remove(XMLResource.OPTION_URI_HANDLER);//Let the resource override it 
        return options;
    }
}
