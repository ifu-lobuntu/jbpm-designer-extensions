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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.smm.SMMPackage;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.CharacteristicImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.omg.smm.impl.CharacteristicImpl#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicImpl extends AbstractMeasureElementImpl implements Characteristic {
    /**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
    protected Characteristic parent;
    /**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
    protected EList<Measure> measure;
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CharacteristicImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.CHARACTERISTIC;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Characteristic getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Characteristic)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.CHARACTERISTIC__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Characteristic basicGetParent() {
		return parent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParent(Characteristic newParent) {
		Characteristic oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.CHARACTERISTIC__PARENT, oldParent, parent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Measure> getMeasure() {
		if (measure == null) {
			measure = new EObjectWithInverseResolvingEList<Measure>(Measure.class, this, SMMPackage.CHARACTERISTIC__MEASURE, SMMPackage.MEASURE__TRAIT);
		}
		return measure;
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
			case SMMPackage.CHARACTERISTIC__MEASURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasure()).basicAdd(otherEnd, msgs);
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
			case SMMPackage.CHARACTERISTIC__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
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
			case SMMPackage.CHARACTERISTIC__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case SMMPackage.CHARACTERISTIC__MEASURE:
				return getMeasure();
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
			case SMMPackage.CHARACTERISTIC__PARENT:
				setParent((Characteristic)newValue);
				return;
			case SMMPackage.CHARACTERISTIC__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends Measure>)newValue);
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
			case SMMPackage.CHARACTERISTIC__PARENT:
				setParent((Characteristic)null);
				return;
			case SMMPackage.CHARACTERISTIC__MEASURE:
				getMeasure().clear();
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
			case SMMPackage.CHARACTERISTIC__PARENT:
				return parent != null;
			case SMMPackage.CHARACTERISTIC__MEASURE:
				return measure != null && !measure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CharacteristicImpl
