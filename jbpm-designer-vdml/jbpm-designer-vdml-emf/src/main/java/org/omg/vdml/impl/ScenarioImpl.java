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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Actor;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.ReleaseControl;
import org.omg.vdml.Scenario;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getReleaseControl <em>Release Control</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getIsCommon <em>Is Common</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getHeatThreshold <em>Heat Threshold</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getContextActor <em>Context Actor</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ScenarioImpl#getContextCollaboration <em>Context Collaboration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends AnalysisContextImpl implements Scenario {
    /**
     * The cached value of the '{@link #getHorizon() <em>Horizon</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHorizon()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic horizon;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getReleaseControl() <em>Release Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleaseControl()
     * @generated
     * @ordered
     */
    protected EList<ReleaseControl> releaseControl;

    /**
     * The default value of the '{@link #getIsCommon() <em>Is Common</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsCommon()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_COMMON_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsCommon() <em>Is Common</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsCommon()
     * @generated
     * @ordered
     */
    protected Boolean isCommon = IS_COMMON_EDEFAULT;

    /**
     * The cached value of the '{@link #getHeatThreshold() <em>Heat Threshold</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatThreshold()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic heatThreshold;

    /**
     * The cached value of the '{@link #getContextActor() <em>Context Actor</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextActor()
     * @generated
     * @ordered
     */
    protected EList<Actor> contextActor;

    /**
     * The cached value of the '{@link #getContextCollaboration() <em>Context Collaboration</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextCollaboration()
     * @generated
     * @ordered
     */
    protected EList<Collaboration> contextCollaboration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScenarioImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.SCENARIO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getHorizon() {
        return horizon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHorizon(MeasuredCharacteristic newHorizon, NotificationChain msgs) {
        MeasuredCharacteristic oldHorizon = horizon;
        horizon = newHorizon;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SCENARIO__HORIZON, oldHorizon, newHorizon);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHorizon(MeasuredCharacteristic newHorizon) {
        if (newHorizon != horizon) {
            NotificationChain msgs = null;
            if (horizon != null)
                msgs = ((InternalEObject)horizon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SCENARIO__HORIZON, null, msgs);
            if (newHorizon != null)
                msgs = ((InternalEObject)newHorizon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SCENARIO__HORIZON, null, msgs);
            msgs = basicSetHorizon(newHorizon, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SCENARIO__HORIZON, newHorizon, newHorizon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SCENARIO__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ReleaseControl> getReleaseControl() {
        if (releaseControl == null) {
            releaseControl = new EObjectWithInverseResolvingEList.ManyInverse<ReleaseControl>(ReleaseControl.class, this, VDMLPackage.SCENARIO__RELEASE_CONTROL, VDMLPackage.RELEASE_CONTROL__SCENARIO);
        }
        return releaseControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsCommon() {
        return isCommon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsCommon(Boolean newIsCommon) {
        Boolean oldIsCommon = isCommon;
        isCommon = newIsCommon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SCENARIO__IS_COMMON, oldIsCommon, isCommon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getHeatThreshold() {
        return heatThreshold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHeatThreshold(MeasuredCharacteristic newHeatThreshold, NotificationChain msgs) {
        MeasuredCharacteristic oldHeatThreshold = heatThreshold;
        heatThreshold = newHeatThreshold;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SCENARIO__HEAT_THRESHOLD, oldHeatThreshold, newHeatThreshold);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeatThreshold(MeasuredCharacteristic newHeatThreshold) {
        if (newHeatThreshold != heatThreshold) {
            NotificationChain msgs = null;
            if (heatThreshold != null)
                msgs = ((InternalEObject)heatThreshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SCENARIO__HEAT_THRESHOLD, null, msgs);
            if (newHeatThreshold != null)
                msgs = ((InternalEObject)newHeatThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SCENARIO__HEAT_THRESHOLD, null, msgs);
            msgs = basicSetHeatThreshold(newHeatThreshold, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SCENARIO__HEAT_THRESHOLD, newHeatThreshold, newHeatThreshold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Actor> getContextActor() {
        if (contextActor == null) {
            contextActor = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, VDMLPackage.SCENARIO__CONTEXT_ACTOR, VDMLPackage.ACTOR__SCENARIO);
        }
        return contextActor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Collaboration> getContextCollaboration() {
        if (contextCollaboration == null) {
            contextCollaboration = new EObjectWithInverseResolvingEList.ManyInverse<Collaboration>(Collaboration.class, this, VDMLPackage.SCENARIO__CONTEXT_COLLABORATION, VDMLPackage.COLLABORATION__SCENARIO);
        }
        return contextCollaboration;
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
            case VDMLPackage.SCENARIO__RELEASE_CONTROL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleaseControl()).basicAdd(otherEnd, msgs);
            case VDMLPackage.SCENARIO__CONTEXT_ACTOR:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextActor()).basicAdd(otherEnd, msgs);
            case VDMLPackage.SCENARIO__CONTEXT_COLLABORATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextCollaboration()).basicAdd(otherEnd, msgs);
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
            case VDMLPackage.SCENARIO__HORIZON:
                return basicSetHorizon(null, msgs);
            case VDMLPackage.SCENARIO__RELEASE_CONTROL:
                return ((InternalEList<?>)getReleaseControl()).basicRemove(otherEnd, msgs);
            case VDMLPackage.SCENARIO__HEAT_THRESHOLD:
                return basicSetHeatThreshold(null, msgs);
            case VDMLPackage.SCENARIO__CONTEXT_ACTOR:
                return ((InternalEList<?>)getContextActor()).basicRemove(otherEnd, msgs);
            case VDMLPackage.SCENARIO__CONTEXT_COLLABORATION:
                return ((InternalEList<?>)getContextCollaboration()).basicRemove(otherEnd, msgs);
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
            case VDMLPackage.SCENARIO__HORIZON:
                return getHorizon();
            case VDMLPackage.SCENARIO__TYPE:
                return getType();
            case VDMLPackage.SCENARIO__RELEASE_CONTROL:
                return getReleaseControl();
            case VDMLPackage.SCENARIO__IS_COMMON:
                return getIsCommon();
            case VDMLPackage.SCENARIO__HEAT_THRESHOLD:
                return getHeatThreshold();
            case VDMLPackage.SCENARIO__CONTEXT_ACTOR:
                return getContextActor();
            case VDMLPackage.SCENARIO__CONTEXT_COLLABORATION:
                return getContextCollaboration();
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
            case VDMLPackage.SCENARIO__HORIZON:
                setHorizon((MeasuredCharacteristic)newValue);
                return;
            case VDMLPackage.SCENARIO__TYPE:
                setType((String)newValue);
                return;
            case VDMLPackage.SCENARIO__RELEASE_CONTROL:
                getReleaseControl().clear();
                getReleaseControl().addAll((Collection<? extends ReleaseControl>)newValue);
                return;
            case VDMLPackage.SCENARIO__IS_COMMON:
                setIsCommon((Boolean)newValue);
                return;
            case VDMLPackage.SCENARIO__HEAT_THRESHOLD:
                setHeatThreshold((MeasuredCharacteristic)newValue);
                return;
            case VDMLPackage.SCENARIO__CONTEXT_ACTOR:
                getContextActor().clear();
                getContextActor().addAll((Collection<? extends Actor>)newValue);
                return;
            case VDMLPackage.SCENARIO__CONTEXT_COLLABORATION:
                getContextCollaboration().clear();
                getContextCollaboration().addAll((Collection<? extends Collaboration>)newValue);
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
            case VDMLPackage.SCENARIO__HORIZON:
                setHorizon((MeasuredCharacteristic)null);
                return;
            case VDMLPackage.SCENARIO__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case VDMLPackage.SCENARIO__RELEASE_CONTROL:
                getReleaseControl().clear();
                return;
            case VDMLPackage.SCENARIO__IS_COMMON:
                setIsCommon(IS_COMMON_EDEFAULT);
                return;
            case VDMLPackage.SCENARIO__HEAT_THRESHOLD:
                setHeatThreshold((MeasuredCharacteristic)null);
                return;
            case VDMLPackage.SCENARIO__CONTEXT_ACTOR:
                getContextActor().clear();
                return;
            case VDMLPackage.SCENARIO__CONTEXT_COLLABORATION:
                getContextCollaboration().clear();
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
            case VDMLPackage.SCENARIO__HORIZON:
                return horizon != null;
            case VDMLPackage.SCENARIO__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case VDMLPackage.SCENARIO__RELEASE_CONTROL:
                return releaseControl != null && !releaseControl.isEmpty();
            case VDMLPackage.SCENARIO__IS_COMMON:
                return IS_COMMON_EDEFAULT == null ? isCommon != null : !IS_COMMON_EDEFAULT.equals(isCommon);
            case VDMLPackage.SCENARIO__HEAT_THRESHOLD:
                return heatThreshold != null;
            case VDMLPackage.SCENARIO__CONTEXT_ACTOR:
                return contextActor != null && !contextActor.isEmpty();
            case VDMLPackage.SCENARIO__CONTEXT_COLLABORATION:
                return contextCollaboration != null && !contextCollaboration.isEmpty();
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
        result.append(" (type: ");
        result.append(type);
        result.append(", isCommon: ");
        result.append(isCommon);
        result.append(')');
        return result.toString();
    }

} //ScenarioImpl
