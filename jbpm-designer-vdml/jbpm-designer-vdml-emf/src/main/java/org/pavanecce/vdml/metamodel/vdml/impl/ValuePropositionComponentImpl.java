/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.ValueAdd;
import org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Proposition Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl#getPercentageWeight <em>Percentage Weight</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl#getValueImpactForProvider <em>Value Impact For Provider</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl#getValueImpactForRecipient <em>Value Impact For Recipient</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl#getArticulatedValue <em>Articulated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuePropositionComponentImpl extends ValueElementImpl implements ValuePropositionComponent {
    /**
     * The cached value of the '{@link #getPercentageWeight() <em>Percentage Weight</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentageWeight()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic percentageWeight;

    /**
     * The cached value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatisfactionLevel()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic satisfactionLevel;

    /**
     * The cached value of the '{@link #getValueImpactForProvider() <em>Value Impact For Provider</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueImpactForProvider()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic valueImpactForProvider;

    /**
     * The cached value of the '{@link #getValueImpactForRecipient() <em>Value Impact For Recipient</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueImpactForRecipient()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic valueImpactForRecipient;

    /**
     * The cached value of the '{@link #getArticulatedValue() <em>Articulated Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArticulatedValue()
     * @generated
     * @ordered
     */
    protected ValueAdd articulatedValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValuePropositionComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.VALUE_PROPOSITION_COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getPercentageWeight() {
        return percentageWeight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPercentageWeight(MeasuredCharacteristic newPercentageWeight, NotificationChain msgs) {
        MeasuredCharacteristic oldPercentageWeight = percentageWeight;
        percentageWeight = newPercentageWeight;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, oldPercentageWeight, newPercentageWeight);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPercentageWeight(MeasuredCharacteristic newPercentageWeight) {
        if (newPercentageWeight != percentageWeight) {
            NotificationChain msgs = null;
            if (percentageWeight != null)
                msgs = ((InternalEObject)percentageWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, null, msgs);
            if (newPercentageWeight != null)
                msgs = ((InternalEObject)newPercentageWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, null, msgs);
            msgs = basicSetPercentageWeight(newPercentageWeight, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, newPercentageWeight, newPercentageWeight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getSatisfactionLevel() {
        return satisfactionLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSatisfactionLevel(MeasuredCharacteristic newSatisfactionLevel, NotificationChain msgs) {
        MeasuredCharacteristic oldSatisfactionLevel = satisfactionLevel;
        satisfactionLevel = newSatisfactionLevel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, oldSatisfactionLevel, newSatisfactionLevel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSatisfactionLevel(MeasuredCharacteristic newSatisfactionLevel) {
        if (newSatisfactionLevel != satisfactionLevel) {
            NotificationChain msgs = null;
            if (satisfactionLevel != null)
                msgs = ((InternalEObject)satisfactionLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, null, msgs);
            if (newSatisfactionLevel != null)
                msgs = ((InternalEObject)newSatisfactionLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, null, msgs);
            msgs = basicSetSatisfactionLevel(newSatisfactionLevel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, newSatisfactionLevel, newSatisfactionLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getValueImpactForProvider() {
        return valueImpactForProvider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueImpactForProvider(MeasuredCharacteristic newValueImpactForProvider, NotificationChain msgs) {
        MeasuredCharacteristic oldValueImpactForProvider = valueImpactForProvider;
        valueImpactForProvider = newValueImpactForProvider;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER, oldValueImpactForProvider, newValueImpactForProvider);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueImpactForProvider(MeasuredCharacteristic newValueImpactForProvider) {
        if (newValueImpactForProvider != valueImpactForProvider) {
            NotificationChain msgs = null;
            if (valueImpactForProvider != null)
                msgs = ((InternalEObject)valueImpactForProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER, null, msgs);
            if (newValueImpactForProvider != null)
                msgs = ((InternalEObject)newValueImpactForProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER, null, msgs);
            msgs = basicSetValueImpactForProvider(newValueImpactForProvider, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER, newValueImpactForProvider, newValueImpactForProvider));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getValueImpactForRecipient() {
        return valueImpactForRecipient;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueImpactForRecipient(MeasuredCharacteristic newValueImpactForRecipient, NotificationChain msgs) {
        MeasuredCharacteristic oldValueImpactForRecipient = valueImpactForRecipient;
        valueImpactForRecipient = newValueImpactForRecipient;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT, oldValueImpactForRecipient, newValueImpactForRecipient);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueImpactForRecipient(MeasuredCharacteristic newValueImpactForRecipient) {
        if (newValueImpactForRecipient != valueImpactForRecipient) {
            NotificationChain msgs = null;
            if (valueImpactForRecipient != null)
                msgs = ((InternalEObject)valueImpactForRecipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT, null, msgs);
            if (newValueImpactForRecipient != null)
                msgs = ((InternalEObject)newValueImpactForRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT, null, msgs);
            msgs = basicSetValueImpactForRecipient(newValueImpactForRecipient, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT, newValueImpactForRecipient, newValueImpactForRecipient));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueAdd getArticulatedValue() {
        if (articulatedValue != null && articulatedValue.eIsProxy()) {
            InternalEObject oldArticulatedValue = (InternalEObject)articulatedValue;
            articulatedValue = (ValueAdd)eResolveProxy(oldArticulatedValue);
            if (articulatedValue != oldArticulatedValue) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE, oldArticulatedValue, articulatedValue));
            }
        }
        return articulatedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueAdd basicGetArticulatedValue() {
        return articulatedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetArticulatedValue(ValueAdd newArticulatedValue, NotificationChain msgs) {
        ValueAdd oldArticulatedValue = articulatedValue;
        articulatedValue = newArticulatedValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE, oldArticulatedValue, newArticulatedValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArticulatedValue(ValueAdd newArticulatedValue) {
        if (newArticulatedValue != articulatedValue) {
            NotificationChain msgs = null;
            if (articulatedValue != null)
                msgs = ((InternalEObject)articulatedValue).eInverseRemove(this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, ValueAdd.class, msgs);
            if (newArticulatedValue != null)
                msgs = ((InternalEObject)newArticulatedValue).eInverseAdd(this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, ValueAdd.class, msgs);
            msgs = basicSetArticulatedValue(newArticulatedValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE, newArticulatedValue, newArticulatedValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
                if (articulatedValue != null)
                    msgs = ((InternalEObject)articulatedValue).eInverseRemove(this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, ValueAdd.class, msgs);
                return basicSetArticulatedValue((ValueAdd)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
                return basicSetPercentageWeight(null, msgs);
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
                return basicSetSatisfactionLevel(null, msgs);
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER:
                return basicSetValueImpactForProvider(null, msgs);
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT:
                return basicSetValueImpactForRecipient(null, msgs);
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
                return basicSetArticulatedValue(null, msgs);
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
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
                return getPercentageWeight();
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
                return getSatisfactionLevel();
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER:
                return getValueImpactForProvider();
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT:
                return getValueImpactForRecipient();
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
                if (resolve) return getArticulatedValue();
                return basicGetArticulatedValue();
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
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
                setPercentageWeight((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
                setSatisfactionLevel((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER:
                setValueImpactForProvider((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT:
                setValueImpactForRecipient((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
                setArticulatedValue((ValueAdd)newValue);
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
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
                setPercentageWeight((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
                setSatisfactionLevel((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER:
                setValueImpactForProvider((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT:
                setValueImpactForRecipient((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
                setArticulatedValue((ValueAdd)null);
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
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
                return percentageWeight != null;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
                return satisfactionLevel != null;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER:
                return valueImpactForProvider != null;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT:
                return valueImpactForRecipient != null;
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE:
                return articulatedValue != null;
        }
        return super.eIsSet(featureID);
    }

} //ValuePropositionComponentImpl
