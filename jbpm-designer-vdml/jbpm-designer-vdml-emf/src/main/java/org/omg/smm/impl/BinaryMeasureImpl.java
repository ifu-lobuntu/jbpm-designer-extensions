/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.Base1MeasureRelationship;
import org.omg.smm.Base2MeasureRelationship;
import org.omg.smm.BinaryFunctor;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.Operation;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.BinaryMeasureImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.omg.smm.impl.BinaryMeasureImpl#getCustomFunctor <em>Custom Functor</em>}</li>
 *   <li>{@link org.omg.smm.impl.BinaryMeasureImpl#getBaseMeasure1To <em>Base Measure1 To</em>}</li>
 *   <li>{@link org.omg.smm.impl.BinaryMeasureImpl#getBaseMeasure2To <em>Base Measure2 To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryMeasureImpl extends DimensionalMeasureImpl implements BinaryMeasure {
    /**
	 * The default value of the '{@link #getFunctor() <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
    protected static final BinaryFunctor FUNCTOR_EDEFAULT = BinaryFunctor.PLUS;

    /**
	 * The cached value of the '{@link #getFunctor() <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
    protected BinaryFunctor functor = FUNCTOR_EDEFAULT;

    /**
	 * The cached value of the '{@link #getCustomFunctor() <em>Custom Functor</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCustomFunctor()
	 * @generated
	 * @ordered
	 */
    protected Operation customFunctor;

    /**
	 * The cached value of the '{@link #getBaseMeasure1To() <em>Base Measure1 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBaseMeasure1To()
	 * @generated
	 * @ordered
	 */
    protected Base1MeasureRelationship baseMeasure1To;

    /**
	 * The cached value of the '{@link #getBaseMeasure2To() <em>Base Measure2 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBaseMeasure2To()
	 * @generated
	 * @ordered
	 */
    protected Base2MeasureRelationship baseMeasure2To;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BinaryMeasureImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.BINARY_MEASURE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BinaryFunctor getFunctor() {
		return functor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFunctor(BinaryFunctor newFunctor) {
		BinaryFunctor oldFunctor = functor;
		functor = newFunctor == null ? FUNCTOR_EDEFAULT : newFunctor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BINARY_MEASURE__FUNCTOR, oldFunctor, functor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getCustomFunctor() {
		if (customFunctor != null && customFunctor.eIsProxy()) {
			InternalEObject oldCustomFunctor = (InternalEObject)customFunctor;
			customFunctor = (Operation)eResolveProxy(oldCustomFunctor);
			if (customFunctor != oldCustomFunctor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.BINARY_MEASURE__CUSTOM_FUNCTOR, oldCustomFunctor, customFunctor));
			}
		}
		return customFunctor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation basicGetCustomFunctor() {
		return customFunctor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCustomFunctor(Operation newCustomFunctor) {
		Operation oldCustomFunctor = customFunctor;
		customFunctor = newCustomFunctor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BINARY_MEASURE__CUSTOM_FUNCTOR, oldCustomFunctor, customFunctor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Base1MeasureRelationship getBaseMeasure1To() {
		return baseMeasure1To;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBaseMeasure1To(Base1MeasureRelationship newBaseMeasure1To, NotificationChain msgs) {
		Base1MeasureRelationship oldBaseMeasure1To = baseMeasure1To;
		baseMeasure1To = newBaseMeasure1To;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO, oldBaseMeasure1To, newBaseMeasure1To);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBaseMeasure1To(Base1MeasureRelationship newBaseMeasure1To) {
		if (newBaseMeasure1To != baseMeasure1To) {
			NotificationChain msgs = null;
			if (baseMeasure1To != null)
				msgs = ((InternalEObject)baseMeasure1To).eInverseRemove(this, SMMPackage.BASE1_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE, Base1MeasureRelationship.class, msgs);
			if (newBaseMeasure1To != null)
				msgs = ((InternalEObject)newBaseMeasure1To).eInverseAdd(this, SMMPackage.BASE1_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE, Base1MeasureRelationship.class, msgs);
			msgs = basicSetBaseMeasure1To(newBaseMeasure1To, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO, newBaseMeasure1To, newBaseMeasure1To));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Base2MeasureRelationship getBaseMeasure2To() {
		return baseMeasure2To;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBaseMeasure2To(Base2MeasureRelationship newBaseMeasure2To, NotificationChain msgs) {
		Base2MeasureRelationship oldBaseMeasure2To = baseMeasure2To;
		baseMeasure2To = newBaseMeasure2To;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO, oldBaseMeasure2To, newBaseMeasure2To);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBaseMeasure2To(Base2MeasureRelationship newBaseMeasure2To) {
		if (newBaseMeasure2To != baseMeasure2To) {
			NotificationChain msgs = null;
			if (baseMeasure2To != null)
				msgs = ((InternalEObject)baseMeasure2To).eInverseRemove(this, SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE, Base2MeasureRelationship.class, msgs);
			if (newBaseMeasure2To != null)
				msgs = ((InternalEObject)newBaseMeasure2To).eInverseAdd(this, SMMPackage.BASE2_MEASURE_RELATIONSHIP__FROM_BINARY_MEASURE, Base2MeasureRelationship.class, msgs);
			msgs = basicSetBaseMeasure2To(newBaseMeasure2To, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO, newBaseMeasure2To, newBaseMeasure2To));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				if (baseMeasure1To != null)
					msgs = ((InternalEObject)baseMeasure1To).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO, null, msgs);
				return basicSetBaseMeasure1To((Base1MeasureRelationship)otherEnd, msgs);
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				if (baseMeasure2To != null)
					msgs = ((InternalEObject)baseMeasure2To).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO, null, msgs);
				return basicSetBaseMeasure2To((Base2MeasureRelationship)otherEnd, msgs);
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
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				return basicSetBaseMeasure1To(null, msgs);
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				return basicSetBaseMeasure2To(null, msgs);
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
			case SMMPackage.BINARY_MEASURE__FUNCTOR:
				return getFunctor();
			case SMMPackage.BINARY_MEASURE__CUSTOM_FUNCTOR:
				if (resolve) return getCustomFunctor();
				return basicGetCustomFunctor();
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				return getBaseMeasure1To();
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				return getBaseMeasure2To();
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
			case SMMPackage.BINARY_MEASURE__FUNCTOR:
				setFunctor((BinaryFunctor)newValue);
				return;
			case SMMPackage.BINARY_MEASURE__CUSTOM_FUNCTOR:
				setCustomFunctor((Operation)newValue);
				return;
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				setBaseMeasure1To((Base1MeasureRelationship)newValue);
				return;
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				setBaseMeasure2To((Base2MeasureRelationship)newValue);
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
			case SMMPackage.BINARY_MEASURE__FUNCTOR:
				setFunctor(FUNCTOR_EDEFAULT);
				return;
			case SMMPackage.BINARY_MEASURE__CUSTOM_FUNCTOR:
				setCustomFunctor((Operation)null);
				return;
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				setBaseMeasure1To((Base1MeasureRelationship)null);
				return;
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				setBaseMeasure2To((Base2MeasureRelationship)null);
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
			case SMMPackage.BINARY_MEASURE__FUNCTOR:
				return functor != FUNCTOR_EDEFAULT;
			case SMMPackage.BINARY_MEASURE__CUSTOM_FUNCTOR:
				return customFunctor != null;
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE1_TO:
				return baseMeasure1To != null;
			case SMMPackage.BINARY_MEASURE__BASE_MEASURE2_TO:
				return baseMeasure2To != null;
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
		result.append(" (functor: ");
		result.append(functor);
		result.append(')');
		return result.toString();
	}

} //BinaryMeasureImpl
