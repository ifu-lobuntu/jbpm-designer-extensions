/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.Characteristic;
import org.omg.vdml.RoleCategory;
import org.omg.vdml.RoleDefinition;
import org.omg.vdml.VDMLPackage;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.RoleDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleDefinitionImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleDefinitionImpl extends VdmlElementImpl implements RoleDefinition {
    /**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
    protected EList<RoleCategory> category;

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
    protected RoleDefinitionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.ROLE_DEFINITION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RoleCategory> getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse<RoleCategory>(RoleCategory.class, this, VDMLPackage.ROLE_DEFINITION__CATEGORY, VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE);
		}
		return category;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Characteristic> getCharacteristicDefinition() {
		if (characteristicDefinition == null) {
			characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VDMLPackage.ROLE_DEFINITION__CHARACTERISTIC_DEFINITION);
		}
		return characteristicDefinition;
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
			case VDMLPackage.ROLE_DEFINITION__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.ROLE_DEFINITION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.ROLE_DEFINITION__CATEGORY:
				return getCategory();
			case VDMLPackage.ROLE_DEFINITION__CHARACTERISTIC_DEFINITION:
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
			case VDMLPackage.ROLE_DEFINITION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends RoleCategory>)newValue);
				return;
			case VDMLPackage.ROLE_DEFINITION__CHARACTERISTIC_DEFINITION:
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
			case VDMLPackage.ROLE_DEFINITION__CATEGORY:
				getCategory().clear();
				return;
			case VDMLPackage.ROLE_DEFINITION__CHARACTERISTIC_DEFINITION:
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
			case VDMLPackage.ROLE_DEFINITION__CATEGORY:
				return category != null && !category.isEmpty();
			case VDMLPackage.ROLE_DEFINITION__CHARACTERISTIC_DEFINITION:
				return characteristicDefinition != null && !characteristicDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleDefinitionImpl
