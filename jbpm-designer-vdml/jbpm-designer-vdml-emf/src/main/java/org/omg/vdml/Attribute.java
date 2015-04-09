/**
 */
package org.omg.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.Attribute#getTag <em>Tag</em>}</li>
 *   <li>{@link org.omg.vdml.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag</em>' attribute.
     * @see #setTag(String)
     * @see org.omg.vdml.VDMLPackage#getAttribute_Tag()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getTag();

    /**
     * Sets the value of the '{@link org.omg.vdml.Attribute#getTag <em>Tag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tag</em>' attribute.
     * @see #getTag()
     * @generated
     */
    void setTag(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.omg.vdml.VDMLPackage#getAttribute_Value()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.omg.vdml.Attribute#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // Attribute
