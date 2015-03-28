package org.jbpm.designer.meas;

import org.junit.Test;
import org.omg.smm.Base1MeasureRelationship;
import org.omg.smm.Base2MeasureRelationship;
import org.omg.smm.BinaryFunctor;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.DirectMeasure;
import org.omg.smm.SMMFactory;

public class BinaryMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testBinaryMeasure() throws Exception {
        BinaryMeasure bm = SMMFactory.eINSTANCE.createBinaryMeasure();
        bm.setName("bm1");
        bm.setFunctor(BinaryFunctor.DIVIDE);
        measureLibrary.getMeasureElements().add(bm);
        addShapeFor(measureLibrary, bm);
        DirectMeasure dm1 = SMMFactory.eINSTANCE.createDirectMeasure();
        dm1.setName("meas1");
        measureLibrary.getMeasureElements().add(dm1);
        addShapeFor(measureLibrary, dm1);
        DirectMeasure dm2 = SMMFactory.eINSTANCE.createDirectMeasure();
        dm2.setName("meas2");
        measureLibrary.getMeasureElements().add(dm2);
        addShapeFor(measureLibrary, dm2);
        Base1MeasureRelationship base1=SMMFactory.eINSTANCE.createBase1MeasureRelationship();
        base1.setFromBinaryMeasure(bm);
        base1.setToDimensionalMeasure(dm1);
        addEdge(base1, bm, dm1);
        Base2MeasureRelationship base2=SMMFactory.eINSTANCE.createBase2MeasureRelationship();
        measureLibrary.getMeasureElements().add(dm2);
        base2.setFromBinaryMeasure(bm);
        base2.setToDimensionalMeasure(dm2);
        addEdge(base2, bm, dm2);
        assertOutputValid();
    }
}
