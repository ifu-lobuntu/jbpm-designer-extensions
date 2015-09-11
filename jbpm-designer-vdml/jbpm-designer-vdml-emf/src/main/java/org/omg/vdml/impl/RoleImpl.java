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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Activity;
import org.omg.vdml.Assignment;
import org.omg.vdml.Port;
import org.omg.vdml.Role;
import org.omg.vdml.RoleDefinition;
import org.omg.vdml.SuppliedStore;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueProposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getPerformedWork <em>Performed Work</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getProvidedProposition <em>Provided Proposition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getReceivedProposition <em>Received Proposition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getIsLead <em>Is Lead</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getRoleDefinition <em>Role Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getRoleAssignment <em>Role Assignment</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleImpl#getSuppliedStore <em>Supplied Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends ParticipantImpl implements Role {
    /**
	 * The cached value of the '{@link #getPerformedWork() <em>Performed Work</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPerformedWork()
	 * @generated
	 * @ordered
	 */
    protected EList<Activity> performedWork;

    /**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
    protected EList<Port> port;

    /**
	 * The cached value of the '{@link #getProvidedProposition() <em>Provided Proposition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProvidedProposition()
	 * @generated
	 * @ordered
	 */
    protected EList<ValueProposition> providedProposition;

    /**
	 * The cached value of the '{@link #getReceivedProposition() <em>Received Proposition</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReceivedProposition()
	 * @generated
	 * @ordered
	 */
    protected EList<ValueProposition> receivedProposition;

    /**
	 * The default value of the '{@link #getIsLead() <em>Is Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsLead()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_LEAD_EDEFAULT = Boolean.FALSE;

    /**
	 * The cached value of the '{@link #getIsLead() <em>Is Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsLead()
	 * @generated
	 * @ordered
	 */
    protected Boolean isLead = IS_LEAD_EDEFAULT;

    /**
	 * The cached value of the '{@link #getRoleDefinition() <em>Role Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRoleDefinition()
	 * @generated
	 * @ordered
	 */
    protected RoleDefinition roleDefinition;

    /**
	 * The cached value of the '{@link #getRoleAssignment() <em>Role Assignment</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRoleAssignment()
	 * @generated
	 * @ordered
	 */
    protected EList<Assignment> roleAssignment;

    /**
	 * The cached value of the '{@link #getSuppliedStore() <em>Supplied Store</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliedStore()
	 * @generated
	 * @ordered
	 */
	protected EList<SuppliedStore> suppliedStore;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RoleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.ROLE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Activity> getPerformedWork() {
		if (performedWork == null) {
			performedWork = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this, VDMLPackage.ROLE__PERFORMED_WORK, VDMLPackage.ACTIVITY__PERFORMING_ROLE);
		}
		return performedWork;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectWithInverseResolvingEList<Port>(Port.class, this, VDMLPackage.ROLE__PORT, VDMLPackage.PORT__HANDLER);
		}
		return port;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ValueProposition> getProvidedProposition() {
		if (providedProposition == null) {
			providedProposition = new EObjectContainmentWithInverseEList<ValueProposition>(ValueProposition.class, this, VDMLPackage.ROLE__PROVIDED_PROPOSITION, VDMLPackage.VALUE_PROPOSITION__PROVIDER);
		}
		return providedProposition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ValueProposition> getReceivedProposition() {
		if (receivedProposition == null) {
			receivedProposition = new EObjectWithInverseResolvingEList<ValueProposition>(ValueProposition.class, this, VDMLPackage.ROLE__RECEIVED_PROPOSITION, VDMLPackage.VALUE_PROPOSITION__RECIPIENT);
		}
		return receivedProposition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsLead() {
		return isLead;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsLead(Boolean newIsLead) {
		Boolean oldIsLead = isLead;
		isLead = newIsLead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.ROLE__IS_LEAD, oldIsLead, isLead));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RoleDefinition getRoleDefinition() {
		if (roleDefinition != null && roleDefinition.eIsProxy()) {
			InternalEObject oldRoleDefinition = (InternalEObject)roleDefinition;
			roleDefinition = (RoleDefinition)eResolveProxy(oldRoleDefinition);
			if (roleDefinition != oldRoleDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.ROLE__ROLE_DEFINITION, oldRoleDefinition, roleDefinition));
			}
		}
		return roleDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RoleDefinition basicGetRoleDefinition() {
		return roleDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRoleDefinition(RoleDefinition newRoleDefinition) {
		RoleDefinition oldRoleDefinition = roleDefinition;
		roleDefinition = newRoleDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.ROLE__ROLE_DEFINITION, oldRoleDefinition, roleDefinition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Assignment> getRoleAssignment() {
		if (roleAssignment == null) {
			roleAssignment = new EObjectWithInverseResolvingEList<Assignment>(Assignment.class, this, VDMLPackage.ROLE__ROLE_ASSIGNMENT, VDMLPackage.ASSIGNMENT__ASSIGNED_ROLE);
		}
		return roleAssignment;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuppliedStore> getSuppliedStore() {
		if (suppliedStore == null) {
			suppliedStore = new EObjectWithInverseResolvingEList<SuppliedStore>(SuppliedStore.class, this, VDMLPackage.ROLE__SUPPLIED_STORE, VDMLPackage.SUPPLIED_STORE__SUPPLYING_ROLE);
		}
		return suppliedStore;
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
			case VDMLPackage.ROLE__PERFORMED_WORK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformedWork()).basicAdd(otherEnd, msgs);
			case VDMLPackage.ROLE__PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort()).basicAdd(otherEnd, msgs);
			case VDMLPackage.ROLE__PROVIDED_PROPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedProposition()).basicAdd(otherEnd, msgs);
			case VDMLPackage.ROLE__RECEIVED_PROPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivedProposition()).basicAdd(otherEnd, msgs);
			case VDMLPackage.ROLE__ROLE_ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleAssignment()).basicAdd(otherEnd, msgs);
			case VDMLPackage.ROLE__SUPPLIED_STORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuppliedStore()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.ROLE__PERFORMED_WORK:
				return ((InternalEList<?>)getPerformedWork()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ROLE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ROLE__PROVIDED_PROPOSITION:
				return ((InternalEList<?>)getProvidedProposition()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ROLE__RECEIVED_PROPOSITION:
				return ((InternalEList<?>)getReceivedProposition()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ROLE__ROLE_ASSIGNMENT:
				return ((InternalEList<?>)getRoleAssignment()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ROLE__SUPPLIED_STORE:
				return ((InternalEList<?>)getSuppliedStore()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.ROLE__PERFORMED_WORK:
				return getPerformedWork();
			case VDMLPackage.ROLE__PORT:
				return getPort();
			case VDMLPackage.ROLE__PROVIDED_PROPOSITION:
				return getProvidedProposition();
			case VDMLPackage.ROLE__RECEIVED_PROPOSITION:
				return getReceivedProposition();
			case VDMLPackage.ROLE__IS_LEAD:
				return getIsLead();
			case VDMLPackage.ROLE__ROLE_DEFINITION:
				if (resolve) return getRoleDefinition();
				return basicGetRoleDefinition();
			case VDMLPackage.ROLE__ROLE_ASSIGNMENT:
				return getRoleAssignment();
			case VDMLPackage.ROLE__SUPPLIED_STORE:
				return getSuppliedStore();
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
			case VDMLPackage.ROLE__PERFORMED_WORK:
				getPerformedWork().clear();
				getPerformedWork().addAll((Collection<? extends Activity>)newValue);
				return;
			case VDMLPackage.ROLE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case VDMLPackage.ROLE__PROVIDED_PROPOSITION:
				getProvidedProposition().clear();
				getProvidedProposition().addAll((Collection<? extends ValueProposition>)newValue);
				return;
			case VDMLPackage.ROLE__RECEIVED_PROPOSITION:
				getReceivedProposition().clear();
				getReceivedProposition().addAll((Collection<? extends ValueProposition>)newValue);
				return;
			case VDMLPackage.ROLE__IS_LEAD:
				setIsLead((Boolean)newValue);
				return;
			case VDMLPackage.ROLE__ROLE_DEFINITION:
				setRoleDefinition((RoleDefinition)newValue);
				return;
			case VDMLPackage.ROLE__ROLE_ASSIGNMENT:
				getRoleAssignment().clear();
				getRoleAssignment().addAll((Collection<? extends Assignment>)newValue);
				return;
			case VDMLPackage.ROLE__SUPPLIED_STORE:
				getSuppliedStore().clear();
				getSuppliedStore().addAll((Collection<? extends SuppliedStore>)newValue);
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
			case VDMLPackage.ROLE__PERFORMED_WORK:
				getPerformedWork().clear();
				return;
			case VDMLPackage.ROLE__PORT:
				getPort().clear();
				return;
			case VDMLPackage.ROLE__PROVIDED_PROPOSITION:
				getProvidedProposition().clear();
				return;
			case VDMLPackage.ROLE__RECEIVED_PROPOSITION:
				getReceivedProposition().clear();
				return;
			case VDMLPackage.ROLE__IS_LEAD:
				setIsLead(IS_LEAD_EDEFAULT);
				return;
			case VDMLPackage.ROLE__ROLE_DEFINITION:
				setRoleDefinition((RoleDefinition)null);
				return;
			case VDMLPackage.ROLE__ROLE_ASSIGNMENT:
				getRoleAssignment().clear();
				return;
			case VDMLPackage.ROLE__SUPPLIED_STORE:
				getSuppliedStore().clear();
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
			case VDMLPackage.ROLE__PERFORMED_WORK:
				return performedWork != null && !performedWork.isEmpty();
			case VDMLPackage.ROLE__PORT:
				return port != null && !port.isEmpty();
			case VDMLPackage.ROLE__PROVIDED_PROPOSITION:
				return providedProposition != null && !providedProposition.isEmpty();
			case VDMLPackage.ROLE__RECEIVED_PROPOSITION:
				return receivedProposition != null && !receivedProposition.isEmpty();
			case VDMLPackage.ROLE__IS_LEAD:
				return IS_LEAD_EDEFAULT == null ? isLead != null : !IS_LEAD_EDEFAULT.equals(isLead);
			case VDMLPackage.ROLE__ROLE_DEFINITION:
				return roleDefinition != null;
			case VDMLPackage.ROLE__ROLE_ASSIGNMENT:
				return roleAssignment != null && !roleAssignment.isEmpty();
			case VDMLPackage.ROLE__SUPPLIED_STORE:
				return suppliedStore != null && !suppliedStore.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLead: ");
		result.append(isLead);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
