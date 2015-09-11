/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.Annotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends SmmElement {
    /**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.omg.smm.SMMPackage#getAnnotation_Text()
	 * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
	 * @generated
	 */
    String getText();

    /**
	 * Sets the value of the '{@link org.omg.smm.Annotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
    void setText(String value);

} // Annotation
