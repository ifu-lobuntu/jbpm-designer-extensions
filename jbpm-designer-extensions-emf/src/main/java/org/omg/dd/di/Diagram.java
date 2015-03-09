/**
 */
package org.omg.dd.di;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.di.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.dd.di.Diagram#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.dd.di.Diagram#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.di.DIPackage#getDiagram()
 * @model abstract="true"
 * @generated
 */
public interface Diagram extends Shape {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.omg.dd.di.DIPackage#getDiagram_Name()
     * @model default="" dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Diagram#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' attribute.
     * @see #setDocumentation(String)
     * @see org.omg.dd.di.DIPackage#getDiagram_Documentation()
     * @model default="" dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getDocumentation();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Diagram#getDocumentation <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' attribute.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(String value);

    /**
     * Returns the value of the '<em><b>Resolution</b></em>' attribute.
     * The default value is <code>"300.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolution</em>' attribute.
     * @see #setResolution(Double)
     * @see org.omg.dd.di.DIPackage#getDiagram_Resolution()
     * @model default="300.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getResolution();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Diagram#getResolution <em>Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolution</em>' attribute.
     * @see #getResolution()
     * @generated
     */
    void setResolution(Double value);

} // Diagram
