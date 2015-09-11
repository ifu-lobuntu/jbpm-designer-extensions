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
import org.omg.smm.GradeMeasure;
import org.omg.smm.GradeMeasureRelationship;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.GradeMeasureRelationshipImpl#getFromGradeMeasure <em>From Grade Measure</em>}</li>
 *   <li>{@link org.omg.smm.impl.GradeMeasureRelationshipImpl#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradeMeasureRelationshipImpl extends MeasureRelationshipImpl implements GradeMeasureRelationship {
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
    protected GradeMeasureRelationshipImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.GRADE_MEASURE_RELATIONSHIP;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GradeMeasure getFromGradeMeasure() {
		if (eContainerFeatureID() != SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE) return null;
		return (GradeMeasure)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFromGradeMeasure(GradeMeasure newFromGradeMeasure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromGradeMeasure, SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFromGradeMeasure(GradeMeasure newFromGradeMeasure) {
		if (newFromGradeMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE && newFromGradeMeasure != null)) {
			if (EcoreUtil.isAncestor(this, newFromGradeMeasure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromGradeMeasure != null)
				msgs = ((InternalEObject)newFromGradeMeasure).eInverseAdd(this, SMMPackage.GRADE_MEASURE__GRADE_TO, GradeMeasure.class, msgs);
			msgs = basicSetFromGradeMeasure(newFromGradeMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE, newFromGradeMeasure, newFromGradeMeasure));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.GRADE_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE, oldToDimensionalMeasure, toDimensionalMeasure));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromGradeMeasure((GradeMeasure)otherEnd, msgs);
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
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				return basicSetFromGradeMeasure(null, msgs);
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
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				return eInternalContainer().eInverseRemove(this, SMMPackage.GRADE_MEASURE__GRADE_TO, GradeMeasure.class, msgs);
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
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				return getFromGradeMeasure();
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				setFromGradeMeasure((GradeMeasure)newValue);
				return;
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				setFromGradeMeasure((GradeMeasure)null);
				return;
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
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
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE:
				return getFromGradeMeasure() != null;
			case SMMPackage.GRADE_MEASURE_RELATIONSHIP__TO_DIMENSIONAL_MEASURE:
				return toDimensionalMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //GradeMeasureRelationshipImpl
