package org.jbpm.designer.cmmn1.impl;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.PlanItemTransition;
import org.eclipse.cmmn1.TDiscretionaryItem;
import org.eclipse.cmmn1.THumanTask;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.cmmn1.TPlanItemOnPart;
import org.eclipse.cmmn1.TSentry;
import org.eclipse.cmmn1.TStage;
import org.junit.Test;

public class StageMarshallingTest extends AbstractCmmnDiagramMarshallingTest {

    @Test
    public void testCaseRoles() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        ((THumanTask) htpi.getDefinitionRef()).setPerformerRef(addRole("Human"));
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase, casePlanModel);
        ((THumanTask) htdi.getDefinitionRef()).setPerformerRef(addRole("Human"));
        assertOutputValid();
    }

    @Test
    public void testDiscretionaryStage() throws Exception {
        TDiscretionaryItem sdi = addStageDiscretionaryItem(tCase, casePlanModel);
        TStage stage = (TStage) sdi.getDefinitionRef();
        TPlanItem htpi = addHumanTaskPlanItem(sdi, stage);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(sdi, stage);
        TSentry sentry = Cmmn1Factory.eINSTANCE.createTSentry();
        sentry.setName("Waiting for Human Task");
        stage.getSentry().add(sentry);
        htdi.getEntryCriteriaRefs().add(sentry);
        addShapeFor(sdi, sentry);
        TPlanItemOnPart onPart = Cmmn1Factory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }

    @Test
    public void testStage() throws Exception {
        TPlanItem spi = addStagePlanItem(tCase, casePlanModel);
        TStage stage = (TStage) spi.getDefinitionRef();
        TPlanItem htpi = addHumanTaskPlanItem(spi, stage);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(spi, stage);
        TSentry sentry = Cmmn1Factory.eINSTANCE.createTSentry();
        sentry.setName("Waiting for Human Task");
        stage.getSentry().add(sentry);
        htdi.getEntryCriteriaRefs().add(sentry);
        addShapeFor(spi, sentry);
        TPlanItemOnPart onPart = Cmmn1Factory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }

}