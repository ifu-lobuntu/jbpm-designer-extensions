/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.Capability;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDependency;
import org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityLibraryImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityLibraryImpl#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 * </p>
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
        return VdmlPackage.Literals.CAPABILITY_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Capability> getCapability() {
        if (capability == null) {
            capability = new EObjectContainmentEList<Capability>(Capability.class, this, VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY);
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
            capabilityDependency = new EObjectContainmentEList<CapabilityDependency>(CapabilityDependency.class, this, VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY);
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
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY:
                return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY:
                return getCapability();
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY:
                getCapability().clear();
                getCapability().addAll((Collection<? extends Capability>)newValue);
                return;
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY:
                getCapability().clear();
                return;
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
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
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY:
                return capability != null && !capability.isEmpty();
            case VdmlPackage.CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY:
                return capabilityDependency != null && !capabilityDependency.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CapabilityLibraryImpl
