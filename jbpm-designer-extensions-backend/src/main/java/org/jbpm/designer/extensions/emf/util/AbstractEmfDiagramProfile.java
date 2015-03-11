package org.jbpm.designer.extensions.emf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jboss.errai.security.shared.api.identity.User;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencilSet;
import org.jbpm.designer.extensions.stencilset.linkage.StencilSet;
import org.jbpm.designer.notification.DesignerNotificationEvent;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.UriUtils;
import org.jbpm.designer.util.ConfigurationProvider;
import org.jbpm.designer.web.plugin.IDiagramPlugin;
import org.jbpm.designer.web.plugin.impl.PluginServiceImpl;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.VFSService;
import org.uberfire.workbench.events.NotificationEvent;
import org.uberfire.workbench.type.ResourceTypeDefinition;

/**
 *
 */
public abstract class AbstractEmfDiagramProfile implements IEmfDiagramProfile, IDiagramProfile {

    static Logger _logger = LoggerFactory.getLogger(AbstractEmfDiagramProfile.class);

    private Map<String, IDiagramPlugin> _plugins = new LinkedHashMap<String, IDiagramPlugin>();

    private String _stencilSet;
    private String _localHistoryEnabled;
    private String _localHistoryTimeout;
    private boolean initializeLocalPlugins;
    private String _storeSVGonSaveOption;

    @Inject
    private Repository repository;

    @Inject
    private VFSService vfsServices;

    @Inject
    Event<DesignerNotificationEvent> notification;
    @Inject
    User user;
    URIHandler uriHandler;

    @Inject
    @Any
    Instance<IEmfDiagramProfile> otherProfiles;

    private LinkedStencilSet stencilSetValidator;

    private File stencilSetDefinitionfile;
    private long filesLastRead;

    private File profileXmlFile;

    private Map<String, IDiagramPlugin> registry;

    public AbstractEmfDiagramProfile() {
    }

    public abstract String getStencilSetPath();

    protected abstract ResourceTypeDefinition getResourceTypeDefinition();


    @Override
    public boolean useIdAttribute() {
        return true;
    }

    @Override
    public String getModelStub() {
        ResourceSetImpl rst = new ResourceSetImpl();
        prepareResourceSet(rst);
        XMLResource rs = (XMLResource) rst.createResource(URI.createURI("file:///dummy." + getSerializedModelExtension()));
        populateModelStub(rs);
        StringWriter sw = new StringWriter();
        try {
            rs.save(sw, new HashMap<String, Object>());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sw.toString();
    }

    protected abstract void populateModelStub(XMLResource rs);

    public String getSerializedModelExtension() {
        return getResourceTypeDefinition().getSuffix();
    }

    public void loadLinkedStencilSet(String realPath) {
        this.stencilSetDefinitionfile = new File(realPath);
        reloadStencilSetDefinitionFile();
        stencilSetValidator.validateSupportingFiles(this.stencilSetDefinitionfile.getParentFile());
    }

    private void reloadStencilSetDefinitionFile() {
        try {
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            StencilSet stencilSet = om.readValue(stencilSetDefinitionfile, StencilSet.class);
            this.stencilSetValidator = new LinkedStencilSet(stencilSet);
            this.stencilSetValidator.validateStencilSet();
            for (LinkedStencil ls : this.stencilSetValidator.getLinkedStencils()) {
                for (LinkedProperty lp : ls.getProperties().values()) {
                    if (lp.getProperty().getReference() != null) {
                        lp.init(getEPackages());
                    }
                }
            }
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getStencilSet() {
        return _stencilSet;
    }

    public Collection<String> getStencilSetExtensions() {
        return Collections.emptyList();
    }

    public Collection<String> getPlugins() {
        checkFiles();
        return Collections.unmodifiableCollection(_plugins.keySet());
    }

    private void checkFiles() throws FactoryConfigurationError {
        if (filesLastRead < profileXmlFile.lastModified()) {
            _plugins=new LinkedHashMap<String, IDiagramPlugin>();
            filesLastRead = System.currentTimeMillis();
            initializeLocalPlugins();
            reloadStencilSetDefinitionFile();
        }
    }

    public void initializeLocalPlugins(String string) {
        this.profileXmlFile = new File(string);
        initializeLocalPlugins();
    }

    private void initializeLocalPlugins() throws FactoryConfigurationError {
        FileInputStream fileStream = null;
        try {
             fileStream = new FileInputStream(profileXmlFile);
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(fileStream, "UTF-8");
            while (reader.hasNext()) {
                if (reader.next() == XMLStreamReader.START_ELEMENT) {
                    if ("profile".equals(reader.getLocalName())) {
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            if ("stencilset".equals(reader.getAttributeLocalName(i))) {
                                _stencilSet = reader.getAttributeValue(i);
                            }
                        }
                    } else if ("plugin".equals(reader.getLocalName())) {
                        String name = null;
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            if ("name".equals(reader.getAttributeLocalName(i))) {
                                name = reader.getAttributeValue(i);
                            }
                        }
                        _plugins.put(name, registry.get(name));
                    } else if ("localhistory".equals(reader.getLocalName())) {
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            if ("enabled".equals(reader.getAttributeLocalName(i))) {
                                String localhistoryenabled = reader.getAttributeValue(i);
                                if (!isEmpty(localhistoryenabled)) {
                                    _localHistoryEnabled = localhistoryenabled;
                                } else {
                                    _logger.info("Invalid local history enabled");
                                }
                            }
                            if ("timeout".equals(reader.getAttributeLocalName(i))) {
                                String localhistorytimeout = reader.getAttributeValue(i);
                                if (!isEmpty(localhistorytimeout)) {
                                    _localHistoryTimeout = localhistorytimeout;
                                } else {
                                    _logger.info("Invalid local history timeout");
                                }
                            }
                        }
                    } else if ("storesvgonsave".equals(reader.getLocalName())) {
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            if ("enabled".equals(reader.getAttributeLocalName(i))) {
                                String storesvgonsaveenabled = reader.getAttributeValue(i);
                                if (!isEmpty(storesvgonsaveenabled)) {
                                    _storeSVGonSaveOption = storesvgonsaveenabled;
                                } else {
                                    _logger.info("Invalid store svg on save enabled");
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            _logger.error(e.getMessage(), e);
            throw new RuntimeException(e); // stop initialization
        } catch (XMLStreamException e) {
            _logger.error(e.getMessage(), e);
            throw new RuntimeException(e); // stop initialization
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public abstract String getProfileDefinitionFileName();

    public String getLocalHistoryEnabled() {
        return _localHistoryEnabled;
    }

    public String getLocalHistoryTimeout() {
        return _localHistoryTimeout;
    }

    @Override
    public String getStoreSVGonSaveOption() {
        return _storeSVGonSaveOption;
    }

    public Repository getRepository() {
        return repository;
    }

    @Override
    public void init(ServletContext context) {
        if (!initializeLocalPlugins) {
            this.registry = PluginServiceImpl.getLocalPluginsRegistry(context);

            initializeLocalPlugins(new StringBuilder(context.getRealPath("/")).append("/")
                    .append(ConfigurationProvider.getInstance().getDesignerContext()).append("profiles").append("/").append(getProfileDefinitionFileName())
                    .toString());
            String realPath = new StringBuilder(context.getRealPath("/")).append(ConfigurationProvider.getInstance().getDesignerContext())
                    .append(getStencilSetPath()).toString();
            loadLinkedStencilSet(realPath);
            initializeLocalPlugins = true;
        }
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public IDiagramMarshaller createMarshaller() {
        return new GenericJsonToEmfDiagramMarshaller(this);
    }

    public IDiagramUnmarshaller createUnmarshaller() {
        return new GenericEmfToJsonDiagramUnmarshaller(this);
    }

    @Override
    public String getRepositoryGlobalDir() {
        return "/global";
    }

    @Override
    public String getRepositoryGlobalDir(String uuid) {
        if (uuid != null) {
            Path uuidPath = vfsServices.get(UriUtils.encode(uuid));
            String pathURI = uuidPath.toURI();

            if (pathURI != "/") {
                String[] pathParts = pathURI.split("/");
                try {
                    String pathProjectName = pathParts[3];
                    if (pathProjectName.length() < 1) {
                        return "/global";
                    } else {
                        return "/" + pathProjectName + "/global";
                    }
                } catch (Exception e) {
                    return "/global";
                }
            }

            return "/global";
        }
        return "/global";
    }

    public Definitions getDefinitions(String xml) throws Exception {
        throw new RuntimeException("getDefinitions");
    }

    public String getStencilSetURL() {
        return ConfigurationProvider.getInstance().getDesignerContext() + getStencilSetPath();
    }

    public String getStencilSetExtensionURL() {
        return "http://oryx-editor.org/stencilsets/extensions/bpmncosts-2.0#";
    }

    private boolean isEmpty(final CharSequence str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0, length = str.length(); i < length; i++) {
            if (str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    @Override
    public void logInfo(String string) {
        System.out.println(string);
    }

    @Override
    public void fire(final String notification, final NotificationEvent.NotificationType type) {
        if (this.notification != null) {
            this.notification.fire(new DesignerNotificationEvent(notification, type, user.getIdentifier()));
        }
    }

    @Override
    public LinkedStencilSet getLinkedStencilSet() {
        checkFiles();
        return stencilSetValidator;
    }

    public URIHandler getUriHandler() {
        if (uriHandler == null) {
            uriHandler = new VFSUriHandler(repository);
        }
        return uriHandler;
    }

    public void setUriHandler(URIHandler uriHandler) {
        this.uriHandler = uriHandler;
    }

    @Override
    public boolean processRequest(HttpServletRequest req, HttpServletResponse resp, String action, String processId) throws IOException {
        return false;
    }

    public IEmfDiagramProfile getOtherProfile(String string) {
        if (otherProfiles != null) {
            for (IEmfDiagramProfile e : otherProfiles) {
                if (e.getName().equals(string)) {
                    return e;
                }
            }
        }
        return null;
    }
}
