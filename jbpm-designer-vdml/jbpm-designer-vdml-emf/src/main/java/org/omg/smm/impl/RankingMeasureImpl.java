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
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.RankingInterval;
import org.omg.smm.RankingMeasure;
import org.omg.smm.RankingMeasureRelationship;
import org.omg.smm.SMMPackage;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.RankingMeasureImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.omg.smm.impl.RankingMeasureImpl#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RankingMeasureImpl extends DimensionalMeasureImpl implements RankingMeasure {
    /**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
    protected EList<RankingInterval> interval;

    /**
	 * The cached value of the '{@link #getRankingTo() <em>Ranking To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRankingTo()
	 * @generated
	 * @ordered
	 */
    protected RankingMeasureRelationship rankingTo;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RankingMeasureImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.RANKING_MEASURE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RankingInterval> getInterval() {
		if (interval == null) {
			interval = new EObjectContainmentWithInverseEList<RankingInterval>(RankingInterval.class, this, SMMPackage.RANKING_MEASURE__INTERVAL, SMMPackage.RANKING_INTERVAL__RANKING);
		}
		return interval;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RankingMeasureRelationship getRankingTo() {
		return rankingTo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRankingTo(RankingMeasureRelationship newRankingTo, NotificationChain msgs) {
		RankingMeasureRelationship oldRankingTo = rankingTo;
		rankingTo = newRankingTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMMPackage.RANKING_MEASURE__RANKING_TO, oldRankingTo, newRankingTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRankingTo(RankingMeasureRelationship newRankingTo) {
		if (newRankingTo != rankingTo) {
			NotificationChain msgs = null;
			if (rankingTo != null)
				msgs = ((InternalEObject)rankingTo).eInverseRemove(this, SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE, RankingMeasureRelationship.class, msgs);
			if (newRankingTo != null)
				msgs = ((InternalEObject)newRankingTo).eInverseAdd(this, SMMPackage.RANKING_MEASURE_RELATIONSHIP__FROM_RANKING_MEASURE, RankingMeasureRelationship.class, msgs);
			msgs = basicSetRankingTo(newRankingTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.RANKING_MEASURE__RANKING_TO, newRankingTo, newRankingTo));
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
			case SMMPackage.RANKING_MEASURE__INTERVAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterval()).basicAdd(otherEnd, msgs);
			case SMMPackage.RANKING_MEASURE__RANKING_TO:
				if (rankingTo != null)
					msgs = ((InternalEObject)rankingTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SMMPackage.RANKING_MEASURE__RANKING_TO, null, msgs);
				return basicSetRankingTo((RankingMeasureRelationship)otherEnd, msgs);
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
			case SMMPackage.RANKING_MEASURE__INTERVAL:
				return ((InternalEList<?>)getInterval()).basicRemove(otherEnd, msgs);
			case SMMPackage.RANKING_MEASURE__RANKING_TO:
				return basicSetRankingTo(null, msgs);
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
			case SMMPackage.RANKING_MEASURE__INTERVAL:
				return getInterval();
			case SMMPackage.RANKING_MEASURE__RANKING_TO:
				return getRankingTo();
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
			case SMMPackage.RANKING_MEASURE__INTERVAL:
				getInterval().clear();
				getInterval().addAll((Collection<? extends RankingInterval>)newValue);
				return;
			case SMMPackage.RANKING_MEASURE__RANKING_TO:
				setRankingTo((RankingMeasureRelationship)newValue);
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
			case SMMPackage.RANKING_MEASURE__INTERVAL:
				getInterval().clear();
				return;
			case SMMPackage.RANKING_MEASURE__RANKING_TO:
				setRankingTo((RankingMeasureRelationship)null);
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
			case SMMPackage.RANKING_MEASURE__INTERVAL:
				return interval != null && !interval.isEmpty();
			case SMMPackage.RANKING_MEASURE__RANKING_TO:
				return rankingTo != null;
		}
		return super.eIsSet(featureID);
	}

} //RankingMeasureImpl
