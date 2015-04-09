/**
 */
package org.jbpm.vdml.dd.vdmldi;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#getOwnedShape <em>Owned Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLShape()
 * @model
 * @generated
 */
public interface VDMLShape extends BoundariedShape, VDMLDiagramElement, CollapsibleShape {
    /**
     * Returns the value of the '<em><b>Owned Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.vdml.dd.vdmldi.VDMLShape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Shape</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Shape</em>' containment reference list.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLShape_OwnedShape()
     * @model containment="true"
     * @generated
     */
    EList<VDMLShape> getOwnedShape();

} // VDMLShape
