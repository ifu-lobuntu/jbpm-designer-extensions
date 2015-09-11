/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.omg.dd.dc.Color;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.GradientStop;
import org.omg.dd.dg.util.DGValidator;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.GradientStopImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.GradientStopImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.GradientStopImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradientStopImpl extends MinimalEObjectImpl.Container implements GradientStop {
    /**
     * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected Color color;

    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final Double OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected Double offset = OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpacity()
     * @generated
     * @ordered
     */
    protected static final Double OPACITY_EDEFAULT = new Double(1.0);

    /**
     * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpacity()
     * @generated
     * @ordered
     */
    protected Double opacity = OPACITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GradientStopImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.GRADIENT_STOP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getColor() {
        return color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetColor(Color newColor, NotificationChain msgs) {
        Color oldColor = color;
        color = newColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.GRADIENT_STOP__COLOR, oldColor, newColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(Color newColor) {
        if (newColor != color) {
            NotificationChain msgs = null;
            if (color != null)
                msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.GRADIENT_STOP__COLOR, null, msgs);
            if (newColor != null)
                msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.GRADIENT_STOP__COLOR, null, msgs);
            msgs = basicSetColor(newColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRADIENT_STOP__COLOR, newColor, newColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getOffset() {
        return offset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOffset(Double newOffset) {
        Double oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRADIENT_STOP__OFFSET, oldOffset, offset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getOpacity() {
        return opacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpacity(Double newOpacity) {
        Double oldOpacity = opacity;
        opacity = newOpacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRADIENT_STOP__OPACITY, oldOpacity, opacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_offset(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         DGValidator.GRADIENT_STOP__VALID_OFFSET,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_offset", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean valid_opacity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         DGValidator.GRADIENT_STOP__VALID_OPACITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_opacity", EObjectValidator.getObjectLabel(this, context) }),
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.GRADIENT_STOP__COLOR:
                return basicSetColor(null, msgs);
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
            case DGPackage.GRADIENT_STOP__COLOR:
                return getColor();
            case DGPackage.GRADIENT_STOP__OFFSET:
                return getOffset();
            case DGPackage.GRADIENT_STOP__OPACITY:
                return getOpacity();
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
            case DGPackage.GRADIENT_STOP__COLOR:
                setColor((Color)newValue);
                return;
            case DGPackage.GRADIENT_STOP__OFFSET:
                setOffset((Double)newValue);
                return;
            case DGPackage.GRADIENT_STOP__OPACITY:
                setOpacity((Double)newValue);
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
            case DGPackage.GRADIENT_STOP__COLOR:
                setColor((Color)null);
                return;
            case DGPackage.GRADIENT_STOP__OFFSET:
                setOffset(OFFSET_EDEFAULT);
                return;
            case DGPackage.GRADIENT_STOP__OPACITY:
                setOpacity(OPACITY_EDEFAULT);
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
            case DGPackage.GRADIENT_STOP__COLOR:
                return color != null;
            case DGPackage.GRADIENT_STOP__OFFSET:
                return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
            case DGPackage.GRADIENT_STOP__OPACITY:
                return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
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
            case DGPackage.GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP:
                return valid_offset((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DGPackage.GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP:
                return valid_opacity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
        result.append(" (offset: ");
        result.append(offset);
        result.append(", opacity: ");
        result.append(opacity);
        result.append(')');
        return result.toString();
    }

} //GradientStopImpl
