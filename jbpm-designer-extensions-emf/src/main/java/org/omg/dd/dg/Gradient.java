/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Gradient#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getGradient()
 * @model abstract="true"
 * @generated
 */
public interface Gradient extends Fill {
    /**
     * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.GradientStop}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stop</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getGradient_Stop()
     * @model containment="true" lower="2" ordered="false"
     * @generated
     */
    EList<GradientStop> getStop();

} // Gradient
