package org.jbpm.designer.extensions.emf.util;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;

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

}
