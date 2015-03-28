/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.SmmModel#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.omg.smm.SmmModel#getObservations <em>Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getSmmModel()
 * @model
 * @generated
 */
public interface SmmModel extends SmmElement {
    /**
     * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.MeasureLibrary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Libraries</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getSmmModel_Libraries()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<MeasureLibrary> getLibraries();

    /**
     * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.Observation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observations</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getSmmModel_Observations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Observation> getObservations();

} // SmmModel
