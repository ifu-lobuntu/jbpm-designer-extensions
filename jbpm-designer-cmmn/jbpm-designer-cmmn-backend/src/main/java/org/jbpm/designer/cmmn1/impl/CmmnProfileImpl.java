package org.jbpm.designer.cmmn1.impl;

import java.io.IOException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.cmmn1.Cmmn1Package;
import org.eclipse.cmmn1.util.Cmmn1ResourceFactoryImpl;
import org.eclipse.cmmndi.CmmnDiPackage;
import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.jbpm.designer.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.emf.util.EmfToJsonHelper;
import org.jbpm.designer.emf.util.JsonToEmfHelper;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.type.Cmmn1TypeDefinition;
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
        resourceSet.getPackageRegistry().put(Cmmn1Package.eNS_URI, Cmmn1Package.eINSTANCE);
        resourceSet.getPackageRegistry().put(CmmnDiPackage.eNS_URI, CmmnDiPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("cmmn", new Cmmn1ResourceFactoryImpl());
        resourceSet.getPackageRegistry().put(DiPackage.eNS_URI, DiPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DcPackage.eNS_URI, DcPackage.eINSTANCE);
        return new Cmmn1ResourceFactoryImpl();
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new CmmnEmfToJsonHelper(resource);
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new CmmnJsonToEmfHelper( resource);
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new Cmmn1TypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return "CMMNDiagram";
    }
    @Override
    public boolean processRequest(HttpServletRequest req, HttpServletResponse resp, String action, String processId) throws IOException {
        return calledElementHelper.processRequest(req, resp, action, processId, this);
    }
}
