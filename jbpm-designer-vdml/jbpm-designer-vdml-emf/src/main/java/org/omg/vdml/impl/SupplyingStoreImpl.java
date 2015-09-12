/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.vdml.BusinessItem;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Role;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.SupplyingStore;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplying Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.SupplyingStoreImpl#getSupplyingRole <em>Supplying Role</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingStoreImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingStoreImpl#getInventoryLevel <em>Inventory Level</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingStoreImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingStoreImpl#getStoreRequirement <em>Store Requirement</em>}</li>
 *   <li>{@link org.omg.vdml.impl.SupplyingStoreImpl#getCollaboration <em>Collaboration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyingStoreImpl extends PortContainerImpl implements SupplyingStore {
	/**
	 * The cached value of the '{@link #getSupplyingRole() <em>Supplying Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyingRole()
	 * @generated
	 * @ordered
	 */
	protected Role supplyingRole;

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
	 * The cached value of the '{@link #getStoreRequirement() <em>Store Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreRequirement()
	 * @generated
	 * @ordered
	 */
	protected StoreDefinition storeRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyingStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.SUPPLYING_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSupplyingRole() {
		if (supplyingRole != null && supplyingRole.eIsProxy()) {
			InternalEObject oldSupplyingRole = (InternalEObject)supplyingRole;
			supplyingRole = (Role)eResolveProxy(oldSupplyingRole);
			if (supplyingRole != oldSupplyingRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE, oldSupplyingRole, supplyingRole));
			}
		}
		return supplyingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetSupplyingRole() {
		return supplyingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyingRole(Role newSupplyingRole, NotificationChain msgs) {
		Role oldSupplyingRole = supplyingRole;
		supplyingRole = newSupplyingRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE, oldSupplyingRole, newSupplyingRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyingRole(Role newSupplyingRole) {
		if (newSupplyingRole != supplyingRole) {
			NotificationChain msgs = null;
			if (supplyingRole != null)
				msgs = ((InternalEObject)supplyingRole).eInverseRemove(this, VDMLPackage.ROLE__SUPPLYING_STORE, Role.class, msgs);
			if (newSupplyingRole != null)
				msgs = ((InternalEObject)newSupplyingRole).eInverseAdd(this, VDMLPackage.ROLE__SUPPLYING_STORE, Role.class, msgs);
			msgs = basicSetSupplyingRole(newSupplyingRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE, newSupplyingRole, newSupplyingRole));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__DURATION, oldDuration, newDuration);
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
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_STORE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_STORE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__DURATION, newDuration, newDuration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL, oldInventoryLevel, newInventoryLevel);
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
				msgs = ((InternalEObject)inventoryLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL, null, msgs);
			if (newInventoryLevel != null)
				msgs = ((InternalEObject)newInventoryLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL, null, msgs);
			msgs = basicSetInventoryLevel(newInventoryLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL, newInventoryLevel, newInventoryLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.SUPPLYING_STORE__RESOURCE, oldResource, resource));
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
	public void setResource(BusinessItem newResource) {
		BusinessItem oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDefinition getStoreRequirement() {
		if (storeRequirement != null && storeRequirement.eIsProxy()) {
			InternalEObject oldStoreRequirement = (InternalEObject)storeRequirement;
			storeRequirement = (StoreDefinition)eResolveProxy(oldStoreRequirement);
			if (storeRequirement != oldStoreRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.SUPPLYING_STORE__STORE_REQUIREMENT, oldStoreRequirement, storeRequirement));
			}
		}
		return storeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDefinition basicGetStoreRequirement() {
		return storeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreRequirement(StoreDefinition newStoreRequirement) {
		StoreDefinition oldStoreRequirement = storeRequirement;
		storeRequirement = newStoreRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__STORE_REQUIREMENT, oldStoreRequirement, storeRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getCollaboration() {
		if (eContainerFeatureID() != VDMLPackage.SUPPLYING_STORE__COLLABORATION) return null;
		return (Collaboration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaboration(Collaboration newCollaboration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCollaboration, VDMLPackage.SUPPLYING_STORE__COLLABORATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaboration(Collaboration newCollaboration) {
		if (newCollaboration != eInternalContainer() || (eContainerFeatureID() != VDMLPackage.SUPPLYING_STORE__COLLABORATION && newCollaboration != null)) {
			if (EcoreUtil.isAncestor(this, newCollaboration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCollaboration != null)
				msgs = ((InternalEObject)newCollaboration).eInverseAdd(this, VDMLPackage.COLLABORATION__SUPPLYING_STORE, Collaboration.class, msgs);
			msgs = basicSetCollaboration(newCollaboration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.SUPPLYING_STORE__COLLABORATION, newCollaboration, newCollaboration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE:
				if (supplyingRole != null)
					msgs = ((InternalEObject)supplyingRole).eInverseRemove(this, VDMLPackage.ROLE__SUPPLYING_STORE, Role.class, msgs);
				return basicSetSupplyingRole((Role)otherEnd, msgs);
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCollaboration((Collaboration)otherEnd, msgs);
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
			case VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE:
				return basicSetSupplyingRole(null, msgs);
			case VDMLPackage.SUPPLYING_STORE__DURATION:
				return basicSetDuration(null, msgs);
			case VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL:
				return basicSetInventoryLevel(null, msgs);
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				return basicSetCollaboration(null, msgs);
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
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				return eInternalContainer().eInverseRemove(this, VDMLPackage.COLLABORATION__SUPPLYING_STORE, Collaboration.class, msgs);
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
			case VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE:
				if (resolve) return getSupplyingRole();
				return basicGetSupplyingRole();
			case VDMLPackage.SUPPLYING_STORE__DURATION:
				return getDuration();
			case VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL:
				return getInventoryLevel();
			case VDMLPackage.SUPPLYING_STORE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case VDMLPackage.SUPPLYING_STORE__STORE_REQUIREMENT:
				if (resolve) return getStoreRequirement();
				return basicGetStoreRequirement();
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				return getCollaboration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE:
				setSupplyingRole((Role)newValue);
				return;
			case VDMLPackage.SUPPLYING_STORE__DURATION:
				setDuration((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL:
				setInventoryLevel((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.SUPPLYING_STORE__RESOURCE:
				setResource((BusinessItem)newValue);
				return;
			case VDMLPackage.SUPPLYING_STORE__STORE_REQUIREMENT:
				setStoreRequirement((StoreDefinition)newValue);
				return;
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				setCollaboration((Collaboration)newValue);
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
			case VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE:
				setSupplyingRole((Role)null);
				return;
			case VDMLPackage.SUPPLYING_STORE__DURATION:
				setDuration((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL:
				setInventoryLevel((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.SUPPLYING_STORE__RESOURCE:
				setResource((BusinessItem)null);
				return;
			case VDMLPackage.SUPPLYING_STORE__STORE_REQUIREMENT:
				setStoreRequirement((StoreDefinition)null);
				return;
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				setCollaboration((Collaboration)null);
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
			case VDMLPackage.SUPPLYING_STORE__SUPPLYING_ROLE:
				return supplyingRole != null;
			case VDMLPackage.SUPPLYING_STORE__DURATION:
				return duration != null;
			case VDMLPackage.SUPPLYING_STORE__INVENTORY_LEVEL:
				return inventoryLevel != null;
			case VDMLPackage.SUPPLYING_STORE__RESOURCE:
				return resource != null;
			case VDMLPackage.SUPPLYING_STORE__STORE_REQUIREMENT:
				return storeRequirement != null;
			case VDMLPackage.SUPPLYING_STORE__COLLABORATION:
				return getCollaboration() != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyingStoreImpl
