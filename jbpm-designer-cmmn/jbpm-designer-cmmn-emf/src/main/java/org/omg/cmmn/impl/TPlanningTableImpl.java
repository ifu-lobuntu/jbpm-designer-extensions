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
 * An implementation of the model object '<em><b>TPlanning Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TPlanningTableImpl#getTableItemGroup <em>Table Item Group</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanningTableImpl#getTableItem <em>Table Item</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanningTableImpl#getApplicabilityRule <em>Applicability Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPlanningTableImpl extends TTableItemImpl implements TPlanningTable {
    /**
     * The cached value of the '{@link #getTableItemGroup() <em>Table Item Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTableItemGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap tableItemGroup;

    /**
     * The cached value of the '{@link #getApplicabilityRule() <em>Applicability Rule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplicabilityRule()
     * @generated
     * @ordered
     */
    protected EList<TApplicabilityRule> applicabilityRule;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TPlanningTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPLANNING_TABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getTableItemGroup() {
        if (tableItemGroup == null) {
            tableItemGroup = new BasicFeatureMap(this, CMMNPackage.TPLANNING_TABLE__TABLE_ITEM_GROUP);
        }
        return tableItemGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TTableItem> getTableItem() {
        return getTableItemGroup().list(CMMNPackage.Literals.TPLANNING_TABLE__TABLE_ITEM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TApplicabilityRule> getApplicabilityRule() {
        if (applicabilityRule == null) {
            applicabilityRule = new EObjectContainmentEList<TApplicabilityRule>(TApplicabilityRule.class, this, CMMNPackage.TPLANNING_TABLE__APPLICABILITY_RULE);
        }
        return applicabilityRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM_GROUP:
                return ((InternalEList<?>)getTableItemGroup()).basicRemove(otherEnd, msgs);
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM:
                return ((InternalEList<?>)getTableItem()).basicRemove(otherEnd, msgs);
            case CMMNPackage.TPLANNING_TABLE__APPLICABILITY_RULE:
                return ((InternalEList<?>)getApplicabilityRule()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM_GROUP:
                if (coreType) return getTableItemGroup();
                return ((FeatureMap.Internal)getTableItemGroup()).getWrapper();
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM:
                return getTableItem();
            case CMMNPackage.TPLANNING_TABLE__APPLICABILITY_RULE:
                return getApplicabilityRule();
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
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM_GROUP:
                ((FeatureMap.Internal)getTableItemGroup()).set(newValue);
                return;
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM:
                getTableItem().clear();
                getTableItem().addAll((Collection<? extends TTableItem>)newValue);
                return;
            case CMMNPackage.TPLANNING_TABLE__APPLICABILITY_RULE:
                getApplicabilityRule().clear();
                getApplicabilityRule().addAll((Collection<? extends TApplicabilityRule>)newValue);
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
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM_GROUP:
                getTableItemGroup().clear();
                return;
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM:
                getTableItem().clear();
                return;
            case CMMNPackage.TPLANNING_TABLE__APPLICABILITY_RULE:
                getApplicabilityRule().clear();
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
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM_GROUP:
                return tableItemGroup != null && !tableItemGroup.isEmpty();
            case CMMNPackage.TPLANNING_TABLE__TABLE_ITEM:
                return !getTableItem().isEmpty();
            case CMMNPackage.TPLANNING_TABLE__APPLICABILITY_RULE:
                return applicabilityRule != null && !applicabilityRule.isEmpty();
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
        result.append(" (tableItemGroup: ");
        result.append(tableItemGroup);
        result.append(')');
        return result.toString();
    }

} //TPlanningTableImpl
