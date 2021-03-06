package org.jbpm.designer.meas;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.junit.Test;
import org.omg.smm.DirectMeasure;
import org.omg.smm.GradeInterval;
import org.omg.smm.GradeMeasure;
import org.omg.smm.GradeMeasureRelationship;
import org.omg.smm.SMMFactory;

public class GradeMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testGradeMeasureInterval() throws Exception {
        GradeMeasure gm = SMMFactory.eINSTANCE.createGradeMeasure();
        gm.setName("gm1");
        measureLibrary.getMeasureElements().add(gm);
        addShapeFor(measureLibrary, gm);
        GradeInterval gi1 = SMMFactory.eINSTANCE.createGradeInterval();
        gi1.setName("gi1");
        gi1.setMaximumEndpoint(13.4);
        gi1.setMinimumEndpoint(12.4);
        gi1.setMaximumOpen(false);
        gi1.setMinimumOpen(false);
        gi1.setName("gi1");
        gi1.setSymbol("GI1");
        gm.getInterval().add(gi1);
        addShapeFor(gm, gi1);
        GradeInterval gi2 = SMMFactory.eINSTANCE.createGradeInterval();
        gi2.setMaximumEndpoint(123.4);
        gi2.setMinimumEndpoint(1.4);
        gi2.setMaximumOpen(true);
        gi2.setMinimumOpen(true);
        gi2.setName("gi2");
        gi2.setSymbol("GI2");
        gm.getInterval().add(gi2);
        addShapeFor(gm, gi2);
        XMLResource outputResource = assertOutputValid();
        Package p = (Package) outputResource.getContents().get(1);
        Enumeration en = (Enumeration) p.getOwnedType(gm.getName());
        EnumerationLiteral lit = en.getOwnedLiteral("gi2");
        assertEquals(true, ((LiteralBoolean) lit.getSlots().get(0).getValues().get(0)).booleanValue());
        assertEquals("123.4", ((OpaqueExpression) lit.getSlots().get(2).getValues().get(0)).getBodies().get(0));
    }

    @Test
    public void testGradeMeasureRelationsihp() throws Exception {
        GradeMeasure gm = SMMFactory.eINSTANCE.createGradeMeasure();
        gm.setName("gm1");
        measureLibrary.getMeasureElements().add(gm);
        addShapeFor(measureLibrary, gm);
        DirectMeasure dm = SMMFactory.eINSTANCE.createDirectMeasure();
        dm.setName("dm1");
        measureLibrary.getMeasureElements().add(dm);
        addShapeFor(measureLibrary, dm);
        GradeMeasureRelationship gmr = SMMFactory.eINSTANCE.createGradeMeasureRelationship();
        gmr.setName("gmr1");
        gm.setGradeTo(gmr);
        gmr.setToDimensionalMeasure(dm);
        addEdge(gmr, gm, dm);
        XMLResource outputResource = assertOutputValid();
    }
}
