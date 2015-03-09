/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.dd.dc.Dimension;
import org.omg.dd.dc.Point;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.EllipticalArcTo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elliptical Arc To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.EllipticalArcToImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.EllipticalArcToImpl#getRadii <em>Radii</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.EllipticalArcToImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.EllipticalArcToImpl#getIsLargeArc <em>Is Large Arc</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.EllipticalArcToImpl#getIsSweep <em>Is Sweep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EllipticalArcToImpl extends PathCommandImpl implements EllipticalArcTo {
    /**
     * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoint()
     * @generated
     * @ordered
     */
    protected Point point;

    /**
     * The cached value of the '{@link #getRadii() <em>Radii</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadii()
     * @generated
     * @ordered
     */
    protected Dimension radii;

    /**
     * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotation()
     * @generated
     * @ordered
     */
    protected static final Double ROTATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotation()
     * @generated
     * @ordered
     */
    protected Double rotation = ROTATION_EDEFAULT;

    /**
     * The default value of the '{@link #getIsLargeArc() <em>Is Large Arc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsLargeArc()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_LARGE_ARC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsLargeArc() <em>Is Large Arc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsLargeArc()
     * @generated
     * @ordered
     */
    protected Boolean isLargeArc = IS_LARGE_ARC_EDEFAULT;

    /**
     * The default value of the '{@link #getIsSweep() <em>Is Sweep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSweep()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SWEEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSweep() <em>Is Sweep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSweep()
     * @generated
     * @ordered
     */
    protected Boolean isSweep = IS_SWEEP_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EllipticalArcToImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.ELLIPTICAL_ARC_TO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point getPoint() {
        return point;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPoint(Point newPoint, NotificationChain msgs) {
        Point oldPoint = point;
        point = newPoint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__POINT, oldPoint, newPoint);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPoint(Point newPoint) {
        if (newPoint != point) {
            NotificationChain msgs = null;
            if (point != null)
                msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPTICAL_ARC_TO__POINT, null, msgs);
            if (newPoint != null)
                msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPTICAL_ARC_TO__POINT, null, msgs);
            msgs = basicSetPoint(newPoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__POINT, newPoint, newPoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dimension getRadii() {
        return radii;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRadii(Dimension newRadii, NotificationChain msgs) {
        Dimension oldRadii = radii;
        radii = newRadii;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__RADII, oldRadii, newRadii);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRadii(Dimension newRadii) {
        if (newRadii != radii) {
            NotificationChain msgs = null;
            if (radii != null)
                msgs = ((InternalEObject)radii).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPTICAL_ARC_TO__RADII, null, msgs);
            if (newRadii != null)
                msgs = ((InternalEObject)newRadii).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPTICAL_ARC_TO__RADII, null, msgs);
            msgs = basicSetRadii(newRadii, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__RADII, newRadii, newRadii));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getRotation() {
        return rotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRotation(Double newRotation) {
        Double oldRotation = rotation;
        rotation = newRotation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__ROTATION, oldRotation, rotation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsLargeArc() {
        return isLargeArc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsLargeArc(Boolean newIsLargeArc) {
        Boolean oldIsLargeArc = isLargeArc;
        isLargeArc = newIsLargeArc;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__IS_LARGE_ARC, oldIsLargeArc, isLargeArc));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsSweep() {
        return isSweep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsSweep(Boolean newIsSweep) {
        Boolean oldIsSweep = isSweep;
        isSweep = newIsSweep;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPTICAL_ARC_TO__IS_SWEEP, oldIsSweep, isSweep));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.ELLIPTICAL_ARC_TO__POINT:
                return basicSetPoint(null, msgs);
            case DGPackage.ELLIPTICAL_ARC_TO__RADII:
                return basicSetRadii(null, msgs);
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
            case DGPackage.ELLIPTICAL_ARC_TO__POINT:
                return getPoint();
            case DGPackage.ELLIPTICAL_ARC_TO__RADII:
                return getRadii();
            case DGPackage.ELLIPTICAL_ARC_TO__ROTATION:
                return getRotation();
            case DGPackage.ELLIPTICAL_ARC_TO__IS_LARGE_ARC:
                return getIsLargeArc();
            case DGPackage.ELLIPTICAL_ARC_TO__IS_SWEEP:
                return getIsSweep();
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
            case DGPackage.ELLIPTICAL_ARC_TO__POINT:
                setPoint((Point)newValue);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__RADII:
                setRadii((Dimension)newValue);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__ROTATION:
                setRotation((Double)newValue);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__IS_LARGE_ARC:
                setIsLargeArc((Boolean)newValue);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__IS_SWEEP:
                setIsSweep((Boolean)newValue);
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
            case DGPackage.ELLIPTICAL_ARC_TO__POINT:
                setPoint((Point)null);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__RADII:
                setRadii((Dimension)null);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__ROTATION:
                setRotation(ROTATION_EDEFAULT);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__IS_LARGE_ARC:
                setIsLargeArc(IS_LARGE_ARC_EDEFAULT);
                return;
            case DGPackage.ELLIPTICAL_ARC_TO__IS_SWEEP:
                setIsSweep(IS_SWEEP_EDEFAULT);
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
            case DGPackage.ELLIPTICAL_ARC_TO__POINT:
                return point != null;
            case DGPackage.ELLIPTICAL_ARC_TO__RADII:
                return radii != null;
            case DGPackage.ELLIPTICAL_ARC_TO__ROTATION:
                return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
            case DGPackage.ELLIPTICAL_ARC_TO__IS_LARGE_ARC:
                return IS_LARGE_ARC_EDEFAULT == null ? isLargeArc != null : !IS_LARGE_ARC_EDEFAULT.equals(isLargeArc);
            case DGPackage.ELLIPTICAL_ARC_TO__IS_SWEEP:
                return IS_SWEEP_EDEFAULT == null ? isSweep != null : !IS_SWEEP_EDEFAULT.equals(isSweep);
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
        result.append(" (rotation: ");
        result.append(rotation);
        result.append(", isLargeArc: ");
        result.append(isLargeArc);
        result.append(", isSweep: ");
        result.append(isSweep);
        result.append(')');
        return result.toString();
    }

} //EllipticalArcToImpl
