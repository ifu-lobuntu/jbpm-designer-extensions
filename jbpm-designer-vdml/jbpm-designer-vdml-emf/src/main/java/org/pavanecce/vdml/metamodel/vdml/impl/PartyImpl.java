/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.Party;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PartyImpl#getValueMargin <em>Value Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartyImpl extends RoleImpl implements Party {
    /**
     * The cached value of the '{@link #getValueMargin() <em>Value Margin</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueMargin()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic valueMargin;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PartyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.PARTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getValueMargin() {
        return valueMargin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueMargin(MeasuredCharacteristic newValueMargin, NotificationChain msgs) {
        MeasuredCharacteristic oldValueMargin = valueMargin;
        valueMargin = newValueMargin;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__VALUE_MARGIN, oldValueMargin, newValueMargin);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueMargin(MeasuredCharacteristic newValueMargin) {
        if (newValueMargin != valueMargin) {
            NotificationChain msgs = null;
            if (valueMargin != null)
                msgs = ((InternalEObject)valueMargin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTY__VALUE_MARGIN, null, msgs);
            if (newValueMargin != null)
                msgs = ((InternalEObject)newValueMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTY__VALUE_MARGIN, null, msgs);
            msgs = basicSetValueMargin(newValueMargin, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTY__VALUE_MARGIN, newValueMargin, newValueMargin));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.PARTY__VALUE_MARGIN:
                return basicSetValueMargin(null, msgs);
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
            case VdmlPackage.PARTY__VALUE_MARGIN:
                return getValueMargin();
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
            case VdmlPackage.PARTY__VALUE_MARGIN:
                setValueMargin((MeasuredCharacteristic)newValue);
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
            case VdmlPackage.PARTY__VALUE_MARGIN:
                setValueMargin((MeasuredCharacteristic)null);
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
            case VdmlPackage.PARTY__VALUE_MARGIN:
                return valueMargin != null;
        }
        return super.eIsSet(featureID);
    }

} //PartyImpl
