/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.MeasurableElement;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.MeasurableElementImpl#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurableElementImpl extends VdmlElementImpl implements MeasurableElement {
    /**
     * The cached value of the '{@link #getMeasuredCharacteristic() <em>Measured Characteristic</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasuredCharacteristic()
     * @generated
     * @ordered
     */
    protected EList<MeasuredCharacteristic> measuredCharacteristic;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurableElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.MEASURABLE_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeasuredCharacteristic> getMeasuredCharacteristic() {
        if (measuredCharacteristic == null) {
            measuredCharacteristic = new EObjectContainmentEList<MeasuredCharacteristic>(MeasuredCharacteristic.class, this, VdmlPackage.MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC);
        }
        return measuredCharacteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC:
                return ((InternalEList<?>)getMeasuredCharacteristic()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC:
                return getMeasuredCharacteristic();
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
            case VdmlPackage.MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC:
                getMeasuredCharacteristic().clear();
                getMeasuredCharacteristic().addAll((Collection<? extends MeasuredCharacteristic>)newValue);
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
            case VdmlPackage.MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC:
                getMeasuredCharacteristic().clear();
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
            case VdmlPackage.MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC:
                return measuredCharacteristic != null && !measuredCharacteristic.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MeasurableElementImpl
