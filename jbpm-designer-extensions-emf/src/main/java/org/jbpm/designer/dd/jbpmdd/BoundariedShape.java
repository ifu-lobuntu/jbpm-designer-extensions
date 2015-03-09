/**
 */
package org.jbpm.designer.dd.jbpmdd;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.di.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundaried Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.designer.dd.jbpmdd.BoundariedShape#getBoundaryShapes <em>Boundary Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#getBoundariedShape()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BoundariedShape extends Shape {
    /**
     * Returns the value of the '<em><b>Boundary Shapes</b></em>' reference list.
     * The list contents are of type {@link org.omg.dd.di.Shape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boundary Shapes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boundary Shapes</em>' reference list.
     * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#getBoundariedShape_BoundaryShapes()
     * @model
     * @generated
     */
    EList<Shape> getBoundaryShapes();

} // BoundariedShape
