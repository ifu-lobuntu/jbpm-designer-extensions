/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getId <em>Id</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getName <em>Name</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement()
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getName <em>Name</em>}' attribute.
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement_Description()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute</em>' attribute list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement_AnyAttribute()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     * @generated
     */
    FeatureMap getAnyAttribute();

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement_Attribute()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Attribute> getAttribute();

    /**
     * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotation</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement_Annotation()
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getVdmlElement_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // VdmlElement
