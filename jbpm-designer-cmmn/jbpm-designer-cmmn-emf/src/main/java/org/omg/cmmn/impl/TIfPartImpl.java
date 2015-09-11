/**
 */
package org.omg.cmmn.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.emf.ecore.xmi.impl.*;
import org.jbpm.cmmn.dd.cmmndi.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.*;
import org.omg.dd.di.impl.*;
import org.omg.dd.di.*;
import org.xml.sax.helpers.DefaultHandler;

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
                return getContextRef();
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
