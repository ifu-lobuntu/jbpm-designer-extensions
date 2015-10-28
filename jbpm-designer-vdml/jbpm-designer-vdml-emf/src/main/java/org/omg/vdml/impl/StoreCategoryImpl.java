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
import org.omg.vdml.StoreCategory;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.StoreCategoryImpl#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreCategoryImpl#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreCategoryImpl#getCategoryStore <em>Category Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreCategoryImpl extends StoreLibraryElementImpl implements StoreCategory {
	/**
	 * The cached value of the '{@link #getChildCategory() <em>Child Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreCategory> childCategory;

	/**
	 * The cached value of the '{@link #getParentCategory() <em>Parent Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreCategory> parentCategory;

	/**
	 * The cached value of the '{@link #getCategoryStore() <em>Category Store</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryStore()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreDefinition> categoryStore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.STORE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoreCategory> getChildCategory() {
		if (childCategory == null) {
			childCategory = new EObjectWithInverseResolvingEList.ManyInverse<StoreCategory>(StoreCategory.class, this, VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY, VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY);
		}
		return childCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoreCategory> getParentCategory() {
		if (parentCategory == null) {
			parentCategory = new EObjectWithInverseResolvingEList.ManyInverse<StoreCategory>(StoreCategory.class, this, VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY, VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY);
		}
		return parentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoreDefinition> getCategoryStore() {
		if (categoryStore == null) {
			categoryStore = new EObjectWithInverseResolvingEList.ManyInverse<StoreDefinition>(StoreDefinition.class, this, VDMLPackage.STORE_CATEGORY__CATEGORY_STORE, VDMLPackage.STORE_DEFINITION__CATEGORY);
		}
		return categoryStore;
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
			case VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCategory()).basicAdd(otherEnd, msgs);
			case VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCategory()).basicAdd(otherEnd, msgs);
			case VDMLPackage.STORE_CATEGORY__CATEGORY_STORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryStore()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY:
				return ((InternalEList<?>)getChildCategory()).basicRemove(otherEnd, msgs);
			case VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY:
				return ((InternalEList<?>)getParentCategory()).basicRemove(otherEnd, msgs);
			case VDMLPackage.STORE_CATEGORY__CATEGORY_STORE:
				return ((InternalEList<?>)getCategoryStore()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY:
				return getChildCategory();
			case VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY:
				return getParentCategory();
			case VDMLPackage.STORE_CATEGORY__CATEGORY_STORE:
				return getCategoryStore();
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
			case VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY:
				getChildCategory().clear();
				getChildCategory().addAll((Collection<? extends StoreCategory>)newValue);
				return;
			case VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY:
				getParentCategory().clear();
				getParentCategory().addAll((Collection<? extends StoreCategory>)newValue);
				return;
			case VDMLPackage.STORE_CATEGORY__CATEGORY_STORE:
				getCategoryStore().clear();
				getCategoryStore().addAll((Collection<? extends StoreDefinition>)newValue);
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
			case VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY:
				getChildCategory().clear();
				return;
			case VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY:
				getParentCategory().clear();
				return;
			case VDMLPackage.STORE_CATEGORY__CATEGORY_STORE:
				getCategoryStore().clear();
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
			case VDMLPackage.STORE_CATEGORY__CHILD_CATEGORY:
				return childCategory != null && !childCategory.isEmpty();
			case VDMLPackage.STORE_CATEGORY__PARENT_CATEGORY:
				return parentCategory != null && !parentCategory.isEmpty();
			case VDMLPackage.STORE_CATEGORY__CATEGORY_STORE:
				return categoryStore != null && !categoryStore.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StoreCategoryImpl
