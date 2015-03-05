/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.Operand;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OperandImpl#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OperandImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperandImpl extends VdmlElementImpl implements Operand {
    /**
     * The cached value of the '{@link #getMeasuredCharacteristic() <em>Measured Characteristic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasuredCharacteristic()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic measuredCharacteristic;

    /**
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected String alias = ALIAS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.OPERAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        String oldAlias = alias;
        alias = newAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.OPERAND__ALIAS, oldAlias, alias));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getMeasuredCharacteristic() {
        if (measuredCharacteristic != null && measuredCharacteristic.eIsProxy()) {
            InternalEObject oldMeasuredCharacteristic = (InternalEObject)measuredCharacteristic;
            measuredCharacteristic = (MeasuredCharacteristic)eResolveProxy(oldMeasuredCharacteristic);
            if (measuredCharacteristic != oldMeasuredCharacteristic) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC, oldMeasuredCharacteristic, measuredCharacteristic));
            }
        }
        return measuredCharacteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic basicGetMeasuredCharacteristic() {
        return measuredCharacteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasuredCharacteristic(MeasuredCharacteristic newMeasuredCharacteristic) {
        MeasuredCharacteristic oldMeasuredCharacteristic = measuredCharacteristic;
        measuredCharacteristic = newMeasuredCharacteristic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC, oldMeasuredCharacteristic, measuredCharacteristic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
                if (resolve) return getMeasuredCharacteristic();
                return basicGetMeasuredCharacteristic();
            case VdmlPackage.OPERAND__ALIAS:
                return getAlias();
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
            case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
                setMeasuredCharacteristic((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.OPERAND__ALIAS:
                setAlias((String)newValue);
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
            case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
                setMeasuredCharacteristic((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.OPERAND__ALIAS:
                setAlias(ALIAS_EDEFAULT);
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
            case VdmlPackage.OPERAND__MEASURED_CHARACTERISTIC:
                return measuredCharacteristic != null;
            case VdmlPackage.OPERAND__ALIAS:
                return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
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
        result.append(" (alias: ");
        result.append(alias);
        result.append(')');
        return result.toString();
    }

} //OperandImpl
