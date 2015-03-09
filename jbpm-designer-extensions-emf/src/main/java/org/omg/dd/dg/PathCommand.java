/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.PathCommand#getIsRelative <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getPathCommand()
 * @model
 * @generated
 */
public interface PathCommand extends EObject {
    /**
     * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Relative</em>' attribute.
     * @see #setIsRelative(Boolean)
     * @see org.omg.dd.dg.DGPackage#getPathCommand_IsRelative()
     * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsRelative();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.PathCommand#getIsRelative <em>Is Relative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Relative</em>' attribute.
     * @see #getIsRelative()
     * @generated
     */
    void setIsRelative(Boolean value);

} // PathCommand
