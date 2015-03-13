/**
 */
package org.jbpm.cmmn.dd.cmmndi;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.omg.cmmn.TCmmnElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#getOwnedShape <em>Owned Shape</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNShape()
 * @model
 * @generated
 */
public interface CMMNShape extends BoundariedShape, CMMNDiagramElement, CollapsibleShape {
    /**
     * Returns the value of the '<em><b>Owned Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.cmmn.dd.cmmndi.CMMNShape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Shape</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Shape</em>' containment reference list.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNShape_OwnedShape()
     * @model containment="true"
     * @generated
     */
    EList<CMMNShape> getOwnedShape();

    /**
     * Returns the value of the '<em><b>Is Planning Table Expanded</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Planning Table Expanded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Planning Table Expanded</em>' attribute.
     * @see #isSetIsPlanningTableExpanded()
     * @see #unsetIsPlanningTableExpanded()
     * @see #setIsPlanningTableExpanded(boolean)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNShape_IsPlanningTableExpanded()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     * @generated
     */
    boolean isIsPlanningTableExpanded();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Planning Table Expanded</em>' attribute.
     * @see #isSetIsPlanningTableExpanded()
     * @see #unsetIsPlanningTableExpanded()
     * @see #isIsPlanningTableExpanded()
     * @generated
     */
    void setIsPlanningTableExpanded(boolean value);

    /**
     * Unsets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPlanningTableExpanded()
     * @see #isIsPlanningTableExpanded()
     * @see #setIsPlanningTableExpanded(boolean)
     * @generated
     */
    void unsetIsPlanningTableExpanded();

    /**
     * Returns whether the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Planning Table Expanded</em>' attribute is set.
     * @see #unsetIsPlanningTableExpanded()
     * @see #isIsPlanningTableExpanded()
     * @see #setIsPlanningTableExpanded(boolean)
     * @generated
     */
    boolean isSetIsPlanningTableExpanded();

    /**
     * Returns the value of the '<em><b>Cmmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cmmn Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cmmn Element</em>' reference.
     * @see #setCmmnElement(TCmmnElement)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNShape_CmmnElement()
     * @model
     * @generated
     */
    TCmmnElement getCmmnElement();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#getCmmnElement <em>Cmmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cmmn Element</em>' reference.
     * @see #getCmmnElement()
     * @generated
     */
    void setCmmnElement(TCmmnElement value);

} // CMMNShape
