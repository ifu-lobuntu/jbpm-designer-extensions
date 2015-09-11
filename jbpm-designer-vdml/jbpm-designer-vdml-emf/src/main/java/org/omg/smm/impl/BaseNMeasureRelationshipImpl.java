/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.DimensionalMeasure;
import org.omg.smm.SMMPackage;
import org.omg.smm.SmmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base NMeasure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.BaseNMeasureRelationshipImpl#getFromCollectiveMeasure <em>From Collective Measure</em>}</li>
 *   <li>{@link org.omg.smm.impl.BaseNMeasureRelationshipImpl#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseNMeasureRelationshipImpl extends BaseMeasureRelationshipImpl implements BaseNMeasureRelationship {
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
    protected BaseNMeasureRelationshipImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.BASE_NMEASURE_RELATIONSHIP;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CollectiveMeasure getFromCollectiveMeasure() {
		if (eContainerFeatureID() != SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE) return null;
		return (CollectiveMeasure)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFromCollectiveMeasure(CollectiveMeasure newFromCollectiveMeasure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromCollectiveMeasure, SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFromCollectiveMeasure(CollectiveMeasure newFromCollectiveMeasure) {
		if (newFromCollectiveMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE && newFromCollectiveMeasure != null)) {
			if (EcoreUtil.isAncestor(this, newFromCollectiveMeasure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromCollectiveMeasure != null)
				msgs = ((InternalEObject)newFromCollectiveMeasure).eInverseAdd(this, SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO, CollectiveMeasure.class, msgs);
			msgs = basicSetFromCollectiveMeasure(newFromCollectiveMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE, newFromCollectiveMeasure, newFromCollectiveMeasure));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.BASE_NMEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BASE_NMEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromCollectiveMeasure((CollectiveMeasure)otherEnd, msgs);
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
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				return basicSetFromCollectiveMeasure(null, msgs);
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
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				return eInternalContainer().eInverseRemove(this, SMMPackage.COLLECTIVE_MEASURE__BASE_MEASURE_TO, CollectiveMeasure.class, msgs);
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
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				return getFromCollectiveMeasure();
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				setFromCollectiveMeasure((CollectiveMeasure)newValue);
				return;
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				setFromCollectiveMeasure((CollectiveMeasure)null);
				return;
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__FROM_COLLECTIVE_MEASURE:
				return getFromCollectiveMeasure() != null;
			case SMMPackage.BASE_NMEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
				return toDimensionalMeasure != null;
		}
		return super.eIsSet(featureID);
	}
    @Override
    public SmmElement basicGetFrom() {
        return getFromCollectiveMeasure();
    }
    @Override
    public SmmElement basicGetTo() {
        return getToDimensionalMeasure();
    }
} //BaseNMeasureRelationshipImpl
