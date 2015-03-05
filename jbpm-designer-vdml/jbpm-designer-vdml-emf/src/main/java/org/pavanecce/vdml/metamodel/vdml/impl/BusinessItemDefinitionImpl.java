/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDependency;
import org.pavanecce.vdml.metamodel.vdml.PracticeDefinition;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#isFungible <em>Is Fungible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#isShareable <em>Is Shareable</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl#getCapabilityDependency <em>Capability Dependency</em>}</li>
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
     * The default value of the '{@link #isFungible() <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFungible()
     * @generated
     * @ordered
     */
    protected static final boolean IS_FUNGIBLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isFungible() <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFungible()
     * @generated
     * @ordered
     */
    protected boolean isFungible = IS_FUNGIBLE_EDEFAULT;

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
     * The cached value of the '{@link #getCharacteristicDefinition() <em>Characteristic Definition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacteristicDefinition()
     * @generated
     * @ordered
     */
    protected EList<Characteristic> characteristicDefinition;

    /**
     * The default value of the '{@link #isShareable() <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShareable()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SHAREABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isShareable() <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isShareable()
     * @generated
     * @ordered
     */
    protected boolean isShareable = IS_SHAREABLE_EDEFAULT;

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
        return VdmlPackage.Literals.BUSINESS_ITEM_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeDefinition> getPracticeDefinition() {
        if (practiceDefinition == null) {
            practiceDefinition = new EObjectWithInverseResolvingEList.ManyInverse<PracticeDefinition>(PracticeDefinition.class, this, VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION, VdmlPackage.PRACTICE_DEFINITION__RESOURCE_DEFINITION);
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
            supportedCapability = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityDefinition>(CapabilityDefinition.class, this, VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY, VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION);
        }
        return supportedCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFungible() {
        return isFungible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsFungible(boolean newIsFungible) {
        boolean oldIsFungible = isFungible;
        isFungible = newIsFungible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE, oldIsFungible, isFungible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemCategory> getCategory() {
        if (category == null) {
            category = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemCategory>(BusinessItemCategory.class, this, VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY, VdmlPackage.BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM);
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
            characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VdmlPackage.BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION);
        }
        return characteristicDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isShareable() {
        return isShareable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsShareable(boolean newIsShareable) {
        boolean oldIsShareable = isShareable;
        isShareable = newIsShareable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE, oldIsShareable, isShareable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityDependency> getCapabilityDependency() {
        if (capabilityDependency == null) {
            capabilityDependency = new EObjectWithInverseResolvingEList<CapabilityDependency>(CapabilityDependency.class, this, VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY, VdmlPackage.CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION);
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
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPracticeDefinition()).basicAdd(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportedCapability()).basicAdd(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return ((InternalEList<?>)getPracticeDefinition()).basicRemove(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return ((InternalEList<?>)getSupportedCapability()).basicRemove(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return getPracticeDefinition();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return getSupportedCapability();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                return isFungible();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return getCategory();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION:
                return getCharacteristicDefinition();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                return isShareable();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                getPracticeDefinition().addAll((Collection<? extends PracticeDefinition>)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                getSupportedCapability().clear();
                getSupportedCapability().addAll((Collection<? extends CapabilityDefinition>)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                setIsFungible((Boolean)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                getCategory().clear();
                getCategory().addAll((Collection<? extends BusinessItemCategory>)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION:
                getCharacteristicDefinition().clear();
                getCharacteristicDefinition().addAll((Collection<? extends Characteristic>)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                setIsShareable((Boolean)newValue);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                getSupportedCapability().clear();
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                setIsFungible(IS_FUNGIBLE_EDEFAULT);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                getCategory().clear();
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION:
                getCharacteristicDefinition().clear();
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                setIsShareable(IS_SHAREABLE_EDEFAULT);
                return;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION:
                return practiceDefinition != null && !practiceDefinition.isEmpty();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY:
                return supportedCapability != null && !supportedCapability.isEmpty();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE:
                return isFungible != IS_FUNGIBLE_EDEFAULT;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CATEGORY:
                return category != null && !category.isEmpty();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION:
                return characteristicDefinition != null && !characteristicDefinition.isEmpty();
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__IS_SHAREABLE:
                return isShareable != IS_SHAREABLE_EDEFAULT;
            case VdmlPackage.BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY:
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
