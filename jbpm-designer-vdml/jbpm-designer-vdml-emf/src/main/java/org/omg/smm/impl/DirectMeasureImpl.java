/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.DirectMeasure;
import org.omg.smm.Operation;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.DirectMeasureImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectMeasureImpl extends DimensionalMeasureImpl implements DirectMeasure {
    /**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
    protected Operation operation;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DirectMeasureImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.DIRECT_MEASURE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.DIRECT_MEASURE__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation basicGetOperation() {
		return operation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.DIRECT_MEASURE__OPERATION, oldOperation, operation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SMMPackage.DIRECT_MEASURE__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
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
			case SMMPackage.DIRECT_MEASURE__OPERATION:
				setOperation((Operation)newValue);
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
			case SMMPackage.DIRECT_MEASURE__OPERATION:
				setOperation((Operation)null);
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
			case SMMPackage.DIRECT_MEASURE__OPERATION:
				return operation != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectMeasureImpl
