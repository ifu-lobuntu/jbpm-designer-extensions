package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.junit.Test;
import org.omg.vdml.*;

@SuppressWarnings("unused")
public class VdmlLibraryDiagramMarshallingTest extends AbstractVdmlLibraryDiagramTest {
    private StoreDefinition externalStoreDefinition;
    private Package externalPackage;
    private Class externalStoreDefinitionClass;
    @Override
    public void setup() throws Exception {
        super.setup();
        URI externalUri = URI.createPlatformResourceURI("/jbpm-designer-vdml-backend/target/external.vdcol",true);
        XMLResource res= (XMLResource) super.resourceSet.createResource(externalUri);
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.setName("123f");
        vdm.getStoreLibrary().add(VDMLFactory.eINSTANCE.createStoreLibrary());
        vdm.getStoreLibrary().get(0).getStoreLibraryElement().add(externalStoreDefinition = VDMLFactory.eINSTANCE.createStoreDefinition());
        externalStoreDefinition.setName("gqgqwregq");
        externalPackage=UMLFactory.eINSTANCE.createPackage();
        externalPackage.setName(externalStoreDefinition.getName());
        res.getContents().add(vdm);
        res.getContents().add(externalPackage);
        this.externalStoreDefinitionClass = UMLFactory.eINSTANCE.createClass();
        externalPackage.getOwnedTypes().add(externalStoreDefinitionClass);
        externalStoreDefinitionClass.setName(externalStoreDefinition.getName());
        externalStoreDefinitionClass.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(externalStoreDefinition);
        res.save(tuh.createOutputStream(externalUri, profile.buildDefaultResourceOptions()),profile.buildDefaultResourceOptions());
    }
    @Test
    public void testClasses() throws Exception {
        Class clss0 = addCarrierClass("MyBusinessItemDefinition");
        BusinessItemDefinition bid = VdmlUmlHelper.createBusinessDefinition(clss0, vdm.getBusinessItemLibrary().get(0));
        bid.setIsFungible(false);
        bid.setIsShareable(true);
        addShapeFor(clss0);
        addCompartmentFor(clss0,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss0,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss1 = addCarrierClass("MyBusinessItemCategory");
        BusinessItemCategory bic = VdmlUmlHelper.createBusinessCategory(clss1, vdm.getBusinessItemLibrary().get(0));
        addShapeFor(clss1);
        UMLCompartment comp1 = addCompartmentFor(clss1,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        Property characteristicDef1 = UMLFactory.eINSTANCE.createProperty();
        characteristicDef1.setName(characteristic.getName());
        characteristicDef1.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss1.getOwnedAttributes().add(characteristicDef1);
        bic.getCharacteristicDefinition().add(characteristic);
        characteristicDef1.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));
        addShapeToCompartment(clss1, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition(), characteristicDef1);
        UMLCompartment comp2 = addCompartmentFor(clss1,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss2 = addCarrierClass("CapabilityDefinition");
        CapabilityDefinition cd = VdmlUmlHelper.createCapabilityDefinition(clss2, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss2);
        UMLCompartment comp4 = addCompartmentFor(clss2,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp5 = addCompartmentFor(clss2,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss3 = addCarrierClass("CapabilityCategory");
        CapabilityCategory cc = VdmlUmlHelper.createCapabilityCategory(clss3, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss3);
        UMLCompartment comp6 = addCompartmentFor(clss3,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp7 = addCompartmentFor(clss3,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss4 = addCarrierClass("PoolDefinition");
        PoolDefinition pd = VdmlUmlHelper.createPoolDefinition(clss4, vdm.getStoreLibrary().get(0));
        addShapeFor(clss4);
        UMLCompartment comp8 = addCompartmentFor(clss4,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp9 = addCompartmentFor(clss4,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());

        Class clss5 = addCarrierClass("StoreDefinition");
        StoreDefinition sd = VdmlUmlHelper.createStoreDefinition(clss5, vdm.getStoreLibrary().get(0));
        addShapeFor(clss5);
        UMLCompartment comp10 = addCompartmentFor(clss5,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        Property characteristicDef2 = UMLFactory.eINSTANCE.createProperty();
        characteristicDef2.setName(characteristic.getName());
        characteristicDef2.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss5.getOwnedAttributes().add(characteristicDef2);
        bic.getCharacteristicDefinition().add(characteristic);
        characteristicDef2.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));

        sd.getCharacteristicDefinition().add(characteristic);
        addShapeToCompartment(clss5, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition(),characteristicDef2);


        UMLCompartment comp11 = addCompartmentFor(clss5,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        saveCollaborationResource();
        assertOutputValid();
    }
    @Test
    public void testBusinessItemRelationships() throws Exception{
        Class clss0 = addCarrierClass("MyBusinessItemDefinition");
        BusinessItemDefinition bid = VdmlUmlHelper.createBusinessDefinition(clss0, vdm.getBusinessItemLibrary().get(0));
        bid.setIsFungible(false);
        bid.setIsShareable(true);
        addShapeFor(clss0);
        addCompartmentFor(clss0,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss0,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss1 = addCarrierClass("MyBusinessItemCategory");
        BusinessItemCategory bic = VdmlUmlHelper.createBusinessCategory(clss1, vdm.getBusinessItemLibrary().get(0));
        addShapeFor(clss1);
        addCompartmentFor(clss1,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss1,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Generalization generalization = clss0.createGeneralization(clss1);
        super.collaborationResource.setID(generalization, EcoreUtil.generateUUID());
        addEdge(generalization, clss0, clss1);
        bic.getCategoryItem().add(bid);
        saveCollaborationResource();
        assertOutputValid();
    }
    @Test
    public void testCapabilityRelationships() throws Exception{
        Class clss0 = addCarrierClass("CapabilityDefinition");
        CapabilityDefinition bid = VdmlUmlHelper.createCapabilityDefinition(clss0, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss0);
        addCompartmentFor(clss0,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss0,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss1 = addCarrierClass("CapabilityCategory");
        CapabilityCategory bic = VdmlUmlHelper.createCapabilityCategory(clss1, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss1);
        addCompartmentFor(clss1,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss1,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Generalization generalization = clss0.createGeneralization(clss1);
        super.collaborationResource.setID(generalization, EcoreUtil.generateUUID());
        addEdge(generalization, clss0, clss1);
        bic.getChildCapability().add(bid);
        saveCollaborationResource();
        assertOutputValid();
    }
    @Test
    public void testStoreRelationships() throws Exception{
        Class clss0 = addCarrierClass("PoolDefinition");
        PoolDefinition bid = VdmlUmlHelper.createPoolDefinition(clss0, vdm.getStoreLibrary().get(0));
        addShapeFor(clss0);
        addCompartmentFor(clss0,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss0,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss1 = addCarrierClass("PoolCategory");
        StoreCategory bic = VdmlUmlHelper.createStoreCategory(clss1, vdm.getStoreLibrary().get(0));
        addShapeFor(clss1);
        addCompartmentFor(clss1,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        addCompartmentFor(clss1,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Generalization generalization = clss0.createGeneralization(clss1);
        super.collaborationResource.setID(generalization, EcoreUtil.generateUUID());
        addEdge(generalization, clss0, clss1);
        bic.getCategoryStore().add(bid);
        saveCollaborationResource();
        assertOutputValid();
    }
    @Test
    public void testExternalStuff() throws Exception {
        addShapeFor(externalStoreDefinitionClass);
        saveCollaborationResource();
        assertOutputValid();
    }
}
