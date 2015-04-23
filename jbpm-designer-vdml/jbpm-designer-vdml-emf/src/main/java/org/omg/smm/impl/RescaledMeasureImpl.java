/**
 */
package org.omg.smm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.BaseMeasureRelationship;
import org.omg.smm.Operation;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.RescaledMeasureRelationship;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureImpl#getRescales <em>Rescales</em>}</li>
 *   <li>{@link org.omg.smm.impl.RescaledMeasureImpl#getRescalesFrom <em>Rescales From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RescaledMeasureImpl extends DimensionalMeasureImpl implements RescaledMeasure {
    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected Operation operation;

    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final Double OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected Double offset = OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected static final Double MULTIPLIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected Double multiplier = MULTIPLIER_EDEFAULT;

    /**
     * The cached value of the '{@link #getRescalesFrom() <em>Rescales From</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRescalesFrom()
     * @generated
     * @ordered
     */
    protected EList<RescaledMeasureRelationship> rescalesFrom;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RescaledMeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.RESCALED_MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation() {
        if (operation != null && operation.eIsProxy()) {
            InternalEObject oldOperation = (InternalEObject)operation;
            operation = (Operation)eResolveProxy(oldOperation);
            if (operation != oldOperation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.RESCALED_MEASURE__OPERATION, oldOperation, operation));
            }
        }
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(Operation newOperation) {
        Operation oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RESCALED_MEASURE__OPERATION, oldOperation, operation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getOffset() {
        return offset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOffset(Double newOffset) {
        Double oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RESCALED_MEASURE__OFFSET, oldOffset, offset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiplier(Double newMultiplier) {
        Double oldMultiplier = multiplier;
        multiplier = newMultiplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RESCALED_MEASURE__MULTIPLIER, oldMultiplier, multiplier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseMeasureRelationship getRescales() {
        if (eContainerFeatureID() != SMMPackage.RESCALED_MEASURE__RESCALES) return null;
        return (BaseMeasureRelationship)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRescales(BaseMeasureRelationship newRescales, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newRescales, SMMPackage.RESCALED_MEASURE__RESCALES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRescales(BaseMeasureRelationship newRescales) {
        if (newRescales != eInternalContainer() || (eContainerFeatureID() != SMMPackage.RESCALED_MEASURE__RESCALES && newRescales != null)) {
            if (EcoreUtil.isAncestor(this, newRescales))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newRescales != null)
                msgs = ((InternalEObject)newRescales).eInverseAdd(this, SMMPackage.BASE_MEASURE_RELATIONSHIP__RESCALED_MEASURE, BaseMeasureRelationship.class, msgs);
            msgs = basicSetRescales(newRescales, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RESCALED_MEASURE__RESCALES, newRescales, newRescales));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RescaledMeasureRelationship> getRescalesFrom() {
        if (rescalesFrom == null) {
            rescalesFrom = new EObjectContainmentWithInverseEList<RescaledMeasureRelationship>(RescaledMeasureRelationship.class, this, SMMPackage.RESCALED_MEASURE__RESCALES_FROM, SMMPackage.RESCALED_MEASURE_RELATIONSHIP__TO_RESCALED_MEASURE);
        }
        return rescalesFrom;
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
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetRescales((BaseMeasureRelationship)otherEnd, msgs);
            case SMMPackage.RESCALED_MEASURE__RESCALES_FROM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRescalesFrom()).basicAdd(otherEnd, msgs);
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
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                return basicSetRescales(null, msgs);
            case SMMPackage.RESCALED_MEASURE__RESCALES_FROM:
                return ((InternalEList<?>)getRescalesFrom()).basicRemove(otherEnd, msgs);
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
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                return eInternalContainer().eInverseRemove(this, SMMPackage.BASE_MEASURE_RELATIONSHIP__RESCALED_MEASURE, BaseMeasureRelationship.class, msgs);
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
            case SMMPackage.RESCALED_MEASURE__OPERATION:
                if (resolve) return getOperation();
                return basicGetOperation();
            case SMMPackage.RESCALED_MEASURE__OFFSET:
                return getOffset();
            case SMMPackage.RESCALED_MEASURE__MULTIPLIER:
                return getMultiplier();
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                return getRescales();
            case SMMPackage.RESCALED_MEASURE__RESCALES_FROM:
                return getRescalesFrom();
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
            case SMMPackage.RESCALED_MEASURE__OPERATION:
                setOperation((Operation)newValue);
                return;
            case SMMPackage.RESCALED_MEASURE__OFFSET:
                setOffset((Double)newValue);
                return;
            case SMMPackage.RESCALED_MEASURE__MULTIPLIER:
                setMultiplier((Double)newValue);
                return;
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                setRescales((BaseMeasureRelationship)newValue);
                return;
            case SMMPackage.RESCALED_MEASURE__RESCALES_FROM:
                getRescalesFrom().clear();
                getRescalesFrom().addAll((Collection<? extends RescaledMeasureRelationship>)newValue);
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
            case SMMPackage.RESCALED_MEASURE__OPERATION:
                setOperation((Operation)null);
                return;
            case SMMPackage.RESCALED_MEASURE__OFFSET:
                setOffset(OFFSET_EDEFAULT);
                return;
            case SMMPackage.RESCALED_MEASURE__MULTIPLIER:
                setMultiplier(MULTIPLIER_EDEFAULT);
                return;
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                setRescales((BaseMeasureRelationship)null);
                return;
            case SMMPackage.RESCALED_MEASURE__RESCALES_FROM:
                getRescalesFrom().clear();
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
            case SMMPackage.RESCALED_MEASURE__OPERATION:
                return operation != null;
            case SMMPackage.RESCALED_MEASURE__OFFSET:
                return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
            case SMMPackage.RESCALED_MEASURE__MULTIPLIER:
                return MULTIPLIER_EDEFAULT == null ? multiplier != null : !MULTIPLIER_EDEFAULT.equals(multiplier);
            case SMMPackage.RESCALED_MEASURE__RESCALES:
                return getRescales() != null;
            case SMMPackage.RESCALED_MEASURE__RESCALES_FROM:
                return rescalesFrom != null && !rescalesFrom.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (offset: ");
        result.append(offset);
        result.append(", multiplier: ");
        result.append(multiplier);
        result.append(')');
        return result.toString();
    }

} //RescaledMeasureImpl
