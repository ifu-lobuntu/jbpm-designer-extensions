/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.impl.LabeledEdgeImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDML Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl#getVDMLElement <em>VDML Element</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLEdgeImpl extends LabeledEdgeImpl implements VDMLEdge {
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
     * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceElement()
     * @generated
     * @ordered
     */
    protected DiagramElement sourceElement;

    /**
     * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetElement()
     * @generated
     * @ordered
     */
    protected DiagramElement targetElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VDMLEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlDiPackage.Literals.VDML_EDGE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_EDGE__LABEL, oldLabel, newLabel);
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
                msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlDiPackage.VDML_EDGE__LABEL, null, msgs);
            if (newLabel != null)
                msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlDiPackage.VDML_EDGE__LABEL, null, msgs);
            msgs = basicSetLabel(newLabel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_EDGE__LABEL, newLabel, newLabel));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlDiPackage.VDML_EDGE__VDML_ELEMENT, oldVDMLElement, vdmlElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_EDGE__VDML_ELEMENT, oldVDMLElement, vdmlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getSourceElement() {
        if (sourceElement != null && sourceElement.eIsProxy()) {
            InternalEObject oldSourceElement = (InternalEObject)sourceElement;
            sourceElement = (DiagramElement)eResolveProxy(oldSourceElement);
            if (sourceElement != oldSourceElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlDiPackage.VDML_EDGE__SOURCE_ELEMENT, oldSourceElement, sourceElement));
            }
        }
        return sourceElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetSourceElement() {
        return sourceElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceElement(DiagramElement newSourceElement) {
        DiagramElement oldSourceElement = sourceElement;
        sourceElement = newSourceElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_EDGE__SOURCE_ELEMENT, oldSourceElement, sourceElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getTargetElement() {
        if (targetElement != null && targetElement.eIsProxy()) {
            InternalEObject oldTargetElement = (InternalEObject)targetElement;
            targetElement = (DiagramElement)eResolveProxy(oldTargetElement);
            if (targetElement != oldTargetElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlDiPackage.VDML_EDGE__TARGET_ELEMENT, oldTargetElement, targetElement));
            }
        }
        return targetElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetTargetElement() {
        return targetElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetElement(DiagramElement newTargetElement) {
        DiagramElement oldTargetElement = targetElement;
        targetElement = newTargetElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlDiPackage.VDML_EDGE__TARGET_ELEMENT, oldTargetElement, targetElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlDiPackage.VDML_EDGE__LABEL:
                return basicSetLabel(null, msgs);
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
            case VdmlDiPackage.VDML_EDGE__LABEL:
                return getLabel();
            case VdmlDiPackage.VDML_EDGE__VDML_ELEMENT:
                if (resolve) return getVDMLElement();
                return basicGetVDMLElement();
            case VdmlDiPackage.VDML_EDGE__SOURCE_ELEMENT:
                if (resolve) return getSourceElement();
                return basicGetSourceElement();
            case VdmlDiPackage.VDML_EDGE__TARGET_ELEMENT:
                if (resolve) return getTargetElement();
                return basicGetTargetElement();
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
            case VdmlDiPackage.VDML_EDGE__LABEL:
                setLabel((VDMLLabel)newValue);
                return;
            case VdmlDiPackage.VDML_EDGE__VDML_ELEMENT:
                setVDMLElement((VdmlElement)newValue);
                return;
            case VdmlDiPackage.VDML_EDGE__SOURCE_ELEMENT:
                setSourceElement((DiagramElement)newValue);
                return;
            case VdmlDiPackage.VDML_EDGE__TARGET_ELEMENT:
                setTargetElement((DiagramElement)newValue);
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
            case VdmlDiPackage.VDML_EDGE__LABEL:
                setLabel((VDMLLabel)null);
                return;
            case VdmlDiPackage.VDML_EDGE__VDML_ELEMENT:
                setVDMLElement((VdmlElement)null);
                return;
            case VdmlDiPackage.VDML_EDGE__SOURCE_ELEMENT:
                setSourceElement((DiagramElement)null);
                return;
            case VdmlDiPackage.VDML_EDGE__TARGET_ELEMENT:
                setTargetElement((DiagramElement)null);
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
            case VdmlDiPackage.VDML_EDGE__LABEL:
                return label != null;
            case VdmlDiPackage.VDML_EDGE__VDML_ELEMENT:
                return vdmlElement != null;
            case VdmlDiPackage.VDML_EDGE__SOURCE_ELEMENT:
                return sourceElement != null;
            case VdmlDiPackage.VDML_EDGE__TARGET_ELEMENT:
                return targetElement != null;
        }
        return super.eIsSet(featureID);
    }
    @Override
    public EObject getModelElement() {
        return getVDMLElement();
    }

    @Override
    public DiagramElement getSource() {
        return this.getSourceElement();
    }
    @Override
    public DiagramElement getTarget() {
        return this.getTargetElement();
    }
} //VDMLEdgeImpl
