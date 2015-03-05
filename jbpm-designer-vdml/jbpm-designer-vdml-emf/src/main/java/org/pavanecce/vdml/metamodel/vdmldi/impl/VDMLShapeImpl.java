/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

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
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLShape;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl#getVDMLElement <em>VDML Element</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl#isExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl#isHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl#isMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl#getOwnedShape <em>Owned Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLShapeImpl extends LabeledShapeImpl implements VDMLShape {
    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected VDMLLabel label;

    /**
     * The cached value of the '{@link #getVDMLElement() <em>VDML Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVDMLElement()
     * @generated
     * @ordered
     */
    protected VdmlElement vdmlElement;

    /**
     * The default value of the '{@link #isExpanded() <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExpanded()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXPANDED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExpanded() <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExpanded()
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
     * The default value of the '{@link #isHorizontal() <em>Is Horizontal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHorizontal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_HORIZONTAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isHorizontal() <em>Is Horizontal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHorizontal()
     * @generated
     * @ordered
     */
    protected boolean isHorizontal = IS_HORIZONTAL_EDEFAULT;

    /**
     * This is true if the Is Horizontal attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isHorizontalESet;

    /**
     * The default value of the '{@link #isMarkerVisible() <em>Is Marker Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMarkerVisible()
     * @generated
     * @ordered
     */
    protected static final boolean IS_MARKER_VISIBLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMarkerVisible() <em>Is Marker Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMarkerVisible()
     * @generated
     * @ordered
     */
    protected boolean isMarkerVisible = IS_MARKER_VISIBLE_EDEFAULT;

    /**
     * This is true if the Is Marker Visible attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isMarkerVisibleESet;

    /**
     * The cached value of the '{@link #getOwnedShape() <em>Owned Shape</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedShape()
     * @generated
     * @ordered
     */
    protected EList<DiagramElement> ownedShape;

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
        return VdmlDiPackage.Literals.VDML_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabel getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabel(VDMLLabel newLabel, NotificationChain msgs) {
        VDMLLabel oldLabel = label;
        label = newLabel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_SHAPE__LABEL, oldLabel, newLabel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(VDMLLabel newLabel) {
        if (newLabel != label) {
            NotificationChain msgs = null;
            if (label != null)
                msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlDiPackage.VDML_SHAPE__LABEL, null, msgs);
            if (newLabel != null)
                msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlDiPackage.VDML_SHAPE__LABEL, null, msgs);
            msgs = basicSetLabel(newLabel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_SHAPE__LABEL, newLabel, newLabel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement getVDMLElement() {
        if (vdmlElement != null && vdmlElement.eIsProxy()) {
            InternalEObject oldVDMLElement = (InternalEObject)vdmlElement;
            vdmlElement = (VdmlElement)eResolveProxy(oldVDMLElement);
            if (vdmlElement != oldVDMLElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlDiPackage.VDML_SHAPE__VDML_ELEMENT, oldVDMLElement, vdmlElement));
            }
        }
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement basicGetVDMLElement() {
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVDMLElement(VdmlElement newVDMLElement) {
        VdmlElement oldVDMLElement = vdmlElement;
        vdmlElement = newVDMLElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_SHAPE__VDML_ELEMENT, oldVDMLElement, vdmlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isExpanded() {
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
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_SHAPE__IS_EXPANDED, oldIsExpanded, isExpanded, !oldIsExpandedESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, VdmlDiPackage.VDML_SHAPE__IS_EXPANDED, oldIsExpanded, IS_EXPANDED_EDEFAULT, oldIsExpandedESet));
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
    public boolean isHorizontal() {
        return isHorizontal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsHorizontal(boolean newIsHorizontal) {
        boolean oldIsHorizontal = isHorizontal;
        isHorizontal = newIsHorizontal;
        boolean oldIsHorizontalESet = isHorizontalESet;
        isHorizontalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_SHAPE__IS_HORIZONTAL, oldIsHorizontal, isHorizontal, !oldIsHorizontalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsHorizontal() {
        boolean oldIsHorizontal = isHorizontal;
        boolean oldIsHorizontalESet = isHorizontalESet;
        isHorizontal = IS_HORIZONTAL_EDEFAULT;
        isHorizontalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, VdmlDiPackage.VDML_SHAPE__IS_HORIZONTAL, oldIsHorizontal, IS_HORIZONTAL_EDEFAULT, oldIsHorizontalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsHorizontal() {
        return isHorizontalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMarkerVisible() {
        return isMarkerVisible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsMarkerVisible(boolean newIsMarkerVisible) {
        boolean oldIsMarkerVisible = isMarkerVisible;
        isMarkerVisible = newIsMarkerVisible;
        boolean oldIsMarkerVisibleESet = isMarkerVisibleESet;
        isMarkerVisibleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_SHAPE__IS_MARKER_VISIBLE, oldIsMarkerVisible, isMarkerVisible, !oldIsMarkerVisibleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsMarkerVisible() {
        boolean oldIsMarkerVisible = isMarkerVisible;
        boolean oldIsMarkerVisibleESet = isMarkerVisibleESet;
        isMarkerVisible = IS_MARKER_VISIBLE_EDEFAULT;
        isMarkerVisibleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, VdmlDiPackage.VDML_SHAPE__IS_MARKER_VISIBLE, oldIsMarkerVisible, IS_MARKER_VISIBLE_EDEFAULT, oldIsMarkerVisibleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsMarkerVisible() {
        return isMarkerVisibleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiagramElement> getOwnedShape() {
        if (ownedShape == null) {
            ownedShape = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, VdmlDiPackage.VDML_SHAPE__OWNED_SHAPE);
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
            case VdmlDiPackage.VDML_SHAPE__LABEL:
                return basicSetLabel(null, msgs);
            case VdmlDiPackage.VDML_SHAPE__OWNED_SHAPE:
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
            case VdmlDiPackage.VDML_SHAPE__LABEL:
                return getLabel();
            case VdmlDiPackage.VDML_SHAPE__VDML_ELEMENT:
                if (resolve) return getVDMLElement();
                return basicGetVDMLElement();
            case VdmlDiPackage.VDML_SHAPE__IS_EXPANDED:
                return isExpanded();
            case VdmlDiPackage.VDML_SHAPE__IS_HORIZONTAL:
                return isHorizontal();
            case VdmlDiPackage.VDML_SHAPE__IS_MARKER_VISIBLE:
                return isMarkerVisible();
            case VdmlDiPackage.VDML_SHAPE__OWNED_SHAPE:
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
            case VdmlDiPackage.VDML_SHAPE__LABEL:
                setLabel((VDMLLabel)newValue);
                return;
            case VdmlDiPackage.VDML_SHAPE__VDML_ELEMENT:
                setVDMLElement((VdmlElement)newValue);
                return;
            case VdmlDiPackage.VDML_SHAPE__IS_EXPANDED:
                setIsExpanded((Boolean)newValue);
                return;
            case VdmlDiPackage.VDML_SHAPE__IS_HORIZONTAL:
                setIsHorizontal((Boolean)newValue);
                return;
            case VdmlDiPackage.VDML_SHAPE__IS_MARKER_VISIBLE:
                setIsMarkerVisible((Boolean)newValue);
                return;
            case VdmlDiPackage.VDML_SHAPE__OWNED_SHAPE:
                getOwnedShape().clear();
                getOwnedShape().addAll((Collection<? extends DiagramElement>)newValue);
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
            case VdmlDiPackage.VDML_SHAPE__LABEL:
                setLabel((VDMLLabel)null);
                return;
            case VdmlDiPackage.VDML_SHAPE__VDML_ELEMENT:
                setVDMLElement((VdmlElement)null);
                return;
            case VdmlDiPackage.VDML_SHAPE__IS_EXPANDED:
                unsetIsExpanded();
                return;
            case VdmlDiPackage.VDML_SHAPE__IS_HORIZONTAL:
                unsetIsHorizontal();
                return;
            case VdmlDiPackage.VDML_SHAPE__IS_MARKER_VISIBLE:
                unsetIsMarkerVisible();
                return;
            case VdmlDiPackage.VDML_SHAPE__OWNED_SHAPE:
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
            case VdmlDiPackage.VDML_SHAPE__LABEL:
                return label != null;
            case VdmlDiPackage.VDML_SHAPE__VDML_ELEMENT:
                return vdmlElement != null;
            case VdmlDiPackage.VDML_SHAPE__IS_EXPANDED:
                return isSetIsExpanded();
            case VdmlDiPackage.VDML_SHAPE__IS_HORIZONTAL:
                return isSetIsHorizontal();
            case VdmlDiPackage.VDML_SHAPE__IS_MARKER_VISIBLE:
                return isSetIsMarkerVisible();
            case VdmlDiPackage.VDML_SHAPE__OWNED_SHAPE:
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isExpanded: ");
        if (isExpandedESet) result.append(isExpanded); else result.append("<unset>");
        result.append(", isHorizontal: ");
        if (isHorizontalESet) result.append(isHorizontal); else result.append("<unset>");
        result.append(", isMarkerVisible: ");
        if (isMarkerVisibleESet) result.append(isMarkerVisible); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    public EObject getModelElement() {
        return getVDMLElement();
    }
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return getOwnedShape();
    }

} //VDMLShapeImpl
