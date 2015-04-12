package org.jbpm.designer.vdlib;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;

public enum VdmlLibraryStencil implements StencilInfo {
    BUSINESS_ITEM_DEFINITION(VDMLPackage.eINSTANCE.getBusinessItemDefinition(), ClassDiagramStencil.CLASS, "BusinessItemDefinition"),
    CHARACTERISTIC_DEFINITION_COMPARTMENT(null, ClassDiagramStencil.OWNED_ATTRIBUTE,
            "CharacteristicDefinitionCompartment"),
    CHARACTERISTIC_DEFINITION(SMMPackage.eINSTANCE.getCharacteristic(), ClassDiagramStencil.PROPERTY, "CharacteristicDefinition");

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
}
