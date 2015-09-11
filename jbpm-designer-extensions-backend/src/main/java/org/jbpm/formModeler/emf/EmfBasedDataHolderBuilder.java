package org.jbpm.formModeler.emf;

import org.apache.commons.lang.NotImplementedException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.extensions.emf.util.VFSURIHandler;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.core.config.FieldTypeManager;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuilder;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.*;

public abstract class EmfBasedDataHolderBuilder<T extends EObject, X extends DataHolder> implements DataHolderBuilder {
    @Inject
    protected Event<PathEvent> event;
    @Inject
    protected Instance<IEmfProfile> profiles;

    protected abstract String[] getElementTypes();

    protected abstract X buildDataHolder(DataHolderBuildConfig config, T eObject);


    protected abstract String[] getProfiles();

    protected void loadEObject(T eObject) {
        EcoreUtil.resolveAll(eObject);
    }

    protected T getEObject(ResourceSet rst, String value) {
        return (T) rst.getEObject(URI.createPlatformResourceURI(value, true), true);
    }
    public boolean supportsPropertyType(String className, String path) {
        //TODO embed something in the string itself to see if this implementation can support it
        throw new RuntimeException();//Too costly. Only used by BPMNFOrmBuilderService
    }

    @Override
    public DataHolder buildDataHolder(DataHolderBuildConfig config) {
        String path = config.getAttribute("path");
        boolean isRuntime = path == null || path.trim().isEmpty();
        try {
            VFSURIHandler.setIsRuntime(isRuntime);
            if(!isRuntime){
                this.event.fire(new PathEvent(path));
            }
            ResourceSet rst = new ResourceSetImpl();
            for (IEmfProfile p : this.findProfiles()) {
                p.prepareResourceSet(rst);
            }
            T eObject = getEObject(rst, config.getValue());
            loadEObject(eObject);
            X result = buildDataHolder(config, eObject);
            result.setRenderColor(config.getRenderColor());
            result.setInputId(config.getInputId());
            result.setOutputId(config.getOutputId());
            return result;
        } finally {
            VFSURIHandler.unsetIsRuntime(isRuntime);
        }

    }

    public Map<String, String> getHolderSources(String path) {
        Map<String, String> result = new TreeMap<String, String>();
        try {
            Set<IEmfProfile> set = findProfiles();
            Map<String, String> holderSources = new HashMap<String, String>();
            ResourceSet rst = new ResourceSetImpl();
            for (IEmfProfile profile : set) {
                loadResources(path, rst, profile);
            }
            putHolderSourceInfo(holderSources, rst);
            return holderSources;
        } catch (Throwable e) {
            e.printStackTrace();
            result.put("-", "-");
        }
        return result;
    }


    private void putHolderSourceInfo(Map<String, String> holderSources, ResourceSet rst) {
        for (Resource resource : new ArrayList<Resource>(rst.getResources())) {
            TreeIterator<EObject> ti = resource.getAllContents();
            while (ti.hasNext()) {
                EObject eObject = ti.next();
                for (String string : getElementTypes()) {
                    if (eObject.eClass().getName().equals(string)) {
                        putHolderSourceInfo(holderSources, eObject);
                    }
                }
            }
        }
    }

    protected void putHolderSourceInfo(Map<String, String> portInfo, EObject eObject) {
        String platformString = eObject.eResource().getURI().toString();
        portInfo.put(platformString + "#" + JBPMECoreHelper.getID(eObject),
                (String) eObject.eGet(eObject.eClass().getEStructuralFeature("qualifiedName")));
    }

    private void loadResources(String path, ResourceSet rst, IEmfProfile profile) {
        profile.prepareResourceSet(rst);
        UriHelper.setPlatformUriHandler(rst, profile.getUriHandler());
        int indexOfRepoRoot = path.indexOf("/", path.indexOf("@"));
        int indexOfProjectRoot = path.indexOf("/", indexOfRepoRoot + 1);
        String packageName = path.substring(indexOfRepoRoot, indexOfProjectRoot);
        this.event.fire(new PathEvent(path));
        FilterByExtension filter = new FilterByExtension(profile.getSerializedModelExtension());
        Collection<Asset> listAssetsRecursively = profile.getRepository().listAssetsRecursively(packageName, filter);
        for (Asset<?> asset : listAssetsRecursively) {
            String id = EMFVFSURIConverter.toPlatformRelativeString(asset.getUniqueId());
            org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(id, true);
            EcoreUtil.resolveAll(rst.getResource(uri, true));
        }
    }


    private Set<IEmfProfile> findProfiles() {
        Set<IEmfProfile> set = new HashSet<IEmfProfile>();
        for (String s : getProfiles()) {
            for (IEmfProfile profile : this.profiles) {
                if (profile.getName().equals(s)) {
                    set.add(profile);
                }
            }
        }
        return set;
    }

}
