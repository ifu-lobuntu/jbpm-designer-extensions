/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.DiagnosticChain;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.Scope#getBreakCondition <em>Break Condition</em>}</li>
 *   <li>{@link org.omg.smm.Scope#getRecognizer <em>Recognizer</em>}</li>
 *   <li>{@link org.omg.smm.Scope#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.smm.Scope#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends AbstractMeasureElement {
    /**
	 * Returns the value of the '<em><b>Break Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Break Condition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Condition</em>' reference.
	 * @see #setBreakCondition(Operation)
	 * @see org.omg.smm.SMMPackage#getScope_BreakCondition()
	 * @model ordered="false"
	 * @generated
	 */
    Operation getBreakCondition();

    /**
	 * Sets the value of the '{@link org.omg.smm.Scope#getBreakCondition <em>Break Condition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Condition</em>' reference.
	 * @see #getBreakCondition()
	 * @generated
	 */
    void setBreakCondition(Operation value);

    /**
	 * Returns the value of the '<em><b>Recognizer</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recognizer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognizer</em>' reference.
	 * @see #setRecognizer(Operation)
	 * @see org.omg.smm.SMMPackage#getScope_Recognizer()
	 * @model ordered="false"
	 * @generated
	 */
    Operation getRecognizer();

    /**
	 * Sets the value of the '{@link org.omg.smm.Scope#getRecognizer <em>Recognizer</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognizer</em>' reference.
	 * @see #getRecognizer()
	 * @generated
	 */
    void setRecognizer(Operation value);

    /**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.omg.smm.SMMPackage#getScope_Class()
	 * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
	 * @generated
	 */
    String getClass_();

    /**
	 * Sets the value of the '{@link org.omg.smm.Scope#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
    void setClass(String value);

    /**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see org.omg.smm.SMMPackage#getScope_Stereotype()
	 * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
	 * @generated
	 */
    String getStereotype();

    /**
	 * Sets the value of the '{@link org.omg.smm.Scope#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
    void setStereotype(String value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (class -> isEmpty implies (!name->isEmpty and !description->isEmpty)) and
	 *             ((name->isEmpty or description->isEmpty) implies !class->isEmpty)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
    boolean IsSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Scope
