/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TImport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TImportImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TImportImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TImportImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TImportImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TImportImpl extends MinimalEObjectImpl.Container implements TImport {
    /**
     * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportType()
     * @generated
     * @ordered
     */
    protected static final String IMPORT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportType()
     * @generated
     * @ordered
     */
    protected String importType = IMPORT_TYPE_EDEFAULT;

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
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected String namespace = NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TIMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImportType() {
        return importType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImportType(String newImportType) {
        String oldImportType = importType;
        importType = newImportType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TIMPORT__IMPORT_TYPE, oldImportType, importType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TIMPORT__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace(String newNamespace) {
        String oldNamespace = namespace;
        namespace = newNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TIMPORT__NAMESPACE, oldNamespace, namespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TIMPORT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CMMNPackage.TIMPORT__IMPORT_TYPE:
                return getImportType();
            case CMMNPackage.TIMPORT__LOCATION:
                return getLocation();
            case CMMNPackage.TIMPORT__NAMESPACE:
                return getNamespace();
            case CMMNPackage.TIMPORT__ID:
                return getId();
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
            case CMMNPackage.TIMPORT__IMPORT_TYPE:
                setImportType((String)newValue);
                return;
            case CMMNPackage.TIMPORT__LOCATION:
                setLocation((String)newValue);
                return;
            case CMMNPackage.TIMPORT__NAMESPACE:
                setNamespace((String)newValue);
                return;
            case CMMNPackage.TIMPORT__ID:
                setId((String)newValue);
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
            case CMMNPackage.TIMPORT__IMPORT_TYPE:
                setImportType(IMPORT_TYPE_EDEFAULT);
                return;
            case CMMNPackage.TIMPORT__LOCATION:
                setLocation(LOCATION_EDEFAULT);
                return;
            case CMMNPackage.TIMPORT__NAMESPACE:
                setNamespace(NAMESPACE_EDEFAULT);
                return;
            case CMMNPackage.TIMPORT__ID:
                setId(ID_EDEFAULT);
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
            case CMMNPackage.TIMPORT__IMPORT_TYPE:
                return IMPORT_TYPE_EDEFAULT == null ? importType != null : !IMPORT_TYPE_EDEFAULT.equals(importType);
            case CMMNPackage.TIMPORT__LOCATION:
                return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
            case CMMNPackage.TIMPORT__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
            case CMMNPackage.TIMPORT__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (importType: ");
        result.append(importType);
        result.append(", location: ");
        result.append(location);
        result.append(", namespace: ");
        result.append(namespace);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //TImportImpl
