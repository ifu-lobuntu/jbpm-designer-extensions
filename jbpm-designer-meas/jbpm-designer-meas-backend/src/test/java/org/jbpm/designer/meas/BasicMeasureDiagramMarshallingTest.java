package org.jbpm.designer.meas;

import org.junit.Test;
import org.omg.smm.DirectMeasure;
import org.omg.smm.SMMFactory;
import org.omg.smm.UnitOfMeasure;

public class BasicMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testBasicMeasure() throws Exception {
        DirectMeasure dm = SMMFactory.eINSTANCE.createDirectMeasure();
        dm.setName("dm1");
        measureLibrary.getMeasureElements().add(dm);
        addShapeFor(measureLibrary, dm);
        UnitOfMeasure uom = SMMFactory.eINSTANCE.createUnitOfMeasure();
        uom.setName("eur");
        measureLibrary.getMeasureElements().add(uom);
        addShapeFor(measureLibrary, uom);
        dm.setUnit(uom);
        addEdge(null, dm, uom);
        assertOutputValid();
    }
}
