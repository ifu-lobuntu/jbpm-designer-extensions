/**
 */
package org.jbpm.vdml.dd.vdmldi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.impl.EdgeImpl;
import org.omg.vdml.VdmlElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>VDML Edge</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl#getVdmlElement <em>Vdml Element</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDMLEdgeImpl extends EdgeImpl implements VDMLEdge {
    /**
     * The cached value of the '{@link #getVdmlElement() <em>Vdml Element</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getVdmlElement()
     * @generated
     * @ordered
     */
    protected VdmlElement vdmlElement;

    /**
     * The cached value of the '{@link #getSourceShape() <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSourceShape()
     * @generated
     * @ordered
     */
    protected VDMLShape sourceShape;

    /**
     * The cached value of the '{@link #getTargetShape() <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getTargetShape()
     * @generated
     * @ordered
     */
    protected VDMLShape targetShape;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected VDMLEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLDIPackage.Literals.VDML_EDGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement getVdmlElement() {
        if (vdmlElement != null && vdmlElement.eIsProxy()) {
            InternalEObject oldVdmlElement = (InternalEObject)vdmlElement;
            vdmlElement = (VdmlElement)eResolveProxy(oldVdmlElement);
            if (vdmlElement != oldVdmlElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLDIPackage.VDML_EDGE__VDML_ELEMENT, oldVdmlElement, vdmlElement));
            }
        }
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VdmlElement basicGetVdmlElement() {
        return vdmlElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVdmlElement(VdmlElement newVdmlElement) {
        VdmlElement oldVdmlElement = vdmlElement;
        vdmlElement = newVdmlElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_EDGE__VDML_ELEMENT, oldVdmlElement, vdmlElement));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VDMLShape getSourceShape() {
        if (sourceShape != null && sourceShape.eIsProxy()) {
            InternalEObject oldSourceShape = (InternalEObject)sourceShape;
            sourceShape = (VDMLShape)eResolveProxy(oldSourceShape);
            if (sourceShape != oldSourceShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLDIPackage.VDML_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
            }
        }
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VDMLShape basicGetSourceShape() {
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSourceShape(VDMLShape newSourceShape) {
        VDMLShape oldSourceShape = sourceShape;
        sourceShape = newSourceShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VDMLShape getTargetShape() {
        if (targetShape != null && targetShape.eIsProxy()) {
            InternalEObject oldTargetShape = (InternalEObject)targetShape;
            targetShape = (VDMLShape)eResolveProxy(oldTargetShape);
            if (targetShape != oldTargetShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLDIPackage.VDML_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
            }
        }
        return targetShape;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VDMLShape basicGetTargetShape() {
        return targetShape;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTargetShape(VDMLShape newTargetShape) {
        VDMLShape oldTargetShape = targetShape;
        targetShape = newTargetShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLDIPackage.VDML_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VDMLDIPackage.VDML_EDGE__VDML_ELEMENT:
                if (resolve) return getVdmlElement();
                return basicGetVdmlElement();
            case VDMLDIPackage.VDML_EDGE__SOURCE_SHAPE:
                if (resolve) return getSourceShape();
                return basicGetSourceShape();
            case VDMLDIPackage.VDML_EDGE__TARGET_SHAPE:
                if (resolve) return getTargetShape();
                return basicGetTargetShape();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case VDMLDIPackage.VDML_EDGE__VDML_ELEMENT:
                setVdmlElement((VdmlElement)newValue);
                return;
            case VDMLDIPackage.VDML_EDGE__SOURCE_SHAPE:
                setSourceShape((VDMLShape)newValue);
                return;
            case VDMLDIPackage.VDML_EDGE__TARGET_SHAPE:
                setTargetShape((VDMLShape)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case VDMLDIPackage.VDML_EDGE__VDML_ELEMENT:
                setVdmlElement((VdmlElement)null);
                return;
            case VDMLDIPackage.VDML_EDGE__SOURCE_SHAPE:
                setSourceShape((VDMLShape)null);
                return;
            case VDMLDIPackage.VDML_EDGE__TARGET_SHAPE:
                setTargetShape((VDMLShape)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case VDMLDIPackage.VDML_EDGE__VDML_ELEMENT:
                return vdmlElement != null;
            case VDMLDIPackage.VDML_EDGE__SOURCE_SHAPE:
                return sourceShape != null;
            case VDMLDIPackage.VDML_EDGE__TARGET_SHAPE:
                return targetShape != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == VDMLDiagramElement.class) {
            switch (derivedFeatureID) {
                case VDMLDIPackage.VDML_EDGE__VDML_ELEMENT: return VDMLDIPackage.VDML_DIAGRAM_ELEMENT__VDML_ELEMENT;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == VDMLDiagramElement.class) {
            switch (baseFeatureID) {
                case VDMLDIPackage.VDML_DIAGRAM_ELEMENT__VDML_ELEMENT: return VDMLDIPackage.VDML_EDGE__VDML_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getVdmlElement());
    }

    @Override
    public DiagramElement basicGetSource() {
        return this.getSourceShape();
    }

    @Override
    public DiagramElement basicGetTarget() {
        return this.getTargetShape();
    }
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return Collections.asList();
    }
} // VDMLEdgeImpl
