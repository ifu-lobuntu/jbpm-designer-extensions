/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.CaseFileItemTransition;
import org.omg.cmmn.DefinitionTypeEnumMember1;
import org.omg.cmmn.DocumentRoot;
import org.omg.cmmn.MultiplicityEnum;
import org.omg.cmmn.PlanItemTransition;
import org.omg.cmmn.ProcessTypeEnumMember1;
import org.omg.cmmn.TApplicabilityRule;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseFile;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TCaseFileItemOnPart;
import org.omg.cmmn.TCaseFileItemStartTrigger;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TChildren;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TEvent;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TIfPart;
import org.omg.cmmn.TImport;
import org.omg.cmmn.TManualActivationRule;
import org.omg.cmmn.TMilestone;
import org.omg.cmmn.TParameterMapping;
import org.omg.cmmn.TPlanFragment;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemOnPart;
import org.omg.cmmn.TPlanItemStartTrigger;
import org.omg.cmmn.TPlanningTable;
import org.omg.cmmn.TProcess;
import org.omg.cmmn.TProcessParameter;
import org.omg.cmmn.TProcessTask;
import org.omg.cmmn.TProperty;
import org.omg.cmmn.TRepetitionRule;
import org.omg.cmmn.TRequiredRule;
import org.omg.cmmn.TRole;
import org.omg.cmmn.TSentry;
import org.omg.cmmn.TStage;
import org.omg.cmmn.TTask;
import org.omg.cmmn.TTimerEvent;
import org.omg.cmmn.TUserEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNFactoryImpl extends EFactoryImpl implements CMMNFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CMMNFactory init() {
        try {
            CMMNFactory theCMMNFactory = (CMMNFactory)EPackage.Registry.INSTANCE.getEFactory(CMMNPackage.eNS_URI);
            if (theCMMNFactory != null) {
                return theCMMNFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CMMNFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case CMMNPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case CMMNPackage.TAPPLICABILITY_RULE: return createTApplicabilityRule();
            case CMMNPackage.TCASE: return createTCase();
            case CMMNPackage.TCASE_FILE: return createTCaseFile();
            case CMMNPackage.TCASE_FILE_ITEM: return createTCaseFileItem();
            case CMMNPackage.TCASE_FILE_ITEM_DEFINITION: return createTCaseFileItemDefinition();
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART: return createTCaseFileItemOnPart();
            case CMMNPackage.TCASE_FILE_ITEM_START_TRIGGER: return createTCaseFileItemStartTrigger();
            case CMMNPackage.TCASE_PARAMETER: return createTCaseParameter();
            case CMMNPackage.TCASE_TASK: return createTCaseTask();
            case CMMNPackage.TCHILDREN: return createTChildren();
            case CMMNPackage.TDEFINITIONS: return createTDefinitions();
            case CMMNPackage.TDISCRETIONARY_ITEM: return createTDiscretionaryItem();
            case CMMNPackage.TEVENT: return createTEvent();
            case CMMNPackage.TEXPRESSION: return createTExpression();
            case CMMNPackage.THUMAN_TASK: return createTHumanTask();
            case CMMNPackage.TIF_PART: return createTIfPart();
            case CMMNPackage.TIMPORT: return createTImport();
            case CMMNPackage.TMANUAL_ACTIVATION_RULE: return createTManualActivationRule();
            case CMMNPackage.TMILESTONE: return createTMilestone();
            case CMMNPackage.TPARAMETER_MAPPING: return createTParameterMapping();
            case CMMNPackage.TPLAN_FRAGMENT: return createTPlanFragment();
            case CMMNPackage.TPLAN_ITEM: return createTPlanItem();
            case CMMNPackage.TPLAN_ITEM_CONTROL: return createTPlanItemControl();
            case CMMNPackage.TPLAN_ITEM_ON_PART: return createTPlanItemOnPart();
            case CMMNPackage.TPLAN_ITEM_START_TRIGGER: return createTPlanItemStartTrigger();
            case CMMNPackage.TPLANNING_TABLE: return createTPlanningTable();
            case CMMNPackage.TPROCESS: return createTProcess();
            case CMMNPackage.TPROCESS_PARAMETER: return createTProcessParameter();
            case CMMNPackage.TPROCESS_TASK: return createTProcessTask();
            case CMMNPackage.TPROPERTY: return createTProperty();
            case CMMNPackage.TREPETITION_RULE: return createTRepetitionRule();
            case CMMNPackage.TREQUIRED_RULE: return createTRequiredRule();
            case CMMNPackage.TROLE: return createTRole();
            case CMMNPackage.TSENTRY: return createTSentry();
            case CMMNPackage.TSTAGE: return createTStage();
            case CMMNPackage.TTASK: return createTTask();
            case CMMNPackage.TTIMER_EVENT: return createTTimerEvent();
            case CMMNPackage.TUSER_EVENT: return createTUserEvent();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case CMMNPackage.CASE_FILE_ITEM_TRANSITION:
                return createCaseFileItemTransitionFromString(eDataType, initialValue);
            case CMMNPackage.DEFINITION_TYPE_ENUM_MEMBER1:
                return createDefinitionTypeEnumMember1FromString(eDataType, initialValue);
            case CMMNPackage.MULTIPLICITY_ENUM:
                return createMultiplicityEnumFromString(eDataType, initialValue);
            case CMMNPackage.PLAN_ITEM_TRANSITION:
                return createPlanItemTransitionFromString(eDataType, initialValue);
            case CMMNPackage.PROCESS_TYPE_ENUM_MEMBER1:
                return createProcessTypeEnumMember1FromString(eDataType, initialValue);
            case CMMNPackage.CASE_FILE_ITEM_TRANSITION_OBJECT:
                return createCaseFileItemTransitionObjectFromString(eDataType, initialValue);
            case CMMNPackage.DEFINITION_TYPE_ENUM:
                return createDefinitionTypeEnumFromString(eDataType, initialValue);
            case CMMNPackage.DEFINITION_TYPE_ENUM_MEMBER1_OBJECT:
                return createDefinitionTypeEnumMember1ObjectFromString(eDataType, initialValue);
            case CMMNPackage.MULTIPLICITY_ENUM_OBJECT:
                return createMultiplicityEnumObjectFromString(eDataType, initialValue);
            case CMMNPackage.PLAN_ITEM_TRANSITION_OBJECT:
                return createPlanItemTransitionObjectFromString(eDataType, initialValue);
            case CMMNPackage.PROCESS_TYPE_ENUM:
                return createProcessTypeEnumFromString(eDataType, initialValue);
            case CMMNPackage.PROCESS_TYPE_ENUM_MEMBER1_OBJECT:
                return createProcessTypeEnumMember1ObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case CMMNPackage.CASE_FILE_ITEM_TRANSITION:
                return convertCaseFileItemTransitionToString(eDataType, instanceValue);
            case CMMNPackage.DEFINITION_TYPE_ENUM_MEMBER1:
                return convertDefinitionTypeEnumMember1ToString(eDataType, instanceValue);
            case CMMNPackage.MULTIPLICITY_ENUM:
                return convertMultiplicityEnumToString(eDataType, instanceValue);
            case CMMNPackage.PLAN_ITEM_TRANSITION:
                return convertPlanItemTransitionToString(eDataType, instanceValue);
            case CMMNPackage.PROCESS_TYPE_ENUM_MEMBER1:
                return convertProcessTypeEnumMember1ToString(eDataType, instanceValue);
            case CMMNPackage.CASE_FILE_ITEM_TRANSITION_OBJECT:
                return convertCaseFileItemTransitionObjectToString(eDataType, instanceValue);
            case CMMNPackage.DEFINITION_TYPE_ENUM:
                return convertDefinitionTypeEnumToString(eDataType, instanceValue);
            case CMMNPackage.DEFINITION_TYPE_ENUM_MEMBER1_OBJECT:
                return convertDefinitionTypeEnumMember1ObjectToString(eDataType, instanceValue);
            case CMMNPackage.MULTIPLICITY_ENUM_OBJECT:
                return convertMultiplicityEnumObjectToString(eDataType, instanceValue);
            case CMMNPackage.PLAN_ITEM_TRANSITION_OBJECT:
                return convertPlanItemTransitionObjectToString(eDataType, instanceValue);
            case CMMNPackage.PROCESS_TYPE_ENUM:
                return convertProcessTypeEnumToString(eDataType, instanceValue);
            case CMMNPackage.PROCESS_TYPE_ENUM_MEMBER1_OBJECT:
                return convertProcessTypeEnumMember1ObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TApplicabilityRule createTApplicabilityRule() {
        TApplicabilityRuleImpl tApplicabilityRule = new TApplicabilityRuleImpl();
        return tApplicabilityRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCase createTCase() {
        TCaseImpl tCase = new TCaseImpl();
        return tCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFile createTCaseFile() {
        TCaseFileImpl tCaseFile = new TCaseFileImpl();
        return tCaseFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItem createTCaseFileItem() {
        TCaseFileItemImpl tCaseFileItem = new TCaseFileItemImpl();
        return tCaseFileItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItemDefinition createTCaseFileItemDefinition() {
        TCaseFileItemDefinitionImpl tCaseFileItemDefinition = new TCaseFileItemDefinitionImpl();
        return tCaseFileItemDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItemOnPart createTCaseFileItemOnPart() {
        TCaseFileItemOnPartImpl tCaseFileItemOnPart = new TCaseFileItemOnPartImpl();
        return tCaseFileItemOnPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItemStartTrigger createTCaseFileItemStartTrigger() {
        TCaseFileItemStartTriggerImpl tCaseFileItemStartTrigger = new TCaseFileItemStartTriggerImpl();
        return tCaseFileItemStartTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseParameter createTCaseParameter() {
        TCaseParameterImpl tCaseParameter = new TCaseParameterImpl();
        return tCaseParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseTask createTCaseTask() {
        TCaseTaskImpl tCaseTask = new TCaseTaskImpl();
        return tCaseTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TChildren createTChildren() {
        TChildrenImpl tChildren = new TChildrenImpl();
        return tChildren;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDefinitions createTDefinitions() {
        TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
        return tDefinitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDiscretionaryItem createTDiscretionaryItem() {
        TDiscretionaryItemImpl tDiscretionaryItem = new TDiscretionaryItemImpl();
        return tDiscretionaryItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TEvent createTEvent() {
        TEventImpl tEvent = new TEventImpl();
        return tEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TExpression createTExpression() {
        TExpressionImpl tExpression = new TExpressionImpl();
        return tExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public THumanTask createTHumanTask() {
        THumanTaskImpl tHumanTask = new THumanTaskImpl();
        return tHumanTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIfPart createTIfPart() {
        TIfPartImpl tIfPart = new TIfPartImpl();
        return tIfPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TImport createTImport() {
        TImportImpl tImport = new TImportImpl();
        return tImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TManualActivationRule createTManualActivationRule() {
        TManualActivationRuleImpl tManualActivationRule = new TManualActivationRuleImpl();
        return tManualActivationRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TMilestone createTMilestone() {
        TMilestoneImpl tMilestone = new TMilestoneImpl();
        return tMilestone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TParameterMapping createTParameterMapping() {
        TParameterMappingImpl tParameterMapping = new TParameterMappingImpl();
        return tParameterMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanFragment createTPlanFragment() {
        TPlanFragmentImpl tPlanFragment = new TPlanFragmentImpl();
        return tPlanFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItem createTPlanItem() {
        TPlanItemImpl tPlanItem = new TPlanItemImpl();
        return tPlanItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItemControl createTPlanItemControl() {
        TPlanItemControlImpl tPlanItemControl = new TPlanItemControlImpl();
        return tPlanItemControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItemOnPart createTPlanItemOnPart() {
        TPlanItemOnPartImpl tPlanItemOnPart = new TPlanItemOnPartImpl();
        return tPlanItemOnPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItemStartTrigger createTPlanItemStartTrigger() {
        TPlanItemStartTriggerImpl tPlanItemStartTrigger = new TPlanItemStartTriggerImpl();
        return tPlanItemStartTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanningTable createTPlanningTable() {
        TPlanningTableImpl tPlanningTable = new TPlanningTableImpl();
        return tPlanningTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TProcess createTProcess() {
        TProcessImpl tProcess = new TProcessImpl();
        return tProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TProcessParameter createTProcessParameter() {
        TProcessParameterImpl tProcessParameter = new TProcessParameterImpl();
        return tProcessParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TProcessTask createTProcessTask() {
        TProcessTaskImpl tProcessTask = new TProcessTaskImpl();
        return tProcessTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TProperty createTProperty() {
        TPropertyImpl tProperty = new TPropertyImpl();
        return tProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRepetitionRule createTRepetitionRule() {
        TRepetitionRuleImpl tRepetitionRule = new TRepetitionRuleImpl();
        return tRepetitionRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRequiredRule createTRequiredRule() {
        TRequiredRuleImpl tRequiredRule = new TRequiredRuleImpl();
        return tRequiredRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRole createTRole() {
        TRoleImpl tRole = new TRoleImpl();
        return tRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TSentry createTSentry() {
        TSentryImpl tSentry = new TSentryImpl();
        return tSentry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TStage createTStage() {
        TStageImpl tStage = new TStageImpl();
        return tStage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TTask createTTask() {
        TTaskImpl tTask = new TTaskImpl();
        return tTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TTimerEvent createTTimerEvent() {
        TTimerEventImpl tTimerEvent = new TTimerEventImpl();
        return tTimerEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TUserEvent createTUserEvent() {
        TUserEventImpl tUserEvent = new TUserEventImpl();
        return tUserEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CaseFileItemTransition createCaseFileItemTransitionFromString(EDataType eDataType, String initialValue) {
        CaseFileItemTransition result = CaseFileItemTransition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCaseFileItemTransitionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionTypeEnumMember1 createDefinitionTypeEnumMember1FromString(EDataType eDataType, String initialValue) {
        DefinitionTypeEnumMember1 result = DefinitionTypeEnumMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDefinitionTypeEnumMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityEnum createMultiplicityEnumFromString(EDataType eDataType, String initialValue) {
        MultiplicityEnum result = MultiplicityEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiplicityEnumToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlanItemTransition createPlanItemTransitionFromString(EDataType eDataType, String initialValue) {
        PlanItemTransition result = PlanItemTransition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPlanItemTransitionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessTypeEnumMember1 createProcessTypeEnumMember1FromString(EDataType eDataType, String initialValue) {
        ProcessTypeEnumMember1 result = ProcessTypeEnumMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeEnumMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CaseFileItemTransition createCaseFileItemTransitionObjectFromString(EDataType eDataType, String initialValue) {
        return createCaseFileItemTransitionFromString(CMMNPackage.Literals.CASE_FILE_ITEM_TRANSITION, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCaseFileItemTransitionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCaseFileItemTransitionToString(CMMNPackage.Literals.CASE_FILE_ITEM_TRANSITION, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createDefinitionTypeEnumFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createDefinitionTypeEnumMember1FromString(CMMNPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDefinitionTypeEnumToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (CMMNPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertDefinitionTypeEnumMember1ToString(CMMNPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionTypeEnumMember1 createDefinitionTypeEnumMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createDefinitionTypeEnumMember1FromString(CMMNPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDefinitionTypeEnumMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDefinitionTypeEnumMember1ToString(CMMNPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityEnum createMultiplicityEnumObjectFromString(EDataType eDataType, String initialValue) {
        return createMultiplicityEnumFromString(CMMNPackage.Literals.MULTIPLICITY_ENUM, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiplicityEnumObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMultiplicityEnumToString(CMMNPackage.Literals.MULTIPLICITY_ENUM, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlanItemTransition createPlanItemTransitionObjectFromString(EDataType eDataType, String initialValue) {
        return createPlanItemTransitionFromString(CMMNPackage.Literals.PLAN_ITEM_TRANSITION, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPlanItemTransitionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPlanItemTransitionToString(CMMNPackage.Literals.PLAN_ITEM_TRANSITION, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createProcessTypeEnumFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createProcessTypeEnumMember1FromString(CMMNPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeEnumToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (CMMNPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertProcessTypeEnumMember1ToString(CMMNPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessTypeEnumMember1 createProcessTypeEnumMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createProcessTypeEnumMember1FromString(CMMNPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeEnumMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertProcessTypeEnumMember1ToString(CMMNPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNPackage getCMMNPackage() {
        return (CMMNPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CMMNPackage getPackage() {
        return CMMNPackage.eINSTANCE;
    }

} //CMMNFactoryImpl
