/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemDefinitionImpl#getDefaultControl <em>Default Control</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TPlanItemDefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TPlanItemDefinitionImpl extends TCmmnElementImpl implements TPlanItemDefinition {
    /**
     * The cached value of the '{@link #getDefaultControl() <em>Default Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultControl()
     * @generated
     * @ordered
     */
    protected TPlanItemControl defaultControl;

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
    protected TPlanItemDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPLAN_ITEM_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TPlanItemControl getDefaultControl() {
        return defaultControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultControl(TPlanItemControl newDefaultControl, NotificationChain msgs) {
        TPlanItemControl oldDefaultControl = defaultControl;
        defaultControl = newDefaultControl;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL, oldDefaultControl, newDefaultControl);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultControl(TPlanItemControl newDefaultControl) {
        if (newDefaultControl != defaultControl) {
            NotificationChain msgs = null;
            if (defaultControl != null)
                msgs = ((InternalEObject)defaultControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL, null, msgs);
            if (newDefaultControl != null)
                msgs = ((InternalEObject)newDefaultControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL, null, msgs);
            msgs = basicSetDefaultControl(newDefaultControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL, newDefaultControl, newDefaultControl));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPLAN_ITEM_DEFINITION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL:
                return basicSetDefaultControl(null, msgs);
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
            case CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL:
                return getDefaultControl();
            case CMMNPackage.TPLAN_ITEM_DEFINITION__NAME:
                return getName();
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
            case CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL:
                setDefaultControl((TPlanItemControl)newValue);
                return;
            case CMMNPackage.TPLAN_ITEM_DEFINITION__NAME:
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
            case CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL:
                setDefaultControl((TPlanItemControl)null);
                return;
            case CMMNPackage.TPLAN_ITEM_DEFINITION__NAME:
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
            case CMMNPackage.TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL:
                return defaultControl != null;
            case CMMNPackage.TPLAN_ITEM_DEFINITION__NAME:
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

} //TPlanItemDefinitionImpl
