/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Expression;
import org.omg.vdml.InputPort;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.OutputPort;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getDeliverable <em>Deliverable</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getPlanningPercentage <em>Planning Percentage</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getInputDriven <em>Input Driven</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getIsExclusive <em>Is Exclusive</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ResourceUseImpl#getResourceIsConsumed <em>Resource Is Consumed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceUseImpl extends MeasurableElementImpl implements ResourceUse {
    /**
	 * The cached value of the '{@link #getDeliverable() <em>Deliverable</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDeliverable()
	 * @generated
	 * @ordered
	 */
    protected OutputPort deliverable;

    /**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
    protected EList<InputPort> resource;

    /**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic quantity;

    /**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic duration;

    /**
	 * The cached value of the '{@link #getPlanningPercentage() <em>Planning Percentage</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPlanningPercentage()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic planningPercentage;

    /**
	 * The default value of the '{@link #getInputDriven() <em>Input Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInputDriven()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean INPUT_DRIVEN_EDEFAULT = Boolean.FALSE;

    /**
	 * The cached value of the '{@link #getInputDriven() <em>Input Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInputDriven()
	 * @generated
	 * @ordered
	 */
    protected Boolean inputDriven = INPUT_DRIVEN_EDEFAULT;

    /**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
    protected Expression condition;

    /**
	 * The default value of the '{@link #getIsExclusive() <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsExclusive()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_EXCLUSIVE_EDEFAULT = Boolean.FALSE;

    /**
	 * The cached value of the '{@link #getIsExclusive() <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsExclusive()
	 * @generated
	 * @ordered
	 */
    protected Boolean isExclusive = IS_EXCLUSIVE_EDEFAULT;

    /**
	 * The default value of the '{@link #getResourceIsConsumed() <em>Resource Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResourceIsConsumed()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean RESOURCE_IS_CONSUMED_EDEFAULT = Boolean.TRUE;

    /**
	 * The cached value of the '{@link #getResourceIsConsumed() <em>Resource Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResourceIsConsumed()
	 * @generated
	 * @ordered
	 */
    protected Boolean resourceIsConsumed = RESOURCE_IS_CONSUMED_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ResourceUseImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.RESOURCE_USE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPort getDeliverable() {
		if (deliverable != null && deliverable.eIsProxy()) {
			InternalEObject oldDeliverable = (InternalEObject)deliverable;
			deliverable = (OutputPort)eResolveProxy(oldDeliverable);
			if (deliverable != oldDeliverable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.RESOURCE_USE__DELIVERABLE, oldDeliverable, deliverable));
			}
		}
		return deliverable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPort basicGetDeliverable() {
		return deliverable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDeliverable(OutputPort newDeliverable, NotificationChain msgs) {
		OutputPort oldDeliverable = deliverable;
		deliverable = newDeliverable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__DELIVERABLE, oldDeliverable, newDeliverable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDeliverable(OutputPort newDeliverable) {
		if (newDeliverable != deliverable) {
			NotificationChain msgs = null;
			if (deliverable != null)
				msgs = ((InternalEObject)deliverable).eInverseRemove(this, VDMLPackage.OUTPUT_PORT__RESOURCE_USE, OutputPort.class, msgs);
			if (newDeliverable != null)
				msgs = ((InternalEObject)newDeliverable).eInverseAdd(this, VDMLPackage.OUTPUT_PORT__RESOURCE_USE, OutputPort.class, msgs);
			msgs = basicSetDeliverable(newDeliverable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__DELIVERABLE, newDeliverable, newDeliverable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<InputPort> getResource() {
		if (resource == null) {
			resource = new EObjectWithInverseResolvingEList.ManyInverse<InputPort>(InputPort.class, this, VDMLPackage.RESOURCE_USE__RESOURCE, VDMLPackage.INPUT_PORT__RESOURCE_USE);
		}
		return resource;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getQuantity() {
		return quantity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetQuantity(MeasuredCharacteristic newQuantity, NotificationChain msgs) {
		MeasuredCharacteristic oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setQuantity(MeasuredCharacteristic newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__QUANTITY, newQuantity, newQuantity));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getDuration() {
		return duration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDuration(MeasuredCharacteristic newDuration, NotificationChain msgs) {
		MeasuredCharacteristic oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDuration(MeasuredCharacteristic newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__DURATION, newDuration, newDuration));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getPlanningPercentage() {
		return planningPercentage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPlanningPercentage(MeasuredCharacteristic newPlanningPercentage, NotificationChain msgs) {
		MeasuredCharacteristic oldPlanningPercentage = planningPercentage;
		planningPercentage = newPlanningPercentage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE, oldPlanningPercentage, newPlanningPercentage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPlanningPercentage(MeasuredCharacteristic newPlanningPercentage) {
		if (newPlanningPercentage != planningPercentage) {
			NotificationChain msgs = null;
			if (planningPercentage != null)
				msgs = ((InternalEObject)planningPercentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE, null, msgs);
			if (newPlanningPercentage != null)
				msgs = ((InternalEObject)newPlanningPercentage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE, null, msgs);
			msgs = basicSetPlanningPercentage(newPlanningPercentage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE, newPlanningPercentage, newPlanningPercentage));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getInputDriven() {
		return inputDriven;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInputDriven(Boolean newInputDriven) {
		Boolean oldInputDriven = inputDriven;
		inputDriven = newInputDriven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__INPUT_DRIVEN, oldInputDriven, inputDriven));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Expression getCondition() {
		return condition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.RESOURCE_USE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__CONDITION, newCondition, newCondition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsExclusive() {
		return isExclusive;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsExclusive(Boolean newIsExclusive) {
		Boolean oldIsExclusive = isExclusive;
		isExclusive = newIsExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__IS_EXCLUSIVE, oldIsExclusive, isExclusive));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getResourceIsConsumed() {
		return resourceIsConsumed;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setResourceIsConsumed(Boolean newResourceIsConsumed) {
		Boolean oldResourceIsConsumed = resourceIsConsumed;
		resourceIsConsumed = newResourceIsConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RESOURCE_USE__RESOURCE_IS_CONSUMED, oldResourceIsConsumed, resourceIsConsumed));
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
			case VDMLPackage.RESOURCE_USE__DELIVERABLE:
				if (deliverable != null)
					msgs = ((InternalEObject)deliverable).eInverseRemove(this, VDMLPackage.OUTPUT_PORT__RESOURCE_USE, OutputPort.class, msgs);
				return basicSetDeliverable((OutputPort)otherEnd, msgs);
			case VDMLPackage.RESOURCE_USE__RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResource()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.RESOURCE_USE__DELIVERABLE:
				return basicSetDeliverable(null, msgs);
			case VDMLPackage.RESOURCE_USE__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case VDMLPackage.RESOURCE_USE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case VDMLPackage.RESOURCE_USE__DURATION:
				return basicSetDuration(null, msgs);
			case VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE:
				return basicSetPlanningPercentage(null, msgs);
			case VDMLPackage.RESOURCE_USE__CONDITION:
				return basicSetCondition(null, msgs);
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
			case VDMLPackage.RESOURCE_USE__DELIVERABLE:
				if (resolve) return getDeliverable();
				return basicGetDeliverable();
			case VDMLPackage.RESOURCE_USE__RESOURCE:
				return getResource();
			case VDMLPackage.RESOURCE_USE__QUANTITY:
				return getQuantity();
			case VDMLPackage.RESOURCE_USE__DURATION:
				return getDuration();
			case VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE:
				return getPlanningPercentage();
			case VDMLPackage.RESOURCE_USE__INPUT_DRIVEN:
				return getInputDriven();
			case VDMLPackage.RESOURCE_USE__CONDITION:
				return getCondition();
			case VDMLPackage.RESOURCE_USE__IS_EXCLUSIVE:
				return getIsExclusive();
			case VDMLPackage.RESOURCE_USE__RESOURCE_IS_CONSUMED:
				return getResourceIsConsumed();
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
			case VDMLPackage.RESOURCE_USE__DELIVERABLE:
				setDeliverable((OutputPort)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends InputPort>)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__QUANTITY:
				setQuantity((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__DURATION:
				setDuration((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE:
				setPlanningPercentage((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__INPUT_DRIVEN:
				setInputDriven((Boolean)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__CONDITION:
				setCondition((Expression)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__IS_EXCLUSIVE:
				setIsExclusive((Boolean)newValue);
				return;
			case VDMLPackage.RESOURCE_USE__RESOURCE_IS_CONSUMED:
				setResourceIsConsumed((Boolean)newValue);
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
			case VDMLPackage.RESOURCE_USE__DELIVERABLE:
				setDeliverable((OutputPort)null);
				return;
			case VDMLPackage.RESOURCE_USE__RESOURCE:
				getResource().clear();
				return;
			case VDMLPackage.RESOURCE_USE__QUANTITY:
				setQuantity((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.RESOURCE_USE__DURATION:
				setDuration((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE:
				setPlanningPercentage((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.RESOURCE_USE__INPUT_DRIVEN:
				setInputDriven(INPUT_DRIVEN_EDEFAULT);
				return;
			case VDMLPackage.RESOURCE_USE__CONDITION:
				setCondition((Expression)null);
				return;
			case VDMLPackage.RESOURCE_USE__IS_EXCLUSIVE:
				setIsExclusive(IS_EXCLUSIVE_EDEFAULT);
				return;
			case VDMLPackage.RESOURCE_USE__RESOURCE_IS_CONSUMED:
				setResourceIsConsumed(RESOURCE_IS_CONSUMED_EDEFAULT);
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
			case VDMLPackage.RESOURCE_USE__DELIVERABLE:
				return deliverable != null;
			case VDMLPackage.RESOURCE_USE__RESOURCE:
				return resource != null && !resource.isEmpty();
			case VDMLPackage.RESOURCE_USE__QUANTITY:
				return quantity != null;
			case VDMLPackage.RESOURCE_USE__DURATION:
				return duration != null;
			case VDMLPackage.RESOURCE_USE__PLANNING_PERCENTAGE:
				return planningPercentage != null;
			case VDMLPackage.RESOURCE_USE__INPUT_DRIVEN:
				return INPUT_DRIVEN_EDEFAULT == null ? inputDriven != null : !INPUT_DRIVEN_EDEFAULT.equals(inputDriven);
			case VDMLPackage.RESOURCE_USE__CONDITION:
				return condition != null;
			case VDMLPackage.RESOURCE_USE__IS_EXCLUSIVE:
				return IS_EXCLUSIVE_EDEFAULT == null ? isExclusive != null : !IS_EXCLUSIVE_EDEFAULT.equals(isExclusive);
			case VDMLPackage.RESOURCE_USE__RESOURCE_IS_CONSUMED:
				return RESOURCE_IS_CONSUMED_EDEFAULT == null ? resourceIsConsumed != null : !RESOURCE_IS_CONSUMED_EDEFAULT.equals(resourceIsConsumed);
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
		result.append(" (inputDriven: ");
		result.append(inputDriven);
		result.append(", isExclusive: ");
		result.append(isExclusive);
		result.append(", resourceIsConsumed: ");
		result.append(resourceIsConsumed);
		result.append(')');
		return result.toString();
	}

} //ResourceUseImpl
