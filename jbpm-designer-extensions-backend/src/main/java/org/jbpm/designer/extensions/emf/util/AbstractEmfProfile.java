package org.jbpm.designer.extensions.emf.util;

import java.io.IOException;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.designer.repository.Repository;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.di.DIPackage;
import org.uberfire.backend.vfs.VFSService;

public abstract class AbstractEmfProfile implements IEmfProfile {
    @Inject
    private Repository repository;

    @Inject
    protected VFSService vfsServices;

    private URIHandler uriHandler;

    @Inject
    @Any
    Instance<IEmfProfile> otherProfiles;
    public EStructuralFeature demandFeature(String name){
        return null;
    }
    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(getSerializedModelExtension(), getResourceFactory());
        for (EPackage ePackage : getEPackages()) {
            resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        }
        UriHelper.setPlatformUriHandler(resourceSet, getUriHandler());
    }
    protected EPackage[] ddPackages(EPackage ... p ){
        EPackage[] result = new EPackage[p.length+3];
        int i=0;
        result[i++]=DIPackage.eINSTANCE;
        result[i++]=DCPackage.eINSTANCE;
        result[i++]=JBPMDDPackage.eINSTANCE;
        for (EPackage ePackage : p) {
            result[i++]=ePackage;
        }
        return result;
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
