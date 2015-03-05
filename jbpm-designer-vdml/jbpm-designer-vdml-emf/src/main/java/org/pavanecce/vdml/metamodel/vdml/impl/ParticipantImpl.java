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
import org.pavanecce.vdml.metamodel.vdml.CalendarService;
import org.pavanecce.vdml.metamodel.vdml.Participant;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ParticipantImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ParticipantImpl#getParticipantCalendar <em>Participant Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParticipantImpl extends MeasurableElementImpl implements Participant {
    /**
     * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignment()
     * @generated
     * @ordered
     */
    protected EList<Assignment> assignment;

    /**
     * The cached value of the '{@link #getParticipantCalendar() <em>Participant Calendar</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantCalendar()
     * @generated
     * @ordered
     */
    protected CalendarService participantCalendar;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParticipantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.PARTICIPANT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Assignment> getAssignment() {
        if (assignment == null) {
            assignment = new EObjectWithInverseResolvingEList<Assignment>(Assignment.class, this, VdmlPackage.PARTICIPANT__ASSIGNMENT, VdmlPackage.ASSIGNMENT__PARTICIPANT);
        }
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CalendarService getParticipantCalendar() {
        return participantCalendar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipantCalendar(CalendarService newParticipantCalendar, NotificationChain msgs) {
        CalendarService oldParticipantCalendar = participantCalendar;
        participantCalendar = newParticipantCalendar;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR, oldParticipantCalendar, newParticipantCalendar);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipantCalendar(CalendarService newParticipantCalendar) {
        if (newParticipantCalendar != participantCalendar) {
            NotificationChain msgs = null;
            if (participantCalendar != null)
                msgs = ((InternalEObject)participantCalendar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR, null, msgs);
            if (newParticipantCalendar != null)
                msgs = ((InternalEObject)newParticipantCalendar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR, null, msgs);
            msgs = basicSetParticipantCalendar(newParticipantCalendar, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR, newParticipantCalendar, newParticipantCalendar));
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
            case VdmlPackage.PARTICIPANT__ASSIGNMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignment()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.PARTICIPANT__ASSIGNMENT:
                return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
            case VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR:
                return basicSetParticipantCalendar(null, msgs);
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
            case VdmlPackage.PARTICIPANT__ASSIGNMENT:
                return getAssignment();
            case VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR:
                return getParticipantCalendar();
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
            case VdmlPackage.PARTICIPANT__ASSIGNMENT:
                getAssignment().clear();
                getAssignment().addAll((Collection<? extends Assignment>)newValue);
                return;
            case VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR:
                setParticipantCalendar((CalendarService)newValue);
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
            case VdmlPackage.PARTICIPANT__ASSIGNMENT:
                getAssignment().clear();
                return;
            case VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR:
                setParticipantCalendar((CalendarService)null);
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
            case VdmlPackage.PARTICIPANT__ASSIGNMENT:
                return assignment != null && !assignment.isEmpty();
            case VdmlPackage.PARTICIPANT__PARTICIPANT_CALENDAR:
                return participantCalendar != null;
        }
        return super.eIsSet(featureID);
    }

} //ParticipantImpl
