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
import org.omg.vdml.PracticeCategory;
import org.omg.vdml.PracticeDefinition;
import org.omg.vdml.PracticeLibrary;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practice Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.PracticeLibraryImpl#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.PracticeLibraryImpl#getPracticeCategory <em>Practice Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PracticeLibraryImpl extends VdmlElementImpl implements PracticeLibrary {
    /**
     * The cached value of the '{@link #getPracticeDefinition() <em>Practice Definition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPracticeDefinition()
     * @generated
     * @ordered
     */
    protected EList<PracticeDefinition> practiceDefinition;

    /**
     * The cached value of the '{@link #getPracticeCategory() <em>Practice Category</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPracticeCategory()
     * @generated
     * @ordered
     */
    protected EList<PracticeCategory> practiceCategory;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PracticeLibraryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.PRACTICE_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeDefinition> getPracticeDefinition() {
        if (practiceDefinition == null) {
            practiceDefinition = new EObjectContainmentEList<PracticeDefinition>(PracticeDefinition.class, this, VDMLPackage.PRACTICE_LIBRARY__PRACTICE_DEFINITION);
        }
        return practiceDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeCategory> getPracticeCategory() {
        if (practiceCategory == null) {
            practiceCategory = new EObjectContainmentEList<PracticeCategory>(PracticeCategory.class, this, VDMLPackage.PRACTICE_LIBRARY__PRACTICE_CATEGORY);
        }
        return practiceCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_DEFINITION:
                return ((InternalEList<?>)getPracticeDefinition()).basicRemove(otherEnd, msgs);
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_CATEGORY:
                return ((InternalEList<?>)getPracticeCategory()).basicRemove(otherEnd, msgs);
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
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_DEFINITION:
                return getPracticeDefinition();
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_CATEGORY:
                return getPracticeCategory();
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
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                getPracticeDefinition().addAll((Collection<? extends PracticeDefinition>)newValue);
                return;
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_CATEGORY:
                getPracticeCategory().clear();
                getPracticeCategory().addAll((Collection<? extends PracticeCategory>)newValue);
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
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                return;
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_CATEGORY:
                getPracticeCategory().clear();
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
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_DEFINITION:
                return practiceDefinition != null && !practiceDefinition.isEmpty();
            case VDMLPackage.PRACTICE_LIBRARY__PRACTICE_CATEGORY:
                return practiceCategory != null && !practiceCategory.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PracticeLibraryImpl
