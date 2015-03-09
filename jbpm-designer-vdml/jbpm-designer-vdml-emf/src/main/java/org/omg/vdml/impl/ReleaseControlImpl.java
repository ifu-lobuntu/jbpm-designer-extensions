/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.ReleaseControl;
import org.omg.vdml.Scenario;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ReleaseControlImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ReleaseControlImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReleaseControlImpl extends VdmlElementImpl implements ReleaseControl {
    /**
     * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrategy()
     * @generated
     * @ordered
     */
    protected static final String STRATEGY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrategy()
     * @generated
     * @ordered
     */
    protected String strategy = STRATEGY_EDEFAULT;

    /**
     * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenario()
     * @generated
     * @ordered
     */
    protected EList<Scenario> scenario;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReleaseControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.RELEASE_CONTROL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrategy(String newStrategy) {
        String oldStrategy = strategy;
        strategy = newStrategy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.RELEASE_CONTROL__STRATEGY, oldStrategy, strategy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Scenario> getScenario() {
        if (scenario == null) {
            scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this, VDMLPackage.RELEASE_CONTROL__SCENARIO, VDMLPackage.SCENARIO__RELEASE_CONTROL);
        }
        return scenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLPackage.RELEASE_CONTROL__SCENARIO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenario()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLPackage.RELEASE_CONTROL__SCENARIO:
                return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
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
            case VDMLPackage.RELEASE_CONTROL__STRATEGY:
                return getStrategy();
            case VDMLPackage.RELEASE_CONTROL__SCENARIO:
                return getScenario();
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
            case VDMLPackage.RELEASE_CONTROL__STRATEGY:
                setStrategy((String)newValue);
                return;
            case VDMLPackage.RELEASE_CONTROL__SCENARIO:
                getScenario().clear();
                getScenario().addAll((Collection<? extends Scenario>)newValue);
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
            case VDMLPackage.RELEASE_CONTROL__STRATEGY:
                setStrategy(STRATEGY_EDEFAULT);
                return;
            case VDMLPackage.RELEASE_CONTROL__SCENARIO:
                getScenario().clear();
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
            case VDMLPackage.RELEASE_CONTROL__STRATEGY:
                return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
            case VDMLPackage.RELEASE_CONTROL__SCENARIO:
                return scenario != null && !scenario.isEmpty();
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
        result.append(" (strategy: ");
        result.append(strategy);
        result.append(')');
        return result.toString();
    }

} //ReleaseControlImpl
