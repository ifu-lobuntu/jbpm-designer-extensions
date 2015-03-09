/**
 */
package org.jbpm.vdml.dd.vdmldi;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagram#getOwnedVdmlDiagramElement <em>Owned Vdml Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLDiagram()
 * @model
 * @generated
 */
public interface VDMLDiagram extends Diagram, VDMLDiagramElement {
    /**
     * Returns the value of the '<em><b>Owned Vdml Diagram Element</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Vdml Diagram Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Vdml Diagram Element</em>' containment reference list.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLDiagram_OwnedVdmlDiagramElement()
     * @model containment="true"
     * @generated
     */
    EList<VDMLDiagramElement> getOwnedVdmlDiagramElement();

} // VDMLDiagram
