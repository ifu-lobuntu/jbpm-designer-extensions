/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Activity;
import org.omg.vdml.AnalysisContext;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DelegationContext;
import org.omg.vdml.PortDelegation;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.DelegationContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DelegationContextImpl#getContextBasedPortDelegation <em>Context Based Port Delegation</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DelegationContextImpl#getDelegatedActivity <em>Delegated Activity</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DelegationContextImpl#getContextCollaboration <em>Context Collaboration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationContextImpl extends AnalysisContextImpl implements DelegationContext {
    /**
     * The cached value of the '{@link #getContextBasedPortDelegation() <em>Context Based Port Delegation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextBasedPortDelegation()
     * @generated
     * @ordered
     */
    protected EList<PortDelegation> contextBasedPortDelegation;

    /**
     * The cached value of the '{@link #getDelegatedActivity() <em>Delegated Activity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegatedActivity()
     * @generated
     * @ordered
     */
    protected Activity delegatedActivity;

    /**
     * The cached value of the '{@link #getContextCollaboration() <em>Context Collaboration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextCollaboration()
     * @generated
     * @ordered
     */
    protected Collaboration contextCollaboration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DelegationContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.DELEGATION_CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisContext getParentContext() {
        if (eContainerFeatureID() != VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT) return null;
        return (AnalysisContext)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentContext(AnalysisContext newParentContext, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentContext, VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentContext(AnalysisContext newParentContext) {
        if (newParentContext != eInternalContainer() || (eContainerFeatureID() != VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT && newParentContext != null)) {
            if (EcoreUtil.isAncestor(this, newParentContext))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentContext != null)
                msgs = ((InternalEObject)newParentContext).eInverseAdd(this, VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT, AnalysisContext.class, msgs);
            msgs = basicSetParentContext(newParentContext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PortDelegation> getContextBasedPortDelegation() {
        if (contextBasedPortDelegation == null) {
            contextBasedPortDelegation = new EObjectContainmentEList<PortDelegation>(PortDelegation.class, this, VDMLPackage.DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION);
        }
        return contextBasedPortDelegation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity getDelegatedActivity() {
        if (delegatedActivity != null && delegatedActivity.eIsProxy()) {
            InternalEObject oldDelegatedActivity = (InternalEObject)delegatedActivity;
            delegatedActivity = (Activity)eResolveProxy(oldDelegatedActivity);
            if (delegatedActivity != oldDelegatedActivity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY, oldDelegatedActivity, delegatedActivity));
            }
        }
        return delegatedActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity basicGetDelegatedActivity() {
        return delegatedActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDelegatedActivity(Activity newDelegatedActivity, NotificationChain msgs) {
        Activity oldDelegatedActivity = delegatedActivity;
        delegatedActivity = newDelegatedActivity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY, oldDelegatedActivity, newDelegatedActivity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelegatedActivity(Activity newDelegatedActivity) {
        if (newDelegatedActivity != delegatedActivity) {
            NotificationChain msgs = null;
            if (delegatedActivity != null)
                msgs = ((InternalEObject)delegatedActivity).eInverseRemove(this, VDMLPackage.ACTIVITY__DELEGATION_CONTEXT, Activity.class, msgs);
            if (newDelegatedActivity != null)
                msgs = ((InternalEObject)newDelegatedActivity).eInverseAdd(this, VDMLPackage.ACTIVITY__DELEGATION_CONTEXT, Activity.class, msgs);
            msgs = basicSetDelegatedActivity(newDelegatedActivity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY, newDelegatedActivity, newDelegatedActivity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collaboration getContextCollaboration() {
        if (contextCollaboration != null && contextCollaboration.eIsProxy()) {
            InternalEObject oldContextCollaboration = (InternalEObject)contextCollaboration;
            contextCollaboration = (Collaboration)eResolveProxy(oldContextCollaboration);
            if (contextCollaboration != oldContextCollaboration) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION, oldContextCollaboration, contextCollaboration));
            }
        }
        return contextCollaboration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collaboration basicGetContextCollaboration() {
        return contextCollaboration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextCollaboration(Collaboration newContextCollaboration, NotificationChain msgs) {
        Collaboration oldContextCollaboration = contextCollaboration;
        contextCollaboration = newContextCollaboration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION, oldContextCollaboration, newContextCollaboration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextCollaboration(Collaboration newContextCollaboration) {
        if (newContextCollaboration != contextCollaboration) {
            NotificationChain msgs = null;
            if (contextCollaboration != null)
                msgs = ((InternalEObject)contextCollaboration).eInverseRemove(this, VDMLPackage.COLLABORATION__DELEGATION_CONTEXT, Collaboration.class, msgs);
            if (newContextCollaboration != null)
                msgs = ((InternalEObject)newContextCollaboration).eInverseAdd(this, VDMLPackage.COLLABORATION__DELEGATION_CONTEXT, Collaboration.class, msgs);
            msgs = basicSetContextCollaboration(newContextCollaboration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION, newContextCollaboration, newContextCollaboration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentContext((AnalysisContext)otherEnd, msgs);
            case VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY:
                if (delegatedActivity != null)
                    msgs = ((InternalEObject)delegatedActivity).eInverseRemove(this, VDMLPackage.ACTIVITY__DELEGATION_CONTEXT, Activity.class, msgs);
                return basicSetDelegatedActivity((Activity)otherEnd, msgs);
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION:
                if (contextCollaboration != null)
                    msgs = ((InternalEObject)contextCollaboration).eInverseRemove(this, VDMLPackage.COLLABORATION__DELEGATION_CONTEXT, Collaboration.class, msgs);
                return basicSetContextCollaboration((Collaboration)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                return basicSetParentContext(null, msgs);
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION:
                return ((InternalEList<?>)getContextBasedPortDelegation()).basicRemove(otherEnd, msgs);
            case VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY:
                return basicSetDelegatedActivity(null, msgs);
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION:
                return basicSetContextCollaboration(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                return eInternalContainer().eInverseRemove(this, VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT, AnalysisContext.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                return getParentContext();
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION:
                return getContextBasedPortDelegation();
            case VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY:
                if (resolve) return getDelegatedActivity();
                return basicGetDelegatedActivity();
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION:
                if (resolve) return getContextCollaboration();
                return basicGetContextCollaboration();
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
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                setParentContext((AnalysisContext)newValue);
                return;
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION:
                getContextBasedPortDelegation().clear();
                getContextBasedPortDelegation().addAll((Collection<? extends PortDelegation>)newValue);
                return;
            case VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY:
                setDelegatedActivity((Activity)newValue);
                return;
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION:
                setContextCollaboration((Collaboration)newValue);
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
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                setParentContext((AnalysisContext)null);
                return;
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION:
                getContextBasedPortDelegation().clear();
                return;
            case VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY:
                setDelegatedActivity((Activity)null);
                return;
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION:
                setContextCollaboration((Collaboration)null);
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
            case VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT:
                return getParentContext() != null;
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION:
                return contextBasedPortDelegation != null && !contextBasedPortDelegation.isEmpty();
            case VDMLPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY:
                return delegatedActivity != null;
            case VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION:
                return contextCollaboration != null;
        }
        return super.eIsSet(featureID);
    }

} //DelegationContextImpl
