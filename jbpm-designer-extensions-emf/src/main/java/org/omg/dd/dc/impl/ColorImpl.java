/**
 */
package org.omg.dd.dc.impl;
import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.plugin.*;
import org.eclipse.emf.ecore.util.*;
import org.omg.dd.dc.*;
import org.omg.dd.dg.*;
import org.omg.dd.dg.util.*;
import org.omg.dd.di.util.*;
import org.omg.dd.dc.util.*;
import org.omg.dd.di.*;

import java.lang.reflect.*;
import java.util.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dc.impl.ColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.omg.dd.dc.impl.ColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.omg.dd.dc.impl.ColorImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color {
    /**
     * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRed()
     * @generated
     * @ordered
     */
    protected static final Integer RED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRed()
     * @generated
     * @ordered
     */
    protected Integer red = RED_EDEFAULT;

    /**
     * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGreen()
     * @generated
     * @ordered
     */
    protected static final Integer GREEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGreen()
     * @generated
     * @ordered
     */
    protected Integer green = GREEN_EDEFAULT;

    /**
     * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlue()
     * @generated
     * @ordered
     */
    protected static final Integer BLUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlue()
     * @generated
     * @ordered
     */
    protected Integer blue = BLUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DCPackage.Literals.COLOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getRed() {
        return red;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRed(Integer newRed) {
        Integer oldRed = red;
        red = newRed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.COLOR__RED, oldRed, red));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getGreen() {
        return green;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGreen(Integer newGreen) {
        Integer oldGreen = green;
        green = newGreen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.COLOR__GREEN, oldGreen, green));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getBlue() {
        return blue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlue(Integer newBlue) {
        Integer oldBlue = blue;
        blue = newBlue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.COLOR__BLUE, oldBlue, blue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_rgb(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DCValidator.DIAGNOSTIC_SOURCE,
                         DCValidator.COLOR__VALID_RGB,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_rgb", EObjectValidator.getObjectLabel(this, context) }),
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
            case DCPackage.COLOR__RED:
                return getRed();
            case DCPackage.COLOR__GREEN:
                return getGreen();
            case DCPackage.COLOR__BLUE:
                return getBlue();
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
            case DCPackage.COLOR__RED:
                setRed((Integer)newValue);
                return;
            case DCPackage.COLOR__GREEN:
                setGreen((Integer)newValue);
                return;
            case DCPackage.COLOR__BLUE:
                setBlue((Integer)newValue);
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
            case DCPackage.COLOR__RED:
                setRed(RED_EDEFAULT);
                return;
            case DCPackage.COLOR__GREEN:
                setGreen(GREEN_EDEFAULT);
                return;
            case DCPackage.COLOR__BLUE:
                setBlue(BLUE_EDEFAULT);
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
            case DCPackage.COLOR__RED:
                return RED_EDEFAULT == null ? red != null : !RED_EDEFAULT.equals(red);
            case DCPackage.COLOR__GREEN:
                return GREEN_EDEFAULT == null ? green != null : !GREEN_EDEFAULT.equals(green);
            case DCPackage.COLOR__BLUE:
                return BLUE_EDEFAULT == null ? blue != null : !BLUE_EDEFAULT.equals(blue);
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
            case DCPackage.COLOR___VALID_RGB__DIAGNOSTICCHAIN_MAP:
                return valid_rgb((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
        result.append(" (red: ");
        result.append(red);
        result.append(", green: ");
        result.append(green);
        result.append(", blue: ");
        result.append(blue);
        result.append(')');
        return result.toString();
    }

} //ColorImpl
