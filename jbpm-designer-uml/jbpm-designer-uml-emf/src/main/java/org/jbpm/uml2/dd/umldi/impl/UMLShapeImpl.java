/**
 */
package org.jbpm.uml2.dd.umldi.impl;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.uml2.uml.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.jbpmdd.impl.*;
import org.jbpm.designer.dd.util.*;
import org.jbpm.uml2.dd.umldi.*;
import org.omg.dd.dc.*;
import org.omg.dd.di.*;
import org.omg.dd.di.impl.*;

import java.lang.Class;
import java.util.HashMap;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl#getPreviousWidth <em>Previous Width</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl#getPreviousHeight <em>Previous Height</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl#getOwnedCompartment <em>Owned Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLShapeImpl extends ShapeImpl implements UMLShape {
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
     * The default value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExpanded()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXPANDED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExpanded()
     * @generated
     * @ordered
     */
    protected boolean isExpanded = IS_EXPANDED_EDEFAULT;

    /**
     * The default value of the '{@link #getPreviousWidth() <em>Previous Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousWidth()
     * @generated
     * @ordered
     */
    protected static final double PREVIOUS_WIDTH_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPreviousWidth() <em>Previous Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousWidth()
     * @generated
     * @ordered
     */
    protected double previousWidth = PREVIOUS_WIDTH_EDEFAULT;

    /**
     * The default value of the '{@link #getPreviousHeight() <em>Previous Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousHeight()
     * @generated
     * @ordered
     */
    protected static final double PREVIOUS_HEIGHT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPreviousHeight() <em>Previous Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousHeight()
     * @generated
     * @ordered
     */
    protected double previousHeight = PREVIOUS_HEIGHT_EDEFAULT;

    /**
     * The cached value of the '{@link #getOwnedCompartment() <em>Owned Compartment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedCompartment()
     * @generated
     * @ordered
     */
    protected EList<UMLCompartment> ownedCompartment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UMLShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UMLDIPackage.Literals.UML_SHAPE;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_SHAPE__UML_ELEMENT, oldUmlElement, umlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_SHAPE__UML_ELEMENT, oldUmlElement, umlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExpanded() {
        return isExpanded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsExpanded(boolean newIsExpanded) {
        boolean oldIsExpanded = isExpanded;
        isExpanded = newIsExpanded;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_SHAPE__IS_EXPANDED, oldIsExpanded, isExpanded));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getPreviousWidth() {
        return previousWidth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreviousWidth(double newPreviousWidth) {
        double oldPreviousWidth = previousWidth;
        previousWidth = newPreviousWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH, oldPreviousWidth, previousWidth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getPreviousHeight() {
        return previousHeight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreviousHeight(double newPreviousHeight) {
        double oldPreviousHeight = previousHeight;
        previousHeight = newPreviousHeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT, oldPreviousHeight, previousHeight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UMLCompartment> getOwnedCompartment() {
        if (ownedCompartment == null) {
            ownedCompartment = new EObjectContainmentEList<UMLCompartment>(UMLCompartment.class, this, UMLDIPackage.UML_SHAPE__OWNED_COMPARTMENT);
        }
        return ownedCompartment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UMLDIPackage.UML_SHAPE__OWNED_COMPARTMENT:
                return ((InternalEList<?>)getOwnedCompartment()).basicRemove(otherEnd, msgs);
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
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                if (resolve) return getUmlElement();
                return basicGetUmlElement();
            case UMLDIPackage.UML_SHAPE__IS_EXPANDED:
                return isIsExpanded();
            case UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH:
                return getPreviousWidth();
            case UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT:
                return getPreviousHeight();
            case UMLDIPackage.UML_SHAPE__OWNED_COMPARTMENT:
                return getOwnedCompartment();
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
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                setUmlElement((Element)newValue);
                return;
            case UMLDIPackage.UML_SHAPE__IS_EXPANDED:
                setIsExpanded((Boolean)newValue);
                return;
            case UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH:
                setPreviousWidth((Double)newValue);
                return;
            case UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT:
                setPreviousHeight((Double)newValue);
                return;
            case UMLDIPackage.UML_SHAPE__OWNED_COMPARTMENT:
                getOwnedCompartment().clear();
                getOwnedCompartment().addAll((Collection<? extends UMLCompartment>)newValue);
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
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                setUmlElement((Element)null);
                return;
            case UMLDIPackage.UML_SHAPE__IS_EXPANDED:
                setIsExpanded(IS_EXPANDED_EDEFAULT);
                return;
            case UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH:
                setPreviousWidth(PREVIOUS_WIDTH_EDEFAULT);
                return;
            case UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT:
                setPreviousHeight(PREVIOUS_HEIGHT_EDEFAULT);
                return;
            case UMLDIPackage.UML_SHAPE__OWNED_COMPARTMENT:
                getOwnedCompartment().clear();
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
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                return umlElement != null;
            case UMLDIPackage.UML_SHAPE__IS_EXPANDED:
                return isExpanded != IS_EXPANDED_EDEFAULT;
            case UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH:
                return previousWidth != PREVIOUS_WIDTH_EDEFAULT;
            case UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT:
                return previousHeight != PREVIOUS_HEIGHT_EDEFAULT;
            case UMLDIPackage.UML_SHAPE__OWNED_COMPARTMENT:
                return ownedCompartment != null && !ownedCompartment.isEmpty();
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
                case UMLDIPackage.UML_SHAPE__UML_ELEMENT: return UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (derivedFeatureID) {
                case UMLDIPackage.UML_SHAPE__IS_EXPANDED: return JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED;
                case UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH;
                case UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT;
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
                case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT: return UMLDIPackage.UML_SHAPE__UML_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (baseFeatureID) {
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED: return UMLDIPackage.UML_SHAPE__IS_EXPANDED;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH: return UMLDIPackage.UML_SHAPE__PREVIOUS_WIDTH;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT: return UMLDIPackage.UML_SHAPE__PREVIOUS_HEIGHT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (isExpanded: ");
        result.append(isExpanded);
        result.append(", previousWidth: ");
        result.append(previousWidth);
        result.append(", previousHeight: ");
        result.append(previousHeight);
        result.append(')');
        return result.toString();
    }

    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getUmlElement());
    }
    @Override
    public EList getOwnedElement() {
        return getOwnedCompartment();
    }
    @Override
    public DiagramElement getOwningElement() {
        return (DiagramElement) eContainer();
    }
    
} //UMLShapeImpl
