package org.jbpm.designer.vdlib;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.junit.Test;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.VDMLPackage;

public class VdmlLibraryDiagramGenerationTest extends AbstractVdmlLibraryDiagramTest {
    @Test
    public void testIt() throws Exception {
        Class clss = addCarrierClass("MyBusinessItemDefinition");
        BusinessItemDefinition def = VdmlLibraryJsonToEmfHelper.createBusinessDefinition( clss, vdm.getBusinessItemLibrary().get(0));
        def.setIsFungible(false);
        def.setIsShareable(true);
        addShapeFor(clss);
        UMLCompartment comp = addCompartmentFor(clss,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        Property characteristicDef = UMLFactory.eINSTANCE.createProperty();
        characteristicDef.setName(characteristic.getName());
        characteristicDef.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss.getOwnedAttributes().add(characteristicDef);
        def.getCharacteristicDefinition().add(characteristic);
        characteristicDef.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));
        addShapeToCompartment(clss, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition(), characteristicDef);
        Class clss2 = addCarrierClass("CapabilityDefinition");
        CapabilityDefinition cd = VdmlLibraryJsonToEmfHelper.createCapabilityDefinition( clss2, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss2);
        Class clss3 = addCarrierClass("CapabilityCategory");
        CapabilityDefinition cc = VdmlLibraryJsonToEmfHelper.createCapabilityDefinition( clss3, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss3);
        print(inputResource);
        assertOutputValid();
    }
}
