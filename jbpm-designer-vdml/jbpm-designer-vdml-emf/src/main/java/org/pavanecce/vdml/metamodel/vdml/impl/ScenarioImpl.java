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
import org.pavanecce.vdml.metamodel.vdml.Actor;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.ReleaseControl;
import org.pavanecce.vdml.metamodel.vdml.Scenario;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl#getReleaseControl <em>Release Control</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl#isDefault <em>Is Default</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl#getHeatThreshold <em>Heat Threshold</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl#getContextActor <em>Context Actor</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl#getContextCollaboration <em>Context Collaboration</em>}</li>
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
     * The cached value of the '{@link #getReleaseControl() <em>Release Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleaseControl()
     * @generated
     * @ordered
     */
    protected EList<ReleaseControl> releaseControl;

    /**
     * The default value of the '{@link #isDefault() <em>Is Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefault()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DEFAULT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDefault() <em>Is Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefault()
     * @generated
     * @ordered
     */
    protected boolean isDefault = IS_DEFAULT_EDEFAULT;

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
        return VdmlPackage.Literals.SCENARIO;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.SCENARIO__HORIZON, oldHorizon, newHorizon);
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
                msgs = ((InternalEObject)horizon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.SCENARIO__HORIZON, null, msgs);
            if (newHorizon != null)
                msgs = ((InternalEObject)newHorizon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.SCENARIO__HORIZON, null, msgs);
            msgs = basicSetHorizon(newHorizon, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.SCENARIO__HORIZON, newHorizon, newHorizon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ReleaseControl> getReleaseControl() {
        if (releaseControl == null) {
            releaseControl = new EObjectWithInverseResolvingEList.ManyInverse<ReleaseControl>(ReleaseControl.class, this, VdmlPackage.SCENARIO__RELEASE_CONTROL, VdmlPackage.RELEASE_CONTROL__SCENARIO);
        }
        return releaseControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDefault() {
        return isDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDefault(boolean newIsDefault) {
        boolean oldIsDefault = isDefault;
        isDefault = newIsDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.SCENARIO__IS_DEFAULT, oldIsDefault, isDefault));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.SCENARIO__HEAT_THRESHOLD, oldHeatThreshold, newHeatThreshold);
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
                msgs = ((InternalEObject)heatThreshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.SCENARIO__HEAT_THRESHOLD, null, msgs);
            if (newHeatThreshold != null)
                msgs = ((InternalEObject)newHeatThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.SCENARIO__HEAT_THRESHOLD, null, msgs);
            msgs = basicSetHeatThreshold(newHeatThreshold, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.SCENARIO__HEAT_THRESHOLD, newHeatThreshold, newHeatThreshold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Actor> getContextActor() {
        if (contextActor == null) {
            contextActor = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, VdmlPackage.SCENARIO__CONTEXT_ACTOR, VdmlPackage.ACTOR__SCENARIO);
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
            contextCollaboration = new EObjectWithInverseResolvingEList.ManyInverse<Collaboration>(Collaboration.class, this, VdmlPackage.SCENARIO__CONTEXT_COLLABORATION, VdmlPackage.COLLABORATION__SCENARIO);
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
            case VdmlPackage.SCENARIO__RELEASE_CONTROL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleaseControl()).basicAdd(otherEnd, msgs);
            case VdmlPackage.SCENARIO__CONTEXT_ACTOR:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextActor()).basicAdd(otherEnd, msgs);
            case VdmlPackage.SCENARIO__CONTEXT_COLLABORATION:
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
            case VdmlPackage.SCENARIO__HORIZON:
                return basicSetHorizon(null, msgs);
            case VdmlPackage.SCENARIO__RELEASE_CONTROL:
                return ((InternalEList<?>)getReleaseControl()).basicRemove(otherEnd, msgs);
            case VdmlPackage.SCENARIO__HEAT_THRESHOLD:
                return basicSetHeatThreshold(null, msgs);
            case VdmlPackage.SCENARIO__CONTEXT_ACTOR:
                return ((InternalEList<?>)getContextActor()).basicRemove(otherEnd, msgs);
            case VdmlPackage.SCENARIO__CONTEXT_COLLABORATION:
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
            case VdmlPackage.SCENARIO__HORIZON:
                return getHorizon();
            case VdmlPackage.SCENARIO__RELEASE_CONTROL:
                return getReleaseControl();
            case VdmlPackage.SCENARIO__IS_DEFAULT:
                return isDefault();
            case VdmlPackage.SCENARIO__HEAT_THRESHOLD:
                return getHeatThreshold();
            case VdmlPackage.SCENARIO__CONTEXT_ACTOR:
                return getContextActor();
            case VdmlPackage.SCENARIO__CONTEXT_COLLABORATION:
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
            case VdmlPackage.SCENARIO__HORIZON:
                setHorizon((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.SCENARIO__RELEASE_CONTROL:
                getReleaseControl().clear();
                getReleaseControl().addAll((Collection<? extends ReleaseControl>)newValue);
                return;
            case VdmlPackage.SCENARIO__IS_DEFAULT:
                setIsDefault((Boolean)newValue);
                return;
            case VdmlPackage.SCENARIO__HEAT_THRESHOLD:
                setHeatThreshold((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.SCENARIO__CONTEXT_ACTOR:
                getContextActor().clear();
                getContextActor().addAll((Collection<? extends Actor>)newValue);
                return;
            case VdmlPackage.SCENARIO__CONTEXT_COLLABORATION:
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
            case VdmlPackage.SCENARIO__HORIZON:
                setHorizon((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.SCENARIO__RELEASE_CONTROL:
                getReleaseControl().clear();
                return;
            case VdmlPackage.SCENARIO__IS_DEFAULT:
                setIsDefault(IS_DEFAULT_EDEFAULT);
                return;
            case VdmlPackage.SCENARIO__HEAT_THRESHOLD:
                setHeatThreshold((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.SCENARIO__CONTEXT_ACTOR:
                getContextActor().clear();
                return;
            case VdmlPackage.SCENARIO__CONTEXT_COLLABORATION:
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
            case VdmlPackage.SCENARIO__HORIZON:
                return horizon != null;
            case VdmlPackage.SCENARIO__RELEASE_CONTROL:
                return releaseControl != null && !releaseControl.isEmpty();
            case VdmlPackage.SCENARIO__IS_DEFAULT:
                return isDefault != IS_DEFAULT_EDEFAULT;
            case VdmlPackage.SCENARIO__HEAT_THRESHOLD:
                return heatThreshold != null;
            case VdmlPackage.SCENARIO__CONTEXT_ACTOR:
                return contextActor != null && !contextActor.isEmpty();
            case VdmlPackage.SCENARIO__CONTEXT_COLLABORATION:
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
        result.append(" (isDefault: ");
        result.append(isDefault);
        result.append(')');
        return result.toString();
    }

} //ScenarioImpl
