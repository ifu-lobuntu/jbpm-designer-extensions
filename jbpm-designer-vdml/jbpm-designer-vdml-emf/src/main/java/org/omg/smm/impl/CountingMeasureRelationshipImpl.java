/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.smm.CountingMeasure;
import org.omg.smm.CountingMeasureRelationship;
import org.omg.smm.Measure;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counting Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.CountingMeasureRelationshipImpl#getFromCountingMeasure <em>From Counting Measure</em>}</li>
 *   <li>{@link org.omg.smm.impl.CountingMeasureRelationshipImpl#getToCountedMeasure <em>To Counted Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountingMeasureRelationshipImpl extends MeasureRelationshipImpl implements CountingMeasureRelationship {
	/**
	 * The cached value of the '{@link #getToCountedMeasure() <em>To Counted Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCountedMeasure()
	 * @generated
	 * @ordered
	 */
	protected Measure toCountedMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountingMeasureRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SMMPackage.Literals.COUNTING_MEASURE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountingMeasure getFromCountingMeasure() {
		if (eContainerFeatureID() != SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE) return null;
		return (CountingMeasure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromCountingMeasure(CountingMeasure newFromCountingMeasure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromCountingMeasure, SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromCountingMeasure(CountingMeasure newFromCountingMeasure) {
		if (newFromCountingMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE && newFromCountingMeasure != null)) {
			if (EcoreUtil.isAncestor(this, newFromCountingMeasure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromCountingMeasure != null)
				msgs = ((InternalEObject)newFromCountingMeasure).eInverseAdd(this, SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO, CountingMeasure.class, msgs);
			msgs = basicSetFromCountingMeasure(newFromCountingMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE, newFromCountingMeasure, newFromCountingMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getToCountedMeasure() {
		if (toCountedMeasure != null && toCountedMeasure.eIsProxy()) {
			InternalEObject oldToCountedMeasure = (InternalEObject)toCountedMeasure;
			toCountedMeasure = (Measure)eResolveProxy(oldToCountedMeasure);
			if (toCountedMeasure != oldToCountedMeasure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.COUNTING_MEASURE_RELATIONSHIP__TO_COUNTED_MEASURE, oldToCountedMeasure, toCountedMeasure));
			}
		}
		return toCountedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetToCountedMeasure() {
		return toCountedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCountedMeasure(Measure newToCountedMeasure) {
		Measure oldToCountedMeasure = toCountedMeasure;
		toCountedMeasure = newToCountedMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.COUNTING_MEASURE_RELATIONSHIP__TO_COUNTED_MEASURE, oldToCountedMeasure, toCountedMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromCountingMeasure((CountingMeasure)otherEnd, msgs);
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
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				return basicSetFromCountingMeasure(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				return eInternalContainer().eInverseRemove(this, SMMPackage.COUNTING_MEASURE__COUNTED_MEASURE_TO, CountingMeasure.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				return getFromCountingMeasure();
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__TO_COUNTED_MEASURE:
				if (resolve) return getToCountedMeasure();
				return basicGetToCountedMeasure();
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
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				setFromCountingMeasure((CountingMeasure)newValue);
				return;
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__TO_COUNTED_MEASURE:
				setToCountedMeasure((Measure)newValue);
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
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				setFromCountingMeasure((CountingMeasure)null);
				return;
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__TO_COUNTED_MEASURE:
				setToCountedMeasure((Measure)null);
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
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__FROM_COUNTING_MEASURE:
				return getFromCountingMeasure() != null;
			case SMMPackage.COUNTING_MEASURE_RELATIONSHIP__TO_COUNTED_MEASURE:
				return toCountedMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //CountingMeasureRelationshipImpl
