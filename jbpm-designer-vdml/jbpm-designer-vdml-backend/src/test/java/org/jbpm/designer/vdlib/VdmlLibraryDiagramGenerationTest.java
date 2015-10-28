package org.jbpm.designer.vdlib;

import static org.junit.Assert.*;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Class;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.junit.Test;
import org.omg.vdml.*;

public class VdmlLibraryDiagramGenerationTest extends AbstractVdmlLibraryDiagramTest {
    @SuppressWarnings("unused")
    @Test
    public void testIt() throws Exception {
        Class clss = addCarrierClass("MyBusinessItemDefinition");
        BusinessItemDefinition def = VdmlUmlHelper.createBusinessDefinition(clss, vdm.getBusinessItemLibrary().get(0));
        def.setIsFungible(false);
        def.setIsShareable(true);
        Property characteristicDef = UMLFactory.eINSTANCE.createProperty();
        characteristicDef.setName(characteristic.getName());
        characteristicDef.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(characteristic);
        clss.getOwnedAttributes().add(characteristicDef);
        def.getCharacteristicDefinition().add(characteristic);
        characteristicDef.setType(AbstractClassDiagramProfileImpl.getCmmnTypes(resourceSet).getOwnedType("Double"));
        Class clss2 = addCarrierClass("CapabilityDefinition");
        CapabilityDefinition cd = VdmlUmlHelper.createCapabilityDefinition(clss2, vdm.getCapabilitylibrary().get(0));
        Class clss3 = addCarrierClass("CapabilityCategory");
        CapabilityCategory cc = VdmlUmlHelper.createCapabilityCategory(clss3, vdm.getCapabilitylibrary().get(0));
        saveCollaborationResource();
        Diagram json = super.unmarshaller.convert(inputResource);
        assertNotNull( json.findChildShapeById(collaborationResource.getID(characteristicDef)));
        assertNotNull( json.findChildShapeById(collaborationResource.getID(clss)));
        assertNotNull( json.findChildShapeById(collaborationResource.getID(clss2)));
        assertNotNull( json.findChildShapeById(collaborationResource.getID(clss3)));
    }
}
