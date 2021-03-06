package org.jbpm.designer.cmmn;

import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.PlanItemTransition;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemOnPart;
import org.omg.cmmn.TRole;
import org.omg.cmmn.TSentry;
import org.omg.cmmn.TStage;

public class StageMarshallingTest extends AbstractCmmnDiagramMarshallingTest {

    @Test
    public void testCaseRoles() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        TRole human = addRole("Human");
        ((THumanTask) htpi.getDefinitionRef()).setPerformerRef(human);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase, casePlanModel);
        ((THumanTask) htdi.getDefinitionRef()).setPerformerRef(human);
        assertOutputValid();
    }

    @Test
    public void testDiscretionaryStage() throws Exception {
        TDiscretionaryItem sdi = addStageDiscretionaryItem(tCase, casePlanModel);
        TStage stage = (TStage) sdi.getDefinitionRef();
        TPlanItem htpi = addHumanTaskPlanItem(sdi, stage);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(sdi, stage);
        TSentry sentry = super.addEntrySentry("Waiting for Human Task",htdi);
        TPlanItemOnPart onPart = CMMNFactory.eINSTANCE.createTPlanItemOnPart();
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
        TSentry sentry = super.addEntrySentry("Waiting for Human Task",htdi);
        TPlanItemOnPart onPart = CMMNFactory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }
    @Test
    public void testStageExitCriteria() throws Exception {
        TPlanItem spi = addStagePlanItem(tCase, casePlanModel);
        TStage stage = (TStage) spi.getDefinitionRef();
        TPlanItem htpi = addHumanTaskPlanItem(spi, stage);
        TSentry sentry = super.addExitSentry("Waiting for Human Task",stage,spi);
        TPlanItemOnPart onPart = CMMNFactory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }
    @Test
    public void testCaseExitCriteria() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, tCase.getCasePlanModel());
        TSentry sentry = super.addExitSentry("Waiting for Human Task",tCase.getCasePlanModel(),tCase);
        TPlanItemOnPart onPart = CMMNFactory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }

}