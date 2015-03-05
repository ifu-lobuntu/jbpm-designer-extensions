/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import org.eclipse.dd.cmmn.di.impl.LabelImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelImpl#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLLabelImpl extends LabelImpl implements VDMLLabel {
    /**
     * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabelStyle()
     * @generated
     * @ordered
     */
    protected VDMLLabelStyle labelStyle;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VDMLLabelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlDiPackage.Literals.VDML_LABEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabelStyle getLabelStyle() {
        if (labelStyle != null && labelStyle.eIsProxy()) {
            InternalEObject oldLabelStyle = (InternalEObject)labelStyle;
            labelStyle = (VDMLLabelStyle)eResolveProxy(oldLabelStyle);
            if (labelStyle != oldLabelStyle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlDiPackage.VDML_LABEL__LABEL_STYLE, oldLabelStyle, labelStyle));
            }
        }
        return labelStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabelStyle basicGetLabelStyle() {
        return labelStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabelStyle(VDMLLabelStyle newLabelStyle) {
        VDMLLabelStyle oldLabelStyle = labelStyle;
        labelStyle = newLabelStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_LABEL__LABEL_STYLE, oldLabelStyle, labelStyle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VdmlDiPackage.VDML_LABEL__LABEL_STYLE:
                if (resolve) return getLabelStyle();
                return basicGetLabelStyle();
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
            case VdmlDiPackage.VDML_LABEL__LABEL_STYLE:
                setLabelStyle((VDMLLabelStyle)newValue);
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
            case VdmlDiPackage.VDML_LABEL__LABEL_STYLE:
                setLabelStyle((VDMLLabelStyle)null);
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
            case VdmlDiPackage.VDML_LABEL__LABEL_STYLE:
                return labelStyle != null;
        }
        return super.eIsSet(featureID);
    }

} //VDMLLabelImpl
