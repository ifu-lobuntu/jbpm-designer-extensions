package org.jbpm.designer.ucd;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jboss.errai.bus.server.api.RpcContext;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.repository.vfs.RepositoryDescriptor;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.designer.type.ClassDiagramTypeDefinition;
import org.jbpm.designer.ucd.errai.FakeMessage;
import org.jbpm.designer.util.Utils;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.kie.workbench.common.screens.datamodeller.model.DataModelTO;
import org.kie.workbench.common.screens.datamodeller.service.DataModelerService;
import org.kie.workbench.common.services.shared.project.KieProject;
import org.kie.workbench.common.services.shared.project.KieProjectService;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
public class AbstractClassDiagramProfileImpl extends AbstractEmfDiagramProfile {

    public static final String CMMNTYPES_PATHMAP = "pathmap://jbpm-cmmn/libraries/cmmntypes.uml";
    private static final String STENCILSET_PATH = "stencilsets/ucd/ucd.json";
    @Inject
    private DataModelerService dataModelerService;
    @Inject
    private KieProjectService projectService;
    @Inject
    RepositoryDescriptor repositoryDescriptor;
    @Inject
    Instance<HttpServletRequest> request;
    @Inject
    ClassDiagramFormBuilderServiceImpl classDiagramFormBuilderService;

    public AbstractClassDiagramProfileImpl() {
    }

    public String getTitle() {
        return "Class Diagram";
    }

    public String getName() {
        return "ucd";
    }

    public String getStencilSetNamespaceURL() {
        return "http://b3mn.org/stencilset/ucd#";
    }

    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", getResourceFactory());
        URL url = UMLDiagram.class.getResource("/libraries/cmmntypes.uml");
        URI uri = URI.createURI(CMMNTYPES_PATHMAP);
        resourceSet.getURIConverter().getURIMap().put(uri, URI.createURI(url.toExternalForm()));
        Resource cmmnTypes = resourceSet.createResource(uri);
        try {
            cmmnTypes.load(url.openStream(), Collections.emptyMap());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Factory getResourceFactory() {
        return new UMLDIResourceFactoryImpl();
    }

    @Override
    public EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource) {
        return new ClassDiagramEmfToJsonHelper(resource);
    }

    @Override
    public IDiagramMarshaller createMarshaller(URI uri) {
        return new GenericJsonToEmfDiagramMarshaller(this,uri) {
            // TODO!!! temp hack to generate classes
            @Override
            public XMLResource getResource(String jsonModel, String preProcessingData) throws Exception {
                XMLResource r = super.getResource(jsonModel, preProcessingData);
                return r;
            }

        };
    }
    public void generateDataModel(XMLResource r) {
        if (dataModelerService != null) {
            String uuid = Utils.getEncodedParam(request.get(), "assetid");
            DataModelTO dm = new ClassDiagram2DataModel(dataModelerService.getAnnotationDefinitions()).toDataModel(r, uuid);
            // The price we pay for not using errai
            RpcContext.set(new FakeMessage());
            Path newPath = PathFactory.newPath(dm.getParentProjectName(),
                    repositoryDescriptor.getRepositoryRoot().toString() + dm.getParentProjectName());
            KieProject project = projectService.resolveProject(newPath);
            try {
                dataModelerService.saveModel(dm, project, true, "Saving Data Objects");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource) {
        return new ClassDiagramJsonToEmfHelper(resource);
    }

    @Override
    public String getStencilSetPath() {
        return STENCILSET_PATH;
    }

    @Override
    protected ResourceTypeDefinition getResourceTypeDefinition() {
        return new ClassDiagramTypeDefinition();
    }

    @Override
    public String getDiagramStencilId() {
        return "ClassDiagram";
    }

    @Override
    public boolean useIdAttribute() {
        return false;
    }

    @Override
    public String getProfileDefinitionFileName() {
        return "ucd.xml";
    }

    @Override
    protected void populateModelStub(XMLResource rs) {
        Package pkg = UMLFactory.eINSTANCE.createPackage();
        pkg.setName("${processid}");
        rs.getContents().add(pkg);
        UMLDiagram dgm = UMLDIFactory.eINSTANCE.createUMLDiagram();
        rs.getContents().add(dgm);
        dgm.setUmlElement(pkg);
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(UMLPackage.eINSTANCE, UMLDIPackage.eINSTANCE);
    }

    @Override
    public Collection<TaskFormInfo> generateAllForms(Path path, XMLResource resource) {
        return classDiagramFormBuilderService.generateAllForms(path, resource);
    }

    @Override
    public TaskFormInfo generateFormFor(Path path, XMLResource resource, String elementId, String formType) {
        return classDiagramFormBuilderService.generateFormFor(path, resource, elementId);
    }

    @Override
    public String getFormId(XMLResource resource , String classId, String formType) {
        return ((Class) resource.getEObject(classId)).getName();
    }
}
