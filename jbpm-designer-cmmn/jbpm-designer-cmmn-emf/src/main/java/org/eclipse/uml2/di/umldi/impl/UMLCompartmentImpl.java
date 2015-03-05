/**
 */
package org.eclipse.uml2.di.umldi.impl;

import java.util.Collection;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.impl.ShapeImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.di.umldi.UMLCompartment;
import org.eclipse.uml2.di.umldi.UMLDIPackage;
import org.eclipse.uml2.di.umldi.UMLShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.di.umldi.impl.UMLCompartmentImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.impl.UMLCompartmentImpl#getChildShapes <em>Child Shapes</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.impl.UMLCompartmentImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLCompartmentImpl extends ShapeImpl implements UMLCompartment {
    /**
     * The default value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExpanded()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXPANDED_EDEFAULT = true;

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
     * This is true if the Is Expanded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExpandedESet;

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
        boolean oldIsExpandedESet = isExpandedESet;
        isExpandedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED, oldIsExpanded, isExpanded, !oldIsExpandedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsExpanded() {
        boolean oldIsExpanded = isExpanded;
        boolean oldIsExpandedESet = isExpandedESet;
        isExpanded = IS_EXPANDED_EDEFAULT;
        isExpandedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED, oldIsExpanded, IS_EXPANDED_EDEFAULT, oldIsExpandedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsExpanded() {
        return isExpandedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiagramElement> getChildShapes() {
        if (childShapes == null) {
            childShapes = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, UMLDIPackage.UML_COMPARTMENT__CHILD_SHAPES);
        }
        return childShapes;
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
            case UMLDIPackage.UML_COMPARTMENT__CHILD_SHAPES:
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
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                return isIsExpanded();
            case UMLDIPackage.UML_COMPARTMENT__CHILD_SHAPES:
                return getChildShapes();
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
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                setIsExpanded((Boolean)newValue);
                return;
            case UMLDIPackage.UML_COMPARTMENT__CHILD_SHAPES:
                getChildShapes().clear();
                getChildShapes().addAll((Collection<? extends DiagramElement>)newValue);
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
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                unsetIsExpanded();
                return;
            case UMLDIPackage.UML_COMPARTMENT__CHILD_SHAPES:
                getChildShapes().clear();
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
            case UMLDIPackage.UML_COMPARTMENT__IS_EXPANDED:
                return isSetIsExpanded();
            case UMLDIPackage.UML_COMPARTMENT__CHILD_SHAPES:
                return childShapes != null && !childShapes.isEmpty();
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isExpanded: ");
        if (isExpandedESet) result.append(isExpanded); else result.append("<unset>");
        result.append(", featureName: ");
        result.append(featureName);
        result.append(')');
        return result.toString();
    }
    @Override
    public EObject getModelElement() {
        return null;
//        return ((UMLShape)eContainer()).getModelElement();
    }
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return getChildShapes();
    }
    @Override
    public DiagramElement getOwningElement() {
        return (DiagramElement) eContainer();
    }
} //UMLCompartmentImpl
