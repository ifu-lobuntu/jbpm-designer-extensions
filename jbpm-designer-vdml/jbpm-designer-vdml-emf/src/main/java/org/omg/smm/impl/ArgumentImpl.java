/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.smm.Argument;
import org.omg.smm.ObservedMeasure;
import org.omg.smm.SMMPackage;
import org.omg.smm.string;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.ArgumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.smm.impl.ArgumentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.smm.impl.ArgumentImpl#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends SmmElementImpl implements Argument {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected string type;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected string value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArgumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.ARGUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (string)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.ARGUMENT__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(string newType) {
        string oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.ARGUMENT__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getValue() {
        if (value != null && value.eIsProxy()) {
            InternalEObject oldValue = (InternalEObject)value;
            value = (string)eResolveProxy(oldValue);
            if (value != oldValue) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.ARGUMENT__VALUE, oldValue, value));
            }
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(string newValue) {
        string oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.ARGUMENT__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservedMeasure getObservedMeasure() {
        if (eContainerFeatureID() != SMMPackage.ARGUMENT__OBSERVED_MEASURE) return null;
        return (ObservedMeasure)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObservedMeasure(ObservedMeasure newObservedMeasure, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObservedMeasure, SMMPackage.ARGUMENT__OBSERVED_MEASURE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObservedMeasure(ObservedMeasure newObservedMeasure) {
        if (newObservedMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.ARGUMENT__OBSERVED_MEASURE && newObservedMeasure != null)) {
            if (EcoreUtil.isAncestor(this, newObservedMeasure))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObservedMeasure != null)
                msgs = ((InternalEObject)newObservedMeasure).eInverseAdd(this, SMMPackage.OBSERVED_MEASURE__ARGUMENTS, ObservedMeasure.class, msgs);
            msgs = basicSetObservedMeasure(newObservedMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.ARGUMENT__OBSERVED_MEASURE, newObservedMeasure, newObservedMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetObservedMeasure((ObservedMeasure)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                return basicSetObservedMeasure(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                return eInternalContainer().eInverseRemove(this, SMMPackage.OBSERVED_MEASURE__ARGUMENTS, ObservedMeasure.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SMMPackage.ARGUMENT__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case SMMPackage.ARGUMENT__VALUE:
                if (resolve) return getValue();
                return basicGetValue();
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                return getObservedMeasure();
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
            case SMMPackage.ARGUMENT__TYPE:
                setType((string)newValue);
                return;
            case SMMPackage.ARGUMENT__VALUE:
                setValue((string)newValue);
                return;
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                setObservedMeasure((ObservedMeasure)newValue);
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
            case SMMPackage.ARGUMENT__TYPE:
                setType((string)null);
                return;
            case SMMPackage.ARGUMENT__VALUE:
                setValue((string)null);
                return;
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                setObservedMeasure((ObservedMeasure)null);
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
            case SMMPackage.ARGUMENT__TYPE:
                return type != null;
            case SMMPackage.ARGUMENT__VALUE:
                return value != null;
            case SMMPackage.ARGUMENT__OBSERVED_MEASURE:
                return getObservedMeasure() != null;
        }
        return super.eIsSet(featureID);
    }

} //ArgumentImpl
