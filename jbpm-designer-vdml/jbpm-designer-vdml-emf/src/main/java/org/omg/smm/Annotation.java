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
 * <ul>
 *   <li>{@link org.omg.smm.Annotation#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends SmmElement {
    /**
     * Returns the value of the '<em><b>Text</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' reference.
     * @see #setText(string)
     * @see org.omg.smm.SMMPackage#getAnnotation_Text()
     * @model required="true" ordered="false"
     * @generated
     */
    string getText();

    /**
     * Sets the value of the '{@link org.omg.smm.Annotation#getText <em>Text</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' reference.
     * @see #getText()
     * @generated
     */
    void setText(string value);

} // Annotation
