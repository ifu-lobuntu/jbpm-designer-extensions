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
 * An implementation of the model object '<em><b>TPlan Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TPlanFragmentImpl#getPlanItem <em>Plan Item</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanFragmentImpl#getSentry <em>Sentry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPlanFragmentImpl extends TPlanItemDefinitionImpl implements TPlanFragment {
    /**
     * The cached value of the '{@link #getPlanItem() <em>Plan Item</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlanItem()
     * @generated
     * @ordered
     */
    protected EList<TPlanItem> planItem;

    /**
     * The cached value of the '{@link #getSentry() <em>Sentry</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSentry()
     * @generated
     * @ordered
     */
    protected EList<TSentry> sentry;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TPlanFragmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPLAN_FRAGMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TPlanItem> getPlanItem() {
        if (planItem == null) {
            planItem = new EObjectContainmentEList<TPlanItem>(TPlanItem.class, this, CMMNPackage.TPLAN_FRAGMENT__PLAN_ITEM);
        }
        return planItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TSentry> getSentry() {
        if (sentry == null) {
            sentry = new EObjectContainmentEList<TSentry>(TSentry.class, this, CMMNPackage.TPLAN_FRAGMENT__SENTRY);
        }
        return sentry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPLAN_FRAGMENT__PLAN_ITEM:
                return ((InternalEList<?>)getPlanItem()).basicRemove(otherEnd, msgs);
            case CMMNPackage.TPLAN_FRAGMENT__SENTRY:
                return ((InternalEList<?>)getSentry()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.TPLAN_FRAGMENT__PLAN_ITEM:
                return getPlanItem();
            case CMMNPackage.TPLAN_FRAGMENT__SENTRY:
                return getSentry();
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
            case CMMNPackage.TPLAN_FRAGMENT__PLAN_ITEM:
                getPlanItem().clear();
                getPlanItem().addAll((Collection<? extends TPlanItem>)newValue);
                return;
            case CMMNPackage.TPLAN_FRAGMENT__SENTRY:
                getSentry().clear();
                getSentry().addAll((Collection<? extends TSentry>)newValue);
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
            case CMMNPackage.TPLAN_FRAGMENT__PLAN_ITEM:
                getPlanItem().clear();
                return;
            case CMMNPackage.TPLAN_FRAGMENT__SENTRY:
                getSentry().clear();
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
            case CMMNPackage.TPLAN_FRAGMENT__PLAN_ITEM:
                return planItem != null && !planItem.isEmpty();
            case CMMNPackage.TPLAN_FRAGMENT__SENTRY:
                return sentry != null && !sentry.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TPlanFragmentImpl
