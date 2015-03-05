/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCapabilityLibrary()
 * @model
 * @generated
 */
public interface CapabilityLibrary extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Capability}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCapabilityLibrary_Capability()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Capability> getCapability();

    /**
     * Returns the value of the '<em><b>Capability Dependency</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Dependency</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Dependency</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCapabilityLibrary_CapabilityDependency()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<CapabilityDependency> getCapabilityDependency();

} // CapabilityLibrary
