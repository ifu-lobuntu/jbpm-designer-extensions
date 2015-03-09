/**
 */
package org.omg.smm.impl;

import java.lang.reflect.InvocationTargetException;
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
import org.omg.smm.Measurement;
import org.omg.smm.MeasurementRelationship;
import org.omg.smm.ObservedMeasure;
import org.omg.smm.SMMPackage;
import org.omg.smm.string;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.MeasurementImpl#getBreakValue <em>Break Value</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasurementImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasurementImpl#getMeasurementRelationships <em>Measurement Relationships</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasurementImpl#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends SmmElementImpl implements Measurement {
    /**
     * The cached value of the '{@link #getBreakValue() <em>Break Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakValue()
     * @generated
     * @ordered
     */
    protected string breakValue;
    /**
     * The cached value of the '{@link #getError() <em>Error</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getError()
     * @generated
     * @ordered
     */
    protected string error;
    /**
     * The cached value of the '{@link #getMeasurementRelationships() <em>Measurement Relationships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementRelationships()
     * @generated
     * @ordered
     */
    protected EList<MeasurementRelationship> measurementRelationships;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getBreakValue() {
        if (breakValue != null && breakValue.eIsProxy()) {
            InternalEObject oldBreakValue = (InternalEObject)breakValue;
            breakValue = (string)eResolveProxy(oldBreakValue);
            if (breakValue != oldBreakValue) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.MEASUREMENT__BREAK_VALUE, oldBreakValue, breakValue));
            }
        }
        return breakValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetBreakValue() {
        return breakValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBreakValue(string newBreakValue) {
        string oldBreakValue = breakValue;
        breakValue = newBreakValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASUREMENT__BREAK_VALUE, oldBreakValue, breakValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getError() {
        if (error != null && error.eIsProxy()) {
            InternalEObject oldError = (InternalEObject)error;
            error = (string)eResolveProxy(oldError);
            if (error != oldError) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.MEASUREMENT__ERROR, oldError, error));
            }
        }
        return error;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetError() {
        return error;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setError(string newError) {
        string oldError = error;
        error = newError;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASUREMENT__ERROR, oldError, error));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeasurementRelationship> getMeasurementRelationships() {
        if (measurementRelationships == null) {
            measurementRelationships = new EObjectContainmentEList<MeasurementRelationship>(MeasurementRelationship.class, this, SMMPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS);
        }
        return measurementRelationships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservedMeasure getObservedMeasure() {
        if (eContainerFeatureID() != SMMPackage.MEASUREMENT__OBSERVED_MEASURE) return null;
        return (ObservedMeasure)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObservedMeasure(ObservedMeasure newObservedMeasure, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObservedMeasure, SMMPackage.MEASUREMENT__OBSERVED_MEASURE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObservedMeasure(ObservedMeasure newObservedMeasure) {
        if (newObservedMeasure != eInternalContainer() || (eContainerFeatureID() != SMMPackage.MEASUREMENT__OBSERVED_MEASURE && newObservedMeasure != null)) {
            if (EcoreUtil.isAncestor(this, newObservedMeasure))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObservedMeasure != null)
                msgs = ((InternalEObject)newObservedMeasure).eInverseAdd(this, SMMPackage.OBSERVED_MEASURE__MEASUREMENTS, ObservedMeasure.class, msgs);
            msgs = basicSetObservedMeasure(newObservedMeasure, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASUREMENT__OBSERVED_MEASURE, newObservedMeasure, newObservedMeasure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getMeasureLabel() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getMeasurementLabel() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetObservedMeasure((ObservedMeasure)otherEnd, msgs);
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
            case SMMPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
                return ((InternalEList<?>)getMeasurementRelationships()).basicRemove(otherEnd, msgs);
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                return basicSetObservedMeasure(null, msgs);
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
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                return eInternalContainer().eInverseRemove(this, SMMPackage.OBSERVED_MEASURE__MEASUREMENTS, ObservedMeasure.class, msgs);
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
            case SMMPackage.MEASUREMENT__BREAK_VALUE:
                if (resolve) return getBreakValue();
                return basicGetBreakValue();
            case SMMPackage.MEASUREMENT__ERROR:
                if (resolve) return getError();
                return basicGetError();
            case SMMPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
                return getMeasurementRelationships();
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                return getObservedMeasure();
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
            case SMMPackage.MEASUREMENT__BREAK_VALUE:
                setBreakValue((string)newValue);
                return;
            case SMMPackage.MEASUREMENT__ERROR:
                setError((string)newValue);
                return;
            case SMMPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
                getMeasurementRelationships().clear();
                getMeasurementRelationships().addAll((Collection<? extends MeasurementRelationship>)newValue);
                return;
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                setObservedMeasure((ObservedMeasure)newValue);
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
            case SMMPackage.MEASUREMENT__BREAK_VALUE:
                setBreakValue((string)null);
                return;
            case SMMPackage.MEASUREMENT__ERROR:
                setError((string)null);
                return;
            case SMMPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
                getMeasurementRelationships().clear();
                return;
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                setObservedMeasure((ObservedMeasure)null);
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
            case SMMPackage.MEASUREMENT__BREAK_VALUE:
                return breakValue != null;
            case SMMPackage.MEASUREMENT__ERROR:
                return error != null;
            case SMMPackage.MEASUREMENT__MEASUREMENT_RELATIONSHIPS:
                return measurementRelationships != null && !measurementRelationships.isEmpty();
            case SMMPackage.MEASUREMENT__OBSERVED_MEASURE:
                return getObservedMeasure() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SMMPackage.MEASUREMENT___GET_MEASURE_LABEL:
                return getMeasureLabel();
            case SMMPackage.MEASUREMENT___GET_MEASUREMENT_LABEL:
                return getMeasurementLabel();
        }
        return super.eInvoke(operationID, arguments);
    }

} //MeasurementImpl
