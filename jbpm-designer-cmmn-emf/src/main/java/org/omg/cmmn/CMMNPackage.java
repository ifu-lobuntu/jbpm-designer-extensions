/**
 */
package org.omg.cmmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.cmmn.CMMNFactory
 * @model kind="package"
 * @generated
 */
public interface CMMNPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cmmn";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/CMMN/20131201/MODEL";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cmmn";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CMMNPackage eINSTANCE = org.omg.cmmn.impl.CMMNPackageImpl.init();

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.DocumentRootImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Applicability Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__APPLICABILITY_RULE = 3;

    /**
     * The feature id for the '<em><b>Case</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE = 4;

    /**
     * The feature id for the '<em><b>Case File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_FILE = 5;

    /**
     * The feature id for the '<em><b>Case File Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_FILE_ITEM = 6;

    /**
     * The feature id for the '<em><b>Case File Item Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_FILE_ITEM_DEFINITION = 7;

    /**
     * The feature id for the '<em><b>Case File Item On Part</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_FILE_ITEM_ON_PART = 8;

    /**
     * The feature id for the '<em><b>On Part</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ON_PART = 9;

    /**
     * The feature id for the '<em><b>Case File Item Start Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_FILE_ITEM_START_TRIGGER = 10;

    /**
     * The feature id for the '<em><b>Timer Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TIMER_START = 11;

    /**
     * The feature id for the '<em><b>Case Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_PARAMETER = 12;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETER = 13;

    /**
     * The feature id for the '<em><b>Case Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CASE_TASK = 14;

    /**
     * The feature id for the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASK = 15;

    /**
     * The feature id for the '<em><b>Plan Item Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLAN_ITEM_DEFINITION = 16;

    /**
     * The feature id for the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEFINITIONS = 17;

    /**
     * The feature id for the '<em><b>Discretionary Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DISCRETIONARY_ITEM = 18;

    /**
     * The feature id for the '<em><b>Table Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TABLE_ITEM = 19;

    /**
     * The feature id for the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT = 20;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXPRESSION = 21;

    /**
     * The feature id for the '<em><b>Human Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HUMAN_TASK = 22;

    /**
     * The feature id for the '<em><b>If Part</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IF_PART = 23;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPORT = 24;

    /**
     * The feature id for the '<em><b>Manual Activation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MANUAL_ACTIVATION_RULE = 25;

    /**
     * The feature id for the '<em><b>Milestone</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MILESTONE = 26;

    /**
     * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETER_MAPPING = 27;

    /**
     * The feature id for the '<em><b>Plan Fragment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLAN_FRAGMENT = 28;

    /**
     * The feature id for the '<em><b>Plan Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLAN_ITEM = 29;

    /**
     * The feature id for the '<em><b>Plan Item Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLAN_ITEM_CONTROL = 30;

    /**
     * The feature id for the '<em><b>Plan Item On Part</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLAN_ITEM_ON_PART = 31;

    /**
     * The feature id for the '<em><b>Plan Item Start Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLAN_ITEM_START_TRIGGER = 32;

    /**
     * The feature id for the '<em><b>Planning Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLANNING_TABLE = 33;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS = 34;

    /**
     * The feature id for the '<em><b>Process Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS_PARAMETER = 35;

    /**
     * The feature id for the '<em><b>Process Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS_TASK = 36;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTY = 37;

    /**
     * The feature id for the '<em><b>Repetition Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__REPETITION_RULE = 38;

    /**
     * The feature id for the '<em><b>Required Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__REQUIRED_RULE = 39;

    /**
     * The feature id for the '<em><b>Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ROLE = 40;

    /**
     * The feature id for the '<em><b>Sentry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SENTRY = 41;

    /**
     * The feature id for the '<em><b>Stage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STAGE = 42;

    /**
     * The feature id for the '<em><b>Timer Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TIMER_EVENT = 43;

    /**
     * The feature id for the '<em><b>User Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__USER_EVENT = 44;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 45;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCmmnElementImpl <em>TCmmn Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCmmnElementImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCmmnElement()
     * @generated
     */
    int TCMMN_ELEMENT = 11;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT__ID = 1;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT__ANY_ATTRIBUTE = 2;

    /**
     * The number of structural features of the '<em>TCmmn Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>TCmmn Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TApplicabilityRuleImpl <em>TApplicability Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TApplicabilityRuleImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTApplicabilityRule()
     * @generated
     */
    int TAPPLICABILITY_RULE = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TApplicability Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TApplicability Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAPPLICABILITY_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseImpl <em>TCase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCase()
     * @generated
     */
    int TCASE = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Case File Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__CASE_FILE_MODEL = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Case Plan Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__CASE_PLAN_MODEL = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Case Roles</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__CASE_ROLES = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__INPUT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__OUTPUT = TCMMN_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>TCase</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>TCase</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseFileImpl <em>TCase File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseFileImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFile()
     * @generated
     */
    int TCASE_FILE = 3;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Case File Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE__CASE_FILE_ITEM = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TCase File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TCase File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseFileItemImpl <em>TCase File Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseFileItemImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItem()
     * @generated
     */
    int TCASE_FILE_ITEM = 4;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__CHILDREN = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definition Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__DEFINITION_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__MULTIPLICITY = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__SOURCE_REF = TCMMN_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Target Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM__TARGET_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>TCase File Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>TCase File Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseFileItemDefinitionImpl <em>TCase File Item Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseFileItemDefinitionImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItemDefinition()
     * @generated
     */
    int TCASE_FILE_ITEM_DEFINITION = 5;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__PROPERTY = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definition Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__DEFINITION_TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Import Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__IMPORT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION__STRUCTURE_REF = TCMMN_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>TCase File Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>TCase File Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_DEFINITION_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TOnPartImpl <em>TOn Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TOnPartImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTOnPart()
     * @generated
     */
    int TON_PART = 22;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TON_PART__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TON_PART__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TON_PART__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>TOn Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TON_PART_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>TOn Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TON_PART_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseFileItemOnPartImpl <em>TCase File Item On Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseFileItemOnPartImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItemOnPart()
     * @generated
     */
    int TCASE_FILE_ITEM_ON_PART = 6;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART__DESCRIPTION = TON_PART__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART__ID = TON_PART__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART__ANY_ATTRIBUTE = TON_PART__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Standard Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT = TON_PART_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART__SOURCE_REF = TON_PART_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TCase File Item On Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART_FEATURE_COUNT = TON_PART_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TCase File Item On Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_ON_PART_OPERATION_COUNT = TON_PART_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TStartTriggerImpl <em>TStart Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TStartTriggerImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTStartTrigger()
     * @generated
     */
    int TSTART_TRIGGER = 41;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTART_TRIGGER__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTART_TRIGGER__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTART_TRIGGER__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>TStart Trigger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTART_TRIGGER_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>TStart Trigger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTART_TRIGGER_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseFileItemStartTriggerImpl <em>TCase File Item Start Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseFileItemStartTriggerImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItemStartTrigger()
     * @generated
     */
    int TCASE_FILE_ITEM_START_TRIGGER = 7;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER__DESCRIPTION = TSTART_TRIGGER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER__ID = TSTART_TRIGGER__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER__ANY_ATTRIBUTE = TSTART_TRIGGER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Standard Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER__STANDARD_EVENT = TSTART_TRIGGER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER__SOURCE_REF = TSTART_TRIGGER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TCase File Item Start Trigger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER_FEATURE_COUNT = TSTART_TRIGGER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TCase File Item Start Trigger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_FILE_ITEM_START_TRIGGER_OPERATION_COUNT = TSTART_TRIGGER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TParameterImpl <em>TParameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TParameterImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTParameter()
     * @generated
     */
    int TPARAMETER = 23;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TParameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TParameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseParameterImpl <em>TCase Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseParameterImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseParameter()
     * @generated
     */
    int TCASE_PARAMETER = 8;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER__DESCRIPTION = TPARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER__ID = TPARAMETER__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER__ANY_ATTRIBUTE = TPARAMETER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER__NAME = TPARAMETER__NAME;

    /**
     * The feature id for the '<em><b>Binding Refinement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER__BINDING_REFINEMENT = TPARAMETER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Binding Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER__BINDING_REF = TPARAMETER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TCase Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER_FEATURE_COUNT = TPARAMETER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TCase Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_PARAMETER_OPERATION_COUNT = TPARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanItemDefinitionImpl <em>TPlan Item Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanItemDefinitionImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemDefinition()
     * @generated
     */
    int TPLAN_ITEM_DEFINITION = 28;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TPlan Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TPlan Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_DEFINITION_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TTaskImpl <em>TTask</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TTaskImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTTask()
     * @generated
     */
    int TTASK = 43;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__DESCRIPTION = TPLAN_ITEM_DEFINITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__ID = TPLAN_ITEM_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__NAME = TPLAN_ITEM_DEFINITION__NAME;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__INPUTS = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__OUTPUTS = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK__IS_BLOCKING = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TTask</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TTask</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTASK_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCaseTaskImpl <em>TCase Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCaseTaskImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseTask()
     * @generated
     */
    int TCASE_TASK = 9;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__DESCRIPTION = TTASK__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__ID = TTASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__NAME = TTASK__NAME;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__INPUTS = TTASK__INPUTS;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__OUTPUTS = TTASK__OUTPUTS;

    /**
     * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

    /**
     * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__PARAMETER_MAPPING = TTASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Case Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK__CASE_REF = TTASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TCase Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TCase Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCASE_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TChildrenImpl <em>TChildren</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TChildrenImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTChildren()
     * @generated
     */
    int TCHILDREN = 10;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHILDREN__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHILDREN__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHILDREN__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Case File Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHILDREN__CASE_FILE_ITEM = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TChildren</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHILDREN_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TChildren</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCHILDREN_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TCmmnElementWithMixedContentImpl <em>TCmmn Element With Mixed Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TCmmnElementWithMixedContentImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCmmnElementWithMixedContent()
     * @generated
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT = 12;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>TCmmn Element With Mixed Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>TCmmn Element With Mixed Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TCMMN_ELEMENT_WITH_MIXED_CONTENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TDefinitionsImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTDefinitions()
     * @generated
     */
    int TDEFINITIONS = 13;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__IMPORT = 0;

    /**
     * The feature id for the '<em><b>Case File Item Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__CASE_FILE_ITEM_DEFINITION = 1;

    /**
     * The feature id for the '<em><b>Case</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__CASE = 2;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__PROCESS = 3;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__AUTHOR = 4;

    /**
     * The feature id for the '<em><b>Creation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__CREATION_DATE = 5;

    /**
     * The feature id for the '<em><b>Exporter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__EXPORTER = 6;

    /**
     * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__EXPORTER_VERSION = 7;

    /**
     * The feature id for the '<em><b>Expression Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__EXPRESSION_LANGUAGE = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__ID = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__NAME = 10;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__TARGET_NAMESPACE = 11;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__ANY_ATTRIBUTE = 12;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS__DIAGRAM = 13;

    /**
     * The number of structural features of the '<em>TDefinitions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS_FEATURE_COUNT = 14;

    /**
     * The number of operations of the '<em>TDefinitions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDEFINITIONS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TTableItemImpl <em>TTable Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TTableItemImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTTableItem()
     * @generated
     */
    int TTABLE_ITEM = 42;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Applicability Rule Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM__APPLICABILITY_RULE_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Authorized Role Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM__AUTHORIZED_ROLE_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TTable Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TTable Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTABLE_ITEM_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TDiscretionaryItemImpl <em>TDiscretionary Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TDiscretionaryItemImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTDiscretionaryItem()
     * @generated
     */
    int TDISCRETIONARY_ITEM = 14;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__DESCRIPTION = TTABLE_ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__ID = TTABLE_ITEM__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__ANY_ATTRIBUTE = TTABLE_ITEM__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Applicability Rule Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__APPLICABILITY_RULE_REFS = TTABLE_ITEM__APPLICABILITY_RULE_REFS;

    /**
     * The feature id for the '<em><b>Authorized Role Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__AUTHORIZED_ROLE_REFS = TTABLE_ITEM__AUTHORIZED_ROLE_REFS;

    /**
     * The feature id for the '<em><b>Item Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__ITEM_CONTROL = TTABLE_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definition Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__DEFINITION_REF = TTABLE_ITEM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entry Criteria Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS = TTABLE_ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Exit Criteria Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS = TTABLE_ITEM_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>TDiscretionary Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM_FEATURE_COUNT = TTABLE_ITEM_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>TDiscretionary Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TDISCRETIONARY_ITEM_OPERATION_COUNT = TTABLE_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TEventImpl <em>TEvent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TEventImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTEvent()
     * @generated
     */
    int TEVENT = 15;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT__DESCRIPTION = TPLAN_ITEM_DEFINITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT__ID = TPLAN_ITEM_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT__NAME = TPLAN_ITEM_DEFINITION__NAME;

    /**
     * The number of structural features of the '<em>TEvent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>TEvent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEVENT_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TExpressionImpl <em>TExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TExpressionImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTExpression()
     * @generated
     */
    int TEXPRESSION = 16;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION__MIXED = TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION__DESCRIPTION = TCMMN_ELEMENT_WITH_MIXED_CONTENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION__ID = TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION__ANY_ATTRIBUTE = TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION__BODY = TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION__LANGUAGE = TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TExpression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION_FEATURE_COUNT = TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TExpression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXPRESSION_OPERATION_COUNT = TCMMN_ELEMENT_WITH_MIXED_CONTENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.THumanTaskImpl <em>THuman Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.THumanTaskImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTHumanTask()
     * @generated
     */
    int THUMAN_TASK = 17;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__DESCRIPTION = TTASK__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__ID = TTASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__NAME = TTASK__NAME;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__INPUTS = TTASK__INPUTS;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__OUTPUTS = TTASK__OUTPUTS;

    /**
     * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

    /**
     * The feature id for the '<em><b>Planning Table</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__PLANNING_TABLE = TTASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Performer Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK__PERFORMER_REF = TTASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>THuman Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>THuman Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THUMAN_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TIfPartImpl <em>TIf Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TIfPartImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTIfPart()
     * @generated
     */
    int TIF_PART = 18;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TIf Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TIf Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIF_PART_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TImportImpl <em>TImport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TImportImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTImport()
     * @generated
     */
    int TIMPORT = 19;

    /**
     * The feature id for the '<em><b>Import Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMPORT__IMPORT_TYPE = 0;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMPORT__LOCATION = 1;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMPORT__NAMESPACE = 2;

    /**
     * The number of structural features of the '<em>TImport</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMPORT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>TImport</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMPORT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TManualActivationRuleImpl <em>TManual Activation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TManualActivationRuleImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTManualActivationRule()
     * @generated
     */
    int TMANUAL_ACTIVATION_RULE = 20;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TManual Activation Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TManual Activation Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMANUAL_ACTIVATION_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TMilestoneImpl <em>TMilestone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TMilestoneImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTMilestone()
     * @generated
     */
    int TMILESTONE = 21;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE__DESCRIPTION = TPLAN_ITEM_DEFINITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE__ID = TPLAN_ITEM_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE__NAME = TPLAN_ITEM_DEFINITION__NAME;

    /**
     * The number of structural features of the '<em>TMilestone</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>TMilestone</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TMILESTONE_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TParameterMappingImpl <em>TParameter Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TParameterMappingImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTParameterMapping()
     * @generated
     */
    int TPARAMETER_MAPPING = 24;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Transformation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING__TRANSFORMATION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING__SOURCE_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING__TARGET_REF = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TParameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TParameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPARAMETER_MAPPING_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanFragmentImpl <em>TPlan Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanFragmentImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanFragment()
     * @generated
     */
    int TPLAN_FRAGMENT = 25;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__DESCRIPTION = TPLAN_ITEM_DEFINITION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__ID = TPLAN_ITEM_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__NAME = TPLAN_ITEM_DEFINITION__NAME;

    /**
     * The feature id for the '<em><b>Plan Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__PLAN_ITEM = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT__SENTRY = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TPlan Fragment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TPlan Fragment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_FRAGMENT_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanItemImpl <em>TPlan Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanItemImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItem()
     * @generated
     */
    int TPLAN_ITEM = 26;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Item Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__ITEM_CONTROL = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definition Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__DEFINITION_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entry Criteria Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__ENTRY_CRITERIA_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Exit Criteria Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__EXIT_CRITERIA_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>TPlan Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>TPlan Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanItemControlImpl <em>TPlan Item Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanItemControlImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemControl()
     * @generated
     */
    int TPLAN_ITEM_CONTROL = 27;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Repetition Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL__REPETITION_RULE = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Required Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL__REQUIRED_RULE = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Manual Activation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TPlan Item Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TPlan Item Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_CONTROL_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanItemOnPartImpl <em>TPlan Item On Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanItemOnPartImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemOnPart()
     * @generated
     */
    int TPLAN_ITEM_ON_PART = 29;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART__DESCRIPTION = TON_PART__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART__ID = TON_PART__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART__ANY_ATTRIBUTE = TON_PART__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Standard Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART__STANDARD_EVENT = TON_PART_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sentry Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART__SENTRY_REF = TON_PART_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART__SOURCE_REF = TON_PART_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TPlan Item On Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART_FEATURE_COUNT = TON_PART_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TPlan Item On Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_ON_PART_OPERATION_COUNT = TON_PART_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanItemStartTriggerImpl <em>TPlan Item Start Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanItemStartTriggerImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemStartTrigger()
     * @generated
     */
    int TPLAN_ITEM_START_TRIGGER = 30;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER__DESCRIPTION = TSTART_TRIGGER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER__ID = TSTART_TRIGGER__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER__ANY_ATTRIBUTE = TSTART_TRIGGER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Standard Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER__STANDARD_EVENT = TSTART_TRIGGER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER__SOURCE_REF = TSTART_TRIGGER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TPlan Item Start Trigger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER_FEATURE_COUNT = TSTART_TRIGGER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TPlan Item Start Trigger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLAN_ITEM_START_TRIGGER_OPERATION_COUNT = TSTART_TRIGGER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPlanningTableImpl <em>TPlanning Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPlanningTableImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanningTable()
     * @generated
     */
    int TPLANNING_TABLE = 31;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__DESCRIPTION = TTABLE_ITEM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__ID = TTABLE_ITEM__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__ANY_ATTRIBUTE = TTABLE_ITEM__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Applicability Rule Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__APPLICABILITY_RULE_REFS = TTABLE_ITEM__APPLICABILITY_RULE_REFS;

    /**
     * The feature id for the '<em><b>Authorized Role Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__AUTHORIZED_ROLE_REFS = TTABLE_ITEM__AUTHORIZED_ROLE_REFS;

    /**
     * The feature id for the '<em><b>Table Item Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__TABLE_ITEM_GROUP = TTABLE_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Table Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__TABLE_ITEM = TTABLE_ITEM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Applicability Rule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE__APPLICABILITY_RULE = TTABLE_ITEM_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TPlanning Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE_FEATURE_COUNT = TTABLE_ITEM_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TPlanning Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPLANNING_TABLE_OPERATION_COUNT = TTABLE_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TProcessImpl <em>TProcess</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TProcessImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProcess()
     * @generated
     */
    int TPROCESS = 32;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__INPUT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__OUTPUT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__IMPLEMENTATION_TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>TProcess</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>TProcess</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TProcessParameterImpl <em>TProcess Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TProcessParameterImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProcessParameter()
     * @generated
     */
    int TPROCESS_PARAMETER = 33;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_PARAMETER__DESCRIPTION = TPARAMETER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_PARAMETER__ID = TPARAMETER__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_PARAMETER__ANY_ATTRIBUTE = TPARAMETER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_PARAMETER__NAME = TPARAMETER__NAME;

    /**
     * The number of structural features of the '<em>TProcess Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_PARAMETER_FEATURE_COUNT = TPARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>TProcess Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_PARAMETER_OPERATION_COUNT = TPARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TProcessTaskImpl <em>TProcess Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TProcessTaskImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProcessTask()
     * @generated
     */
    int TPROCESS_TASK = 34;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__DESCRIPTION = TTASK__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__ID = TTASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__NAME = TTASK__NAME;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__INPUTS = TTASK__INPUTS;

    /**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__OUTPUTS = TTASK__OUTPUTS;

    /**
     * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

    /**
     * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__PARAMETER_MAPPING = TTASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Process Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK__PROCESS_REF = TTASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TProcess Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TProcess Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROCESS_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TPropertyImpl <em>TProperty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TPropertyImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProperty()
     * @generated
     */
    int TPROPERTY = 35;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY__TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>TProperty</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>TProperty</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TPROPERTY_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TRepetitionRuleImpl <em>TRepetition Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TRepetitionRuleImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTRepetitionRule()
     * @generated
     */
    int TREPETITION_RULE = 36;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TRepetition Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TRepetition Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREPETITION_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TRequiredRuleImpl <em>TRequired Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TRequiredRuleImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTRequiredRule()
     * @generated
     */
    int TREQUIRED_RULE = 37;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TRequired Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TRequired Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREQUIRED_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TRoleImpl <em>TRole</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TRoleImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTRole()
     * @generated
     */
    int TROLE = 38;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TROLE__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TROLE__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TROLE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TROLE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>TRole</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TROLE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>TRole</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TROLE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TSentryImpl <em>TSentry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TSentryImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTSentry()
     * @generated
     */
    int TSENTRY = 39;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__DESCRIPTION = TCMMN_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__ID = TCMMN_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>On Part Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__ON_PART_GROUP = TCMMN_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>On Part</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__ON_PART = TCMMN_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>If Part</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__IF_PART = TCMMN_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>TSentry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>TSentry</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSENTRY_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TStageImpl <em>TStage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TStageImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTStage()
     * @generated
     */
    int TSTAGE = 40;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__DESCRIPTION = TPLAN_FRAGMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__ID = TPLAN_FRAGMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__ANY_ATTRIBUTE = TPLAN_FRAGMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__DEFAULT_CONTROL = TPLAN_FRAGMENT__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__NAME = TPLAN_FRAGMENT__NAME;

    /**
     * The feature id for the '<em><b>Plan Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__PLAN_ITEM = TPLAN_FRAGMENT__PLAN_ITEM;

    /**
     * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__SENTRY = TPLAN_FRAGMENT__SENTRY;

    /**
     * The feature id for the '<em><b>Planning Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__PLANNING_TABLE = TPLAN_FRAGMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Plan Item Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__PLAN_ITEM_DEFINITION_GROUP = TPLAN_FRAGMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Plan Item Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__PLAN_ITEM_DEFINITION = TPLAN_FRAGMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Auto Complete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__AUTO_COMPLETE = TPLAN_FRAGMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Exit Criteria Refs</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE__EXIT_CRITERIA_REFS = TPLAN_FRAGMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>TStage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE_FEATURE_COUNT = TPLAN_FRAGMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>TStage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TSTAGE_OPERATION_COUNT = TPLAN_FRAGMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TTimerEventImpl <em>TTimer Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TTimerEventImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTTimerEvent()
     * @generated
     */
    int TTIMER_EVENT = 44;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__DESCRIPTION = TEVENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__ID = TEVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__ANY_ATTRIBUTE = TEVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__DEFAULT_CONTROL = TEVENT__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__NAME = TEVENT__NAME;

    /**
     * The feature id for the '<em><b>Timer Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__TIMER_EXPRESSION = TEVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Timer Start Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__TIMER_START_GROUP = TEVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Timer Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT__TIMER_START = TEVENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>TTimer Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT_FEATURE_COUNT = TEVENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>TTimer Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TTIMER_EVENT_OPERATION_COUNT = TEVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.impl.TUserEventImpl <em>TUser Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.impl.TUserEventImpl
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getTUserEvent()
     * @generated
     */
    int TUSER_EVENT = 45;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT__DESCRIPTION = TEVENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT__ID = TEVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT__ANY_ATTRIBUTE = TEVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Default Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT__DEFAULT_CONTROL = TEVENT__DEFAULT_CONTROL;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT__NAME = TEVENT__NAME;

    /**
     * The number of structural features of the '<em>TUser Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT_FEATURE_COUNT = TEVENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>TUser Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TUSER_EVENT_OPERATION_COUNT = TEVENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.cmmn.CaseFileItemTransition <em>Case File Item Transition</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.CaseFileItemTransition
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getCaseFileItemTransition()
     * @generated
     */
    int CASE_FILE_ITEM_TRANSITION = 46;

    /**
     * The meta object id for the '{@link org.omg.cmmn.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.DefinitionTypeEnumMember1
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getDefinitionTypeEnumMember1()
     * @generated
     */
    int DEFINITION_TYPE_ENUM_MEMBER1 = 47;

    /**
     * The meta object id for the '{@link org.omg.cmmn.MultiplicityEnum <em>Multiplicity Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.MultiplicityEnum
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getMultiplicityEnum()
     * @generated
     */
    int MULTIPLICITY_ENUM = 48;

    /**
     * The meta object id for the '{@link org.omg.cmmn.PlanItemTransition <em>Plan Item Transition</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.PlanItemTransition
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getPlanItemTransition()
     * @generated
     */
    int PLAN_ITEM_TRANSITION = 49;

    /**
     * The meta object id for the '{@link org.omg.cmmn.ProcessTypeEnumMember1 <em>Process Type Enum Member1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.ProcessTypeEnumMember1
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getProcessTypeEnumMember1()
     * @generated
     */
    int PROCESS_TYPE_ENUM_MEMBER1 = 50;

    /**
     * The meta object id for the '<em>Case File Item Transition Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.CaseFileItemTransition
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getCaseFileItemTransitionObject()
     * @generated
     */
    int CASE_FILE_ITEM_TRANSITION_OBJECT = 51;

    /**
     * The meta object id for the '<em>Definition Type Enum</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getDefinitionTypeEnum()
     * @generated
     */
    int DEFINITION_TYPE_ENUM = 52;

    /**
     * The meta object id for the '<em>Definition Type Enum Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.DefinitionTypeEnumMember1
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getDefinitionTypeEnumMember1Object()
     * @generated
     */
    int DEFINITION_TYPE_ENUM_MEMBER1_OBJECT = 53;

    /**
     * The meta object id for the '<em>Multiplicity Enum Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.MultiplicityEnum
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getMultiplicityEnumObject()
     * @generated
     */
    int MULTIPLICITY_ENUM_OBJECT = 54;

    /**
     * The meta object id for the '<em>Plan Item Transition Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.PlanItemTransition
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getPlanItemTransitionObject()
     * @generated
     */
    int PLAN_ITEM_TRANSITION_OBJECT = 55;

    /**
     * The meta object id for the '<em>Process Type Enum</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getProcessTypeEnum()
     * @generated
     */
    int PROCESS_TYPE_ENUM = 56;

    /**
     * The meta object id for the '<em>Process Type Enum Member1 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.cmmn.ProcessTypeEnumMember1
     * @see org.omg.cmmn.impl.CMMNPackageImpl#getProcessTypeEnumMember1Object()
     * @generated
     */
    int PROCESS_TYPE_ENUM_MEMBER1_OBJECT = 57;


    /**
     * Returns the meta object for class '{@link org.omg.cmmn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.omg.cmmn.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.omg.cmmn.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.omg.cmmn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.omg.cmmn.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.omg.cmmn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.omg.cmmn.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getApplicabilityRule <em>Applicability Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Applicability Rule</em>'.
     * @see org.omg.cmmn.DocumentRoot#getApplicabilityRule()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ApplicabilityRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCase <em>Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCase()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Case();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseFile <em>Case File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case File</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseFile()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseFile();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseFileItem <em>Case File Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case File Item</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseFileItem()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseFileItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseFileItemDefinition <em>Case File Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case File Item Definition</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseFileItemDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseFileItemDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseFileItemOnPart <em>Case File Item On Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case File Item On Part</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseFileItemOnPart()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseFileItemOnPart();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getOnPart <em>On Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>On Part</em>'.
     * @see org.omg.cmmn.DocumentRoot#getOnPart()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OnPart();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseFileItemStartTrigger <em>Case File Item Start Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case File Item Start Trigger</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseFileItemStartTrigger()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseFileItemStartTrigger();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getTimerStart <em>Timer Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Start</em>'.
     * @see org.omg.cmmn.DocumentRoot#getTimerStart()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TimerStart();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseParameter <em>Case Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case Parameter</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseParameter();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameter</em>'.
     * @see org.omg.cmmn.DocumentRoot#getParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Parameter();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getCaseTask <em>Case Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case Task</em>'.
     * @see org.omg.cmmn.DocumentRoot#getCaseTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CaseTask();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Task</em>'.
     * @see org.omg.cmmn.DocumentRoot#getTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Task();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanItemDefinition <em>Plan Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan Item Definition</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanItemDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanItemDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Definitions</em>'.
     * @see org.omg.cmmn.DocumentRoot#getDefinitions()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Definitions();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getDiscretionaryItem <em>Discretionary Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Discretionary Item</em>'.
     * @see org.omg.cmmn.DocumentRoot#getDiscretionaryItem()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DiscretionaryItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getTableItem <em>Table Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Table Item</em>'.
     * @see org.omg.cmmn.DocumentRoot#getTableItem()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TableItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getEvent <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event</em>'.
     * @see org.omg.cmmn.DocumentRoot#getEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Event();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.omg.cmmn.DocumentRoot#getExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Expression();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getHumanTask <em>Human Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Human Task</em>'.
     * @see org.omg.cmmn.DocumentRoot#getHumanTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HumanTask();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getIfPart <em>If Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>If Part</em>'.
     * @see org.omg.cmmn.DocumentRoot#getIfPart()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IfPart();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import</em>'.
     * @see org.omg.cmmn.DocumentRoot#getImport()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Import();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getManualActivationRule <em>Manual Activation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manual Activation Rule</em>'.
     * @see org.omg.cmmn.DocumentRoot#getManualActivationRule()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ManualActivationRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getMilestone <em>Milestone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Milestone</em>'.
     * @see org.omg.cmmn.DocumentRoot#getMilestone()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Milestone();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getParameterMapping <em>Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameter Mapping</em>'.
     * @see org.omg.cmmn.DocumentRoot#getParameterMapping()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParameterMapping();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanFragment <em>Plan Fragment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan Fragment</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanFragment()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanFragment();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanItem <em>Plan Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan Item</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanItem()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanItemControl <em>Plan Item Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan Item Control</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanItemControl()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanItemControl();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanItemOnPart <em>Plan Item On Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan Item On Part</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanItemOnPart()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanItemOnPart();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanItemStartTrigger <em>Plan Item Start Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plan Item Start Trigger</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanItemStartTrigger()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanItemStartTrigger();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getPlanningTable <em>Planning Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Planning Table</em>'.
     * @see org.omg.cmmn.DocumentRoot#getPlanningTable()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PlanningTable();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process</em>'.
     * @see org.omg.cmmn.DocumentRoot#getProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Process();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getProcessParameter <em>Process Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process Parameter</em>'.
     * @see org.omg.cmmn.DocumentRoot#getProcessParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ProcessParameter();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getProcessTask <em>Process Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process Task</em>'.
     * @see org.omg.cmmn.DocumentRoot#getProcessTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ProcessTask();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.omg.cmmn.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Property();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getRepetitionRule <em>Repetition Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Repetition Rule</em>'.
     * @see org.omg.cmmn.DocumentRoot#getRepetitionRule()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RepetitionRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getRequiredRule <em>Required Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Required Rule</em>'.
     * @see org.omg.cmmn.DocumentRoot#getRequiredRule()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RequiredRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Role</em>'.
     * @see org.omg.cmmn.DocumentRoot#getRole()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Role();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getSentry <em>Sentry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sentry</em>'.
     * @see org.omg.cmmn.DocumentRoot#getSentry()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Sentry();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getStage <em>Stage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Stage</em>'.
     * @see org.omg.cmmn.DocumentRoot#getStage()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Stage();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getTimerEvent <em>Timer Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Event</em>'.
     * @see org.omg.cmmn.DocumentRoot#getTimerEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TimerEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.DocumentRoot#getUserEvent <em>User Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>User Event</em>'.
     * @see org.omg.cmmn.DocumentRoot#getUserEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_UserEvent();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TApplicabilityRule <em>TApplicability Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TApplicability Rule</em>'.
     * @see org.omg.cmmn.TApplicabilityRule
     * @generated
     */
    EClass getTApplicabilityRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TApplicabilityRule#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.omg.cmmn.TApplicabilityRule#getCondition()
     * @see #getTApplicabilityRule()
     * @generated
     */
    EReference getTApplicabilityRule_Condition();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TApplicabilityRule#getContextRef <em>Context Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Ref</em>'.
     * @see org.omg.cmmn.TApplicabilityRule#getContextRef()
     * @see #getTApplicabilityRule()
     * @generated
     */
    EReference getTApplicabilityRule_ContextRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCase <em>TCase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase</em>'.
     * @see org.omg.cmmn.TCase
     * @generated
     */
    EClass getTCase();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TCase#getCaseFileModel <em>Case File Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case File Model</em>'.
     * @see org.omg.cmmn.TCase#getCaseFileModel()
     * @see #getTCase()
     * @generated
     */
    EReference getTCase_CaseFileModel();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TCase#getCasePlanModel <em>Case Plan Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Case Plan Model</em>'.
     * @see org.omg.cmmn.TCase#getCasePlanModel()
     * @see #getTCase()
     * @generated
     */
    EReference getTCase_CasePlanModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TCase#getCaseRoles <em>Case Roles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Case Roles</em>'.
     * @see org.omg.cmmn.TCase#getCaseRoles()
     * @see #getTCase()
     * @generated
     */
    EReference getTCase_CaseRoles();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TCase#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input</em>'.
     * @see org.omg.cmmn.TCase#getInput()
     * @see #getTCase()
     * @generated
     */
    EReference getTCase_Input();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TCase#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output</em>'.
     * @see org.omg.cmmn.TCase#getOutput()
     * @see #getTCase()
     * @generated
     */
    EReference getTCase_Output();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCase#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TCase#getName()
     * @see #getTCase()
     * @generated
     */
    EAttribute getTCase_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseFile <em>TCase File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase File</em>'.
     * @see org.omg.cmmn.TCaseFile
     * @generated
     */
    EClass getTCaseFile();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TCaseFile#getCaseFileItem <em>Case File Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Case File Item</em>'.
     * @see org.omg.cmmn.TCaseFile#getCaseFileItem()
     * @see #getTCaseFile()
     * @generated
     */
    EReference getTCaseFile_CaseFileItem();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseFileItem <em>TCase File Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase File Item</em>'.
     * @see org.omg.cmmn.TCaseFileItem
     * @generated
     */
    EClass getTCaseFileItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TCaseFileItem#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Children</em>'.
     * @see org.omg.cmmn.TCaseFileItem#getChildren()
     * @see #getTCaseFileItem()
     * @generated
     */
    EReference getTCaseFileItem_Children();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TCaseFileItem#getDefinitionRef <em>Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Definition Ref</em>'.
     * @see org.omg.cmmn.TCaseFileItem#getDefinitionRef()
     * @see #getTCaseFileItem()
     * @generated
     */
    EReference getTCaseFileItem_DefinitionRef();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItem#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplicity</em>'.
     * @see org.omg.cmmn.TCaseFileItem#getMultiplicity()
     * @see #getTCaseFileItem()
     * @generated
     */
    EAttribute getTCaseFileItem_Multiplicity();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItem#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TCaseFileItem#getName()
     * @see #getTCaseFileItem()
     * @generated
     */
    EAttribute getTCaseFileItem_Name();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TCaseFileItem#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Source Ref</em>'.
     * @see org.omg.cmmn.TCaseFileItem#getSourceRef()
     * @see #getTCaseFileItem()
     * @generated
     */
    EReference getTCaseFileItem_SourceRef();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TCaseFileItem#getTargetRefs <em>Target Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Target Refs</em>'.
     * @see org.omg.cmmn.TCaseFileItem#getTargetRefs()
     * @see #getTCaseFileItem()
     * @generated
     */
    EReference getTCaseFileItem_TargetRefs();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseFileItemDefinition <em>TCase File Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase File Item Definition</em>'.
     * @see org.omg.cmmn.TCaseFileItemDefinition
     * @generated
     */
    EClass getTCaseFileItemDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TCaseFileItemDefinition#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.omg.cmmn.TCaseFileItemDefinition#getProperty()
     * @see #getTCaseFileItemDefinition()
     * @generated
     */
    EReference getTCaseFileItemDefinition_Property();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItemDefinition#getDefinitionType <em>Definition Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition Type</em>'.
     * @see org.omg.cmmn.TCaseFileItemDefinition#getDefinitionType()
     * @see #getTCaseFileItemDefinition()
     * @generated
     */
    EAttribute getTCaseFileItemDefinition_DefinitionType();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItemDefinition#getImportRef <em>Import Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Import Ref</em>'.
     * @see org.omg.cmmn.TCaseFileItemDefinition#getImportRef()
     * @see #getTCaseFileItemDefinition()
     * @generated
     */
    EAttribute getTCaseFileItemDefinition_ImportRef();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItemDefinition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TCaseFileItemDefinition#getName()
     * @see #getTCaseFileItemDefinition()
     * @generated
     */
    EAttribute getTCaseFileItemDefinition_Name();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItemDefinition#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.omg.cmmn.TCaseFileItemDefinition#getStructureRef()
     * @see #getTCaseFileItemDefinition()
     * @generated
     */
    EAttribute getTCaseFileItemDefinition_StructureRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseFileItemOnPart <em>TCase File Item On Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase File Item On Part</em>'.
     * @see org.omg.cmmn.TCaseFileItemOnPart
     * @generated
     */
    EClass getTCaseFileItemOnPart();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItemOnPart#getStandardEvent <em>Standard Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standard Event</em>'.
     * @see org.omg.cmmn.TCaseFileItemOnPart#getStandardEvent()
     * @see #getTCaseFileItemOnPart()
     * @generated
     */
    EAttribute getTCaseFileItemOnPart_StandardEvent();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TCaseFileItemOnPart#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.omg.cmmn.TCaseFileItemOnPart#getSourceRef()
     * @see #getTCaseFileItemOnPart()
     * @generated
     */
    EReference getTCaseFileItemOnPart_SourceRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseFileItemStartTrigger <em>TCase File Item Start Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase File Item Start Trigger</em>'.
     * @see org.omg.cmmn.TCaseFileItemStartTrigger
     * @generated
     */
    EClass getTCaseFileItemStartTrigger();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCaseFileItemStartTrigger#getStandardEvent <em>Standard Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standard Event</em>'.
     * @see org.omg.cmmn.TCaseFileItemStartTrigger#getStandardEvent()
     * @see #getTCaseFileItemStartTrigger()
     * @generated
     */
    EAttribute getTCaseFileItemStartTrigger_StandardEvent();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TCaseFileItemStartTrigger#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.omg.cmmn.TCaseFileItemStartTrigger#getSourceRef()
     * @see #getTCaseFileItemStartTrigger()
     * @generated
     */
    EReference getTCaseFileItemStartTrigger_SourceRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseParameter <em>TCase Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase Parameter</em>'.
     * @see org.omg.cmmn.TCaseParameter
     * @generated
     */
    EClass getTCaseParameter();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TCaseParameter#getBindingRefinement <em>Binding Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Refinement</em>'.
     * @see org.omg.cmmn.TCaseParameter#getBindingRefinement()
     * @see #getTCaseParameter()
     * @generated
     */
    EReference getTCaseParameter_BindingRefinement();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TCaseParameter#getBindingRef <em>Binding Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Binding Ref</em>'.
     * @see org.omg.cmmn.TCaseParameter#getBindingRef()
     * @see #getTCaseParameter()
     * @generated
     */
    EReference getTCaseParameter_BindingRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCaseTask <em>TCase Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCase Task</em>'.
     * @see org.omg.cmmn.TCaseTask
     * @generated
     */
    EClass getTCaseTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TCaseTask#getParameterMapping <em>Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Mapping</em>'.
     * @see org.omg.cmmn.TCaseTask#getParameterMapping()
     * @see #getTCaseTask()
     * @generated
     */
    EReference getTCaseTask_ParameterMapping();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TCaseTask#getCaseRef <em>Case Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Case Ref</em>'.
     * @see org.omg.cmmn.TCaseTask#getCaseRef()
     * @see #getTCaseTask()
     * @generated
     */
    EReference getTCaseTask_CaseRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TChildren <em>TChildren</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TChildren</em>'.
     * @see org.omg.cmmn.TChildren
     * @generated
     */
    EClass getTChildren();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TChildren#getCaseFileItem <em>Case File Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Case File Item</em>'.
     * @see org.omg.cmmn.TChildren#getCaseFileItem()
     * @see #getTChildren()
     * @generated
     */
    EReference getTChildren_CaseFileItem();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCmmnElement <em>TCmmn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCmmn Element</em>'.
     * @see org.omg.cmmn.TCmmnElement
     * @generated
     */
    EClass getTCmmnElement();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCmmnElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.omg.cmmn.TCmmnElement#getDescription()
     * @see #getTCmmnElement()
     * @generated
     */
    EAttribute getTCmmnElement_Description();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCmmnElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.omg.cmmn.TCmmnElement#getId()
     * @see #getTCmmnElement()
     * @generated
     */
    EAttribute getTCmmnElement_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TCmmnElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.omg.cmmn.TCmmnElement#getAnyAttribute()
     * @see #getTCmmnElement()
     * @generated
     */
    EAttribute getTCmmnElement_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TCmmnElementWithMixedContent <em>TCmmn Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TCmmn Element With Mixed Content</em>'.
     * @see org.omg.cmmn.TCmmnElementWithMixedContent
     * @generated
     */
    EClass getTCmmnElementWithMixedContent();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TCmmnElementWithMixedContent#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.omg.cmmn.TCmmnElementWithMixedContent#getMixed()
     * @see #getTCmmnElementWithMixedContent()
     * @generated
     */
    EAttribute getTCmmnElementWithMixedContent_Mixed();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCmmnElementWithMixedContent#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.omg.cmmn.TCmmnElementWithMixedContent#getDescription()
     * @see #getTCmmnElementWithMixedContent()
     * @generated
     */
    EAttribute getTCmmnElementWithMixedContent_Description();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TCmmnElementWithMixedContent#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.omg.cmmn.TCmmnElementWithMixedContent#getId()
     * @see #getTCmmnElementWithMixedContent()
     * @generated
     */
    EAttribute getTCmmnElementWithMixedContent_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TCmmnElementWithMixedContent#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.omg.cmmn.TCmmnElementWithMixedContent#getAnyAttribute()
     * @see #getTCmmnElementWithMixedContent()
     * @generated
     */
    EAttribute getTCmmnElementWithMixedContent_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TDefinitions <em>TDefinitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TDefinitions</em>'.
     * @see org.omg.cmmn.TDefinitions
     * @generated
     */
    EClass getTDefinitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TDefinitions#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Import</em>'.
     * @see org.omg.cmmn.TDefinitions#getImport()
     * @see #getTDefinitions()
     * @generated
     */
    EReference getTDefinitions_Import();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TDefinitions#getCaseFileItemDefinition <em>Case File Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Case File Item Definition</em>'.
     * @see org.omg.cmmn.TDefinitions#getCaseFileItemDefinition()
     * @see #getTDefinitions()
     * @generated
     */
    EReference getTDefinitions_CaseFileItemDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TDefinitions#getCase <em>Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Case</em>'.
     * @see org.omg.cmmn.TDefinitions#getCase()
     * @see #getTDefinitions()
     * @generated
     */
    EReference getTDefinitions_Case();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TDefinitions#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process</em>'.
     * @see org.omg.cmmn.TDefinitions#getProcess()
     * @see #getTDefinitions()
     * @generated
     */
    EReference getTDefinitions_Process();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see org.omg.cmmn.TDefinitions#getAuthor()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_Author();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getCreationDate <em>Creation Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creation Date</em>'.
     * @see org.omg.cmmn.TDefinitions#getCreationDate()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_CreationDate();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getExporter <em>Exporter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exporter</em>'.
     * @see org.omg.cmmn.TDefinitions#getExporter()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_Exporter();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getExporterVersion <em>Exporter Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exporter Version</em>'.
     * @see org.omg.cmmn.TDefinitions#getExporterVersion()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_ExporterVersion();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Language</em>'.
     * @see org.omg.cmmn.TDefinitions#getExpressionLanguage()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_ExpressionLanguage();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.omg.cmmn.TDefinitions#getId()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_Id();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TDefinitions#getName()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_Name();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.omg.cmmn.TDefinitions#getTargetNamespace()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_TargetNamespace();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TDefinitions#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.omg.cmmn.TDefinitions#getAnyAttribute()
     * @see #getTDefinitions()
     * @generated
     */
    EAttribute getTDefinitions_AnyAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TDefinitions#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Diagram</em>'.
     * @see org.omg.cmmn.TDefinitions#getDiagram()
     * @see #getTDefinitions()
     * @generated
     */
    EReference getTDefinitions_Diagram();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TDiscretionaryItem <em>TDiscretionary Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TDiscretionary Item</em>'.
     * @see org.omg.cmmn.TDiscretionaryItem
     * @generated
     */
    EClass getTDiscretionaryItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TDiscretionaryItem#getItemControl <em>Item Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Item Control</em>'.
     * @see org.omg.cmmn.TDiscretionaryItem#getItemControl()
     * @see #getTDiscretionaryItem()
     * @generated
     */
    EReference getTDiscretionaryItem_ItemControl();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TDiscretionaryItem#getDefinitionRef <em>Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Definition Ref</em>'.
     * @see org.omg.cmmn.TDiscretionaryItem#getDefinitionRef()
     * @see #getTDiscretionaryItem()
     * @generated
     */
    EReference getTDiscretionaryItem_DefinitionRef();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TDiscretionaryItem#getEntryCriteriaRefs <em>Entry Criteria Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Entry Criteria Refs</em>'.
     * @see org.omg.cmmn.TDiscretionaryItem#getEntryCriteriaRefs()
     * @see #getTDiscretionaryItem()
     * @generated
     */
    EReference getTDiscretionaryItem_EntryCriteriaRefs();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TDiscretionaryItem#getExitCriteriaRefs <em>Exit Criteria Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Exit Criteria Refs</em>'.
     * @see org.omg.cmmn.TDiscretionaryItem#getExitCriteriaRefs()
     * @see #getTDiscretionaryItem()
     * @generated
     */
    EReference getTDiscretionaryItem_ExitCriteriaRefs();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TEvent <em>TEvent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TEvent</em>'.
     * @see org.omg.cmmn.TEvent
     * @generated
     */
    EClass getTEvent();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TExpression <em>TExpression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TExpression</em>'.
     * @see org.omg.cmmn.TExpression
     * @generated
     */
    EClass getTExpression();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TExpression#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see org.omg.cmmn.TExpression#getBody()
     * @see #getTExpression()
     * @generated
     */
    EAttribute getTExpression_Body();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TExpression#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.omg.cmmn.TExpression#getLanguage()
     * @see #getTExpression()
     * @generated
     */
    EAttribute getTExpression_Language();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.THumanTask <em>THuman Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>THuman Task</em>'.
     * @see org.omg.cmmn.THumanTask
     * @generated
     */
    EClass getTHumanTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.THumanTask#getPlanningTable <em>Planning Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Planning Table</em>'.
     * @see org.omg.cmmn.THumanTask#getPlanningTable()
     * @see #getTHumanTask()
     * @generated
     */
    EReference getTHumanTask_PlanningTable();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.THumanTask#getPerformerRef <em>Performer Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Performer Ref</em>'.
     * @see org.omg.cmmn.THumanTask#getPerformerRef()
     * @see #getTHumanTask()
     * @generated
     */
    EReference getTHumanTask_PerformerRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TIfPart <em>TIf Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TIf Part</em>'.
     * @see org.omg.cmmn.TIfPart
     * @generated
     */
    EClass getTIfPart();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TIfPart#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Condition</em>'.
     * @see org.omg.cmmn.TIfPart#getCondition()
     * @see #getTIfPart()
     * @generated
     */
    EReference getTIfPart_Condition();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TIfPart#getContextRef <em>Context Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Ref</em>'.
     * @see org.omg.cmmn.TIfPart#getContextRef()
     * @see #getTIfPart()
     * @generated
     */
    EReference getTIfPart_ContextRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TImport <em>TImport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TImport</em>'.
     * @see org.omg.cmmn.TImport
     * @generated
     */
    EClass getTImport();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TImport#getImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Import Type</em>'.
     * @see org.omg.cmmn.TImport#getImportType()
     * @see #getTImport()
     * @generated
     */
    EAttribute getTImport_ImportType();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TImport#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.omg.cmmn.TImport#getLocation()
     * @see #getTImport()
     * @generated
     */
    EAttribute getTImport_Location();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TImport#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.omg.cmmn.TImport#getNamespace()
     * @see #getTImport()
     * @generated
     */
    EAttribute getTImport_Namespace();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TManualActivationRule <em>TManual Activation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TManual Activation Rule</em>'.
     * @see org.omg.cmmn.TManualActivationRule
     * @generated
     */
    EClass getTManualActivationRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TManualActivationRule#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.omg.cmmn.TManualActivationRule#getCondition()
     * @see #getTManualActivationRule()
     * @generated
     */
    EReference getTManualActivationRule_Condition();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TManualActivationRule#getContextRef <em>Context Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Ref</em>'.
     * @see org.omg.cmmn.TManualActivationRule#getContextRef()
     * @see #getTManualActivationRule()
     * @generated
     */
    EReference getTManualActivationRule_ContextRef();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TManualActivationRule#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TManualActivationRule#getName()
     * @see #getTManualActivationRule()
     * @generated
     */
    EAttribute getTManualActivationRule_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TMilestone <em>TMilestone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TMilestone</em>'.
     * @see org.omg.cmmn.TMilestone
     * @generated
     */
    EClass getTMilestone();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TOnPart <em>TOn Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TOn Part</em>'.
     * @see org.omg.cmmn.TOnPart
     * @generated
     */
    EClass getTOnPart();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TParameter <em>TParameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TParameter</em>'.
     * @see org.omg.cmmn.TParameter
     * @generated
     */
    EClass getTParameter();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TParameter#getName()
     * @see #getTParameter()
     * @generated
     */
    EAttribute getTParameter_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TParameterMapping <em>TParameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TParameter Mapping</em>'.
     * @see org.omg.cmmn.TParameterMapping
     * @generated
     */
    EClass getTParameterMapping();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TParameterMapping#getTransformation <em>Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transformation</em>'.
     * @see org.omg.cmmn.TParameterMapping#getTransformation()
     * @see #getTParameterMapping()
     * @generated
     */
    EReference getTParameterMapping_Transformation();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TParameterMapping#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.omg.cmmn.TParameterMapping#getSourceRef()
     * @see #getTParameterMapping()
     * @generated
     */
    EReference getTParameterMapping_SourceRef();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TParameterMapping#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Ref</em>'.
     * @see org.omg.cmmn.TParameterMapping#getTargetRef()
     * @see #getTParameterMapping()
     * @generated
     */
    EReference getTParameterMapping_TargetRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanFragment <em>TPlan Fragment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlan Fragment</em>'.
     * @see org.omg.cmmn.TPlanFragment
     * @generated
     */
    EClass getTPlanFragment();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TPlanFragment#getPlanItem <em>Plan Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Plan Item</em>'.
     * @see org.omg.cmmn.TPlanFragment#getPlanItem()
     * @see #getTPlanFragment()
     * @generated
     */
    EReference getTPlanFragment_PlanItem();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TPlanFragment#getSentry <em>Sentry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sentry</em>'.
     * @see org.omg.cmmn.TPlanFragment#getSentry()
     * @see #getTPlanFragment()
     * @generated
     */
    EReference getTPlanFragment_Sentry();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanItem <em>TPlan Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlan Item</em>'.
     * @see org.omg.cmmn.TPlanItem
     * @generated
     */
    EClass getTPlanItem();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TPlanItem#getItemControl <em>Item Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Item Control</em>'.
     * @see org.omg.cmmn.TPlanItem#getItemControl()
     * @see #getTPlanItem()
     * @generated
     */
    EReference getTPlanItem_ItemControl();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TPlanItem#getDefinitionRef <em>Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Definition Ref</em>'.
     * @see org.omg.cmmn.TPlanItem#getDefinitionRef()
     * @see #getTPlanItem()
     * @generated
     */
    EReference getTPlanItem_DefinitionRef();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TPlanItem#getEntryCriteriaRefs <em>Entry Criteria Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Entry Criteria Refs</em>'.
     * @see org.omg.cmmn.TPlanItem#getEntryCriteriaRefs()
     * @see #getTPlanItem()
     * @generated
     */
    EReference getTPlanItem_EntryCriteriaRefs();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TPlanItem#getExitCriteriaRefs <em>Exit Criteria Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Exit Criteria Refs</em>'.
     * @see org.omg.cmmn.TPlanItem#getExitCriteriaRefs()
     * @see #getTPlanItem()
     * @generated
     */
    EReference getTPlanItem_ExitCriteriaRefs();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TPlanItem#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TPlanItem#getName()
     * @see #getTPlanItem()
     * @generated
     */
    EAttribute getTPlanItem_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanItemControl <em>TPlan Item Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlan Item Control</em>'.
     * @see org.omg.cmmn.TPlanItemControl
     * @generated
     */
    EClass getTPlanItemControl();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TPlanItemControl#getRepetitionRule <em>Repetition Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Repetition Rule</em>'.
     * @see org.omg.cmmn.TPlanItemControl#getRepetitionRule()
     * @see #getTPlanItemControl()
     * @generated
     */
    EReference getTPlanItemControl_RepetitionRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TPlanItemControl#getRequiredRule <em>Required Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Required Rule</em>'.
     * @see org.omg.cmmn.TPlanItemControl#getRequiredRule()
     * @see #getTPlanItemControl()
     * @generated
     */
    EReference getTPlanItemControl_RequiredRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TPlanItemControl#getManualActivationRule <em>Manual Activation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manual Activation Rule</em>'.
     * @see org.omg.cmmn.TPlanItemControl#getManualActivationRule()
     * @see #getTPlanItemControl()
     * @generated
     */
    EReference getTPlanItemControl_ManualActivationRule();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanItemDefinition <em>TPlan Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlan Item Definition</em>'.
     * @see org.omg.cmmn.TPlanItemDefinition
     * @generated
     */
    EClass getTPlanItemDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TPlanItemDefinition#getDefaultControl <em>Default Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Control</em>'.
     * @see org.omg.cmmn.TPlanItemDefinition#getDefaultControl()
     * @see #getTPlanItemDefinition()
     * @generated
     */
    EReference getTPlanItemDefinition_DefaultControl();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TPlanItemDefinition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TPlanItemDefinition#getName()
     * @see #getTPlanItemDefinition()
     * @generated
     */
    EAttribute getTPlanItemDefinition_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanItemOnPart <em>TPlan Item On Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlan Item On Part</em>'.
     * @see org.omg.cmmn.TPlanItemOnPart
     * @generated
     */
    EClass getTPlanItemOnPart();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TPlanItemOnPart#getStandardEvent <em>Standard Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standard Event</em>'.
     * @see org.omg.cmmn.TPlanItemOnPart#getStandardEvent()
     * @see #getTPlanItemOnPart()
     * @generated
     */
    EAttribute getTPlanItemOnPart_StandardEvent();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TPlanItemOnPart#getSentryRef <em>Sentry Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sentry Ref</em>'.
     * @see org.omg.cmmn.TPlanItemOnPart#getSentryRef()
     * @see #getTPlanItemOnPart()
     * @generated
     */
    EReference getTPlanItemOnPart_SentryRef();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TPlanItemOnPart#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.omg.cmmn.TPlanItemOnPart#getSourceRef()
     * @see #getTPlanItemOnPart()
     * @generated
     */
    EReference getTPlanItemOnPart_SourceRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanItemStartTrigger <em>TPlan Item Start Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlan Item Start Trigger</em>'.
     * @see org.omg.cmmn.TPlanItemStartTrigger
     * @generated
     */
    EClass getTPlanItemStartTrigger();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TPlanItemStartTrigger#getStandardEvent <em>Standard Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standard Event</em>'.
     * @see org.omg.cmmn.TPlanItemStartTrigger#getStandardEvent()
     * @see #getTPlanItemStartTrigger()
     * @generated
     */
    EAttribute getTPlanItemStartTrigger_StandardEvent();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TPlanItemStartTrigger#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Ref</em>'.
     * @see org.omg.cmmn.TPlanItemStartTrigger#getSourceRef()
     * @see #getTPlanItemStartTrigger()
     * @generated
     */
    EReference getTPlanItemStartTrigger_SourceRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TPlanningTable <em>TPlanning Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TPlanning Table</em>'.
     * @see org.omg.cmmn.TPlanningTable
     * @generated
     */
    EClass getTPlanningTable();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TPlanningTable#getTableItemGroup <em>Table Item Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Table Item Group</em>'.
     * @see org.omg.cmmn.TPlanningTable#getTableItemGroup()
     * @see #getTPlanningTable()
     * @generated
     */
    EAttribute getTPlanningTable_TableItemGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TPlanningTable#getTableItem <em>Table Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Table Item</em>'.
     * @see org.omg.cmmn.TPlanningTable#getTableItem()
     * @see #getTPlanningTable()
     * @generated
     */
    EReference getTPlanningTable_TableItem();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TPlanningTable#getApplicabilityRule <em>Applicability Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applicability Rule</em>'.
     * @see org.omg.cmmn.TPlanningTable#getApplicabilityRule()
     * @see #getTPlanningTable()
     * @generated
     */
    EReference getTPlanningTable_ApplicabilityRule();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TProcess <em>TProcess</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TProcess</em>'.
     * @see org.omg.cmmn.TProcess
     * @generated
     */
    EClass getTProcess();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TProcess#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input</em>'.
     * @see org.omg.cmmn.TProcess#getInput()
     * @see #getTProcess()
     * @generated
     */
    EReference getTProcess_Input();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TProcess#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output</em>'.
     * @see org.omg.cmmn.TProcess#getOutput()
     * @see #getTProcess()
     * @generated
     */
    EReference getTProcess_Output();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TProcess#getImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation Type</em>'.
     * @see org.omg.cmmn.TProcess#getImplementationType()
     * @see #getTProcess()
     * @generated
     */
    EAttribute getTProcess_ImplementationType();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TProcess#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TProcess#getName()
     * @see #getTProcess()
     * @generated
     */
    EAttribute getTProcess_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TProcessParameter <em>TProcess Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TProcess Parameter</em>'.
     * @see org.omg.cmmn.TProcessParameter
     * @generated
     */
    EClass getTProcessParameter();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TProcessTask <em>TProcess Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TProcess Task</em>'.
     * @see org.omg.cmmn.TProcessTask
     * @generated
     */
    EClass getTProcessTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TProcessTask#getParameterMapping <em>Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Mapping</em>'.
     * @see org.omg.cmmn.TProcessTask#getParameterMapping()
     * @see #getTProcessTask()
     * @generated
     */
    EReference getTProcessTask_ParameterMapping();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TProcessTask#getProcessRef <em>Process Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Process Ref</em>'.
     * @see org.omg.cmmn.TProcessTask#getProcessRef()
     * @see #getTProcessTask()
     * @generated
     */
    EReference getTProcessTask_ProcessRef();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TProperty <em>TProperty</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TProperty</em>'.
     * @see org.omg.cmmn.TProperty
     * @generated
     */
    EClass getTProperty();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TProperty#getName()
     * @see #getTProperty()
     * @generated
     */
    EAttribute getTProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.omg.cmmn.TProperty#getType()
     * @see #getTProperty()
     * @generated
     */
    EAttribute getTProperty_Type();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TRepetitionRule <em>TRepetition Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRepetition Rule</em>'.
     * @see org.omg.cmmn.TRepetitionRule
     * @generated
     */
    EClass getTRepetitionRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TRepetitionRule#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.omg.cmmn.TRepetitionRule#getCondition()
     * @see #getTRepetitionRule()
     * @generated
     */
    EReference getTRepetitionRule_Condition();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TRepetitionRule#getContextRef <em>Context Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Ref</em>'.
     * @see org.omg.cmmn.TRepetitionRule#getContextRef()
     * @see #getTRepetitionRule()
     * @generated
     */
    EReference getTRepetitionRule_ContextRef();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TRepetitionRule#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TRepetitionRule#getName()
     * @see #getTRepetitionRule()
     * @generated
     */
    EAttribute getTRepetitionRule_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TRequiredRule <em>TRequired Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRequired Rule</em>'.
     * @see org.omg.cmmn.TRequiredRule
     * @generated
     */
    EClass getTRequiredRule();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TRequiredRule#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.omg.cmmn.TRequiredRule#getCondition()
     * @see #getTRequiredRule()
     * @generated
     */
    EReference getTRequiredRule_Condition();

    /**
     * Returns the meta object for the reference '{@link org.omg.cmmn.TRequiredRule#getContextRef <em>Context Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Ref</em>'.
     * @see org.omg.cmmn.TRequiredRule#getContextRef()
     * @see #getTRequiredRule()
     * @generated
     */
    EReference getTRequiredRule_ContextRef();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TRequiredRule#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TRequiredRule#getName()
     * @see #getTRequiredRule()
     * @generated
     */
    EAttribute getTRequiredRule_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TRole <em>TRole</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRole</em>'.
     * @see org.omg.cmmn.TRole
     * @generated
     */
    EClass getTRole();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TRole#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TRole#getName()
     * @see #getTRole()
     * @generated
     */
    EAttribute getTRole_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TSentry <em>TSentry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TSentry</em>'.
     * @see org.omg.cmmn.TSentry
     * @generated
     */
    EClass getTSentry();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TSentry#getOnPartGroup <em>On Part Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>On Part Group</em>'.
     * @see org.omg.cmmn.TSentry#getOnPartGroup()
     * @see #getTSentry()
     * @generated
     */
    EAttribute getTSentry_OnPartGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TSentry#getOnPart <em>On Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>On Part</em>'.
     * @see org.omg.cmmn.TSentry#getOnPart()
     * @see #getTSentry()
     * @generated
     */
    EReference getTSentry_OnPart();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TSentry#getIfPart <em>If Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>If Part</em>'.
     * @see org.omg.cmmn.TSentry#getIfPart()
     * @see #getTSentry()
     * @generated
     */
    EReference getTSentry_IfPart();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TSentry#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.cmmn.TSentry#getName()
     * @see #getTSentry()
     * @generated
     */
    EAttribute getTSentry_Name();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TStage <em>TStage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TStage</em>'.
     * @see org.omg.cmmn.TStage
     * @generated
     */
    EClass getTStage();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TStage#getPlanningTable <em>Planning Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Planning Table</em>'.
     * @see org.omg.cmmn.TStage#getPlanningTable()
     * @see #getTStage()
     * @generated
     */
    EReference getTStage_PlanningTable();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TStage#getPlanItemDefinitionGroup <em>Plan Item Definition Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Plan Item Definition Group</em>'.
     * @see org.omg.cmmn.TStage#getPlanItemDefinitionGroup()
     * @see #getTStage()
     * @generated
     */
    EAttribute getTStage_PlanItemDefinitionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TStage#getPlanItemDefinition <em>Plan Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Plan Item Definition</em>'.
     * @see org.omg.cmmn.TStage#getPlanItemDefinition()
     * @see #getTStage()
     * @generated
     */
    EReference getTStage_PlanItemDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TStage#isAutoComplete <em>Auto Complete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Complete</em>'.
     * @see org.omg.cmmn.TStage#isAutoComplete()
     * @see #getTStage()
     * @generated
     */
    EAttribute getTStage_AutoComplete();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TStage#getExitCriteriaRefs <em>Exit Criteria Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Exit Criteria Refs</em>'.
     * @see org.omg.cmmn.TStage#getExitCriteriaRefs()
     * @see #getTStage()
     * @generated
     */
    EReference getTStage_ExitCriteriaRefs();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TStartTrigger <em>TStart Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TStart Trigger</em>'.
     * @see org.omg.cmmn.TStartTrigger
     * @generated
     */
    EClass getTStartTrigger();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TTableItem <em>TTable Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TTable Item</em>'.
     * @see org.omg.cmmn.TTableItem
     * @generated
     */
    EClass getTTableItem();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TTableItem#getApplicabilityRuleRefs <em>Applicability Rule Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Applicability Rule Refs</em>'.
     * @see org.omg.cmmn.TTableItem#getApplicabilityRuleRefs()
     * @see #getTTableItem()
     * @generated
     */
    EReference getTTableItem_ApplicabilityRuleRefs();

    /**
     * Returns the meta object for the reference list '{@link org.omg.cmmn.TTableItem#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Authorized Role Refs</em>'.
     * @see org.omg.cmmn.TTableItem#getAuthorizedRoleRefs()
     * @see #getTTableItem()
     * @generated
     */
    EReference getTTableItem_AuthorizedRoleRefs();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TTask <em>TTask</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TTask</em>'.
     * @see org.omg.cmmn.TTask
     * @generated
     */
    EClass getTTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TTask#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see org.omg.cmmn.TTask#getInputs()
     * @see #getTTask()
     * @generated
     */
    EReference getTTask_Inputs();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.cmmn.TTask#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outputs</em>'.
     * @see org.omg.cmmn.TTask#getOutputs()
     * @see #getTTask()
     * @generated
     */
    EReference getTTask_Outputs();

    /**
     * Returns the meta object for the attribute '{@link org.omg.cmmn.TTask#isIsBlocking <em>Is Blocking</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Blocking</em>'.
     * @see org.omg.cmmn.TTask#isIsBlocking()
     * @see #getTTask()
     * @generated
     */
    EAttribute getTTask_IsBlocking();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TTimerEvent <em>TTimer Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TTimer Event</em>'.
     * @see org.omg.cmmn.TTimerEvent
     * @generated
     */
    EClass getTTimerEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TTimerEvent#getTimerExpression <em>Timer Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Expression</em>'.
     * @see org.omg.cmmn.TTimerEvent#getTimerExpression()
     * @see #getTTimerEvent()
     * @generated
     */
    EReference getTTimerEvent_TimerExpression();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.cmmn.TTimerEvent#getTimerStartGroup <em>Timer Start Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Timer Start Group</em>'.
     * @see org.omg.cmmn.TTimerEvent#getTimerStartGroup()
     * @see #getTTimerEvent()
     * @generated
     */
    EAttribute getTTimerEvent_TimerStartGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.cmmn.TTimerEvent#getTimerStart <em>Timer Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Start</em>'.
     * @see org.omg.cmmn.TTimerEvent#getTimerStart()
     * @see #getTTimerEvent()
     * @generated
     */
    EReference getTTimerEvent_TimerStart();

    /**
     * Returns the meta object for class '{@link org.omg.cmmn.TUserEvent <em>TUser Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TUser Event</em>'.
     * @see org.omg.cmmn.TUserEvent
     * @generated
     */
    EClass getTUserEvent();

    /**
     * Returns the meta object for enum '{@link org.omg.cmmn.CaseFileItemTransition <em>Case File Item Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Case File Item Transition</em>'.
     * @see org.omg.cmmn.CaseFileItemTransition
     * @generated
     */
    EEnum getCaseFileItemTransition();

    /**
     * Returns the meta object for enum '{@link org.omg.cmmn.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Definition Type Enum Member1</em>'.
     * @see org.omg.cmmn.DefinitionTypeEnumMember1
     * @generated
     */
    EEnum getDefinitionTypeEnumMember1();

    /**
     * Returns the meta object for enum '{@link org.omg.cmmn.MultiplicityEnum <em>Multiplicity Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplicity Enum</em>'.
     * @see org.omg.cmmn.MultiplicityEnum
     * @generated
     */
    EEnum getMultiplicityEnum();

    /**
     * Returns the meta object for enum '{@link org.omg.cmmn.PlanItemTransition <em>Plan Item Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Plan Item Transition</em>'.
     * @see org.omg.cmmn.PlanItemTransition
     * @generated
     */
    EEnum getPlanItemTransition();

    /**
     * Returns the meta object for enum '{@link org.omg.cmmn.ProcessTypeEnumMember1 <em>Process Type Enum Member1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Process Type Enum Member1</em>'.
     * @see org.omg.cmmn.ProcessTypeEnumMember1
     * @generated
     */
    EEnum getProcessTypeEnumMember1();

    /**
     * Returns the meta object for data type '{@link org.omg.cmmn.CaseFileItemTransition <em>Case File Item Transition Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Case File Item Transition Object</em>'.
     * @see org.omg.cmmn.CaseFileItemTransition
     * @model instanceClass="org.omg.cmmn.CaseFileItemTransition"
     *        extendedMetaData="name='CaseFileItemTransition:Object' baseType='CaseFileItemTransition'"
     * @generated
     */
    EDataType getCaseFileItemTransitionObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Definition Type Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Definition Type Enum</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='DefinitionTypeEnum' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI DefinitionTypeEnum_._member_._1'"
     * @generated
     */
    EDataType getDefinitionTypeEnum();

    /**
     * Returns the meta object for data type '{@link org.omg.cmmn.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Definition Type Enum Member1 Object</em>'.
     * @see org.omg.cmmn.DefinitionTypeEnumMember1
     * @model instanceClass="org.omg.cmmn.DefinitionTypeEnumMember1"
     *        extendedMetaData="name='DefinitionTypeEnum_._member_._1:Object' baseType='DefinitionTypeEnum_._member_._1'"
     * @generated
     */
    EDataType getDefinitionTypeEnumMember1Object();

    /**
     * Returns the meta object for data type '{@link org.omg.cmmn.MultiplicityEnum <em>Multiplicity Enum Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Multiplicity Enum Object</em>'.
     * @see org.omg.cmmn.MultiplicityEnum
     * @model instanceClass="org.omg.cmmn.MultiplicityEnum"
     *        extendedMetaData="name='MultiplicityEnum:Object' baseType='MultiplicityEnum'"
     * @generated
     */
    EDataType getMultiplicityEnumObject();

    /**
     * Returns the meta object for data type '{@link org.omg.cmmn.PlanItemTransition <em>Plan Item Transition Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Plan Item Transition Object</em>'.
     * @see org.omg.cmmn.PlanItemTransition
     * @model instanceClass="org.omg.cmmn.PlanItemTransition"
     *        extendedMetaData="name='PlanItemTransition:Object' baseType='PlanItemTransition'"
     * @generated
     */
    EDataType getPlanItemTransitionObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Process Type Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Process Type Enum</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='ProcessTypeEnum' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI ProcessTypeEnum_._member_._1'"
     * @generated
     */
    EDataType getProcessTypeEnum();

    /**
     * Returns the meta object for data type '{@link org.omg.cmmn.ProcessTypeEnumMember1 <em>Process Type Enum Member1 Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Process Type Enum Member1 Object</em>'.
     * @see org.omg.cmmn.ProcessTypeEnumMember1
     * @model instanceClass="org.omg.cmmn.ProcessTypeEnumMember1"
     *        extendedMetaData="name='ProcessTypeEnum_._member_._1:Object' baseType='ProcessTypeEnum_._member_._1'"
     * @generated
     */
    EDataType getProcessTypeEnumMember1Object();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CMMNFactory getCMMNFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.DocumentRootImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Applicability Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__APPLICABILITY_RULE = eINSTANCE.getDocumentRoot_ApplicabilityRule();

        /**
         * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE = eINSTANCE.getDocumentRoot_Case();

        /**
         * The meta object literal for the '<em><b>Case File</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_FILE = eINSTANCE.getDocumentRoot_CaseFile();

        /**
         * The meta object literal for the '<em><b>Case File Item</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_FILE_ITEM = eINSTANCE.getDocumentRoot_CaseFileItem();

        /**
         * The meta object literal for the '<em><b>Case File Item Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_FILE_ITEM_DEFINITION = eINSTANCE.getDocumentRoot_CaseFileItemDefinition();

        /**
         * The meta object literal for the '<em><b>Case File Item On Part</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_FILE_ITEM_ON_PART = eINSTANCE.getDocumentRoot_CaseFileItemOnPart();

        /**
         * The meta object literal for the '<em><b>On Part</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ON_PART = eINSTANCE.getDocumentRoot_OnPart();

        /**
         * The meta object literal for the '<em><b>Case File Item Start Trigger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_FILE_ITEM_START_TRIGGER = eINSTANCE.getDocumentRoot_CaseFileItemStartTrigger();

        /**
         * The meta object literal for the '<em><b>Timer Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TIMER_START = eINSTANCE.getDocumentRoot_TimerStart();

        /**
         * The meta object literal for the '<em><b>Case Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_PARAMETER = eINSTANCE.getDocumentRoot_CaseParameter();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PARAMETER = eINSTANCE.getDocumentRoot_Parameter();

        /**
         * The meta object literal for the '<em><b>Case Task</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CASE_TASK = eINSTANCE.getDocumentRoot_CaseTask();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TASK = eINSTANCE.getDocumentRoot_Task();

        /**
         * The meta object literal for the '<em><b>Plan Item Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLAN_ITEM_DEFINITION = eINSTANCE.getDocumentRoot_PlanItemDefinition();

        /**
         * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DEFINITIONS = eINSTANCE.getDocumentRoot_Definitions();

        /**
         * The meta object literal for the '<em><b>Discretionary Item</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DISCRETIONARY_ITEM = eINSTANCE.getDocumentRoot_DiscretionaryItem();

        /**
         * The meta object literal for the '<em><b>Table Item</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TABLE_ITEM = eINSTANCE.getDocumentRoot_TableItem();

        /**
         * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EVENT = eINSTANCE.getDocumentRoot_Event();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EXPRESSION = eINSTANCE.getDocumentRoot_Expression();

        /**
         * The meta object literal for the '<em><b>Human Task</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__HUMAN_TASK = eINSTANCE.getDocumentRoot_HumanTask();

        /**
         * The meta object literal for the '<em><b>If Part</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IF_PART = eINSTANCE.getDocumentRoot_IfPart();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

        /**
         * The meta object literal for the '<em><b>Manual Activation Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MANUAL_ACTIVATION_RULE = eINSTANCE.getDocumentRoot_ManualActivationRule();

        /**
         * The meta object literal for the '<em><b>Milestone</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MILESTONE = eINSTANCE.getDocumentRoot_Milestone();

        /**
         * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PARAMETER_MAPPING = eINSTANCE.getDocumentRoot_ParameterMapping();

        /**
         * The meta object literal for the '<em><b>Plan Fragment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLAN_FRAGMENT = eINSTANCE.getDocumentRoot_PlanFragment();

        /**
         * The meta object literal for the '<em><b>Plan Item</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLAN_ITEM = eINSTANCE.getDocumentRoot_PlanItem();

        /**
         * The meta object literal for the '<em><b>Plan Item Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLAN_ITEM_CONTROL = eINSTANCE.getDocumentRoot_PlanItemControl();

        /**
         * The meta object literal for the '<em><b>Plan Item On Part</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLAN_ITEM_ON_PART = eINSTANCE.getDocumentRoot_PlanItemOnPart();

        /**
         * The meta object literal for the '<em><b>Plan Item Start Trigger</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLAN_ITEM_START_TRIGGER = eINSTANCE.getDocumentRoot_PlanItemStartTrigger();

        /**
         * The meta object literal for the '<em><b>Planning Table</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLANNING_TABLE = eINSTANCE.getDocumentRoot_PlanningTable();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESS = eINSTANCE.getDocumentRoot_Process();

        /**
         * The meta object literal for the '<em><b>Process Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESS_PARAMETER = eINSTANCE.getDocumentRoot_ProcessParameter();

        /**
         * The meta object literal for the '<em><b>Process Task</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESS_TASK = eINSTANCE.getDocumentRoot_ProcessTask();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

        /**
         * The meta object literal for the '<em><b>Repetition Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__REPETITION_RULE = eINSTANCE.getDocumentRoot_RepetitionRule();

        /**
         * The meta object literal for the '<em><b>Required Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__REQUIRED_RULE = eINSTANCE.getDocumentRoot_RequiredRule();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ROLE = eINSTANCE.getDocumentRoot_Role();

        /**
         * The meta object literal for the '<em><b>Sentry</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SENTRY = eINSTANCE.getDocumentRoot_Sentry();

        /**
         * The meta object literal for the '<em><b>Stage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__STAGE = eINSTANCE.getDocumentRoot_Stage();

        /**
         * The meta object literal for the '<em><b>Timer Event</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TIMER_EVENT = eINSTANCE.getDocumentRoot_TimerEvent();

        /**
         * The meta object literal for the '<em><b>User Event</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__USER_EVENT = eINSTANCE.getDocumentRoot_UserEvent();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TApplicabilityRuleImpl <em>TApplicability Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TApplicabilityRuleImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTApplicabilityRule()
         * @generated
         */
        EClass TAPPLICABILITY_RULE = eINSTANCE.getTApplicabilityRule();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TAPPLICABILITY_RULE__CONDITION = eINSTANCE.getTApplicabilityRule_Condition();

        /**
         * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TAPPLICABILITY_RULE__CONTEXT_REF = eINSTANCE.getTApplicabilityRule_ContextRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseImpl <em>TCase</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCase()
         * @generated
         */
        EClass TCASE = eINSTANCE.getTCase();

        /**
         * The meta object literal for the '<em><b>Case File Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE__CASE_FILE_MODEL = eINSTANCE.getTCase_CaseFileModel();

        /**
         * The meta object literal for the '<em><b>Case Plan Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE__CASE_PLAN_MODEL = eINSTANCE.getTCase_CasePlanModel();

        /**
         * The meta object literal for the '<em><b>Case Roles</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE__CASE_ROLES = eINSTANCE.getTCase_CaseRoles();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE__INPUT = eINSTANCE.getTCase_Input();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE__OUTPUT = eINSTANCE.getTCase_Output();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE__NAME = eINSTANCE.getTCase_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseFileImpl <em>TCase File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseFileImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFile()
         * @generated
         */
        EClass TCASE_FILE = eINSTANCE.getTCaseFile();

        /**
         * The meta object literal for the '<em><b>Case File Item</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE__CASE_FILE_ITEM = eINSTANCE.getTCaseFile_CaseFileItem();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseFileItemImpl <em>TCase File Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseFileItemImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItem()
         * @generated
         */
        EClass TCASE_FILE_ITEM = eINSTANCE.getTCaseFileItem();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM__CHILDREN = eINSTANCE.getTCaseFileItem_Children();

        /**
         * The meta object literal for the '<em><b>Definition Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM__DEFINITION_REF = eINSTANCE.getTCaseFileItem_DefinitionRef();

        /**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM__MULTIPLICITY = eINSTANCE.getTCaseFileItem_Multiplicity();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM__NAME = eINSTANCE.getTCaseFileItem_Name();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM__SOURCE_REF = eINSTANCE.getTCaseFileItem_SourceRef();

        /**
         * The meta object literal for the '<em><b>Target Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM__TARGET_REFS = eINSTANCE.getTCaseFileItem_TargetRefs();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseFileItemDefinitionImpl <em>TCase File Item Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseFileItemDefinitionImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItemDefinition()
         * @generated
         */
        EClass TCASE_FILE_ITEM_DEFINITION = eINSTANCE.getTCaseFileItemDefinition();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM_DEFINITION__PROPERTY = eINSTANCE.getTCaseFileItemDefinition_Property();

        /**
         * The meta object literal for the '<em><b>Definition Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM_DEFINITION__DEFINITION_TYPE = eINSTANCE.getTCaseFileItemDefinition_DefinitionType();

        /**
         * The meta object literal for the '<em><b>Import Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM_DEFINITION__IMPORT_REF = eINSTANCE.getTCaseFileItemDefinition_ImportRef();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM_DEFINITION__NAME = eINSTANCE.getTCaseFileItemDefinition_Name();

        /**
         * The meta object literal for the '<em><b>Structure Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM_DEFINITION__STRUCTURE_REF = eINSTANCE.getTCaseFileItemDefinition_StructureRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseFileItemOnPartImpl <em>TCase File Item On Part</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseFileItemOnPartImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItemOnPart()
         * @generated
         */
        EClass TCASE_FILE_ITEM_ON_PART = eINSTANCE.getTCaseFileItemOnPart();

        /**
         * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT = eINSTANCE.getTCaseFileItemOnPart_StandardEvent();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM_ON_PART__SOURCE_REF = eINSTANCE.getTCaseFileItemOnPart_SourceRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseFileItemStartTriggerImpl <em>TCase File Item Start Trigger</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseFileItemStartTriggerImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseFileItemStartTrigger()
         * @generated
         */
        EClass TCASE_FILE_ITEM_START_TRIGGER = eINSTANCE.getTCaseFileItemStartTrigger();

        /**
         * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCASE_FILE_ITEM_START_TRIGGER__STANDARD_EVENT = eINSTANCE.getTCaseFileItemStartTrigger_StandardEvent();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_FILE_ITEM_START_TRIGGER__SOURCE_REF = eINSTANCE.getTCaseFileItemStartTrigger_SourceRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseParameterImpl <em>TCase Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseParameterImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseParameter()
         * @generated
         */
        EClass TCASE_PARAMETER = eINSTANCE.getTCaseParameter();

        /**
         * The meta object literal for the '<em><b>Binding Refinement</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_PARAMETER__BINDING_REFINEMENT = eINSTANCE.getTCaseParameter_BindingRefinement();

        /**
         * The meta object literal for the '<em><b>Binding Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_PARAMETER__BINDING_REF = eINSTANCE.getTCaseParameter_BindingRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCaseTaskImpl <em>TCase Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCaseTaskImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCaseTask()
         * @generated
         */
        EClass TCASE_TASK = eINSTANCE.getTCaseTask();

        /**
         * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_TASK__PARAMETER_MAPPING = eINSTANCE.getTCaseTask_ParameterMapping();

        /**
         * The meta object literal for the '<em><b>Case Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCASE_TASK__CASE_REF = eINSTANCE.getTCaseTask_CaseRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TChildrenImpl <em>TChildren</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TChildrenImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTChildren()
         * @generated
         */
        EClass TCHILDREN = eINSTANCE.getTChildren();

        /**
         * The meta object literal for the '<em><b>Case File Item</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TCHILDREN__CASE_FILE_ITEM = eINSTANCE.getTChildren_CaseFileItem();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCmmnElementImpl <em>TCmmn Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCmmnElementImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCmmnElement()
         * @generated
         */
        EClass TCMMN_ELEMENT = eINSTANCE.getTCmmnElement();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT__DESCRIPTION = eINSTANCE.getTCmmnElement_Description();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT__ID = eINSTANCE.getTCmmnElement_Id();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getTCmmnElement_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TCmmnElementWithMixedContentImpl <em>TCmmn Element With Mixed Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TCmmnElementWithMixedContentImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTCmmnElementWithMixedContent()
         * @generated
         */
        EClass TCMMN_ELEMENT_WITH_MIXED_CONTENT = eINSTANCE.getTCmmnElementWithMixedContent();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED = eINSTANCE.getTCmmnElementWithMixedContent_Mixed();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__DESCRIPTION = eINSTANCE.getTCmmnElementWithMixedContent_Description();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID = eINSTANCE.getTCmmnElementWithMixedContent_Id();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE = eINSTANCE.getTCmmnElementWithMixedContent_AnyAttribute();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TDefinitionsImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTDefinitions()
         * @generated
         */
        EClass TDEFINITIONS = eINSTANCE.getTDefinitions();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDEFINITIONS__IMPORT = eINSTANCE.getTDefinitions_Import();

        /**
         * The meta object literal for the '<em><b>Case File Item Definition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDEFINITIONS__CASE_FILE_ITEM_DEFINITION = eINSTANCE.getTDefinitions_CaseFileItemDefinition();

        /**
         * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDEFINITIONS__CASE = eINSTANCE.getTDefinitions_Case();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDEFINITIONS__PROCESS = eINSTANCE.getTDefinitions_Process();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__AUTHOR = eINSTANCE.getTDefinitions_Author();

        /**
         * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__CREATION_DATE = eINSTANCE.getTDefinitions_CreationDate();

        /**
         * The meta object literal for the '<em><b>Exporter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__EXPORTER = eINSTANCE.getTDefinitions_Exporter();

        /**
         * The meta object literal for the '<em><b>Exporter Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__EXPORTER_VERSION = eINSTANCE.getTDefinitions_ExporterVersion();

        /**
         * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__EXPRESSION_LANGUAGE = eINSTANCE.getTDefinitions_ExpressionLanguage();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__ID = eINSTANCE.getTDefinitions_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__NAME = eINSTANCE.getTDefinitions_Name();

        /**
         * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getTDefinitions_TargetNamespace();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TDEFINITIONS__ANY_ATTRIBUTE = eINSTANCE.getTDefinitions_AnyAttribute();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDEFINITIONS__DIAGRAM = eINSTANCE.getTDefinitions_Diagram();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TDiscretionaryItemImpl <em>TDiscretionary Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TDiscretionaryItemImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTDiscretionaryItem()
         * @generated
         */
        EClass TDISCRETIONARY_ITEM = eINSTANCE.getTDiscretionaryItem();

        /**
         * The meta object literal for the '<em><b>Item Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDISCRETIONARY_ITEM__ITEM_CONTROL = eINSTANCE.getTDiscretionaryItem_ItemControl();

        /**
         * The meta object literal for the '<em><b>Definition Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDISCRETIONARY_ITEM__DEFINITION_REF = eINSTANCE.getTDiscretionaryItem_DefinitionRef();

        /**
         * The meta object literal for the '<em><b>Entry Criteria Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS = eINSTANCE.getTDiscretionaryItem_EntryCriteriaRefs();

        /**
         * The meta object literal for the '<em><b>Exit Criteria Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS = eINSTANCE.getTDiscretionaryItem_ExitCriteriaRefs();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TEventImpl <em>TEvent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TEventImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTEvent()
         * @generated
         */
        EClass TEVENT = eINSTANCE.getTEvent();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TExpressionImpl <em>TExpression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TExpressionImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTExpression()
         * @generated
         */
        EClass TEXPRESSION = eINSTANCE.getTExpression();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXPRESSION__BODY = eINSTANCE.getTExpression_Body();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXPRESSION__LANGUAGE = eINSTANCE.getTExpression_Language();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.THumanTaskImpl <em>THuman Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.THumanTaskImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTHumanTask()
         * @generated
         */
        EClass THUMAN_TASK = eINSTANCE.getTHumanTask();

        /**
         * The meta object literal for the '<em><b>Planning Table</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THUMAN_TASK__PLANNING_TABLE = eINSTANCE.getTHumanTask_PlanningTable();

        /**
         * The meta object literal for the '<em><b>Performer Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THUMAN_TASK__PERFORMER_REF = eINSTANCE.getTHumanTask_PerformerRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TIfPartImpl <em>TIf Part</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TIfPartImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTIfPart()
         * @generated
         */
        EClass TIF_PART = eINSTANCE.getTIfPart();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIF_PART__CONDITION = eINSTANCE.getTIfPart_Condition();

        /**
         * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIF_PART__CONTEXT_REF = eINSTANCE.getTIfPart_ContextRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TImportImpl <em>TImport</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TImportImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTImport()
         * @generated
         */
        EClass TIMPORT = eINSTANCE.getTImport();

        /**
         * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMPORT__IMPORT_TYPE = eINSTANCE.getTImport_ImportType();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMPORT__LOCATION = eINSTANCE.getTImport_Location();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMPORT__NAMESPACE = eINSTANCE.getTImport_Namespace();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TManualActivationRuleImpl <em>TManual Activation Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TManualActivationRuleImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTManualActivationRule()
         * @generated
         */
        EClass TMANUAL_ACTIVATION_RULE = eINSTANCE.getTManualActivationRule();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TMANUAL_ACTIVATION_RULE__CONDITION = eINSTANCE.getTManualActivationRule_Condition();

        /**
         * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TMANUAL_ACTIVATION_RULE__CONTEXT_REF = eINSTANCE.getTManualActivationRule_ContextRef();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TMANUAL_ACTIVATION_RULE__NAME = eINSTANCE.getTManualActivationRule_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TMilestoneImpl <em>TMilestone</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TMilestoneImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTMilestone()
         * @generated
         */
        EClass TMILESTONE = eINSTANCE.getTMilestone();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TOnPartImpl <em>TOn Part</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TOnPartImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTOnPart()
         * @generated
         */
        EClass TON_PART = eINSTANCE.getTOnPart();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TParameterImpl <em>TParameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TParameterImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTParameter()
         * @generated
         */
        EClass TPARAMETER = eINSTANCE.getTParameter();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPARAMETER__NAME = eINSTANCE.getTParameter_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TParameterMappingImpl <em>TParameter Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TParameterMappingImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTParameterMapping()
         * @generated
         */
        EClass TPARAMETER_MAPPING = eINSTANCE.getTParameterMapping();

        /**
         * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPARAMETER_MAPPING__TRANSFORMATION = eINSTANCE.getTParameterMapping_Transformation();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPARAMETER_MAPPING__SOURCE_REF = eINSTANCE.getTParameterMapping_SourceRef();

        /**
         * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPARAMETER_MAPPING__TARGET_REF = eINSTANCE.getTParameterMapping_TargetRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanFragmentImpl <em>TPlan Fragment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanFragmentImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanFragment()
         * @generated
         */
        EClass TPLAN_FRAGMENT = eINSTANCE.getTPlanFragment();

        /**
         * The meta object literal for the '<em><b>Plan Item</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_FRAGMENT__PLAN_ITEM = eINSTANCE.getTPlanFragment_PlanItem();

        /**
         * The meta object literal for the '<em><b>Sentry</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_FRAGMENT__SENTRY = eINSTANCE.getTPlanFragment_Sentry();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanItemImpl <em>TPlan Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanItemImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItem()
         * @generated
         */
        EClass TPLAN_ITEM = eINSTANCE.getTPlanItem();

        /**
         * The meta object literal for the '<em><b>Item Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM__ITEM_CONTROL = eINSTANCE.getTPlanItem_ItemControl();

        /**
         * The meta object literal for the '<em><b>Definition Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM__DEFINITION_REF = eINSTANCE.getTPlanItem_DefinitionRef();

        /**
         * The meta object literal for the '<em><b>Entry Criteria Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM__ENTRY_CRITERIA_REFS = eINSTANCE.getTPlanItem_EntryCriteriaRefs();

        /**
         * The meta object literal for the '<em><b>Exit Criteria Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM__EXIT_CRITERIA_REFS = eINSTANCE.getTPlanItem_ExitCriteriaRefs();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPLAN_ITEM__NAME = eINSTANCE.getTPlanItem_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanItemControlImpl <em>TPlan Item Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanItemControlImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemControl()
         * @generated
         */
        EClass TPLAN_ITEM_CONTROL = eINSTANCE.getTPlanItemControl();

        /**
         * The meta object literal for the '<em><b>Repetition Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_CONTROL__REPETITION_RULE = eINSTANCE.getTPlanItemControl_RepetitionRule();

        /**
         * The meta object literal for the '<em><b>Required Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_CONTROL__REQUIRED_RULE = eINSTANCE.getTPlanItemControl_RequiredRule();

        /**
         * The meta object literal for the '<em><b>Manual Activation Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE = eINSTANCE.getTPlanItemControl_ManualActivationRule();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanItemDefinitionImpl <em>TPlan Item Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanItemDefinitionImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemDefinition()
         * @generated
         */
        EClass TPLAN_ITEM_DEFINITION = eINSTANCE.getTPlanItemDefinition();

        /**
         * The meta object literal for the '<em><b>Default Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL = eINSTANCE.getTPlanItemDefinition_DefaultControl();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPLAN_ITEM_DEFINITION__NAME = eINSTANCE.getTPlanItemDefinition_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanItemOnPartImpl <em>TPlan Item On Part</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanItemOnPartImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemOnPart()
         * @generated
         */
        EClass TPLAN_ITEM_ON_PART = eINSTANCE.getTPlanItemOnPart();

        /**
         * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPLAN_ITEM_ON_PART__STANDARD_EVENT = eINSTANCE.getTPlanItemOnPart_StandardEvent();

        /**
         * The meta object literal for the '<em><b>Sentry Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_ON_PART__SENTRY_REF = eINSTANCE.getTPlanItemOnPart_SentryRef();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_ON_PART__SOURCE_REF = eINSTANCE.getTPlanItemOnPart_SourceRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanItemStartTriggerImpl <em>TPlan Item Start Trigger</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanItemStartTriggerImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanItemStartTrigger()
         * @generated
         */
        EClass TPLAN_ITEM_START_TRIGGER = eINSTANCE.getTPlanItemStartTrigger();

        /**
         * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPLAN_ITEM_START_TRIGGER__STANDARD_EVENT = eINSTANCE.getTPlanItemStartTrigger_StandardEvent();

        /**
         * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLAN_ITEM_START_TRIGGER__SOURCE_REF = eINSTANCE.getTPlanItemStartTrigger_SourceRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPlanningTableImpl <em>TPlanning Table</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPlanningTableImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTPlanningTable()
         * @generated
         */
        EClass TPLANNING_TABLE = eINSTANCE.getTPlanningTable();

        /**
         * The meta object literal for the '<em><b>Table Item Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPLANNING_TABLE__TABLE_ITEM_GROUP = eINSTANCE.getTPlanningTable_TableItemGroup();

        /**
         * The meta object literal for the '<em><b>Table Item</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLANNING_TABLE__TABLE_ITEM = eINSTANCE.getTPlanningTable_TableItem();

        /**
         * The meta object literal for the '<em><b>Applicability Rule</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPLANNING_TABLE__APPLICABILITY_RULE = eINSTANCE.getTPlanningTable_ApplicabilityRule();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TProcessImpl <em>TProcess</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TProcessImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProcess()
         * @generated
         */
        EClass TPROCESS = eINSTANCE.getTProcess();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPROCESS__INPUT = eINSTANCE.getTProcess_Input();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPROCESS__OUTPUT = eINSTANCE.getTProcess_Output();

        /**
         * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPROCESS__IMPLEMENTATION_TYPE = eINSTANCE.getTProcess_ImplementationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPROCESS__NAME = eINSTANCE.getTProcess_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TProcessParameterImpl <em>TProcess Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TProcessParameterImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProcessParameter()
         * @generated
         */
        EClass TPROCESS_PARAMETER = eINSTANCE.getTProcessParameter();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TProcessTaskImpl <em>TProcess Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TProcessTaskImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProcessTask()
         * @generated
         */
        EClass TPROCESS_TASK = eINSTANCE.getTProcessTask();

        /**
         * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPROCESS_TASK__PARAMETER_MAPPING = eINSTANCE.getTProcessTask_ParameterMapping();

        /**
         * The meta object literal for the '<em><b>Process Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TPROCESS_TASK__PROCESS_REF = eINSTANCE.getTProcessTask_ProcessRef();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TPropertyImpl <em>TProperty</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TPropertyImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTProperty()
         * @generated
         */
        EClass TPROPERTY = eINSTANCE.getTProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPROPERTY__NAME = eINSTANCE.getTProperty_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TPROPERTY__TYPE = eINSTANCE.getTProperty_Type();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TRepetitionRuleImpl <em>TRepetition Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TRepetitionRuleImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTRepetitionRule()
         * @generated
         */
        EClass TREPETITION_RULE = eINSTANCE.getTRepetitionRule();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREPETITION_RULE__CONDITION = eINSTANCE.getTRepetitionRule_Condition();

        /**
         * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREPETITION_RULE__CONTEXT_REF = eINSTANCE.getTRepetitionRule_ContextRef();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREPETITION_RULE__NAME = eINSTANCE.getTRepetitionRule_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TRequiredRuleImpl <em>TRequired Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TRequiredRuleImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTRequiredRule()
         * @generated
         */
        EClass TREQUIRED_RULE = eINSTANCE.getTRequiredRule();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREQUIRED_RULE__CONDITION = eINSTANCE.getTRequiredRule_Condition();

        /**
         * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TREQUIRED_RULE__CONTEXT_REF = eINSTANCE.getTRequiredRule_ContextRef();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREQUIRED_RULE__NAME = eINSTANCE.getTRequiredRule_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TRoleImpl <em>TRole</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TRoleImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTRole()
         * @generated
         */
        EClass TROLE = eINSTANCE.getTRole();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TROLE__NAME = eINSTANCE.getTRole_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TSentryImpl <em>TSentry</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TSentryImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTSentry()
         * @generated
         */
        EClass TSENTRY = eINSTANCE.getTSentry();

        /**
         * The meta object literal for the '<em><b>On Part Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSENTRY__ON_PART_GROUP = eINSTANCE.getTSentry_OnPartGroup();

        /**
         * The meta object literal for the '<em><b>On Part</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSENTRY__ON_PART = eINSTANCE.getTSentry_OnPart();

        /**
         * The meta object literal for the '<em><b>If Part</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSENTRY__IF_PART = eINSTANCE.getTSentry_IfPart();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSENTRY__NAME = eINSTANCE.getTSentry_Name();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TStageImpl <em>TStage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TStageImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTStage()
         * @generated
         */
        EClass TSTAGE = eINSTANCE.getTStage();

        /**
         * The meta object literal for the '<em><b>Planning Table</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSTAGE__PLANNING_TABLE = eINSTANCE.getTStage_PlanningTable();

        /**
         * The meta object literal for the '<em><b>Plan Item Definition Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSTAGE__PLAN_ITEM_DEFINITION_GROUP = eINSTANCE.getTStage_PlanItemDefinitionGroup();

        /**
         * The meta object literal for the '<em><b>Plan Item Definition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSTAGE__PLAN_ITEM_DEFINITION = eINSTANCE.getTStage_PlanItemDefinition();

        /**
         * The meta object literal for the '<em><b>Auto Complete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TSTAGE__AUTO_COMPLETE = eINSTANCE.getTStage_AutoComplete();

        /**
         * The meta object literal for the '<em><b>Exit Criteria Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TSTAGE__EXIT_CRITERIA_REFS = eINSTANCE.getTStage_ExitCriteriaRefs();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TStartTriggerImpl <em>TStart Trigger</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TStartTriggerImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTStartTrigger()
         * @generated
         */
        EClass TSTART_TRIGGER = eINSTANCE.getTStartTrigger();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TTableItemImpl <em>TTable Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TTableItemImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTTableItem()
         * @generated
         */
        EClass TTABLE_ITEM = eINSTANCE.getTTableItem();

        /**
         * The meta object literal for the '<em><b>Applicability Rule Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TTABLE_ITEM__APPLICABILITY_RULE_REFS = eINSTANCE.getTTableItem_ApplicabilityRuleRefs();

        /**
         * The meta object literal for the '<em><b>Authorized Role Refs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TTABLE_ITEM__AUTHORIZED_ROLE_REFS = eINSTANCE.getTTableItem_AuthorizedRoleRefs();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TTaskImpl <em>TTask</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TTaskImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTTask()
         * @generated
         */
        EClass TTASK = eINSTANCE.getTTask();

        /**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TTASK__INPUTS = eINSTANCE.getTTask_Inputs();

        /**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TTASK__OUTPUTS = eINSTANCE.getTTask_Outputs();

        /**
         * The meta object literal for the '<em><b>Is Blocking</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TTASK__IS_BLOCKING = eINSTANCE.getTTask_IsBlocking();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TTimerEventImpl <em>TTimer Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TTimerEventImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTTimerEvent()
         * @generated
         */
        EClass TTIMER_EVENT = eINSTANCE.getTTimerEvent();

        /**
         * The meta object literal for the '<em><b>Timer Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TTIMER_EVENT__TIMER_EXPRESSION = eINSTANCE.getTTimerEvent_TimerExpression();

        /**
         * The meta object literal for the '<em><b>Timer Start Group</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TTIMER_EVENT__TIMER_START_GROUP = eINSTANCE.getTTimerEvent_TimerStartGroup();

        /**
         * The meta object literal for the '<em><b>Timer Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TTIMER_EVENT__TIMER_START = eINSTANCE.getTTimerEvent_TimerStart();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.impl.TUserEventImpl <em>TUser Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.impl.TUserEventImpl
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getTUserEvent()
         * @generated
         */
        EClass TUSER_EVENT = eINSTANCE.getTUserEvent();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.CaseFileItemTransition <em>Case File Item Transition</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.CaseFileItemTransition
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getCaseFileItemTransition()
         * @generated
         */
        EEnum CASE_FILE_ITEM_TRANSITION = eINSTANCE.getCaseFileItemTransition();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.DefinitionTypeEnumMember1
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getDefinitionTypeEnumMember1()
         * @generated
         */
        EEnum DEFINITION_TYPE_ENUM_MEMBER1 = eINSTANCE.getDefinitionTypeEnumMember1();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.MultiplicityEnum <em>Multiplicity Enum</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.MultiplicityEnum
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getMultiplicityEnum()
         * @generated
         */
        EEnum MULTIPLICITY_ENUM = eINSTANCE.getMultiplicityEnum();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.PlanItemTransition <em>Plan Item Transition</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.PlanItemTransition
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getPlanItemTransition()
         * @generated
         */
        EEnum PLAN_ITEM_TRANSITION = eINSTANCE.getPlanItemTransition();

        /**
         * The meta object literal for the '{@link org.omg.cmmn.ProcessTypeEnumMember1 <em>Process Type Enum Member1</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.ProcessTypeEnumMember1
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getProcessTypeEnumMember1()
         * @generated
         */
        EEnum PROCESS_TYPE_ENUM_MEMBER1 = eINSTANCE.getProcessTypeEnumMember1();

        /**
         * The meta object literal for the '<em>Case File Item Transition Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.CaseFileItemTransition
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getCaseFileItemTransitionObject()
         * @generated
         */
        EDataType CASE_FILE_ITEM_TRANSITION_OBJECT = eINSTANCE.getCaseFileItemTransitionObject();

        /**
         * The meta object literal for the '<em>Definition Type Enum</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getDefinitionTypeEnum()
         * @generated
         */
        EDataType DEFINITION_TYPE_ENUM = eINSTANCE.getDefinitionTypeEnum();

        /**
         * The meta object literal for the '<em>Definition Type Enum Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.DefinitionTypeEnumMember1
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getDefinitionTypeEnumMember1Object()
         * @generated
         */
        EDataType DEFINITION_TYPE_ENUM_MEMBER1_OBJECT = eINSTANCE.getDefinitionTypeEnumMember1Object();

        /**
         * The meta object literal for the '<em>Multiplicity Enum Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.MultiplicityEnum
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getMultiplicityEnumObject()
         * @generated
         */
        EDataType MULTIPLICITY_ENUM_OBJECT = eINSTANCE.getMultiplicityEnumObject();

        /**
         * The meta object literal for the '<em>Plan Item Transition Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.PlanItemTransition
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getPlanItemTransitionObject()
         * @generated
         */
        EDataType PLAN_ITEM_TRANSITION_OBJECT = eINSTANCE.getPlanItemTransitionObject();

        /**
         * The meta object literal for the '<em>Process Type Enum</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getProcessTypeEnum()
         * @generated
         */
        EDataType PROCESS_TYPE_ENUM = eINSTANCE.getProcessTypeEnum();

        /**
         * The meta object literal for the '<em>Process Type Enum Member1 Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.cmmn.ProcessTypeEnumMember1
         * @see org.omg.cmmn.impl.CMMNPackageImpl#getProcessTypeEnumMember1Object()
         * @generated
         */
        EDataType PROCESS_TYPE_ENUM_MEMBER1_OBJECT = eINSTANCE.getProcessTypeEnumMember1Object();

    }

} //CMMNPackage
