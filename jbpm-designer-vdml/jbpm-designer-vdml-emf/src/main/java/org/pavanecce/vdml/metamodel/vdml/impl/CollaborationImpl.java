/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.Activity;
import org.pavanecce.vdml.metamodel.vdml.Assignment;
import org.pavanecce.vdml.metamodel.vdml.BusinessItem;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.DelegationContext;
import org.pavanecce.vdml.metamodel.vdml.DeliverableFlow;
import org.pavanecce.vdml.metamodel.vdml.Port;
import org.pavanecce.vdml.metamodel.vdml.PortContainer;
import org.pavanecce.vdml.metamodel.vdml.PortDelegation;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.Scenario;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getContainedPort <em>Contained Port</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getBusinessItem <em>Business Item</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getInternalPortDelegation <em>Internal Port Delegation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl#getOwnedAssignment <em>Owned Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends ParticipantImpl implements Collaboration {
    /**
     * The cached value of the '{@link #getContainedPort() <em>Contained Port</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedPort()
     * @generated
     * @ordered
     */
    protected EList<Port> containedPort;

    /**
     * The cached value of the '{@link #getCollaborationRole() <em>Collaboration Role</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollaborationRole()
     * @generated
     * @ordered
     */
    protected EList<Role> collaborationRole;

    /**
     * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivity()
     * @generated
     * @ordered
     */
    protected EList<Activity> activity;

    /**
     * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlow()
     * @generated
     * @ordered
     */
    protected EList<DeliverableFlow> flow;

    /**
     * The cached value of the '{@link #getBusinessItem() <em>Business Item</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessItem()
     * @generated
     * @ordered
     */
    protected EList<BusinessItem> businessItem;

    /**
     * The cached value of the '{@link #getInternalPortDelegation() <em>Internal Port Delegation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInternalPortDelegation()
     * @generated
     * @ordered
     */
    protected EList<PortDelegation> internalPortDelegation;

    /**
     * The cached value of the '{@link #getDelegationContext() <em>Delegation Context</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegationContext()
     * @generated
     * @ordered
     */
    protected EList<DelegationContext> delegationContext;

    /**
     * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenario()
     * @generated
     * @ordered
     */
    protected EList<Scenario> scenario;

    /**
     * The cached value of the '{@link #getOwnedAssignment() <em>Owned Assignment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedAssignment()
     * @generated
     * @ordered
     */
    protected EList<Assignment> ownedAssignment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CollaborationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.COLLABORATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Port> getContainedPort() {
        if (containedPort == null) {
            containedPort = new EObjectContainmentEList<Port>(Port.class, this, VdmlPackage.COLLABORATION__CONTAINED_PORT);
        }
        return containedPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Role> getCollaborationRole() {
        if (collaborationRole == null) {
            collaborationRole = new EObjectContainmentEList<Role>(Role.class, this, VdmlPackage.COLLABORATION__COLLABORATION_ROLE);
        }
        return collaborationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Activity> getActivity() {
        if (activity == null) {
            activity = new EObjectContainmentEList<Activity>(Activity.class, this, VdmlPackage.COLLABORATION__ACTIVITY);
        }
        return activity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DeliverableFlow> getFlow() {
        if (flow == null) {
            flow = new EObjectContainmentEList<DeliverableFlow>(DeliverableFlow.class, this, VdmlPackage.COLLABORATION__FLOW);
        }
        return flow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItem> getBusinessItem() {
        if (businessItem == null) {
            businessItem = new EObjectContainmentEList<BusinessItem>(BusinessItem.class, this, VdmlPackage.COLLABORATION__BUSINESS_ITEM);
        }
        return businessItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PortDelegation> getInternalPortDelegation() {
        if (internalPortDelegation == null) {
            internalPortDelegation = new EObjectContainmentEList<PortDelegation>(PortDelegation.class, this, VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION);
        }
        return internalPortDelegation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DelegationContext> getDelegationContext() {
        if (delegationContext == null) {
            delegationContext = new EObjectWithInverseResolvingEList<DelegationContext>(DelegationContext.class, this, VdmlPackage.COLLABORATION__DELEGATION_CONTEXT, VdmlPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION);
        }
        return delegationContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Scenario> getScenario() {
        if (scenario == null) {
            scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this, VdmlPackage.COLLABORATION__SCENARIO, VdmlPackage.SCENARIO__CONTEXT_COLLABORATION);
        }
        return scenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Assignment> getOwnedAssignment() {
        if (ownedAssignment == null) {
            ownedAssignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT);
        }
        return ownedAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.COLLABORATION__DELEGATION_CONTEXT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationContext()).basicAdd(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__SCENARIO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenario()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.COLLABORATION__CONTAINED_PORT:
                return ((InternalEList<?>)getContainedPort()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__COLLABORATION_ROLE:
                return ((InternalEList<?>)getCollaborationRole()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__ACTIVITY:
                return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__FLOW:
                return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__BUSINESS_ITEM:
                return ((InternalEList<?>)getBusinessItem()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
                return ((InternalEList<?>)getInternalPortDelegation()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__DELEGATION_CONTEXT:
                return ((InternalEList<?>)getDelegationContext()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__SCENARIO:
                return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
            case VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT:
                return ((InternalEList<?>)getOwnedAssignment()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.COLLABORATION__CONTAINED_PORT:
                return getContainedPort();
            case VdmlPackage.COLLABORATION__COLLABORATION_ROLE:
                return getCollaborationRole();
            case VdmlPackage.COLLABORATION__ACTIVITY:
                return getActivity();
            case VdmlPackage.COLLABORATION__FLOW:
                return getFlow();
            case VdmlPackage.COLLABORATION__BUSINESS_ITEM:
                return getBusinessItem();
            case VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
                return getInternalPortDelegation();
            case VdmlPackage.COLLABORATION__DELEGATION_CONTEXT:
                return getDelegationContext();
            case VdmlPackage.COLLABORATION__SCENARIO:
                return getScenario();
            case VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT:
                return getOwnedAssignment();
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
            case VdmlPackage.COLLABORATION__CONTAINED_PORT:
                getContainedPort().clear();
                getContainedPort().addAll((Collection<? extends Port>)newValue);
                return;
            case VdmlPackage.COLLABORATION__COLLABORATION_ROLE:
                getCollaborationRole().clear();
                getCollaborationRole().addAll((Collection<? extends Role>)newValue);
                return;
            case VdmlPackage.COLLABORATION__ACTIVITY:
                getActivity().clear();
                getActivity().addAll((Collection<? extends Activity>)newValue);
                return;
            case VdmlPackage.COLLABORATION__FLOW:
                getFlow().clear();
                getFlow().addAll((Collection<? extends DeliverableFlow>)newValue);
                return;
            case VdmlPackage.COLLABORATION__BUSINESS_ITEM:
                getBusinessItem().clear();
                getBusinessItem().addAll((Collection<? extends BusinessItem>)newValue);
                return;
            case VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
                getInternalPortDelegation().clear();
                getInternalPortDelegation().addAll((Collection<? extends PortDelegation>)newValue);
                return;
            case VdmlPackage.COLLABORATION__DELEGATION_CONTEXT:
                getDelegationContext().clear();
                getDelegationContext().addAll((Collection<? extends DelegationContext>)newValue);
                return;
            case VdmlPackage.COLLABORATION__SCENARIO:
                getScenario().clear();
                getScenario().addAll((Collection<? extends Scenario>)newValue);
                return;
            case VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT:
                getOwnedAssignment().clear();
                getOwnedAssignment().addAll((Collection<? extends Assignment>)newValue);
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
            case VdmlPackage.COLLABORATION__CONTAINED_PORT:
                getContainedPort().clear();
                return;
            case VdmlPackage.COLLABORATION__COLLABORATION_ROLE:
                getCollaborationRole().clear();
                return;
            case VdmlPackage.COLLABORATION__ACTIVITY:
                getActivity().clear();
                return;
            case VdmlPackage.COLLABORATION__FLOW:
                getFlow().clear();
                return;
            case VdmlPackage.COLLABORATION__BUSINESS_ITEM:
                getBusinessItem().clear();
                return;
            case VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
                getInternalPortDelegation().clear();
                return;
            case VdmlPackage.COLLABORATION__DELEGATION_CONTEXT:
                getDelegationContext().clear();
                return;
            case VdmlPackage.COLLABORATION__SCENARIO:
                getScenario().clear();
                return;
            case VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT:
                getOwnedAssignment().clear();
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
            case VdmlPackage.COLLABORATION__CONTAINED_PORT:
                return containedPort != null && !containedPort.isEmpty();
            case VdmlPackage.COLLABORATION__COLLABORATION_ROLE:
                return collaborationRole != null && !collaborationRole.isEmpty();
            case VdmlPackage.COLLABORATION__ACTIVITY:
                return activity != null && !activity.isEmpty();
            case VdmlPackage.COLLABORATION__FLOW:
                return flow != null && !flow.isEmpty();
            case VdmlPackage.COLLABORATION__BUSINESS_ITEM:
                return businessItem != null && !businessItem.isEmpty();
            case VdmlPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
                return internalPortDelegation != null && !internalPortDelegation.isEmpty();
            case VdmlPackage.COLLABORATION__DELEGATION_CONTEXT:
                return delegationContext != null && !delegationContext.isEmpty();
            case VdmlPackage.COLLABORATION__SCENARIO:
                return scenario != null && !scenario.isEmpty();
            case VdmlPackage.COLLABORATION__OWNED_ASSIGNMENT:
                return ownedAssignment != null && !ownedAssignment.isEmpty();
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
        if (baseClass == PortContainer.class) {
            switch (derivedFeatureID) {
                case VdmlPackage.COLLABORATION__CONTAINED_PORT: return VdmlPackage.PORT_CONTAINER__CONTAINED_PORT;
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
        if (baseClass == PortContainer.class) {
            switch (baseFeatureID) {
                case VdmlPackage.PORT_CONTAINER__CONTAINED_PORT: return VdmlPackage.COLLABORATION__CONTAINED_PORT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CollaborationImpl
