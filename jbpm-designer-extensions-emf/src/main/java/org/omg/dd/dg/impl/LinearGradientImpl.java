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
import org.omg.dd.dg.LinearGradient;
import org.omg.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.LinearGradientImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.LinearGradientImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.LinearGradientImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.LinearGradientImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearGradientImpl extends GradientImpl implements LinearGradient {
    /**
     * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1()
     * @generated
     * @ordered
     */
    protected static final Double X1_EDEFAULT = new Double(0.0);

    /**
     * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1()
     * @generated
     * @ordered
     */
    protected Double x1 = X1_EDEFAULT;

    /**
     * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected static final Double X2_EDEFAULT = new Double(1.0);

    /**
     * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected Double x2 = X2_EDEFAULT;

    /**
     * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1()
     * @generated
     * @ordered
     */
    protected static final Double Y1_EDEFAULT = new Double(0.0);

    /**
     * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1()
     * @generated
     * @ordered
     */
    protected Double y1 = Y1_EDEFAULT;

    /**
     * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2()
     * @generated
     * @ordered
     */
    protected static final Double Y2_EDEFAULT = new Double(1.0);

    /**
     * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2()
     * @generated
     * @ordered
     */
    protected Double y2 = Y2_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinearGradientImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.LINEAR_GRADIENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getX1() {
        return x1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX1(Double newX1) {
        Double oldX1 = x1;
        x1 = newX1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__X1, oldX1, x1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getX2() {
        return x2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX2(Double newX2) {
        Double oldX2 = x2;
        x2 = newX2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__X2, oldX2, x2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getY1() {
        return y1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY1(Double newY1) {
        Double oldY1 = y1;
        y1 = newY1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__Y1, oldY1, y1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getY2() {
        return y2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY2(Double newY2) {
        Double oldY2 = y2;
        y2 = newY2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__Y2, oldY2, y2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_gradient_vector(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         DGValidator.LINEAR_GRADIENT__VALID_GRADIENT_VECTOR,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_gradient_vector", EObjectValidator.getObjectLabel(this, context) }),
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
            case DGPackage.LINEAR_GRADIENT__X1:
                return getX1();
            case DGPackage.LINEAR_GRADIENT__X2:
                return getX2();
            case DGPackage.LINEAR_GRADIENT__Y1:
                return getY1();
            case DGPackage.LINEAR_GRADIENT__Y2:
                return getY2();
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
            case DGPackage.LINEAR_GRADIENT__X1:
                setX1((Double)newValue);
                return;
            case DGPackage.LINEAR_GRADIENT__X2:
                setX2((Double)newValue);
                return;
            case DGPackage.LINEAR_GRADIENT__Y1:
                setY1((Double)newValue);
                return;
            case DGPackage.LINEAR_GRADIENT__Y2:
                setY2((Double)newValue);
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
            case DGPackage.LINEAR_GRADIENT__X1:
                setX1(X1_EDEFAULT);
                return;
            case DGPackage.LINEAR_GRADIENT__X2:
                setX2(X2_EDEFAULT);
                return;
            case DGPackage.LINEAR_GRADIENT__Y1:
                setY1(Y1_EDEFAULT);
                return;
            case DGPackage.LINEAR_GRADIENT__Y2:
                setY2(Y2_EDEFAULT);
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
            case DGPackage.LINEAR_GRADIENT__X1:
                return X1_EDEFAULT == null ? x1 != null : !X1_EDEFAULT.equals(x1);
            case DGPackage.LINEAR_GRADIENT__X2:
                return X2_EDEFAULT == null ? x2 != null : !X2_EDEFAULT.equals(x2);
            case DGPackage.LINEAR_GRADIENT__Y1:
                return Y1_EDEFAULT == null ? y1 != null : !Y1_EDEFAULT.equals(y1);
            case DGPackage.LINEAR_GRADIENT__Y2:
                return Y2_EDEFAULT == null ? y2 != null : !Y2_EDEFAULT.equals(y2);
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
            case DGPackage.LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP:
                return valid_gradient_vector((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
        result.append(" (x1: ");
        result.append(x1);
        result.append(", x2: ");
        result.append(x2);
        result.append(", y1: ");
        result.append(y1);
        result.append(", y2: ");
        result.append(y2);
        result.append(')');
        return result.toString();
    }

} //LinearGradientImpl
