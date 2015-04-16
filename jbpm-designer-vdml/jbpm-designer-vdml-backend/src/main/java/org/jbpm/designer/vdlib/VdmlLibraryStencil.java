package org.jbpm.designer.vdlib;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;

public enum VdmlLibraryStencil implements VdmlStencilInfo {
    BUSINESS_ITEM_DEFINITION(VDMLPackage.eINSTANCE.getBusinessItemDefinition(), ClassDiagramStencil.CLASS, "BusinessItemDefinition"),
    CAPABILITY_CATEGORY(VDMLPackage.eINSTANCE.getCapabilityCategory(), ClassDiagramStencil.CLASS, "CapabilityCategory"),
    CAPABILITY_DEFINITION(VDMLPackage.eINSTANCE.getCapabilityDefinition(), ClassDiagramStencil.CLASS, "CapabilityDefinition"),
    IMPORTED_ORG_ELEMENT(VDMLPackage.eINSTANCE.getMeasurableElement(), ClassDiagramStencil.CLASS, "ImportedOrgElement"),
    CHARACTERISTIC_DEFINITION(null, ClassDiagramStencil.OWNED_ATTRIBUTE,
            "CharacteristicDefinition"),
    CHARACTERISTIC(SMMPackage.eINSTANCE.getCharacteristic(), ClassDiagramStencil.PROPERTY, "Characteristic");

    private String stencilId;
    private ClassDiagramStencil baseStencil;
    private EClass vdmlClass;
    private static Map<String, VdmlLibraryStencil> nameMap = new HashMap<String, VdmlLibraryStencil>();

    private VdmlLibraryStencil(EClass vdmlClass, ClassDiagramStencil baseStencil, String name) {
        this.baseStencil=baseStencil;
        this.vdmlClass=vdmlClass;
        this.stencilId=name;
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
}
