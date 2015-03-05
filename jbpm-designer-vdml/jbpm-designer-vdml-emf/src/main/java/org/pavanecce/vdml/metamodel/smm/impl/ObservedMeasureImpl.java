/**
 */
package org.pavanecce.vdml.metamodel.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.smm.Measure;
import org.pavanecce.vdml.metamodel.smm.Measurement;
import org.pavanecce.vdml.metamodel.smm.Observation;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observed Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservedMeasureImpl extends MinimalEObjectImpl.Container implements ObservedMeasure {
    /**
     * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurement()
     * @generated
     * @ordered
     */
    protected EList<Measurement> measurement;

    /**
     * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasure()
     * @generated
     * @ordered
     */
    protected Measure measure;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObservedMeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.OBSERVED_MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Observation getObservation() {
        if (eContainerFeatureID() != SmmPackage.OBSERVED_MEASURE__OBSERVATION) return null;
        return (Observation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObservation, SmmPackage.OBSERVED_MEASURE__OBSERVATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObservation(Observation newObservation) {
        if (newObservation != eInternalContainer() || (eContainerFeatureID() != SmmPackage.OBSERVED_MEASURE__OBSERVATION && newObservation != null)) {
            if (EcoreUtil.isAncestor(this, newObservation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObservation != null)
                msgs = ((InternalEObject)newObservation).eInverseAdd(this, SmmPackage.OBSERVATION__OBSERVED_MEASURE, Observation.class, msgs);
            msgs = basicSetObservation(newObservation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVED_MEASURE__OBSERVATION, newObservation, newObservation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Measurement> getMeasurement() {
        if (measurement == null) {
            measurement = new EObjectContainmentWithInverseEList<Measurement>(Measurement.class, this, SmmPackage.OBSERVED_MEASURE__MEASUREMENT, SmmPackage.MEASUREMENT__OBSERVED_MEASURE);
        }
        return measurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Measure getMeasure() {
        if (measure != null && measure.eIsProxy()) {
            InternalEObject oldMeasure = (InternalEObject)measure;
            measure = (Measure)eResolveProxy(oldMeasure);
            if (measure != oldMeasure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.OBSERVED_MEASURE__MEASURE, oldMeasure, measure));
            }
        }
        return measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Measure basicGetMeasure() {
        return measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
        Measure oldMeasure = measure;
        measure = newMeasure;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVED_MEASURE__MEASURE, oldMeasure, newMeasure);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasure(Measure newMeasure) {
        if (newMeasure != measure) {
            NotificationChain msgs = null;
            if (measure != null)
                msgs = ((InternalEObject)measure).eInverseRemove(this, SmmPackage.MEASURE__OBSERVED_MEASURE, Measure.class, msgs);
            if (newMeasure != null)
                msgs = ((InternalEObject)newMeasure).eInverseAdd(this, SmmPackage.MEASURE__OBSERVED_MEASURE, Measure.class, msgs);
            msgs = basicSetMeasure(newMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVED_MEASURE__MEASURE, newMeasure, newMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetObservation((Observation)otherEnd, msgs);
            case SmmPackage.OBSERVED_MEASURE__MEASUREMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurement()).basicAdd(otherEnd, msgs);
            case SmmPackage.OBSERVED_MEASURE__MEASURE:
                if (measure != null)
                    msgs = ((InternalEObject)measure).eInverseRemove(this, SmmPackage.MEASURE__OBSERVED_MEASURE, Measure.class, msgs);
                return basicSetMeasure((Measure)otherEnd, msgs);
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
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                return basicSetObservation(null, msgs);
            case SmmPackage.OBSERVED_MEASURE__MEASUREMENT:
                return ((InternalEList<?>)getMeasurement()).basicRemove(otherEnd, msgs);
            case SmmPackage.OBSERVED_MEASURE__MEASURE:
                return basicSetMeasure(null, msgs);
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
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                return eInternalContainer().eInverseRemove(this, SmmPackage.OBSERVATION__OBSERVED_MEASURE, Observation.class, msgs);
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
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                return getObservation();
            case SmmPackage.OBSERVED_MEASURE__MEASUREMENT:
                return getMeasurement();
            case SmmPackage.OBSERVED_MEASURE__MEASURE:
                if (resolve) return getMeasure();
                return basicGetMeasure();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                setObservation((Observation)newValue);
                return;
            case SmmPackage.OBSERVED_MEASURE__MEASUREMENT:
                getMeasurement().clear();
                getMeasurement().addAll((Collection<? extends Measurement>)newValue);
                return;
            case SmmPackage.OBSERVED_MEASURE__MEASURE:
                setMeasure((Measure)newValue);
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
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                setObservation((Observation)null);
                return;
            case SmmPackage.OBSERVED_MEASURE__MEASUREMENT:
                getMeasurement().clear();
                return;
            case SmmPackage.OBSERVED_MEASURE__MEASURE:
                setMeasure((Measure)null);
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
            case SmmPackage.OBSERVED_MEASURE__OBSERVATION:
                return getObservation() != null;
            case SmmPackage.OBSERVED_MEASURE__MEASUREMENT:
                return measurement != null && !measurement.isEmpty();
            case SmmPackage.OBSERVED_MEASURE__MEASURE:
                return measure != null;
        }
        return super.eIsSet(featureID);
    }

} //ObservedMeasureImpl
