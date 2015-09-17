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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.Characteristic;
import org.omg.vdml.Capability;
import org.omg.vdml.ExchangeConfiguration;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.CapabilityImpl#getParentCabability <em>Parent Cabability</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityImpl#getChildCapability <em>Child Capability</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityImpl#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityImpl#getExchangeConfiguration <em>Exchange Configuration</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getExchangeConfiguration() <em>Exchange Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ExchangeConfiguration exchangeConfiguration;

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
		return VDMLPackage.Literals.CAPABILITY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Capability> getParentCabability() {
		if (parentCabability == null) {
			parentCabability = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, VDMLPackage.CAPABILITY__PARENT_CABABILITY, VDMLPackage.CAPABILITY__CHILD_CAPABILITY);
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
			childCapability = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, VDMLPackage.CAPABILITY__CHILD_CAPABILITY, VDMLPackage.CAPABILITY__PARENT_CABABILITY);
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
			characteristicDefinition = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, VDMLPackage.CAPABILITY__CHARACTERISTIC_DEFINITION);
		}
		return characteristicDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeConfiguration getExchangeConfiguration() {
		return exchangeConfiguration;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchangeConfiguration(ExchangeConfiguration newExchangeConfiguration, NotificationChain msgs) {
		ExchangeConfiguration oldExchangeConfiguration = exchangeConfiguration;
		exchangeConfiguration = newExchangeConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION, oldExchangeConfiguration, newExchangeConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeConfiguration(ExchangeConfiguration newExchangeConfiguration) {
		if (newExchangeConfiguration != exchangeConfiguration) {
			NotificationChain msgs = null;
			if (exchangeConfiguration != null)
				msgs = ((InternalEObject)exchangeConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION, null, msgs);
			if (newExchangeConfiguration != null)
				msgs = ((InternalEObject)newExchangeConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION, null, msgs);
			msgs = basicSetExchangeConfiguration(newExchangeConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION, newExchangeConfiguration, newExchangeConfiguration));
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
			case VDMLPackage.CAPABILITY__PARENT_CABABILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCabability()).basicAdd(otherEnd, msgs);
			case VDMLPackage.CAPABILITY__CHILD_CAPABILITY:
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
			case VDMLPackage.CAPABILITY__PARENT_CABABILITY:
				return ((InternalEList<?>)getParentCabability()).basicRemove(otherEnd, msgs);
			case VDMLPackage.CAPABILITY__CHILD_CAPABILITY:
				return ((InternalEList<?>)getChildCapability()).basicRemove(otherEnd, msgs);
			case VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION:
				return basicSetExchangeConfiguration(null, msgs);
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
			case VDMLPackage.CAPABILITY__PARENT_CABABILITY:
				return getParentCabability();
			case VDMLPackage.CAPABILITY__CHILD_CAPABILITY:
				return getChildCapability();
			case VDMLPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
				return getCharacteristicDefinition();
			case VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION:
				return getExchangeConfiguration();
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
			case VDMLPackage.CAPABILITY__PARENT_CABABILITY:
				getParentCabability().clear();
				getParentCabability().addAll((Collection<? extends Capability>)newValue);
				return;
			case VDMLPackage.CAPABILITY__CHILD_CAPABILITY:
				getChildCapability().clear();
				getChildCapability().addAll((Collection<? extends Capability>)newValue);
				return;
			case VDMLPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				getCharacteristicDefinition().addAll((Collection<? extends Characteristic>)newValue);
				return;
			case VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION:
				setExchangeConfiguration((ExchangeConfiguration)newValue);
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
			case VDMLPackage.CAPABILITY__PARENT_CABABILITY:
				getParentCabability().clear();
				return;
			case VDMLPackage.CAPABILITY__CHILD_CAPABILITY:
				getChildCapability().clear();
				return;
			case VDMLPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
				getCharacteristicDefinition().clear();
				return;
			case VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION:
				setExchangeConfiguration((ExchangeConfiguration)null);
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
			case VDMLPackage.CAPABILITY__PARENT_CABABILITY:
				return parentCabability != null && !parentCabability.isEmpty();
			case VDMLPackage.CAPABILITY__CHILD_CAPABILITY:
				return childCapability != null && !childCapability.isEmpty();
			case VDMLPackage.CAPABILITY__CHARACTERISTIC_DEFINITION:
				return characteristicDefinition != null && !characteristicDefinition.isEmpty();
			case VDMLPackage.CAPABILITY__EXCHANGE_CONFIGURATION:
				return exchangeConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
