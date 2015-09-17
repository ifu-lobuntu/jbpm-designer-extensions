/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.ExchangeConfiguration;
import org.omg.vdml.Milestone;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ExchangeConfigurationImpl#getExchangeMethod <em>Exchange Method</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ExchangeConfigurationImpl#getSupplierRole <em>Supplier Role</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ExchangeConfigurationImpl#getResourceUseFromPool <em>Resource Use From Pool</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ExchangeConfigurationImpl#getExchangeMilestone <em>Exchange Milestone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeConfigurationImpl extends MinimalEObjectImpl.Container implements ExchangeConfiguration {
	/**
	 * The cached value of the '{@link #getExchangeMethod() <em>Exchange Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMethod()
	 * @generated
	 * @ordered
	 */
	protected CapabilityMethod exchangeMethod;

	/**
	 * The cached value of the '{@link #getSupplierRole() <em>Supplier Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRole()
	 * @generated
	 * @ordered
	 */
	protected Role supplierRole;

	/**
	 * The cached value of the '{@link #getResourceUseFromPool() <em>Resource Use From Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUseFromPool()
	 * @generated
	 * @ordered
	 */
	protected ResourceUse resourceUseFromPool;

	/**
	 * The cached value of the '{@link #getExchangeMilestone() <em>Exchange Milestone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMilestone()
	 * @generated
	 * @ordered
	 */
	protected Milestone exchangeMilestone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.EXCHANGE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityMethod getExchangeMethod() {
		if (exchangeMethod != null && exchangeMethod.eIsProxy()) {
			InternalEObject oldExchangeMethod = (InternalEObject)exchangeMethod;
			exchangeMethod = (CapabilityMethod)eResolveProxy(oldExchangeMethod);
			if (exchangeMethod != oldExchangeMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_METHOD, oldExchangeMethod, exchangeMethod));
			}
		}
		return exchangeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityMethod basicGetExchangeMethod() {
		return exchangeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeMethod(CapabilityMethod newExchangeMethod) {
		CapabilityMethod oldExchangeMethod = exchangeMethod;
		exchangeMethod = newExchangeMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_METHOD, oldExchangeMethod, exchangeMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSupplierRole() {
		if (supplierRole != null && supplierRole.eIsProxy()) {
			InternalEObject oldSupplierRole = (InternalEObject)supplierRole;
			supplierRole = (Role)eResolveProxy(oldSupplierRole);
			if (supplierRole != oldSupplierRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.EXCHANGE_CONFIGURATION__SUPPLIER_ROLE, oldSupplierRole, supplierRole));
			}
		}
		return supplierRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetSupplierRole() {
		return supplierRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierRole(Role newSupplierRole) {
		Role oldSupplierRole = supplierRole;
		supplierRole = newSupplierRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.EXCHANGE_CONFIGURATION__SUPPLIER_ROLE, oldSupplierRole, supplierRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUse getResourceUseFromPool() {
		if (resourceUseFromPool != null && resourceUseFromPool.eIsProxy()) {
			InternalEObject oldResourceUseFromPool = (InternalEObject)resourceUseFromPool;
			resourceUseFromPool = (ResourceUse)eResolveProxy(oldResourceUseFromPool);
			if (resourceUseFromPool != oldResourceUseFromPool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.EXCHANGE_CONFIGURATION__RESOURCE_USE_FROM_POOL, oldResourceUseFromPool, resourceUseFromPool));
			}
		}
		return resourceUseFromPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUse basicGetResourceUseFromPool() {
		return resourceUseFromPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceUseFromPool(ResourceUse newResourceUseFromPool) {
		ResourceUse oldResourceUseFromPool = resourceUseFromPool;
		resourceUseFromPool = newResourceUseFromPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.EXCHANGE_CONFIGURATION__RESOURCE_USE_FROM_POOL, oldResourceUseFromPool, resourceUseFromPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone getExchangeMilestone() {
		if (exchangeMilestone != null && exchangeMilestone.eIsProxy()) {
			InternalEObject oldExchangeMilestone = (InternalEObject)exchangeMilestone;
			exchangeMilestone = (Milestone)eResolveProxy(oldExchangeMilestone);
			if (exchangeMilestone != oldExchangeMilestone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_MILESTONE, oldExchangeMilestone, exchangeMilestone));
			}
		}
		return exchangeMilestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone basicGetExchangeMilestone() {
		return exchangeMilestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeMilestone(Milestone newExchangeMilestone) {
		Milestone oldExchangeMilestone = exchangeMilestone;
		exchangeMilestone = newExchangeMilestone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_MILESTONE, oldExchangeMilestone, exchangeMilestone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_METHOD:
				if (resolve) return getExchangeMethod();
				return basicGetExchangeMethod();
			case VDMLPackage.EXCHANGE_CONFIGURATION__SUPPLIER_ROLE:
				if (resolve) return getSupplierRole();
				return basicGetSupplierRole();
			case VDMLPackage.EXCHANGE_CONFIGURATION__RESOURCE_USE_FROM_POOL:
				if (resolve) return getResourceUseFromPool();
				return basicGetResourceUseFromPool();
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_MILESTONE:
				if (resolve) return getExchangeMilestone();
				return basicGetExchangeMilestone();
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
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_METHOD:
				setExchangeMethod((CapabilityMethod)newValue);
				return;
			case VDMLPackage.EXCHANGE_CONFIGURATION__SUPPLIER_ROLE:
				setSupplierRole((Role)newValue);
				return;
			case VDMLPackage.EXCHANGE_CONFIGURATION__RESOURCE_USE_FROM_POOL:
				setResourceUseFromPool((ResourceUse)newValue);
				return;
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_MILESTONE:
				setExchangeMilestone((Milestone)newValue);
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
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_METHOD:
				setExchangeMethod((CapabilityMethod)null);
				return;
			case VDMLPackage.EXCHANGE_CONFIGURATION__SUPPLIER_ROLE:
				setSupplierRole((Role)null);
				return;
			case VDMLPackage.EXCHANGE_CONFIGURATION__RESOURCE_USE_FROM_POOL:
				setResourceUseFromPool((ResourceUse)null);
				return;
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_MILESTONE:
				setExchangeMilestone((Milestone)null);
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
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_METHOD:
				return exchangeMethod != null;
			case VDMLPackage.EXCHANGE_CONFIGURATION__SUPPLIER_ROLE:
				return supplierRole != null;
			case VDMLPackage.EXCHANGE_CONFIGURATION__RESOURCE_USE_FROM_POOL:
				return resourceUseFromPool != null;
			case VDMLPackage.EXCHANGE_CONFIGURATION__EXCHANGE_MILESTONE:
				return exchangeMilestone != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeConfigurationImpl
