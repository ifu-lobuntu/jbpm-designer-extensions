/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.MarkedElement;
import org.omg.dd.dg.Marker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marked Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.MarkedElementImpl#getStartMarker <em>Start Marker</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MarkedElementImpl#getEndMarker <em>End Marker</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MarkedElementImpl#getMidMarker <em>Mid Marker</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MarkedElementImpl extends GraphicalElementImpl implements MarkedElement {
    /**
     * The cached value of the '{@link #getStartMarker() <em>Start Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartMarker()
     * @generated
     * @ordered
     */
    protected Marker startMarker;

    /**
     * The cached value of the '{@link #getEndMarker() <em>End Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndMarker()
     * @generated
     * @ordered
     */
    protected Marker endMarker;

    /**
     * The cached value of the '{@link #getMidMarker() <em>Mid Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMidMarker()
     * @generated
     * @ordered
     */
    protected Marker midMarker;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MarkedElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.MARKED_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker getStartMarker() {
        if (startMarker != null && startMarker.eIsProxy()) {
            InternalEObject oldStartMarker = (InternalEObject)startMarker;
            startMarker = (Marker)eResolveProxy(oldStartMarker);
            if (startMarker != oldStartMarker) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.MARKED_ELEMENT__START_MARKER, oldStartMarker, startMarker));
            }
        }
        return startMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker basicGetStartMarker() {
        return startMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartMarker(Marker newStartMarker) {
        Marker oldStartMarker = startMarker;
        startMarker = newStartMarker;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKED_ELEMENT__START_MARKER, oldStartMarker, startMarker));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker getEndMarker() {
        if (endMarker != null && endMarker.eIsProxy()) {
            InternalEObject oldEndMarker = (InternalEObject)endMarker;
            endMarker = (Marker)eResolveProxy(oldEndMarker);
            if (endMarker != oldEndMarker) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.MARKED_ELEMENT__END_MARKER, oldEndMarker, endMarker));
            }
        }
        return endMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker basicGetEndMarker() {
        return endMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndMarker(Marker newEndMarker) {
        Marker oldEndMarker = endMarker;
        endMarker = newEndMarker;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKED_ELEMENT__END_MARKER, oldEndMarker, endMarker));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker getMidMarker() {
        if (midMarker != null && midMarker.eIsProxy()) {
            InternalEObject oldMidMarker = (InternalEObject)midMarker;
            midMarker = (Marker)eResolveProxy(oldMidMarker);
            if (midMarker != oldMidMarker) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.MARKED_ELEMENT__MID_MARKER, oldMidMarker, midMarker));
            }
        }
        return midMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker basicGetMidMarker() {
        return midMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMidMarker(Marker newMidMarker) {
        Marker oldMidMarker = midMarker;
        midMarker = newMidMarker;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKED_ELEMENT__MID_MARKER, oldMidMarker, midMarker));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.MARKED_ELEMENT__START_MARKER:
                if (resolve) return getStartMarker();
                return basicGetStartMarker();
            case DGPackage.MARKED_ELEMENT__END_MARKER:
                if (resolve) return getEndMarker();
                return basicGetEndMarker();
            case DGPackage.MARKED_ELEMENT__MID_MARKER:
                if (resolve) return getMidMarker();
                return basicGetMidMarker();
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
            case DGPackage.MARKED_ELEMENT__START_MARKER:
                setStartMarker((Marker)newValue);
                return;
            case DGPackage.MARKED_ELEMENT__END_MARKER:
                setEndMarker((Marker)newValue);
                return;
            case DGPackage.MARKED_ELEMENT__MID_MARKER:
                setMidMarker((Marker)newValue);
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
            case DGPackage.MARKED_ELEMENT__START_MARKER:
                setStartMarker((Marker)null);
                return;
            case DGPackage.MARKED_ELEMENT__END_MARKER:
                setEndMarker((Marker)null);
                return;
            case DGPackage.MARKED_ELEMENT__MID_MARKER:
                setMidMarker((Marker)null);
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
            case DGPackage.MARKED_ELEMENT__START_MARKER:
                return startMarker != null;
            case DGPackage.MARKED_ELEMENT__END_MARKER:
                return endMarker != null;
            case DGPackage.MARKED_ELEMENT__MID_MARKER:
                return midMarker != null;
        }
        return super.eIsSet(featureID);
    }

} //MarkedElementImpl
