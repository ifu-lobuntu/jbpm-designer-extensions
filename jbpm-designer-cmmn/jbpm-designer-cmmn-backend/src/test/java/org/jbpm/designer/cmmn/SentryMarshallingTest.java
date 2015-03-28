package org.jbpm.designer.cmmn;

import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CaseFileItemTransition;
import org.omg.cmmn.MultiplicityEnum;
import org.omg.cmmn.PlanItemTransition;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TCaseFileItemOnPart;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemOnPart;
import org.omg.cmmn.TSentry;

public class SentryMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testPlanItemOnPart() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase, casePlanModel);
        TSentry sentry = addEntrySentry("Waiting for Human Task", htdi);
        TPlanItemOnPart onPart = CMMNFactory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }

    @Test
    public void testPlanItemOnPartWithSentryRef() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase, casePlanModel);
        TSentry fromSentry = addExitSentry("Waiting for God", htpi);
        TSentry toSentry = addEntrySentry("Waiting for Human Task", htdi);
        TPlanItemOnPart onPart = CMMNFactory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setSentryRef(fromSentry);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        toSentry.getOnPart().add(onPart);
        addEdge(onPart, fromSentry, toSentry);
        assertOutputValid();
        assertOutputValid();
    }

    @Test
    public void testCaseFileItemOnPart() throws Exception {
        TCaseFileItemDefinition def = CMMNFactory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(def);
        def.setName("MyCaseFileItemDefinition");
        def.setDescription("Desc");
        TCaseFileItem cfi = CMMNFactory.eINSTANCE.createTCaseFileItem();
        tCase.getCaseFileModel().getCaseFileItem().add(cfi);
        cfi.setDefinitionRef(def);
        cfi.setName("MyCaseFileItem");
        cfi.setMultiplicity(MultiplicityEnum.ONE_OR_MORE);
        addShapeFor(tCase, cfi);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase, casePlanModel);
        TSentry sentry = addEntrySentry("Waiting for Human Task", htdi);
        TCaseFileItemOnPart onPart = CMMNFactory.eINSTANCE.createTCaseFileItemOnPart();
        onPart.setSourceRef(cfi);
        onPart.setStandardEvent(CaseFileItemTransition.ADD_CHILD);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, cfi, sentry);
        assertOutputValid();
    }

}