/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.BusinessNetwork#getParty <em>Party</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getBusinessNetwork()
 * @model
 * @generated
 */
public interface BusinessNetwork extends Collaboration {
    /**
     * Returns the value of the '<em><b>Party</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.Party}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Party</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Party</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getBusinessNetwork_Party()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Party> getParty();

} // BusinessNetwork
