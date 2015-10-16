package org.jbpm.designer.meas;

import org.junit.Test;
import org.omg.smm.*;

public class CountingMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testCountingMeasure() throws Exception {
        CountingMeasure cm = SMMFactory.eINSTANCE.createCountingMeasure();
        cm.setName("bm1");
        cm.setOperation(SMMFactory.eINSTANCE.createOperation());
        measureLibrary.getMeasureElements().add(cm.getOperation());
        cm.getOperation().setBody("a > 123");
        measureLibrary.getMeasureElements().add(cm);
        addShapeFor(measureLibrary, cm);
        DirectMeasure dm1 = SMMFactory.eINSTANCE.createDirectMeasure();
        dm1.setName("meas1");
        measureLibrary.getMeasureElements().add(dm1);
        addShapeFor(measureLibrary, dm1);
        CountingMeasureRelationship base1=SMMFactory.eINSTANCE.createCountingMeasureRelationship();
        base1.setFromCountingMeasure(cm);
        base1.setToCountedMeasure(dm1);
        addEdge(base1, cm, dm1);
        assertOutputValid();
    }
}
