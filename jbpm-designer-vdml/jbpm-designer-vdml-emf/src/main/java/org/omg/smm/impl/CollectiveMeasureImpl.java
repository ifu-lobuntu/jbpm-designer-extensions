/**
 */
package org.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.Accumulator;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.Operation;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.CollectiveMeasureImpl#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.omg.smm.impl.CollectiveMeasureImpl#getCustomAccumulator <em>Custom Accumulator</em>}</li>
 *   <li>{@link org.omg.smm.impl.CollectiveMeasureImpl#getBaseMeasureTo <em>Base Measure To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectiveMeasureImpl extends DimensionalMeasureImpl implements CollectiveMeasure {
    /**
     * The default value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulator()
     * @generated
     * @ordered
     */
    protected static final Accumulator ACCUMULATOR_EDEFAULT = Accumulator.SUM;

    /**
     * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulator()
     * @generated
     * @ordered
     */
    protected Accumulator accumulator = ACCUMULATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getCustomAccumulator() <em>Custom Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomAccumulator()
     * @generated
     * @ordered
     */
    protected Operation customAccumulator;

    /**
     * The cached value of the '{@link #getBaseMeasureTo() <em>Base Measure To</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseMeasureTo()
     * @generated
     * @ordered
     */
    protected EList<BaseNMeasureRelationship> baseMeasureTo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CollectiveMeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.COLLECTIVE_MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Accumulator getAccumulator() {
        return accumulator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccumulator(Accumulator newAccumulator) {
        Accumulator oldAccumulator = accumulator;
        accumulator = newAccumulator == null ? ACCUMULATOR_EDEFAULT : newAccumulator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.COLLECTIVE_MEASURE__ACCUMULATOR, oldAccumulator, accumulator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getCustomAccumulator() {
        if (customAccumulator != null && customAccumulator.eIsProxy()) {
            InternalEObject oldCustomAccumulator = (InternalEObject)customAccumulator;
            customAccumulator = (Operation)eResolveProxy(oldCustomAccumulator);
            if (customAccumulator != oldCustomAccumulator) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.COLLECTIVE_MEASURE__CUSTOM_ACCUMULATOR, oldCustomAccumulator, customAccumulator));
            }
        }
        return customAccumulator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetCustomAccumulator() {
        return customAccumulator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomAccumulator(Operation newCustomAccumulator) {
        Operation oldCustomAccumulator = customAccumulator;
        customAccumulator = newCustomAccumulator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.COLLECTIVE_MEASURE__CUSTOM_ACCUMULATOR, oldCustomAccumulator, customAccumulator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BaseNMeasureRelationship> getBaseMeasureTo() {
        if (baseMeasureTo == null) {
            baseMeasureTo = new EObjectContainmentWithInverseEList<BaseNMeasureRelationship>(BaseNMeasureRelationship.class, this, SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO, SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE);
        }
        return baseMeasureTo;
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
            case SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasureTo()).basicAdd(otherEnd, msgs);
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
            case SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO:
                return ((InternalEList<?>)getBaseMeasureTo()).basicRemove(otherEnd, msgs);
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
            case SMMPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
                return getAccumulator();
            case SMMPackage.COLLECTIVE_MEASURE__CUSTOM_ACCUMULATOR:
                if (resolve) return getCustomAccumulator();
                return basicGetCustomAccumulator();
            case SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO:
                return getBaseMeasureTo();
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
            case SMMPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
                setAccumulator((Accumulator)newValue);
                return;
            case SMMPackage.COLLECTIVE_MEASURE__CUSTOM_ACCUMULATOR:
                setCustomAccumulator((Operation)newValue);
                return;
            case SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO:
                getBaseMeasureTo().clear();
                getBaseMeasureTo().addAll((Collection<? extends BaseNMeasureRelationship>)newValue);
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
            case SMMPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
                setAccumulator(ACCUMULATOR_EDEFAULT);
                return;
            case SMMPackage.COLLECTIVE_MEASURE__CUSTOM_ACCUMULATOR:
                setCustomAccumulator((Operation)null);
                return;
            case SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO:
                getBaseMeasureTo().clear();
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
            case SMMPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
                return accumulator != ACCUMULATOR_EDEFAULT;
            case SMMPackage.COLLECTIVE_MEASURE__CUSTOM_ACCUMULATOR:
                return customAccumulator != null;
            case SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO:
                return baseMeasureTo != null && !baseMeasureTo.isEmpty();
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
        result.append(" (accumulator: ");
        result.append(accumulator);
        result.append(')');
        return result.toString();
    }

} //CollectiveMeasureImpl
