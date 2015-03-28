package org.jbpm.designer.cmmn;

import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.TApplicabilityRule;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanningTable;
import org.omg.cmmn.TRole;

public class DiscretionaryItemMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testPlanItemOnPart() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        THumanTask ht = (THumanTask) htpi.getDefinitionRef();
        TPlanningTable pt = CMMNFactory.eINSTANCE.createTPlanningTable();
        ht.getPlanningTable().add(pt);
        TDiscretionaryItem htdi = addDiscretionaryHumanTask(tCase, pt);
        ((CMMNShape)super.elementDiagramElementMap.get(htpi)).setIsPlanningTableExpanded(true);
        addEdge(null, htpi, htdi);
        assertOutputValid();
    }
    @Test
    public void testApplicabilityRule() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        THumanTask ht = (THumanTask) htpi.getDefinitionRef();
        TPlanningTable pt = CMMNFactory.eINSTANCE.createTPlanningTable();
        ((CMMNShape)super.elementDiagramElementMap.get(htpi)).setIsPlanningTableExpanded(false);
        ht.getPlanningTable().add(pt);
        TDiscretionaryItem htdi = addDiscretionaryHumanTask(tCase, pt);
        addEdge(null, htpi, htdi);
        TApplicabilityRule ar = CMMNFactory.eINSTANCE.createTApplicabilityRule();
        TExpression cond = CMMNFactory.eINSTANCE.createTExpression();
        ar.setCondition(cond);
        cond.setLanguage("greek");
        cond.setBody("yeah right");
        pt.getApplicabilityRule().add(ar);
        htdi.getApplicabilityRuleRefs().add(ar);
        assertOutputValid();
    }
    @Test
    public void testAuthorizedRoles() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        THumanTask ht = (THumanTask) htpi.getDefinitionRef();
        TPlanningTable pt = CMMNFactory.eINSTANCE.createTPlanningTable();
        ht.getPlanningTable().add(pt);
        TDiscretionaryItem htdi = addDiscretionaryHumanTask(tCase, pt);
        addEdge(null, htpi, htdi);
        htdi.getAuthorizedRoleRefs().add(addRole("role1"));
        htdi.getAuthorizedRoleRefs().add(addRole("role2"));
        htdi.getAuthorizedRoleRefs().add(addRole("role3"));
        assertOutputValid();
    }
}