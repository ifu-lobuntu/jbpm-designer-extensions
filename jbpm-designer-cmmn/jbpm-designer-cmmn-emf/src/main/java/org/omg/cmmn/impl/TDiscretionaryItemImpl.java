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
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemDefinition;
import org.omg.cmmn.TSentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDiscretionary Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TDiscretionaryItemImpl#getItemControl <em>Item Control</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TDiscretionaryItemImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TDiscretionaryItemImpl#getEntryCriteriaRefs <em>Entry Criteria Refs</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TDiscretionaryItemImpl#getExitCriteriaRefs <em>Exit Criteria Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDiscretionaryItemImpl extends TTableItemImpl implements TDiscretionaryItem {
    /**
     * The cached value of the '{@link #getItemControl() <em>Item Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemControl()
     * @generated
     * @ordered
     */
    protected TPlanItemControl itemControl;

    /**
     * The cached value of the '{@link #getDefinitionRef() <em>Definition Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinitionRef()
     * @generated
     * @ordered
     */
    protected TPlanItemDefinition definitionRef;

    /**
     * The cached value of the '{@link #getEntryCriteriaRefs() <em>Entry Criteria Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntryCriteriaRefs()
     * @generated
     * @ordered
     */
    protected EList<TSentry> entryCriteriaRefs;

    /**
     * The cached value of the '{@link #getExitCriteriaRefs() <em>Exit Criteria Refs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExitCriteriaRefs()
     * @generated
     * @ordered
     */
    protected EList<TSentry> exitCriteriaRefs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDiscretionaryItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TDISCRETIONARY_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItemControl getItemControl() {
        return itemControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetItemControl(TPlanItemControl newItemControl, NotificationChain msgs) {
        TPlanItemControl oldItemControl = itemControl;
        itemControl = newItemControl;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL, oldItemControl, newItemControl);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemControl(TPlanItemControl newItemControl) {
        if (newItemControl != itemControl) {
            NotificationChain msgs = null;
            if (itemControl != null)
                msgs = ((InternalEObject)itemControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL, null, msgs);
            if (newItemControl != null)
                msgs = ((InternalEObject)newItemControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL, null, msgs);
            msgs = basicSetItemControl(newItemControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL, newItemControl, newItemControl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItemDefinition getDefinitionRef() {
        return definitionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinitionRef(TPlanItemDefinition newDefinitionRef) {
        TPlanItemDefinition oldDefinitionRef = definitionRef;
        definitionRef = newDefinitionRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TDISCRETIONARY_ITEM__DEFINITION_REF, oldDefinitionRef, definitionRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TSentry> getEntryCriteriaRefs() {
        if (entryCriteriaRefs == null) {
            entryCriteriaRefs = new EObjectEList<TSentry>(TSentry.class, this, CMMNPackage.TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS);
        }
        return entryCriteriaRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TSentry> getExitCriteriaRefs() {
        if (exitCriteriaRefs == null) {
            exitCriteriaRefs = new EObjectEList<TSentry>(TSentry.class, this, CMMNPackage.TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS);
        }
        return exitCriteriaRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL:
                return basicSetItemControl(null, msgs);
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
            case CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL:
                return getItemControl();
            case CMMNPackage.TDISCRETIONARY_ITEM__DEFINITION_REF:
                return getDefinitionRef();
            case CMMNPackage.TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS:
                return getEntryCriteriaRefs();
            case CMMNPackage.TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS:
                return getExitCriteriaRefs();
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
            case CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL:
                setItemControl((TPlanItemControl)newValue);
                return;
            case CMMNPackage.TDISCRETIONARY_ITEM__DEFINITION_REF:
                setDefinitionRef((TPlanItemDefinition)newValue);
                return;
            case CMMNPackage.TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS:
                getEntryCriteriaRefs().clear();
                getEntryCriteriaRefs().addAll((Collection<? extends TSentry>)newValue);
                return;
            case CMMNPackage.TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS:
                getExitCriteriaRefs().clear();
                getExitCriteriaRefs().addAll((Collection<? extends TSentry>)newValue);
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
            case CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL:
                setItemControl((TPlanItemControl)null);
                return;
            case CMMNPackage.TDISCRETIONARY_ITEM__DEFINITION_REF:
                setDefinitionRef((TPlanItemDefinition)null);
                return;
            case CMMNPackage.TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS:
                getEntryCriteriaRefs().clear();
                return;
            case CMMNPackage.TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS:
                getExitCriteriaRefs().clear();
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
            case CMMNPackage.TDISCRETIONARY_ITEM__ITEM_CONTROL:
                return itemControl != null;
            case CMMNPackage.TDISCRETIONARY_ITEM__DEFINITION_REF:
                return definitionRef != null;
            case CMMNPackage.TDISCRETIONARY_ITEM__ENTRY_CRITERIA_REFS:
                return entryCriteriaRefs != null && !entryCriteriaRefs.isEmpty();
            case CMMNPackage.TDISCRETIONARY_ITEM__EXIT_CRITERIA_REFS:
                return exitCriteriaRefs != null && !exitCriteriaRefs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TDiscretionaryItemImpl
