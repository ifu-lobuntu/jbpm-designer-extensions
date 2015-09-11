/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Operand;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.OperandImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.omg.vdml.impl.OperandImpl#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandImpl extends VdmlElementImpl implements Operand {
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
	 * The cached value of the '{@link #getMeasuredCharacteristic() <em>Measured Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMeasuredCharacteristic()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic measuredCharacteristic;

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
		return VDMLPackage.Literals.OPERAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.OPERAND__ALIAS, oldAlias, alias));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.OPERAND__MEASURED_CHARACTERISTIC, oldMeasuredCharacteristic, measuredCharacteristic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.OPERAND__MEASURED_CHARACTERISTIC, oldMeasuredCharacteristic, measuredCharacteristic));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VDMLPackage.OPERAND__ALIAS:
				return getAlias();
			case VDMLPackage.OPERAND__MEASURED_CHARACTERISTIC:
				if (resolve) return getMeasuredCharacteristic();
				return basicGetMeasuredCharacteristic();
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
			case VDMLPackage.OPERAND__ALIAS:
				setAlias((String)newValue);
				return;
			case VDMLPackage.OPERAND__MEASURED_CHARACTERISTIC:
				setMeasuredCharacteristic((MeasuredCharacteristic)newValue);
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
			case VDMLPackage.OPERAND__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case VDMLPackage.OPERAND__MEASURED_CHARACTERISTIC:
				setMeasuredCharacteristic((MeasuredCharacteristic)null);
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
			case VDMLPackage.OPERAND__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case VDMLPackage.OPERAND__MEASURED_CHARACTERISTIC:
				return measuredCharacteristic != null;
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
