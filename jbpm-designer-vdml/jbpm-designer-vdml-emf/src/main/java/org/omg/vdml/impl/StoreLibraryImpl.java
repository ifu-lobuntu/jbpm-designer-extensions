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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.vdml.StoreDefinition;
import org.omg.vdml.StoreLibrary;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.StoreLibraryImpl#getStoreDefinitions <em>Store Definitions</em>}</li>
 *   <li>{@link org.omg.vdml.impl.StoreLibraryImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreLibraryImpl extends VdmlElementImpl implements StoreLibrary {
	/**
	 * The cached value of the '{@link #getStoreDefinitions() <em>Store Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StoreDefinition> storeDefinitions;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected StoreLibrary library;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMLPackage.Literals.STORE_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoreDefinition> getStoreDefinitions() {
		if (storeDefinitions == null) {
			storeDefinitions = new EObjectContainmentEList<StoreDefinition>(StoreDefinition.class, this, VDMLPackage.STORE_LIBRARY__STORE_DEFINITIONS);
		}
		return storeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreLibrary getLibrary() {
		if (library != null && library.eIsProxy()) {
			InternalEObject oldLibrary = (InternalEObject)library;
			library = (StoreLibrary)eResolveProxy(oldLibrary);
			if (library != oldLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.STORE_LIBRARY__LIBRARY, oldLibrary, library));
			}
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreLibrary basicGetLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(StoreLibrary newLibrary) {
		StoreLibrary oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.STORE_LIBRARY__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.STORE_LIBRARY__STORE_DEFINITIONS:
				return ((InternalEList<?>)getStoreDefinitions()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.STORE_LIBRARY__STORE_DEFINITIONS:
				return getStoreDefinitions();
			case VDMLPackage.STORE_LIBRARY__LIBRARY:
				if (resolve) return getLibrary();
				return basicGetLibrary();
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
			case VDMLPackage.STORE_LIBRARY__STORE_DEFINITIONS:
				getStoreDefinitions().clear();
				getStoreDefinitions().addAll((Collection<? extends StoreDefinition>)newValue);
				return;
			case VDMLPackage.STORE_LIBRARY__LIBRARY:
				setLibrary((StoreLibrary)newValue);
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
			case VDMLPackage.STORE_LIBRARY__STORE_DEFINITIONS:
				getStoreDefinitions().clear();
				return;
			case VDMLPackage.STORE_LIBRARY__LIBRARY:
				setLibrary((StoreLibrary)null);
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
			case VDMLPackage.STORE_LIBRARY__STORE_DEFINITIONS:
				return storeDefinitions != null && !storeDefinitions.isEmpty();
			case VDMLPackage.STORE_LIBRARY__LIBRARY:
				return library != null;
		}
		return super.eIsSet(featureID);
	}

} //StoreLibraryImpl
