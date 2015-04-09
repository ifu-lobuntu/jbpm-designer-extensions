package org.jbpm.designer.meas;

import org.junit.Test;
import org.omg.smm.Accumulator;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.DirectMeasure;
import org.omg.smm.SMMFactory;

public class CollectiveMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testCollectiveMeasure() throws Exception {
        CollectiveMeasure cm = SMMFactory.eINSTANCE.createCollectiveMeasure();
        cm.setName("bm1");
        cm.setAccumulator(Accumulator.STANDARD_DEVIATION);
        measureLibrary.getMeasureElements().add(cm);
        addShapeFor(measureLibrary, cm);
        DirectMeasure dm1 = SMMFactory.eINSTANCE.createDirectMeasure();
        dm1.setName("meas1");
        measureLibrary.getMeasureElements().add(dm1);
        addShapeFor(measureLibrary, dm1);
        DirectMeasure dm2 = SMMFactory.eINSTANCE.createDirectMeasure();
        dm2.setName("meas2");
        measureLibrary.getMeasureElements().add(dm2);
        addShapeFor(measureLibrary, dm2);
        BaseNMeasureRelationship base1=SMMFactory.eINSTANCE.createBaseNMeasureRelationship();
        base1.setFromCollectiveMeasure(cm);
        base1.setToDimensionalMeasure(dm1);
        addEdge(base1, cm, dm1);
        BaseNMeasureRelationship base2=SMMFactory.eINSTANCE.createBaseNMeasureRelationship();
        measureLibrary.getMeasureElements().add(dm2);
        base2.setFromCollectiveMeasure(cm);
        base2.setToDimensionalMeasure(dm2);
        addEdge(base2, cm, dm2);
        assertOutputValid();
    }
}
