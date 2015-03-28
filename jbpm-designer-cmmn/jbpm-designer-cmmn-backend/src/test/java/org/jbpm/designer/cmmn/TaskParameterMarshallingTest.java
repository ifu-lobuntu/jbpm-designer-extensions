package org.jbpm.designer.cmmn;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.DocumentRoot;
import org.omg.cmmn.MultiplicityEnum;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TParameterMapping;
import org.omg.cmmn.TPlanItem;

public class TaskParameterMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testCaseInputAndOutput() throws Exception {
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
        TCaseParameter ip = CMMNFactory.eINSTANCE.createTCaseParameter();
        ip.setName("CaseInputParm1");
        ip.setBindingRef(childCfi);
        TExpression e = CMMNFactory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e);
        tCase.getInput().add(ip);
        TCaseParameter op = CMMNFactory.eINSTANCE.createTCaseParameter();
        op.setName("CaseOutputParm1");
        op.setBindingRef(childCfi);
        TExpression e2 = CMMNFactory.eINSTANCE.createTExpression();
        e2.setBody("return caseFileItem.getAll()");
        e2.setLanguage("java");
        op.setBindingRefinement(e2 );
        tCase.getOutput().add(op);
        assertOutputValid();
    }
    @Test
    public void testHumanTask() throws Exception {
        TPlanItem htpi = addHumanTaskPlanItem(tCase, casePlanModel);
        THumanTask task = (THumanTask) htpi.getDefinitionRef();
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
        TCaseParameter ip = CMMNFactory.eINSTANCE.createTCaseParameter();
        ip.setName("InputParm1");
        ip.setBindingRef(childCfi);
        TExpression e = CMMNFactory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e );
        task.getInputs().add(ip);
        TCaseParameter op = CMMNFactory.eINSTANCE.createTCaseParameter();
        op.setName("Parm1");
        op.setBindingRef(childCfi);
        TExpression e2 = CMMNFactory.eINSTANCE.createTExpression();
        e2.setBody("return caseFileItem.getAll()");
        e2.setLanguage("java");
        op.setBindingRefinement(e2 );
        task.getOutputs().add(op);
        assertOutputValid();
    }
    @Test
    public void testCaseTask() throws Exception {
        URI testUri = URI.createPlatformResourceURI("/jbpm-designer-cmmn-backend/src/test/resources/org/jbpm/designer/test/cmmn/CalledCase.cmmn", true);
        DocumentRoot root = (DocumentRoot) resourceSet.getResource(testUri, true).getContents().get(0);
        TCase calledCase = root.getDefinitions().getCase().get(0);
        TPlanItem ctpi = addCaseTaskPlanItem(tCase, casePlanModel);
        TCaseTask task = (TCaseTask) ctpi.getDefinitionRef();
        task.setCaseRef(calledCase);
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

        TCaseParameter ip = CMMNFactory.eINSTANCE.createTCaseParameter();
        ip.setName(calledCase.getInput().get(0).getName());
        TParameterMapping inMapping=CMMNFactory.eINSTANCE.createTParameterMapping();
        inMapping.setSourceRef(ip);
        inMapping.setTargetRef(calledCase.getInput().get(0));
        task.getParameterMapping().add(inMapping);
        ip.setBindingRef(childCfi);
        TExpression e = CMMNFactory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e );
        task.getInputs().add(ip);

        TCaseParameter op = CMMNFactory.eINSTANCE.createTCaseParameter();
        op.setName(calledCase.getOutput().get(0).getName());
        TParameterMapping outMapping=CMMNFactory.eINSTANCE.createTParameterMapping();
        outMapping.setSourceRef(calledCase.getOutput().get(0));
        outMapping.setTargetRef(op);
        task.getParameterMapping().add(outMapping);
        op.setBindingRef(childCfi);
        TExpression e2 = CMMNFactory.eINSTANCE.createTExpression();
        e2.setBody("return caseFileItem.getAll()");
        e2.setLanguage("java");
        op.setBindingRefinement(e2 );
        task.getOutputs().add(op);
        assertOutputValid();
    }
}