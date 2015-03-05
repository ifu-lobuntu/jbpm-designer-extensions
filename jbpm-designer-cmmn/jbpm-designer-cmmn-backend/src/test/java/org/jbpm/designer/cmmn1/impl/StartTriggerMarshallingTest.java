package org.jbpm.designer.cmmn1.impl;

import org.eclipse.cmmn1.CaseFileItemTransition;
import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.MultiplicityEnum;
import org.eclipse.cmmn1.PlanItemTransition;
import org.eclipse.cmmn1.TCaseFileItem;
import org.eclipse.cmmn1.TCaseFileItemDefinition;
import org.eclipse.cmmn1.TCaseFileItemStartTrigger;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.cmmn1.TPlanItemStartTrigger;
import org.eclipse.cmmn1.TTimerEvent;
import org.eclipse.cmmn1.util.Cmmn1ResourceImpl;
import org.junit.Test;

public class StartTriggerMarshallingTest extends AbstractCmmnDiagramMarshallingTest {

    @Test
    public void testCaseFileItemStartTrigger() throws Exception {
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
        TTimerEvent timerEvent = Cmmn1Factory.eINSTANCE.createTTimerEvent();
        casePlanModel.getPlanItemDefinition().add(timerEvent);
        TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(timerEvent);
        casePlanModel.getPlanItem().add(pi);
        pi.setName("TimerEventPlanItem");
        timerEvent.setName(pi.getName());
        addShapeFor(tCase, pi);
        TCaseFileItemStartTrigger startTrigger = Cmmn1Factory.eINSTANCE.createTCaseFileItemStartTrigger();
        startTrigger.setSourceRef(cfi);
        startTrigger.setStandardEvent(CaseFileItemTransition.ADD_CHILD);
        timerEvent.setTimerStart(startTrigger);
        addEdge(startTrigger, cfi, pi);
        assertOutputValid();
    }

    @Test
    public void testPlanItemStartTrigger() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        TTimerEvent timerEvent = Cmmn1Factory.eINSTANCE.createTTimerEvent();
        casePlanModel.getPlanItemDefinition().add(timerEvent);
        TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(timerEvent);
        casePlanModel.getPlanItem().add(pi);
        pi.setName("TimerEventPlanItem");
        timerEvent.setName(pi.getName());
        addShapeFor(tCase, pi);
        TPlanItemStartTrigger startTrigger = Cmmn1Factory.eINSTANCE.createTPlanItemStartTrigger();
        startTrigger.setSourceRef(htpi);
        startTrigger.setStandardEvent(PlanItemTransition.COMPLETE);
        timerEvent.setTimerStart(startTrigger);
        addEdge(startTrigger, htpi, pi);
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        inputResource = (Cmmn1ResourceImpl) marshaller.getResource(json, "");
        assertOutputValid();
    }

}