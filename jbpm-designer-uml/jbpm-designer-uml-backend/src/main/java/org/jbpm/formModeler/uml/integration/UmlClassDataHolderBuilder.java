/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.formModeler.uml.integration;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.core.config.builders.dataHolder.PojoDataHolderBuilder;
import org.jbpm.formModeler.core.config.builders.dataHolder.RangedDataHolderBuilder;
import org.jbpm.formModeler.uml.model.UmlClassDataHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.backend.vfs.Path;
import org.uberfire.io.IOService;

@ApplicationScoped
public class UmlClassDataHolderBuilder implements RangedDataHolderBuilder {

    public static final String HOLDER_TYPE_UML_CLASS = "umlClassEntry";
    private static final String[] POTENTIAL_PROFILES = { "ucd", "vdlib", "vdcm" };

    private Logger log = LoggerFactory.getLogger(UmlClassDataHolderBuilder.class);

    @Inject
    Event<PathEvent> event;

    @Inject
    @Any
    private Instance<IEmfDiagramProfile> profile;

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

    private IEmfDiagramProfile getOtherProfile(String name) {
        for (IEmfDiagramProfile p : profile) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    private Map<String, String> getThem(String path) {
        ResourceSet rst = aggregateResources(path);
        return collectClasses(rst);
    }

    protected Map<String, String> collectClasses(ResourceSet rst) {
        String[] elementTypes = { "Class" };
        Map<String, String> classInfo = new HashMap<String, String>();
        for (Resource resource : rst.getResources()) {
            TreeIterator<EObject> ti = resource.getContents().get(0).eAllContents();
            while (ti.hasNext()) {
                EObject eObject = (EObject) ti.next();
                for (String string : elementTypes) {
                    String className = eObject.eClass().getName();
                    if (className.equals(string)) {
                        String platformString = resource.getURI().toString();
                        classInfo.put(platformString + "#" + JBPMECoreHelper.getID(eObject),
                                (String) eObject.eGet(eObject.eClass().getEStructuralFeature("qualifiedName")));
                    }
                }
            }
        }
        return classInfo;
    }

    protected ResourceSet aggregateResources(String path) {
        String packageName = calculatePackageName(path);
        Set<IEmfDiagramProfile> profiles = collectProfiles();
        ResourceSet rst = new ResourceSetImpl();
        prepareResourceSet(rst, profiles);
        aggregateResources(rst, packageName, profiles);
        return rst;
    }

    protected String calculatePackageName(String path) {
        int indexOfRepoRoot = path.indexOf("/", path.indexOf("@"));
        int indexOfProjectRoot = path.indexOf("/", indexOfRepoRoot + 1);
        String packageName = path.substring(indexOfRepoRoot, indexOfProjectRoot);
        this.event.fire(new PathEvent(path));
        return packageName;
    }

    protected void aggregateResources(ResourceSet rst, String packageName, Set<IEmfDiagramProfile> profiles) {
        for (IEmfDiagramProfile p : profiles) {
            Collection<Asset> listAssetsRecursively = p.getRepository().listAssetsRecursively(packageName,
                    new FilterByExtension(p.getSerializedModelExtension()));
            for (Asset<?> asset : listAssetsRecursively) {
                String id = EMFVFSURIConverter.toPlatformRelativeString(asset.getUniqueId());
                org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(id, true);
                rst.getResource(uri, true);
            }
        }
    }

    protected void prepareResourceSet(ResourceSet rst, Set<IEmfDiagramProfile> profiles) {
        for (IEmfDiagramProfile p : profiles) {
            p.prepareResourceSet(rst);
        }
    }

    protected Set<IEmfDiagramProfile> collectProfiles() {
        Set<IEmfDiagramProfile> profiles=new HashSet<IEmfDiagramProfile>();
        for (String pn : POTENTIAL_PROFILES) {
            IEmfDiagramProfile p = getOtherProfile(pn);
            if (p != null) {
                profiles.add(p);
            }
        }
        return profiles;
    }

    @Override
    public DataHolder buildDataHolder(DataHolderBuildConfig config) {
        UmlClassDataHolder dataHolder = null;

        boolean isExternal = false;

        String path = config.getAttribute("path");
        if (path == null || path.trim().isEmpty()) {
            dataHolder = new UmlClassDataHolder(config.getHolderId(), config.getInputId(), config.getOutputId(), config.getValue(), config.getRenderColor());
            isExternal = Boolean.TRUE.equals(config.getAttribute("supportedType"));
        } else {
            Class holderClass = getUmlClass(config);
            dataHolder = new UmlClassDataHolder(config.getHolderId(), config.getInputId(), config.getOutputId(), holderClass, config.getRenderColor());
        }

        if (isExternal) {
            dataHolder.setSupportedType(PojoDataHolderBuilder.HOLDER_TYPE_POJO_CLASSNAME);
        }
        return dataHolder;
    }

    private Class getUmlClass(DataHolderBuildConfig config) {
        event.fire(new PathEvent(config.getAttribute("path")));
        return getUmlClass(config.getValue());
    }

    private Class getUmlClass(String value) {
        ResourceSet rst = new ResourceSetImpl();
        prepareResourceSet(rst, collectProfiles());
        Class holderClass = (Class) rst.getEObject(org.eclipse.emf.common.util.URI.createURI(value, true), true);
        EcoreUtil.resolveAll(holderClass);
        if (holderClass == null) {
            return null;
        }
        return holderClass;
    }

    @Override
    public String getId() {
        return HOLDER_TYPE_UML_CLASS;
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
        return getUmlClass(className) != null;
    }

    @Override
    public int getPriority() {
        return 123123321;
    }

    @Override
    public String[] getSupportedHolderTypes() {
        return new String[] { PojoDataHolderBuilder.HOLDER_TYPE_POJO_CLASSNAME, HOLDER_TYPE_UML_CLASS };
    }

    @Override
    public String getDataHolderName(Locale locale) {
        return "UML Class Holder";
        // ResourceBundle bundle =
        // ResourceBundle.getBundle("org.jbpm.formModeler.dataModeler.messages",
        // locale);
        // return bundle.getString("dataHolder_dataModeler");
    }
}
