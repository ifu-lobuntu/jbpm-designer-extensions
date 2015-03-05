/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.Assignment;
import org.pavanecce.vdml.metamodel.vdml.InputPort;
import org.pavanecce.vdml.metamodel.vdml.Participant;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl#getAssignedRole <em>Assigned Role</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl#getRoleResource <em>Role Resource</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends VdmlElementImpl implements Assignment {
    /**
     * The cached value of the '{@link #getAssignedRole() <em>Assigned Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignedRole()
     * @generated
     * @ordered
     */
    protected Role assignedRole;

    /**
     * The cached value of the '{@link #getRoleResource() <em>Role Resource</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleResource()
     * @generated
     * @ordered
     */
    protected EList<InputPort> roleResource;

    /**
     * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipant()
     * @generated
     * @ordered
     */
    protected Participant participant;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role getAssignedRole() {
        if (assignedRole != null && assignedRole.eIsProxy()) {
            InternalEObject oldAssignedRole = (InternalEObject)assignedRole;
            assignedRole = (Role)eResolveProxy(oldAssignedRole);
            if (assignedRole != oldAssignedRole) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE, oldAssignedRole, assignedRole));
            }
        }
        return assignedRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role basicGetAssignedRole() {
        return assignedRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssignedRole(Role newAssignedRole, NotificationChain msgs) {
        Role oldAssignedRole = assignedRole;
        assignedRole = newAssignedRole;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE, oldAssignedRole, newAssignedRole);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssignedRole(Role newAssignedRole) {
        if (newAssignedRole != assignedRole) {
            NotificationChain msgs = null;
            if (assignedRole != null)
                msgs = ((InternalEObject)assignedRole).eInverseRemove(this, VdmlPackage.ROLE__ROLE_ASSIGNMENT, Role.class, msgs);
            if (newAssignedRole != null)
                msgs = ((InternalEObject)newAssignedRole).eInverseAdd(this, VdmlPackage.ROLE__ROLE_ASSIGNMENT, Role.class, msgs);
            msgs = basicSetAssignedRole(newAssignedRole, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE, newAssignedRole, newAssignedRole));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputPort> getRoleResource() {
        if (roleResource == null) {
            roleResource = new EObjectWithInverseResolvingEList.ManyInverse<InputPort>(InputPort.class, this, VdmlPackage.ASSIGNMENT__ROLE_RESOURCE, VdmlPackage.INPUT_PORT__ASSIGNMENT);
        }
        return roleResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Participant getParticipant() {
        if (participant != null && participant.eIsProxy()) {
            InternalEObject oldParticipant = (InternalEObject)participant;
            participant = (Participant)eResolveProxy(oldParticipant);
            if (participant != oldParticipant) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ASSIGNMENT__PARTICIPANT, oldParticipant, participant));
            }
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Participant basicGetParticipant() {
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
        Participant oldParticipant = participant;
        participant = newParticipant;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__PARTICIPANT, oldParticipant, newParticipant);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipant(Participant newParticipant) {
        if (newParticipant != participant) {
            NotificationChain msgs = null;
            if (participant != null)
                msgs = ((InternalEObject)participant).eInverseRemove(this, VdmlPackage.PARTICIPANT__ASSIGNMENT, Participant.class, msgs);
            if (newParticipant != null)
                msgs = ((InternalEObject)newParticipant).eInverseAdd(this, VdmlPackage.PARTICIPANT__ASSIGNMENT, Participant.class, msgs);
            msgs = basicSetParticipant(newParticipant, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ASSIGNMENT__PARTICIPANT, newParticipant, newParticipant));
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
            case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
                if (assignedRole != null)
                    msgs = ((InternalEObject)assignedRole).eInverseRemove(this, VdmlPackage.ROLE__ROLE_ASSIGNMENT, Role.class, msgs);
                return basicSetAssignedRole((Role)otherEnd, msgs);
            case VdmlPackage.ASSIGNMENT__ROLE_RESOURCE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleResource()).basicAdd(otherEnd, msgs);
            case VdmlPackage.ASSIGNMENT__PARTICIPANT:
                if (participant != null)
                    msgs = ((InternalEObject)participant).eInverseRemove(this, VdmlPackage.PARTICIPANT__ASSIGNMENT, Participant.class, msgs);
                return basicSetParticipant((Participant)otherEnd, msgs);
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
            case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
                return basicSetAssignedRole(null, msgs);
            case VdmlPackage.ASSIGNMENT__ROLE_RESOURCE:
                return ((InternalEList<?>)getRoleResource()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ASSIGNMENT__PARTICIPANT:
                return basicSetParticipant(null, msgs);
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
            case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
                if (resolve) return getAssignedRole();
                return basicGetAssignedRole();
            case VdmlPackage.ASSIGNMENT__ROLE_RESOURCE:
                return getRoleResource();
            case VdmlPackage.ASSIGNMENT__PARTICIPANT:
                if (resolve) return getParticipant();
                return basicGetParticipant();
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
            case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
                setAssignedRole((Role)newValue);
                return;
            case VdmlPackage.ASSIGNMENT__ROLE_RESOURCE:
                getRoleResource().clear();
                getRoleResource().addAll((Collection<? extends InputPort>)newValue);
                return;
            case VdmlPackage.ASSIGNMENT__PARTICIPANT:
                setParticipant((Participant)newValue);
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
            case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
                setAssignedRole((Role)null);
                return;
            case VdmlPackage.ASSIGNMENT__ROLE_RESOURCE:
                getRoleResource().clear();
                return;
            case VdmlPackage.ASSIGNMENT__PARTICIPANT:
                setParticipant((Participant)null);
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
            case VdmlPackage.ASSIGNMENT__ASSIGNED_ROLE:
                return assignedRole != null;
            case VdmlPackage.ASSIGNMENT__ROLE_RESOURCE:
                return roleResource != null && !roleResource.isEmpty();
            case VdmlPackage.ASSIGNMENT__PARTICIPANT:
                return participant != null;
        }
        return super.eIsSet(featureID);
    }

} //AssignmentImpl
