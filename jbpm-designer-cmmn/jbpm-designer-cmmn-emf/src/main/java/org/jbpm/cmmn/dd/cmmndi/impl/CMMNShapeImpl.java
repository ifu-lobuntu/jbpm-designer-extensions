/**
 */
package org.jbpm.cmmn.dd.cmmndi.impl;

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
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.TCmmnElement;
import org.omg.dd.di.Shape;
import org.omg.dd.di.impl.ShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#getBoundaryShapes <em>Boundary Shapes</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#getPreviousWidth <em>Previous Width</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#getPreviousHeight <em>Previous Height</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#getOwnedShape <em>Owned Shape</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMMNShapeImpl extends ShapeImpl implements CMMNShape {
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
    protected EList<CMMNShape> ownedShape;

    /**
     * The default value of the '{@link #isIsPlanningTableExpanded() <em>Is Planning Table Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsPlanningTableExpanded()
     * @generated
     * @ordered
     */
    protected static final boolean IS_PLANNING_TABLE_EXPANDED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsPlanningTableExpanded() <em>Is Planning Table Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsPlanningTableExpanded()
     * @generated
     * @ordered
     */
    protected boolean isPlanningTableExpanded = IS_PLANNING_TABLE_EXPANDED_EDEFAULT;

    /**
     * This is true if the Is Planning Table Expanded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPlanningTableExpandedESet;

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
    protected CMMNShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNDIPackage.Literals.CMMN_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Shape> getBoundaryShapes() {
        if (boundaryShapes == null) {
            boundaryShapes = new EObjectResolvingEList<Shape>(Shape.class, this, CMMNDIPackage.CMMN_SHAPE__BOUNDARY_SHAPES);
        }
        return boundaryShapes;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED, oldIsExpanded, isExpanded));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH, oldPreviousWidth, previousWidth));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT, oldPreviousHeight, previousHeight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CMMNShape> getOwnedShape() {
        if (ownedShape == null) {
            ownedShape = new EObjectContainmentEList<CMMNShape>(CMMNShape.class, this, CMMNDIPackage.CMMN_SHAPE__OWNED_SHAPE);
        }
        return ownedShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsPlanningTableExpanded() {
        return isPlanningTableExpanded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsPlanningTableExpanded(boolean newIsPlanningTableExpanded) {
        boolean oldIsPlanningTableExpanded = isPlanningTableExpanded;
        isPlanningTableExpanded = newIsPlanningTableExpanded;
        boolean oldIsPlanningTableExpandedESet = isPlanningTableExpandedESet;
        isPlanningTableExpandedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED, oldIsPlanningTableExpanded, isPlanningTableExpanded, !oldIsPlanningTableExpandedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsPlanningTableExpanded() {
        boolean oldIsPlanningTableExpanded = isPlanningTableExpanded;
        boolean oldIsPlanningTableExpandedESet = isPlanningTableExpandedESet;
        isPlanningTableExpanded = IS_PLANNING_TABLE_EXPANDED_EDEFAULT;
        isPlanningTableExpandedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED, oldIsPlanningTableExpanded, IS_PLANNING_TABLE_EXPANDED_EDEFAULT, oldIsPlanningTableExpandedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsPlanningTableExpanded() {
        return isPlanningTableExpandedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNDIPackage.CMMN_SHAPE__OWNED_SHAPE:
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
            case CMMNDIPackage.CMMN_SHAPE__BOUNDARY_SHAPES:
                return getBoundaryShapes();
            case CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED:
                return isIsExpanded();
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH:
                return getPreviousWidth();
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT:
                return getPreviousHeight();
            case CMMNDIPackage.CMMN_SHAPE__OWNED_SHAPE:
                return getOwnedShape();
            case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED:
                return isIsPlanningTableExpanded();
            case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT:
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
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CMMNDIPackage.CMMN_SHAPE__BOUNDARY_SHAPES:
                getBoundaryShapes().clear();
                getBoundaryShapes().addAll((Collection<? extends Shape>)newValue);
                return;
            case CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED:
                setIsExpanded((Boolean)newValue);
                return;
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH:
                setPreviousWidth((Double)newValue);
                return;
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT:
                setPreviousHeight((Double)newValue);
                return;
            case CMMNDIPackage.CMMN_SHAPE__OWNED_SHAPE:
                getOwnedShape().clear();
                getOwnedShape().addAll((Collection<? extends CMMNShape>)newValue);
                return;
            case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED:
                setIsPlanningTableExpanded((Boolean)newValue);
                return;
            case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT:
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
            case CMMNDIPackage.CMMN_SHAPE__BOUNDARY_SHAPES:
                getBoundaryShapes().clear();
                return;
            case CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED:
                setIsExpanded(IS_EXPANDED_EDEFAULT);
                return;
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH:
                setPreviousWidth(PREVIOUS_WIDTH_EDEFAULT);
                return;
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT:
                setPreviousHeight(PREVIOUS_HEIGHT_EDEFAULT);
                return;
            case CMMNDIPackage.CMMN_SHAPE__OWNED_SHAPE:
                getOwnedShape().clear();
                return;
            case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED:
                unsetIsPlanningTableExpanded();
                return;
            case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT:
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
            case CMMNDIPackage.CMMN_SHAPE__BOUNDARY_SHAPES:
                return boundaryShapes != null && !boundaryShapes.isEmpty();
            case CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED:
                return isExpanded != IS_EXPANDED_EDEFAULT;
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH:
                return previousWidth != PREVIOUS_WIDTH_EDEFAULT;
            case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT:
                return previousHeight != PREVIOUS_HEIGHT_EDEFAULT;
            case CMMNDIPackage.CMMN_SHAPE__OWNED_SHAPE:
                return ownedShape != null && !ownedShape.isEmpty();
            case CMMNDIPackage.CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED:
                return isSetIsPlanningTableExpanded();
            case CMMNDIPackage.CMMN_SHAPE__CMMN_ELEMENT:
                return cmmnElement != null;
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
        if (baseClass == CMMNDiagramElement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (derivedFeatureID) {
                case CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED: return JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED;
                case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH;
                case CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT: return JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT;
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
        if (baseClass == CMMNDiagramElement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == CollapsibleShape.class) {
            switch (baseFeatureID) {
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__IS_EXPANDED: return CMMNDIPackage.CMMN_SHAPE__IS_EXPANDED;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH: return CMMNDIPackage.CMMN_SHAPE__PREVIOUS_WIDTH;
                case JBPMDDPackage.COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT: return CMMNDIPackage.CMMN_SHAPE__PREVIOUS_HEIGHT;
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
        result.append(", isPlanningTableExpanded: ");
        if (isPlanningTableExpandedESet) result.append(isPlanningTableExpanded); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }
    @Override
    public EList<EObject> getModelElement() {
        return  Collections.asList(getCmmnElement());
    }
    @Override
    public EList getOwnedElement() {
        return getOwnedShape();
    }
} //CMMNShapeImpl
