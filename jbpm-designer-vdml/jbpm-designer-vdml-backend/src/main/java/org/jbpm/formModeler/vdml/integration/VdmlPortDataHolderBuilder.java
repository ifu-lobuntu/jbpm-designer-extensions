package org.jbpm.formModeler.vdml.integration;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.designer.vdan.VdmlActivityNetworkProfileImpl;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.core.config.builders.dataHolder.PojoDataHolderBuilder;
import org.jbpm.formModeler.core.config.builders.dataHolder.RangedDataHolderBuilder;
import org.jbpm.formModeler.vdml.model.VdmlPortDataHolder;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.backend.vfs.Path;
import org.uberfire.io.IOService;

@ApplicationScoped
public class VdmlPortDataHolderBuilder implements RangedDataHolderBuilder {

    public static final String HOLDER_TYPE_VDML_PORT = "vdmlPortEntry";

    private Logger log = LoggerFactory.getLogger(VdmlPortDataHolderBuilder.class);

    @Inject
    Event<PathEvent> event;

    @Inject
    private VdmlActivityNetworkProfileImpl profile;

    @Inject
    @Named("ioStrategy")
    private IOService ioService;

    @Override
    public Map<String, String> getHolderSources(String path) {
        Map<String, String> result = new TreeMap<String, String>();
        try {
            return getThem(path);
        } catch (Throwable e) {
            e.printStackTrace();
            result.put("-", "-");
        }
        return result;
    }

    private Map<String, String> getThem(String path) {
        String[] elementTypes = { "InputPort","OutputPort" };
        IEmfProfile targetDiagramProfile = profile;
        ResourceSet rst = new ResourceSetImpl();
        targetDiagramProfile.prepareResourceSet(rst);
        UriHelper.setPlatformUriHandler(rst, targetDiagramProfile.getUriHandler());

        int indexOfRepoRoot = path.indexOf("/", path.indexOf("@"));
        int indexOfProjectRoot = path.indexOf("/", indexOfRepoRoot + 1);
        String packageName = path.substring(indexOfRepoRoot, indexOfProjectRoot);
        this.event.fire(new PathEvent(path));
        Collection<Asset> listAssetsRecursively = profile.getRepository().listAssetsRecursively(packageName,
                new FilterByExtension(targetDiagramProfile.getSerializedModelExtension()));
        for (Asset<?> asset : listAssetsRecursively) {
            String id = EMFVFSURIConverter.toPlatformRelativeString(asset.getUniqueId());
            org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(id, true);
            EcoreUtil.resolveAll(rst.getResource(uri, true));
        }
        Map<String, String> portInfo = new HashMap<String, String>();
        for (Resource resource : new ArrayList<Resource>(rst.getResources())) {
            TreeIterator<EObject> ti = resource.getAllContents();
            while (ti.hasNext()) {
                EObject eObject = (EObject) ti.next();
                for (String string : elementTypes) {
                    String className = eObject.eClass().getName();
                    if (className.equals(string)) {
                        String platformString = resource.getURI().toString();
                        portInfo.put(platformString + "#" + ((XMLResource) resource).getID(eObject),
                                (String) eObject.eGet(eObject.eClass().getEStructuralFeature("qualifiedName")));
                    }
                }
            }
        }
        return portInfo;
    }

    @Override
    public DataHolder buildDataHolder(DataHolderBuildConfig config) {
        VdmlPortDataHolder dataHolder = null;

        boolean isExternal = false;

        String path = config.getAttribute("path");
        if (path == null || path.trim().isEmpty()) {
            dataHolder = new VdmlPortDataHolder(config.getHolderId(), config.getInputId(), config.getOutputId(), config.getValue(), config.getRenderColor());
            isExternal = Boolean.TRUE.equals(config.getAttribute("supportedType"));
        } else {
            Port holderPort = getVdmlPort(config);
            dataHolder = new VdmlPortDataHolder(config.getHolderId(), config.getInputId(), config.getOutputId(), holderPort, config.getRenderColor());
        }

        if (isExternal) {
            dataHolder.setSupportedType(PojoDataHolderBuilder.HOLDER_TYPE_POJO_CLASSNAME);
        }
        return dataHolder;
    }

    private Port getVdmlPort(DataHolderBuildConfig config) {
        event.fire(new PathEvent(config.getAttribute("path")));
        return getVdmlPort(config.getValue());
    }

    private Port getVdmlPort(String value) {
        ResourceSet rst = new ResourceSetImpl();
        profile.prepareResourceSet(rst);
        Port holderPort = (Port) rst.getEObject(org.eclipse.emf.common.util.URI.createURI(value, true), true);
        EcoreUtil.resolveAll(holderPort);
        if(holderPort instanceof InputPort){
            InputPort ip = (InputPort) holderPort;
            EcoreUtil.resolveAll(ip.getInput().getProvider());
            EcoreUtil.resolveAll(ip.getInput());
        }else{
            OutputPort ip = (OutputPort) holderPort;
            EcoreUtil.resolveAll(ip.getOutput().getRecipient());
            EcoreUtil.resolveAll(ip.getOutput());
        }
        if (holderPort == null) {
            return null;
        }
        return holderPort;
    }

    @Override
    public String getId() {
        return HOLDER_TYPE_VDML_PORT;
    }

    protected Path getPath(String path) {
        try {
            return Paths.convert(ioService.get(new URI(path)));
        } catch (Exception e) {
            log.error("Unable to build Path for {}': {}", path, e);
        }
        return null;
    }

    @Override
    public boolean supportsPropertyType(String className, String path) {
        return getVdmlPort(className) != null;
    }

    @Override
    public int getPriority() {
        return 1234;
    }

    @Override
    public String[] getSupportedHolderTypes() {
        return new String[] { PojoDataHolderBuilder.HOLDER_TYPE_POJO_CLASSNAME, HOLDER_TYPE_VDML_PORT };
    }

    @Override
    public String getDataHolderName(Locale locale) {
        return "VDML Port Holder";
        // ResourceBundle bundle =
        // ResourceBundle.getBundle("org.jbpm.formModeler.dataModeler.messages",
        // locale);
        // return bundle.getString("dataHolder_dataModeler");
    }
}
