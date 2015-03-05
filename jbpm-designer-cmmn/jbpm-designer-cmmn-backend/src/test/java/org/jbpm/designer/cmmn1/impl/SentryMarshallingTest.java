package org.jbpm.designer.cmmn1.impl;

import org.eclipse.cmmn1.CaseFileItemTransition;
import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.MultiplicityEnum;
import org.eclipse.cmmn1.PlanItemTransition;
import org.eclipse.cmmn1.TCaseFileItem;
import org.eclipse.cmmn1.TCaseFileItemDefinition;
import org.eclipse.cmmn1.TCaseFileItemOnPart;
import org.eclipse.cmmn1.TDiscretionaryItem;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.cmmn1.TPlanItemOnPart;
import org.eclipse.cmmn1.TSentry;
import org.junit.Test;

public class SentryMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testPlanItemOnPart() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase,casePlanModel);
        TSentry sentry = Cmmn1Factory.eINSTANCE.createTSentry();
        sentry.setName("Waiting for Human Task");
        casePlanModel.getSentry().add(sentry);
        htdi.getEntryCriteriaRefs().add(sentry);
        addShapeFor(tCase,sentry);
        TPlanItemOnPart onPart = Cmmn1Factory.eINSTANCE.createTPlanItemOnPart();
        onPart.setSourceRef(htpi);
        onPart.setStandardEvent(PlanItemTransition.COMPLETE);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, htpi, sentry);
        assertOutputValid();
    }
    @Test
    public void testCaseFileItemOnPart() throws Exception {
        TCaseFileItemDefinition def = Cmmn1Factory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(def);
        def.setName("MyCaseFileItemDefinition");
        def.setDescription("Desc");
        TCaseFileItem cfi = Cmmn1Factory.eINSTANCE.createTCaseFileItem();
        tCase.getCaseFileModel().getCaseFileItem().add(cfi);
        cfi.setDefinitionRef(def);
        cfi.setName("MyCaseFileItem");
        cfi.setMultiplicity(MultiplicityEnum.ONE_OR_MORE);
        addShapeFor(tCase, cfi);
        TDiscretionaryItem htdi = addHumanTaskDiscretionaryItem(tCase,casePlanModel);
        TSentry sentry = Cmmn1Factory.eINSTANCE.createTSentry();
        sentry.setName("Waiting for Human Task");
        casePlanModel.getSentry().add(sentry);
        htdi.getEntryCriteriaRefs().add(sentry);
        addShapeFor(tCase, sentry);
        TCaseFileItemOnPart onPart = Cmmn1Factory.eINSTANCE.createTCaseFileItemOnPart();
        onPart.setSourceRef(cfi);
        onPart.setStandardEvent(CaseFileItemTransition.ADD_CHILD);
        sentry.getOnPart().add(onPart);
        addEdge(onPart, cfi, sentry);
        assertOutputValid();
    }

}