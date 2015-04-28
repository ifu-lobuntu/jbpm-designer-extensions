package org.jbpm.designer.extensions.impl;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.extensions.emf.util.VFSURIHandler;
import org.jbpm.designer.repository.Repository;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.vfs.VFSService;

public abstract class AbstractEmfProfile implements IEmfProfile {
    @Inject
    private Repository repository;

    @Inject
    protected VFSService vfsServices;

    private URIHandler uriHandler;
    static Logger LOGGER = LoggerFactory.getLogger(AbstractEmfProfile.class);

    protected static void ensureVfsUriHandlerPresent() {
        try {
            Resource d = new ResourceImpl() {
                // Jeez!!!!
                {
                    EList<URIHandler> uriHandlers = getDefaultURIConverter().getURIHandlers();
                    boolean found = false;
                    for (URIHandler uriHandler : uriHandlers) {
                        if (uriHandler instanceof VfsArchiveURIHandler) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        uriHandlers.add(new VfsArchiveURIHandler());
                    }
                }
            };
        } catch (Throwable t) {
            LOGGER.error("Could not add VFS Archive URI Handler", t);
        }
    }

    @Inject
    @Any
    Instance<IEmfProfile> otherProfiles;

    public EStructuralFeature demandFeature(String name) {
        return null;
    }

    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        EList<Adapter> eAdapters = resourceSet.eAdapters();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(getSerializedModelExtension(), getResourceFactory());
        for (EPackage ePackage : getEPackages()) {
            resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        }
        UriHelper.setPlatformUriHandler(resourceSet, getUriHandler());
    }

    protected static EPackage[] ddPackages(EPackage... p) {
        EPackage[] result = new EPackage[p.length + 3];
        int i = 0;
        result[i++] = DIPackage.eINSTANCE;
        result[i++] = DCPackage.eINSTANCE;
        result[i++] = JBPMDDPackage.eINSTANCE;
        for (EPackage ePackage : p) {
            result[i++] = ePackage;
        }
        return result;
    }

    public DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new DefaultPotentialReferenceHelper(this);
    }

    @Override
    public boolean useIdAttribute() {
        return true;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public URIHandler getUriHandler() {
        if (uriHandler == null) {
            uriHandler = new VFSURIHandler(repository);
        }
        return uriHandler;
    }

    public void setUriHandler(URIHandler uriHandler) {
        this.uriHandler = uriHandler;
    }

    public IEmfProfile getOtherProfile(String string) {
        if (otherProfiles != null) {
            for (IEmfProfile e : otherProfiles) {
                if (e.getName().equals(string)) {
                    return e;
                }
            }
        }
        return null;
    }
}
