/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TManualActivationRule;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TRepetitionRule;
import org.omg.cmmn.TRequiredRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan Item Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemControlImpl#getRepetitionRule <em>Repetition Rule</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemControlImpl#getRequiredRule <em>Required Rule</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemControlImpl#getManualActivationRule <em>Manual Activation Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPlanItemControlImpl extends TCmmnElementImpl implements TPlanItemControl {
    /**
     * The cached value of the '{@link #getRepetitionRule() <em>Repetition Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepetitionRule()
     * @generated
     * @ordered
     */
    protected TRepetitionRule repetitionRule;

    /**
     * The cached value of the '{@link #getRequiredRule() <em>Required Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredRule()
     * @generated
     * @ordered
     */
    protected TRequiredRule requiredRule;

    /**
     * The cached value of the '{@link #getManualActivationRule() <em>Manual Activation Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManualActivationRule()
     * @generated
     * @ordered
     */
    protected TManualActivationRule manualActivationRule;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TPlanItemControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPLAN_ITEM_CONTROL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRepetitionRule getRepetitionRule() {
        return repetitionRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRepetitionRule(TRepetitionRule newRepetitionRule, NotificationChain msgs) {
        TRepetitionRule oldRepetitionRule = repetitionRule;
        repetitionRule = newRepetitionRule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE, oldRepetitionRule, newRepetitionRule);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepetitionRule(TRepetitionRule newRepetitionRule) {
        if (newRepetitionRule != repetitionRule) {
            NotificationChain msgs = null;
            if (repetitionRule != null)
                msgs = ((InternalEObject)repetitionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE, null, msgs);
            if (newRepetitionRule != null)
                msgs = ((InternalEObject)newRepetitionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE, null, msgs);
            msgs = basicSetRepetitionRule(newRepetitionRule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE, newRepetitionRule, newRepetitionRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRequiredRule getRequiredRule() {
        return requiredRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequiredRule(TRequiredRule newRequiredRule, NotificationChain msgs) {
        TRequiredRule oldRequiredRule = requiredRule;
        requiredRule = newRequiredRule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE, oldRequiredRule, newRequiredRule);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequiredRule(TRequiredRule newRequiredRule) {
        if (newRequiredRule != requiredRule) {
            NotificationChain msgs = null;
            if (requiredRule != null)
                msgs = ((InternalEObject)requiredRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE, null, msgs);
            if (newRequiredRule != null)
                msgs = ((InternalEObject)newRequiredRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE, null, msgs);
            msgs = basicSetRequiredRule(newRequiredRule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE, newRequiredRule, newRequiredRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TManualActivationRule getManualActivationRule() {
        return manualActivationRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManualActivationRule(TManualActivationRule newManualActivationRule, NotificationChain msgs) {
        TManualActivationRule oldManualActivationRule = manualActivationRule;
        manualActivationRule = newManualActivationRule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE, oldManualActivationRule, newManualActivationRule);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManualActivationRule(TManualActivationRule newManualActivationRule) {
        if (newManualActivationRule != manualActivationRule) {
            NotificationChain msgs = null;
            if (manualActivationRule != null)
                msgs = ((InternalEObject)manualActivationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE, null, msgs);
            if (newManualActivationRule != null)
                msgs = ((InternalEObject)newManualActivationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE, null, msgs);
            msgs = basicSetManualActivationRule(newManualActivationRule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE, newManualActivationRule, newManualActivationRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE:
                return basicSetRepetitionRule(null, msgs);
            case CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE:
                return basicSetRequiredRule(null, msgs);
            case CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE:
                return basicSetManualActivationRule(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE:
                return getRepetitionRule();
            case CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE:
                return getRequiredRule();
            case CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE:
                return getManualActivationRule();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE:
                setRepetitionRule((TRepetitionRule)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE:
                setRequiredRule((TRequiredRule)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE:
                setManualActivationRule((TManualActivationRule)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE:
                setRepetitionRule((TRepetitionRule)null);
                return;
            case CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE:
                setRequiredRule((TRequiredRule)null);
                return;
            case CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE:
                setManualActivationRule((TManualActivationRule)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM_CONTROL__REPETITION_RULE:
                return repetitionRule != null;
            case CMMNPackage.TPLAN_ITEM_CONTROL__REQUIRED_RULE:
                return requiredRule != null;
            case CMMNPackage.TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE:
                return manualActivationRule != null;
        }
        return super.eIsSet(featureID);
    }

} //TPlanItemControlImpl
