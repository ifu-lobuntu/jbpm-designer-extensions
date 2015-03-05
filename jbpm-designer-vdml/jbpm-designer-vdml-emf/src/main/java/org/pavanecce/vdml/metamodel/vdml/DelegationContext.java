/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextBasedPortDelegation <em>Context Based Port Delegation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDelegationContext()
 * @model
 * @generated
 */
public interface DelegationContext extends AnalysisContext {
    /**
     * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getDelegationtContext <em>Delegationt Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Context</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Context</em>' container reference.
     * @see #setParentContext(AnalysisContext)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDelegationContext_ParentContext()
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getDelegationtContext
     * @model opposite="delegationtContext" required="true" transient="false" ordered="false"
     * @generated
     */
    AnalysisContext getParentContext();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getParentContext <em>Parent Context</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Context</em>' container reference.
     * @see #getParentContext()
     * @generated
     */
    void setParentContext(AnalysisContext value);

    /**
     * Returns the value of the '<em><b>Context Based Port Delegation</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PortDelegation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Based Port Delegation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Based Port Delegation</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDelegationContext_ContextBasedPortDelegation()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<PortDelegation> getContextBasedPortDelegation();

    /**
     * Returns the value of the '<em><b>Delegated Activity</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getDelegationContext <em>Delegation Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated Activity</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated Activity</em>' reference.
     * @see #setDelegatedActivity(Activity)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDelegationContext_DelegatedActivity()
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getDelegationContext
     * @model opposite="delegationContext" required="true" ordered="false"
     * @generated
     */
    Activity getDelegatedActivity();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delegated Activity</em>' reference.
     * @see #getDelegatedActivity()
     * @generated
     */
    void setDelegatedActivity(Activity value);

    /**
     * Returns the value of the '<em><b>Context Collaboration</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getDelegationContext <em>Delegation Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Collaboration</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Collaboration</em>' reference.
     * @see #setContextCollaboration(Collaboration)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDelegationContext_ContextCollaboration()
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getDelegationContext
     * @model opposite="delegationContext" required="true" ordered="false"
     * @generated
     */
    Collaboration getContextCollaboration();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Collaboration</em>' reference.
     * @see #getContextCollaboration()
     * @generated
     */
    void setContextCollaboration(Collaboration value);

} // DelegationContext
