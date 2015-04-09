package org.jbpm.designer.meas;

import org.junit.Test;
import org.omg.smm.GradeInterval;
import org.omg.smm.GradeMeasure;
import org.omg.smm.SMMFactory;

public class GradeMeasureDiagramMarshallingTest extends AbstractSmmDiagramMarshallingTest {
    @Test
    public void testGradeMeasure() throws Exception {
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
        gi1.setName("gi2");
        gi1.setSymbol("GI2");
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
        assertOutputValid();
    }
}
