/**
 */
package org.omg.cmmn;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Definition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.cmmn.CMMNPackage#getDefinitionType()
 * @model extendedMetaData="name='DefinitionType'"
 * @generated
 */
public enum DefinitionType implements Enumerator {
    /**
     * The '<em><b>CMIS Folder</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CMIS_FOLDER_VALUE
     * @generated
     * @ordered
     */
    CMIS_FOLDER(0, "CMISFolder", "http://www.omg.org/spec/CMMN/DefinitionType/CMISFolder"), /**
     * The '<em><b>CMIS Document</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CMIS_DOCUMENT_VALUE
     * @generated
     * @ordered
     */
    CMIS_DOCUMENT(1, "CMISDocument", "http://www.omg.org/spec/CMMN/DefinitionType/CMISDocument"), /**
     * The '<em><b>CMIS Relationship</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CMIS_RELATIONSHIP_VALUE
     * @generated
     * @ordered
     */
    CMIS_RELATIONSHIP(2, "CMISRelationship", "http://www.omg.org/spec/CMMN/DefinitionType/CMISRelationship"), /**
     * The '<em><b>XSD Element</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XSD_ELEMENT_VALUE
     * @generated
     * @ordered
     */
    XSD_ELEMENT(3, "XSDElement", "http://www.omg.org/spec/CMMN/DefinitionType/XSDElement"), /**
     * The '<em><b>XSD Complex Type</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XSD_COMPLEX_TYPE_VALUE
     * @generated
     * @ordered
     */
    XSD_COMPLEX_TYPE(4, "XSDComplexType", "http://www.omg.org/spec/CMMN/DefinitionType/XSDComplexType"), /**
     * The '<em><b>XSD Simple Type</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XSD_SIMPLE_TYPE_VALUE
     * @generated
     * @ordered
     */
    XSD_SIMPLE_TYPE(5, "XSDSimpleType", "http://www.omg.org/spec/CMMN/DefinitionType/XSDSimpleType"), /**
     * The '<em><b>WSDL Message</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WSDL_MESSAGE_VALUE
     * @generated
     * @ordered
     */
    WSDL_MESSAGE(6, "WSDLMessage", "http://www.omg.org/spec/CMMN/DefinitionType/WSDLMessage"), /**
     * The '<em><b>UML Class</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_CLASS_VALUE
     * @generated
     * @ordered
     */
    UML_CLASS(7, "UMLClass", "http://www.omg.org/spec/CMMN/DefinitionType/UMLClass"), /**
     * The '<em><b>Unknown</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNKNOWN_VALUE
     * @generated
     * @ordered
     */
    UNKNOWN(8, "Unknown", "http://www.omg.org/spec/CMMN/DefinitionType/Unknown"), /**
     * The '<em><b>Unspecified</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    UNSPECIFIED(9, "Unspecified", "http://www.omg.org/spec/CMMN/DefinitionType/Unspecified");

    /**
     * The '<em><b>CMIS Folder</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CMIS Folder</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CMIS_FOLDER
     * @model name="CMISFolder" literal="http://www.omg.org/spec/CMMN/DefinitionType/CMISFolder"
     * @generated
     * @ordered
     */
    public static final int CMIS_FOLDER_VALUE = 0;

    /**
     * The '<em><b>CMIS Document</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CMIS Document</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CMIS_DOCUMENT
     * @model name="CMISDocument" literal="http://www.omg.org/spec/CMMN/DefinitionType/CMISDocument"
     * @generated
     * @ordered
     */
    public static final int CMIS_DOCUMENT_VALUE = 1;

    /**
     * The '<em><b>CMIS Relationship</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CMIS Relationship</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CMIS_RELATIONSHIP
     * @model name="CMISRelationship" literal="http://www.omg.org/spec/CMMN/DefinitionType/CMISRelationship"
     * @generated
     * @ordered
     */
    public static final int CMIS_RELATIONSHIP_VALUE = 2;

    /**
     * The '<em><b>XSD Element</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>XSD Element</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #XSD_ELEMENT
     * @model name="XSDElement" literal="http://www.omg.org/spec/CMMN/DefinitionType/XSDElement"
     * @generated
     * @ordered
     */
    public static final int XSD_ELEMENT_VALUE = 3;

    /**
     * The '<em><b>XSD Complex Type</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>XSD Complex Type</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #XSD_COMPLEX_TYPE
     * @model name="XSDComplexType" literal="http://www.omg.org/spec/CMMN/DefinitionType/XSDComplexType"
     * @generated
     * @ordered
     */
    public static final int XSD_COMPLEX_TYPE_VALUE = 4;

    /**
     * The '<em><b>XSD Simple Type</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>XSD Simple Type</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #XSD_SIMPLE_TYPE
     * @model name="XSDSimpleType" literal="http://www.omg.org/spec/CMMN/DefinitionType/XSDSimpleType"
     * @generated
     * @ordered
     */
    public static final int XSD_SIMPLE_TYPE_VALUE = 5;

    /**
     * The '<em><b>WSDL Message</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WSDL Message</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WSDL_MESSAGE
     * @model name="WSDLMessage" literal="http://www.omg.org/spec/CMMN/DefinitionType/WSDLMessage"
     * @generated
     * @ordered
     */
    public static final int WSDL_MESSAGE_VALUE = 6;

    /**
     * The '<em><b>UML Class</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UML Class</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_CLASS
     * @model name="UMLClass" literal="http://www.omg.org/spec/CMMN/DefinitionType/UMLClass"
     * @generated
     * @ordered
     */
    public static final int UML_CLASS_VALUE = 7;

    /**
     * The '<em><b>Unknown</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNKNOWN
     * @model name="Unknown" literal="http://www.omg.org/spec/CMMN/DefinitionType/Unknown"
     * @generated
     * @ordered
     */
    public static final int UNKNOWN_VALUE = 8;

    /**
     * The '<em><b>Unspecified</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED
     * @model name="Unspecified" literal="http://www.omg.org/spec/CMMN/DefinitionType/Unspecified"
     * @generated
     * @ordered
     */
    public static final int UNSPECIFIED_VALUE = 9;

    /**
     * An array of all the '<em><b>Definition Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DefinitionType[] VALUES_ARRAY =
        new DefinitionType[] {
            CMIS_FOLDER,
            CMIS_DOCUMENT,
            CMIS_RELATIONSHIP,
            XSD_ELEMENT,
            XSD_COMPLEX_TYPE,
            XSD_SIMPLE_TYPE,
            WSDL_MESSAGE,
            UML_CLASS,
            UNKNOWN,
            UNSPECIFIED,
        };

    /**
     * A public read-only list of all the '<em><b>Definition Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DefinitionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Definition Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DefinitionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DefinitionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Definition Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DefinitionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DefinitionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Definition Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DefinitionType get(int value) {
        switch (value) {
            case CMIS_FOLDER_VALUE: return CMIS_FOLDER;
            case CMIS_DOCUMENT_VALUE: return CMIS_DOCUMENT;
            case CMIS_RELATIONSHIP_VALUE: return CMIS_RELATIONSHIP;
            case XSD_ELEMENT_VALUE: return XSD_ELEMENT;
            case XSD_COMPLEX_TYPE_VALUE: return XSD_COMPLEX_TYPE;
            case XSD_SIMPLE_TYPE_VALUE: return XSD_SIMPLE_TYPE;
            case WSDL_MESSAGE_VALUE: return WSDL_MESSAGE;
            case UML_CLASS_VALUE: return UML_CLASS;
            case UNKNOWN_VALUE: return UNKNOWN;
            case UNSPECIFIED_VALUE: return UNSPECIFIED;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private DefinitionType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //DefinitionType
