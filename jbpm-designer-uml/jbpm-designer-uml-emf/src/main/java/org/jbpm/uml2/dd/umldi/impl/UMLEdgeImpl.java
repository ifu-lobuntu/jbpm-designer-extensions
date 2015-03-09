/**
 */
package org.jbpm.uml2.dd.umldi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Element;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.impl.EdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLEdgeImpl extends EdgeImpl implements UMLEdge {
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
     * The cached value of the '{@link #getSourceShape() <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceShape()
     * @generated
     * @ordered
     */
    protected UMLShape sourceShape;

    /**
     * The cached value of the '{@link #getTargetShape() <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetShape()
     * @generated
     * @ordered
     */
    protected UMLShape targetShape;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UMLEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UMLDIPackage.Literals.UML_EDGE;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_EDGE__UML_ELEMENT, oldUmlElement, umlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__UML_ELEMENT, oldUmlElement, umlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLShape getSourceShape() {
        if (sourceShape != null && sourceShape.eIsProxy()) {
            InternalEObject oldSourceShape = (InternalEObject)sourceShape;
            sourceShape = (UMLShape)eResolveProxy(oldSourceShape);
            if (sourceShape != oldSourceShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
            }
        }
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLShape basicGetSourceShape() {
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceShape(UMLShape newSourceShape) {
        UMLShape oldSourceShape = sourceShape;
        sourceShape = newSourceShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLShape getTargetShape() {
        if (targetShape != null && targetShape.eIsProxy()) {
            InternalEObject oldTargetShape = (InternalEObject)targetShape;
            targetShape = (UMLShape)eResolveProxy(oldTargetShape);
            if (targetShape != oldTargetShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
            }
        }
        return targetShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLShape basicGetTargetShape() {
        return targetShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetShape(UMLShape newTargetShape) {
        UMLShape oldTargetShape = targetShape;
        targetShape = newTargetShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UMLDIPackage.UML_EDGE__UML_ELEMENT:
                if (resolve) return getUmlElement();
                return basicGetUmlElement();
            case UMLDIPackage.UML_EDGE__SOURCE_SHAPE:
                if (resolve) return getSourceShape();
                return basicGetSourceShape();
            case UMLDIPackage.UML_EDGE__TARGET_SHAPE:
                if (resolve) return getTargetShape();
                return basicGetTargetShape();
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
            case UMLDIPackage.UML_EDGE__UML_ELEMENT:
                setUmlElement((Element)newValue);
                return;
            case UMLDIPackage.UML_EDGE__SOURCE_SHAPE:
                setSourceShape((UMLShape)newValue);
                return;
            case UMLDIPackage.UML_EDGE__TARGET_SHAPE:
                setTargetShape((UMLShape)newValue);
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
            case UMLDIPackage.UML_EDGE__UML_ELEMENT:
                setUmlElement((Element)null);
                return;
            case UMLDIPackage.UML_EDGE__SOURCE_SHAPE:
                setSourceShape((UMLShape)null);
                return;
            case UMLDIPackage.UML_EDGE__TARGET_SHAPE:
                setTargetShape((UMLShape)null);
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
            case UMLDIPackage.UML_EDGE__UML_ELEMENT:
                return umlElement != null;
            case UMLDIPackage.UML_EDGE__SOURCE_SHAPE:
                return sourceShape != null;
            case UMLDIPackage.UML_EDGE__TARGET_SHAPE:
                return targetShape != null;
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
                case UMLDIPackage.UML_EDGE__UML_ELEMENT: return UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT;
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
                case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_ELEMENT: return UMLDIPackage.UML_EDGE__UML_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    @Override
    public DiagramElement basicGetSource() {
        return getSourceShape();
    }
    @Override
    public DiagramElement basicGetTarget() {
        return getTargetShape();
    }
    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getUmlElement());
    }
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return Collections.asList();
    }
} //UMLEdgeImpl
