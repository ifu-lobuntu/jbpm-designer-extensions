package org.jbpm.designer.cmmn1.impl;

import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.MultiplicityEnum;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TProperty;

public class CaseFileItemMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testCaseFileItemsWithAssociations() throws Exception {
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

        TProperty prop = CMMNFactory.eINSTANCE.createTProperty();
        childDef.getProperty().add(prop);
        prop.setName("MyProp1");
        prop.setDescription("MyProp1Desc");
        prop.setType("http://www.omg.org/spec/CMMN/PropertyType/float");
        addShapeFor(childCfi, prop);
        TProperty prop2 = CMMNFactory.eINSTANCE.createTProperty();
        childDef.getProperty().add(prop2);
        prop2.setName("MyProp2");
        prop2.setDescription("MyProp2Desc");
        prop2.setType("http://www.omg.org/spec/CMMN/PropertyType/boolean");
        addShapeFor(childCfi, prop2);
        TCaseFileItemDefinition parentDef = CMMNFactory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(parentDef);
        parentDef.setName("MyParentCaseFileItemDefinition");
        TCaseFileItem parentCfi = CMMNFactory.eINSTANCE.createTCaseFileItem();
        tCase.getCaseFileModel().getCaseFileItem().add(parentCfi);
        parentCfi.setDefinitionRef(parentDef);
        parentCfi.setName("MyParentCaseFileItem");
        parentCfi.setMultiplicity(MultiplicityEnum.ONE_OR_MORE);
        addShapeFor(tCase, parentCfi);
        parentCfi.setChildren(CMMNFactory.eINSTANCE.createTChildren());
        parentCfi.getChildren().getCaseFileItem().add(childCfi);
        TCaseFileItemDefinition targetDef = CMMNFactory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(targetDef);
        parentDef.setName("MyParentCaseFileItemDefinition");
        TCaseFileItem targetCfi = CMMNFactory.eINSTANCE.createTCaseFileItem();
        tCase.getCaseFileModel().getCaseFileItem().add(targetCfi);
        targetCfi.setDefinitionRef(targetDef);
        targetCfi.setName("MyTargetCaseFileItem");
        targetCfi.setMultiplicity(MultiplicityEnum.ONE_OR_MORE);
        addShapeFor(tCase, targetCfi);
        parentCfi.getTargetRefs().add(targetCfi);
        addEdge(null, parentCfi, childCfi);
        addEdge(null, parentCfi, targetCfi);
        assertOutputValid();
    }
}