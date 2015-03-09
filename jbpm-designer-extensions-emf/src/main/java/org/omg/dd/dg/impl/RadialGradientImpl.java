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
import org.omg.dd.dg.RadialGradient;
import org.omg.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radial Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.RadialGradientImpl#getCenterX <em>Center X</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.RadialGradientImpl#getCenterY <em>Center Y</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.RadialGradientImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.RadialGradientImpl#getFocusX <em>Focus X</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.RadialGradientImpl#getFocusY <em>Focus Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadialGradientImpl extends GradientImpl implements RadialGradient {
    /**
     * The default value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCenterX()
     * @generated
     * @ordered
     */
    protected static final Double CENTER_X_EDEFAULT = new Double(0.5);

    /**
     * The cached value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCenterX()
     * @generated
     * @ordered
     */
    protected Double centerX = CENTER_X_EDEFAULT;

    /**
     * The default value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCenterY()
     * @generated
     * @ordered
     */
    protected static final Double CENTER_Y_EDEFAULT = new Double(0.5);

    /**
     * The cached value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCenterY()
     * @generated
     * @ordered
     */
    protected Double centerY = CENTER_Y_EDEFAULT;

    /**
     * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadius()
     * @generated
     * @ordered
     */
    protected static final Double RADIUS_EDEFAULT = new Double(0.5);

    /**
     * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadius()
     * @generated
     * @ordered
     */
    protected Double radius = RADIUS_EDEFAULT;

    /**
     * The default value of the '{@link #getFocusX() <em>Focus X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFocusX()
     * @generated
     * @ordered
     */
    protected static final Double FOCUS_X_EDEFAULT = new Double(0.5);

    /**
     * The cached value of the '{@link #getFocusX() <em>Focus X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFocusX()
     * @generated
     * @ordered
     */
    protected Double focusX = FOCUS_X_EDEFAULT;

    /**
     * The default value of the '{@link #getFocusY() <em>Focus Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFocusY()
     * @generated
     * @ordered
     */
    protected static final Double FOCUS_Y_EDEFAULT = new Double(0.5);

    /**
     * The cached value of the '{@link #getFocusY() <em>Focus Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFocusY()
     * @generated
     * @ordered
     */
    protected Double focusY = FOCUS_Y_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RadialGradientImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.RADIAL_GRADIENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getCenterX() {
        return centerX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCenterX(Double newCenterX) {
        Double oldCenterX = centerX;
        centerX = newCenterX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__CENTER_X, oldCenterX, centerX));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getCenterY() {
        return centerY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCenterY(Double newCenterY) {
        Double oldCenterY = centerY;
        centerY = newCenterY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__CENTER_Y, oldCenterY, centerY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRadius(Double newRadius) {
        Double oldRadius = radius;
        radius = newRadius;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__RADIUS, oldRadius, radius));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getFocusX() {
        return focusX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFocusX(Double newFocusX) {
        Double oldFocusX = focusX;
        focusX = newFocusX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__FOCUS_X, oldFocusX, focusX));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getFocusY() {
        return focusY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFocusY(Double newFocusY) {
        Double oldFocusY = focusY;
        focusY = newFocusY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__FOCUS_Y, oldFocusY, focusY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_center_point(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         DGValidator.RADIAL_GRADIENT__VALID_CENTER_POINT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_center_point", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean valid_focus_point(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         DGValidator.RADIAL_GRADIENT__VALID_FOCUS_POINT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_focus_point", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean valid_radius(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         DGValidator.RADIAL_GRADIENT__VALID_RADIUS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_radius", EObjectValidator.getObjectLabel(this, context) }),
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
            case DGPackage.RADIAL_GRADIENT__CENTER_X:
                return getCenterX();
            case DGPackage.RADIAL_GRADIENT__CENTER_Y:
                return getCenterY();
            case DGPackage.RADIAL_GRADIENT__RADIUS:
                return getRadius();
            case DGPackage.RADIAL_GRADIENT__FOCUS_X:
                return getFocusX();
            case DGPackage.RADIAL_GRADIENT__FOCUS_Y:
                return getFocusY();
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
            case DGPackage.RADIAL_GRADIENT__CENTER_X:
                setCenterX((Double)newValue);
                return;
            case DGPackage.RADIAL_GRADIENT__CENTER_Y:
                setCenterY((Double)newValue);
                return;
            case DGPackage.RADIAL_GRADIENT__RADIUS:
                setRadius((Double)newValue);
                return;
            case DGPackage.RADIAL_GRADIENT__FOCUS_X:
                setFocusX((Double)newValue);
                return;
            case DGPackage.RADIAL_GRADIENT__FOCUS_Y:
                setFocusY((Double)newValue);
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
            case DGPackage.RADIAL_GRADIENT__CENTER_X:
                setCenterX(CENTER_X_EDEFAULT);
                return;
            case DGPackage.RADIAL_GRADIENT__CENTER_Y:
                setCenterY(CENTER_Y_EDEFAULT);
                return;
            case DGPackage.RADIAL_GRADIENT__RADIUS:
                setRadius(RADIUS_EDEFAULT);
                return;
            case DGPackage.RADIAL_GRADIENT__FOCUS_X:
                setFocusX(FOCUS_X_EDEFAULT);
                return;
            case DGPackage.RADIAL_GRADIENT__FOCUS_Y:
                setFocusY(FOCUS_Y_EDEFAULT);
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
            case DGPackage.RADIAL_GRADIENT__CENTER_X:
                return CENTER_X_EDEFAULT == null ? centerX != null : !CENTER_X_EDEFAULT.equals(centerX);
            case DGPackage.RADIAL_GRADIENT__CENTER_Y:
                return CENTER_Y_EDEFAULT == null ? centerY != null : !CENTER_Y_EDEFAULT.equals(centerY);
            case DGPackage.RADIAL_GRADIENT__RADIUS:
                return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
            case DGPackage.RADIAL_GRADIENT__FOCUS_X:
                return FOCUS_X_EDEFAULT == null ? focusX != null : !FOCUS_X_EDEFAULT.equals(focusX);
            case DGPackage.RADIAL_GRADIENT__FOCUS_Y:
                return FOCUS_Y_EDEFAULT == null ? focusY != null : !FOCUS_Y_EDEFAULT.equals(focusY);
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
            case DGPackage.RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP:
                return valid_center_point((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DGPackage.RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP:
                return valid_focus_point((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DGPackage.RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP:
                return valid_radius((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
        result.append(" (centerX: ");
        result.append(centerX);
        result.append(", centerY: ");
        result.append(centerY);
        result.append(", radius: ");
        result.append(radius);
        result.append(", focusX: ");
        result.append(focusX);
        result.append(", focusY: ");
        result.append(focusY);
        result.append(')');
        return result.toString();
    }

} //RadialGradientImpl
