/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.vdml.Expression;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Port;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.PortImpl#getIsIntermediate <em>Is Intermediate</em>}</li>
 *   <li>{@link org.omg.vdml.impl.PortImpl#getPlanningPercentage <em>Planning Percentage</em>}</li>
 *   <li>{@link org.omg.vdml.impl.PortImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.omg.vdml.impl.PortImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.vdml.impl.PortImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.PortImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends MeasurableElementImpl implements Port {
    /**
	 * The default value of the '{@link #getIsIntermediate() <em>Is Intermediate</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsIntermediate()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_INTERMEDIATE_EDEFAULT = Boolean.FALSE;

    /**
	 * The cached value of the '{@link #getIsIntermediate() <em>Is Intermediate</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsIntermediate()
	 * @generated
	 * @ordered
	 */
    protected Boolean isIntermediate = IS_INTERMEDIATE_EDEFAULT;

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
	 * The cached value of the '{@link #getBatchSize() <em>Batch Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBatchSize()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic batchSize;

    /**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic offset;

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
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
    protected Role handler;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PortImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.PORT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsIntermediate() {
		return isIntermediate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsIntermediate(Boolean newIsIntermediate) {
		Boolean oldIsIntermediate = isIntermediate;
		isIntermediate = newIsIntermediate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__IS_INTERMEDIATE, oldIsIntermediate, isIntermediate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__PLANNING_PERCENTAGE, oldPlanningPercentage, newPlanningPercentage);
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
				msgs = ((InternalEObject)planningPercentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__PLANNING_PERCENTAGE, null, msgs);
			if (newPlanningPercentage != null)
				msgs = ((InternalEObject)newPlanningPercentage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__PLANNING_PERCENTAGE, null, msgs);
			msgs = basicSetPlanningPercentage(newPlanningPercentage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__PLANNING_PERCENTAGE, newPlanningPercentage, newPlanningPercentage));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getBatchSize() {
		return batchSize;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBatchSize(MeasuredCharacteristic newBatchSize, NotificationChain msgs) {
		MeasuredCharacteristic oldBatchSize = batchSize;
		batchSize = newBatchSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__BATCH_SIZE, oldBatchSize, newBatchSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBatchSize(MeasuredCharacteristic newBatchSize) {
		if (newBatchSize != batchSize) {
			NotificationChain msgs = null;
			if (batchSize != null)
				msgs = ((InternalEObject)batchSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__BATCH_SIZE, null, msgs);
			if (newBatchSize != null)
				msgs = ((InternalEObject)newBatchSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__BATCH_SIZE, null, msgs);
			msgs = basicSetBatchSize(newBatchSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__BATCH_SIZE, newBatchSize, newBatchSize));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getOffset() {
		return offset;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetOffset(MeasuredCharacteristic newOffset, NotificationChain msgs) {
		MeasuredCharacteristic oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOffset(MeasuredCharacteristic newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__OFFSET, newOffset, newOffset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.PORT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__CONDITION, newCondition, newCondition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role getHandler() {
		if (handler != null && handler.eIsProxy()) {
			InternalEObject oldHandler = (InternalEObject)handler;
			handler = (Role)eResolveProxy(oldHandler);
			if (handler != oldHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.PORT__HANDLER, oldHandler, handler));
			}
		}
		return handler;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role basicGetHandler() {
		return handler;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetHandler(Role newHandler, NotificationChain msgs) {
		Role oldHandler = handler;
		handler = newHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__HANDLER, oldHandler, newHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setHandler(Role newHandler) {
		if (newHandler != handler) {
			NotificationChain msgs = null;
			if (handler != null)
				msgs = ((InternalEObject)handler).eInverseRemove(this, VDMLPackage.ROLE__PORT, Role.class, msgs);
			if (newHandler != null)
				msgs = ((InternalEObject)newHandler).eInverseAdd(this, VDMLPackage.ROLE__PORT, Role.class, msgs);
			msgs = basicSetHandler(newHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.PORT__HANDLER, newHandler, newHandler));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.PORT__HANDLER:
				if (handler != null)
					msgs = ((InternalEObject)handler).eInverseRemove(this, VDMLPackage.ROLE__PORT, Role.class, msgs);
				return basicSetHandler((Role)otherEnd, msgs);
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
			case VDMLPackage.PORT__PLANNING_PERCENTAGE:
				return basicSetPlanningPercentage(null, msgs);
			case VDMLPackage.PORT__BATCH_SIZE:
				return basicSetBatchSize(null, msgs);
			case VDMLPackage.PORT__OFFSET:
				return basicSetOffset(null, msgs);
			case VDMLPackage.PORT__CONDITION:
				return basicSetCondition(null, msgs);
			case VDMLPackage.PORT__HANDLER:
				return basicSetHandler(null, msgs);
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
			case VDMLPackage.PORT__IS_INTERMEDIATE:
				return getIsIntermediate();
			case VDMLPackage.PORT__PLANNING_PERCENTAGE:
				return getPlanningPercentage();
			case VDMLPackage.PORT__BATCH_SIZE:
				return getBatchSize();
			case VDMLPackage.PORT__OFFSET:
				return getOffset();
			case VDMLPackage.PORT__CONDITION:
				return getCondition();
			case VDMLPackage.PORT__HANDLER:
				if (resolve) return getHandler();
				return basicGetHandler();
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
			case VDMLPackage.PORT__IS_INTERMEDIATE:
				setIsIntermediate((Boolean)newValue);
				return;
			case VDMLPackage.PORT__PLANNING_PERCENTAGE:
				setPlanningPercentage((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.PORT__BATCH_SIZE:
				setBatchSize((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.PORT__OFFSET:
				setOffset((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.PORT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case VDMLPackage.PORT__HANDLER:
				setHandler((Role)newValue);
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
			case VDMLPackage.PORT__IS_INTERMEDIATE:
				setIsIntermediate(IS_INTERMEDIATE_EDEFAULT);
				return;
			case VDMLPackage.PORT__PLANNING_PERCENTAGE:
				setPlanningPercentage((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.PORT__BATCH_SIZE:
				setBatchSize((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.PORT__OFFSET:
				setOffset((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.PORT__CONDITION:
				setCondition((Expression)null);
				return;
			case VDMLPackage.PORT__HANDLER:
				setHandler((Role)null);
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
			case VDMLPackage.PORT__IS_INTERMEDIATE:
				return IS_INTERMEDIATE_EDEFAULT == null ? isIntermediate != null : !IS_INTERMEDIATE_EDEFAULT.equals(isIntermediate);
			case VDMLPackage.PORT__PLANNING_PERCENTAGE:
				return planningPercentage != null;
			case VDMLPackage.PORT__BATCH_SIZE:
				return batchSize != null;
			case VDMLPackage.PORT__OFFSET:
				return offset != null;
			case VDMLPackage.PORT__CONDITION:
				return condition != null;
			case VDMLPackage.PORT__HANDLER:
				return handler != null;
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
		result.append(" (isIntermediate: ");
		result.append(isIntermediate);
		result.append(')');
		return result.toString();
	}

} //PortImpl
