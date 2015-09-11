/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.RoleCategory;
import org.omg.vdml.RoleDefinition;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.RoleCategoryImpl#getCategoryRole <em>Category Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleCategoryImpl extends VdmlElementImpl implements RoleCategory {
    /**
	 * The cached value of the '{@link #getCategoryRole() <em>Category Role</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCategoryRole()
	 * @generated
	 * @ordered
	 */
    protected EList<RoleDefinition> categoryRole;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RoleCategoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.ROLE_CATEGORY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RoleDefinition> getCategoryRole() {
		if (categoryRole == null) {
			categoryRole = new EObjectWithInverseResolvingEList.ManyInverse<RoleDefinition>(RoleDefinition.class, this, VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE, VDMLPackage.ROLE_DEFINITION__CATEGORY);
		}
		return categoryRole;
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
			case VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryRole()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE:
				return ((InternalEList<?>)getCategoryRole()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE:
				return getCategoryRole();
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
			case VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE:
				getCategoryRole().clear();
				getCategoryRole().addAll((Collection<? extends RoleDefinition>)newValue);
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
			case VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE:
				getCategoryRole().clear();
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
			case VDMLPackage.ROLE_CATEGORY__CATEGORY_ROLE:
				return categoryRole != null && !categoryRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleCategoryImpl
