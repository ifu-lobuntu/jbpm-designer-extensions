/**
 */
package org.jbpm.smm.dd.smmdi;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.smm.dd.smmdi.SMMShape#getOwnedShape <em>Owned Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMShape()
 * @model
 * @generated
 */
public interface SMMShape extends BoundariedShape, SMMDiagramElement, CollapsibleShape {
    /**
     * Returns the value of the '<em><b>Owned Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.smm.dd.smmdi.SMMShape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Shape</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Shape</em>' containment reference list.
     * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMShape_OwnedShape()
     * @model containment="true"
     * @generated
     */
    EList<SMMShape> getOwnedShape();

} // SMMShape
