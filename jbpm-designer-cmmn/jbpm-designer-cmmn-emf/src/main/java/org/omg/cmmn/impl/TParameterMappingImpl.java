/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.TParameter;
import org.omg.cmmn.TParameterMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TParameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TParameterMappingImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TParameterMappingImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TParameterMappingImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TParameterMappingImpl extends TCmmnElementImpl implements TParameterMapping {
    /**
     * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformation()
     * @generated
     * @ordered
     */
    protected TExpression transformation;

    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected TParameter sourceRef;

    /**
     * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected TParameter targetRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TParameterMappingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TPARAMETER_MAPPING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TExpression getTransformation() {
        return transformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformation(TExpression newTransformation, NotificationChain msgs) {
        TExpression oldTransformation = transformation;
        transformation = newTransformation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION, oldTransformation, newTransformation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransformation(TExpression newTransformation) {
        if (newTransformation != transformation) {
            NotificationChain msgs = null;
            if (transformation != null)
                msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION, null, msgs);
            if (newTransformation != null)
                msgs = ((InternalEObject)newTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION, null, msgs);
            msgs = basicSetTransformation(newTransformation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION, newTransformation, newTransformation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TParameter getSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRef(TParameter newSourceRef) {
        TParameter oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPARAMETER_MAPPING__SOURCE_REF, oldSourceRef, sourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TParameter getTargetRef() {
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetRef(TParameter newTargetRef) {
        TParameter oldTargetRef = targetRef;
        targetRef = newTargetRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TPARAMETER_MAPPING__TARGET_REF, oldTargetRef, targetRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION:
                return basicSetTransformation(null, msgs);
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
            case CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION:
                return getTransformation();
            case CMMNPackage.TPARAMETER_MAPPING__SOURCE_REF:
                return getSourceRef();
            case CMMNPackage.TPARAMETER_MAPPING__TARGET_REF:
                return getTargetRef();
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
            case CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION:
                setTransformation((TExpression)newValue);
                return;
            case CMMNPackage.TPARAMETER_MAPPING__SOURCE_REF:
                setSourceRef((TParameter)newValue);
                return;
            case CMMNPackage.TPARAMETER_MAPPING__TARGET_REF:
                setTargetRef((TParameter)newValue);
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
            case CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION:
                setTransformation((TExpression)null);
                return;
            case CMMNPackage.TPARAMETER_MAPPING__SOURCE_REF:
                setSourceRef((TParameter)null);
                return;
            case CMMNPackage.TPARAMETER_MAPPING__TARGET_REF:
                setTargetRef((TParameter)null);
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
            case CMMNPackage.TPARAMETER_MAPPING__TRANSFORMATION:
                return transformation != null;
            case CMMNPackage.TPARAMETER_MAPPING__SOURCE_REF:
                return sourceRef != null;
            case CMMNPackage.TPARAMETER_MAPPING__TARGET_REF:
                return targetRef != null;
        }
        return super.eIsSet(featureID);
    }

} //TParameterMappingImpl
