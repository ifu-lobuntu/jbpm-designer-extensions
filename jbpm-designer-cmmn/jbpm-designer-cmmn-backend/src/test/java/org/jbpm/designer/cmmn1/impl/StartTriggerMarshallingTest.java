package org.jbpm.designer.cmmn1.impl;

import org.junit.Test;
import org.omg.cmmn.CaseFileItemTransition;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.MultiplicityEnum;
import org.omg.cmmn.PlanItemTransition;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TCaseFileItemStartTrigger;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemStartTrigger;
import org.omg.cmmn.TTimerEvent;
import org.omg.cmmn.util.CMMNResourceImpl;

public class StartTriggerMarshallingTest extends AbstractCmmnDiagramMarshallingTest {

    @Test
    public void testCaseFileItemStartTrigger() throws Exception {
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
        TTimerEvent timerEvent = CMMNFactory.eINSTANCE.createTTimerEvent();
        casePlanModel.getPlanItemDefinition().add(timerEvent);
        TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(timerEvent);
        casePlanModel.getPlanItem().add(pi);
        pi.setName("TimerEventPlanItem");
        timerEvent.setName(pi.getName());
        addShapeFor(tCase, pi);
        TCaseFileItemStartTrigger startTrigger = CMMNFactory.eINSTANCE.createTCaseFileItemStartTrigger();
        startTrigger.setSourceRef(cfi);
        startTrigger.setStandardEvent(CaseFileItemTransition.ADD_CHILD);
        timerEvent.setTimerStart(startTrigger);
        addEdge(startTrigger, cfi, pi);
        assertOutputValid();
    }

    @Test
    public void testPlanItemStartTrigger() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        TTimerEvent timerEvent = CMMNFactory.eINSTANCE.createTTimerEvent();
        casePlanModel.getPlanItemDefinition().add(timerEvent);
        TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(timerEvent);
        casePlanModel.getPlanItem().add(pi);
        pi.setName("TimerEventPlanItem");
        timerEvent.setName(pi.getName());
        addShapeFor(tCase, pi);
        TPlanItemStartTrigger startTrigger = CMMNFactory.eINSTANCE.createTPlanItemStartTrigger();
        startTrigger.setSourceRef(htpi);
        startTrigger.setStandardEvent(PlanItemTransition.COMPLETE);
        timerEvent.setTimerStart(startTrigger);
        addEdge(startTrigger, htpi, pi);
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        inputResource = (CMMNResourceImpl) marshaller.getResource(json, "");
        assertOutputValid();
    }

}