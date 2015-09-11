/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Actor#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Participant {
    /**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Scenario}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Scenario#getContextActor <em>Context Actor</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getActor_Scenario()
	 * @see org.omg.vdml.Scenario#getContextActor
	 * @model opposite="contextActor" ordered="false"
	 * @generated
	 */
    EList<Scenario> getScenario();

} // Actor
