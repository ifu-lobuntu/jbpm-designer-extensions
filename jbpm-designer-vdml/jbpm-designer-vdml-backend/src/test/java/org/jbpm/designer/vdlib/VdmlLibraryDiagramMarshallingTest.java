package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.junit.Test;
import org.omg.vdml.*;
import org.eclipse.uml2.uml.Package;
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
        vdm.getStoreLibrary().get(0).getStoreDefinitions().add(externalStoreDefinition = VDMLFactory.eINSTANCE.createStoreDefinition());
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
    public void testIt() throws Exception {
        Class clss1 = addCarrierClass("MyBusinessItemDefinition");
        BusinessItemDefinition def = VdmlLibraryJsonToEmfHelper.createBusinessDefinition(clss1, vdm.getBusinessItemLibrary().get(0));
        def.setIsFungible(false);
        def.setIsShareable(true);
        addShapeFor(clss1);
        UMLCompartment comp1 = addCompartmentFor(clss1,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        Property characteristicDef = UMLFactory.eINSTANCE.createProperty();
        characteristicDef.setName(characteristic.getName());
        characteristicDef.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss1.getOwnedAttributes().add(characteristicDef);
        def.getCharacteristicDefinition().add(characteristic);
        characteristicDef.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));
        addShapeToCompartment(clss1, VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition(), characteristicDef);
        UMLCompartment comp2 = addCompartmentFor(clss1,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss2 = addCarrierClass("CapabilityDefinition");
        CapabilityDefinition cd = VdmlLibraryJsonToEmfHelper.createCapabilityDefinition(clss2, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss2);
        UMLCompartment comp4 = addCompartmentFor(clss2,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp5 = addCompartmentFor(clss2,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss3 = addCarrierClass("CapabilityCategory");
        CapabilityCategory cc = VdmlLibraryJsonToEmfHelper.createCapabilityCategory(clss3, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss3);
        UMLCompartment comp6 = addCompartmentFor(clss3,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp7 = addCompartmentFor(clss3,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss4 = addCarrierClass("PoolDefinition");
        PoolDefinition pd = VdmlLibraryJsonToEmfHelper.createPoolDefinition(clss4, vdm.getStoreLibrary().get(0));
        addShapeFor(clss4);
        UMLCompartment comp8 = addCompartmentFor(clss4,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp9 = addCompartmentFor(clss4,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Class clss5 = addCarrierClass("StoreDefinition");
        StoreDefinition sd = VdmlLibraryJsonToEmfHelper.createStoreDefinition(clss5, vdm.getStoreLibrary().get(0));
        addShapeFor(clss5);
        UMLCompartment comp10 = addCompartmentFor(clss5,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        sd.getCharacteristicDefinition().add(characteristic);
        UMLCompartment comp11 = addCompartmentFor(clss5,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());

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
