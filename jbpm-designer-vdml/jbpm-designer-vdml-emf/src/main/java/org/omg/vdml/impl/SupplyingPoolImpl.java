/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.vdml.CalendarService;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Position;
import org.omg.vdml.SupplyingPool;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplying Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.SupplyingPoolImpl#getPoolCalendar <em>Pool Calendar</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingPoolImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingPoolImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyingPoolImpl extends SupplyingStoreImpl implements SupplyingPool {
	/**
	 * The cached value of the '{@link #getPoolCalendar() <em>Pool Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolCalendar()
	 * @generated
	 * @ordered
	 */
	protected CalendarService poolCalendar;

	/**
	 * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected MeasuredCharacteristic poolSize;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyingPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.SUPPLYING_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarService getPoolCalendar() {
		return poolCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoolCalendar(CalendarService newPoolCalendar, NotificationChain msgs) {
		CalendarService oldPoolCalendar = poolCalendar;
		poolCalendar = newPoolCalendar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR, oldPoolCalendar, newPoolCalendar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoolCalendar(CalendarService newPoolCalendar) {
		if (newPoolCalendar != poolCalendar) {
			NotificationChain msgs = null;
			if (poolCalendar != null)
				msgs = ((InternalEObject)poolCalendar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR, null, msgs);
			if (newPoolCalendar != null)
				msgs = ((InternalEObject)newPoolCalendar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR, null, msgs);
			msgs = basicSetPoolCalendar(newPoolCalendar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR, newPoolCalendar, newPoolCalendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredCharacteristic getPoolSize() {
		return poolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoolSize(MeasuredCharacteristic newPoolSize, NotificationChain msgs) {
		MeasuredCharacteristic oldPoolSize = poolSize;
		poolSize = newPoolSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_POOL__POOL_SIZE, oldPoolSize, newPoolSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoolSize(MeasuredCharacteristic newPoolSize) {
		if (newPoolSize != poolSize) {
			NotificationChain msgs = null;
			if (poolSize != null)
				msgs = ((InternalEObject)poolSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_POOL__POOL_SIZE, null, msgs);
			if (newPoolSize != null)
				msgs = ((InternalEObject)newPoolSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_POOL__POOL_SIZE, null, msgs);
			msgs = basicSetPoolSize(newPoolSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_POOL__POOL_SIZE, newPoolSize, newPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getPosition() {
		if (position == null) {
			position = new EObjectResolvingEList<Position>(Position.class, this, VDMLPackage.SUPPLYING_POOL__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR:
				return basicSetPoolCalendar(null, msgs);
			case VDMLPackage.SUPPLYING_POOL__POOL_SIZE:
				return basicSetPoolSize(null, msgs);
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
			case VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR:
				return getPoolCalendar();
			case VDMLPackage.SUPPLYING_POOL__POOL_SIZE:
				return getPoolSize();
			case VDMLPackage.SUPPLYING_POOL__POSITION:
				return getPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR:
				setPoolCalendar((CalendarService)newValue);
				return;
			case VDMLPackage.SUPPLYING_POOL__POOL_SIZE:
				setPoolSize((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.SUPPLYING_POOL__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Position>)newValue);
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
			case VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR:
				setPoolCalendar((CalendarService)null);
				return;
			case VDMLPackage.SUPPLYING_POOL__POOL_SIZE:
				setPoolSize((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.SUPPLYING_POOL__POSITION:
				getPosition().clear();
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
			case VDMLPackage.SUPPLYING_POOL__POOL_CALENDAR:
				return poolCalendar != null;
			case VDMLPackage.SUPPLYING_POOL__POOL_SIZE:
				return poolSize != null;
			case VDMLPackage.SUPPLYING_POOL__POSITION:
				return position != null && !position.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplyingPoolImpl
