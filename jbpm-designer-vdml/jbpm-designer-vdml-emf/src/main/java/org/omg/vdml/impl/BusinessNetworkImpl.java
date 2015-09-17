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
import org.omg.vdml.BusinessNetwork;
import org.omg.vdml.Party;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.BusinessNetworkImpl#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessNetworkImpl extends CollaborationImpl implements BusinessNetwork {
    /**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
    protected EList<Party> party;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BusinessNetworkImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.BUSINESS_NETWORK;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Party> getParty() {
		if (party == null) {
			party = new EObjectContainmentEList<Party>(Party.class, this, VDMLPackage.BUSINESS_NETWORK__PARTY);
		}
		return party;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.BUSINESS_NETWORK__PARTY:
				return ((InternalEList<?>)getParty()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.BUSINESS_NETWORK__PARTY:
				return getParty();
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
			case VDMLPackage.BUSINESS_NETWORK__PARTY:
				getParty().clear();
				getParty().addAll((Collection<? extends Party>)newValue);
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
			case VDMLPackage.BUSINESS_NETWORK__PARTY:
				getParty().clear();
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
			case VDMLPackage.BUSINESS_NETWORK__PARTY:
				return party != null && !party.isEmpty();
		}
		return super.eIsSet(featureID);
	}
    @Override
    public EList<Role> getCollaborationRole() {
        return (EList)getParty();
    }

} //BusinessNetworkImpl
