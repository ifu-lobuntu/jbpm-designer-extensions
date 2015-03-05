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
import org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement;
import org.pavanecce.vdml.metamodel.smm.MeasureLibrary;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Measure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.AbstractMeasureElementImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMeasureElementImpl extends MinimalEObjectImpl.Container implements AbstractMeasureElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractMeasureElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.ABSTRACT_MEASURE_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasureLibrary getLibrary() {
        if (eContainerFeatureID() != SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY) return null;
        return (MeasureLibrary)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLibrary(MeasureLibrary newLibrary, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newLibrary, SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLibrary(MeasureLibrary newLibrary) {
        if (newLibrary != eInternalContainer() || (eContainerFeatureID() != SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY && newLibrary != null)) {
            if (EcoreUtil.isAncestor(this, newLibrary))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLibrary != null)
                msgs = ((InternalEObject)newLibrary).eInverseAdd(this, SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT, MeasureLibrary.class, msgs);
            msgs = basicSetLibrary(newLibrary, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY, newLibrary, newLibrary));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetLibrary((MeasureLibrary)otherEnd, msgs);
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
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                return basicSetLibrary(null, msgs);
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
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                return eInternalContainer().eInverseRemove(this, SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT, MeasureLibrary.class, msgs);
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
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                return getLibrary();
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
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                setLibrary((MeasureLibrary)newValue);
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
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                setLibrary((MeasureLibrary)null);
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
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY:
                return getLibrary() != null;
        }
        return super.eIsSet(featureID);
    }

} //AbstractMeasureElementImpl
