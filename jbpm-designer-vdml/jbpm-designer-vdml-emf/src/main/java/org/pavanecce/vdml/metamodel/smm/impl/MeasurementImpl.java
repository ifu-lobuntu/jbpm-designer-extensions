/**
 */
package org.pavanecce.vdml.metamodel.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.pavanecce.vdml.metamodel.smm.Measurement;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.MeasurementImpl#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends MinimalEObjectImpl.Container implements Measurement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservedMeasure getObservedMeasure() {
        if (eContainerFeatureID() != SmmPackage.MEASUREMENT__OBSERVED_MEASURE) return null;
        return (ObservedMeasure)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObservedMeasure(ObservedMeasure newObservedMeasure, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObservedMeasure, SmmPackage.MEASUREMENT__OBSERVED_MEASURE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObservedMeasure(ObservedMeasure newObservedMeasure) {
        if (newObservedMeasure != eInternalContainer() || (eContainerFeatureID() != SmmPackage.MEASUREMENT__OBSERVED_MEASURE && newObservedMeasure != null)) {
            if (EcoreUtil.isAncestor(this, newObservedMeasure))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObservedMeasure != null)
                msgs = ((InternalEObject)newObservedMeasure).eInverseAdd(this, SmmPackage.OBSERVED_MEASURE__MEASUREMENT, ObservedMeasure.class, msgs);
            msgs = basicSetObservedMeasure(newObservedMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__OBSERVED_MEASURE, newObservedMeasure, newObservedMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
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
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
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
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
                return eInternalContainer().eInverseRemove(this, SmmPackage.OBSERVED_MEASURE__MEASUREMENT, ObservedMeasure.class, msgs);
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
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
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
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
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
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
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
            case SmmPackage.MEASUREMENT__OBSERVED_MEASURE:
                return getObservedMeasure() != null;
        }
        return super.eIsSet(featureID);
    }

} //MeasurementImpl
