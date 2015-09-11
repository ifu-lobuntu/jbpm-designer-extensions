/**
 */
package org.omg.vdml.impl;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.smm.Characteristic;
import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.VDMLPackage;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Library Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.BusinessItemLibraryElementImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BusinessItemLibraryElementImpl extends VdmlElementImpl implements BusinessItemLibraryElement {
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
    protected BusinessItemLibraryElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.BUSINESS_ITEM_LIBRARY_ELEMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Characteristic> getCharacteristicDefinition() {
		if (characteristicDefinition == null) {
			characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VDMLPackage.BUSINESS_ITEM_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION);
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
			case VDMLPackage.BUSINESS_ITEM_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
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
			case VDMLPackage.BUSINESS_ITEM_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
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
			case VDMLPackage.BUSINESS_ITEM_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
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
			case VDMLPackage.BUSINESS_ITEM_LIBRARY_ELEMENT__CHARACTERISTIC_DEFINITION:
				return characteristicDefinition != null && !characteristicDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessItemLibraryElementImpl
