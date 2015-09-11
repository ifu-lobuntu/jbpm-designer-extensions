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
 * An implementation of the model object '<em><b>TCase File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TCaseFileImpl#getCaseFileItem <em>Case File Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCaseFileImpl extends TCmmnElementImpl implements TCaseFile {
    /**
     * The cached value of the '{@link #getCaseFileItem() <em>Case File Item</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCaseFileItem()
     * @generated
     * @ordered
     */
    protected EList<TCaseFileItem> caseFileItem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TCaseFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TCASE_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TCaseFileItem> getCaseFileItem() {
        if (caseFileItem == null) {
            caseFileItem = new EObjectContainmentEList<TCaseFileItem>(TCaseFileItem.class, this, CMMNPackage.TCASE_FILE__CASE_FILE_ITEM);
        }
        return caseFileItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TCASE_FILE__CASE_FILE_ITEM:
                return ((InternalEList<?>)getCaseFileItem()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.TCASE_FILE__CASE_FILE_ITEM:
                return getCaseFileItem();
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
            case CMMNPackage.TCASE_FILE__CASE_FILE_ITEM:
                getCaseFileItem().clear();
                getCaseFileItem().addAll((Collection<? extends TCaseFileItem>)newValue);
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
            case CMMNPackage.TCASE_FILE__CASE_FILE_ITEM:
                getCaseFileItem().clear();
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
            case CMMNPackage.TCASE_FILE__CASE_FILE_ITEM:
                return caseFileItem != null && !caseFileItem.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TCaseFileImpl
