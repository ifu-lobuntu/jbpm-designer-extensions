/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Path#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends MarkedElement {
    /**
     * Returns the value of the '<em><b>Command</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.PathCommand}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Command</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getPath_Command()
     * @model containment="true"
     * @generated
     */
    EList<PathCommand> getCommand();

} // Path
