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
import org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition;
import org.pavanecce.vdml.metamodel.vdml.PracticeCategory;
import org.pavanecce.vdml.metamodel.vdml.PracticeDefinition;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practice Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl#getResourceDefinition <em>Resource Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PracticeDefinitionImpl extends VdmlElementImpl implements PracticeDefinition {
    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected EList<PracticeCategory> category;

    /**
     * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapability()
     * @generated
     * @ordered
     */
    protected EList<CapabilityDefinition> capability;

    /**
     * The cached value of the '{@link #getResourceDefinition() <em>Resource Definition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceDefinition()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemDefinition> resourceDefinition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PracticeDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.PRACTICE_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeCategory> getCategory() {
        if (category == null) {
            category = new EObjectWithInverseResolvingEList.ManyInverse<PracticeCategory>(PracticeCategory.class, this, VdmlPackage.PRACTICE_DEFINITION__CATEGORY, VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE);
        }
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityDefinition> getCapability() {
        if (capability == null) {
            capability = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityDefinition>(CapabilityDefinition.class, this, VdmlPackage.PRACTICE_DEFINITION__CAPABILITY, VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION);
        }
        return capability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemDefinition> getResourceDefinition() {
        if (resourceDefinition == null) {
            resourceDefinition = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemDefinition>(BusinessItemDefinition.class, this, VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION, VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION);
        }
        return resourceDefinition;
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
            case VdmlPackage.PRACTICE_DEFINITION__CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
            case VdmlPackage.PRACTICE_DEFINITION__CAPABILITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapability()).basicAdd(otherEnd, msgs);
            case VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceDefinition()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.PRACTICE_DEFINITION__CATEGORY:
                return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
            case VdmlPackage.PRACTICE_DEFINITION__CAPABILITY:
                return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
            case VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION:
                return ((InternalEList<?>)getResourceDefinition()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.PRACTICE_DEFINITION__CATEGORY:
                return getCategory();
            case VdmlPackage.PRACTICE_DEFINITION__CAPABILITY:
                return getCapability();
            case VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION:
                return getResourceDefinition();
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
            case VdmlPackage.PRACTICE_DEFINITION__CATEGORY:
                getCategory().clear();
                getCategory().addAll((Collection<? extends PracticeCategory>)newValue);
                return;
            case VdmlPackage.PRACTICE_DEFINITION__CAPABILITY:
                getCapability().clear();
                getCapability().addAll((Collection<? extends CapabilityDefinition>)newValue);
                return;
            case VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION:
                getResourceDefinition().clear();
                getResourceDefinition().addAll((Collection<? extends BusinessItemDefinition>)newValue);
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
            case VdmlPackage.PRACTICE_DEFINITION__CATEGORY:
                getCategory().clear();
                return;
            case VdmlPackage.PRACTICE_DEFINITION__CAPABILITY:
                getCapability().clear();
                return;
            case VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION:
                getResourceDefinition().clear();
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
            case VdmlPackage.PRACTICE_DEFINITION__CATEGORY:
                return category != null && !category.isEmpty();
            case VdmlPackage.PRACTICE_DEFINITION__CAPABILITY:
                return capability != null && !capability.isEmpty();
            case VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION:
                return resourceDefinition != null && !resourceDefinition.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PracticeDefinitionImpl
