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
import org.pavanecce.vdml.metamodel.smm.Observation;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.ObservationImpl#getSmmModel <em>Smm Model</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.ObservationImpl#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends MinimalEObjectImpl.Container implements Observation {
    /**
     * The cached value of the '{@link #getObservedMeasure() <em>Observed Measure</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObservedMeasure()
     * @generated
     * @ordered
     */
    protected EList<ObservedMeasure> observedMeasure;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObservationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.OBSERVATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmModel getSmmModel() {
        if (eContainerFeatureID() != SmmPackage.OBSERVATION__SMM_MODEL) return null;
        return (SmmModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSmmModel(SmmModel newSmmModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSmmModel, SmmPackage.OBSERVATION__SMM_MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmmModel(SmmModel newSmmModel) {
        if (newSmmModel != eInternalContainer() || (eContainerFeatureID() != SmmPackage.OBSERVATION__SMM_MODEL && newSmmModel != null)) {
            if (EcoreUtil.isAncestor(this, newSmmModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSmmModel != null)
                msgs = ((InternalEObject)newSmmModel).eInverseAdd(this, SmmPackage.SMM_MODEL__OBSERVATION, SmmModel.class, msgs);
            msgs = basicSetSmmModel(newSmmModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__SMM_MODEL, newSmmModel, newSmmModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObservedMeasure> getObservedMeasure() {
        if (observedMeasure == null) {
            observedMeasure = new EObjectContainmentWithInverseEList<ObservedMeasure>(ObservedMeasure.class, this, SmmPackage.OBSERVATION__OBSERVED_MEASURE, SmmPackage.OBSERVED_MEASURE__OBSERVATION);
        }
        return observedMeasure;
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSmmModel((SmmModel)otherEnd, msgs);
            case SmmPackage.OBSERVATION__OBSERVED_MEASURE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getObservedMeasure()).basicAdd(otherEnd, msgs);
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                return basicSetSmmModel(null, msgs);
            case SmmPackage.OBSERVATION__OBSERVED_MEASURE:
                return ((InternalEList<?>)getObservedMeasure()).basicRemove(otherEnd, msgs);
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                return eInternalContainer().eInverseRemove(this, SmmPackage.SMM_MODEL__OBSERVATION, SmmModel.class, msgs);
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                return getSmmModel();
            case SmmPackage.OBSERVATION__OBSERVED_MEASURE:
                return getObservedMeasure();
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                setSmmModel((SmmModel)newValue);
                return;
            case SmmPackage.OBSERVATION__OBSERVED_MEASURE:
                getObservedMeasure().clear();
                getObservedMeasure().addAll((Collection<? extends ObservedMeasure>)newValue);
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                setSmmModel((SmmModel)null);
                return;
            case SmmPackage.OBSERVATION__OBSERVED_MEASURE:
                getObservedMeasure().clear();
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
            case SmmPackage.OBSERVATION__SMM_MODEL:
                return getSmmModel() != null;
            case SmmPackage.OBSERVATION__OBSERVED_MEASURE:
                return observedMeasure != null && !observedMeasure.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ObservationImpl
