/**
 */
package org.omg.cmmn.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TParameterMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCase Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TCaseTaskImpl#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TCaseTaskImpl#getCaseRef <em>Case Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCaseTaskImpl extends TTaskImpl implements TCaseTask {
    /**
     * The cached value of the '{@link #getParameterMapping() <em>Parameter Mapping</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterMapping()
     * @generated
     * @ordered
     */
    protected EList<TParameterMapping> parameterMapping;

    /**
     * The cached value of the '{@link #getCaseRef() <em>Case Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCaseRef()
     * @generated
     * @ordered
     */
    protected TCase caseRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TCaseTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TCASE_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TParameterMapping> getParameterMapping() {
        if (parameterMapping == null) {
            parameterMapping = new EObjectContainmentEList<TParameterMapping>(TParameterMapping.class, this, CMMNPackage.TCASE_TASK__PARAMETER_MAPPING);
        }
        return parameterMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCase getCaseRef() {
        if (caseRef != null && caseRef.eIsProxy()) {
            InternalEObject oldCaseRef = (InternalEObject)caseRef;
            caseRef = (TCase)eResolveProxy(oldCaseRef);
            if (caseRef != oldCaseRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNPackage.TCASE_TASK__CASE_REF, oldCaseRef, caseRef));
            }
        }
        return caseRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCase basicGetCaseRef() {
        return caseRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCaseRef(TCase newCaseRef) {
        TCase oldCaseRef = caseRef;
        caseRef = newCaseRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TCASE_TASK__CASE_REF, oldCaseRef, caseRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNPackage.TCASE_TASK__PARAMETER_MAPPING:
                return ((InternalEList<?>)getParameterMapping()).basicRemove(otherEnd, msgs);
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
            case CMMNPackage.TCASE_TASK__PARAMETER_MAPPING:
                return getParameterMapping();
            case CMMNPackage.TCASE_TASK__CASE_REF:
                if (resolve) return getCaseRef();
                return basicGetCaseRef();
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
            case CMMNPackage.TCASE_TASK__PARAMETER_MAPPING:
                getParameterMapping().clear();
                getParameterMapping().addAll((Collection<? extends TParameterMapping>)newValue);
                return;
            case CMMNPackage.TCASE_TASK__CASE_REF:
                setCaseRef((TCase)newValue);
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
            case CMMNPackage.TCASE_TASK__PARAMETER_MAPPING:
                getParameterMapping().clear();
                return;
            case CMMNPackage.TCASE_TASK__CASE_REF:
                setCaseRef((TCase)null);
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
            case CMMNPackage.TCASE_TASK__PARAMETER_MAPPING:
                return parameterMapping != null && !parameterMapping.isEmpty();
            case CMMNPackage.TCASE_TASK__CASE_REF:
                return caseRef != null;
        }
        return super.eIsSet(featureID);
    }

} //TCaseTaskImpl
