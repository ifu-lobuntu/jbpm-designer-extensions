package org.jbpm.designer.ucd;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Map;
import java.util.zip.ZipFile;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.jboss.errai.bus.server.api.RpcContext;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.IEmfBasedFormBuilder;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.impl.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.repository.vfs.RepositoryDescriptor;
import org.jbpm.designer.type.ClassDiagramTypeDefinition;
import org.jbpm.designer.ucd.errai.FakeMessage;
import org.jbpm.designer.util.Utils;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.kie.workbench.common.screens.datamodeller.model.DataModelTO;
import org.kie.workbench.common.screens.datamodeller.service.DataModelerService;
import org.kie.workbench.common.services.datamodeller.core.DataModel;
import org.kie.workbench.common.services.shared.project.KieProject;
import org.kie.workbench.common.services.shared.project.KieProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 * The implementation of the CMMN profile for Process Designer.
 *
 */
public abstract class AbstractClassDiagramProfileImpl extends AbstractEmfDiagramProfile {

    public static final String CMMNTYPES_PATHMAP = "pathmap://jbpm-cmmn/libraries/cmmntypes.uml";
    private static final String STENCILSET_PATH = "stencilsets/ucd/ucd.json";
    static Logger LOGGER = LoggerFactory.getLogger(AbstractClassDiagramProfileImpl.class);
    static {
        try {
            ensureVfsUriHandlerPresent();
            UMLPackageImpl.init();
            UMLDIPackageImpl.init();
        } catch (Throwable t) {
            LOGGER.error("Could not initialize UML EMF", t);
        }
    }
    @Inject
    private DataModelerService dataModelerService;
    @Inject
    private KieProjectService projectService;
    @Inject
    RepositoryDescriptor repositoryDescriptor;
    @Inject
    Instance<HttpServletRequest> request;

    @Inject
    @ProfileName("ucd")
    ClassDiagramFormBuilder classDiagramFormBuilder;

    public AbstractClassDiagramProfileImpl() {
    }

    @Override
    public IEmfBasedFormBuilder getFormBuilder() {
        return classDiagramFormBuilder;
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

        getCmmnTypes(resourceSet);
    }

    @Override
    public Map<String, Object> buildDefaultResourceOptions() {
        Map<String, Object> options = super.buildDefaultResourceOptions();
        return options;
    }

    public static Package getCmmnTypes(ResourceSet resourceSet) {
        URI uri = URI.createURI(CMMNTYPES_PATHMAP);
        for (Resource resource : resourceSet.getResources()) {
            if (resource.getURI().equals(uri)) {
                return (Package) resource.getContents().get(0);
            }
        }
        for (EPackage ePackage : ddPackages(UMLPackage.eINSTANCE, UMLDIPackage.eINSTANCE)) {
            resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        }
        resourceSet.getPackageRegistry().put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/5.0.0/UML", UMLPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
        mapClassPathResource(resourceSet, uri, "/libraries/cmmntypes.uml");
        return (Package) resourceSet.getResource(uri, true).getContents().get(0);
    }

    private static URL mapClassPathResource(ResourceSet resourceSet, URI uri, String resourcePath) {
        URL url = UMLDiagram.class.getResource(resourcePath);
        String externalForm = url.toExternalForm();
        try {
            //Hack for wildfly's VFS
            //TODO find a better way to do this
            InputStream openStream = url.openStream();
            Field this$0 = openStream.getClass().getDeclaredField("this$0");
            this$0.setAccessible(true);
            ZipFile zf = (ZipFile) this$0.get(openStream);
            String jarUri = "jar:file:" + zf.getName() +"!" + resourcePath;
            externalForm =new URL(jarUri).toExternalForm();
        } catch (Throwable t) {
            LOGGER.warn("Could not calculate jar file path", t);
        }
        URI cmmnTypesUri = URI.createURI(externalForm.replace("jar:", "archive:").replace("vfs:", "archive:file:").replace(".jar/", ".jar!/"));
        resourceSet.getURIConverter().getURIMap().put(uri, cmmnTypesUri);
        String[] languages = { "java", "js" };
        for (String l : languages) {
            resourceSet.getURIConverter().getURIMap().put(mappingsUriForLanguage(uri, l), mappingsUriForLanguage(cmmnTypesUri, l));
        }
        return url;
    }

    private static URI mappingsUriForLanguage(URI uri, String l) {
        return uri.trimFileExtension().appendFileExtension("mappings").appendFileExtension(l);
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
        return new GenericJsonToEmfDiagramMarshaller(this, uri);
    }

    private void generateDataModel(XMLResource r) {
        if (dataModelerService != null) {
            String uuid = Utils.getEncodedParam(request.get(), "assetid");
            ClassDiagram2DataModel c = new ClassDiagram2DataModel(dataModelerService.getAnnotationDefinitions(),r, uuid);
            DataModel dm = c.toDataModel();
            // The price we pay for not using errai
            RpcContext.set(new FakeMessage());
            Path newPath = PathFactory.newPath(c.getProjectName(), repositoryDescriptor.getRepositoryRoot().toString() + c.getProjectName());
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
    public String getFormId(XMLResource resource, String classId, String formType) {
        return ((Class) resource.getEObject(classId)).getName();
    }
}
