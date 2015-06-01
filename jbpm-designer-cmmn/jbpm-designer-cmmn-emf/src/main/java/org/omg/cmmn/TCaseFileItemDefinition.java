/**
 */
package org.omg.cmmn;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCase File Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tCaseFileItemDefinition defines the type of element "caseFileItemDefinition"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.TCaseFileItemDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.cmmn.TCaseFileItemDefinition#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link org.omg.cmmn.TCaseFileItemDefinition#getImportRef <em>Import Ref</em>}</li>
 *   <li>{@link org.omg.cmmn.TCaseFileItemDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.cmmn.TCaseFileItemDefinition#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemDefinition()
 * @model extendedMetaData="name='tCaseFileItemDefinition' kind='elementOnly'"
 * @generated
 */
public interface TCaseFileItemDefinition extends TCmmnElement {
    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.cmmn.TProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemDefinition_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<TProperty> getProperty();

    /**
     * Returns the value of the '<em><b>Definition Type</b></em>' attribute.
     * The default value is <code>"http://www.omg.org/spec/CMMN/DefinitionType/Unspecified"</code>.
     * The literals are from the enumeration {@link org.omg.cmmn.DefinitionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definition Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definition Type</em>' attribute.
     * @see org.omg.cmmn.DefinitionType
     * @see #isSetDefinitionType()
     * @see #unsetDefinitionType()
     * @see #setDefinitionType(DefinitionType)
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemDefinition_DefinitionType()
     * @model default="http://www.omg.org/spec/CMMN/DefinitionType/Unspecified" unsettable="true"
     *        extendedMetaData="kind='attribute' name='definitionType'"
     * @generated
     */
    DefinitionType getDefinitionType();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TCaseFileItemDefinition#getDefinitionType <em>Definition Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition Type</em>' attribute.
     * @see org.omg.cmmn.DefinitionType
     * @see #isSetDefinitionType()
     * @see #unsetDefinitionType()
     * @see #getDefinitionType()
     * @generated
     */
    void setDefinitionType(DefinitionType value);

    /**
     * Unsets the value of the '{@link org.omg.cmmn.TCaseFileItemDefinition#getDefinitionType <em>Definition Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDefinitionType()
     * @see #getDefinitionType()
     * @see #setDefinitionType(DefinitionType)
     * @generated
     */
    void unsetDefinitionType();

    /**
     * Returns whether the value of the '{@link org.omg.cmmn.TCaseFileItemDefinition#getDefinitionType <em>Definition Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Definition Type</em>' attribute is set.
     * @see #unsetDefinitionType()
     * @see #getDefinitionType()
     * @see #setDefinitionType(DefinitionType)
     * @generated
     */
    boolean isSetDefinitionType();

    /**
     * Returns the value of the '<em><b>Import Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               importRef refers an "import" element under "definitions"
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Import Ref</em>' reference.
     * @see #setImportRef(TImport)
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemDefinition_ImportRef()
     * @model resolveProxies="false"
     *        extendedMetaData="kind='attribute' name='importRef'"
     * @generated
     */
    TImport getImportRef();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TCaseFileItemDefinition#getImportRef <em>Import Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import Ref</em>' reference.
     * @see #getImportRef()
     * @generated
     */
    void setImportRef(TImport value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemDefinition_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TCaseFileItemDefinition#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               structureRef refers a structure, for example an XML-Schema element
     *               in a XSD referred by importRef
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Structure Ref</em>' attribute.
     * @see #setStructureRef(QName)
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemDefinition_StructureRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='structureRef'"
     * @generated
     */
    QName getStructureRef();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TCaseFileItemDefinition#getStructureRef <em>Structure Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Structure Ref</em>' attribute.
     * @see #getStructureRef()
     * @generated
     */
    void setStructureRef(QName value);

} // TCaseFileItemDefinition
