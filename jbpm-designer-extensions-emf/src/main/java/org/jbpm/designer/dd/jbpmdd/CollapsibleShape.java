/**
 */
package org.jbpm.designer.dd.jbpmdd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collapsible Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousWidth <em>Previous Width</em>}</li>
 *   <li>{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousHeight <em>Previous Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#getCollapsibleShape()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CollapsibleShape extends EObject {
    /**
     * Returns the value of the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Expanded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Expanded</em>' attribute.
     * @see #setIsExpanded(boolean)
     * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#getCollapsibleShape_IsExpanded()
     * @model
     * @generated
     */
    boolean isIsExpanded();

    /**
     * Sets the value of the '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#isIsExpanded <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Expanded</em>' attribute.
     * @see #isIsExpanded()
     * @generated
     */
    void setIsExpanded(boolean value);

    /**
     * Returns the value of the '<em><b>Previous Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previous Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previous Width</em>' attribute.
     * @see #setPreviousWidth(double)
     * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#getCollapsibleShape_PreviousWidth()
     * @model
     * @generated
     */
    double getPreviousWidth();

    /**
     * Sets the value of the '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousWidth <em>Previous Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Previous Width</em>' attribute.
     * @see #getPreviousWidth()
     * @generated
     */
    void setPreviousWidth(double value);

    /**
     * Returns the value of the '<em><b>Previous Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previous Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previous Height</em>' attribute.
     * @see #setPreviousHeight(double)
     * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#getCollapsibleShape_PreviousHeight()
     * @model
     * @generated
     */
    double getPreviousHeight();

    /**
     * Sets the value of the '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousHeight <em>Previous Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Previous Height</em>' attribute.
     * @see #getPreviousHeight()
     * @generated
     */
    void setPreviousHeight(double value);

} // CollapsibleShape
