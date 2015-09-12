/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Activity;
import org.omg.vdml.Assignment;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DelegationContext;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.PortDelegation;
import org.omg.vdml.Role;
import org.omg.vdml.Scenario;
import org.omg.vdml.SupplyingStore;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getContainedPort <em>Contained Port</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getBusinessItem <em>Business Item</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getInternalPortDelegation <em>Internal Port Delegation</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getOwnedAssignment <em>Owned Assignment</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CollaborationImpl#getSupplyingStore <em>Supplying Store</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getSupplyingStore() <em>Supplying Store</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyingStore()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyingStore> supplyingStore;

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
		return VDMLPackage.Literals.COLLABORATION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Port> getContainedPort() {
		if (containedPort == null) {
			containedPort = new EObjectContainmentEList<Port>(Port.class, this, VDMLPackage.COLLABORATION__CONTAINED_PORT);
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
			collaborationRole = new EObjectContainmentEList<Role>(Role.class, this, VDMLPackage.COLLABORATION__COLLABORATION_ROLE);
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
			activity = new EObjectContainmentWithInverseEList<Activity>(Activity.class, this, VDMLPackage.COLLABORATION__ACTIVITY, VDMLPackage.ACTIVITY__OWNING_COLLABORATION);
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
			flow = new EObjectContainmentEList<DeliverableFlow>(DeliverableFlow.class, this, VDMLPackage.COLLABORATION__FLOW);
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
			businessItem = new EObjectContainmentEList<BusinessItem>(BusinessItem.class, this, VDMLPackage.COLLABORATION__BUSINESS_ITEM);
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
			internalPortDelegation = new EObjectContainmentEList<PortDelegation>(PortDelegation.class, this, VDMLPackage.COLLABORATION__INTERNAL_PORT_DELEGATION);
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
			delegationContext = new EObjectWithInverseResolvingEList<DelegationContext>(DelegationContext.class, this, VDMLPackage.COLLABORATION__DELEGATION_CONTEXT, VDMLPackage.DELEGATION_CONTEXT__CONTEXT_COLLABORATION);
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
			scenario = new EObjectWithInverseResolvingEList.ManyInverse<Scenario>(Scenario.class, this, VDMLPackage.COLLABORATION__SCENARIO, VDMLPackage.SCENARIO__CONTEXT_COLLABORATION);
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
			ownedAssignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, VDMLPackage.COLLABORATION__OWNED_ASSIGNMENT);
		}
		return ownedAssignment;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplyingStore> getSupplyingStore() {
		if (supplyingStore == null) {
			supplyingStore = new EObjectContainmentWithInverseEList<SupplyingStore>(SupplyingStore.class, this, VDMLPackage.COLLABORATION__SUPPLYING_STORE, VDMLPackage.SUPPLYING_STORE__COLLABORATION);
		}
		return supplyingStore;
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
			case VDMLPackage.COLLABORATION__ACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity()).basicAdd(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__DELEGATION_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationContext()).basicAdd(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__SCENARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenario()).basicAdd(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__SUPPLYING_STORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupplyingStore()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.COLLABORATION__CONTAINED_PORT:
				return ((InternalEList<?>)getContainedPort()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__COLLABORATION_ROLE:
				return ((InternalEList<?>)getCollaborationRole()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__BUSINESS_ITEM:
				return ((InternalEList<?>)getBusinessItem()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
				return ((InternalEList<?>)getInternalPortDelegation()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__DELEGATION_CONTEXT:
				return ((InternalEList<?>)getDelegationContext()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__SCENARIO:
				return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__OWNED_ASSIGNMENT:
				return ((InternalEList<?>)getOwnedAssignment()).basicRemove(otherEnd, msgs);
			case VDMLPackage.COLLABORATION__SUPPLYING_STORE:
				return ((InternalEList<?>)getSupplyingStore()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.COLLABORATION__CONTAINED_PORT:
				return getContainedPort();
			case VDMLPackage.COLLABORATION__COLLABORATION_ROLE:
				return getCollaborationRole();
			case VDMLPackage.COLLABORATION__ACTIVITY:
				return getActivity();
			case VDMLPackage.COLLABORATION__FLOW:
				return getFlow();
			case VDMLPackage.COLLABORATION__BUSINESS_ITEM:
				return getBusinessItem();
			case VDMLPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
				return getInternalPortDelegation();
			case VDMLPackage.COLLABORATION__DELEGATION_CONTEXT:
				return getDelegationContext();
			case VDMLPackage.COLLABORATION__SCENARIO:
				return getScenario();
			case VDMLPackage.COLLABORATION__OWNED_ASSIGNMENT:
				return getOwnedAssignment();
			case VDMLPackage.COLLABORATION__SUPPLYING_STORE:
				return getSupplyingStore();
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
			case VDMLPackage.COLLABORATION__CONTAINED_PORT:
				getContainedPort().clear();
				getContainedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case VDMLPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				getCollaborationRole().addAll((Collection<? extends Role>)newValue);
				return;
			case VDMLPackage.COLLABORATION__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case VDMLPackage.COLLABORATION__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends DeliverableFlow>)newValue);
				return;
			case VDMLPackage.COLLABORATION__BUSINESS_ITEM:
				getBusinessItem().clear();
				getBusinessItem().addAll((Collection<? extends BusinessItem>)newValue);
				return;
			case VDMLPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
				getInternalPortDelegation().clear();
				getInternalPortDelegation().addAll((Collection<? extends PortDelegation>)newValue);
				return;
			case VDMLPackage.COLLABORATION__DELEGATION_CONTEXT:
				getDelegationContext().clear();
				getDelegationContext().addAll((Collection<? extends DelegationContext>)newValue);
				return;
			case VDMLPackage.COLLABORATION__SCENARIO:
				getScenario().clear();
				getScenario().addAll((Collection<? extends Scenario>)newValue);
				return;
			case VDMLPackage.COLLABORATION__OWNED_ASSIGNMENT:
				getOwnedAssignment().clear();
				getOwnedAssignment().addAll((Collection<? extends Assignment>)newValue);
				return;
			case VDMLPackage.COLLABORATION__SUPPLYING_STORE:
				getSupplyingStore().clear();
				getSupplyingStore().addAll((Collection<? extends SupplyingStore>)newValue);
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
			case VDMLPackage.COLLABORATION__CONTAINED_PORT:
				getContainedPort().clear();
				return;
			case VDMLPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				return;
			case VDMLPackage.COLLABORATION__ACTIVITY:
				getActivity().clear();
				return;
			case VDMLPackage.COLLABORATION__FLOW:
				getFlow().clear();
				return;
			case VDMLPackage.COLLABORATION__BUSINESS_ITEM:
				getBusinessItem().clear();
				return;
			case VDMLPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
				getInternalPortDelegation().clear();
				return;
			case VDMLPackage.COLLABORATION__DELEGATION_CONTEXT:
				getDelegationContext().clear();
				return;
			case VDMLPackage.COLLABORATION__SCENARIO:
				getScenario().clear();
				return;
			case VDMLPackage.COLLABORATION__OWNED_ASSIGNMENT:
				getOwnedAssignment().clear();
				return;
			case VDMLPackage.COLLABORATION__SUPPLYING_STORE:
				getSupplyingStore().clear();
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
			case VDMLPackage.COLLABORATION__CONTAINED_PORT:
				return containedPort != null && !containedPort.isEmpty();
			case VDMLPackage.COLLABORATION__COLLABORATION_ROLE:
				return collaborationRole != null && !collaborationRole.isEmpty();
			case VDMLPackage.COLLABORATION__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case VDMLPackage.COLLABORATION__FLOW:
				return flow != null && !flow.isEmpty();
			case VDMLPackage.COLLABORATION__BUSINESS_ITEM:
				return businessItem != null && !businessItem.isEmpty();
			case VDMLPackage.COLLABORATION__INTERNAL_PORT_DELEGATION:
				return internalPortDelegation != null && !internalPortDelegation.isEmpty();
			case VDMLPackage.COLLABORATION__DELEGATION_CONTEXT:
				return delegationContext != null && !delegationContext.isEmpty();
			case VDMLPackage.COLLABORATION__SCENARIO:
				return scenario != null && !scenario.isEmpty();
			case VDMLPackage.COLLABORATION__OWNED_ASSIGNMENT:
				return ownedAssignment != null && !ownedAssignment.isEmpty();
			case VDMLPackage.COLLABORATION__SUPPLYING_STORE:
				return supplyingStore != null && !supplyingStore.isEmpty();
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
				case VDMLPackage.COLLABORATION__CONTAINED_PORT: return VDMLPackage.PORT_CONTAINER__CONTAINED_PORT;
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
				case VDMLPackage.PORT_CONTAINER__CONTAINED_PORT: return VDMLPackage.COLLABORATION__CONTAINED_PORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CollaborationImpl
