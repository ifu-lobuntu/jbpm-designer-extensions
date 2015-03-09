/**
 */
package org.jbpm.cmmn.dd.cmmndi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.omg.cmmn.TCmmnElement;
import org.omg.dd.di.impl.DiagramElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramElementImpl#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMMNDiagramElementImpl extends DiagramElementImpl implements CMMNDiagramElement {
    /**
     * The cached value of the '{@link #getCmmnElement() <em>Cmmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCmmnElement()
     * @generated
     * @ordered
     */
    protected TCmmnElement cmmnElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CMMNDiagramElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNDIPackage.Literals.CMMN_DIAGRAM_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCmmnElement getCmmnElement() {
        if (cmmnElement != null && cmmnElement.eIsProxy()) {
            InternalEObject oldCmmnElement = (InternalEObject)cmmnElement;
            cmmnElement = (TCmmnElement)eResolveProxy(oldCmmnElement);
            if (cmmnElement != oldCmmnElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
            }
        }
        return cmmnElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCmmnElement basicGetCmmnElement() {
        return cmmnElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCmmnElement(TCmmnElement newCmmnElement) {
        TCmmnElement oldCmmnElement = cmmnElement;
        cmmnElement = newCmmnElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT:
                if (resolve) return getCmmnElement();
                return basicGetCmmnElement();
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
            case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT:
                setCmmnElement((TCmmnElement)newValue);
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
            case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT:
                setCmmnElement((TCmmnElement)null);
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
            case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT:
                return cmmnElement != null;
        }
        return super.eIsSet(featureID);
    }

} //CMMNDiagramElementImpl
