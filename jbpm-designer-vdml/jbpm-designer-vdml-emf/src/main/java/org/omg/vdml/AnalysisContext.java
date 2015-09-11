/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.omg.smm.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.AnalysisContext#getDelegationtContext <em>Delegationt Context</em>}</li>
 *   <li>{@link org.omg.vdml.AnalysisContext#getContextObservation <em>Context Observation</em>}</li>
 *   <li>{@link org.omg.vdml.AnalysisContext#getContextStore <em>Context Store</em>}</li>
 *   <li>{@link org.omg.vdml.AnalysisContext#getContextBasedAssignment <em>Context Based Assignment</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getAnalysisContext()
 * @model abstract="true"
 * @generated
 */
public interface AnalysisContext extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Delegationt Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.DelegationContext}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.DelegationContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegationt Context</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegationt Context</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getAnalysisContext_DelegationtContext()
	 * @see org.omg.vdml.DelegationContext#getParentContext
	 * @model opposite="parentContext" containment="true" ordered="false"
	 * @generated
	 */
    EList<DelegationContext> getDelegationtContext();

    /**
	 * Returns the value of the '<em><b>Context Observation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.smm.Observation}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Observation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Observation</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getAnalysisContext_ContextObservation()
	 * @model ordered="false"
	 * @generated
	 */
    EList<Observation> getContextObservation();

    /**
	 * Returns the value of the '<em><b>Context Store</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Store}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Store#getStoreContext <em>Store Context</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Store</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Store</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getAnalysisContext_ContextStore()
	 * @see org.omg.vdml.Store#getStoreContext
	 * @model opposite="storeContext" ordered="false"
	 * @generated
	 */
    EList<Store> getContextStore();

    /**
	 * Returns the value of the '<em><b>Context Based Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Assignment}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Based Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Based Assignment</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getAnalysisContext_ContextBasedAssignment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Assignment> getContextBasedAssignment();

} // AnalysisContext
