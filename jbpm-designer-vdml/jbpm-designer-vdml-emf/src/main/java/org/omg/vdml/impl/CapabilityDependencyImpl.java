/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.CapabilityDependency;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.CapabilityDependencyImpl#getIsTangible <em>Is Tangible</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityDependencyImpl#getDeliverableDefinition <em>Deliverable Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityDependencyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityDependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityDependencyImpl#getIsFromExternalSource <em>Is From External Source</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityDependencyImpl#getIsForExternalTarget <em>Is For External Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDependencyImpl extends VdmlElementImpl implements CapabilityDependency {
    /**
	 * The default value of the '{@link #getIsTangible() <em>Is Tangible</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsTangible()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_TANGIBLE_EDEFAULT = Boolean.TRUE;

    /**
	 * The cached value of the '{@link #getIsTangible() <em>Is Tangible</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsTangible()
	 * @generated
	 * @ordered
	 */
    protected Boolean isTangible = IS_TANGIBLE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getDeliverableDefinition() <em>Deliverable Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDeliverableDefinition()
	 * @generated
	 * @ordered
	 */
    protected BusinessItemDefinition deliverableDefinition;

    /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
    protected CapabilityDefinition source;

    /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
    protected CapabilityDefinition target;

    /**
	 * The default value of the '{@link #getIsFromExternalSource() <em>Is From External Source</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsFromExternalSource()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_FROM_EXTERNAL_SOURCE_EDEFAULT = Boolean.TRUE;

    /**
	 * The cached value of the '{@link #getIsFromExternalSource() <em>Is From External Source</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsFromExternalSource()
	 * @generated
	 * @ordered
	 */
    protected Boolean isFromExternalSource = IS_FROM_EXTERNAL_SOURCE_EDEFAULT;

    /**
	 * The default value of the '{@link #getIsForExternalTarget() <em>Is For External Target</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsForExternalTarget()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_FOR_EXTERNAL_TARGET_EDEFAULT = Boolean.TRUE;

    /**
	 * The cached value of the '{@link #getIsForExternalTarget() <em>Is For External Target</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsForExternalTarget()
	 * @generated
	 * @ordered
	 */
    protected Boolean isForExternalTarget = IS_FOR_EXTERNAL_TARGET_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CapabilityDependencyImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.CAPABILITY_DEPENDENCY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsTangible() {
		return isTangible;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsTangible(Boolean newIsTangible) {
		Boolean oldIsTangible = isTangible;
		isTangible = newIsTangible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE, oldIsTangible, isTangible));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemDefinition getDeliverableDefinition() {
		if (deliverableDefinition != null && deliverableDefinition.eIsProxy()) {
			InternalEObject oldDeliverableDefinition = (InternalEObject)deliverableDefinition;
			deliverableDefinition = (BusinessItemDefinition)eResolveProxy(oldDeliverableDefinition);
			if (deliverableDefinition != oldDeliverableDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION, oldDeliverableDefinition, deliverableDefinition));
			}
		}
		return deliverableDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemDefinition basicGetDeliverableDefinition() {
		return deliverableDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDeliverableDefinition(BusinessItemDefinition newDeliverableDefinition, NotificationChain msgs) {
		BusinessItemDefinition oldDeliverableDefinition = deliverableDefinition;
		deliverableDefinition = newDeliverableDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION, oldDeliverableDefinition, newDeliverableDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDeliverableDefinition(BusinessItemDefinition newDeliverableDefinition) {
		if (newDeliverableDefinition != deliverableDefinition) {
			NotificationChain msgs = null;
			if (deliverableDefinition != null)
				msgs = ((InternalEObject)deliverableDefinition).eInverseRemove(this, VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, BusinessItemDefinition.class, msgs);
			if (newDeliverableDefinition != null)
				msgs = ((InternalEObject)newDeliverableDefinition).eInverseAdd(this, VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, BusinessItemDefinition.class, msgs);
			msgs = basicSetDeliverableDefinition(newDeliverableDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION, newDeliverableDefinition, newDeliverableDefinition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityDefinition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (CapabilityDefinition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityDefinition basicGetSource() {
		return source;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSource(CapabilityDefinition newSource, NotificationChain msgs) {
		CapabilityDefinition oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSource(CapabilityDefinition newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, VDMLPackage.CAPABILITY_DEFINITION__OUTPUT, CapabilityDefinition.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, VDMLPackage.CAPABILITY_DEFINITION__OUTPUT, CapabilityDefinition.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE, newSource, newSource));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityDefinition getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CapabilityDefinition)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.CAPABILITY_DEPENDENCY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityDefinition basicGetTarget() {
		return target;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTarget(CapabilityDefinition newTarget, NotificationChain msgs) {
		CapabilityDefinition oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTarget(CapabilityDefinition newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, VDMLPackage.CAPABILITY_DEFINITION__INPUT, CapabilityDefinition.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, VDMLPackage.CAPABILITY_DEFINITION__INPUT, CapabilityDefinition.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__TARGET, newTarget, newTarget));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsFromExternalSource() {
		return isFromExternalSource;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsFromExternalSource(Boolean newIsFromExternalSource) {
		Boolean oldIsFromExternalSource = isFromExternalSource;
		isFromExternalSource = newIsFromExternalSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE, oldIsFromExternalSource, isFromExternalSource));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsForExternalTarget() {
		return isForExternalTarget;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsForExternalTarget(Boolean newIsForExternalTarget) {
		Boolean oldIsForExternalTarget = isForExternalTarget;
		isForExternalTarget = newIsForExternalTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET, oldIsForExternalTarget, isForExternalTarget));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
				if (deliverableDefinition != null)
					msgs = ((InternalEObject)deliverableDefinition).eInverseRemove(this, VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, BusinessItemDefinition.class, msgs);
				return basicSetDeliverableDefinition((BusinessItemDefinition)otherEnd, msgs);
			case VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, VDMLPackage.CAPABILITY_DEFINITION__OUTPUT, CapabilityDefinition.class, msgs);
				return basicSetSource((CapabilityDefinition)otherEnd, msgs);
			case VDMLPackage.CAPABILITY_DEPENDENCY__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, VDMLPackage.CAPABILITY_DEFINITION__INPUT, CapabilityDefinition.class, msgs);
				return basicSetTarget((CapabilityDefinition)otherEnd, msgs);
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
			case VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
				return basicSetDeliverableDefinition(null, msgs);
			case VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE:
				return basicSetSource(null, msgs);
			case VDMLPackage.CAPABILITY_DEPENDENCY__TARGET:
				return basicSetTarget(null, msgs);
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
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
				return getIsTangible();
			case VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
				if (resolve) return getDeliverableDefinition();
				return basicGetDeliverableDefinition();
			case VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case VDMLPackage.CAPABILITY_DEPENDENCY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
				return getIsFromExternalSource();
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
				return getIsForExternalTarget();
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
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
				setIsTangible((Boolean)newValue);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
				setDeliverableDefinition((BusinessItemDefinition)newValue);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE:
				setSource((CapabilityDefinition)newValue);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__TARGET:
				setTarget((CapabilityDefinition)newValue);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
				setIsFromExternalSource((Boolean)newValue);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
				setIsForExternalTarget((Boolean)newValue);
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
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
				setIsTangible(IS_TANGIBLE_EDEFAULT);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
				setDeliverableDefinition((BusinessItemDefinition)null);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE:
				setSource((CapabilityDefinition)null);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__TARGET:
				setTarget((CapabilityDefinition)null);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
				setIsFromExternalSource(IS_FROM_EXTERNAL_SOURCE_EDEFAULT);
				return;
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
				setIsForExternalTarget(IS_FOR_EXTERNAL_TARGET_EDEFAULT);
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
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
				return IS_TANGIBLE_EDEFAULT == null ? isTangible != null : !IS_TANGIBLE_EDEFAULT.equals(isTangible);
			case VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
				return deliverableDefinition != null;
			case VDMLPackage.CAPABILITY_DEPENDENCY__SOURCE:
				return source != null;
			case VDMLPackage.CAPABILITY_DEPENDENCY__TARGET:
				return target != null;
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
				return IS_FROM_EXTERNAL_SOURCE_EDEFAULT == null ? isFromExternalSource != null : !IS_FROM_EXTERNAL_SOURCE_EDEFAULT.equals(isFromExternalSource);
			case VDMLPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
				return IS_FOR_EXTERNAL_TARGET_EDEFAULT == null ? isForExternalTarget != null : !IS_FOR_EXTERNAL_TARGET_EDEFAULT.equals(isForExternalTarget);
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
		result.append(" (isTangible: ");
		result.append(isTangible);
		result.append(", isFromExternalSource: ");
		result.append(isFromExternalSource);
		result.append(", isForExternalTarget: ");
		result.append(isForExternalTarget);
		result.append(')');
		return result.toString();
	}

} //CapabilityDependencyImpl
