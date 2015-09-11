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
import org.omg.vdml.Capability;
import org.omg.vdml.CapabilityDependency;
import org.omg.vdml.CapabilityLibrary;
import org.omg.vdml.VDMLPackage;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.CapabilityLibraryImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityLibraryImpl#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityLibraryImpl extends VdmlElementImpl implements CapabilityLibrary {
    /**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
    protected EList<Capability> capability;

    /**
	 * The cached value of the '{@link #getCapabilityDependency() <em>Capability Dependency</em>}' containment reference list.
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
    protected CapabilityLibraryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.CAPABILITY_LIBRARY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<Capability>(Capability.class, this, VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY);
		}
		return capability;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<CapabilityDependency> getCapabilityDependency() {
		if (capabilityDependency == null) {
			capabilityDependency = new EObjectContainmentEList<CapabilityDependency>(CapabilityDependency.class, this, VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY);
		}
		return capabilityDependency;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY:
				return getCapability();
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends Capability>)newValue);
				return;
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY:
				getCapability().clear();
				return;
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY:
				return capability != null && !capability.isEmpty();
			case VDMLPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
				return capabilityDependency != null && !capabilityDependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityLibraryImpl
