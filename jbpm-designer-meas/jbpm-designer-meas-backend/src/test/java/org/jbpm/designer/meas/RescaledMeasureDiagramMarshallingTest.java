package org.jbpm.designer.meas;

import org.junit.Test;
import org.omg.smm.DirectMeasure;
import org.omg.smm.Influence;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.RescaledMeasureRelationship;
import org.omg.smm.SMMFactory;

public class RescaledMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testRescaledMeasure() throws Exception {
        RescaledMeasure rsm = SMMFactory.eINSTANCE.createRescaledMeasure();
        rsm.setName("rsm1");
        rsm.setOffset(123.2);
        rsm.setMultiplier(1.2);
        measureLibrary.getMeasureElements().add(rsm);
        addShapeFor(measureLibrary, rsm);
        DirectMeasure dm1 = SMMFactory.eINSTANCE.createDirectMeasure();
        dm1.setName("meas1");
        measureLibrary.getMeasureElements().add(dm1);
        addShapeFor(measureLibrary, dm1);
        
        RescaledMeasureRelationship rsmr = SMMFactory.eINSTANCE.createRescaledMeasureRelationship();
        rsmr.setInfluence(Influence.NEGATIVE);
        rsmr.setFromDimensionalMeasure(dm1);
        rsmr.setToRescaledMeasure(rsm);
        addEdge(rsmr, dm1, rsm);
        assertOutputValid();
    }
}
