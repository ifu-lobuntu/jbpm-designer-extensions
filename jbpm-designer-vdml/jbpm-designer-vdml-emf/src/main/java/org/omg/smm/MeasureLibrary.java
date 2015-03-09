/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.MeasureLibrary#getMeasureElements <em>Measure Elements</em>}</li>
 *   <li>{@link org.omg.smm.MeasureLibrary#getCategoryRelationships <em>Category Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getMeasureLibrary()
 * @model
 * @generated
 */
public interface MeasureLibrary extends SmmElement {
    /**
     * Returns the value of the '<em><b>Measure Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.AbstractMeasureElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure Elements</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getMeasureLibrary_MeasureElements()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<AbstractMeasureElement> getMeasureElements();

    /**
     * Returns the value of the '<em><b>Category Relationships</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.CategoryRelationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Relationships</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Relationships</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getMeasureLibrary_CategoryRelationships()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<CategoryRelationship> getCategoryRelationships();

} // MeasureLibrary
