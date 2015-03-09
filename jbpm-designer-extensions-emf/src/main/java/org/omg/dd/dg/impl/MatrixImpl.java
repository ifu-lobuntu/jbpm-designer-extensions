/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Matrix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.MatrixImpl#getA <em>A</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MatrixImpl#getB <em>B</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MatrixImpl#getC <em>C</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MatrixImpl#getD <em>D</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MatrixImpl#getE <em>E</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MatrixImpl#getF <em>F</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixImpl extends TransformImpl implements Matrix {
    /**
     * The default value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected static final Double A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected Double a = A_EDEFAULT;

    /**
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Double B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Double b = B_EDEFAULT;

    /**
     * The default value of the '{@link #getC() <em>C</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC()
     * @generated
     * @ordered
     */
    protected static final Double C_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC() <em>C</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC()
     * @generated
     * @ordered
     */
    protected Double c = C_EDEFAULT;

    /**
     * The default value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected static final Double D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected Double d = D_EDEFAULT;

    /**
     * The default value of the '{@link #getE() <em>E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE()
     * @generated
     * @ordered
     */
    protected static final Double E_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getE() <em>E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE()
     * @generated
     * @ordered
     */
    protected Double e = E_EDEFAULT;

    /**
     * The default value of the '{@link #getF() <em>F</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getF()
     * @generated
     * @ordered
     */
    protected static final Double F_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getF() <em>F</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getF()
     * @generated
     * @ordered
     */
    protected Double f = F_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatrixImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.MATRIX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getA() {
        return a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setA(Double newA) {
        Double oldA = a;
        a = newA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MATRIX__A, oldA, a));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setB(Double newB) {
        Double oldB = b;
        b = newB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MATRIX__B, oldB, b));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getC() {
        return c;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setC(Double newC) {
        Double oldC = c;
        c = newC;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MATRIX__C, oldC, c));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getD() {
        return d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setD(Double newD) {
        Double oldD = d;
        d = newD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MATRIX__D, oldD, d));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getE() {
        return e;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setE(Double newE) {
        Double oldE = e;
        e = newE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MATRIX__E, oldE, e));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getF() {
        return f;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setF(Double newF) {
        Double oldF = f;
        f = newF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MATRIX__F, oldF, f));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.MATRIX__A:
                return getA();
            case DGPackage.MATRIX__B:
                return getB();
            case DGPackage.MATRIX__C:
                return getC();
            case DGPackage.MATRIX__D:
                return getD();
            case DGPackage.MATRIX__E:
                return getE();
            case DGPackage.MATRIX__F:
                return getF();
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
            case DGPackage.MATRIX__A:
                setA((Double)newValue);
                return;
            case DGPackage.MATRIX__B:
                setB((Double)newValue);
                return;
            case DGPackage.MATRIX__C:
                setC((Double)newValue);
                return;
            case DGPackage.MATRIX__D:
                setD((Double)newValue);
                return;
            case DGPackage.MATRIX__E:
                setE((Double)newValue);
                return;
            case DGPackage.MATRIX__F:
                setF((Double)newValue);
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
            case DGPackage.MATRIX__A:
                setA(A_EDEFAULT);
                return;
            case DGPackage.MATRIX__B:
                setB(B_EDEFAULT);
                return;
            case DGPackage.MATRIX__C:
                setC(C_EDEFAULT);
                return;
            case DGPackage.MATRIX__D:
                setD(D_EDEFAULT);
                return;
            case DGPackage.MATRIX__E:
                setE(E_EDEFAULT);
                return;
            case DGPackage.MATRIX__F:
                setF(F_EDEFAULT);
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
            case DGPackage.MATRIX__A:
                return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
            case DGPackage.MATRIX__B:
                return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
            case DGPackage.MATRIX__C:
                return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
            case DGPackage.MATRIX__D:
                return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
            case DGPackage.MATRIX__E:
                return E_EDEFAULT == null ? e != null : !E_EDEFAULT.equals(e);
            case DGPackage.MATRIX__F:
                return F_EDEFAULT == null ? f != null : !F_EDEFAULT.equals(f);
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
        result.append(" (a: ");
        result.append(a);
        result.append(", b: ");
        result.append(b);
        result.append(", c: ");
        result.append(c);
        result.append(", d: ");
        result.append(d);
        result.append(", e: ");
        result.append(e);
        result.append(", f: ");
        result.append(f);
        result.append(')');
        return result.toString();
    }

} //MatrixImpl
