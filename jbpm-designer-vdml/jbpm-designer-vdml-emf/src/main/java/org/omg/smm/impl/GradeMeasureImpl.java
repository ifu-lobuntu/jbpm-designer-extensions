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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.GradeInterval;
import org.omg.smm.GradeMeasure;
import org.omg.smm.GradeMeasureRelationship;
import org.omg.smm.SMMPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.GradeMeasureImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.omg.smm.impl.GradeMeasureImpl#getGradeTo <em>Grade To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradeMeasureImpl extends MeasureImpl implements GradeMeasure {
    /**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
    protected EList<GradeInterval> interval;

    /**
	 * The cached value of the '{@link #getGradeTo() <em>Grade To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGradeTo()
	 * @generated
	 * @ordered
	 */
    protected GradeMeasureRelationship gradeTo;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GradeMeasureImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.GRADE_MEASURE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GradeInterval> getInterval() {
		if (interval == null) {
			interval = new EObjectContainmentEList<GradeInterval>(GradeInterval.class, this, SMMPackage.GRADE_MEASURE__INTERVAL);
		}
		return interval;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GradeMeasureRelationship getGradeTo() {
		return gradeTo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGradeTo(GradeMeasureRelationship newGradeTo, NotificationChain msgs) {
		GradeMeasureRelationship oldGradeTo = gradeTo;
		gradeTo = newGradeTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASURE__GRADE_TO, oldGradeTo, newGradeTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGradeTo(GradeMeasureRelationship newGradeTo) {
		if (newGradeTo != gradeTo) {
			NotificationChain msgs = null;
			if (gradeTo != null)
				msgs = ((InternalEObject)gradeTo).eInverseRemove(this, SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE, GradeMeasureRelationship.class, msgs);
			if (newGradeTo != null)
				msgs = ((InternalEObject)newGradeTo).eInverseAdd(this, SMMPackage.GRADE_MEASURE_RELATIONSHIP__FROM_GRADE_MEASURE, GradeMeasureRelationship.class, msgs);
			msgs = basicSetGradeTo(newGradeTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.GRADE_MEASURE__GRADE_TO, newGradeTo, newGradeTo));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.GRADE_MEASURE__GRADE_TO:
				if (gradeTo != null)
					msgs = ((InternalEObject)gradeTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SMMPackage.GRADE_MEASURE__GRADE_TO, null, msgs);
				return basicSetGradeTo((GradeMeasureRelationship)otherEnd, msgs);
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
			case SMMPackage.GRADE_MEASURE__INTERVAL:
				return ((InternalEList<?>)getInterval()).basicRemove(otherEnd, msgs);
			case SMMPackage.GRADE_MEASURE__GRADE_TO:
				return basicSetGradeTo(null, msgs);
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
			case SMMPackage.GRADE_MEASURE__INTERVAL:
				return getInterval();
			case SMMPackage.GRADE_MEASURE__GRADE_TO:
				return getGradeTo();
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
			case SMMPackage.GRADE_MEASURE__INTERVAL:
				getInterval().clear();
				getInterval().addAll((Collection<? extends GradeInterval>)newValue);
				return;
			case SMMPackage.GRADE_MEASURE__GRADE_TO:
				setGradeTo((GradeMeasureRelationship)newValue);
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
			case SMMPackage.GRADE_MEASURE__INTERVAL:
				getInterval().clear();
				return;
			case SMMPackage.GRADE_MEASURE__GRADE_TO:
				setGradeTo((GradeMeasureRelationship)null);
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
			case SMMPackage.GRADE_MEASURE__INTERVAL:
				return interval != null && !interval.isEmpty();
			case SMMPackage.GRADE_MEASURE__GRADE_TO:
				return gradeTo != null;
		}
		return super.eIsSet(featureID);
	}

} //GradeMeasureImpl
