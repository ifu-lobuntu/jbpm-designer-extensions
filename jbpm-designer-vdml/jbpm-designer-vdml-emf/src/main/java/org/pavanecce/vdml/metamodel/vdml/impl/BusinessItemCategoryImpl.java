/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl#getCategoryItem <em>Category Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessItemCategoryImpl extends BusinessItemLibraryElementImpl implements BusinessItemCategory {
    /**
     * The cached value of the '{@link #getParentCategory() <em>Parent Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentCategory()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemCategory> parentCategory;

    /**
     * The cached value of the '{@link #getChildCategory() <em>Child Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildCategory()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemCategory> childCategory;

    /**
     * The cached value of the '{@link #getCategoryItem() <em>Category Item</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategoryItem()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemDefinition> categoryItem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessItemCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.BUSINESS_ITEM_CATEGORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemCategory> getParentCategory() {
        if (parentCategory == null) {
            parentCategory = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemCategory>(BusinessItemCategory.class, this, VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY, VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY);
        }
        return parentCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemCategory> getChildCategory() {
        if (childCategory == null) {
            childCategory = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemCategory>(BusinessItemCategory.class, this, VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY, VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY);
        }
        return childCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemDefinition> getCategoryItem() {
        if (categoryItem == null) {
            categoryItem = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemDefinition>(BusinessItemDefinition.class, this, VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM, VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY);
        }
        return categoryItem;
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
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCategory()).basicAdd(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCategory()).basicAdd(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryItem()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY:
                return ((InternalEList<?>)getParentCategory()).basicRemove(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY:
                return ((InternalEList<?>)getChildCategory()).basicRemove(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM:
                return ((InternalEList<?>)getCategoryItem()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY:
                return getParentCategory();
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY:
                return getChildCategory();
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM:
                return getCategoryItem();
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
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY:
                getParentCategory().clear();
                getParentCategory().addAll((Collection<? extends BusinessItemCategory>)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY:
                getChildCategory().clear();
                getChildCategory().addAll((Collection<? extends BusinessItemCategory>)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM:
                getCategoryItem().clear();
                getCategoryItem().addAll((Collection<? extends BusinessItemDefinition>)newValue);
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
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY:
                getParentCategory().clear();
                return;
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY:
                getChildCategory().clear();
                return;
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM:
                getCategoryItem().clear();
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
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY:
                return parentCategory != null && !parentCategory.isEmpty();
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY:
                return childCategory != null && !childCategory.isEmpty();
            case VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM:
                return categoryItem != null && !categoryItem.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BusinessItemCategoryImpl
