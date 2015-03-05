/**
 */
package org.pavanecce.vdml.metamodel.cmof;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.pavanecce.vdml.metamodel.smm.Measurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.cmof.Element#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.cmof.CmofPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Measurement</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Measurement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.cmof.CmofPackage#getElement_Measurement()
     * @model ordered="false"
     * @generated
     */
    EList<Measurement> getMeasurement();

} // Element
