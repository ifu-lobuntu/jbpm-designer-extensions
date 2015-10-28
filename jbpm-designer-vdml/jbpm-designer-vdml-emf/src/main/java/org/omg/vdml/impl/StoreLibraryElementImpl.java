/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.smm.Characteristic;

import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.StoreLibraryElement;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Library Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.StoreLibraryElementImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreLibraryElementImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreLibraryElementImpl extends VdmlElementImpl implements StoreLibraryElement {
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
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected BusinessItemLibraryElement resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreLibraryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.STORE_LIBRARY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Characteristic> getCharacteristicDefinition() {
		if (characteristicDefinition == null) {
			characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VDMLPackage.STORE_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION);
		}
		return characteristicDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemLibraryElement getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (BusinessItemLibraryElement)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.STORE_LIBRARY_ELEMENT__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessItemLibraryElement basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(BusinessItemLibraryElement newResource) {
		BusinessItemLibraryElement oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_LIBRARY_ELEMENT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VDMLPackage.STORE_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
				return getCharacteristicDefinition();
			case VDMLPackage.STORE_LIBRARY_ELEMENT__RESOURCE:
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
			case VDMLPackage.STORE_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				getCharacteristicDefinition().addAll((Collection<? extends Characteristic>)newValue);
				return;
			case VDMLPackage.STORE_LIBRARY_ELEMENT__RESOURCE:
				setResource((BusinessItemLibraryElement)newValue);
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
			case VDMLPackage.STORE_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				return;
			case VDMLPackage.STORE_LIBRARY_ELEMENT__RESOURCE:
				setResource((BusinessItemLibraryElement)null);
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
			case VDMLPackage.STORE_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
				return characteristicDefinition != null && !characteristicDefinition.isEmpty();
			case VDMLPackage.STORE_LIBRARY_ELEMENT__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //StoreLibraryElementImpl
