/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.smm.DimensionalMeasure;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.RescaledMeasureRelationship;
import org.omg.smm.SMMPackage;
import org.omg.smm.SmmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rescaled Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureRelationshipImpl#getFromDimensionalMeasure <em>From Dimensional Measure</em>}</li>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureRelationshipImpl#getToRescaledMeasure <em>To Rescaled Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RescaledMeasureRelationshipImpl extends MeasureRelationshipImpl implements RescaledMeasureRelationship {
    /**
     * The cached value of the '{@link #getFromDimensionalMeasure() <em>From Dimensional Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromDimensionalMeasure()
     * @generated
     * @ordered
     */
    protected DimensionalMeasure fromDimensionalMeasure;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RescaledMeasureRelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.RESCALED_MEASURE_RELATIONSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DimensionalMeasure getFromDimensionalMeasure() {
        if (fromDimensionalMeasure != null && fromDimensionalMeasure.eIsProxy()) {
            InternalEObject oldFromDimensionalMeasure = (InternalEObject)fromDimensionalMeasure;
            fromDimensionalMeasure = (DimensionalMeasure)eResolveProxy(oldFromDimensionalMeasure);
            if (fromDimensionalMeasure != oldFromDimensionalMeasure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.RESCALED_MEASURE_RELATIONSHIP__FROM_DIMENSIONAL_MEASURE, oldFromDimensionalMeasure, fromDimensionalMeasure));
            }
        }
        return fromDimensionalMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DimensionalMeasure basicGetFromDimensionalMeasure() {
        return fromDimensionalMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFromDimensionalMeasure(DimensionalMeasure newFromDimensionalMeasure) {
        DimensionalMeasure oldFromDimensionalMeasure = fromDimensionalMeasure;
        fromDimensionalMeasure = newFromDimensionalMeasure;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RESCALED_MEASURE_RELATIONSHIP__FROM_DIMENSIONAL_MEASURE, oldFromDimensionalMeasure, fromDimensionalMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RescaledMeasure getToRescaledMeasure() {
        if (eContainerFeatureID() != SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE) return null;
        return (RescaledMeasure)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetToRescaledMeasure(RescaledMeasure newToRescaledMeasure, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newToRescaledMeasure, SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setToRescaledMeasure(RescaledMeasure newToRescaledMeasure) {
        if (newToRescaledMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE && newToRescaledMeasure != null)) {
            if (EcoreUtil.isAncestor(this, newToRescaledMeasure))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newToRescaledMeasure != null)
                msgs = ((InternalEObject)newToRescaledMeasure).eInverseAdd(this, SMMPackage.RESCALED_MEASURE__RESCALES_FROM, RescaledMeasure.class, msgs);
            msgs = basicSetToRescaledMeasure(newToRescaledMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE, newToRescaledMeasure, newToRescaledMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetToRescaledMeasure((RescaledMeasure)otherEnd, msgs);
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
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                return basicSetToRescaledMeasure(null, msgs);
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
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                return eInternalContainer().eInverseRemove(this, SMMPackage.RESCALED_MEASURE__RESCALES_FROM, RescaledMeasure.class, msgs);
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
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__FROM_DIMENSIONAL_MEASURE:
                if (resolve) return getFromDimensionalMeasure();
                return basicGetFromDimensionalMeasure();
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                return getToRescaledMeasure();
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
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__FROM_DIMENSIONAL_MEASURE:
                setFromDimensionalMeasure((DimensionalMeasure)newValue);
                return;
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                setToRescaledMeasure((RescaledMeasure)newValue);
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
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__FROM_DIMENSIONAL_MEASURE:
                setFromDimensionalMeasure((DimensionalMeasure)null);
                return;
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                setToRescaledMeasure((RescaledMeasure)null);
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
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__FROM_DIMENSIONAL_MEASURE:
                return fromDimensionalMeasure != null;
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE:
                return getToRescaledMeasure() != null;
        }
        return super.eIsSet(featureID);
    }
    @Override
    public SmmElement basicGetFrom() {
        return getFromDimensionalMeasure();
    }
    @Override
    public SmmElement basicGetTo() {
        return getToRescaledMeasure();
    }

} //RescaledMeasureRelationshipImpl
