/**
 */
package org.jbpm.vdml.dd.vdmldi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.Shape;
import org.omg.dd.di.impl.ShapeImpl;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl#getBoundaryShapes <em>Boundary Shapes</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl#getVdmlElement <em>Vdml Element</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl#getPreviousWidth <em>Previous Width</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl#getPreviousHeight <em>Previous Height</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl#getOwnedShape <em>Owned Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLShapeImpl extends ShapeImpl implements VDMLShape {
    /**
     * The cached value of the '{@link #getBoundaryShapes() <em>Boundary Shapes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoundaryShapes()
     * @generated
     * @ordered
     */
    protected EList<Shape> boundaryShapes;

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
    protected EList<VDMLShape> ownedShape;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VDMLShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLDIPackage.Literals.VDML_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Shape> getBoundaryShapes() {
        if (boundaryShapes == null) {
            boundaryShapes = new EObjectResolvingEList<Shape>(Shape.class, this, VDMLDIPackage.VDML_SHAPE__BOUNDARY_SHAPES);
        }
        return boundaryShapes;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT, oldVdmlElement, vdmlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT, oldVdmlElement, vdmlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_SHAPE__IS_EXPANDED, oldIsExpanded, isExpanded));
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
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH, oldPreviousWidth, previousWidth));
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
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT, oldPreviousHeight, previousHeight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VDMLShape> getOwnedShape() {
        if (ownedShape == null) {
            ownedShape = new EObjectContainmentEList<VDMLShape>(VDMLShape.class, this, VDMLDIPackage.VDML_SHAPE__OWNED_SHAPE);
        }
        return ownedShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLDIPackage.VDML_SHAPE__OWNED_SHAPE:
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
            case VDMLDIPackage.VDML_SHAPE__BOUNDARY_SHAPES:
                return getBoundaryShapes();
            case VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT:
                if (resolve) return getVdmlElement();
                return basicGetVdmlElement();
            case VDMLDIPackage.VDML_SHAPE__IS_EXPANDED:
                return isIsExpanded();
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH:
                return getPreviousWidth();
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT:
                return getPreviousHeight();
            case VDMLDIPackage.VDML_SHAPE__OWNED_SHAPE:
                return getOwnedShape();
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
            case VDMLDIPackage.VDML_SHAPE__BOUNDARY_SHAPES:
                getBoundaryShapes().clear();
                getBoundaryShapes().addAll((Collection<? extends Shape>)newValue);
                return;
            case VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT:
                setVdmlElement((VdmlElement)newValue);
                return;
            case VDMLDIPackage.VDML_SHAPE__IS_EXPANDED:
                setIsExpanded((Boolean)newValue);
                return;
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH:
                setPreviousWidth((Double)newValue);
                return;
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT:
                setPreviousHeight((Double)newValue);
                return;
            case VDMLDIPackage.VDML_SHAPE__OWNED_SHAPE:
                getOwnedShape().clear();
                getOwnedShape().addAll((Collection<? extends VDMLShape>)newValue);
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
            case VDMLDIPackage.VDML_SHAPE__BOUNDARY_SHAPES:
                getBoundaryShapes().clear();
                return;
            case VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT:
                setVdmlElement((VdmlElement)null);
                return;
            case VDMLDIPackage.VDML_SHAPE__IS_EXPANDED:
                setIsExpanded(IS_EXPANDED_EDEFAULT);
                return;
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH:
                setPreviousWidth(PREVIOUS_WIDTH_EDEFAULT);
                return;
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT:
                setPreviousHeight(PREVIOUS_HEIGHT_EDEFAULT);
                return;
            case VDMLDIPackage.VDML_SHAPE__OWNED_SHAPE:
                getOwnedShape().clear();
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
            case VDMLDIPackage.VDML_SHAPE__BOUNDARY_SHAPES:
                return boundaryShapes != null && !boundaryShapes.isEmpty();
            case VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT:
                return vdmlElement != null;
            case VDMLDIPackage.VDML_SHAPE__IS_EXPANDED:
                return isExpanded != IS_EXPANDED_EDEFAULT;
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH:
                return previousWidth != PREVIOUS_WIDTH_EDEFAULT;
            case VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT:
                return previousHeight != PREVIOUS_HEIGHT_EDEFAULT;
            case VDMLDIPackage.VDML_SHAPE__OWNED_SHAPE:
                return ownedShape != null && !ownedShape.isEmpty();
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
                case VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT: return VDMLDIPackage.VDML_DIAGRAM_ELEMENT__VDML_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (derivedFeatureID) {
                case VDMLDIPackage.VDML_SHAPE__IS_EXPANDED: return JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED;
                case VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH;
                case VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT;
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
                case VDMLDIPackage.VDML_DIAGRAM_ELEMENT__VDML_ELEMENT: return VDMLDIPackage.VDML_SHAPE__VDML_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (baseFeatureID) {
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED: return VDMLDIPackage.VDML_SHAPE__IS_EXPANDED;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH: return VDMLDIPackage.VDML_SHAPE__PREVIOUS_WIDTH;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT: return VDMLDIPackage.VDML_SHAPE__PREVIOUS_HEIGHT;
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
        return Collections.asList(getVdmlElement());
    }
    @Override
    public EList  getOwnedElement() {
        return getOwnedShape();
    }

} //VDMLShapeImpl
