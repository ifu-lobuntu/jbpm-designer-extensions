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
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.smm.Operation#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends AbstractMeasureElement {
    /**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.omg.smm.SMMPackage#getOperation_Body()
	 * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
	 * @generated
	 */
    String getBody();

    /**
	 * Sets the value of the '{@link org.omg.smm.Operation#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
    void setBody(String value);

    /**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.omg.smm.SMMPackage#getOperation_Language()
	 * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
	 * @generated
	 */
    String getLanguage();

    /**
	 * Sets the value of the '{@link org.omg.smm.Operation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
    void setLanguage(String value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
    void getParamStrings();

} // Operation
