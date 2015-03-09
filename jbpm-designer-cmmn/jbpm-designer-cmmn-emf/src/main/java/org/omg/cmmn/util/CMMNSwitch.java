/**
 */
package org.omg.cmmn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jbpm.designer.dd.util.Switch;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.DocumentRoot;
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
import org.omg.cmmn.TCmmnElement;
import org.omg.cmmn.TCmmnElementWithMixedContent;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TEvent;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TIfPart;
import org.omg.cmmn.TImport;
import org.omg.cmmn.TManualActivationRule;
import org.omg.cmmn.TMilestone;
import org.omg.cmmn.TOnPart;
import org.omg.cmmn.TParameter;
import org.omg.cmmn.TParameterMapping;
import org.omg.cmmn.TPlanFragment;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemDefinition;
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
import org.omg.cmmn.TStartTrigger;
import org.omg.cmmn.TTableItem;
import org.omg.cmmn.TTask;
import org.omg.cmmn.TTimerEvent;
import org.omg.cmmn.TUserEvent;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.omg.cmmn.CMMNPackage
 * @generated
 */
public class CMMNSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CMMNPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNSwitch() {
        if (modelPackage == null) {
            modelPackage = CMMNPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case CMMNPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TAPPLICABILITY_RULE: {
                TApplicabilityRule tApplicabilityRule = (TApplicabilityRule)theEObject;
                T result = caseTApplicabilityRule(tApplicabilityRule);
                if (result == null) result = caseTCmmnElement(tApplicabilityRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE: {
                TCase tCase = (TCase)theEObject;
                T result = caseTCase(tCase);
                if (result == null) result = caseTCmmnElement(tCase);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_FILE: {
                TCaseFile tCaseFile = (TCaseFile)theEObject;
                T result = caseTCaseFile(tCaseFile);
                if (result == null) result = caseTCmmnElement(tCaseFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_FILE_ITEM: {
                TCaseFileItem tCaseFileItem = (TCaseFileItem)theEObject;
                T result = caseTCaseFileItem(tCaseFileItem);
                if (result == null) result = caseTCmmnElement(tCaseFileItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_FILE_ITEM_DEFINITION: {
                TCaseFileItemDefinition tCaseFileItemDefinition = (TCaseFileItemDefinition)theEObject;
                T result = caseTCaseFileItemDefinition(tCaseFileItemDefinition);
                if (result == null) result = caseTCmmnElement(tCaseFileItemDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART: {
                TCaseFileItemOnPart tCaseFileItemOnPart = (TCaseFileItemOnPart)theEObject;
                T result = caseTCaseFileItemOnPart(tCaseFileItemOnPart);
                if (result == null) result = caseTOnPart(tCaseFileItemOnPart);
                if (result == null) result = caseTCmmnElement(tCaseFileItemOnPart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_FILE_ITEM_START_TRIGGER: {
                TCaseFileItemStartTrigger tCaseFileItemStartTrigger = (TCaseFileItemStartTrigger)theEObject;
                T result = caseTCaseFileItemStartTrigger(tCaseFileItemStartTrigger);
                if (result == null) result = caseTStartTrigger(tCaseFileItemStartTrigger);
                if (result == null) result = caseTCmmnElement(tCaseFileItemStartTrigger);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_PARAMETER: {
                TCaseParameter tCaseParameter = (TCaseParameter)theEObject;
                T result = caseTCaseParameter(tCaseParameter);
                if (result == null) result = caseTParameter(tCaseParameter);
                if (result == null) result = caseTCmmnElement(tCaseParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCASE_TASK: {
                TCaseTask tCaseTask = (TCaseTask)theEObject;
                T result = caseTCaseTask(tCaseTask);
                if (result == null) result = caseTTask(tCaseTask);
                if (result == null) result = caseTPlanItemDefinition(tCaseTask);
                if (result == null) result = caseTCmmnElement(tCaseTask);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCHILDREN: {
                TChildren tChildren = (TChildren)theEObject;
                T result = caseTChildren(tChildren);
                if (result == null) result = caseTCmmnElement(tChildren);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCMMN_ELEMENT: {
                TCmmnElement tCmmnElement = (TCmmnElement)theEObject;
                T result = caseTCmmnElement(tCmmnElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT: {
                TCmmnElementWithMixedContent tCmmnElementWithMixedContent = (TCmmnElementWithMixedContent)theEObject;
                T result = caseTCmmnElementWithMixedContent(tCmmnElementWithMixedContent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TDEFINITIONS: {
                TDefinitions tDefinitions = (TDefinitions)theEObject;
                T result = caseTDefinitions(tDefinitions);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TDISCRETIONARY_ITEM: {
                TDiscretionaryItem tDiscretionaryItem = (TDiscretionaryItem)theEObject;
                T result = caseTDiscretionaryItem(tDiscretionaryItem);
                if (result == null) result = caseTTableItem(tDiscretionaryItem);
                if (result == null) result = caseTCmmnElement(tDiscretionaryItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TEVENT: {
                TEvent tEvent = (TEvent)theEObject;
                T result = caseTEvent(tEvent);
                if (result == null) result = caseTPlanItemDefinition(tEvent);
                if (result == null) result = caseTCmmnElement(tEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TEXPRESSION: {
                TExpression tExpression = (TExpression)theEObject;
                T result = caseTExpression(tExpression);
                if (result == null) result = caseTCmmnElementWithMixedContent(tExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.THUMAN_TASK: {
                THumanTask tHumanTask = (THumanTask)theEObject;
                T result = caseTHumanTask(tHumanTask);
                if (result == null) result = caseTTask(tHumanTask);
                if (result == null) result = caseTPlanItemDefinition(tHumanTask);
                if (result == null) result = caseTCmmnElement(tHumanTask);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TIF_PART: {
                TIfPart tIfPart = (TIfPart)theEObject;
                T result = caseTIfPart(tIfPart);
                if (result == null) result = caseTCmmnElement(tIfPart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TIMPORT: {
                TImport tImport = (TImport)theEObject;
                T result = caseTImport(tImport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TMANUAL_ACTIVATION_RULE: {
                TManualActivationRule tManualActivationRule = (TManualActivationRule)theEObject;
                T result = caseTManualActivationRule(tManualActivationRule);
                if (result == null) result = caseTCmmnElement(tManualActivationRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TMILESTONE: {
                TMilestone tMilestone = (TMilestone)theEObject;
                T result = caseTMilestone(tMilestone);
                if (result == null) result = caseTPlanItemDefinition(tMilestone);
                if (result == null) result = caseTCmmnElement(tMilestone);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TON_PART: {
                TOnPart tOnPart = (TOnPart)theEObject;
                T result = caseTOnPart(tOnPart);
                if (result == null) result = caseTCmmnElement(tOnPart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPARAMETER: {
                TParameter tParameter = (TParameter)theEObject;
                T result = caseTParameter(tParameter);
                if (result == null) result = caseTCmmnElement(tParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPARAMETER_MAPPING: {
                TParameterMapping tParameterMapping = (TParameterMapping)theEObject;
                T result = caseTParameterMapping(tParameterMapping);
                if (result == null) result = caseTCmmnElement(tParameterMapping);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLAN_FRAGMENT: {
                TPlanFragment tPlanFragment = (TPlanFragment)theEObject;
                T result = caseTPlanFragment(tPlanFragment);
                if (result == null) result = caseTPlanItemDefinition(tPlanFragment);
                if (result == null) result = caseTCmmnElement(tPlanFragment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLAN_ITEM: {
                TPlanItem tPlanItem = (TPlanItem)theEObject;
                T result = caseTPlanItem(tPlanItem);
                if (result == null) result = caseTCmmnElement(tPlanItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLAN_ITEM_CONTROL: {
                TPlanItemControl tPlanItemControl = (TPlanItemControl)theEObject;
                T result = caseTPlanItemControl(tPlanItemControl);
                if (result == null) result = caseTCmmnElement(tPlanItemControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLAN_ITEM_DEFINITION: {
                TPlanItemDefinition tPlanItemDefinition = (TPlanItemDefinition)theEObject;
                T result = caseTPlanItemDefinition(tPlanItemDefinition);
                if (result == null) result = caseTCmmnElement(tPlanItemDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLAN_ITEM_ON_PART: {
                TPlanItemOnPart tPlanItemOnPart = (TPlanItemOnPart)theEObject;
                T result = caseTPlanItemOnPart(tPlanItemOnPart);
                if (result == null) result = caseTOnPart(tPlanItemOnPart);
                if (result == null) result = caseTCmmnElement(tPlanItemOnPart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLAN_ITEM_START_TRIGGER: {
                TPlanItemStartTrigger tPlanItemStartTrigger = (TPlanItemStartTrigger)theEObject;
                T result = caseTPlanItemStartTrigger(tPlanItemStartTrigger);
                if (result == null) result = caseTStartTrigger(tPlanItemStartTrigger);
                if (result == null) result = caseTCmmnElement(tPlanItemStartTrigger);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPLANNING_TABLE: {
                TPlanningTable tPlanningTable = (TPlanningTable)theEObject;
                T result = caseTPlanningTable(tPlanningTable);
                if (result == null) result = caseTTableItem(tPlanningTable);
                if (result == null) result = caseTCmmnElement(tPlanningTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPROCESS: {
                TProcess tProcess = (TProcess)theEObject;
                T result = caseTProcess(tProcess);
                if (result == null) result = caseTCmmnElement(tProcess);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPROCESS_PARAMETER: {
                TProcessParameter tProcessParameter = (TProcessParameter)theEObject;
                T result = caseTProcessParameter(tProcessParameter);
                if (result == null) result = caseTParameter(tProcessParameter);
                if (result == null) result = caseTCmmnElement(tProcessParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPROCESS_TASK: {
                TProcessTask tProcessTask = (TProcessTask)theEObject;
                T result = caseTProcessTask(tProcessTask);
                if (result == null) result = caseTTask(tProcessTask);
                if (result == null) result = caseTPlanItemDefinition(tProcessTask);
                if (result == null) result = caseTCmmnElement(tProcessTask);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TPROPERTY: {
                TProperty tProperty = (TProperty)theEObject;
                T result = caseTProperty(tProperty);
                if (result == null) result = caseTCmmnElement(tProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TREPETITION_RULE: {
                TRepetitionRule tRepetitionRule = (TRepetitionRule)theEObject;
                T result = caseTRepetitionRule(tRepetitionRule);
                if (result == null) result = caseTCmmnElement(tRepetitionRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TREQUIRED_RULE: {
                TRequiredRule tRequiredRule = (TRequiredRule)theEObject;
                T result = caseTRequiredRule(tRequiredRule);
                if (result == null) result = caseTCmmnElement(tRequiredRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TROLE: {
                TRole tRole = (TRole)theEObject;
                T result = caseTRole(tRole);
                if (result == null) result = caseTCmmnElement(tRole);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TSENTRY: {
                TSentry tSentry = (TSentry)theEObject;
                T result = caseTSentry(tSentry);
                if (result == null) result = caseTCmmnElement(tSentry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TSTAGE: {
                TStage tStage = (TStage)theEObject;
                T result = caseTStage(tStage);
                if (result == null) result = caseTPlanFragment(tStage);
                if (result == null) result = caseTPlanItemDefinition(tStage);
                if (result == null) result = caseTCmmnElement(tStage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TSTART_TRIGGER: {
                TStartTrigger tStartTrigger = (TStartTrigger)theEObject;
                T result = caseTStartTrigger(tStartTrigger);
                if (result == null) result = caseTCmmnElement(tStartTrigger);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TTABLE_ITEM: {
                TTableItem tTableItem = (TTableItem)theEObject;
                T result = caseTTableItem(tTableItem);
                if (result == null) result = caseTCmmnElement(tTableItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TTASK: {
                TTask tTask = (TTask)theEObject;
                T result = caseTTask(tTask);
                if (result == null) result = caseTPlanItemDefinition(tTask);
                if (result == null) result = caseTCmmnElement(tTask);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TTIMER_EVENT: {
                TTimerEvent tTimerEvent = (TTimerEvent)theEObject;
                T result = caseTTimerEvent(tTimerEvent);
                if (result == null) result = caseTEvent(tTimerEvent);
                if (result == null) result = caseTPlanItemDefinition(tTimerEvent);
                if (result == null) result = caseTCmmnElement(tTimerEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNPackage.TUSER_EVENT: {
                TUserEvent tUserEvent = (TUserEvent)theEObject;
                T result = caseTUserEvent(tUserEvent);
                if (result == null) result = caseTEvent(tUserEvent);
                if (result == null) result = caseTPlanItemDefinition(tUserEvent);
                if (result == null) result = caseTCmmnElement(tUserEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TApplicability Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TApplicability Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTApplicabilityRule(TApplicabilityRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCase(TCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseFile(TCaseFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase File Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase File Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseFileItem(TCaseFileItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase File Item Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase File Item Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseFileItemDefinition(TCaseFileItemDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase File Item On Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase File Item On Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseFileItemOnPart(TCaseFileItemOnPart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase File Item Start Trigger</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase File Item Start Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseFileItemStartTrigger(TCaseFileItemStartTrigger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseParameter(TCaseParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCase Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCase Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCaseTask(TCaseTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TChildren</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TChildren</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTChildren(TChildren object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCmmn Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCmmn Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCmmnElement(TCmmnElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCmmn Element With Mixed Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCmmn Element With Mixed Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCmmnElementWithMixedContent(TCmmnElementWithMixedContent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDefinitions(TDefinitions object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TDiscretionary Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TDiscretionary Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTDiscretionaryItem(TDiscretionaryItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEvent</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEvent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTEvent(TEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TExpression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TExpression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTExpression(TExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>THuman Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>THuman Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTHumanTask(THumanTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TIf Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TIf Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTIfPart(TIfPart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TImport</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TImport</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTImport(TImport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TManual Activation Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TManual Activation Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTManualActivationRule(TManualActivationRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TMilestone</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TMilestone</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTMilestone(TMilestone object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TOn Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TOn Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTOnPart(TOnPart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TParameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TParameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTParameter(TParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TParameter Mapping</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TParameter Mapping</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTParameterMapping(TParameterMapping object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlan Fragment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlan Fragment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanFragment(TPlanFragment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlan Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlan Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanItem(TPlanItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlan Item Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlan Item Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanItemControl(TPlanItemControl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlan Item Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlan Item Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanItemDefinition(TPlanItemDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlan Item On Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlan Item On Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanItemOnPart(TPlanItemOnPart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlan Item Start Trigger</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlan Item Start Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanItemStartTrigger(TPlanItemStartTrigger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TPlanning Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TPlanning Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTPlanningTable(TPlanningTable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TProcess</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TProcess</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTProcess(TProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TProcess Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TProcess Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTProcessParameter(TProcessParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TProcess Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TProcess Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTProcessTask(TProcessTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TProperty</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TProperty</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTProperty(TProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRepetition Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRepetition Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRepetitionRule(TRepetitionRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRequired Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRequired Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRequiredRule(TRequiredRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRole</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRole</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRole(TRole object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TSentry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TSentry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTSentry(TSentry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TStage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TStage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTStage(TStage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TStart Trigger</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TStart Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTStartTrigger(TStartTrigger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TTable Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TTable Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTTableItem(TTableItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TTask</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TTask</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTTask(TTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TTimer Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TTimer Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTTimerEvent(TTimerEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TUser Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TUser Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTUserEvent(TUserEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //CMMNSwitch
