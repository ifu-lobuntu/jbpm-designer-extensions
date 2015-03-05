/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import java.util.Collection;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.impl.DiagramImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLDiagramImpl#getVDMLPlane <em>VDML Plane</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLDiagramImpl#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLDiagramImpl extends DiagramImpl implements VDMLDiagram {
    /**
     * The cached value of the '{@link #getVDMLPlane() <em>VDML Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVDMLPlane()
     * @generated
     * @ordered
     */
    protected VDMLPlane vdmlPlane;

    /**
     * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabelStyle()
     * @generated
     * @ordered
     */
    protected EList<VDMLLabelStyle> labelStyle;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VDMLDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlDiPackage.Literals.VDML_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLPlane getVDMLPlane() {
        return vdmlPlane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVDMLPlane(VDMLPlane newVDMLPlane, NotificationChain msgs) {
        VDMLPlane oldVDMLPlane = vdmlPlane;
        vdmlPlane = newVDMLPlane;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE, oldVDMLPlane, newVDMLPlane);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVDMLPlane(VDMLPlane newVDMLPlane) {
        if (newVDMLPlane != vdmlPlane) {
            NotificationChain msgs = null;
            if (vdmlPlane != null)
                msgs = ((InternalEObject)vdmlPlane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE, null, msgs);
            if (newVDMLPlane != null)
                msgs = ((InternalEObject)newVDMLPlane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE, null, msgs);
            msgs = basicSetVDMLPlane(newVDMLPlane, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE, newVDMLPlane, newVDMLPlane));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VDMLLabelStyle> getLabelStyle() {
        if (labelStyle == null) {
            labelStyle = new EObjectContainmentEList<VDMLLabelStyle>(VDMLLabelStyle.class, this, VdmlDiPackage.VDML_DIAGRAM__LABEL_STYLE);
        }
        return labelStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE:
                return basicSetVDMLPlane(null, msgs);
            case VdmlDiPackage.VDML_DIAGRAM__LABEL_STYLE:
                return ((InternalEList<?>)getLabelStyle()).basicRemove(otherEnd, msgs);
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
            case VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE:
                return getVDMLPlane();
            case VdmlDiPackage.VDML_DIAGRAM__LABEL_STYLE:
                return getLabelStyle();
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
            case VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE:
                setVDMLPlane((VDMLPlane)newValue);
                return;
            case VdmlDiPackage.VDML_DIAGRAM__LABEL_STYLE:
                getLabelStyle().clear();
                getLabelStyle().addAll((Collection<? extends VDMLLabelStyle>)newValue);
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
            case VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE:
                setVDMLPlane((VDMLPlane)null);
                return;
            case VdmlDiPackage.VDML_DIAGRAM__LABEL_STYLE:
                getLabelStyle().clear();
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
            case VdmlDiPackage.VDML_DIAGRAM__VDML_PLANE:
                return vdmlPlane != null;
            case VdmlDiPackage.VDML_DIAGRAM__LABEL_STYLE:
                return labelStyle != null && !labelStyle.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    @Override
    public DiagramElement getRootElement() {
        return getVDMLPlane();
    }
} //VDMLDiagramImpl
