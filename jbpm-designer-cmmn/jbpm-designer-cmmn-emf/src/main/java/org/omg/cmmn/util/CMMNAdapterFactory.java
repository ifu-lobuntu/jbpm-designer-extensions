/**
 */
package org.omg.cmmn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.cmmn.CMMNPackage
 * @generated
 */
public class CMMNAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CMMNPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CMMNPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CMMNSwitch<Adapter> modelSwitch =
        new CMMNSwitch<Adapter>() {
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseTApplicabilityRule(TApplicabilityRule object) {
                return createTApplicabilityRuleAdapter();
            }
            @Override
            public Adapter caseTCase(TCase object) {
                return createTCaseAdapter();
            }
            @Override
            public Adapter caseTCaseFile(TCaseFile object) {
                return createTCaseFileAdapter();
            }
            @Override
            public Adapter caseTCaseFileItem(TCaseFileItem object) {
                return createTCaseFileItemAdapter();
            }
            @Override
            public Adapter caseTCaseFileItemDefinition(TCaseFileItemDefinition object) {
                return createTCaseFileItemDefinitionAdapter();
            }
            @Override
            public Adapter caseTCaseFileItemOnPart(TCaseFileItemOnPart object) {
                return createTCaseFileItemOnPartAdapter();
            }
            @Override
            public Adapter caseTCaseFileItemStartTrigger(TCaseFileItemStartTrigger object) {
                return createTCaseFileItemStartTriggerAdapter();
            }
            @Override
            public Adapter caseTCaseParameter(TCaseParameter object) {
                return createTCaseParameterAdapter();
            }
            @Override
            public Adapter caseTCaseTask(TCaseTask object) {
                return createTCaseTaskAdapter();
            }
            @Override
            public Adapter caseTChildren(TChildren object) {
                return createTChildrenAdapter();
            }
            @Override
            public Adapter caseTCmmnElement(TCmmnElement object) {
                return createTCmmnElementAdapter();
            }
            @Override
            public Adapter caseTCmmnElementWithMixedContent(TCmmnElementWithMixedContent object) {
                return createTCmmnElementWithMixedContentAdapter();
            }
            @Override
            public Adapter caseTDefinitions(TDefinitions object) {
                return createTDefinitionsAdapter();
            }
            @Override
            public Adapter caseTDiscretionaryItem(TDiscretionaryItem object) {
                return createTDiscretionaryItemAdapter();
            }
            @Override
            public Adapter caseTEvent(TEvent object) {
                return createTEventAdapter();
            }
            @Override
            public Adapter caseTExpression(TExpression object) {
                return createTExpressionAdapter();
            }
            @Override
            public Adapter caseTHumanTask(THumanTask object) {
                return createTHumanTaskAdapter();
            }
            @Override
            public Adapter caseTIfPart(TIfPart object) {
                return createTIfPartAdapter();
            }
            @Override
            public Adapter caseTImport(TImport object) {
                return createTImportAdapter();
            }
            @Override
            public Adapter caseTManualActivationRule(TManualActivationRule object) {
                return createTManualActivationRuleAdapter();
            }
            @Override
            public Adapter caseTMilestone(TMilestone object) {
                return createTMilestoneAdapter();
            }
            @Override
            public Adapter caseTOnPart(TOnPart object) {
                return createTOnPartAdapter();
            }
            @Override
            public Adapter caseTParameter(TParameter object) {
                return createTParameterAdapter();
            }
            @Override
            public Adapter caseTParameterMapping(TParameterMapping object) {
                return createTParameterMappingAdapter();
            }
            @Override
            public Adapter caseTPlanFragment(TPlanFragment object) {
                return createTPlanFragmentAdapter();
            }
            @Override
            public Adapter caseTPlanItem(TPlanItem object) {
                return createTPlanItemAdapter();
            }
            @Override
            public Adapter caseTPlanItemControl(TPlanItemControl object) {
                return createTPlanItemControlAdapter();
            }
            @Override
            public Adapter caseTPlanItemDefinition(TPlanItemDefinition object) {
                return createTPlanItemDefinitionAdapter();
            }
            @Override
            public Adapter caseTPlanItemOnPart(TPlanItemOnPart object) {
                return createTPlanItemOnPartAdapter();
            }
            @Override
            public Adapter caseTPlanItemStartTrigger(TPlanItemStartTrigger object) {
                return createTPlanItemStartTriggerAdapter();
            }
            @Override
            public Adapter caseTPlanningTable(TPlanningTable object) {
                return createTPlanningTableAdapter();
            }
            @Override
            public Adapter caseTProcess(TProcess object) {
                return createTProcessAdapter();
            }
            @Override
            public Adapter caseTProcessParameter(TProcessParameter object) {
                return createTProcessParameterAdapter();
            }
            @Override
            public Adapter caseTProcessTask(TProcessTask object) {
                return createTProcessTaskAdapter();
            }
            @Override
            public Adapter caseTProperty(TProperty object) {
                return createTPropertyAdapter();
            }
            @Override
            public Adapter caseTRepetitionRule(TRepetitionRule object) {
                return createTRepetitionRuleAdapter();
            }
            @Override
            public Adapter caseTRequiredRule(TRequiredRule object) {
                return createTRequiredRuleAdapter();
            }
            @Override
            public Adapter caseTRole(TRole object) {
                return createTRoleAdapter();
            }
            @Override
            public Adapter caseTSentry(TSentry object) {
                return createTSentryAdapter();
            }
            @Override
            public Adapter caseTStage(TStage object) {
                return createTStageAdapter();
            }
            @Override
            public Adapter caseTStartTrigger(TStartTrigger object) {
                return createTStartTriggerAdapter();
            }
            @Override
            public Adapter caseTTableItem(TTableItem object) {
                return createTTableItemAdapter();
            }
            @Override
            public Adapter caseTTask(TTask object) {
                return createTTaskAdapter();
            }
            @Override
            public Adapter caseTTimerEvent(TTimerEvent object) {
                return createTTimerEventAdapter();
            }
            @Override
            public Adapter caseTUserEvent(TUserEvent object) {
                return createTUserEventAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TApplicabilityRule <em>TApplicability Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TApplicabilityRule
     * @generated
     */
    public Adapter createTApplicabilityRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCase <em>TCase</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCase
     * @generated
     */
    public Adapter createTCaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseFile <em>TCase File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseFile
     * @generated
     */
    public Adapter createTCaseFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseFileItem <em>TCase File Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseFileItem
     * @generated
     */
    public Adapter createTCaseFileItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseFileItemDefinition <em>TCase File Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseFileItemDefinition
     * @generated
     */
    public Adapter createTCaseFileItemDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseFileItemOnPart <em>TCase File Item On Part</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseFileItemOnPart
     * @generated
     */
    public Adapter createTCaseFileItemOnPartAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseFileItemStartTrigger <em>TCase File Item Start Trigger</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseFileItemStartTrigger
     * @generated
     */
    public Adapter createTCaseFileItemStartTriggerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseParameter <em>TCase Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseParameter
     * @generated
     */
    public Adapter createTCaseParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCaseTask <em>TCase Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCaseTask
     * @generated
     */
    public Adapter createTCaseTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TChildren <em>TChildren</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TChildren
     * @generated
     */
    public Adapter createTChildrenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCmmnElement <em>TCmmn Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCmmnElement
     * @generated
     */
    public Adapter createTCmmnElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TCmmnElementWithMixedContent <em>TCmmn Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TCmmnElementWithMixedContent
     * @generated
     */
    public Adapter createTCmmnElementWithMixedContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TDefinitions <em>TDefinitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TDefinitions
     * @generated
     */
    public Adapter createTDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TDiscretionaryItem <em>TDiscretionary Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TDiscretionaryItem
     * @generated
     */
    public Adapter createTDiscretionaryItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TEvent <em>TEvent</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TEvent
     * @generated
     */
    public Adapter createTEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TExpression <em>TExpression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TExpression
     * @generated
     */
    public Adapter createTExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.THumanTask <em>THuman Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.THumanTask
     * @generated
     */
    public Adapter createTHumanTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TIfPart <em>TIf Part</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TIfPart
     * @generated
     */
    public Adapter createTIfPartAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TImport <em>TImport</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TImport
     * @generated
     */
    public Adapter createTImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TManualActivationRule <em>TManual Activation Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TManualActivationRule
     * @generated
     */
    public Adapter createTManualActivationRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TMilestone <em>TMilestone</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TMilestone
     * @generated
     */
    public Adapter createTMilestoneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TOnPart <em>TOn Part</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TOnPart
     * @generated
     */
    public Adapter createTOnPartAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TParameter <em>TParameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TParameter
     * @generated
     */
    public Adapter createTParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TParameterMapping <em>TParameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TParameterMapping
     * @generated
     */
    public Adapter createTParameterMappingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanFragment <em>TPlan Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanFragment
     * @generated
     */
    public Adapter createTPlanFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanItem <em>TPlan Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanItem
     * @generated
     */
    public Adapter createTPlanItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanItemControl <em>TPlan Item Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanItemControl
     * @generated
     */
    public Adapter createTPlanItemControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanItemDefinition <em>TPlan Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanItemDefinition
     * @generated
     */
    public Adapter createTPlanItemDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanItemOnPart <em>TPlan Item On Part</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanItemOnPart
     * @generated
     */
    public Adapter createTPlanItemOnPartAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanItemStartTrigger <em>TPlan Item Start Trigger</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanItemStartTrigger
     * @generated
     */
    public Adapter createTPlanItemStartTriggerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TPlanningTable <em>TPlanning Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TPlanningTable
     * @generated
     */
    public Adapter createTPlanningTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TProcess <em>TProcess</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TProcess
     * @generated
     */
    public Adapter createTProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TProcessParameter <em>TProcess Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TProcessParameter
     * @generated
     */
    public Adapter createTProcessParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TProcessTask <em>TProcess Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TProcessTask
     * @generated
     */
    public Adapter createTProcessTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TProperty <em>TProperty</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TProperty
     * @generated
     */
    public Adapter createTPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TRepetitionRule <em>TRepetition Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TRepetitionRule
     * @generated
     */
    public Adapter createTRepetitionRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TRequiredRule <em>TRequired Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TRequiredRule
     * @generated
     */
    public Adapter createTRequiredRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TRole <em>TRole</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TRole
     * @generated
     */
    public Adapter createTRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TSentry <em>TSentry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TSentry
     * @generated
     */
    public Adapter createTSentryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TStage <em>TStage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TStage
     * @generated
     */
    public Adapter createTStageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TStartTrigger <em>TStart Trigger</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TStartTrigger
     * @generated
     */
    public Adapter createTStartTriggerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TTableItem <em>TTable Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TTableItem
     * @generated
     */
    public Adapter createTTableItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TTask <em>TTask</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TTask
     * @generated
     */
    public Adapter createTTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TTimerEvent <em>TTimer Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TTimerEvent
     * @generated
     */
    public Adapter createTTimerEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.cmmn.TUserEvent <em>TUser Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.cmmn.TUserEvent
     * @generated
     */
    public Adapter createTUserEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //CMMNAdapterFactory
