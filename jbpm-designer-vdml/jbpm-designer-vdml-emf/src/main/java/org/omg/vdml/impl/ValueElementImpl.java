
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDefinition;
import org.omg.vdml.ValueElement;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ValueElementImpl#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueElementImpl#getValueMeasurement <em>Value Measurement</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueElementImpl#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueElementImpl#getAggregatedFrom <em>Aggregated From</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueElementImpl#getAggregatedTo <em>Aggregated To</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueElementImpl#getIsAtomic <em>Is Atomic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueElementImpl extends MeasurableElementImpl implements ValueElement {
    /**
	 * The cached value of the '{@link #getValueDefinition() <em>Value Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValueDefinition()
	 * @generated
	 * @ordered
	 */
    protected ValueDefinition valueDefinition;

    /**
	 * The cached value of the '{@link #getValueMeasurement() <em>Value Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValueMeasurement()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic valueMeasurement;

    /**
	 * The cached value of the '{@link #getBenchmark() <em>Benchmark</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBenchmark()
	 * @generated
	 * @ordered
	 */
    protected EList<MeasuredCharacteristic> benchmark;

    /**
	 * The cached value of the '{@link #getAggregatedFrom() <em>Aggregated From</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAggregatedFrom()
	 * @generated
	 * @ordered
	 */
    protected EList<ValueElement> aggregatedFrom;

    /**
	 * The cached value of the '{@link #getAggregatedTo() <em>Aggregated To</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAggregatedTo()
	 * @generated
	 * @ordered
	 */
    protected EList<ValueElement> aggregatedTo;

    /**
	 * The default value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_ATOMIC_EDEFAULT = Boolean.TRUE;

    /**
	 * The cached value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
    protected Boolean isAtomic = IS_ATOMIC_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ValueElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.VALUE_ELEMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueDefinition getValueDefinition() {
		if (valueDefinition != null && valueDefinition.eIsProxy()) {
			InternalEObject oldValueDefinition = (InternalEObject)valueDefinition;
			valueDefinition = (ValueDefinition)eResolveProxy(oldValueDefinition);
			if (valueDefinition != oldValueDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.VALUE_ELEMENT__VALUE_DEFINITION, oldValueDefinition, valueDefinition));
			}
		}
		return valueDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueDefinition basicGetValueDefinition() {
		return valueDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValueDefinition(ValueDefinition newValueDefinition) {
		ValueDefinition oldValueDefinition = valueDefinition;
		valueDefinition = newValueDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_ELEMENT__VALUE_DEFINITION, oldValueDefinition, valueDefinition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getValueMeasurement() {
		return valueMeasurement;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetValueMeasurement(MeasuredCharacteristic newValueMeasurement, NotificationChain msgs) {
		MeasuredCharacteristic oldValueMeasurement = valueMeasurement;
		valueMeasurement = newValueMeasurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, oldValueMeasurement, newValueMeasurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValueMeasurement(MeasuredCharacteristic newValueMeasurement) {
		if (newValueMeasurement != valueMeasurement) {
			NotificationChain msgs = null;
			if (valueMeasurement != null)
				msgs = ((InternalEObject)valueMeasurement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, null, msgs);
			if (newValueMeasurement != null)
				msgs = ((InternalEObject)newValueMeasurement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, null, msgs);
			msgs = basicSetValueMeasurement(newValueMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, newValueMeasurement, newValueMeasurement));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MeasuredCharacteristic> getBenchmark() {
		if (benchmark == null) {
			benchmark = new EObjectContainmentEList<MeasuredCharacteristic>(MeasuredCharacteristic.class, this, VDMLPackage.VALUE_ELEMENT__BENCHMARK);
		}
		return benchmark;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ValueElement> getAggregatedFrom() {
		if (aggregatedFrom == null) {
			aggregatedFrom = new EObjectWithInverseResolvingEList.ManyInverse<ValueElement>(ValueElement.class, this, VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM, VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO);
		}
		return aggregatedFrom;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ValueElement> getAggregatedTo() {
		if (aggregatedTo == null) {
			aggregatedTo = new EObjectWithInverseResolvingEList.ManyInverse<ValueElement>(ValueElement.class, this, VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO, VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM);
		}
		return aggregatedTo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsAtomic() {
		return isAtomic;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsAtomic(Boolean newIsAtomic) {
		Boolean oldIsAtomic = isAtomic;
		isAtomic = newIsAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_ELEMENT__IS_ATOMIC, oldIsAtomic, isAtomic));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregatedFrom()).basicAdd(otherEnd, msgs);
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregatedTo()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
				return basicSetValueMeasurement(null, msgs);
			case VDMLPackage.VALUE_ELEMENT__BENCHMARK:
				return ((InternalEList<?>)getBenchmark()).basicRemove(otherEnd, msgs);
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM:
				return ((InternalEList<?>)getAggregatedFrom()).basicRemove(otherEnd, msgs);
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO:
				return ((InternalEList<?>)getAggregatedTo()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.VALUE_ELEMENT__VALUE_DEFINITION:
				if (resolve) return getValueDefinition();
				return basicGetValueDefinition();
			case VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
				return getValueMeasurement();
			case VDMLPackage.VALUE_ELEMENT__BENCHMARK:
				return getBenchmark();
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM:
				return getAggregatedFrom();
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO:
				return getAggregatedTo();
			case VDMLPackage.VALUE_ELEMENT__IS_ATOMIC:
				return getIsAtomic();
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
			case VDMLPackage.VALUE_ELEMENT__VALUE_DEFINITION:
				setValueDefinition((ValueDefinition)newValue);
				return;
			case VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
				setValueMeasurement((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.VALUE_ELEMENT__BENCHMARK:
				getBenchmark().clear();
				getBenchmark().addAll((Collection<? extends MeasuredCharacteristic>)newValue);
				return;
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM:
				getAggregatedFrom().clear();
				getAggregatedFrom().addAll((Collection<? extends ValueElement>)newValue);
				return;
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO:
				getAggregatedTo().clear();
				getAggregatedTo().addAll((Collection<? extends ValueElement>)newValue);
				return;
			case VDMLPackage.VALUE_ELEMENT__IS_ATOMIC:
				setIsAtomic((Boolean)newValue);
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
			case VDMLPackage.VALUE_ELEMENT__VALUE_DEFINITION:
				setValueDefinition((ValueDefinition)null);
				return;
			case VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
				setValueMeasurement((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.VALUE_ELEMENT__BENCHMARK:
				getBenchmark().clear();
				return;
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM:
				getAggregatedFrom().clear();
				return;
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO:
				getAggregatedTo().clear();
				return;
			case VDMLPackage.VALUE_ELEMENT__IS_ATOMIC:
				setIsAtomic(IS_ATOMIC_EDEFAULT);
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
			case VDMLPackage.VALUE_ELEMENT__VALUE_DEFINITION:
				return valueDefinition != null;
			case VDMLPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
				return valueMeasurement != null;
			case VDMLPackage.VALUE_ELEMENT__BENCHMARK:
				return benchmark != null && !benchmark.isEmpty();
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_FROM:
				return aggregatedFrom != null && !aggregatedFrom.isEmpty();
			case VDMLPackage.VALUE_ELEMENT__AGGREGATED_TO:
				return aggregatedTo != null && !aggregatedTo.isEmpty();
			case VDMLPackage.VALUE_ELEMENT__IS_ATOMIC:
				return IS_ATOMIC_EDEFAULT == null ? isAtomic != null : !IS_ATOMIC_EDEFAULT.equals(isAtomic);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAtomic: ");
		result.append(isAtomic);
		result.append(')');
		return result.toString();
	}

} //ValueElementImpl
