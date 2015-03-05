/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Measure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getAbstractMeasureElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMeasureElement extends EObject {
    /**
     * Returns the value of the '<em><b>Library</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getMeasureElement <em>Measure Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Library</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Library</em>' container reference.
     * @see #setLibrary(MeasureLibrary)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getAbstractMeasureElement_Library()
     * @see org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getMeasureElement
     * @model opposite="measureElement" required="true" transient="false" ordered="false"
     * @generated
     */
    MeasureLibrary getLibrary();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement#getLibrary <em>Library</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Library</em>' container reference.
     * @see #getLibrary()
     * @generated
     */
    void setLibrary(MeasureLibrary value);

} // AbstractMeasureElement
