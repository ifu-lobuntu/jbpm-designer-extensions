/**
 */
package org.eclipse.uml2.di.umldi.impl;

import java.util.Collection;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.impl.LabeledShapeImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.di.umldi.UMLDIPackage;
import org.eclipse.uml2.di.umldi.UMLLabel;
import org.eclipse.uml2.di.umldi.UMLShape;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.di.umldi.impl.UMLShapeImpl#getUmlLabel <em>Uml Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.impl.UMLShapeImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.impl.UMLShapeImpl#getChildShapes <em>Child Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLShapeImpl extends LabeledShapeImpl implements UMLShape {
    /**
     * The cached value of the '{@link #getUmlLabel() <em>Uml Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmlLabel()
     * @generated
     * @ordered
     */
    protected UMLLabel umlLabel;

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
     * The cached value of the '{@link #getChildShapes() <em>Child Shapes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildShapes()
     * @generated
     * @ordered
     */
    protected EList<DiagramElement> childShapes;

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
    public UMLLabel getUmlLabel() {
        return umlLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUmlLabel(UMLLabel newUmlLabel, NotificationChain msgs) {
        UMLLabel oldUmlLabel = umlLabel;
        umlLabel = newUmlLabel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_SHAPE__UML_LABEL, oldUmlLabel, newUmlLabel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUmlLabel(UMLLabel newUmlLabel) {
        if (newUmlLabel != umlLabel) {
            NotificationChain msgs = null;
            if (umlLabel != null)
                msgs = ((InternalEObject)umlLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.UML_SHAPE__UML_LABEL, null, msgs);
            if (newUmlLabel != null)
                msgs = ((InternalEObject)newUmlLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.UML_SHAPE__UML_LABEL, null, msgs);
            msgs = basicSetUmlLabel(newUmlLabel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_SHAPE__UML_LABEL, newUmlLabel, newUmlLabel));
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
    public EList<DiagramElement> getChildShapes() {
        if (childShapes == null) {
            childShapes = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, UMLDIPackage.UML_SHAPE__CHILD_SHAPES);
        }
        return childShapes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UMLDIPackage.UML_SHAPE__UML_LABEL:
                return basicSetUmlLabel(null, msgs);
            case UMLDIPackage.UML_SHAPE__CHILD_SHAPES:
                return ((InternalEList<?>)getChildShapes()).basicRemove(otherEnd, msgs);
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
            case UMLDIPackage.UML_SHAPE__UML_LABEL:
                return getUmlLabel();
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                if (resolve) return getUmlElement();
                return basicGetUmlElement();
            case UMLDIPackage.UML_SHAPE__CHILD_SHAPES:
                return getChildShapes();
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
            case UMLDIPackage.UML_SHAPE__UML_LABEL:
                setUmlLabel((UMLLabel)newValue);
                return;
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                setUmlElement((Element)newValue);
                return;
            case UMLDIPackage.UML_SHAPE__CHILD_SHAPES:
                getChildShapes().clear();
                getChildShapes().addAll((Collection<? extends DiagramElement>)newValue);
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
            case UMLDIPackage.UML_SHAPE__UML_LABEL:
                setUmlLabel((UMLLabel)null);
                return;
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                setUmlElement((Element)null);
                return;
            case UMLDIPackage.UML_SHAPE__CHILD_SHAPES:
                getChildShapes().clear();
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
            case UMLDIPackage.UML_SHAPE__UML_LABEL:
                return umlLabel != null;
            case UMLDIPackage.UML_SHAPE__UML_ELEMENT:
                return umlElement != null;
            case UMLDIPackage.UML_SHAPE__CHILD_SHAPES:
                return childShapes != null && !childShapes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    @Override
    public EObject getModelElement() {
        return getUmlElement();
    }
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return getChildShapes();
    }
    @Override
    public DiagramElement getOwningElement() {
        return (DiagramElement) eContainer();
    }
} //UMLShapeImpl
