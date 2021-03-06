/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.RoleCategory;
import org.omg.vdml.RoleDefinition;
import org.omg.vdml.RoleLibrary;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.RoleLibraryImpl#getRoleDefinition <em>Role Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.RoleLibraryImpl#getRoleCategory <em>Role Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleLibraryImpl extends VdmlElementImpl implements RoleLibrary {
    /**
	 * The cached value of the '{@link #getRoleDefinition() <em>Role Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRoleDefinition()
	 * @generated
	 * @ordered
	 */
    protected EList<RoleDefinition> roleDefinition;

    /**
	 * The cached value of the '{@link #getRoleCategory() <em>Role Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRoleCategory()
	 * @generated
	 * @ordered
	 */
    protected EList<RoleCategory> roleCategory;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RoleLibraryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.ROLE_LIBRARY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RoleDefinition> getRoleDefinition() {
		if (roleDefinition == null) {
			roleDefinition = new EObjectContainmentEList<RoleDefinition>(RoleDefinition.class, this, VDMLPackage.ROLE_LIBRARY__ROLE_DEFINITION);
		}
		return roleDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RoleCategory> getRoleCategory() {
		if (roleCategory == null) {
			roleCategory = new EObjectContainmentEList<RoleCategory>(RoleCategory.class, this, VDMLPackage.ROLE_LIBRARY__ROLE_CATEGORY);
		}
		return roleCategory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.ROLE_LIBRARY__ROLE_DEFINITION:
				return ((InternalEList<?>)getRoleDefinition()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ROLE_LIBRARY__ROLE_CATEGORY:
				return ((InternalEList<?>)getRoleCategory()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.ROLE_LIBRARY__ROLE_DEFINITION:
				return getRoleDefinition();
			case VDMLPackage.ROLE_LIBRARY__ROLE_CATEGORY:
				return getRoleCategory();
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
			case VDMLPackage.ROLE_LIBRARY__ROLE_DEFINITION:
				getRoleDefinition().clear();
				getRoleDefinition().addAll((Collection<? extends RoleDefinition>)newValue);
				return;
			case VDMLPackage.ROLE_LIBRARY__ROLE_CATEGORY:
				getRoleCategory().clear();
				getRoleCategory().addAll((Collection<? extends RoleCategory>)newValue);
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
			case VDMLPackage.ROLE_LIBRARY__ROLE_DEFINITION:
				getRoleDefinition().clear();
				return;
			case VDMLPackage.ROLE_LIBRARY__ROLE_CATEGORY:
				getRoleCategory().clear();
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
			case VDMLPackage.ROLE_LIBRARY__ROLE_DEFINITION:
				return roleDefinition != null && !roleDefinition.isEmpty();
			case VDMLPackage.ROLE_LIBRARY__ROLE_CATEGORY:
				return roleCategory != null && !roleCategory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleLibraryImpl
