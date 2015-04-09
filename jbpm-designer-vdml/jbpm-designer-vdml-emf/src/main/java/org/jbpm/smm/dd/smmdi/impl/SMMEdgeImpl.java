/**
 */
package org.jbpm.smm.dd.smmdi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagramElement;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.jbpm.smm.dd.smmdi.SMMShape;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.impl.EdgeImpl;
import org.omg.smm.SmmElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMM Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl#getSmmElement <em>Smm Element</em>}</li>
 *   <li>{@link org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMMEdgeImpl extends EdgeImpl implements SMMEdge {
    /**
     * The cached value of the '{@link #getSmmElement() <em>Smm Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmmElement()
     * @generated
     * @ordered
     */
    protected SmmElement smmElement;

    /**
     * The cached value of the '{@link #getSourceShape() <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceShape()
     * @generated
     * @ordered
     */
    protected SMMShape sourceShape;

    /**
     * The cached value of the '{@link #getTargetShape() <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetShape()
     * @generated
     * @ordered
     */
    protected SMMShape targetShape;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMMEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMDIPackage.Literals.SMM_EDGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmElement getSmmElement() {
        if (smmElement != null && smmElement.eIsProxy()) {
            InternalEObject oldSmmElement = (InternalEObject)smmElement;
            smmElement = (SmmElement)eResolveProxy(oldSmmElement);
            if (smmElement != oldSmmElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMDIPackage.SMM_EDGE__SMM_ELEMENT, oldSmmElement, smmElement));
            }
        }
        return smmElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmElement basicGetSmmElement() {
        return smmElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmmElement(SmmElement newSmmElement) {
        SmmElement oldSmmElement = smmElement;
        smmElement = newSmmElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMDIPackage.SMM_EDGE__SMM_ELEMENT, oldSmmElement, smmElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMShape getSourceShape() {
        if (sourceShape != null && sourceShape.eIsProxy()) {
            InternalEObject oldSourceShape = (InternalEObject)sourceShape;
            sourceShape = (SMMShape)eResolveProxy(oldSourceShape);
            if (sourceShape != oldSourceShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMDIPackage.SMM_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
            }
        }
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMShape basicGetSourceShape() {
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceShape(SMMShape newSourceShape) {
        SMMShape oldSourceShape = sourceShape;
        sourceShape = newSourceShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMDIPackage.SMM_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMShape getTargetShape() {
        if (targetShape != null && targetShape.eIsProxy()) {
            InternalEObject oldTargetShape = (InternalEObject)targetShape;
            targetShape = (SMMShape)eResolveProxy(oldTargetShape);
            if (targetShape != oldTargetShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMDIPackage.SMM_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
            }
        }
        return targetShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMShape basicGetTargetShape() {
        return targetShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetShape(SMMShape newTargetShape) {
        SMMShape oldTargetShape = targetShape;
        targetShape = newTargetShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMDIPackage.SMM_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SMMDIPackage.SMM_EDGE__SMM_ELEMENT:
                if (resolve) return getSmmElement();
                return basicGetSmmElement();
            case SMMDIPackage.SMM_EDGE__SOURCE_SHAPE:
                if (resolve) return getSourceShape();
                return basicGetSourceShape();
            case SMMDIPackage.SMM_EDGE__TARGET_SHAPE:
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
            case SMMDIPackage.SMM_EDGE__SMM_ELEMENT:
                setSmmElement((SmmElement)newValue);
                return;
            case SMMDIPackage.SMM_EDGE__SOURCE_SHAPE:
                setSourceShape((SMMShape)newValue);
                return;
            case SMMDIPackage.SMM_EDGE__TARGET_SHAPE:
                setTargetShape((SMMShape)newValue);
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
            case SMMDIPackage.SMM_EDGE__SMM_ELEMENT:
                setSmmElement((SmmElement)null);
                return;
            case SMMDIPackage.SMM_EDGE__SOURCE_SHAPE:
                setSourceShape((SMMShape)null);
                return;
            case SMMDIPackage.SMM_EDGE__TARGET_SHAPE:
                setTargetShape((SMMShape)null);
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
            case SMMDIPackage.SMM_EDGE__SMM_ELEMENT:
                return smmElement != null;
            case SMMDIPackage.SMM_EDGE__SOURCE_SHAPE:
                return sourceShape != null;
            case SMMDIPackage.SMM_EDGE__TARGET_SHAPE:
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
        if (baseClass == SMMDiagramElement.class) {
            switch (derivedFeatureID) {
                case SMMDIPackage.SMM_EDGE__SMM_ELEMENT: return SMMDIPackage.SMM_DIAGRAM_ELEMENT__SMM_ELEMENT;
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
        if (baseClass == SMMDiagramElement.class) {
            switch (baseFeatureID) {
                case SMMDIPackage.SMM_DIAGRAM_ELEMENT__SMM_ELEMENT: return SMMDIPackage.SMM_EDGE__SMM_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    @Override
    public EList<EObject> getModelElement() {
        return Collections.asList(getSmmElement());
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
 } //SMMEdgeImpl
