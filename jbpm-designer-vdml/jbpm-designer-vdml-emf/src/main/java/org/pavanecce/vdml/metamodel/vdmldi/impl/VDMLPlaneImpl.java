/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import org.eclipse.dd.cmmn.di.impl.PlaneImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLPlaneImpl#getVDMLElement <em>VDML Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLPlaneImpl extends PlaneImpl implements VDMLPlane {
    /**
     * The cached value of the '{@link #getVDMLElement() <em>VDML Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVDMLElement()
     * @generated
     * @ordered
     */
    protected VdmlElement vdmlElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VDMLPlaneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlDiPackage.Literals.VDML_PLANE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement getVDMLElement() {
        if (vdmlElement != null && vdmlElement.eIsProxy()) {
            InternalEObject oldVDMLElement = (InternalEObject)vdmlElement;
            vdmlElement = (VdmlElement)eResolveProxy(oldVDMLElement);
            if (vdmlElement != oldVDMLElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlDiPackage.VDML_PLANE__VDML_ELEMENT, oldVDMLElement, vdmlElement));
            }
        }
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement basicGetVDMLElement() {
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVDMLElement(VdmlElement newVDMLElement) {
        VdmlElement oldVDMLElement = vdmlElement;
        vdmlElement = newVDMLElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_PLANE__VDML_ELEMENT, oldVDMLElement, vdmlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VdmlDiPackage.VDML_PLANE__VDML_ELEMENT:
                if (resolve) return getVDMLElement();
                return basicGetVDMLElement();
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
            case VdmlDiPackage.VDML_PLANE__VDML_ELEMENT:
                setVDMLElement((VdmlElement)newValue);
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
            case VdmlDiPackage.VDML_PLANE__VDML_ELEMENT:
                setVDMLElement((VdmlElement)null);
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
            case VdmlDiPackage.VDML_PLANE__VDML_ELEMENT:
                return vdmlElement != null;
        }
        return super.eIsSet(featureID);
    }
    @Override
    public EObject getModelElement() {
        return getVDMLElement();
    }

} //VDMLPlaneImpl
