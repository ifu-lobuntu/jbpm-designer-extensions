package org.jbpm.designer.cmmn1.impl;

import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.MultiplicityEnum;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.TParameterMapping;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TProcess;
import org.omg.cmmn.TProcessParameter;
import org.omg.cmmn.TProcessTask;

public class ProcessTaskMarshallingTest extends AbstractCmmnDiagramMarshallingTest {

    @Test
    public void testProcessTask() throws Exception {
        TPlanItem ctpi = addProcessTaskPlanItem(tCase, casePlanModel);
        TProcessTask task = (TProcessTask) ctpi.getDefinitionRef();
        TProcess calledProcess = CmmnJsonToEmfHelper.syncProcessInDefinitions(task, "scrum.CalledProcess|/jbpm-designer-cmmn-backend/src/test/resources/org/jbpm/designer/test/cmmn/CalledProcess.bpmn2", super.inputDefinitions);
        task.setProcessRef(calledProcess);
        TCaseFileItemDefinition childDef = CMMNFactory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(childDef);
        childDef.setName("MyChildCaseFileItemDefinition");
        childDef.setDescription("Desc");
        TCaseFileItem childCfi = CMMNFactory.eINSTANCE.createTCaseFileItem();
        tCase.getCaseFileModel().getCaseFileItem().add(childCfi);
        childCfi.setDefinitionRef(childDef);
        childCfi.setName("MyCaseFileItem");
        childCfi.setMultiplicity(MultiplicityEnum.ONE_OR_MORE);
        addShapeFor(tCase, childCfi);

        task.getInputs().add(createMappedParameter(task, childCfi, calledProcess.getInput().get(0)));
        task.getInputs().add(createMappedParameter(task, childCfi, calledProcess.getInput().get(1)));
        task.getOutputs().add(createMappedParameter(task, childCfi, calledProcess.getInput().get(0)));
        task.getOutputs().add(createMappedParameter(task, childCfi, calledProcess.getInput().get(1)));

        assertOutputValid();
    }

    public TCaseParameter createMappedParameter(TProcessTask task, TCaseFileItem childCfi, TProcessParameter targetParam) {
        TCaseParameter ip = CMMNFactory.eINSTANCE.createTCaseParameter();
        ip.setName(targetParam.getName());
        TParameterMapping inMapping = CMMNFactory.eINSTANCE.createTParameterMapping();
        inMapping.setSourceRef(ip);
        inMapping.setTargetRef(targetParam);
        task.getParameterMapping().add(inMapping);
        ip.setBindingRef(childCfi);
        TExpression e = CMMNFactory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e);
        return ip;
    }
}