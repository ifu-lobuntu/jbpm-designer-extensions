/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.vdml.Capability;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl#getParentCabability <em>Parent Cabability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl#getChildCapability <em>Child Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CapabilityImpl extends VdmlElementImpl implements Capability {
    /**
     * The cached value of the '{@link #getParentCabability() <em>Parent Cabability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentCabability()
     * @generated
     * @ordered
     */
    protected EList<Capability> parentCabability;

    /**
     * The cached value of the '{@link #getChildCapability() <em>Child Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildCapability()
     * @generated
     * @ordered
     */
    protected EList<Capability> childCapability;

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
    protected CapabilityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.CAPABILITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Capability> getParentCabability() {
        if (parentCabability == null) {
            parentCabability = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, VdmlPackage.CAPABILITY__PARENT_CABABILITY, VdmlPackage.CAPABILITY__CHILD_CAPABILITY);
        }
        return parentCabability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Capability> getChildCapability() {
        if (childCapability == null) {
            childCapability = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, VdmlPackage.CAPABILITY__CHILD_CAPABILITY, VdmlPackage.CAPABILITY__PARENT_CABABILITY);
        }
        return childCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Characteristic> getCharacteristicDefinition() {
        if (characteristicDefinition == null) {
            characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VdmlPackage.CAPABILITY__CHARACTERISTIC_DEFINITION);
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
            case VdmlPackage.CAPABILITY__PARENT_CABABILITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCabability()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY__CHILD_CAPABILITY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCapability()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.CAPABILITY__PARENT_CABABILITY:
                return ((InternalEList<?>)getParentCabability()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY__CHILD_CAPABILITY:
                return ((InternalEList<?>)getChildCapability()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.CAPABILITY__PARENT_CABABILITY:
                return getParentCabability();
            case VdmlPackage.CAPABILITY__CHILD_CAPABILITY:
                return getChildCapability();
            case VdmlPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
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
            case VdmlPackage.CAPABILITY__PARENT_CABABILITY:
                getParentCabability().clear();
                getParentCabability().addAll((Collection<? extends Capability>)newValue);
                return;
            case VdmlPackage.CAPABILITY__CHILD_CAPABILITY:
                getChildCapability().clear();
                getChildCapability().addAll((Collection<? extends Capability>)newValue);
                return;
            case VdmlPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
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
            case VdmlPackage.CAPABILITY__PARENT_CABABILITY:
                getParentCabability().clear();
                return;
            case VdmlPackage.CAPABILITY__CHILD_CAPABILITY:
                getChildCapability().clear();
                return;
            case VdmlPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
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
            case VdmlPackage.CAPABILITY__PARENT_CABABILITY:
                return parentCabability != null && !parentCabability.isEmpty();
            case VdmlPackage.CAPABILITY__CHILD_CAPABILITY:
                return childCapability != null && !childCapability.isEmpty();
            case VdmlPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
                return characteristicDefinition != null && !characteristicDefinition.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CapabilityImpl
