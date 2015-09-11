/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Community</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Community#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getCommunity()
 * @model
 * @generated
 */
public interface Community extends Collaboration {
    /**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Member}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCommunity_Member()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Member> getMember();

} // Community
