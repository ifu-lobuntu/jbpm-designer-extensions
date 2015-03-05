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
import org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemLibraryElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Item Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryImpl#getBusinessItemLibraryElement <em>Business Item Library Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessItemLibraryImpl extends VdmlElementImpl implements BusinessItemLibrary {
    /**
     * The cached value of the '{@link #getBusinessItemLibraryElement() <em>Business Item Library Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessItemLibraryElement()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemLibraryElement> businessItemLibraryElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusinessItemLibraryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.BUSINESS_ITEM_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemLibraryElement> getBusinessItemLibraryElement() {
        if (businessItemLibraryElement == null) {
            businessItemLibraryElement = new EObjectContainmentEList<BusinessItemLibraryElement>(BusinessItemLibraryElement.class, this, VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT);
        }
        return businessItemLibraryElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT:
                return ((InternalEList<?>)getBusinessItemLibraryElement()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT:
                return getBusinessItemLibraryElement();
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
            case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT:
                getBusinessItemLibraryElement().clear();
                getBusinessItemLibraryElement().addAll((Collection<? extends BusinessItemLibraryElement>)newValue);
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
            case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT:
                getBusinessItemLibraryElement().clear();
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
            case VdmlPackage.BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT:
                return businessItemLibraryElement != null && !businessItemLibraryElement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BusinessItemLibraryImpl
