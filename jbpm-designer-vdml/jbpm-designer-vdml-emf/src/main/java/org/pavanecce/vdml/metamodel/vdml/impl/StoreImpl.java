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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.AnalysisContext;
import org.pavanecce.vdml.metamodel.vdml.BusinessItem;
import org.pavanecce.vdml.metamodel.vdml.CapabilityOffer;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.OrgUnit;
import org.pavanecce.vdml.metamodel.vdml.Store;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl#getStoreOwner <em>Store Owner</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl#getStoreContext <em>Store Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl#getInventoryLevel <em>Inventory Level</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreImpl extends PortContainerImpl implements Store {
    /**
     * The cached value of the '{@link #getStoreContext() <em>Store Context</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoreContext()
     * @generated
     * @ordered
     */
    protected EList<AnalysisContext> storeContext;

    /**
     * The cached value of the '{@link #getSupportedCapability() <em>Supported Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportedCapability()
     * @generated
     * @ordered
     */
    protected EList<CapabilityOffer> supportedCapability;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic duration;

    /**
     * The cached value of the '{@link #getInventoryLevel() <em>Inventory Level</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInventoryLevel()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic inventoryLevel;

    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected BusinessItem resource;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.STORE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrgUnit getStoreOwner() {
        if (eContainerFeatureID() != VdmlPackage.STORE__STORE_OWNER) return null;
        return (OrgUnit)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStoreOwner(OrgUnit newStoreOwner, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newStoreOwner, VdmlPackage.STORE__STORE_OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStoreOwner(OrgUnit newStoreOwner) {
        if (newStoreOwner != eInternalContainer() || (eContainerFeatureID() != VdmlPackage.STORE__STORE_OWNER && newStoreOwner != null)) {
            if (EcoreUtil.isAncestor(this, newStoreOwner))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newStoreOwner != null)
                msgs = ((InternalEObject)newStoreOwner).eInverseAdd(this, VdmlPackage.ORG_UNIT__OWNED_STORE, OrgUnit.class, msgs);
            msgs = basicSetStoreOwner(newStoreOwner, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__STORE_OWNER, newStoreOwner, newStoreOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnalysisContext> getStoreContext() {
        if (storeContext == null) {
            storeContext = new EObjectWithInverseResolvingEList.ManyInverse<AnalysisContext>(AnalysisContext.class, this, VdmlPackage.STORE__STORE_CONTEXT, VdmlPackage.ANALYSIS_CONTEXT__CONTEXT_STORE);
        }
        return storeContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityOffer> getSupportedCapability() {
        if (supportedCapability == null) {
            supportedCapability = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityOffer>(CapabilityOffer.class, this, VdmlPackage.STORE__SUPPORTED_CAPABILITY, VdmlPackage.CAPABILITY_OFFER__CAPABILITY_RESOURCE);
        }
        return supportedCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDuration(MeasuredCharacteristic newDuration, NotificationChain msgs) {
        MeasuredCharacteristic oldDuration = duration;
        duration = newDuration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__DURATION, oldDuration, newDuration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDuration(MeasuredCharacteristic newDuration) {
        if (newDuration != duration) {
            NotificationChain msgs = null;
            if (duration != null)
                msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.STORE__DURATION, null, msgs);
            if (newDuration != null)
                msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.STORE__DURATION, null, msgs);
            msgs = basicSetDuration(newDuration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__DURATION, newDuration, newDuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getInventoryLevel() {
        return inventoryLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInventoryLevel(MeasuredCharacteristic newInventoryLevel, NotificationChain msgs) {
        MeasuredCharacteristic oldInventoryLevel = inventoryLevel;
        inventoryLevel = newInventoryLevel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__INVENTORY_LEVEL, oldInventoryLevel, newInventoryLevel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInventoryLevel(MeasuredCharacteristic newInventoryLevel) {
        if (newInventoryLevel != inventoryLevel) {
            NotificationChain msgs = null;
            if (inventoryLevel != null)
                msgs = ((InternalEObject)inventoryLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.STORE__INVENTORY_LEVEL, null, msgs);
            if (newInventoryLevel != null)
                msgs = ((InternalEObject)newInventoryLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.STORE__INVENTORY_LEVEL, null, msgs);
            msgs = basicSetInventoryLevel(newInventoryLevel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__INVENTORY_LEVEL, newInventoryLevel, newInventoryLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItem getResource() {
        if (resource != null && resource.eIsProxy()) {
            InternalEObject oldResource = (InternalEObject)resource;
            resource = (BusinessItem)eResolveProxy(oldResource);
            if (resource != oldResource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.STORE__RESOURCE, oldResource, resource));
            }
        }
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItem basicGetResource() {
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResource(BusinessItem newResource, NotificationChain msgs) {
        BusinessItem oldResource = resource;
        resource = newResource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__RESOURCE, oldResource, newResource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResource(BusinessItem newResource) {
        if (newResource != resource) {
            NotificationChain msgs = null;
            if (resource != null)
                msgs = ((InternalEObject)resource).eInverseRemove(this, VdmlPackage.BUSINESS_ITEM__STORE, BusinessItem.class, msgs);
            if (newResource != null)
                msgs = ((InternalEObject)newResource).eInverseAdd(this, VdmlPackage.BUSINESS_ITEM__STORE, BusinessItem.class, msgs);
            msgs = basicSetResource(newResource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.STORE__RESOURCE, newResource, newResource));
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
            case VdmlPackage.STORE__STORE_OWNER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetStoreOwner((OrgUnit)otherEnd, msgs);
            case VdmlPackage.STORE__STORE_CONTEXT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoreContext()).basicAdd(otherEnd, msgs);
            case VdmlPackage.STORE__SUPPORTED_CAPABILITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportedCapability()).basicAdd(otherEnd, msgs);
            case VdmlPackage.STORE__RESOURCE:
                if (resource != null)
                    msgs = ((InternalEObject)resource).eInverseRemove(this, VdmlPackage.BUSINESS_ITEM__STORE, BusinessItem.class, msgs);
                return basicSetResource((BusinessItem)otherEnd, msgs);
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
            case VdmlPackage.STORE__STORE_OWNER:
                return basicSetStoreOwner(null, msgs);
            case VdmlPackage.STORE__STORE_CONTEXT:
                return ((InternalEList<?>)getStoreContext()).basicRemove(otherEnd, msgs);
            case VdmlPackage.STORE__SUPPORTED_CAPABILITY:
                return ((InternalEList<?>)getSupportedCapability()).basicRemove(otherEnd, msgs);
            case VdmlPackage.STORE__DURATION:
                return basicSetDuration(null, msgs);
            case VdmlPackage.STORE__INVENTORY_LEVEL:
                return basicSetInventoryLevel(null, msgs);
            case VdmlPackage.STORE__RESOURCE:
                return basicSetResource(null, msgs);
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
            case VdmlPackage.STORE__STORE_OWNER:
                return eInternalContainer().eInverseRemove(this, VdmlPackage.ORG_UNIT__OWNED_STORE, OrgUnit.class, msgs);
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
            case VdmlPackage.STORE__STORE_OWNER:
                return getStoreOwner();
            case VdmlPackage.STORE__STORE_CONTEXT:
                return getStoreContext();
            case VdmlPackage.STORE__SUPPORTED_CAPABILITY:
                return getSupportedCapability();
            case VdmlPackage.STORE__DURATION:
                return getDuration();
            case VdmlPackage.STORE__INVENTORY_LEVEL:
                return getInventoryLevel();
            case VdmlPackage.STORE__RESOURCE:
                if (resolve) return getResource();
                return basicGetResource();
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
            case VdmlPackage.STORE__STORE_OWNER:
                setStoreOwner((OrgUnit)newValue);
                return;
            case VdmlPackage.STORE__STORE_CONTEXT:
                getStoreContext().clear();
                getStoreContext().addAll((Collection<? extends AnalysisContext>)newValue);
                return;
            case VdmlPackage.STORE__SUPPORTED_CAPABILITY:
                getSupportedCapability().clear();
                getSupportedCapability().addAll((Collection<? extends CapabilityOffer>)newValue);
                return;
            case VdmlPackage.STORE__DURATION:
                setDuration((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.STORE__INVENTORY_LEVEL:
                setInventoryLevel((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.STORE__RESOURCE:
                setResource((BusinessItem)newValue);
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
            case VdmlPackage.STORE__STORE_OWNER:
                setStoreOwner((OrgUnit)null);
                return;
            case VdmlPackage.STORE__STORE_CONTEXT:
                getStoreContext().clear();
                return;
            case VdmlPackage.STORE__SUPPORTED_CAPABILITY:
                getSupportedCapability().clear();
                return;
            case VdmlPackage.STORE__DURATION:
                setDuration((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.STORE__INVENTORY_LEVEL:
                setInventoryLevel((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.STORE__RESOURCE:
                setResource((BusinessItem)null);
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
            case VdmlPackage.STORE__STORE_OWNER:
                return getStoreOwner() != null;
            case VdmlPackage.STORE__STORE_CONTEXT:
                return storeContext != null && !storeContext.isEmpty();
            case VdmlPackage.STORE__SUPPORTED_CAPABILITY:
                return supportedCapability != null && !supportedCapability.isEmpty();
            case VdmlPackage.STORE__DURATION:
                return duration != null;
            case VdmlPackage.STORE__INVENTORY_LEVEL:
                return inventoryLevel != null;
            case VdmlPackage.STORE__RESOURCE:
                return resource != null;
        }
        return super.eIsSet(featureID);
    }

} //StoreImpl
