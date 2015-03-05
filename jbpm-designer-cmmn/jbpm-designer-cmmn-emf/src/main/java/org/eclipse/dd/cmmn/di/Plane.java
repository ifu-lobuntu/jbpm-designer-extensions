/**
 */
package org.eclipse.dd.cmmn.di;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dd.cmmn.di.Plane#getPlaneElement <em>Plane Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dd.cmmn.di.DiPackage#getPlane()
 * @model abstract="true"
 *        extendedMetaData="name='Plane' kind='elementOnly'"
 * @generated
 */
public interface Plane extends Node {
    /**
     * Returns the value of the '<em><b>Plane Element</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.dd.cmmn.di.DiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plane Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plane Element</em>' containment reference list.
     * @see org.eclipse.dd.cmmn.di.DiPackage#getPlane_PlaneElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='DiagramElement' namespace='http://www.omg.org/spec/DD/20150101/DI' group='http://www.omg.org/spec/DD/20150101/DI#DiagramElement'"
     * @generated
     */
    EList<DiagramElement> getPlaneElement();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * planeElement->forAll(oclIsKindOf(Shape) or oclIsKindOf(Edge))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean plane_element_type(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Plane
