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
import org.omg.cmmn.TProcess;
import org.omg.cmmn.TProcessParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TProcess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TProcessImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TProcessImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TProcessImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TProcessImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TProcessImpl extends TCmmnElementImpl implements TProcess {
    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected EList<TProcessParameter> input;

    /**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected EList<TProcessParameter> output;

    /**
     * The default value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementationType()
     * @generated
     * @ordered
     */
    protected static final String IMPLEMENTATION_TYPE_EDEFAULT = "http://www.omg.org/spec/CMMN/ProcessType/Unspecified";

    /**
     * The cached value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementationType()
     * @generated
     * @ordered
     */
    protected String implementationType = IMPLEMENTATION_TYPE_EDEFAULT;

    /**
     * This is true if the Implementation Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean implementationTypeESet;

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
    protected TProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPROCESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TProcessParameter> getInput() {
        if (input == null) {
            input = new EObjectContainmentEList<TProcessParameter>(TProcessParameter.class, this, CMMNPackage.TPROCESS__INPUT);
        }
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TProcessParameter> getOutput() {
        if (output == null) {
            output = new EObjectContainmentEList<TProcessParameter>(TProcessParameter.class, this, CMMNPackage.TPROCESS__OUTPUT);
        }
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImplementationType() {
        return implementationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplementationType(String newImplementationType) {
        String oldImplementationType = implementationType;
        implementationType = newImplementationType;
        boolean oldImplementationTypeESet = implementationTypeESet;
        implementationTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPROCESS__IMPLEMENTATION_TYPE, oldImplementationType, implementationType, !oldImplementationTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetImplementationType() {
        String oldImplementationType = implementationType;
        boolean oldImplementationTypeESet = implementationTypeESet;
        implementationType = IMPLEMENTATION_TYPE_EDEFAULT;
        implementationTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CMMNPackage.TPROCESS__IMPLEMENTATION_TYPE, oldImplementationType, IMPLEMENTATION_TYPE_EDEFAULT, oldImplementationTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetImplementationType() {
        return implementationTypeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPROCESS__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPROCESS__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
            case CMMNPackage.TPROCESS__OUTPUT:
                return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.TPROCESS__INPUT:
                return getInput();
            case CMMNPackage.TPROCESS__OUTPUT:
                return getOutput();
            case CMMNPackage.TPROCESS__IMPLEMENTATION_TYPE:
                return getImplementationType();
            case CMMNPackage.TPROCESS__NAME:
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
            case CMMNPackage.TPROCESS__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends TProcessParameter>)newValue);
                return;
            case CMMNPackage.TPROCESS__OUTPUT:
                getOutput().clear();
                getOutput().addAll((Collection<? extends TProcessParameter>)newValue);
                return;
            case CMMNPackage.TPROCESS__IMPLEMENTATION_TYPE:
                setImplementationType((String)newValue);
                return;
            case CMMNPackage.TPROCESS__NAME:
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
            case CMMNPackage.TPROCESS__INPUT:
                getInput().clear();
                return;
            case CMMNPackage.TPROCESS__OUTPUT:
                getOutput().clear();
                return;
            case CMMNPackage.TPROCESS__IMPLEMENTATION_TYPE:
                unsetImplementationType();
                return;
            case CMMNPackage.TPROCESS__NAME:
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
            case CMMNPackage.TPROCESS__INPUT:
                return input != null && !input.isEmpty();
            case CMMNPackage.TPROCESS__OUTPUT:
                return output != null && !output.isEmpty();
            case CMMNPackage.TPROCESS__IMPLEMENTATION_TYPE:
                return isSetImplementationType();
            case CMMNPackage.TPROCESS__NAME:
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
        result.append(" (implementationType: ");
        if (implementationTypeESet) result.append(implementationType); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //TProcessImpl
