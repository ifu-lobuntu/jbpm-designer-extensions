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
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.designer.dd.jbpmdd.impl.CompartmentImpl;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.di.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl#getPreviousWidth <em>Previous Width</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl#getPreviousHeight <em>Previous Height</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl#getOwnedShape <em>Owned Shape</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLCompartmentImpl extends CompartmentImpl implements UMLCompartment {
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
     * The cached value of the '{@link #getOwnedShape() <em>Owned Shape</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedShape()
     * @generated
     * @ordered
     */
    protected EList<UMLShape> ownedShape;

    /**
     * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureName()
     * @generated
     * @ordered
     */
    protected static final String FEATURE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureName()
     * @generated
     * @ordered
     */
    protected String featureName = FEATURE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UMLCompartmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UMLDIPackage.Literals.UML_COMPARTMENT;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT, oldUmlElement, umlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT, oldUmlElement, umlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED, oldIsExpanded, isExpanded));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH, oldPreviousWidth, previousWidth));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT, oldPreviousHeight, previousHeight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UMLShape> getOwnedShape() {
        if (ownedShape == null) {
            ownedShape = new EObjectContainmentEList<UMLShape>(UMLShape.class, this, UMLDIPackage.UML_COMPARTMENT__OWNED_SHAPE);
        }
        return ownedShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeatureName(String newFeatureName) {
        String oldFeatureName = featureName;
        featureName = newFeatureName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_COMPARTMENT__FEATURE_NAME, oldFeatureName, featureName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UMLDIPackage.UML_COMPARTMENT__OWNED_SHAPE:
                return ((InternalEList<?>)getOwnedShape()).basicRemove(otherEnd, msgs);
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
            case UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT:
                if (resolve) return getUmlElement();
                return basicGetUmlElement();
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                return isIsExpanded();
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH:
                return getPreviousWidth();
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT:
                return getPreviousHeight();
            case UMLDIPackage.UML_COMPARTMENT__OWNED_SHAPE:
                return getOwnedShape();
            case UMLDIPackage.UML_COMPARTMENT__FEATURE_NAME:
                return getFeatureName();
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
            case UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT:
                setUmlElement((Element)newValue);
                return;
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                setIsExpanded((Boolean)newValue);
                return;
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH:
                setPreviousWidth((Double)newValue);
                return;
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT:
                setPreviousHeight((Double)newValue);
                return;
            case UMLDIPackage.UML_COMPARTMENT__OWNED_SHAPE:
                getOwnedShape().clear();
                getOwnedShape().addAll((Collection<? extends UMLShape>)newValue);
                return;
            case UMLDIPackage.UML_COMPARTMENT__FEATURE_NAME:
                setFeatureName((String)newValue);
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
            case UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT:
                setUmlElement((Element)null);
                return;
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                setIsExpanded(IS_EXPANDED_EDEFAULT);
                return;
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH:
                setPreviousWidth(PREVIOUS_WIDTH_EDEFAULT);
                return;
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT:
                setPreviousHeight(PREVIOUS_HEIGHT_EDEFAULT);
                return;
            case UMLDIPackage.UML_COMPARTMENT__OWNED_SHAPE:
                getOwnedShape().clear();
                return;
            case UMLDIPackage.UML_COMPARTMENT__FEATURE_NAME:
                setFeatureName(FEATURE_NAME_EDEFAULT);
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
            case UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT:
                return umlElement != null;
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                return isExpanded != IS_EXPANDED_EDEFAULT;
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH:
                return previousWidth != PREVIOUS_WIDTH_EDEFAULT;
            case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT:
                return previousHeight != PREVIOUS_HEIGHT_EDEFAULT;
            case UMLDIPackage.UML_COMPARTMENT__OWNED_SHAPE:
                return ownedShape != null && !ownedShape.isEmpty();
            case UMLDIPackage.UML_COMPARTMENT__FEATURE_NAME:
                return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
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
                case UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT: return UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (derivedFeatureID) {
                case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED: return JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED;
                case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH;
                case UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT;
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
                case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT: return UMLDIPackage.UML_COMPARTMENT__UML_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (baseFeatureID) {
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED: return UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH: return UMLDIPackage.UML_COMPARTMENT__PREVIOUS_WIDTH;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT: return UMLDIPackage.UML_COMPARTMENT__PREVIOUS_HEIGHT;
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
        result.append(", featureName: ");
        result.append(featureName);
        result.append(')');
        return result.toString();
    }
    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList();
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public EList getOwnedElement() {
        return getOwnedShape();
    }
    @Override
    public DiagramElement getOwningElement() {
        return (DiagramElement) eContainer();
    }
    
} //UMLCompartmentImpl
