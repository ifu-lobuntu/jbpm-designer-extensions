package org.jbpm.designer.cmmn1.impl;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.MultiplicityEnum;
import org.eclipse.cmmn1.TCaseFileItem;
import org.eclipse.cmmn1.TCaseFileItemDefinition;
import org.eclipse.cmmn1.TProperty;
import org.junit.Test;

public class CaseFileItemMarshallingTest extends AbstractCmmnDiagramMarshallingTest {
    @Test
    public void testCaseFileItemsWithAssociations() throws Exception {
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

        TProperty prop = Cmmn1Factory.eINSTANCE.createTProperty();
        childDef.getProperty().add(prop);
        prop.setName("MyProp1");
        prop.setDescription("MyProp1Desc");
        prop.setType("http://www.omg.org/spec/CMMN/PropertyType/float");
        addShapeFor(childCfi, prop);
        TProperty prop2 = Cmmn1Factory.eINSTANCE.createTProperty();
        childDef.getProperty().add(prop2);
        prop2.setName("MyProp2");
        prop2.setDescription("MyProp2Desc");
        prop2.setType("http://www.omg.org/spec/CMMN/PropertyType/boolean");
        addShapeFor(childCfi, prop2);
        TCaseFileItemDefinition parentDef = Cmmn1Factory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(parentDef);
        parentDef.setName("MyParentCaseFileItemDefinition");
        TCaseFileItem parentCfi = Cmmn1Factory.eINSTANCE.createTCaseFileItem();
        tCase.getCaseFileModel().getCaseFileItem().add(parentCfi);
        parentCfi.setDefinitionRef(parentDef);
        parentCfi.setName("MyParentCaseFileItem");
        parentCfi.setMultiplicity(MultiplicityEnum.ONE_OR_MORE);
        addShapeFor(tCase, parentCfi);
        parentCfi.setChildren(Cmmn1Factory.eINSTANCE.createTChildren());
        parentCfi.getChildren().getCaseFileItem().add(childCfi);
        TCaseFileItemDefinition targetDef = Cmmn1Factory.eINSTANCE.createTCaseFileItemDefinition();
        inputDefinitions.getCaseFileItemDefinition().add(targetDef);
        parentDef.setName("MyParentCaseFileItemDefinition");
        TCaseFileItem targetCfi = Cmmn1Factory.eINSTANCE.createTCaseFileItem();
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