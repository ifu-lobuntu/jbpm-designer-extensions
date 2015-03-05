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
import org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement;
import org.pavanecce.vdml.metamodel.smm.MeasureLibrary;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureLibraryImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureLibraryImpl#getMeasureElement <em>Measure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureLibraryImpl extends MinimalEObjectImpl.Container implements MeasureLibrary {
    /**
     * The cached value of the '{@link #getMeasureElement() <em>Measure Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasureElement()
     * @generated
     * @ordered
     */
    protected EList<AbstractMeasureElement> measureElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasureLibraryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SmmPackage.Literals.MEASURE_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmModel getModel() {
        if (eContainerFeatureID() != SmmPackage.MEASURE_LIBRARY__MODEL) return null;
        return (SmmModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(SmmModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, SmmPackage.MEASURE_LIBRARY__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(SmmModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != SmmPackage.MEASURE_LIBRARY__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, SmmPackage.SMM_MODEL__LIBRARY, SmmModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE_LIBRARY__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractMeasureElement> getMeasureElement() {
        if (measureElement == null) {
            measureElement = new EObjectContainmentWithInverseEList<AbstractMeasureElement>(AbstractMeasureElement.class, this, SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT, SmmPackage.ABSTRACT_MEASURE_ELEMENT__LIBRARY);
        }
        return measureElement;
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((SmmModel)otherEnd, msgs);
            case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasureElement()).basicAdd(otherEnd, msgs);
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                return basicSetModel(null, msgs);
            case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT:
                return ((InternalEList<?>)getMeasureElement()).basicRemove(otherEnd, msgs);
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                return eInternalContainer().eInverseRemove(this, SmmPackage.SMM_MODEL__LIBRARY, SmmModel.class, msgs);
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                return getModel();
            case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT:
                return getMeasureElement();
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                setModel((SmmModel)newValue);
                return;
            case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT:
                getMeasureElement().clear();
                getMeasureElement().addAll((Collection<? extends AbstractMeasureElement>)newValue);
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                setModel((SmmModel)null);
                return;
            case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT:
                getMeasureElement().clear();
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
            case SmmPackage.MEASURE_LIBRARY__MODEL:
                return getModel() != null;
            case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENT:
                return measureElement != null && !measureElement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MeasureLibraryImpl
