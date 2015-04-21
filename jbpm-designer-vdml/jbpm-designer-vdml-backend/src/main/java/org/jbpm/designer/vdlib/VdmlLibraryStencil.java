package org.jbpm.designer.vdlib;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;

public enum VdmlLibraryStencil implements VdmlStencilInfo {
    BUSINESS_ITEM_DEFINITION(VDMLPackage.eINSTANCE.getBusinessItemDefinition(), ClassDiagramStencil.CLASS, "BusinessItemDefinition", false),
    BUSINESS_ITEM_CATEGORY(VDMLPackage.eINSTANCE.getBusinessItemCategory(), ClassDiagramStencil.CLASS, "BusinessItemCategory", false),
    CAPABILITY_CATEGORY(VDMLPackage.eINSTANCE.getCapabilityCategory(), ClassDiagramStencil.CLASS, "CapabilityCategory", false),
    CAPABILITY_DEFINITION(VDMLPackage.eINSTANCE.getCapabilityDefinition(), ClassDiagramStencil.CLASS, "CapabilityDefinition", false),
    ROLE_DEFINITION(VDMLPackage.eINSTANCE.getRoleDefinition(), ClassDiagramStencil.CLASS, "RoleDefinition", false),
    ROLE_CATEGORY(VDMLPackage.eINSTANCE.getRoleCategory(), ClassDiagramStencil.CLASS, "RoleCategory", false),
    VALUE_DEFINITION(VDMLPackage.eINSTANCE.getValueDefinition(), ClassDiagramStencil.CLASS, "ValueDefinition", false),
    VALUE_CATEGORY(VDMLPackage.eINSTANCE.getValueCategory(), ClassDiagramStencil.CLASS, "ValueCategory", false),
    ACTOR(VDMLPackage.eINSTANCE.getActor(), ClassDiagramStencil.CLASS, "Actor", false),
    IMPORTED_BUSINESS_ITEM_DEFINITION(VDMLPackage.eINSTANCE.getBusinessItemDefinition(), ClassDiagramStencil.CLASS, "ImportedBusinessItemDefinition", true),
    IMPORTED_BUSINESS_ITEM_CATEGORY(VDMLPackage.eINSTANCE.getBusinessItemCategory(), ClassDiagramStencil.CLASS, "ImportedBusinessItemCategory", true),
    IMPORTED_CAPABILITY_CATEGORY(VDMLPackage.eINSTANCE.getCapabilityCategory(), ClassDiagramStencil.CLASS, "ImportedCapabilityCategory", true),
    IMPORTED_CAPABILITY_DEFINITION(VDMLPackage.eINSTANCE.getCapabilityDefinition(), ClassDiagramStencil.CLASS, "ImportedCapabilityDefinition", true),
    IMPORTED_ACTOR(VDMLPackage.eINSTANCE.getActor(), ClassDiagramStencil.CLASS, "Actor", true),
    IMPORTED_ROLE_DEFINITION(VDMLPackage.eINSTANCE.getRoleDefinition(), ClassDiagramStencil.CLASS, "ImportedRoleDefinition", true),
    IMPORTED_ROLE_CATEGORY(VDMLPackage.eINSTANCE.getRoleCategory(), ClassDiagramStencil.CLASS, "ImportedRoleCategory", true),
    IMPORTED_VALUE_DEFINITION(VDMLPackage.eINSTANCE.getValueDefinition(), ClassDiagramStencil.CLASS, "ImportedValueDefinition", true),
    IMPORTED_VALUE_CATEGORY(VDMLPackage.eINSTANCE.getValueCategory(), ClassDiagramStencil.CLASS, "ImportedValueCategory", true),
    STORE(VDMLPackage.eINSTANCE.getStore(), ClassDiagramStencil.CLASS, "Store", false),
    POOL(VDMLPackage.eINSTANCE.getPool(), ClassDiagramStencil.CLASS, "Pool", false),
    ORG_UNIT(VDMLPackage.eINSTANCE.getOrgUnit(), ClassDiagramStencil.CLASS, "OrgUnit", false),
    CAPABILITY_OFFER(VDMLPackage.eINSTANCE.getCapabilityOffer(), ClassDiagramStencil.CLASS, "CapabilityOffer", false),
    EXTERNAL_STORE(VDMLPackage.eINSTANCE.getStore(), ClassDiagramStencil.CLASS, "ExternalStore", true),
    EXTERNAL_POOL(VDMLPackage.eINSTANCE.getPool(), ClassDiagramStencil.CLASS, "ExternalPool", true),
    EXTERNAL_ORG_UNIT(VDMLPackage.eINSTANCE.getOrgUnit(), ClassDiagramStencil.CLASS, "ExternalOrgUnit", true),
    EXTERNAL_CAPABILITY_OFFER(VDMLPackage.eINSTANCE.getCapabilityOffer(), ClassDiagramStencil.CLASS, "ExternalCapabilityOffer", true),
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
