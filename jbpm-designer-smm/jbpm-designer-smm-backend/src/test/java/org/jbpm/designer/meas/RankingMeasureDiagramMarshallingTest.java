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
import org.omg.smm.RankingInterval;
import org.omg.smm.RankingMeasure;
import org.omg.smm.RankingMeasureRelationship;
import org.omg.smm.SMMFactory;

public class RankingMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testRankingMeasureInterval() throws Exception {
        RankingMeasure gm = SMMFactory.eINSTANCE.createRankingMeasure();
        gm.setName("gm1");
        measureLibrary.getMeasureElements().add(gm);
        addShapeFor(measureLibrary, gm);
        RankingInterval gi1 = SMMFactory.eINSTANCE.createRankingInterval();
        gi1.setName("gi1");
        gi1.setMaximumEndpoint(13.4);
        gi1.setMinimumEndpoint(12.4);
        gi1.setMaximumOpen(false);
        gi1.setMinimumOpen(false);
        gi1.setName("gi1");
        gi1.setValue(6345634.2);
        gm.getInterval().add(gi1);
        addShapeFor(gm, gi1);
        RankingInterval gi2 = SMMFactory.eINSTANCE.createRankingInterval();
        gi2.setMaximumEndpoint(123.4);
        gi2.setMinimumEndpoint(1.4);
        gi2.setMaximumOpen(true);
        gi2.setMinimumOpen(true);
        gi2.setName("gi2");
        gi2.setValue(1236344.2);
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
    public void testRankingMeasureRelationsihp() throws Exception {
        RankingMeasure gm = SMMFactory.eINSTANCE.createRankingMeasure();
        gm.setName("gm1");
        measureLibrary.getMeasureElements().add(gm);
        addShapeFor(measureLibrary, gm);
        DirectMeasure dm = SMMFactory.eINSTANCE.createDirectMeasure();
        dm.setName("dm1");
        measureLibrary.getMeasureElements().add(dm);
        addShapeFor(measureLibrary, dm);
        RankingMeasureRelationship gmr = SMMFactory.eINSTANCE.createRankingMeasureRelationship();
        gmr.setName("gmr1");
        gm.setRankingTo(gmr);
        gmr.setToDimensionalMeasure(dm);
        addEdge(gmr, gm, dm);
        XMLResource outputResource = assertOutputValid();
    }
}
