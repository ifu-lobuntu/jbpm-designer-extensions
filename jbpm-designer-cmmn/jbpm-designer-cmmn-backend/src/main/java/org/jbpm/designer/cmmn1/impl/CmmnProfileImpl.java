package org.jbpm.designer.cmmn1.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.jbpm.designer.type.Cmmn1TypeDefinition;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.DocumentRoot;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TStage;
import org.omg.cmmn.util.CMMNResourceFactoryImpl;
import org.omg.cmmn.util.CMMNResourceImpl;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.DiagramElement;
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
    private static final String STENCILSET_PATH = "stencilsets/cmmn1.0/cmmn1.0.json";

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
        inputDiagram.setCmmnElement(tCase);
        tCase.setCasePlanModel(CMMNFactory.eINSTANCE.createTStage());
        TStage casePlanModel = tCase.getCasePlanModel();
        casePlanModel.setAutoComplete(true);
        tCase.setName("${processid}");
        tCase.setId("${processid}");
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
        return "cmmn1.0";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/cmmn1.0#";
    }

    @Override
    public ResourceFactoryImpl prepareResourceSet(ResourceSet resourceSet) {
        super.getOtherProfile("classdiagram").prepareResourceSet(resourceSet);
        resourceSet.getPackageRegistry().put(CMMNPackage.eNS_URI, CMMNPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(CMMNDIPackage.eNS_URI, CMMNDIPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("cmmn", new CMMNResourceFactoryImpl());
        resourceSet.getPackageRegistry().put(DIPackage.eNS_URI, DIPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DCPackage.eNS_URI, DCPackage.eINSTANCE);
        return new CMMNResourceFactoryImpl();
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
        return CmmnStencil.CASE_DIAGRAM.getStencilId();
    }

    @Override
    public boolean processRequest(HttpServletRequest req, HttpServletResponse resp, String action, String processId) throws IOException {
        return calledElementHelper.processRequest(req, resp, action, processId, this);
    }
}
