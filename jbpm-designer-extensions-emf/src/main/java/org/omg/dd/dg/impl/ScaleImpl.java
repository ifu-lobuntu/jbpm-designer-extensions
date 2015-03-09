/**
 */
package org.omg.dd.dg.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Scale;
import org.omg.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.ScaleImpl#getFactorX <em>Factor X</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.ScaleImpl#getFactorY <em>Factor Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaleImpl extends TransformImpl implements Scale {
    /**
     * The default value of the '{@link #getFactorX() <em>Factor X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactorX()
     * @generated
     * @ordered
     */
    protected static final Double FACTOR_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFactorX() <em>Factor X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactorX()
     * @generated
     * @ordered
     */
    protected Double factorX = FACTOR_X_EDEFAULT;

    /**
     * The default value of the '{@link #getFactorY() <em>Factor Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactorY()
     * @generated
     * @ordered
     */
    protected static final Double FACTOR_Y_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFactorY() <em>Factor Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactorY()
     * @generated
     * @ordered
     */
    protected Double factorY = FACTOR_Y_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScaleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.SCALE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getFactorX() {
        return factorX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFactorX(Double newFactorX) {
        Double oldFactorX = factorX;
        factorX = newFactorX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.SCALE__FACTOR_X, oldFactorX, factorX));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getFactorY() {
        return factorY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFactorY(Double newFactorY) {
        Double oldFactorY = factorY;
        factorY = newFactorY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.SCALE__FACTOR_Y, oldFactorY, factorY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean nonnegativescale(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DGValidator.DIAGNOSTIC_SOURCE,
                         DGValidator.SCALE__NONNEGATIVESCALE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nonnegativescale", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.SCALE__FACTOR_X:
                return getFactorX();
            case DGPackage.SCALE__FACTOR_Y:
                return getFactorY();
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
            case DGPackage.SCALE__FACTOR_X:
                setFactorX((Double)newValue);
                return;
            case DGPackage.SCALE__FACTOR_Y:
                setFactorY((Double)newValue);
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
            case DGPackage.SCALE__FACTOR_X:
                setFactorX(FACTOR_X_EDEFAULT);
                return;
            case DGPackage.SCALE__FACTOR_Y:
                setFactorY(FACTOR_Y_EDEFAULT);
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
            case DGPackage.SCALE__FACTOR_X:
                return FACTOR_X_EDEFAULT == null ? factorX != null : !FACTOR_X_EDEFAULT.equals(factorX);
            case DGPackage.SCALE__FACTOR_Y:
                return FACTOR_Y_EDEFAULT == null ? factorY != null : !FACTOR_Y_EDEFAULT.equals(factorY);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case DGPackage.SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP:
                return nonnegativescale((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (factorX: ");
        result.append(factorX);
        result.append(", factorY: ");
        result.append(factorY);
        result.append(')');
        return result.toString();
    }

} //ScaleImpl
