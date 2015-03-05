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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.Activity;
import org.pavanecce.vdml.metamodel.vdml.Capability;
import org.pavanecce.vdml.metamodel.vdml.CapabilityMethod;
import org.pavanecce.vdml.metamodel.vdml.CapabilityOffer;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.OrgUnit;
import org.pavanecce.vdml.metamodel.vdml.ReleaseControl;
import org.pavanecce.vdml.metamodel.vdml.Store;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getCapabilityResource <em>Capability Resource</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getReleaseControl <em>Release Control</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getApplyingActivity <em>Applying Activity</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getHeatIndex <em>Heat Index</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getCapabilityProvider <em>Capability Provider</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityOfferImpl extends MeasurableElementImpl implements CapabilityOffer {
    /**
     * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapability()
     * @generated
     * @ordered
     */
    protected Capability capability;

    /**
     * The cached value of the '{@link #getCapabilityResource() <em>Capability Resource</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityResource()
     * @generated
     * @ordered
     */
    protected EList<Store> capabilityResource;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected EList<CapabilityMethod> method;

    /**
     * The cached value of the '{@link #getReleaseControl() <em>Release Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleaseControl()
     * @generated
     * @ordered
     */
    protected EList<ReleaseControl> releaseControl;

    /**
     * The cached value of the '{@link #getApplyingActivity() <em>Applying Activity</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplyingActivity()
     * @generated
     * @ordered
     */
    protected EList<Activity> applyingActivity;

    /**
     * The cached value of the '{@link #getHeatIndex() <em>Heat Index</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatIndex()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic heatIndex;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CapabilityOfferImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.CAPABILITY_OFFER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Capability getCapability() {
        if (capability != null && capability.eIsProxy()) {
            InternalEObject oldCapability = (InternalEObject)capability;
            capability = (Capability)eResolveProxy(oldCapability);
            if (capability != oldCapability) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.CAPABILITY_OFFER__CAPABILITY, oldCapability, capability));
            }
        }
        return capability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Capability basicGetCapability() {
        return capability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapability(Capability newCapability) {
        Capability oldCapability = capability;
        capability = newCapability;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_OFFER__CAPABILITY, oldCapability, capability));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Store> getCapabilityResource() {
        if (capabilityResource == null) {
            capabilityResource = new EObjectWithInverseResolvingEList.ManyInverse<Store>(Store.class, this, VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE, VdmlPackage.STORE__SUPPORTED_CAPABILITY);
        }
        return capabilityResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityMethod> getMethod() {
        if (method == null) {
            method = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityMethod>(CapabilityMethod.class, this, VdmlPackage.CAPABILITY_OFFER__METHOD, VdmlPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY);
        }
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ReleaseControl> getReleaseControl() {
        if (releaseControl == null) {
            releaseControl = new EObjectContainmentEList<ReleaseControl>(ReleaseControl.class, this, VdmlPackage.CAPABILITY_OFFER__RELEASE_CONTROL);
        }
        return releaseControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Activity> getApplyingActivity() {
        if (applyingActivity == null) {
            applyingActivity = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this, VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY, VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER);
        }
        return applyingActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getHeatIndex() {
        return heatIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHeatIndex(MeasuredCharacteristic newHeatIndex, NotificationChain msgs) {
        MeasuredCharacteristic oldHeatIndex = heatIndex;
        heatIndex = newHeatIndex;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX, oldHeatIndex, newHeatIndex);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeatIndex(MeasuredCharacteristic newHeatIndex) {
        if (newHeatIndex != heatIndex) {
            NotificationChain msgs = null;
            if (heatIndex != null)
                msgs = ((InternalEObject)heatIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX, null, msgs);
            if (newHeatIndex != null)
                msgs = ((InternalEObject)newHeatIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX, null, msgs);
            msgs = basicSetHeatIndex(newHeatIndex, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX, newHeatIndex, newHeatIndex));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_OFFER__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrgUnit getCapabilityProvider() {
        if (eContainerFeatureID() != VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER) return null;
        return (OrgUnit)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCapabilityProvider(OrgUnit newCapabilityProvider, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCapabilityProvider, VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapabilityProvider(OrgUnit newCapabilityProvider) {
        if (newCapabilityProvider != eInternalContainer() || (eContainerFeatureID() != VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER && newCapabilityProvider != null)) {
            if (EcoreUtil.isAncestor(this, newCapabilityProvider))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCapabilityProvider != null)
                msgs = ((InternalEObject)newCapabilityProvider).eInverseAdd(this, VdmlPackage.ORG_UNIT__CAPABILITY_OFFER, OrgUnit.class, msgs);
            msgs = basicSetCapabilityProvider(newCapabilityProvider, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER, newCapabilityProvider, newCapabilityProvider));
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilityResource()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__METHOD:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplyingActivity()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetCapabilityProvider((OrgUnit)otherEnd, msgs);
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE:
                return ((InternalEList<?>)getCapabilityResource()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__METHOD:
                return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__RELEASE_CONTROL:
                return ((InternalEList<?>)getReleaseControl()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY:
                return ((InternalEList<?>)getApplyingActivity()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX:
                return basicSetHeatIndex(null, msgs);
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                return basicSetCapabilityProvider(null, msgs);
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                return eInternalContainer().eInverseRemove(this, VdmlPackage.ORG_UNIT__CAPABILITY_OFFER, OrgUnit.class, msgs);
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY:
                if (resolve) return getCapability();
                return basicGetCapability();
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE:
                return getCapabilityResource();
            case VdmlPackage.CAPABILITY_OFFER__METHOD:
                return getMethod();
            case VdmlPackage.CAPABILITY_OFFER__RELEASE_CONTROL:
                return getReleaseControl();
            case VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY:
                return getApplyingActivity();
            case VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX:
                return getHeatIndex();
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                return getCapabilityProvider();
            case VdmlPackage.CAPABILITY_OFFER__LOCATION:
                return getLocation();
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY:
                setCapability((Capability)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE:
                getCapabilityResource().clear();
                getCapabilityResource().addAll((Collection<? extends Store>)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__METHOD:
                getMethod().clear();
                getMethod().addAll((Collection<? extends CapabilityMethod>)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__RELEASE_CONTROL:
                getReleaseControl().clear();
                getReleaseControl().addAll((Collection<? extends ReleaseControl>)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY:
                getApplyingActivity().clear();
                getApplyingActivity().addAll((Collection<? extends Activity>)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX:
                setHeatIndex((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                setCapabilityProvider((OrgUnit)newValue);
                return;
            case VdmlPackage.CAPABILITY_OFFER__LOCATION:
                setLocation((String)newValue);
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY:
                setCapability((Capability)null);
                return;
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE:
                getCapabilityResource().clear();
                return;
            case VdmlPackage.CAPABILITY_OFFER__METHOD:
                getMethod().clear();
                return;
            case VdmlPackage.CAPABILITY_OFFER__RELEASE_CONTROL:
                getReleaseControl().clear();
                return;
            case VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY:
                getApplyingActivity().clear();
                return;
            case VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX:
                setHeatIndex((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                setCapabilityProvider((OrgUnit)null);
                return;
            case VdmlPackage.CAPABILITY_OFFER__LOCATION:
                setLocation(LOCATION_EDEFAULT);
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
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY:
                return capability != null;
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE:
                return capabilityResource != null && !capabilityResource.isEmpty();
            case VdmlPackage.CAPABILITY_OFFER__METHOD:
                return method != null && !method.isEmpty();
            case VdmlPackage.CAPABILITY_OFFER__RELEASE_CONTROL:
                return releaseControl != null && !releaseControl.isEmpty();
            case VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY:
                return applyingActivity != null && !applyingActivity.isEmpty();
            case VdmlPackage.CAPABILITY_OFFER__HEAT_INDEX:
                return heatIndex != null;
            case VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER:
                return getCapabilityProvider() != null;
            case VdmlPackage.CAPABILITY_OFFER__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
        result.append(" (location: ");
        result.append(location);
        result.append(')');
        return result.toString();
    }

} //CapabilityOfferImpl
