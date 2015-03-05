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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.CapabilityMethod;
import org.pavanecce.vdml.metamodel.vdml.CapabilityOffer;
import org.pavanecce.vdml.metamodel.vdml.OrgUnit;
import org.pavanecce.vdml.metamodel.vdml.Position;
import org.pavanecce.vdml.metamodel.vdml.Store;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl#getCapabilityOffer <em>Capability Offer</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl#getOwnedMethod <em>Owned Method</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl#getOwnedStore <em>Owned Store</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrgUnitImpl extends CollaborationImpl implements OrgUnit {
    /**
     * The cached value of the '{@link #getCapabilityOffer() <em>Capability Offer</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityOffer()
     * @generated
     * @ordered
     */
    protected EList<CapabilityOffer> capabilityOffer;

    /**
     * The cached value of the '{@link #getOwnedMethod() <em>Owned Method</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedMethod()
     * @generated
     * @ordered
     */
    protected EList<CapabilityMethod> ownedMethod;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected EList<Position> position;

    /**
     * The cached value of the '{@link #getOwnedStore() <em>Owned Store</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedStore()
     * @generated
     * @ordered
     */
    protected EList<Store> ownedStore;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OrgUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.ORG_UNIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityOffer> getCapabilityOffer() {
        if (capabilityOffer == null) {
            capabilityOffer = new EObjectContainmentWithInverseEList<CapabilityOffer>(CapabilityOffer.class, this, VdmlPackage.ORG_UNIT__CAPABILITY_OFFER, VdmlPackage.CAPABILITY_OFFER__CAPABILITY_PROVIDER);
        }
        return capabilityOffer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityMethod> getOwnedMethod() {
        if (ownedMethod == null) {
            ownedMethod = new EObjectContainmentWithInverseEList<CapabilityMethod>(CapabilityMethod.class, this, VdmlPackage.ORG_UNIT__OWNED_METHOD, VdmlPackage.CAPABILITY_METHOD__METHOD_OWNER);
        }
        return ownedMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Position> getPosition() {
        if (position == null) {
            position = new EObjectContainmentEList<Position>(Position.class, this, VdmlPackage.ORG_UNIT__POSITION);
        }
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ORG_UNIT__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Store> getOwnedStore() {
        if (ownedStore == null) {
            ownedStore = new EObjectContainmentWithInverseEList<Store>(Store.class, this, VdmlPackage.ORG_UNIT__OWNED_STORE, VdmlPackage.STORE__STORE_OWNER);
        }
        return ownedStore;
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
            case VdmlPackage.ORG_UNIT__CAPABILITY_OFFER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilityOffer()).basicAdd(otherEnd, msgs);
            case VdmlPackage.ORG_UNIT__OWNED_METHOD:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMethod()).basicAdd(otherEnd, msgs);
            case VdmlPackage.ORG_UNIT__OWNED_STORE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStore()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.ORG_UNIT__CAPABILITY_OFFER:
                return ((InternalEList<?>)getCapabilityOffer()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ORG_UNIT__OWNED_METHOD:
                return ((InternalEList<?>)getOwnedMethod()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ORG_UNIT__POSITION:
                return ((InternalEList<?>)getPosition()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ORG_UNIT__OWNED_STORE:
                return ((InternalEList<?>)getOwnedStore()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.ORG_UNIT__CAPABILITY_OFFER:
                return getCapabilityOffer();
            case VdmlPackage.ORG_UNIT__OWNED_METHOD:
                return getOwnedMethod();
            case VdmlPackage.ORG_UNIT__POSITION:
                return getPosition();
            case VdmlPackage.ORG_UNIT__OWNED_STORE:
                return getOwnedStore();
            case VdmlPackage.ORG_UNIT__LOCATION:
                return getLocation();
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
            case VdmlPackage.ORG_UNIT__CAPABILITY_OFFER:
                getCapabilityOffer().clear();
                getCapabilityOffer().addAll((Collection<? extends CapabilityOffer>)newValue);
                return;
            case VdmlPackage.ORG_UNIT__OWNED_METHOD:
                getOwnedMethod().clear();
                getOwnedMethod().addAll((Collection<? extends CapabilityMethod>)newValue);
                return;
            case VdmlPackage.ORG_UNIT__POSITION:
                getPosition().clear();
                getPosition().addAll((Collection<? extends Position>)newValue);
                return;
            case VdmlPackage.ORG_UNIT__OWNED_STORE:
                getOwnedStore().clear();
                getOwnedStore().addAll((Collection<? extends Store>)newValue);
                return;
            case VdmlPackage.ORG_UNIT__LOCATION:
                setLocation((String)newValue);
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
            case VdmlPackage.ORG_UNIT__CAPABILITY_OFFER:
                getCapabilityOffer().clear();
                return;
            case VdmlPackage.ORG_UNIT__OWNED_METHOD:
                getOwnedMethod().clear();
                return;
            case VdmlPackage.ORG_UNIT__POSITION:
                getPosition().clear();
                return;
            case VdmlPackage.ORG_UNIT__OWNED_STORE:
                getOwnedStore().clear();
                return;
            case VdmlPackage.ORG_UNIT__LOCATION:
                setLocation(LOCATION_EDEFAULT);
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
            case VdmlPackage.ORG_UNIT__CAPABILITY_OFFER:
                return capabilityOffer != null && !capabilityOffer.isEmpty();
            case VdmlPackage.ORG_UNIT__OWNED_METHOD:
                return ownedMethod != null && !ownedMethod.isEmpty();
            case VdmlPackage.ORG_UNIT__POSITION:
                return position != null && !position.isEmpty();
            case VdmlPackage.ORG_UNIT__OWNED_STORE:
                return ownedStore != null && !ownedStore.isEmpty();
            case VdmlPackage.ORG_UNIT__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
        result.append(" (location: ");
        result.append(location);
        result.append(')');
        return result.toString();
    }

} //OrgUnitImpl
