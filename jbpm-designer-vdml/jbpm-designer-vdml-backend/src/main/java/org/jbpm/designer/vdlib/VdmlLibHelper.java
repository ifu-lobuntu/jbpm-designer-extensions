package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.ucd.UmlHelper;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class VdmlLibHelper {

    public static Class findOrCreateBusinessItemDefinitionClass(String name, ValueDeliveryModel vdm) {
        Class cls = null;
        BusinessItemDefinition bid = null;
        Package pkg = UmlHelper.findPackageIn(vdm.eResource());
        BusinessItemLibrary bil = VdmlLibraryJsonToEmfHelper.findOrCreateBusinessItemLibrary(pkg, vdm);
        for (BusinessItemLibraryElement bile : bil.getBusinessItemLibraryElement()) {
            if (bile instanceof BusinessItemDefinition && bile.getName().equals(name)) {
                bid = (BusinessItemDefinition) bile;
                break;
            }
        }
        if (bid == null) {
            bid = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
            bid.setName(name);
            vdm.getBusinessItemLibrary().get(0).getBusinessItemLibraryElement().add(bid);
            cls = UMLFactory.eINSTANCE.createClass();
            cls.setName(bid.getName());
            pkg.getOwnedTypes().add(cls);
            cls.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(bid);
        } else {
            Class ownedType = findClassFor(bid, pkg);
            cls = (Class) ownedType;
        }
        return cls;
    }

    public static Class findClassFor(VdmlElement bid, Package pkg) {
        Class ownedType = (Class) pkg.getOwnedType(bid.getName());
        // First try by name
        if (ownedType == null) {
            // Names out of sync - probably a bug
            EList<Type> ownedTypes = pkg.getOwnedTypes();
            for (Type type : ownedTypes) {
                EAnnotation ean = type.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
                if (ean != null && ean.getReferences().size() > 0 && bid.eClass().isInstance(ean.getReferences().get(0))) {
                    VdmlElement bid2 = (VdmlElement) ean.getReferences().get(0);
                    if (bid2.equals(bid)) {
                        ownedType = (Class) type;
                    }
                }
            }
        }
        return ownedType;
    }

}
