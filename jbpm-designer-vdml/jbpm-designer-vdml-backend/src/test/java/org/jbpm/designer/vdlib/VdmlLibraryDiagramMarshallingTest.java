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
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.eclipse.uml2.uml.Package;
@SuppressWarnings("unused")
public class VdmlLibraryDiagramMarshallingTest extends AbstractVdmlLibraryDiagramTest {
    private OrgUnit externalOrgUnit;
    private Package externalPackage;
    private Class externalOrgUnitClass;
    @Override
    public void setup() throws Exception {
        super.setup();
        URI externalUri = URI.createPlatformResourceURI("/jbpm-designer-vdml-backend/target/external.vdcol",true);
        XMLResource res= (XMLResource) super.resourceSet.createResource(externalUri);
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.setName("123f");
        vdm.getCollaboration().add(externalOrgUnit=VDMLFactory.eINSTANCE.createOrgUnit());
        externalOrgUnit.setName("gqgqwregq");
        externalPackage=UMLFactory.eINSTANCE.createPackage();
        externalPackage.setName(externalOrgUnit.getName());
        res.getContents().add(vdm);
        res.getContents().add(externalPackage);
        this.externalOrgUnitClass = UMLFactory.eINSTANCE.createClass();
        externalPackage.getOwnedTypes().add(externalOrgUnitClass);
        externalOrgUnitClass.setName(externalOrgUnit.getName());
        externalOrgUnitClass.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(externalOrgUnit);
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
        CapabilityDefinition cc = VdmlLibraryJsonToEmfHelper.createCapabilityDefinition(clss3, vdm.getCapabilitylibrary().get(0));
        addShapeFor(clss3);
        UMLCompartment comp6 = addCompartmentFor(clss3,VDMLPackage.eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition());
        UMLCompartment comp7 = addCompartmentFor(clss3,UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        saveCollaborationResource();
        assertOutputValid();
    }
    @Test
    public void testExternalStuff() throws Exception {
        addShapeFor(externalOrgUnitClass);
        saveCollaborationResource();
        assertOutputValid();
    }
}
