/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.ObservationScope;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.ObservationScopeImpl#getScopeUri <em>Scope Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationScopeImpl extends SmmElementImpl implements ObservationScope {
    /**
	 * The default value of the '{@link #getScopeUri() <em>Scope Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getScopeUri()
	 * @generated
	 * @ordered
	 */
    protected static final String SCOPE_URI_EDEFAULT = null;
    /**
	 * The cached value of the '{@link #getScopeUri() <em>Scope Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getScopeUri()
	 * @generated
	 * @ordered
	 */
    protected String scopeUri = SCOPE_URI_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ObservationScopeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.OBSERVATION_SCOPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getScopeUri() {
		return scopeUri;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setScopeUri(String newScopeUri) {
		String oldScopeUri = scopeUri;
		scopeUri = newScopeUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.OBSERVATION_SCOPE__SCOPE_URI, oldScopeUri, scopeUri));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SMMPackage.OBSERVATION_SCOPE__SCOPE_URI:
				return getScopeUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SMMPackage.OBSERVATION_SCOPE__SCOPE_URI:
				setScopeUri((String)newValue);
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
			case SMMPackage.OBSERVATION_SCOPE__SCOPE_URI:
				setScopeUri(SCOPE_URI_EDEFAULT);
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
			case SMMPackage.OBSERVATION_SCOPE__SCOPE_URI:
				return SCOPE_URI_EDEFAULT == null ? scopeUri != null : !SCOPE_URI_EDEFAULT.equals(scopeUri);
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
		result.append(" (scopeUri: ");
		result.append(scopeUri);
		result.append(')');
		return result.toString();
	}

} //ObservationScopeImpl
