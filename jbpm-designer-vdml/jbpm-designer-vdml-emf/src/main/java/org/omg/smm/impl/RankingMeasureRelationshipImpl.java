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
import org.omg.smm.RankingMeasure;
import org.omg.smm.RankingMeasureRelationship;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.RankingMeasureRelationshipImpl#getFromRankingMeasure <em>From Ranking Measure</em>}</li>
 *   <li>{@link org.omg.smm.impl.RankingMeasureRelationshipImpl#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RankingMeasureRelationshipImpl extends BaseMeasureRelationshipImpl implements RankingMeasureRelationship {
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
    protected RankingMeasureRelationshipImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.RANKING_MEASURE_RELATIONSHIP;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RankingMeasure getFromRankingMeasure() {
		if (eContainerFeatureID() != SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE) return null;
		return (RankingMeasure)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFromRankingMeasure(RankingMeasure newFromRankingMeasure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromRankingMeasure, SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFromRankingMeasure(RankingMeasure newFromRankingMeasure) {
		if (newFromRankingMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE && newFromRankingMeasure != null)) {
			if (EcoreUtil.isAncestor(this, newFromRankingMeasure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromRankingMeasure != null)
				msgs = ((InternalEObject)newFromRankingMeasure).eInverseAdd(this, SMMPackage.RANKING_MEASURE__RANKING_TO, RankingMeasure.class, msgs);
			msgs = basicSetFromRankingMeasure(newFromRankingMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE, newFromRankingMeasure, newFromRankingMeasure));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.RANKING_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RANKING_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromRankingMeasure((RankingMeasure)otherEnd, msgs);
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
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				return basicSetFromRankingMeasure(null, msgs);
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
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				return eInternalContainer().eInverseRemove(this, SMMPackage.RANKING_MEASURE__RANKING_TO, RankingMeasure.class, msgs);
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
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				return getFromRankingMeasure();
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				setFromRankingMeasure((RankingMeasure)newValue);
				return;
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				setFromRankingMeasure((RankingMeasure)null);
				return;
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE:
				return getFromRankingMeasure() != null;
			case SMMPackage.RANKING_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
				return toDimensionalMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //RankingMeasureRelationshipImpl
