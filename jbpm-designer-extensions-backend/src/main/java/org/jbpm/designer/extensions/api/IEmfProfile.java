package org.jbpm.designer.extensions.api;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.jbpm.designer.repository.Repository;

import java.util.Map;



public interface IEmfProfile {
    Resource.Factory getResourceFactory();

    EPackage[] getEPackages();

    String getSerializedModelExtension();

    void prepareResourceSet(ResourceSet resourceSet);

    boolean useIdAttribute();

    void setUriHandler(URIHandler handler);

    URIHandler getUriHandler();

    IEmfProfile getOtherProfile(String string);

    String getName();

    Map<String, Object> buildDefaultResourceOptions();

    Repository getRepository();

    IPotentialReferenceHelper createPotentialReferenceHelper();

}
