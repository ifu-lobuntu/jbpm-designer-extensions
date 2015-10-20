package org.jbpm.designer.vdlib;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;

import java.util.HashMap;
import java.util.Map;

public enum VdmlLibraryStencil implements VdmlStencilInfo {
    //BusinessItemDefinitions
    BUSINESS_ITEM_DEFINITION(VDMLPackage.eINSTANCE.getBusinessItemDefinition(), ClassDiagramStencil.CLASS, "BusinessItemDefinition", false),
    BUSINESS_ITEM_CATEGORY(VDMLPackage.eINSTANCE.getBusinessItemCategory(), ClassDiagramStencil.CLASS, "BusinessItemCategory", false),
    BUSINESS_ITEM_GENERALIZATION(null, ClassDiagramStencil.GENERALIZATION, "BusinessItemGeneralization", false),
    IMPORTED_BUSINESS_ITEM_DEFINITION(VDMLPackage.eINSTANCE.getBusinessItemDefinition(), ClassDiagramStencil.CLASS, "ImportedBusinessItemDefinition", true),
    IMPORTED_BUSINESS_ITEM_CATEGORY(VDMLPackage.eINSTANCE.getBusinessItemCategory(), ClassDiagramStencil.CLASS, "ImportedBusinessItemCategory", true),

    //CapabilityDefinitions
    CAPABILITY_CATEGORY(VDMLPackage.eINSTANCE.getCapabilityCategory(), ClassDiagramStencil.CLASS, "CapabilityCategory", false),
    CAPABILITY_DEFINITION(VDMLPackage.eINSTANCE.getCapabilityDefinition(), ClassDiagramStencil.CLASS, "CapabilityDefinition", false),
    CAPABILITY_GENERALIZATION(null, ClassDiagramStencil.GENERALIZATION, "CapabilityGeneralization", false),
    IMPORTED_CAPABILITY_CATEGORY(VDMLPackage.eINSTANCE.getCapabilityCategory(), ClassDiagramStencil.CLASS, "ImportedCapabilityCategory", true),
    IMPORTED_CAPABILITY_DEFINITION(VDMLPackage.eINSTANCE.getCapabilityDefinition(), ClassDiagramStencil.CLASS, "ImportedCapabilityDefinition", true),

    //StoreDefinitions
    POOL_DEFINITION(VDMLPackage.eINSTANCE.getPoolDefinition(), ClassDiagramStencil.CLASS, "PoolDefinition", false),
    STORE_DEFINITION(VDMLPackage.eINSTANCE.getStoreDefinition(), ClassDiagramStencil.CLASS, "StoreDefinition", false),
    STORE_GENERALIZATION(null, ClassDiagramStencil.GENERALIZATION, "StoreGeneralization", false),
    STORE_RESOURCE(null, ClassDiagramStencil.BI_DIRECTIONAL_ASSOCIATION, "StoreResource", false),
    IMPORTED_STORE_DEFINITION(VDMLPackage.eINSTANCE.getStoreDefinition(), ClassDiagramStencil.CLASS, "ImportedStoreDefinition", true),
    IMPORTED_POOL_DEFINITION(VDMLPackage.eINSTANCE.getPoolDefinition(), ClassDiagramStencil.CLASS, "ImportedPoolDefinition", true),

    //Characteristic
    CHARACTERISTIC_DEFINITION(null, ClassDiagramStencil.OWNED_ATTRIBUTE, "CharacteristicDefinition", false),
    CHARACTERISTIC(SMMPackage.eINSTANCE.getCharacteristic(), ClassDiagramStencil.PROPERTY, "Characteristic", true);

    private String stencilId;
    private ClassDiagramStencil baseStencil;
    private EClass vdmlClass;
    private boolean imported;
    private static Map<String, VdmlLibraryStencil> nameMap = new HashMap<String, VdmlLibraryStencil>();

    private VdmlLibraryStencil(EClass vdmlClass, ClassDiagramStencil baseStencil, String name, boolean imported) {
        this.baseStencil = baseStencil;
        this.vdmlClass = vdmlClass;
        this.stencilId = name;
        this.imported = imported;
    }

    public String getStencilId() {
        return stencilId;
    }

    static {
        for (VdmlLibraryStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }
    public static final String VDLIB_URI = VDMLPackage.eINSTANCE.getNsURI() + "/lib";

    public static VdmlLibraryStencil findStencilById(String stencilId) {
        VdmlLibraryStencil stencil = nameMap.get(stencilId);
        return stencil;
    }

    public ClassDiagramStencil getBaseStencil() {
        return baseStencil;
    }

    public EClass getVdmlClass() {
        return vdmlClass;
    }

    @Override
    public EClass getElementType() {
        return vdmlClass;
    }

    public static StencilInfo findStencilByElement(EObject me, DiagramElement de, boolean isImported) {
        if (me == null && de instanceof UMLCompartment) {
            for (VdmlLibraryStencil s : values()) {
                if (s.getStencilId().equalsIgnoreCase(((UMLCompartment) de).getFeatureName())) {
                    return s;
                }
            }
        } else {
            for (VdmlLibraryStencil s : values()) {
                if (s.imported == isImported && s.vdmlClass != null && s.vdmlClass.equals(me.eClass())) {
                    return s;
                }
            }
        }
        return null;
    }
}
