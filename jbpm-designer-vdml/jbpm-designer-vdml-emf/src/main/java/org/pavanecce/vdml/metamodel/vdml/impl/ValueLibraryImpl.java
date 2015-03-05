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
import org.pavanecce.vdml.metamodel.vdml.ValueCategory;
import org.pavanecce.vdml.metamodel.vdml.ValueDefinition;
import org.pavanecce.vdml.metamodel.vdml.ValueLibrary;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueLibraryImpl#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueLibraryImpl#getValueCategory <em>Value Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueLibraryImpl extends VdmlElementImpl implements ValueLibrary {
    /**
     * The cached value of the '{@link #getValueDefinition() <em>Value Definition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueDefinition()
     * @generated
     * @ordered
     */
    protected EList<ValueDefinition> valueDefinition;

    /**
     * The cached value of the '{@link #getValueCategory() <em>Value Category</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueCategory()
     * @generated
     * @ordered
     */
    protected EList<ValueCategory> valueCategory;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueLibraryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.VALUE_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueDefinition> getValueDefinition() {
        if (valueDefinition == null) {
            valueDefinition = new EObjectContainmentEList<ValueDefinition>(ValueDefinition.class, this, VdmlPackage.VALUE_LIBRARY__VALUE_DEFINITION);
        }
        return valueDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueCategory> getValueCategory() {
        if (valueCategory == null) {
            valueCategory = new EObjectContainmentEList<ValueCategory>(ValueCategory.class, this, VdmlPackage.VALUE_LIBRARY__VALUE_CATEGORY);
        }
        return valueCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_LIBRARY__VALUE_DEFINITION:
                return ((InternalEList<?>)getValueDefinition()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_LIBRARY__VALUE_CATEGORY:
                return ((InternalEList<?>)getValueCategory()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.VALUE_LIBRARY__VALUE_DEFINITION:
                return getValueDefinition();
            case VdmlPackage.VALUE_LIBRARY__VALUE_CATEGORY:
                return getValueCategory();
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
            case VdmlPackage.VALUE_LIBRARY__VALUE_DEFINITION:
                getValueDefinition().clear();
                getValueDefinition().addAll((Collection<? extends ValueDefinition>)newValue);
                return;
            case VdmlPackage.VALUE_LIBRARY__VALUE_CATEGORY:
                getValueCategory().clear();
                getValueCategory().addAll((Collection<? extends ValueCategory>)newValue);
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
            case VdmlPackage.VALUE_LIBRARY__VALUE_DEFINITION:
                getValueDefinition().clear();
                return;
            case VdmlPackage.VALUE_LIBRARY__VALUE_CATEGORY:
                getValueCategory().clear();
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
            case VdmlPackage.VALUE_LIBRARY__VALUE_DEFINITION:
                return valueDefinition != null && !valueDefinition.isEmpty();
            case VdmlPackage.VALUE_LIBRARY__VALUE_CATEGORY:
                return valueCategory != null && !valueCategory.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ValueLibraryImpl
