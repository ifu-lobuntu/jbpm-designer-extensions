/**
 */
package org.omg.cmmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.TIfPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TIf Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TIfPartImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TIfPartImpl#getContextRef <em>Context Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TIfPartImpl extends TCmmnElementImpl implements TIfPart {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected EList<TExpression> condition;

    /**
     * The cached value of the '{@link #getContextRef() <em>Context Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextRef()
     * @generated
     * @ordered
     */
    protected TCaseFileItem contextRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TIfPartImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TIF_PART;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TExpression> getCondition() {
        if (condition == null) {
            condition = new EObjectContainmentEList<TExpression>(TExpression.class, this, CMMNPackage.TIF_PART__CONDITION);
        }
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItem getContextRef() {
        if (contextRef != null && contextRef.eIsProxy()) {
            InternalEObject oldContextRef = (InternalEObject)contextRef;
            contextRef = (TCaseFileItem)eResolveProxy(oldContextRef);
            if (contextRef != oldContextRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNPackage.TIF_PART__CONTEXT_REF, oldContextRef, contextRef));
            }
        }
        return contextRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItem basicGetContextRef() {
        return contextRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextRef(TCaseFileItem newContextRef) {
        TCaseFileItem oldContextRef = contextRef;
        contextRef = newContextRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TIF_PART__CONTEXT_REF, oldContextRef, contextRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TIF_PART__CONDITION:
                return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.TIF_PART__CONDITION:
                return getCondition();
            case CMMNPackage.TIF_PART__CONTEXT_REF:
                if (resolve) return getContextRef();
                return basicGetContextRef();
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
            case CMMNPackage.TIF_PART__CONDITION:
                getCondition().clear();
                getCondition().addAll((Collection<? extends TExpression>)newValue);
                return;
            case CMMNPackage.TIF_PART__CONTEXT_REF:
                setContextRef((TCaseFileItem)newValue);
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
            case CMMNPackage.TIF_PART__CONDITION:
                getCondition().clear();
                return;
            case CMMNPackage.TIF_PART__CONTEXT_REF:
                setContextRef((TCaseFileItem)null);
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
            case CMMNPackage.TIF_PART__CONDITION:
                return condition != null && !condition.isEmpty();
            case CMMNPackage.TIF_PART__CONTEXT_REF:
                return contextRef != null;
        }
        return super.eIsSet(featureID);
    }

} //TIfPartImpl
