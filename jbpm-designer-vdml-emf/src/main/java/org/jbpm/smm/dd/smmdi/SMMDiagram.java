/**
 */
package org.jbpm.smm.dd.smmdi;

import org.eclipse.emf.common.util.EList;

import org.omg.dd.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.smm.dd.smmdi.SMMDiagram#getOwnedSmmDiagramElement <em>Owned Smm Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMDiagram()
 * @model
 * @generated
 */
public interface SMMDiagram extends Diagram, SMMDiagramElement {
    /**
     * Returns the value of the '<em><b>Owned Smm Diagram Element</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.smm.dd.smmdi.SMMDiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Smm Diagram Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Smm Diagram Element</em>' containment reference list.
     * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMDiagram_OwnedSmmDiagramElement()
     * @model containment="true"
     * @generated
     */
    EList<SMMDiagramElement> getOwnedSmmDiagramElement();

} // SMMDiagram
