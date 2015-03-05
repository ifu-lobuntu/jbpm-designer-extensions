/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.Expression;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.Port;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl#isIntermediate <em>Is Intermediate</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl#getPlanningPercentage <em>Planning Percentage</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortImpl extends MeasurableElementImpl implements Port {
    /**
     * The default value of the '{@link #isIntermediate() <em>Is Intermediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIntermediate()
     * @generated
     * @ordered
     */
    protected static final boolean IS_INTERMEDIATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIntermediate() <em>Is Intermediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIntermediate()
     * @generated
     * @ordered
     */
    protected boolean isIntermediate = IS_INTERMEDIATE_EDEFAULT;

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
        return VdmlPackage.Literals.PORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIntermediate() {
        return isIntermediate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsIntermediate(boolean newIsIntermediate) {
        boolean oldIsIntermediate = isIntermediate;
        isIntermediate = newIsIntermediate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__IS_INTERMEDIATE, oldIsIntermediate, isIntermediate));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__PLANNING_PERCENTAGE, oldPlanningPercentage, newPlanningPercentage);
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
                msgs = ((InternalEObject)planningPercentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__PLANNING_PERCENTAGE, null, msgs);
            if (newPlanningPercentage != null)
                msgs = ((InternalEObject)newPlanningPercentage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__PLANNING_PERCENTAGE, null, msgs);
            msgs = basicSetPlanningPercentage(newPlanningPercentage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__PLANNING_PERCENTAGE, newPlanningPercentage, newPlanningPercentage));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__BATCH_SIZE, oldBatchSize, newBatchSize);
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
                msgs = ((InternalEObject)batchSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__BATCH_SIZE, null, msgs);
            if (newBatchSize != null)
                msgs = ((InternalEObject)newBatchSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__BATCH_SIZE, null, msgs);
            msgs = basicSetBatchSize(newBatchSize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__BATCH_SIZE, newBatchSize, newBatchSize));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__OFFSET, oldOffset, newOffset);
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
                msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__OFFSET, null, msgs);
            if (newOffset != null)
                msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__OFFSET, null, msgs);
            msgs = basicSetOffset(newOffset, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__OFFSET, newOffset, newOffset));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__CONDITION, oldCondition, newCondition);
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
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PORT__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__CONDITION, newCondition, newCondition));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.PORT__HANDLER, oldHandler, handler));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__HANDLER, oldHandler, newHandler);
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
                msgs = ((InternalEObject)handler).eInverseRemove(this, VdmlPackage.ROLE__PORT, Role.class, msgs);
            if (newHandler != null)
                msgs = ((InternalEObject)newHandler).eInverseAdd(this, VdmlPackage.ROLE__PORT, Role.class, msgs);
            msgs = basicSetHandler(newHandler, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PORT__HANDLER, newHandler, newHandler));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.PORT__HANDLER:
                if (handler != null)
                    msgs = ((InternalEObject)handler).eInverseRemove(this, VdmlPackage.ROLE__PORT, Role.class, msgs);
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
            case VdmlPackage.PORT__PLANNING_PERCENTAGE:
                return basicSetPlanningPercentage(null, msgs);
            case VdmlPackage.PORT__BATCH_SIZE:
                return basicSetBatchSize(null, msgs);
            case VdmlPackage.PORT__OFFSET:
                return basicSetOffset(null, msgs);
            case VdmlPackage.PORT__CONDITION:
                return basicSetCondition(null, msgs);
            case VdmlPackage.PORT__HANDLER:
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
            case VdmlPackage.PORT__IS_INTERMEDIATE:
                return isIntermediate();
            case VdmlPackage.PORT__PLANNING_PERCENTAGE:
                return getPlanningPercentage();
            case VdmlPackage.PORT__BATCH_SIZE:
                return getBatchSize();
            case VdmlPackage.PORT__OFFSET:
                return getOffset();
            case VdmlPackage.PORT__CONDITION:
                return getCondition();
            case VdmlPackage.PORT__HANDLER:
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
            case VdmlPackage.PORT__IS_INTERMEDIATE:
                setIsIntermediate((Boolean)newValue);
                return;
            case VdmlPackage.PORT__PLANNING_PERCENTAGE:
                setPlanningPercentage((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.PORT__BATCH_SIZE:
                setBatchSize((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.PORT__OFFSET:
                setOffset((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.PORT__CONDITION:
                setCondition((Expression)newValue);
                return;
            case VdmlPackage.PORT__HANDLER:
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
            case VdmlPackage.PORT__IS_INTERMEDIATE:
                setIsIntermediate(IS_INTERMEDIATE_EDEFAULT);
                return;
            case VdmlPackage.PORT__PLANNING_PERCENTAGE:
                setPlanningPercentage((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.PORT__BATCH_SIZE:
                setBatchSize((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.PORT__OFFSET:
                setOffset((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.PORT__CONDITION:
                setCondition((Expression)null);
                return;
            case VdmlPackage.PORT__HANDLER:
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
            case VdmlPackage.PORT__IS_INTERMEDIATE:
                return isIntermediate != IS_INTERMEDIATE_EDEFAULT;
            case VdmlPackage.PORT__PLANNING_PERCENTAGE:
                return planningPercentage != null;
            case VdmlPackage.PORT__BATCH_SIZE:
                return batchSize != null;
            case VdmlPackage.PORT__OFFSET:
                return offset != null;
            case VdmlPackage.PORT__CONDITION:
                return condition != null;
            case VdmlPackage.PORT__HANDLER:
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
