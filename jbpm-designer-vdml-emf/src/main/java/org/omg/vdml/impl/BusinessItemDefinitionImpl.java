/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.BusinessItemCategory;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.CapabilityDependency;
import org.omg.vdml.PracticeDefinition;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.BusinessItemDefinitionImpl#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.BusinessItemDefinitionImpl#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.omg.vdml.impl.BusinessItemDefinitionImpl#getIsFungible <em>Is Fungible</em>}</li>
 *   <li>{@link org.omg.vdml.impl.BusinessItemDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.vdml.impl.BusinessItemDefinitionImpl#getIsShareable <em>Is Shareable</em>}</li>
 *   <li>{@link org.omg.vdml.impl.BusinessItemDefinitionImpl#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessItemDefinitionImpl extends BusinessItemLibraryElementImpl implements BusinessItemDefinition {
    /**
     * The cached value of the '{@link #getPracticeDefinition() <em>Practice Definition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPracticeDefinition()
     * @generated
     * @ordered
     */
    protected EList<PracticeDefinition> practiceDefinition;

    /**
     * The cached value of the '{@link #getSupportedCapability() <em>Supported Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportedCapability()
     * @generated
     * @ordered
     */
    protected EList<CapabilityDefinition> supportedCapability;

    /**
     * The default value of the '{@link #getIsFungible() <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsFungible()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_FUNGIBLE_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getIsFungible() <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsFungible()
     * @generated
     * @ordered
     */
    protected Boolean isFungible = IS_FUNGIBLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemCategory> category;

    /**
     * The default value of the '{@link #getIsShareable() <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsShareable()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SHAREABLE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsShareable() <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsShareable()
     * @generated
     * @ordered
     */
    protected Boolean isShareable = IS_SHAREABLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCapabilityDependency() <em>Capability Dependency</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityDependency()
     * @generated
     * @ordered
     */
    protected EList<CapabilityDependency> capabilityDependency;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessItemDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.BUSINESS_ITEM_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeDefinition> getPracticeDefinition() {
        if (practiceDefinition == null) {
            practiceDefinition = new EObjectWithInverseResolvingEList.ManyInverse<PracticeDefinition>(PracticeDefinition.class, this, VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION, VDMLPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION);
        }
        return practiceDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityDefinition> getSupportedCapability() {
        if (supportedCapability == null) {
            supportedCapability = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityDefinition>(CapabilityDefinition.class, this, VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY, VDMLPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION);
        }
        return supportedCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsFungible() {
        return isFungible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsFungible(Boolean newIsFungible) {
        Boolean oldIsFungible = isFungible;
        isFungible = newIsFungible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE, oldIsFungible, isFungible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemCategory> getCategory() {
        if (category == null) {
            category = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemCategory>(BusinessItemCategory.class, this, VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY, VDMLPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM);
        }
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getIsShareable() {
        return isShareable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsShareable(Boolean newIsShareable) {
        Boolean oldIsShareable = isShareable;
        isShareable = newIsShareable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE, oldIsShareable, isShareable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityDependency> getCapabilityDependency() {
        if (capabilityDependency == null) {
            capabilityDependency = new EObjectWithInverseResolvingEList<CapabilityDependency>(CapabilityDependency.class, this, VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, VDMLPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION);
        }
        return capabilityDependency;
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
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPracticeDefinition()).basicAdd(otherEnd, msgs);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportedCapability()).basicAdd(otherEnd, msgs);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilityDependency()).basicAdd(otherEnd, msgs);
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
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return ((InternalEList<?>)getPracticeDefinition()).basicRemove(otherEnd, msgs);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return ((InternalEList<?>)getSupportedCapability()).basicRemove(otherEnd, msgs);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
                return ((InternalEList<?>)getCapabilityDependency()).basicRemove(otherEnd, msgs);
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
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return getPracticeDefinition();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return getSupportedCapability();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                return getIsFungible();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return getCategory();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                return getIsShareable();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
                return getCapabilityDependency();
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
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                getPracticeDefinition().addAll((Collection<? extends PracticeDefinition>)newValue);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                getSupportedCapability().clear();
                getSupportedCapability().addAll((Collection<? extends CapabilityDefinition>)newValue);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                setIsFungible((Boolean)newValue);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                getCategory().clear();
                getCategory().addAll((Collection<? extends BusinessItemCategory>)newValue);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                setIsShareable((Boolean)newValue);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
                getCapabilityDependency().clear();
                getCapabilityDependency().addAll((Collection<? extends CapabilityDependency>)newValue);
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
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                getSupportedCapability().clear();
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                setIsFungible(IS_FUNGIBLE_EDEFAULT);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                getCategory().clear();
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                setIsShareable(IS_SHAREABLE_EDEFAULT);
                return;
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
                getCapabilityDependency().clear();
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
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return practiceDefinition != null && !practiceDefinition.isEmpty();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return supportedCapability != null && !supportedCapability.isEmpty();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                return IS_FUNGIBLE_EDEFAULT == null ? isFungible != null : !IS_FUNGIBLE_EDEFAULT.equals(isFungible);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return category != null && !category.isEmpty();
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                return IS_SHAREABLE_EDEFAULT == null ? isShareable != null : !IS_SHAREABLE_EDEFAULT.equals(isShareable);
            case VDMLPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
                return capabilityDependency != null && !capabilityDependency.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isFungible: ");
        result.append(isFungible);
        result.append(", isShareable: ");
        result.append(isShareable);
        result.append(')');
        return result.toString();
    }

} //BusinessItemDefinitionImpl
