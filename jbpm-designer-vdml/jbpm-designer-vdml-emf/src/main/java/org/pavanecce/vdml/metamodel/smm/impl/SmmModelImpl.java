/**
 */
package org.pavanecce.vdml.metamodel.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.smm.MeasureLibrary;
import org.pavanecce.vdml.metamodel.smm.Observation;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.SmmModelImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.SmmModelImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmmModelImpl extends MinimalEObjectImpl.Container implements SmmModel {
    /**
     * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
    protected EList<MeasureLibrary> library;

    /**
     * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObservation()
     * @generated
     * @ordered
     */
    protected EList<Observation> observation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SmmModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.SMM_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeasureLibrary> getLibrary() {
        if (library == null) {
            library = new EObjectContainmentWithInverseEList<MeasureLibrary>(MeasureLibrary.class, this, SmmPackage.SMM_MODEL__LIBRARY, SmmPackage.MEASURE_LIBRARY__MODEL);
        }
        return library;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Observation> getObservation() {
        if (observation == null) {
            observation = new EObjectContainmentWithInverseEList<Observation>(Observation.class, this, SmmPackage.SMM_MODEL__OBSERVATION, SmmPackage.OBSERVATION__SMM_MODEL);
        }
        return observation;
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
            case SmmPackage.SMM_MODEL__LIBRARY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLibrary()).basicAdd(otherEnd, msgs);
            case SmmPackage.SMM_MODEL__OBSERVATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getObservation()).basicAdd(otherEnd, msgs);
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
            case SmmPackage.SMM_MODEL__LIBRARY:
                return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
            case SmmPackage.SMM_MODEL__OBSERVATION:
                return ((InternalEList<?>)getObservation()).basicRemove(otherEnd, msgs);
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
            case SmmPackage.SMM_MODEL__LIBRARY:
                return getLibrary();
            case SmmPackage.SMM_MODEL__OBSERVATION:
                return getObservation();
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
            case SmmPackage.SMM_MODEL__LIBRARY:
                getLibrary().clear();
                getLibrary().addAll((Collection<? extends MeasureLibrary>)newValue);
                return;
            case SmmPackage.SMM_MODEL__OBSERVATION:
                getObservation().clear();
                getObservation().addAll((Collection<? extends Observation>)newValue);
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
            case SmmPackage.SMM_MODEL__LIBRARY:
                getLibrary().clear();
                return;
            case SmmPackage.SMM_MODEL__OBSERVATION:
                getObservation().clear();
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
            case SmmPackage.SMM_MODEL__LIBRARY:
                return library != null && !library.isEmpty();
            case SmmPackage.SMM_MODEL__OBSERVATION:
                return observation != null && !observation.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SmmModelImpl
