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
import org.pavanecce.vdml.metamodel.vdml.RoleCategory;
import org.pavanecce.vdml.metamodel.vdml.RoleDefinition;
import org.pavanecce.vdml.metamodel.vdml.RoleLibrary;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleLibraryImpl#getRoleDefinition <em>Role Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleLibraryImpl#getRoleCategory <em>Role Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleLibraryImpl extends VdmlElementImpl implements RoleLibrary {
    /**
     * The cached value of the '{@link #getRoleDefinition() <em>Role Definition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleDefinition()
     * @generated
     * @ordered
     */
    protected EList<RoleDefinition> roleDefinition;

    /**
     * The cached value of the '{@link #getRoleCategory() <em>Role Category</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleCategory()
     * @generated
     * @ordered
     */
    protected EList<RoleCategory> roleCategory;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleLibraryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.ROLE_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleDefinition> getRoleDefinition() {
        if (roleDefinition == null) {
            roleDefinition = new EObjectContainmentEList<RoleDefinition>(RoleDefinition.class, this, VdmlPackage.ROLE_LIBRARY__ROLE_DEFINITION);
        }
        return roleDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleCategory> getRoleCategory() {
        if (roleCategory == null) {
            roleCategory = new EObjectContainmentEList<RoleCategory>(RoleCategory.class, this, VdmlPackage.ROLE_LIBRARY__ROLE_CATEGORY);
        }
        return roleCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.ROLE_LIBRARY__ROLE_DEFINITION:
                return ((InternalEList<?>)getRoleDefinition()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ROLE_LIBRARY__ROLE_CATEGORY:
                return ((InternalEList<?>)getRoleCategory()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.ROLE_LIBRARY__ROLE_DEFINITION:
                return getRoleDefinition();
            case VdmlPackage.ROLE_LIBRARY__ROLE_CATEGORY:
                return getRoleCategory();
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
            case VdmlPackage.ROLE_LIBRARY__ROLE_DEFINITION:
                getRoleDefinition().clear();
                getRoleDefinition().addAll((Collection<? extends RoleDefinition>)newValue);
                return;
            case VdmlPackage.ROLE_LIBRARY__ROLE_CATEGORY:
                getRoleCategory().clear();
                getRoleCategory().addAll((Collection<? extends RoleCategory>)newValue);
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
            case VdmlPackage.ROLE_LIBRARY__ROLE_DEFINITION:
                getRoleDefinition().clear();
                return;
            case VdmlPackage.ROLE_LIBRARY__ROLE_CATEGORY:
                getRoleCategory().clear();
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
            case VdmlPackage.ROLE_LIBRARY__ROLE_DEFINITION:
                return roleDefinition != null && !roleDefinition.isEmpty();
            case VdmlPackage.ROLE_LIBRARY__ROLE_CATEGORY:
                return roleCategory != null && !roleCategory.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RoleLibraryImpl
