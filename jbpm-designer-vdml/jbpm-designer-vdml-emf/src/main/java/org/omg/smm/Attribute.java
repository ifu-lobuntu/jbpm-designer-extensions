/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Attribute#getTag <em>Tag</em>}</li>
 *   <li>{@link org.omg.smm.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends SmmElement {
    /**
     * Returns the value of the '<em><b>Tag</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag</em>' reference.
     * @see #setTag(string)
     * @see org.omg.smm.SMMPackage#getAttribute_Tag()
     * @model required="true" ordered="false"
     * @generated
     */
    string getTag();

    /**
     * Sets the value of the '{@link org.omg.smm.Attribute#getTag <em>Tag</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tag</em>' reference.
     * @see #getTag()
     * @generated
     */
    void setTag(string value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' reference.
     * @see #setValue(string)
     * @see org.omg.smm.SMMPackage#getAttribute_Value()
     * @model required="true" ordered="false"
     * @generated
     */
    string getValue();

    /**
     * Sets the value of the '{@link org.omg.smm.Attribute#getValue <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' reference.
     * @see #getValue()
     * @generated
     */
    void setValue(string value);

} // Attribute
