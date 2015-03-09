/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.Interval;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.IntervalImpl#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link org.omg.smm.impl.IntervalImpl#getMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link org.omg.smm.impl.IntervalImpl#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link org.omg.smm.impl.IntervalImpl#getMinimumOpen <em>Minimum Open</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntervalImpl extends SmmElementImpl implements Interval {
    /**
     * The default value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumEndpoint()
     * @generated
     * @ordered
     */
    protected static final Double MAXIMUM_ENDPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumEndpoint()
     * @generated
     * @ordered
     */
    protected Double maximumEndpoint = MAXIMUM_ENDPOINT_EDEFAULT;

    /**
     * The default value of the '{@link #getMaximumOpen() <em>Maximum Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean MAXIMUM_OPEN_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getMaximumOpen() <em>Maximum Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumOpen()
     * @generated
     * @ordered
     */
    protected Boolean maximumOpen = MAXIMUM_OPEN_EDEFAULT;

    /**
     * The default value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumEndpoint()
     * @generated
     * @ordered
     */
    protected static final Double MINIMUM_ENDPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumEndpoint()
     * @generated
     * @ordered
     */
    protected Double minimumEndpoint = MINIMUM_ENDPOINT_EDEFAULT;

    /**
     * The default value of the '{@link #getMinimumOpen() <em>Minimum Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean MINIMUM_OPEN_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getMinimumOpen() <em>Minimum Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumOpen()
     * @generated
     * @ordered
     */
    protected Boolean minimumOpen = MINIMUM_OPEN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.INTERVAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getMaximumEndpoint() {
        return maximumEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumEndpoint(Double newMaximumEndpoint) {
        Double oldMaximumEndpoint = maximumEndpoint;
        maximumEndpoint = newMaximumEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.INTERVAL__MAXIMUM_ENDPOINT, oldMaximumEndpoint, maximumEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getMaximumOpen() {
        return maximumOpen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumOpen(Boolean newMaximumOpen) {
        Boolean oldMaximumOpen = maximumOpen;
        maximumOpen = newMaximumOpen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.INTERVAL__MAXIMUM_OPEN, oldMaximumOpen, maximumOpen));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getMinimumEndpoint() {
        return minimumEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinimumEndpoint(Double newMinimumEndpoint) {
        Double oldMinimumEndpoint = minimumEndpoint;
        minimumEndpoint = newMinimumEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.INTERVAL__MINIMUM_ENDPOINT, oldMinimumEndpoint, minimumEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getMinimumOpen() {
        return minimumOpen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinimumOpen(Boolean newMinimumOpen) {
        Boolean oldMinimumOpen = minimumOpen;
        minimumOpen = newMinimumOpen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.INTERVAL__MINIMUM_OPEN, oldMinimumOpen, minimumOpen));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SMMPackage.INTERVAL__MAXIMUM_ENDPOINT:
                return getMaximumEndpoint();
            case SMMPackage.INTERVAL__MAXIMUM_OPEN:
                return getMaximumOpen();
            case SMMPackage.INTERVAL__MINIMUM_ENDPOINT:
                return getMinimumEndpoint();
            case SMMPackage.INTERVAL__MINIMUM_OPEN:
                return getMinimumOpen();
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
            case SMMPackage.INTERVAL__MAXIMUM_ENDPOINT:
                setMaximumEndpoint((Double)newValue);
                return;
            case SMMPackage.INTERVAL__MAXIMUM_OPEN:
                setMaximumOpen((Boolean)newValue);
                return;
            case SMMPackage.INTERVAL__MINIMUM_ENDPOINT:
                setMinimumEndpoint((Double)newValue);
                return;
            case SMMPackage.INTERVAL__MINIMUM_OPEN:
                setMinimumOpen((Boolean)newValue);
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
            case SMMPackage.INTERVAL__MAXIMUM_ENDPOINT:
                setMaximumEndpoint(MAXIMUM_ENDPOINT_EDEFAULT);
                return;
            case SMMPackage.INTERVAL__MAXIMUM_OPEN:
                setMaximumOpen(MAXIMUM_OPEN_EDEFAULT);
                return;
            case SMMPackage.INTERVAL__MINIMUM_ENDPOINT:
                setMinimumEndpoint(MINIMUM_ENDPOINT_EDEFAULT);
                return;
            case SMMPackage.INTERVAL__MINIMUM_OPEN:
                setMinimumOpen(MINIMUM_OPEN_EDEFAULT);
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
            case SMMPackage.INTERVAL__MAXIMUM_ENDPOINT:
                return MAXIMUM_ENDPOINT_EDEFAULT == null ? maximumEndpoint != null : !MAXIMUM_ENDPOINT_EDEFAULT.equals(maximumEndpoint);
            case SMMPackage.INTERVAL__MAXIMUM_OPEN:
                return MAXIMUM_OPEN_EDEFAULT == null ? maximumOpen != null : !MAXIMUM_OPEN_EDEFAULT.equals(maximumOpen);
            case SMMPackage.INTERVAL__MINIMUM_ENDPOINT:
                return MINIMUM_ENDPOINT_EDEFAULT == null ? minimumEndpoint != null : !MINIMUM_ENDPOINT_EDEFAULT.equals(minimumEndpoint);
            case SMMPackage.INTERVAL__MINIMUM_OPEN:
                return MINIMUM_OPEN_EDEFAULT == null ? minimumOpen != null : !MINIMUM_OPEN_EDEFAULT.equals(minimumOpen);
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
        result.append(" (maximumEndpoint: ");
        result.append(maximumEndpoint);
        result.append(", maximumOpen: ");
        result.append(maximumOpen);
        result.append(", minimumEndpoint: ");
        result.append(minimumEndpoint);
        result.append(", minimumOpen: ");
        result.append(minimumOpen);
        result.append(')');
        return result.toString();
    }

} //IntervalImpl
