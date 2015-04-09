/**
 */
package org.omg.smm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.omg.smm.AbstractMeasureElement;
import org.omg.smm.CategoryRelationship;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.MeasureLibraryImpl#getMeasureElements <em>Measure Elements</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureLibraryImpl#getCategoryRelationships <em>Category Relationships</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureLibraryImpl#getOwnedDiagram <em>Owned Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureLibraryImpl extends SmmElementImpl implements MeasureLibrary {
    /**
     * The cached value of the '{@link #getMeasureElements() <em>Measure Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasureElements()
     * @generated
     * @ordered
     */
    protected EList<AbstractMeasureElement> measureElements;
    /**
     * The cached value of the '{@link #getCategoryRelationships() <em>Category Relationships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategoryRelationships()
     * @generated
     * @ordered
     */
    protected EList<CategoryRelationship> categoryRelationships;
    /**
     * The cached value of the '{@link #getOwnedDiagram() <em>Owned Diagram</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedDiagram()
     * @generated
     * @ordered
     */
    protected EList<SMMDiagram> ownedDiagram;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasureLibraryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.MEASURE_LIBRARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractMeasureElement> getMeasureElements() {
        if (measureElements == null) {
            measureElements = new EObjectContainmentEList<AbstractMeasureElement>(AbstractMeasureElement.class, this, SMMPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS);
        }
        return measureElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CategoryRelationship> getCategoryRelationships() {
        if (categoryRelationships == null) {
            categoryRelationships = new EObjectContainmentEList<CategoryRelationship>(CategoryRelationship.class, this, SMMPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS);
        }
        return categoryRelationships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SMMDiagram> getOwnedDiagram() {
        if (ownedDiagram == null) {
            ownedDiagram = new EObjectContainmentEList<SMMDiagram>(SMMDiagram.class, this, SMMPackage.MEASURE_LIBRARY__OWNED_DIAGRAM);
        }
        return ownedDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
                return ((InternalEList<?>)getMeasureElements()).basicRemove(otherEnd, msgs);
            case SMMPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
                return ((InternalEList<?>)getCategoryRelationships()).basicRemove(otherEnd, msgs);
            case SMMPackage.MEASURE_LIBRARY__OWNED_DIAGRAM:
                return ((InternalEList<?>)getOwnedDiagram()).basicRemove(otherEnd, msgs);
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
            case SMMPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
                return getMeasureElements();
            case SMMPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
                return getCategoryRelationships();
            case SMMPackage.MEASURE_LIBRARY__OWNED_DIAGRAM:
                return getOwnedDiagram();
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
            case SMMPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
                getMeasureElements().clear();
                getMeasureElements().addAll((Collection<? extends AbstractMeasureElement>)newValue);
                return;
            case SMMPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
                getCategoryRelationships().clear();
                getCategoryRelationships().addAll((Collection<? extends CategoryRelationship>)newValue);
                return;
            case SMMPackage.MEASURE_LIBRARY__OWNED_DIAGRAM:
                getOwnedDiagram().clear();
                getOwnedDiagram().addAll((Collection<? extends SMMDiagram>)newValue);
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
            case SMMPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
                getMeasureElements().clear();
                return;
            case SMMPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
                getCategoryRelationships().clear();
                return;
            case SMMPackage.MEASURE_LIBRARY__OWNED_DIAGRAM:
                getOwnedDiagram().clear();
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
            case SMMPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
                return measureElements != null && !measureElements.isEmpty();
            case SMMPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
                return categoryRelationships != null && !categoryRelationships.isEmpty();
            case SMMPackage.MEASURE_LIBRARY__OWNED_DIAGRAM:
                return ownedDiagram != null && !ownedDiagram.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MeasureLibraryImpl
