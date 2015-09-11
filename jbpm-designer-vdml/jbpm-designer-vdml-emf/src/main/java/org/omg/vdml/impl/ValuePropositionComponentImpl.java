/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValuePropositionComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Proposition Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ValuePropositionComponentImpl#getPercentageWeight <em>Percentage Weight</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValuePropositionComponentImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 * </ul>
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
		return VDMLPackage.Literals.VALUE_PROPOSITION_COMPONENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, oldPercentageWeight, newPercentageWeight);
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
				msgs = ((InternalEObject)percentageWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, null, msgs);
			if (newPercentageWeight != null)
				msgs = ((InternalEObject)newPercentageWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, null, msgs);
			msgs = basicSetPercentageWeight(newPercentageWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT, newPercentageWeight, newPercentageWeight));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, oldSatisfactionLevel, newSatisfactionLevel);
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
				msgs = ((InternalEObject)satisfactionLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, null, msgs);
			if (newSatisfactionLevel != null)
				msgs = ((InternalEObject)newSatisfactionLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, null, msgs);
			msgs = basicSetSatisfactionLevel(newSatisfactionLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL, newSatisfactionLevel, newSatisfactionLevel));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				return basicSetPercentageWeight(null, msgs);
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				return basicSetSatisfactionLevel(null, msgs);
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
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				return getPercentageWeight();
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
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
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				setPercentageWeight((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((MeasuredCharacteristic)newValue);
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
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				setPercentageWeight((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((MeasuredCharacteristic)null);
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
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT:
				return percentageWeight != null;
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL:
				return satisfactionLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePropositionComponentImpl
