/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.GradeMeasurement;
import org.omg.smm.Operation;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.GradeMeasurementImpl#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.omg.smm.impl.GradeMeasurementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.smm.impl.GradeMeasurementImpl#getBaseQuery <em>Base Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeMeasurementImpl extends MeasurementImpl implements GradeMeasurement {
    /**
     * The default value of the '{@link #getIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsBaseSupplied()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_BASE_SUPPLIED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsBaseSupplied()
     * @generated
     * @ordered
     */
    protected Boolean isBaseSupplied = IS_BASE_SUPPLIED_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getBaseQuery() <em>Base Query</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseQuery()
     * @generated
     * @ordered
     */
    protected Operation baseQuery;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GradeMeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.GRADE_MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsBaseSupplied() {
        return isBaseSupplied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsBaseSupplied(Boolean newIsBaseSupplied) {
        Boolean oldIsBaseSupplied = isBaseSupplied;
        isBaseSupplied = newIsBaseSupplied;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASUREMENT__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getBaseQuery() {
        if (baseQuery != null && baseQuery.eIsProxy()) {
            InternalEObject oldBaseQuery = (InternalEObject)baseQuery;
            baseQuery = (Operation)eResolveProxy(oldBaseQuery);
            if (baseQuery != oldBaseQuery) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.GRADE_MEASUREMENT__BASE_QUERY, oldBaseQuery, baseQuery));
            }
        }
        return baseQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetBaseQuery() {
        return baseQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseQuery(Operation newBaseQuery) {
        Operation oldBaseQuery = baseQuery;
        baseQuery = newBaseQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASUREMENT__BASE_QUERY, oldBaseQuery, baseQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SMMPackage.GRADE_MEASUREMENT__IS_BASE_SUPPLIED:
                return getIsBaseSupplied();
            case SMMPackage.GRADE_MEASUREMENT__VALUE:
                return getValue();
            case SMMPackage.GRADE_MEASUREMENT__BASE_QUERY:
                if (resolve) return getBaseQuery();
                return basicGetBaseQuery();
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
            case SMMPackage.GRADE_MEASUREMENT__IS_BASE_SUPPLIED:
                setIsBaseSupplied((Boolean)newValue);
                return;
            case SMMPackage.GRADE_MEASUREMENT__VALUE:
                setValue((String)newValue);
                return;
            case SMMPackage.GRADE_MEASUREMENT__BASE_QUERY:
                setBaseQuery((Operation)newValue);
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
            case SMMPackage.GRADE_MEASUREMENT__IS_BASE_SUPPLIED:
                setIsBaseSupplied(IS_BASE_SUPPLIED_EDEFAULT);
                return;
            case SMMPackage.GRADE_MEASUREMENT__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case SMMPackage.GRADE_MEASUREMENT__BASE_QUERY:
                setBaseQuery((Operation)null);
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
            case SMMPackage.GRADE_MEASUREMENT__IS_BASE_SUPPLIED:
                return IS_BASE_SUPPLIED_EDEFAULT == null ? isBaseSupplied != null : !IS_BASE_SUPPLIED_EDEFAULT.equals(isBaseSupplied);
            case SMMPackage.GRADE_MEASUREMENT__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case SMMPackage.GRADE_MEASUREMENT__BASE_QUERY:
                return baseQuery != null;
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
        result.append(" (isBaseSupplied: ");
        result.append(isBaseSupplied);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //GradeMeasurementImpl
