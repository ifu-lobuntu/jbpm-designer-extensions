/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCase Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TCaseParameterImpl#getBindingRefinement <em>Binding Refinement</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TCaseParameterImpl#getBindingRef <em>Binding Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCaseParameterImpl extends TParameterImpl implements TCaseParameter {
    /**
     * The cached value of the '{@link #getBindingRefinement() <em>Binding Refinement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindingRefinement()
     * @generated
     * @ordered
     */
    protected TExpression bindingRefinement;

    /**
     * The cached value of the '{@link #getBindingRef() <em>Binding Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindingRef()
     * @generated
     * @ordered
     */
    protected TCaseFileItem bindingRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TCaseParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TCASE_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TExpression getBindingRefinement() {
        return bindingRefinement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindingRefinement(TExpression newBindingRefinement, NotificationChain msgs) {
        TExpression oldBindingRefinement = bindingRefinement;
        bindingRefinement = newBindingRefinement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT, oldBindingRefinement, newBindingRefinement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingRefinement(TExpression newBindingRefinement) {
        if (newBindingRefinement != bindingRefinement) {
            NotificationChain msgs = null;
            if (bindingRefinement != null)
                msgs = ((InternalEObject)bindingRefinement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT, null, msgs);
            if (newBindingRefinement != null)
                msgs = ((InternalEObject)newBindingRefinement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT, null, msgs);
            msgs = basicSetBindingRefinement(newBindingRefinement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT, newBindingRefinement, newBindingRefinement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItem getBindingRef() {
        return bindingRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindingRef(TCaseFileItem newBindingRef) {
        TCaseFileItem oldBindingRef = bindingRef;
        bindingRef = newBindingRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TCASE_PARAMETER__BINDING_REF, oldBindingRef, bindingRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
                return basicSetBindingRefinement(null, msgs);
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
            case CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
                return getBindingRefinement();
            case CMMNPackage.TCASE_PARAMETER__BINDING_REF:
                return getBindingRef();
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
            case CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
                setBindingRefinement((TExpression)newValue);
                return;
            case CMMNPackage.TCASE_PARAMETER__BINDING_REF:
                setBindingRef((TCaseFileItem)newValue);
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
            case CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
                setBindingRefinement((TExpression)null);
                return;
            case CMMNPackage.TCASE_PARAMETER__BINDING_REF:
                setBindingRef((TCaseFileItem)null);
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
            case CMMNPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
                return bindingRefinement != null;
            case CMMNPackage.TCASE_PARAMETER__BINDING_REF:
                return bindingRef != null;
        }
        return super.eIsSet(featureID);
    }

} //TCaseParameterImpl
