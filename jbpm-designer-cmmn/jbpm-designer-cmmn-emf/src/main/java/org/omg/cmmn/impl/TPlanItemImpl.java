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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemDefinition;
import org.omg.cmmn.TSentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemImpl#getItemControl <em>Item Control</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemImpl#getEntryCriteriaRefs <em>Entry Criteria Refs</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemImpl#getExitCriteriaRefs <em>Exit Criteria Refs</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPlanItemImpl extends TCmmnElementImpl implements TPlanItem {
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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TPlanItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPLAN_ITEM;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM__ITEM_CONTROL, oldItemControl, newItemControl);
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
                msgs = ((InternalEObject)itemControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM__ITEM_CONTROL, null, msgs);
            if (newItemControl != null)
                msgs = ((InternalEObject)newItemControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM__ITEM_CONTROL, null, msgs);
            msgs = basicSetItemControl(newItemControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM__ITEM_CONTROL, newItemControl, newItemControl));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM__DEFINITION_REF, oldDefinitionRef, definitionRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TSentry> getEntryCriteriaRefs() {
        if (entryCriteriaRefs == null) {
            entryCriteriaRefs = new EObjectResolvingEList<TSentry>(TSentry.class, this, CMMNPackage.TPLAN_ITEM__ENTRY_CRITERIA_REFS);
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
            exitCriteriaRefs = new EObjectResolvingEList<TSentry>(TSentry.class, this, CMMNPackage.TPLAN_ITEM__EXIT_CRITERIA_REFS);
        }
        return exitCriteriaRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM__ITEM_CONTROL:
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
            case CMMNPackage.TPLAN_ITEM__ITEM_CONTROL:
                return getItemControl();
            case CMMNPackage.TPLAN_ITEM__DEFINITION_REF:
                return getDefinitionRef();
            case CMMNPackage.TPLAN_ITEM__ENTRY_CRITERIA_REFS:
                return getEntryCriteriaRefs();
            case CMMNPackage.TPLAN_ITEM__EXIT_CRITERIA_REFS:
                return getExitCriteriaRefs();
            case CMMNPackage.TPLAN_ITEM__NAME:
                return getName();
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
            case CMMNPackage.TPLAN_ITEM__ITEM_CONTROL:
                setItemControl((TPlanItemControl)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM__DEFINITION_REF:
                setDefinitionRef((TPlanItemDefinition)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM__ENTRY_CRITERIA_REFS:
                getEntryCriteriaRefs().clear();
                getEntryCriteriaRefs().addAll((Collection<? extends TSentry>)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM__EXIT_CRITERIA_REFS:
                getExitCriteriaRefs().clear();
                getExitCriteriaRefs().addAll((Collection<? extends TSentry>)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM__NAME:
                setName((String)newValue);
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
            case CMMNPackage.TPLAN_ITEM__ITEM_CONTROL:
                setItemControl((TPlanItemControl)null);
                return;
            case CMMNPackage.TPLAN_ITEM__DEFINITION_REF:
                setDefinitionRef((TPlanItemDefinition)null);
                return;
            case CMMNPackage.TPLAN_ITEM__ENTRY_CRITERIA_REFS:
                getEntryCriteriaRefs().clear();
                return;
            case CMMNPackage.TPLAN_ITEM__EXIT_CRITERIA_REFS:
                getExitCriteriaRefs().clear();
                return;
            case CMMNPackage.TPLAN_ITEM__NAME:
                setName(NAME_EDEFAULT);
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
            case CMMNPackage.TPLAN_ITEM__ITEM_CONTROL:
                return itemControl != null;
            case CMMNPackage.TPLAN_ITEM__DEFINITION_REF:
                return definitionRef != null;
            case CMMNPackage.TPLAN_ITEM__ENTRY_CRITERIA_REFS:
                return entryCriteriaRefs != null && !entryCriteriaRefs.isEmpty();
            case CMMNPackage.TPLAN_ITEM__EXIT_CRITERIA_REFS:
                return exitCriteriaRefs != null && !exitCriteriaRefs.isEmpty();
            case CMMNPackage.TPLAN_ITEM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //TPlanItemImpl
