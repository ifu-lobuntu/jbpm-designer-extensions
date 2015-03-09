/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.PathCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.PathCommandImpl#getIsRelative <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathCommandImpl extends MinimalEObjectImpl.Container implements PathCommand {
    /**
     * The default value of the '{@link #getIsRelative() <em>Is Relative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsRelative()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_RELATIVE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsRelative() <em>Is Relative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsRelative()
     * @generated
     * @ordered
     */
    protected Boolean isRelative = IS_RELATIVE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PathCommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.PATH_COMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsRelative() {
        return isRelative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsRelative(Boolean newIsRelative) {
        Boolean oldIsRelative = isRelative;
        isRelative = newIsRelative;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.PATH_COMMAND__IS_RELATIVE, oldIsRelative, isRelative));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.PATH_COMMAND__IS_RELATIVE:
                return getIsRelative();
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
            case DGPackage.PATH_COMMAND__IS_RELATIVE:
                setIsRelative((Boolean)newValue);
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
            case DGPackage.PATH_COMMAND__IS_RELATIVE:
                setIsRelative(IS_RELATIVE_EDEFAULT);
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
            case DGPackage.PATH_COMMAND__IS_RELATIVE:
                return IS_RELATIVE_EDEFAULT == null ? isRelative != null : !IS_RELATIVE_EDEFAULT.equals(isRelative);
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
        result.append(" (isRelative: ");
        result.append(isRelative);
        result.append(')');
        return result.toString();
    }

} //PathCommandImpl
