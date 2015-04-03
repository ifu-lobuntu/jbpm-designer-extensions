/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.smm.Base2MeasureRelationship;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.DimensionalMeasure;
import org.omg.smm.SMMPackage;
import org.omg.smm.SmmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base2 Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.Base2MeasureRelationshipImpl#getFromBinaryMeasure <em>From Binary Measure</em>}</li>
 *   <li>{@link org.omg.smm.impl.Base2MeasureRelationshipImpl#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Base2MeasureRelationshipImpl extends BaseMeasureRelationshipImpl implements Base2MeasureRelationship {
    /**
     * The cached value of the '{@link #getToDimensionalMeasure() <em>To Dimensional Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToDimensionalMeasure()
     * @generated
     * @ordered
     */
    protected DimensionalMeasure toDimensionalMeasure;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Base2MeasureRelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.BASE2_MEASURE_RELATIONSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryMeasure getFromBinaryMeasure() {
        if (eContainerFeatureID() != SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE) return null;
        return (BinaryMeasure)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFromBinaryMeasure(BinaryMeasure newFromBinaryMeasure, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newFromBinaryMeasure, SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFromBinaryMeasure(BinaryMeasure newFromBinaryMeasure) {
        if (newFromBinaryMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE && newFromBinaryMeasure != null)) {
            if (EcoreUtil.isAncestor(this, newFromBinaryMeasure))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newFromBinaryMeasure != null)
                msgs = ((InternalEObject)newFromBinaryMeasure).eInverseAdd(this, SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO, BinaryMeasure.class, msgs);
            msgs = basicSetFromBinaryMeasure(newFromBinaryMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE, newFromBinaryMeasure, newFromBinaryMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DimensionalMeasure getToDimensionalMeasure() {
        if (toDimensionalMeasure != null && toDimensionalMeasure.eIsProxy()) {
            InternalEObject oldToDimensionalMeasure = (InternalEObject)toDimensionalMeasure;
            toDimensionalMeasure = (DimensionalMeasure)eResolveProxy(oldToDimensionalMeasure);
            if (toDimensionalMeasure != oldToDimensionalMeasure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.BASE2_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
            }
        }
        return toDimensionalMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DimensionalMeasure basicGetToDimensionalMeasure() {
        return toDimensionalMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setToDimensionalMeasure(DimensionalMeasure newToDimensionalMeasure) {
        DimensionalMeasure oldToDimensionalMeasure = toDimensionalMeasure;
        toDimensionalMeasure = newToDimensionalMeasure;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BASE2_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetFromBinaryMeasure((BinaryMeasure)otherEnd, msgs);
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
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                return basicSetFromBinaryMeasure(null, msgs);
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
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                return eInternalContainer().eInverseRemove(this, SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO, BinaryMeasure.class, msgs);
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
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                return getFromBinaryMeasure();
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
                if (resolve) return getToDimensionalMeasure();
                return basicGetToDimensionalMeasure();
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
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                setFromBinaryMeasure((BinaryMeasure)newValue);
                return;
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
                setToDimensionalMeasure((DimensionalMeasure)newValue);
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
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                setFromBinaryMeasure((BinaryMeasure)null);
                return;
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
                setToDimensionalMeasure((DimensionalMeasure)null);
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
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE:
                return getFromBinaryMeasure() != null;
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
                return toDimensionalMeasure != null;
        }
        return super.eIsSet(featureID);
    }
    @Override
    public SmmElement basicGetFrom() {
        return getFromBinaryMeasure();
    }
    @Override
    public SmmElement basicGetTo() {
        return getToDimensionalMeasure();
    }

} //Base2MeasureRelationshipImpl
