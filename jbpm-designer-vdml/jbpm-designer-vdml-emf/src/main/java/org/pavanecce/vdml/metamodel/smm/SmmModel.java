/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.SmmModel#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.SmmModel#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getSmmModel()
 * @model
 * @generated
 */
public interface SmmModel extends EObject {
    /**
     * Returns the value of the '<em><b>Library</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Library</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getSmmModel_Library()
     * @see org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getModel
     * @model opposite="model" containment="true" ordered="false"
     * @generated
     */
    EList<MeasureLibrary> getLibrary();

    /**
     * Returns the value of the '<em><b>Observation</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Observation}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.Observation#getSmmModel <em>Smm Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observation</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getSmmModel_Observation()
     * @see org.pavanecce.vdml.metamodel.smm.Observation#getSmmModel
     * @model opposite="smmModel" containment="true" ordered="false"
     * @generated
     */
    EList<Observation> getObservation();

} // SmmModel
