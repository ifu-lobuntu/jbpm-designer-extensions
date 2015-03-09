/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.smm.Operation#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends AbstractMeasureElement {
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
     * @see org.omg.smm.SMMPackage#getOperation_Body()
     * @model required="true" ordered="false"
     * @generated
     */
    string getBody();

    /**
     * Sets the value of the '{@link org.omg.smm.Operation#getBody <em>Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' reference.
     * @see #getBody()
     * @generated
     */
    void setBody(string value);

    /**
     * Returns the value of the '<em><b>Language</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' reference.
     * @see #setLanguage(string)
     * @see org.omg.smm.SMMPackage#getOperation_Language()
     * @model required="true" ordered="false"
     * @generated
     */
    string getLanguage();

    /**
     * Sets the value of the '{@link org.omg.smm.Operation#getLanguage <em>Language</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' reference.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(string value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    void getParamStrings();

} // Operation
