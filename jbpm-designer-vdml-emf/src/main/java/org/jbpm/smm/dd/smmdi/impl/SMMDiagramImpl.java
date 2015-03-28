/**
 */
package org.jbpm.smm.dd.smmdi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.SMMDiagramElement;
import org.omg.dd.di.impl.DiagramImpl;
import org.omg.smm.SmmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMM Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.smm.dd.smmdi.impl.SMMDiagramImpl#getSmmElement <em>Smm Element</em>}</li>
 *   <li>{@link org.jbpm.smm.dd.smmdi.impl.SMMDiagramImpl#getOwnedSmmDiagramElement <em>Owned Smm Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMMDiagramImpl extends DiagramImpl implements SMMDiagram {
    /**
     * The cached value of the '{@link #getSmmElement() <em>Smm Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmmElement()
     * @generated
     * @ordered
     */
    protected SmmElement smmElement;

    /**
     * The cached value of the '{@link #getOwnedSmmDiagramElement() <em>Owned Smm Diagram Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedSmmDiagramElement()
     * @generated
     * @ordered
     */
    protected EList<SMMDiagramElement> ownedSmmDiagramElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMMDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMDIPackage.Literals.SMM_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmElement getSmmElement() {
        if (smmElement != null && smmElement.eIsProxy()) {
            InternalEObject oldSmmElement = (InternalEObject)smmElement;
            smmElement = (SmmElement)eResolveProxy(oldSmmElement);
            if (smmElement != oldSmmElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT, oldSmmElement, smmElement));
            }
        }
        return smmElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmElement basicGetSmmElement() {
        return smmElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmmElement(SmmElement newSmmElement) {
        SmmElement oldSmmElement = smmElement;
        smmElement = newSmmElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT, oldSmmElement, smmElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SMMDiagramElement> getOwnedSmmDiagramElement() {
        if (ownedSmmDiagramElement == null) {
            ownedSmmDiagramElement = new EObjectContainmentEList<SMMDiagramElement>(SMMDiagramElement.class, this, SMMDIPackage.SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT);
        }
        return ownedSmmDiagramElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMDIPackage.SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT:
                return ((InternalEList<?>)getOwnedSmmDiagramElement()).basicRemove(otherEnd, msgs);
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
            case SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT:
                if (resolve) return getSmmElement();
                return basicGetSmmElement();
            case SMMDIPackage.SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT:
                return getOwnedSmmDiagramElement();
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
            case SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT:
                setSmmElement((SmmElement)newValue);
                return;
            case SMMDIPackage.SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT:
                getOwnedSmmDiagramElement().clear();
                getOwnedSmmDiagramElement().addAll((Collection<? extends SMMDiagramElement>)newValue);
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
            case SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT:
                setSmmElement((SmmElement)null);
                return;
            case SMMDIPackage.SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT:
                getOwnedSmmDiagramElement().clear();
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
            case SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT:
                return smmElement != null;
            case SMMDIPackage.SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT:
                return ownedSmmDiagramElement != null && !ownedSmmDiagramElement.isEmpty();
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
        if (baseClass == SMMDiagramElement.class) {
            switch (derivedFeatureID) {
                case SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT: return SMMDIPackage.SMM_DIAGRAM_ELEMENT__SMM_ELEMENT;
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
        if (baseClass == SMMDiagramElement.class) {
            switch (baseFeatureID) {
                case SMMDIPackage.SMM_DIAGRAM_ELEMENT__SMM_ELEMENT: return SMMDIPackage.SMM_DIAGRAM__SMM_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }
    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getSmmElement());
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public EList getOwnedElement() {
        return getOwnedSmmDiagramElement();
    }

} //SMMDiagramImpl
