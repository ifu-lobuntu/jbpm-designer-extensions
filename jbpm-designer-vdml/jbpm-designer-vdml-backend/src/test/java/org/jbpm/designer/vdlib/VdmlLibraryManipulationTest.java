package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.jbpm.designer.extensions.diagram.*;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.junit.Test;
import org.omg.smm.Characteristic;
import org.omg.vdml.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class VdmlLibraryManipulationTest extends AbstractVdmlLibraryDiagramTest {
    @Test
    public void testIt() throws Exception {
        org.eclipse.uml2.uml.Class clss1 = addCarrierClass("MyBusinessItemDefinition");
        BusinessItemDefinition def = VdmlUmlHelper.createBusinessDefinition(clss1, vdm.getBusinessItemLibrary().get(0));
        def.setIsFungible(false);
        def.setIsShareable(true);
        addShapeFor(clss1);
        UMLCompartment comp1 = addCompartmentFor(clss1,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        EList<Characteristic> characteristicDefinition = def.getCharacteristicDefinition();
        UMLCompartment comp2 = addCompartmentFor(clss1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Property characteristicDef1 = addCharacteristicShape(clss1, characteristicDefinition);
        Property attribute = addAttributeShape(clss1);
        Class clss2 = addCarrierClass("CapabilityDefinition");
        CapabilityDefinition cd = VdmlUmlHelper.createCapabilityDefinition(clss2, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss2);
        UMLCompartment comp4 = addCompartmentFor(clss2, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp5 = addCompartmentFor(clss2, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss3 = addCarrierClass("CapabilityCategory");
        CapabilityCategory cc = VdmlUmlHelper.createCapabilityCategory(clss3, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss3);
        UMLCompartment comp6 = addCompartmentFor(clss3, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp7 = addCompartmentFor(clss3, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss4 = addCarrierClass("PoolDefinition");
        PoolDefinition pd = VdmlUmlHelper.createPoolDefinition(clss4, vdm.getStoreLibrary().get(0));
        addShapeFor(clss4);
        UMLCompartment comp8 = addCompartmentFor(clss4, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp9 = addCompartmentFor(clss4, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss5 = addCarrierClass("StoreDefinition");
        StoreDefinition sd = VdmlUmlHelper.createStoreDefinition(clss5, vdm.getStoreLibrary().get(0));
        addShapeFor(clss5);
        UMLCompartment comp10 = addCompartmentFor(clss5, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        Property characteristicDef5 = addCharacteristicShape(clss1, characteristicDefinition);
        UMLCompartment comp11 = addCompartmentFor(clss5,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());

        saveCollaborationResource();
        assertOutputValid();
        assertNotNull(collaborationResource.getEObject(JBPMECoreHelper.getID(clss4)));
        assertNotNull(collaborationResource.getEObject(JBPMECoreHelper.getID(characteristicDef1)));
        assertNotNull(collaborationResource.getEObject(JBPMECoreHelper.getID(clss4) + "PoolDefinition"));


        Diagram json = unmarshaller.convert(inputResource);
        json.deleteShape(json.findChildShapeById(JBPMECoreHelper.getID(clss4)));
        json.deleteShape(json.findChildShapeById(JBPMECoreHelper.getID(characteristicDef1)));
        json.deleteShape(json.findChildShapeById(JBPMECoreHelper.getID(characteristicDef5)));
        json.deleteShape(json.findChildShapeById(JBPMECoreHelper.getID(attribute)));
        XMLResource outputXml = marshaller.convert(json);
        Class foundBusinessItemDefinitionClass = (Class) JBPMECoreHelper.findEObject(outputXml.getResourceSet(), JBPMECoreHelper.getID(clss1));
        assertEquals(0,foundBusinessItemDefinitionClass.getOwnedAttributes().size());
        BusinessItemDefinition foundBusinessItemDefinition = (BusinessItemDefinition) JBPMECoreHelper.findEObject(outputXml.getResourceSet(), JBPMECoreHelper.getID(clss1)+"BusinessItemDefinition");
        assertNotNull(foundBusinessItemDefinition);
        assertEquals(0, foundBusinessItemDefinition.getCharacteristicDefinition().size());
        StoreDefinition foundStoreDefinition = (StoreDefinition) JBPMECoreHelper.findEObject(outputXml.getResourceSet(), JBPMECoreHelper.getID(clss5)+"StoreDefinition");
        assertNotNull(foundStoreDefinition);
        assertEquals(0,foundStoreDefinition.getCharacteristicDefinition().size());
        assertNull(JBPMECoreHelper.findEObject(outputXml.getResourceSet(), JBPMECoreHelper.getID(clss4)));
        assertNull(JBPMECoreHelper.findEObject(outputXml.getResourceSet(),JBPMECoreHelper.getID(characteristicDef1)));
        assertNull(JBPMECoreHelper.findEObject(outputXml.getResourceSet(), JBPMECoreHelper.getID(clss4) + "PoolDefinition"));
    }

    protected Property addCharacteristicShape(Class clss1, EList<Characteristic> characteristicDefinition) {
        Property characteristicDef = UMLFactory.eINSTANCE.createProperty();
        characteristicDef.setName(characteristic.getName());
        characteristicDef.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss1.getOwnedAttributes().add(characteristicDef);
        characteristicDefinition.add(characteristic);
        characteristicDef.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));
        addShapeToCompartment(clss1, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition(), characteristicDef);
        return characteristicDef;
    }
    protected Property addAttributeShape(Class clss1) {
        Property attr = UMLFactory.eINSTANCE.createProperty();
        attr.setName("attrib");
        clss1.getOwnedAttributes().add(attr);
        attr.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));
        addShapeToCompartment(clss1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), attr);
        return attr;
    }
}
