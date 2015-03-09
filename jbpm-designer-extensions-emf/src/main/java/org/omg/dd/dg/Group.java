/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Group#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends GraphicalElement {
    /**
     * Returns the value of the '<em><b>Member</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.GraphicalElement}.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.GraphicalElement#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getGroup_Member()
     * @see org.omg.dd.dg.GraphicalElement#getGroup
     * @model opposite="group" containment="true"
     * @generated
     */
    EList<GraphicalElement> getMember();

} // Group
