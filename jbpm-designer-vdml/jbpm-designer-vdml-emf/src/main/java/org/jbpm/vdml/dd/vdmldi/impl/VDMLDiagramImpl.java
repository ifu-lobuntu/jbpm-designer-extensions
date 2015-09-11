/**
 */
package org.jbpm.vdml.dd.vdmldi.impl;

import java.util.Collection;
import java.util.Collection;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;

import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.util.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.*;
import org.jbpm.smm.dd.smmdi.*;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.dd.di.*;
import org.omg.dd.di.impl.*;
import org.omg.smm.*;
import org.omg.vdml.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLDiagramImpl#getVdmlElement <em>Vdml Element</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLDiagramImpl#getOwnedVdmlDiagramElement <em>Owned Vdml Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLDiagramImpl extends DiagramImpl implements VDMLDiagram {
    /**
     * The cached value of the '{@link #getVdmlElement() <em>Vdml Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVdmlElement()
     * @generated
     * @ordered
     */
    protected VdmlElement vdmlElement;

    /**
     * The cached value of the '{@link #getOwnedVdmlDiagramElement() <em>Owned Vdml Diagram Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedVdmlDiagramElement()
     * @generated
     * @ordered
     */
    protected EList<VDMLDiagramElement> ownedVdmlDiagramElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VDMLDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLDIPackage.Literals.VDML_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement getVdmlElement() {
        if (vdmlElement != null && vdmlElement.eIsProxy()) {
            InternalEObject oldVdmlElement = (InternalEObject)vdmlElement;
            vdmlElement = (VdmlElement)eResolveProxy(oldVdmlElement);
            if (vdmlElement != oldVdmlElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT, oldVdmlElement, vdmlElement));
            }
        }
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement basicGetVdmlElement() {
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVdmlElement(VdmlElement newVdmlElement) {
        VdmlElement oldVdmlElement = vdmlElement;
        vdmlElement = newVdmlElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT, oldVdmlElement, vdmlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VDMLDiagramElement> getOwnedVdmlDiagramElement() {
        if (ownedVdmlDiagramElement == null) {
            ownedVdmlDiagramElement = new EObjectContainmentEList<VDMLDiagramElement>(VDMLDiagramElement.class, this, VDMLDIPackage.VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT);
        }
        return ownedVdmlDiagramElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLDIPackage.VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT:
                return ((InternalEList<?>)getOwnedVdmlDiagramElement()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->    @Override
    public EObject getModelElement() {
        return getVdmlElement();
    
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT:
                if (resolve) return getVdmlElement();
                return basicGetVdmlElement();
            case VDMLDIPackage.VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT:
                return getOwnedVdmlDiagramElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT:
                setVdmlElement((VdmlElement)newValue);
                return;
            case VDMLDIPackage.VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT:
                getOwnedVdmlDiagramElement().clear();
                getOwnedVdmlDiagramElement().addAll((Collection<? extends VDMLDiagramElement>)newValue);
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
            case VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT:
                setVdmlElement((VdmlElement)null);
                return;
            case VDMLDIPackage.VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT:
                getOwnedVdmlDiagramElement().clear();
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
            case VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT:
                return vdmlElement != null;
            case VDMLDIPackage.VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT:
                return ownedVdmlDiagramElement != null && !ownedVdmlDiagramElement.isEmpty();
        }
        return super.eIsSet(featureID);
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == VDMLDiagramElement.class) {
            switch (derivedFeatureID) {
                case VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT: return VDMLDIPackage.VDML_DIAGRAM_ELEMENT__VDML_ELEMENT;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == VDMLDiagramElement.class) {
            switch (baseFeatureID) {
                case VDMLDIPackage.VDML_DIAGRAM_ELEMENT__VDML_ELEMENT: return VDMLDIPackage.VDML_DIAGRAM__VDML_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getVdmlElement());
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public EList getOwnedElement() {
        return getOwnedVdmlDiagramElement();
    }
} //VDMLDiagramImpl
