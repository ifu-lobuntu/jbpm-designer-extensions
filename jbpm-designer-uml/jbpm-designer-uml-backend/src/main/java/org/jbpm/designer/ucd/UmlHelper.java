package org.jbpm.designer.ucd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Package;

public class UmlHelper {

    public static Package findPackageIn(Resource eResource) {
        Package pkg = null;
        for (EObject eo : eResource.getContents()) {
            if (eo instanceof Package) {
                pkg = (Package) eo;
                break;
            }
        }
        return pkg;
    }

}
