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


}