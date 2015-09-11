/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.smm.Characteristic;

import org.omg.vdml.BusinessItemDefinition;
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
 * </ul>
 *
 * @generated
 */
public class StoreDefinitionImpl extends VdmlElementImpl implements StoreDefinition {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessItemDefinition> resource;

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
	public EList<BusinessItemDefinition> getResource() {
		if (resource == null) {
			resource = new EObjectResolvingEList<BusinessItemDefinition>(BusinessItemDefinition.class, this, VDMLPackage.STORE_DEFINITION__RESOURCE);
		}
		return resource;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VDMLPackage.STORE_DEFINITION__RESOURCE:
				return getResource();
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				return getCharacteristicDefinition();
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
				getResource().clear();
				getResource().addAll((Collection<? extends BusinessItemDefinition>)newValue);
				return;
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				getCharacteristicDefinition().addAll((Collection<? extends Characteristic>)newValue);
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
				getResource().clear();
				return;
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
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
				return resource != null && !resource.isEmpty();
			case VDMLPackage.STORE_DEFINITION__CHARACTERISTIC_DEFINITION:
				return characteristicDefinition != null && !characteristicDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StoreDefinitionImpl
