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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.smm.Measure;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureImpl#getObservedMeasure <em>Observed Measure</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureImpl#getTrait <em>Trait</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasureImpl extends AbstractMeasureElementImpl implements Measure {
    /**
     * The cached value of the '{@link #getObservedMeasure() <em>Observed Measure</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObservedMeasure()
     * @generated
     * @ordered
     */
    protected EList<ObservedMeasure> observedMeasure;

    /**
     * The cached value of the '{@link #getTrait() <em>Trait</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrait()
     * @generated
     * @ordered
     */
    protected Characteristic trait;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObservedMeasure> getObservedMeasure() {
        if (observedMeasure == null) {
            observedMeasure = new EObjectWithInverseResolvingEList<ObservedMeasure>(ObservedMeasure.class, this, SmmPackage.MEASURE__OBSERVED_MEASURE, SmmPackage.OBSERVED_MEASURE__MEASURE);
        }
        return observedMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic getTrait() {
        if (trait != null && trait.eIsProxy()) {
            InternalEObject oldTrait = (InternalEObject)trait;
            trait = (Characteristic)eResolveProxy(oldTrait);
            if (trait != oldTrait) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__TRAIT, oldTrait, trait));
            }
        }
        return trait;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic basicGetTrait() {
        return trait;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTrait(Characteristic newTrait, NotificationChain msgs) {
        Characteristic oldTrait = trait;
        trait = newTrait;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__TRAIT, oldTrait, newTrait);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrait(Characteristic newTrait) {
        if (newTrait != trait) {
            NotificationChain msgs = null;
            if (trait != null)
                msgs = ((InternalEObject)trait).eInverseRemove(this, SmmPackage.CHARACTERISTIC__MEASURE, Characteristic.class, msgs);
            if (newTrait != null)
                msgs = ((InternalEObject)newTrait).eInverseAdd(this, SmmPackage.CHARACTERISTIC__MEASURE, Characteristic.class, msgs);
            msgs = basicSetTrait(newTrait, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__TRAIT, newTrait, newTrait));
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
            case SmmPackage.MEASURE__OBSERVED_MEASURE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getObservedMeasure()).basicAdd(otherEnd, msgs);
            case SmmPackage.MEASURE__TRAIT:
                if (trait != null)
                    msgs = ((InternalEObject)trait).eInverseRemove(this, SmmPackage.CHARACTERISTIC__MEASURE, Characteristic.class, msgs);
                return basicSetTrait((Characteristic)otherEnd, msgs);
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
            case SmmPackage.MEASURE__OBSERVED_MEASURE:
                return ((InternalEList<?>)getObservedMeasure()).basicRemove(otherEnd, msgs);
            case SmmPackage.MEASURE__TRAIT:
                return basicSetTrait(null, msgs);
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
            case SmmPackage.MEASURE__OBSERVED_MEASURE:
                return getObservedMeasure();
            case SmmPackage.MEASURE__TRAIT:
                if (resolve) return getTrait();
                return basicGetTrait();
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
            case SmmPackage.MEASURE__OBSERVED_MEASURE:
                getObservedMeasure().clear();
                getObservedMeasure().addAll((Collection<? extends ObservedMeasure>)newValue);
                return;
            case SmmPackage.MEASURE__TRAIT:
                setTrait((Characteristic)newValue);
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
            case SmmPackage.MEASURE__OBSERVED_MEASURE:
                getObservedMeasure().clear();
                return;
            case SmmPackage.MEASURE__TRAIT:
                setTrait((Characteristic)null);
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
            case SmmPackage.MEASURE__OBSERVED_MEASURE:
                return observedMeasure != null && !observedMeasure.isEmpty();
            case SmmPackage.MEASURE__TRAIT:
                return trait != null;
        }
        return super.eIsSet(featureID);
    }

} //MeasureImpl
