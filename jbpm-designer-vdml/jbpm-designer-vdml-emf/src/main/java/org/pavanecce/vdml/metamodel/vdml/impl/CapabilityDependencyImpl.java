/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDependency;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl#isTangible <em>Is Tangible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl#getDeliverableDefinition <em>Deliverable Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl#isFromExternalSource <em>Is From External Source</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl#isForExternalTarget <em>Is For External Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityDependencyImpl extends VdmlElementImpl implements CapabilityDependency {
    /**
     * The default value of the '{@link #isTangible() <em>Is Tangible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTangible()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TANGIBLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isTangible() <em>Is Tangible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTangible()
     * @generated
     * @ordered
     */
    protected boolean isTangible = IS_TANGIBLE_EDEFAULT;

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
     * The default value of the '{@link #isFromExternalSource() <em>Is From External Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFromExternalSource()
     * @generated
     * @ordered
     */
    protected static final boolean IS_FROM_EXTERNAL_SOURCE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isFromExternalSource() <em>Is From External Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFromExternalSource()
     * @generated
     * @ordered
     */
    protected boolean isFromExternalSource = IS_FROM_EXTERNAL_SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #isForExternalTarget() <em>Is For External Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isForExternalTarget()
     * @generated
     * @ordered
     */
    protected static final boolean IS_FOR_EXTERNAL_TARGET_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isForExternalTarget() <em>Is For External Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isForExternalTarget()
     * @generated
     * @ordered
     */
    protected boolean isForExternalTarget = IS_FOR_EXTERNAL_TARGET_EDEFAULT;

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
        return VdmlPackage.Literals.CAPABILITY_DEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTangible() {
        return isTangible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsTangible(boolean newIsTangible) {
        boolean oldIsTangible = isTangible;
        isTangible = newIsTangible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE, oldIsTangible, isTangible));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION, oldDeliverableDefinition, deliverableDefinition));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION, oldDeliverableDefinition, newDeliverableDefinition);
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
                msgs = ((InternalEObject)deliverableDefinition).eInverseRemove(this, VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, BusinessItemDefinition.class, msgs);
            if (newDeliverableDefinition != null)
                msgs = ((InternalEObject)newDeliverableDefinition).eInverseAdd(this, VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, BusinessItemDefinition.class, msgs);
            msgs = basicSetDeliverableDefinition(newDeliverableDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION, newDeliverableDefinition, newDeliverableDefinition));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE, oldSource, source));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE, oldSource, newSource);
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
                msgs = ((InternalEObject)source).eInverseRemove(this, VdmlPackage.CAPABILITY_DEFINITION__OUTPUT, CapabilityDefinition.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, VdmlPackage.CAPABILITY_DEFINITION__OUTPUT, CapabilityDefinition.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE, newSource, newSource));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.CAPABILITY_DEPENDENCY__TARGET, oldTarget, target));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__TARGET, oldTarget, newTarget);
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
                msgs = ((InternalEObject)target).eInverseRemove(this, VdmlPackage.CAPABILITY_DEFINITION__INPUT, CapabilityDefinition.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, VdmlPackage.CAPABILITY_DEFINITION__INPUT, CapabilityDefinition.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFromExternalSource() {
        return isFromExternalSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsFromExternalSource(boolean newIsFromExternalSource) {
        boolean oldIsFromExternalSource = isFromExternalSource;
        isFromExternalSource = newIsFromExternalSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE, oldIsFromExternalSource, isFromExternalSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isForExternalTarget() {
        return isForExternalTarget;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsForExternalTarget(boolean newIsForExternalTarget) {
        boolean oldIsForExternalTarget = isForExternalTarget;
        isForExternalTarget = newIsForExternalTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET, oldIsForExternalTarget, isForExternalTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
                if (deliverableDefinition != null)
                    msgs = ((InternalEObject)deliverableDefinition).eInverseRemove(this, VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, BusinessItemDefinition.class, msgs);
                return basicSetDeliverableDefinition((BusinessItemDefinition)otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, VdmlPackage.CAPABILITY_DEFINITION__OUTPUT, CapabilityDefinition.class, msgs);
                return basicSetSource((CapabilityDefinition)otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEPENDENCY__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, VdmlPackage.CAPABILITY_DEFINITION__INPUT, CapabilityDefinition.class, msgs);
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
            case VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
                return basicSetDeliverableDefinition(null, msgs);
            case VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE:
                return basicSetSource(null, msgs);
            case VdmlPackage.CAPABILITY_DEPENDENCY__TARGET:
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
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
                return isTangible();
            case VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
                if (resolve) return getDeliverableDefinition();
                return basicGetDeliverableDefinition();
            case VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case VdmlPackage.CAPABILITY_DEPENDENCY__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
                return isFromExternalSource();
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
                return isForExternalTarget();
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
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
                setIsTangible((Boolean)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
                setDeliverableDefinition((BusinessItemDefinition)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE:
                setSource((CapabilityDefinition)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__TARGET:
                setTarget((CapabilityDefinition)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
                setIsFromExternalSource((Boolean)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
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
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
                setIsTangible(IS_TANGIBLE_EDEFAULT);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
                setDeliverableDefinition((BusinessItemDefinition)null);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE:
                setSource((CapabilityDefinition)null);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__TARGET:
                setTarget((CapabilityDefinition)null);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
                setIsFromExternalSource(IS_FROM_EXTERNAL_SOURCE_EDEFAULT);
                return;
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
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
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_TANGIBLE:
                return isTangible != IS_TANGIBLE_EDEFAULT;
            case VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION:
                return deliverableDefinition != null;
            case VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE:
                return source != null;
            case VdmlPackage.CAPABILITY_DEPENDENCY__TARGET:
                return target != null;
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE:
                return isFromExternalSource != IS_FROM_EXTERNAL_SOURCE_EDEFAULT;
            case VdmlPackage.CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET:
                return isForExternalTarget != IS_FOR_EXTERNAL_TARGET_EDEFAULT;
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
