/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Skew;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.SkewImpl#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.SkewImpl#getAngleY <em>Angle Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SkewImpl extends TransformImpl implements Skew {
    /**
     * The default value of the '{@link #getAngleX() <em>Angle X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleX()
     * @generated
     * @ordered
     */
    protected static final Double ANGLE_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAngleX() <em>Angle X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleX()
     * @generated
     * @ordered
     */
    protected Double angleX = ANGLE_X_EDEFAULT;

    /**
     * The default value of the '{@link #getAngleY() <em>Angle Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleY()
     * @generated
     * @ordered
     */
    protected static final Double ANGLE_Y_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAngleY() <em>Angle Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleY()
     * @generated
     * @ordered
     */
    protected Double angleY = ANGLE_Y_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SkewImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.SKEW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getAngleX() {
        return angleX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAngleX(Double newAngleX) {
        Double oldAngleX = angleX;
        angleX = newAngleX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.SKEW__ANGLE_X, oldAngleX, angleX));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getAngleY() {
        return angleY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAngleY(Double newAngleY) {
        Double oldAngleY = angleY;
        angleY = newAngleY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.SKEW__ANGLE_Y, oldAngleY, angleY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.SKEW__ANGLE_X:
                return getAngleX();
            case DGPackage.SKEW__ANGLE_Y:
                return getAngleY();
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
            case DGPackage.SKEW__ANGLE_X:
                setAngleX((Double)newValue);
                return;
            case DGPackage.SKEW__ANGLE_Y:
                setAngleY((Double)newValue);
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
            case DGPackage.SKEW__ANGLE_X:
                setAngleX(ANGLE_X_EDEFAULT);
                return;
            case DGPackage.SKEW__ANGLE_Y:
                setAngleY(ANGLE_Y_EDEFAULT);
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
            case DGPackage.SKEW__ANGLE_X:
                return ANGLE_X_EDEFAULT == null ? angleX != null : !ANGLE_X_EDEFAULT.equals(angleX);
            case DGPackage.SKEW__ANGLE_Y:
                return ANGLE_Y_EDEFAULT == null ? angleY != null : !ANGLE_Y_EDEFAULT.equals(angleY);
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
        result.append(" (angleX: ");
        result.append(angleX);
        result.append(", angleY: ");
        result.append(angleY);
        result.append(')');
        return result.toString();
    }

} //SkewImpl
