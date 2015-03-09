/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.VdmlElement#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.vdml.VdmlElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omg.vdml.VdmlElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.omg.vdml.VdmlElement#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.omg.vdml.VdmlElement#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.vdml.VdmlElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getVdmlElement()
 * @model abstract="true"
 * @generated
 */
public interface VdmlElement extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.omg.vdml.VDMLPackage#getVdmlElement_Name()
     * @model required="true" ordered="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.omg.vdml.VdmlElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.omg.vdml.VDMLPackage#getVdmlElement_Description()
     * @model required="true" ordered="false"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.omg.vdml.VdmlElement#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getVdmlElement_Attribute()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Attribute> getAttribute();

    /**
     * Returns the value of the '<em><b>Represents</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Represents</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Represents</em>' attribute.
     * @see #setRepresents(String)
     * @see org.omg.vdml.VDMLPackage#getVdmlElement_Represents()
     * @model ordered="false"
     * @generated
     */
    String getRepresents();

    /**
     * Sets the value of the '{@link org.omg.vdml.VdmlElement#getRepresents <em>Represents</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Represents</em>' attribute.
     * @see #getRepresents()
     * @generated
     */
    void setRepresents(String value);

    /**
     * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotation</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getVdmlElement_Annotation()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Annotation> getAnnotation();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.omg.vdml.VDMLPackage#getVdmlElement_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.omg.vdml.VdmlElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // VdmlElement
