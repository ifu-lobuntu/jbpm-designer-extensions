package org.jbpm.designer.vdan;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.junit.Before;
import org.omg.dd.dc.DCPackage;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueProposition;

public class AbstractVdanDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {

    public AbstractVdanDiagramMarshallingTest() {
        super();
    }

    @Before
    public void setup() throws Exception {
        super.setup();

    }

    protected AbstractEmfDiagramProfile createProfile() {
        return new VdmlActivityNetworkProfileImpl();
    }

    protected ValueProposition addValueProposition(Role role1, Role role2, boolean addShape) {
        ValueProposition valueProposition = VDMLFactory.eINSTANCE.createValueProposition();
        valueProposition.setName("Safd");
        role1.getProvidedProposition().add(valueProposition);
        valueProposition.setRecipient(role2);
        if (addShape) {
            addShapeFor(collaboration, valueProposition);
        }
        return valueProposition;
    }

    protected void assertOutputValid() throws IOException, Exception {
        XMLResource outputResource = assertConversionValid(diagramResource);

        Set<EClassifier> idsToIgnore = new HashSet<EClassifier>();
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLDiagram());
        idsToIgnore.add(UMLDIPackage.eINSTANCE.getUMLStyle());
        idsToIgnore.add(DCPackage.eINSTANCE.getColor());
        idsToIgnore.add(UMLPackage.eINSTANCE.getProperty());//for associations
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural());
        idsToIgnore.add(UMLPackage.eINSTANCE.getLiteralInteger());
        idsToIgnore.add(EcorePackage.eINSTANCE.getEAnnotation());
        idsToIgnore.add(VDMLPackage.eINSTANCE.getMeasuredCharacteristic());
        Set<EStructuralFeature> featuresToIgnore = new HashSet<EStructuralFeature>();
        featuresToIgnore.add(VDMLPackage.eINSTANCE.getDeliverableFlow_Deliverable());
        XMLResource outputCollaborationResource = (XMLResource) outputResource.getResourceSet().getResource(collaborationResource.getURI(), true);
//        collaborationResource.save(System.out,null);
//        outputCollaborationResource.save(System.out,null);
        GenericEcoreComparator v = new GenericEcoreComparator(collaborationResource, outputCollaborationResource, idsToIgnore,featuresToIgnore);
        v.setDebugInfo("", profile);
        v.validate();
    }

}