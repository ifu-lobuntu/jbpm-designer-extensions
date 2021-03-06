/**
 */
package org.omg.cmmn.impl;
import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.util.*;
import org.jbpm.cmmn.dd.cmmndi.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.*;
import org.omg.dd.di.impl.*;
import org.omg.dd.di.*;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>THuman Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.THumanTaskImpl#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.THumanTaskImpl#getPerformerRef <em>Performer Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class THumanTaskImpl extends TTaskImpl implements THumanTask {
    /**
     * The cached value of the '{@link #getPlanningTable() <em>Planning Table</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlanningTable()
     * @generated
     * @ordered
     */
    protected EList<TPlanningTable> planningTable;

    /**
     * The cached value of the '{@link #getPerformerRef() <em>Performer Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerformerRef()
     * @generated
     * @ordered
     */
    protected TRole performerRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected THumanTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.THUMAN_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TPlanningTable> getPlanningTable() {
        if (planningTable == null) {
            planningTable = new EObjectContainmentEList<TPlanningTable>(TPlanningTable.class, this, CMMNPackage.THUMAN_TASK__PLANNING_TABLE);
        }
        return planningTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRole getPerformerRef() {
        return performerRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPerformerRef(TRole newPerformerRef) {
        TRole oldPerformerRef = performerRef;
        performerRef = newPerformerRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.THUMAN_TASK__PERFORMER_REF, oldPerformerRef, performerRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.THUMAN_TASK__PLANNING_TABLE:
                return ((InternalEList<?>)getPlanningTable()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.THUMAN_TASK__PLANNING_TABLE:
                return getPlanningTable();
            case CMMNPackage.THUMAN_TASK__PERFORMER_REF:
                return getPerformerRef();
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
            case CMMNPackage.THUMAN_TASK__PLANNING_TABLE:
                getPlanningTable().clear();
                getPlanningTable().addAll((Collection<? extends TPlanningTable>)newValue);
                return;
            case CMMNPackage.THUMAN_TASK__PERFORMER_REF:
                setPerformerRef((TRole)newValue);
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
            case CMMNPackage.THUMAN_TASK__PLANNING_TABLE:
                getPlanningTable().clear();
                return;
            case CMMNPackage.THUMAN_TASK__PERFORMER_REF:
                setPerformerRef((TRole)null);
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
            case CMMNPackage.THUMAN_TASK__PLANNING_TABLE:
                return planningTable != null && !planningTable.isEmpty();
            case CMMNPackage.THUMAN_TASK__PERFORMER_REF:
                return performerRef != null;
        }
        return super.eIsSet(featureID);
    }

} //THumanTaskImpl
