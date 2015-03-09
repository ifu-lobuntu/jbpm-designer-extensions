/**
 */
package org.jbpm.uml2.dd.umldi.impl;

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
import org.eclipse.uml2.uml.Element;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLStyle;
import org.omg.dd.di.impl.DiagramImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl#getOwnedUmlStyle <em>Owned Uml Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLDiagramImpl extends DiagramImpl implements UMLDiagram {
    /**
     * The cached value of the '{@link #getUmlElement() <em>Uml Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlElement()
     * @generated
     * @ordered
     */
    protected Element umlElement;

    /**
     * The cached value of the '{@link #getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedUmlDiagramElement()
     * @generated
     * @ordered
     */
    protected EList<UMLDiagramElement> ownedUmlDiagramElement;

    /**
     * The cached value of the '{@link #getOwnedUmlStyle() <em>Owned Uml Style</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedUmlStyle()
     * @generated
     * @ordered
     */
    protected EList<UMLStyle> ownedUmlStyle;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UMLDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UMLDIPackage.Literals.UML_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element getUmlElement() {
        if (umlElement != null && umlElement.eIsProxy()) {
            InternalEObject oldUmlElement = (InternalEObject)umlElement;
            umlElement = (Element)eResolveProxy(oldUmlElement);
            if (umlElement != oldUmlElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_DIAGRAM__UML_ELEMENT, oldUmlElement, umlElement));
            }
        }
        return umlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element basicGetUmlElement() {
        return umlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUmlElement(Element newUmlElement) {
        Element oldUmlElement = umlElement;
        umlElement = newUmlElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__UML_ELEMENT, oldUmlElement, umlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UMLDiagramElement> getOwnedUmlDiagramElement() {
        if (ownedUmlDiagramElement == null) {
            ownedUmlDiagramElement = new EObjectContainmentEList<UMLDiagramElement>(UMLDiagramElement.class, this, UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT);
        }
        return ownedUmlDiagramElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UMLStyle> getOwnedUmlStyle() {
        if (ownedUmlStyle == null) {
            ownedUmlStyle = new EObjectContainmentEList<UMLStyle>(UMLStyle.class, this, UMLDIPackage.UML_DIAGRAM__OWNED_UML_STYLE);
        }
        return ownedUmlStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
                return ((InternalEList<?>)getOwnedUmlDiagramElement()).basicRemove(otherEnd, msgs);
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_STYLE:
                return ((InternalEList<?>)getOwnedUmlStyle()).basicRemove(otherEnd, msgs);
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
            case UMLDIPackage.UML_DIAGRAM__UML_ELEMENT:
                if (resolve) return getUmlElement();
                return basicGetUmlElement();
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
                return getOwnedUmlDiagramElement();
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_STYLE:
                return getOwnedUmlStyle();
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
            case UMLDIPackage.UML_DIAGRAM__UML_ELEMENT:
                setUmlElement((Element)newValue);
                return;
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
                getOwnedUmlDiagramElement().clear();
                getOwnedUmlDiagramElement().addAll((Collection<? extends UMLDiagramElement>)newValue);
                return;
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_STYLE:
                getOwnedUmlStyle().clear();
                getOwnedUmlStyle().addAll((Collection<? extends UMLStyle>)newValue);
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
            case UMLDIPackage.UML_DIAGRAM__UML_ELEMENT:
                setUmlElement((Element)null);
                return;
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
                getOwnedUmlDiagramElement().clear();
                return;
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_STYLE:
                getOwnedUmlStyle().clear();
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
            case UMLDIPackage.UML_DIAGRAM__UML_ELEMENT:
                return umlElement != null;
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
                return ownedUmlDiagramElement != null && !ownedUmlDiagramElement.isEmpty();
            case UMLDIPackage.UML_DIAGRAM__OWNED_UML_STYLE:
                return ownedUmlStyle != null && !ownedUmlStyle.isEmpty();
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
        if (baseClass == UMLDiagramElement.class) {
            switch (derivedFeatureID) {
                case UMLDIPackage.UML_DIAGRAM__UML_ELEMENT: return UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT;
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
        if (baseClass == UMLDiagramElement.class) {
            switch (baseFeatureID) {
                case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT: return UMLDIPackage.UML_DIAGRAM__UML_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }
    @Override
    public EList getOwnedElement() {
        return getOwnedUmlDiagramElement();
    }
    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getUmlElement());
    }
} //UMLDiagramImpl
