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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.smm.Characteristic;

import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.ExchangeConfiguration;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.StoreDefinitionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreDefinitionImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreDefinitionImpl#getInventoryLevel <em>Inventory Level</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreDefinitionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreDefinitionImpl#getExchangeConfiguration <em>Exchange Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreDefinitionImpl extends VdmlElementImpl implements StoreDefinition {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemDefinition resource;

	/**
	 * The cached value of the '{@link #getCharacteristicDefinition() <em>Characteristic Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Characteristic> characteristicDefinition;

	/**
	 * The cached value of the '{@link #getInventoryLevel() <em>Inventory Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryLevel()
	 * @generated
	 * @ordered
	 */
	protected Characteristic inventoryLevel;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Characteristic duration;

	/**
	 * The cached value of the '{@link #getExchangeConfiguration() <em>Exchange Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ExchangeConfiguration exchangeConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.STORE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (BusinessItemDefinition)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.STORE_DEFINITION__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemDefinition basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(BusinessItemDefinition newResource) {
		BusinessItemDefinition oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_DEFINITION__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Characteristic> getCharacteristicDefinition() {
		if (characteristicDefinition == null) {
			characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION);
		}
		return characteristicDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getInventoryLevel() {
		if (inventoryLevel != null && inventoryLevel.eIsProxy()) {
			InternalEObject oldInventoryLevel = (InternalEObject)inventoryLevel;
			inventoryLevel = (Characteristic)eResolveProxy(oldInventoryLevel);
			if (inventoryLevel != oldInventoryLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.STORE_DEFINITION__INVENTORY_LEVEL, oldInventoryLevel, inventoryLevel));
			}
		}
		return inventoryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic basicGetInventoryLevel() {
		return inventoryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryLevel(Characteristic newInventoryLevel) {
		Characteristic oldInventoryLevel = inventoryLevel;
		inventoryLevel = newInventoryLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_DEFINITION__INVENTORY_LEVEL, oldInventoryLevel, inventoryLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (Characteristic)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.STORE_DEFINITION__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Characteristic newDuration) {
		Characteristic oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_DEFINITION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeConfiguration getExchangeConfiguration() {
		return exchangeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangeConfiguration(ExchangeConfiguration newExchangeConfiguration, NotificationChain msgs) {
		ExchangeConfiguration oldExchangeConfiguration = exchangeConfiguration;
		exchangeConfiguration = newExchangeConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION, oldExchangeConfiguration, newExchangeConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeConfiguration(ExchangeConfiguration newExchangeConfiguration) {
		if (newExchangeConfiguration != exchangeConfiguration) {
			NotificationChain msgs = null;
			if (exchangeConfiguration != null)
				msgs = ((InternalEObject)exchangeConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION, null, msgs);
			if (newExchangeConfiguration != null)
				msgs = ((InternalEObject)newExchangeConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION, null, msgs);
			msgs = basicSetExchangeConfiguration(newExchangeConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION, newExchangeConfiguration, newExchangeConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION:
				return basicSetExchangeConfiguration(null, msgs);
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
			case VDMLPackage.STORE_DEFINITION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				return getCharacteristicDefinition();
			case VDMLPackage.STORE_DEFINITION__INVENTORY_LEVEL:
				if (resolve) return getInventoryLevel();
				return basicGetInventoryLevel();
			case VDMLPackage.STORE_DEFINITION__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION:
				return getExchangeConfiguration();
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
			case VDMLPackage.STORE_DEFINITION__RESOURCE:
				setResource((BusinessItemDefinition)newValue);
				return;
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				getCharacteristicDefinition().addAll((Collection<? extends Characteristic>)newValue);
				return;
			case VDMLPackage.STORE_DEFINITION__INVENTORY_LEVEL:
				setInventoryLevel((Characteristic)newValue);
				return;
			case VDMLPackage.STORE_DEFINITION__DURATION:
				setDuration((Characteristic)newValue);
				return;
			case VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION:
				setExchangeConfiguration((ExchangeConfiguration)newValue);
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
			case VDMLPackage.STORE_DEFINITION__RESOURCE:
				setResource((BusinessItemDefinition)null);
				return;
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				return;
			case VDMLPackage.STORE_DEFINITION__INVENTORY_LEVEL:
				setInventoryLevel((Characteristic)null);
				return;
			case VDMLPackage.STORE_DEFINITION__DURATION:
				setDuration((Characteristic)null);
				return;
			case VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION:
				setExchangeConfiguration((ExchangeConfiguration)null);
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
			case VDMLPackage.STORE_DEFINITION__RESOURCE:
				return resource != null;
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				return characteristicDefinition != null && !characteristicDefinition.isEmpty();
			case VDMLPackage.STORE_DEFINITION__INVENTORY_LEVEL:
				return inventoryLevel != null;
			case VDMLPackage.STORE_DEFINITION__DURATION:
				return duration != null;
			case VDMLPackage.STORE_DEFINITION__EXCHANGE_CONFIGURATION:
				return exchangeConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //StoreDefinitionImpl
