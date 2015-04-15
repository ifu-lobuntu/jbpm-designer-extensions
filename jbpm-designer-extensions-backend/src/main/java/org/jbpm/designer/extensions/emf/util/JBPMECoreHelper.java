package org.jbpm.designer.extensions.emf.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class JBPMECoreHelper {
    /**
     * nb!!!! USE only when absolutely necessary The ID may not be unique.
     * Nothing in ECore guarantees uniqueness across resources, although
     * generally it is
     * 
     * @param rst
     * @param id
     * @return
     */
    public static EObject findEObject(ResourceSet rst, String id) {
        EList<Resource> resources = rst.getResources();
        for (Resource resource : resources) {
            EObject eObject = resource.getEObject(id);
            if (eObject != null) {
                return eObject;
            }
        }
        return null;
    }
}
