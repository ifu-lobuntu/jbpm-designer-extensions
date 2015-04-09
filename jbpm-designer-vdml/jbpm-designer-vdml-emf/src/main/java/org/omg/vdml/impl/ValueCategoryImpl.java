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
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueCategory;
import org.omg.vdml.ValueDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ValueCategoryImpl#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueCategoryImpl#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValueCategoryImpl#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueCategoryImpl extends VdmlElementImpl implements ValueCategory {
    /**
     * The cached value of the '{@link #getParentCategory() <em>Parent Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentCategory()
     * @generated
     * @ordered
     */
    protected EList<ValueCategory> parentCategory;

    /**
     * The cached value of the '{@link #getChildCategory() <em>Child Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildCategory()
     * @generated
     * @ordered
     */
    protected EList<ValueCategory> childCategory;

    /**
     * The cached value of the '{@link #getCategoryValue() <em>Category Value</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategoryValue()
     * @generated
     * @ordered
     */
    protected EList<ValueDefinition> categoryValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.VALUE_CATEGORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueCategory> getParentCategory() {
        if (parentCategory == null) {
            parentCategory = new EObjectWithInverseResolvingEList.ManyInverse<ValueCategory>(ValueCategory.class, this, VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY, VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY);
        }
        return parentCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueCategory> getChildCategory() {
        if (childCategory == null) {
            childCategory = new EObjectWithInverseResolvingEList.ManyInverse<ValueCategory>(ValueCategory.class, this, VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY, VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY);
        }
        return childCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueDefinition> getCategoryValue() {
        if (categoryValue == null) {
            categoryValue = new EObjectWithInverseResolvingEList.ManyInverse<ValueDefinition>(ValueDefinition.class, this, VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE, VDMLPackage.VALUE_DEFINITION__CATEGORY);
        }
        return categoryValue;
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
            case VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCategory()).basicAdd(otherEnd, msgs);
            case VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCategory()).basicAdd(otherEnd, msgs);
            case VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryValue()).basicAdd(otherEnd, msgs);
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
            case VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY:
                return ((InternalEList<?>)getParentCategory()).basicRemove(otherEnd, msgs);
            case VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY:
                return ((InternalEList<?>)getChildCategory()).basicRemove(otherEnd, msgs);
            case VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE:
                return ((InternalEList<?>)getCategoryValue()).basicRemove(otherEnd, msgs);
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
            case VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY:
                return getParentCategory();
            case VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY:
                return getChildCategory();
            case VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE:
                return getCategoryValue();
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
            case VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY:
                getParentCategory().clear();
                getParentCategory().addAll((Collection<? extends ValueCategory>)newValue);
                return;
            case VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY:
                getChildCategory().clear();
                getChildCategory().addAll((Collection<? extends ValueCategory>)newValue);
                return;
            case VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE:
                getCategoryValue().clear();
                getCategoryValue().addAll((Collection<? extends ValueDefinition>)newValue);
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
            case VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY:
                getParentCategory().clear();
                return;
            case VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY:
                getChildCategory().clear();
                return;
            case VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE:
                getCategoryValue().clear();
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
            case VDMLPackage.VALUE_CATEGORY__PARENT_CATEGORY:
                return parentCategory != null && !parentCategory.isEmpty();
            case VDMLPackage.VALUE_CATEGORY__CHILD_CATEGORY:
                return childCategory != null && !childCategory.isEmpty();
            case VDMLPackage.VALUE_CATEGORY__CATEGORY_VALUE:
                return categoryValue != null && !categoryValue.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ValueCategoryImpl
