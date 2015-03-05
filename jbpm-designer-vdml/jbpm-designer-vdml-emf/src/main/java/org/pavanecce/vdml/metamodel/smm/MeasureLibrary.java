/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getModel <em>Model</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getMeasureElement <em>Measure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasureLibrary()
 * @model
 * @generated
 */
public interface MeasureLibrary extends EObject {
    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.SmmModel#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(SmmModel)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasureLibrary_Model()
     * @see org.pavanecce.vdml.metamodel.smm.SmmModel#getLibrary
     * @model opposite="library" required="true" transient="false" ordered="false"
     * @generated
     */
    SmmModel getModel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(SmmModel value);

    /**
     * Returns the value of the '<em><b>Measure Element</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure Element</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasureLibrary_MeasureElement()
     * @see org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement#getLibrary
     * @model opposite="library" containment="true" ordered="false"
     * @generated
     */
    EList<AbstractMeasureElement> getMeasureElement();

} // MeasureLibrary
