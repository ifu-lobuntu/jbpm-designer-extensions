package org.jbpm.designer.cmmn1.impl;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.DocumentRoot;
import org.eclipse.cmmn1.MultiplicityEnum;
import org.eclipse.cmmn1.TCase;
import org.eclipse.cmmn1.TCaseFileItem;
import org.eclipse.cmmn1.TCaseFileItemDefinition;
import org.eclipse.cmmn1.TCaseParameter;
import org.eclipse.cmmn1.TCaseTask;
import org.eclipse.cmmn1.TExpression;
import org.eclipse.cmmn1.THumanTask;
import org.eclipse.cmmn1.TParameterMapping;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.junit.Test;

public class TaskParameterMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testCaseInputAndOutput() throws Exception {
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
        TCaseParameter ip = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        ip.setName("CaseInputParm1");
        ip.setBindingRef(childCfi);
        TExpression e = Cmmn1Factory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e);
        tCase.getInput().add(ip);
        TCaseParameter op = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        op.setName("CaseOutputParm1");
        op.setBindingRef(childCfi);
        TExpression e2 = Cmmn1Factory.eINSTANCE.createTExpression();
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
        TCaseParameter ip = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        ip.setName("InputParm1");
        ip.setBindingRef(childCfi);
        TExpression e = Cmmn1Factory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e );
        task.getInputs().add(ip);
        TCaseParameter op = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        op.setName("Parm1");
        op.setBindingRef(childCfi);
        TExpression e2 = Cmmn1Factory.eINSTANCE.createTExpression();
        e2.setBody("return caseFileItem.getAll()");
        e2.setLanguage("java");
        op.setBindingRefinement(e2 );
        task.getOutputs().add(op);
        assertOutputValid();
    }
    @Test
    public void testCaseTask() throws Exception {
        URI testUri = URI.createPlatformResourceURI("/jbpm-designer-backend/src/test/resources/org/jbpm/designer/test/cmmn/CalledCase.cmmn", true);
        DocumentRoot root = (DocumentRoot) resourceSet.getResource(testUri, true).getContents().get(0);
        TCase calledCase = root.getDefinitions().getCase().get(0);
        TPlanItem ctpi = addCaseTaskPlanItem(tCase, casePlanModel);
        TCaseTask task = (TCaseTask) ctpi.getDefinitionRef();
        task.setCaseRef(calledCase);
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

        TCaseParameter ip = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        ip.setName(calledCase.getInput().get(0).getName());
        TParameterMapping inMapping=Cmmn1Factory.eINSTANCE.createTParameterMapping();
        inMapping.setSourceRef(ip);
        inMapping.setTargetRef(calledCase.getInput().get(0));
        task.getParameterMapping().add(inMapping);
        ip.setBindingRef(childCfi);
        TExpression e = Cmmn1Factory.eINSTANCE.createTExpression();
        e.setBody("return caseFileItem.getAll()");
        e.setLanguage("java");
        ip.setBindingRefinement(e );
        task.getInputs().add(ip);

        TCaseParameter op = Cmmn1Factory.eINSTANCE.createTCaseParameter();
        op.setName(calledCase.getOutput().get(0).getName());
        TParameterMapping outMapping=Cmmn1Factory.eINSTANCE.createTParameterMapping();
        outMapping.setSourceRef(calledCase.getOutput().get(0));
        outMapping.setTargetRef(op);
        task.getParameterMapping().add(outMapping);
        op.setBindingRef(childCfi);
        TExpression e2 = Cmmn1Factory.eINSTANCE.createTExpression();
        e2.setBody("return caseFileItem.getAll()");
        e2.setLanguage("java");
        op.setBindingRefinement(e2 );
        task.getOutputs().add(op);
        assertOutputValid();
    }
}