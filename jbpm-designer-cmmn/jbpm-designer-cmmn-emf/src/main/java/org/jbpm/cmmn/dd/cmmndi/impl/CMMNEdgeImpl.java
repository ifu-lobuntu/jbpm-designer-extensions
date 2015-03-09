/**
 */
package org.jbpm.cmmn.dd.cmmndi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.TCmmnElement;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.impl.EdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl#getCmmnElement <em>Cmmn Element</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMMNEdgeImpl extends EdgeImpl implements CMMNEdge {
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
     * The cached value of the '{@link #getSourceShape() <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceShape()
     * @generated
     * @ordered
     */
    protected CMMNShape sourceShape;

    /**
     * The cached value of the '{@link #getTargetShape() <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetShape()
     * @generated
     * @ordered
     */
    protected CMMNShape targetShape;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CMMNEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNDIPackage.Literals.CMMN_EDGE;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNShape getSourceShape() {
        if (sourceShape != null && sourceShape.eIsProxy()) {
            InternalEObject oldSourceShape = (InternalEObject)sourceShape;
            sourceShape = (CMMNShape)eResolveProxy(oldSourceShape);
            if (sourceShape != oldSourceShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNDIPackage.CMMN_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
            }
        }
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNShape basicGetSourceShape() {
        return sourceShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceShape(CMMNShape newSourceShape) {
        CMMNShape oldSourceShape = sourceShape;
        sourceShape = newSourceShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__SOURCE_SHAPE, oldSourceShape, sourceShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNShape getTargetShape() {
        if (targetShape != null && targetShape.eIsProxy()) {
            InternalEObject oldTargetShape = (InternalEObject)targetShape;
            targetShape = (CMMNShape)eResolveProxy(oldTargetShape);
            if (targetShape != oldTargetShape) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNDIPackage.CMMN_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
            }
        }
        return targetShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNShape basicGetTargetShape() {
        return targetShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetShape(CMMNShape newTargetShape) {
        CMMNShape oldTargetShape = targetShape;
        targetShape = newTargetShape;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_EDGE__TARGET_SHAPE, oldTargetShape, targetShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT:
                if (resolve) return getCmmnElement();
                return basicGetCmmnElement();
            case CMMNDIPackage.CMMN_EDGE__SOURCE_SHAPE:
                if (resolve) return getSourceShape();
                return basicGetSourceShape();
            case CMMNDIPackage.CMMN_EDGE__TARGET_SHAPE:
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
            case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT:
                setCmmnElement((TCmmnElement)newValue);
                return;
            case CMMNDIPackage.CMMN_EDGE__SOURCE_SHAPE:
                setSourceShape((CMMNShape)newValue);
                return;
            case CMMNDIPackage.CMMN_EDGE__TARGET_SHAPE:
                setTargetShape((CMMNShape)newValue);
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
            case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT:
                setCmmnElement((TCmmnElement)null);
                return;
            case CMMNDIPackage.CMMN_EDGE__SOURCE_SHAPE:
                setSourceShape((CMMNShape)null);
                return;
            case CMMNDIPackage.CMMN_EDGE__TARGET_SHAPE:
                setTargetShape((CMMNShape)null);
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
            case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT:
                return cmmnElement != null;
            case CMMNDIPackage.CMMN_EDGE__SOURCE_SHAPE:
                return sourceShape != null;
            case CMMNDIPackage.CMMN_EDGE__TARGET_SHAPE:
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
        if (baseClass == CMMNDiagramElement.class) {
            switch (derivedFeatureID) {
                case CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT: return CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT;
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
                case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT: return CMMNDIPackage.CMMN_EDGE__CMMN_ELEMENT;
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
        return  Collections.asList(getCmmnElement());
    }
    @Override
    public EList<DiagramElement> getOwnedElement() {
        return Collections.asList();
    }
} //CMMNEdgeImpl
