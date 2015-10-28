package org.jbpm.designer.vdml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.ucd.UmlHelper;
import org.jbpm.designer.vdlib.VdmlLibraryStencil;
import org.omg.smm.Characteristic;
import org.omg.vdml.*;

public class VdmlUmlHelper {
    public static VdmlElement getLinkedVdmlElement(Element e) {
        EAnnotation eAnnotation = e.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (eAnnotation != null && eAnnotation.getReferences().size() > 0) {
            return (VdmlElement) eAnnotation.getReferences().get(0);
        }
        return null;
    }

    public static Class findOrCreateBusinessItemDefinitionClass(String name, ValueDeliveryModel vdm) {
        Class cls = null;
        BusinessItemDefinition bid = null;
        Package pkg = UmlHelper.findPackageIn(vdm.eResource());
        BusinessItemLibrary bil = findOrCreateBusinessItemLibrary(pkg, vdm);
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
            cls= findClassFor(bid, pkg);
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

    public static BusinessItemLibrary findOrCreateBusinessItemLibrary(Package pkg, ValueDeliveryModel vdm) {
        for (BusinessItemLibrary bil : vdm.getBusinessItemLibrary()) {
            return bil;
        }
        BusinessItemLibrary bil = VDMLFactory.eINSTANCE.createBusinessItemLibrary();
        bil.setId(((XMLResource) vdm.eResource()).getID(pkg) + "bil");
        vdm.getBusinessItemLibrary().add(bil);
        bil.setName(pkg.getName());
        return bil;
    }

    public static StoreLibrary findOrCreateStoreLibrary(Package pkg, ValueDeliveryModel vdm) {
        for (StoreLibrary bil : vdm.getStoreLibrary()) {
            return bil;
        }
        StoreLibrary bil = VDMLFactory.eINSTANCE.createStoreLibrary();
        bil.setId(((XMLResource) vdm.eResource()).getID(pkg) + "bil");
        vdm.getStoreLibrary().add(bil);
        bil.setName(pkg.getName());
        return bil;
    }

    public static CapabilityLibrary findOrCreateCapabilityLibrary(Package pkg, ValueDeliveryModel vdm) {
        XMLResource resource = (XMLResource) pkg.eResource();
        for (CapabilityLibrary cl : vdm.getCapabilitylibrary()) {
            return cl;
        }
        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        cl.setId(resource.getID(pkg) + "cl");
        vdm.getCapabilitylibrary().add(cl);
        cl.setName(pkg.getName());
        return cl;
    }

    public static ValueDeliveryModel findOrcreateValueDeliveryModel(Package pkg) {
        XMLResource resource = (XMLResource) pkg.eResource();
        for (EObject eo : resource.getContents()) {
            if (eo instanceof ValueDeliveryModel) {
                return (ValueDeliveryModel) eo;
            }
        }
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.setId(resource.getID(pkg) + "vdm");
        resource.getContents().add(vdm);
        return vdm;
    }

    public static BusinessItemDefinition createBusinessDefinition(Class clss, BusinessItemLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getBusinessItemDefinition(), library.getBusinessItemLibraryElement());
    }

    public static BusinessItemCategory createBusinessCategory(Class clss, BusinessItemLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getBusinessItemCategory(), library.getBusinessItemLibraryElement());
    }

    public static CapabilityDefinition createCapabilityDefinition(Class clss, CapabilityLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getCapabilityDefinition(), library.getCapability());
    }

    public static PoolDefinition createPoolDefinition(Class clss, StoreLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getPoolDefinition(), library.getStoreLibraryElement());
    }

    public static StoreCategory createStoreCategory(Class clss, StoreLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getStoreCategory(), library.getStoreLibraryElement());
    }

    public static CapabilityCategory createCapabilityCategory(Class clss, CapabilityLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getCapabilityCategory(), library.getCapability());
    }

    public static <T extends VdmlElement> T createStoreDefinition(Class clss, StoreLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getStoreDefinition(), library.getStoreLibraryElement());
    }

    public static <T extends VdmlElement> T findOrCreateReference(Class clss, EClass eCls, EList list) {
        EAnnotation annotation = forceGetAnnotation(clss);
        for (EObject eObject : annotation.getReferences()) {
            if (eCls.isInstance(eObject)) {
                ((VdmlElement) eObject).setName(clss.getName());
                return (T) eObject;
            }
        }
        for (Object o : list) {
            if (o instanceof VdmlElement && ((VdmlElement) o).getName().equals(clss.getName())) {
                annotation.getReferences().add((VdmlElement) o);
                return (T) o;
            }
        }
        T cd = (T) VDMLFactory.eINSTANCE.create(eCls);
        cd.setName(clss.getName());
        list.add(cd);
        if (JBPMECoreHelper.getID(clss) == null) {
            ((XMLResource) clss.eResource()).setID(clss, EcoreUtil.generateUUID());
        }
        cd.setId(((XMLResource) clss.eResource()).getID(clss) + eCls.getName());
        annotation.getReferences().add(cd);
        return cd;
    }

    public static EAnnotation forceGetAnnotation(Element clss) {
        EAnnotation a = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (a == null) {
            a = clss.createEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        }
        return a;
    }

    public static VdmlElement getVdmlElement(Classifier cls) {
        VdmlElement parentObject = null;
        EAnnotation ann = cls.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (ann != null && ann.getReferences().size() == 1) {
            parentObject = (VdmlElement) ann.getReferences().get(0);
        }
        return parentObject;
    }

    public static Characteristic getCharacteristic(Property property) {
        Characteristic characteristicDef = null;
        if (property.getEAnnotation(VdmlLibraryStencil.VDLIB_URI) != null) {
            EAnnotation ann = property.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if (ann.getReferences().size() > 0 && ann.getReferences().get(0) instanceof Characteristic) {
                characteristicDef = (Characteristic) ann.getReferences().get(0);
            }
        }
        return characteristicDef;
    }

    public static Scenario findOrCreateDefaultScenario(ValueDeliveryModel vdm) {
        if(vdm.getScenario().isEmpty()){
            vdm.getScenario().add(VDMLFactory.eINSTANCE.createScenario());
            vdm.getScenario().get(0).setName("default");
            vdm.getScenario().get(0).setIsCommon(true);
        }
        return vdm.getScenario().get(0);
    }
}
