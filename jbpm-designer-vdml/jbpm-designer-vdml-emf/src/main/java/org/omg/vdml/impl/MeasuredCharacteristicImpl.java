/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.smm.Characteristic;
import org.omg.smm.Measurement;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measured Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.MeasuredCharacteristicImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.omg.vdml.impl.MeasuredCharacteristicImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasuredCharacteristicImpl extends VdmlElementImpl implements MeasuredCharacteristic {
    /**
     * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurement()
     * @generated
     * @ordered
     */
    protected EList<Measurement> measurement;

    /**
     * The cached value of the '{@link #getCharacteristicDefinition() <em>Characteristic Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacteristicDefinition()
     * @generated
     * @ordered
     */
    protected Characteristic characteristicDefinition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasuredCharacteristicImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.MEASURED_CHARACTERISTIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Measurement> getMeasurement() {
        if (measurement == null) {
            measurement = new EObjectResolvingEList<Measurement>(Measurement.class, this, VDMLPackage.MEASURED_CHARACTERISTIC__MEASUREMENT);
        }
        return measurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic getCharacteristicDefinition() {
        if (characteristicDefinition != null && characteristicDefinition.eIsProxy()) {
            InternalEObject oldCharacteristicDefinition = (InternalEObject)characteristicDefinition;
            characteristicDefinition = (Characteristic)eResolveProxy(oldCharacteristicDefinition);
            if (characteristicDefinition != oldCharacteristicDefinition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION, oldCharacteristicDefinition, characteristicDefinition));
            }
        }
        return characteristicDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic basicGetCharacteristicDefinition() {
        return characteristicDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacteristicDefinition(Characteristic newCharacteristicDefinition) {
        Characteristic oldCharacteristicDefinition = characteristicDefinition;
        characteristicDefinition = newCharacteristicDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION, oldCharacteristicDefinition, characteristicDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VDMLPackage.MEASURED_CHARACTERISTIC__MEASUREMENT:
                return getMeasurement();
            case VDMLPackage.MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION:
                if (resolve) return getCharacteristicDefinition();
                return basicGetCharacteristicDefinition();
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
            case VDMLPackage.MEASURED_CHARACTERISTIC__MEASUREMENT:
                getMeasurement().clear();
                getMeasurement().addAll((Collection<? extends Measurement>)newValue);
                return;
            case VDMLPackage.MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION:
                setCharacteristicDefinition((Characteristic)newValue);
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
            case VDMLPackage.MEASURED_CHARACTERISTIC__MEASUREMENT:
                getMeasurement().clear();
                return;
            case VDMLPackage.MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION:
                setCharacteristicDefinition((Characteristic)null);
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
            case VDMLPackage.MEASURED_CHARACTERISTIC__MEASUREMENT:
                return measurement != null && !measurement.isEmpty();
            case VDMLPackage.MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION:
                return characteristicDefinition != null;
        }
        return super.eIsSet(featureID);
    }

} //MeasuredCharacteristicImpl
