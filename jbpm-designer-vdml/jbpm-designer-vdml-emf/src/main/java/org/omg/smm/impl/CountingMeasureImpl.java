/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.CountingMeasure;
import org.omg.smm.CountingMeasureRelationship;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counting Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.CountingMeasureImpl#getCountedMeasureTo <em>Counted Measure To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountingMeasureImpl extends DirectMeasureImpl implements CountingMeasure {
    /**
	 * The cached value of the '{@link #getCountedMeasureTo() <em>Counted Measure To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountedMeasureTo()
	 * @generated
	 * @ordered
	 */
	protected CountingMeasureRelationship countedMeasureTo;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CountingMeasureImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.COUNTING_MEASURE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountingMeasureRelationship getCountedMeasureTo() {
		return countedMeasureTo;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountedMeasureTo(CountingMeasureRelationship newCountedMeasureTo, NotificationChain msgs) {
		CountingMeasureRelationship oldCountedMeasureTo = countedMeasureTo;
		countedMeasureTo = newCountedMeasureTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO, oldCountedMeasureTo, newCountedMeasureTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountedMeasureTo(CountingMeasureRelationship newCountedMeasureTo) {
		if (newCountedMeasureTo != countedMeasureTo) {
			NotificationChain msgs = null;
			if (countedMeasureTo != null)
				msgs = ((InternalEObject)countedMeasureTo).eInverseRemove(this, SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE, CountingMeasureRelationship.class, msgs);
			if (newCountedMeasureTo != null)
				msgs = ((InternalEObject)newCountedMeasureTo).eInverseAdd(this, SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE, CountingMeasureRelationship.class, msgs);
			msgs = basicSetCountedMeasureTo(newCountedMeasureTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO, newCountedMeasureTo, newCountedMeasureTo));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO:
				if (countedMeasureTo != null)
					msgs = ((InternalEObject)countedMeasureTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO, null, msgs);
				return basicSetCountedMeasureTo((CountingMeasureRelationship)otherEnd, msgs);
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
			case SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO:
				return basicSetCountedMeasureTo(null, msgs);
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
			case SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO:
				return getCountedMeasureTo();
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
			case SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO:
				setCountedMeasureTo((CountingMeasureRelationship)newValue);
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
			case SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO:
				setCountedMeasureTo((CountingMeasureRelationship)null);
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
			case SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO:
				return countedMeasureTo != null;
		}
		return super.eIsSet(featureID);
	}

} //CountingMeasureImpl
