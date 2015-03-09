/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.OCLOperation#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.smm.OCLOperation#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getOCLOperation()
 * @model
 * @generated
 */
public interface OCLOperation extends AbstractMeasureElement {
    /**
     * Returns the value of the '<em><b>Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' reference.
     * @see #setBody(string)
     * @see org.omg.smm.SMMPackage#getOCLOperation_Body()
     * @model required="true" ordered="false"
     * @generated
     */
    string getBody();

    /**
     * Sets the value of the '{@link org.omg.smm.OCLOperation#getBody <em>Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' reference.
     * @see #getBody()
     * @generated
     */
    void setBody(string value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' reference.
     * @see #setContext(string)
     * @see org.omg.smm.SMMPackage#getOCLOperation_Context()
     * @model required="true" ordered="false"
     * @generated
     */
    string getContext();

    /**
     * Sets the value of the '{@link org.omg.smm.OCLOperation#getContext <em>Context</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' reference.
     * @see #getContext()
     * @generated
     */
    void setContext(string value);

} // OCLOperation
