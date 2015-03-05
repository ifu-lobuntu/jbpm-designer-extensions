package org.jbpm.designer.cmmn1.impl;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.MultiplicityEnum;
import org.eclipse.cmmn1.TCaseFileItem;
import org.eclipse.cmmn1.TCaseFileItemDefinition;
import org.eclipse.cmmn1.TCaseParameter;
import org.eclipse.cmmn1.TExpression;
import org.eclipse.cmmn1.TParameterMapping;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.cmmn1.TProcess;
import org.eclipse.cmmn1.TProcessParameter;
import org.eclipse.cmmn1.TProcessTask;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

public class ProcessTaskMarshallingTest extends AbstractCmmnDiagramMarshallingTest {

    @Test
    public void testProcessTask() throws Exception {
        TPlanItem ctpi = addProcessTaskPlanItem(tCase, casePlanModel);
        TProcessTask task = (TProcessTask) ctpi.getDefinitionRef();
        TProcess calledProcess = CmmnJsonToEmfHelper.syncProcessInDefinitions(task, "scrum.CalledProcess|/jbpm-designer-backend/src/test/resources/org/jbpm/designer/test/cmmn/CalledProcess.bpmn2", super.inputDefinitions);
        task.setProcessRef(calledProcess);
        TCaseFileItemDefinition childDef = Cmmn1Factory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(childDef);
        childDef.setName("MyChildCaseFileItemDefinition");
        childDef.setDescription("Desc");
        TCaseFileItem childCfi = Cmmn1Factory.eINSTANCE.createTCaseFileItem();
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
        TCaseParameter ip = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        ip.setName(targetParam.getName());
        TParameterMapping inMapping = Cmmn1Factory.eINSTANCE.createTParameterMapping();
        inMapping.setSourceRef(ip);
        inMapping.setTargetRef(targetParam);
        task.getParameterMapping().add(inMapping);
        ip.setBindingRef(childCfi);
        TExpression e = Cmmn1Factory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e);
        return ip;
    }
}