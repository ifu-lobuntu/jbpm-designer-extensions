/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlFactory
 * @model kind="package"
 * @generated
 */
public interface VdmlPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "vdml";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/VDML/20131201/vdml.xmi";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "vdml";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VdmlPackage eINSTANCE = org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl.init();

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.VdmlElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlElementImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getVdmlElement()
     * @generated
     */
    int VDML_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT__ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT__ANNOTATION = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT__ID = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT__NAME = 3;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT__DESCRIPTION = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl <em>Value Delivery Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueDeliveryModel()
     * @generated
     */
    int VALUE_DELIVERY_MODEL = 0;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Metrics Model</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__METRICS_MODEL = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value Library</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__VALUE_LIBRARY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Capabilitylibrary</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Business Item Library</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Actor</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__ACTOR = VDML_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Practice Library</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY = VDML_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__SCENARIO = VDML_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Collaboration</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__COLLABORATION = VDML_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Role Library</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__ROLE_LIBRARY = VDML_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL__DIAGRAM = VDML_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Value Delivery Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Value Delivery Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DELIVERY_MODEL_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.AttributeImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 2;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TAG = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VALUE = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.AnnotationImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAnnotation()
     * @generated
     */
    int ANNOTATION = 3;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__TEXT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueLibraryImpl <em>Value Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueLibraryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueLibrary()
     * @generated
     */
    int VALUE_LIBRARY = 4;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__VALUE_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY__VALUE_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Value Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Value Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_LIBRARY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDefinitionImpl <em>Value Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueDefinitionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueDefinition()
     * @generated
     */
    int VALUE_DEFINITION = 5;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION__CHARACTERISTIC_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Value Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Value Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_DEFINITION_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueCategoryImpl <em>Value Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueCategoryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueCategory()
     * @generated
     */
    int VALUE_CATEGORY = 6;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parent Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__PARENT_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__CHILD_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Category Value</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY__CATEGORY_VALUE = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Value Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Value Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CATEGORY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityLibraryImpl <em>Capability Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityLibraryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityLibrary()
     * @generated
     */
    int CAPABILITY_LIBRARY = 7;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Capability</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__CAPABILITY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Capability Dependency</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Capability Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Capability Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_LIBRARY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapability()
     * @generated
     */
    int CAPABILITY = 8;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parent Cabability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__PARENT_CABABILITY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__CHILD_CAPABILITY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY__CHARACTERISTIC_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Capability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Capability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl <em>Capability Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityDependency()
     * @generated
     */
    int CAPABILITY_DEPENDENCY = 9;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Is Tangible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__IS_TANGIBLE = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Deliverable Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__SOURCE = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__TARGET = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is From External Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE = VDML_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is For External Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET = VDML_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Capability Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Capability Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEPENDENCY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryElementImpl <em>Business Item Library Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryElementImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemLibraryElement()
     * @generated
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT = 11;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Business Item Library Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Business Item Library Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_ELEMENT_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl <em>Business Item Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemDefinition()
     * @generated
     */
    int BUSINESS_ITEM_DEFINITION = 10;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__ATTRIBUTE = BUSINESS_ITEM_LIBRARY_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__ANNOTATION = BUSINESS_ITEM_LIBRARY_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__ID = BUSINESS_ITEM_LIBRARY_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__NAME = BUSINESS_ITEM_LIBRARY_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__DESCRIPTION = BUSINESS_ITEM_LIBRARY_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__ANY_ATTRIBUTE = BUSINESS_ITEM_LIBRARY_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Practice Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Supported Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Fungible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__CATEGORY = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__IS_SHAREABLE = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Capability Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Business Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION_FEATURE_COUNT = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Business Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_DEFINITION_OPERATION_COUNT = BUSINESS_ITEM_LIBRARY_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl <em>Practice Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPracticeDefinition()
     * @generated
     */
    int PRACTICE_DEFINITION = 12;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__CAPABILITY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Resource Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION__RESOURCE_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Practice Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Practice Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_DEFINITION_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl <em>Practice Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPracticeCategory()
     * @generated
     */
    int PRACTICE_CATEGORY = 13;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parent Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__PARENT_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__CHILD_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Category Practice</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY__CATEGORY_PRACTICE = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Practice Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Practice Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_CATEGORY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl <em>Capability Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityDefinition()
     * @generated
     */
    int CAPABILITY_DEFINITION = 14;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__ATTRIBUTE = CAPABILITY__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__ANNOTATION = CAPABILITY__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__ID = CAPABILITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__NAME = CAPABILITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__DESCRIPTION = CAPABILITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__ANY_ATTRIBUTE = CAPABILITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parent Cabability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__PARENT_CABABILITY = CAPABILITY__PARENT_CABABILITY;

    /**
     * The feature id for the '<em><b>Child Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__CHILD_CAPABILITY = CAPABILITY__CHILD_CAPABILITY;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__CHARACTERISTIC_DEFINITION = CAPABILITY__CHARACTERISTIC_DEFINITION;

    /**
     * The feature id for the '<em><b>Output</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__OUTPUT = CAPABILITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__INPUT = CAPABILITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Capability Resource Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION = CAPABILITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Practice Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION__PRACTICE_DEFINITION = CAPABILITY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Capability Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Capability Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_DEFINITION_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl <em>Business Item Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemCategory()
     * @generated
     */
    int BUSINESS_ITEM_CATEGORY = 15;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__ATTRIBUTE = BUSINESS_ITEM_LIBRARY_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__ANNOTATION = BUSINESS_ITEM_LIBRARY_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__ID = BUSINESS_ITEM_LIBRARY_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__NAME = BUSINESS_ITEM_LIBRARY_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__DESCRIPTION = BUSINESS_ITEM_LIBRARY_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__ANY_ATTRIBUTE = BUSINESS_ITEM_LIBRARY_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parent Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Category Item</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Business Item Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY_FEATURE_COUNT = BUSINESS_ITEM_LIBRARY_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Business Item Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_CATEGORY_OPERATION_COUNT = BUSINESS_ITEM_LIBRARY_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryImpl <em>Business Item Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemLibrary()
     * @generated
     */
    int BUSINESS_ITEM_LIBRARY = 16;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Business Item Library Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Business Item Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Business Item Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_LIBRARY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.MeasurableElementImpl <em>Measurable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.MeasurableElementImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getMeasurableElement()
     * @generated
     */
    int MEASURABLE_ELEMENT = 19;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Measurable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Measurable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURABLE_ELEMENT_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ParticipantImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getParticipant()
     * @generated
     */
    int PARTICIPANT = 18;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ASSIGNMENT = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PARTICIPANT_CALENDAR = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Participant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Participant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ActorImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getActor()
     * @generated
     */
    int ACTOR = 17;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ATTRIBUTE = PARTICIPANT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ANNOTATION = PARTICIPANT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ID = PARTICIPANT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__NAME = PARTICIPANT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__DESCRIPTION = PARTICIPANT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ANY_ATTRIBUTE = PARTICIPANT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__MEASURED_CHARACTERISTIC = PARTICIPANT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__ASSIGNMENT = PARTICIPANT__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__PARTICIPANT_CALENDAR = PARTICIPANT__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR__SCENARIO = PARTICIPANT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Actor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Actor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.MeasuredCharacteristicImpl <em>Measured Characteristic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.MeasuredCharacteristicImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getMeasuredCharacteristic()
     * @generated
     */
    int MEASURED_CHARACTERISTIC = 20;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__MEASUREMENT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Measured Characteristic</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Measured Characteristic</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURED_CHARACTERISTIC_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 21;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Assigned Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ASSIGNED_ROLE = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role Resource</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ROLE_RESOURCE = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Participant</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__PARTICIPANT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRole()
     * @generated
     */
    int ROLE = 22;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ATTRIBUTE = PARTICIPANT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ANNOTATION = PARTICIPANT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ID = PARTICIPANT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__NAME = PARTICIPANT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__DESCRIPTION = PARTICIPANT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ANY_ATTRIBUTE = PARTICIPANT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__MEASURED_CHARACTERISTIC = PARTICIPANT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ASSIGNMENT = PARTICIPANT__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__PARTICIPANT_CALENDAR = PARTICIPANT__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Performed Work</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__PERFORMED_WORK = PARTICIPANT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__PORT = PARTICIPANT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Provided Proposition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__PROVIDED_PROPOSITION = PARTICIPANT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Received Proposition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__RECEIVED_PROPOSITION = PARTICIPANT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Lead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__IS_LEAD = PARTICIPANT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Role Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ROLE_DEFINITION = PARTICIPANT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Role Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ROLE_ASSIGNMENT = PARTICIPANT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PortContainerImpl <em>Port Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PortContainerImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPortContainer()
     * @generated
     */
    int PORT_CONTAINER = 24;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER__CONTAINED_PORT = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Port Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Port Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_CONTAINER_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getActivity()
     * @generated
     */
    int ACTIVITY = 23;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ATTRIBUTE = PORT_CONTAINER__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ANNOTATION = PORT_CONTAINER__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ID = PORT_CONTAINER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__NAME = PORT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DESCRIPTION = PORT_CONTAINER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ANY_ATTRIBUTE = PORT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__MEASURED_CHARACTERISTIC = PORT_CONTAINER__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__CONTAINED_PORT = PORT_CONTAINER__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Capability Requirement</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__CAPABILITY_REQUIREMENT = PORT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resource Use</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__RESOURCE_USE = PORT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Delegation Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DELEGATION_CONTEXT = PORT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Applied Capability Offer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__APPLIED_CAPABILITY_OFFER = PORT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DURATION = PORT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Implemented Practice</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__IMPLEMENTED_PRACTICE = PORT_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Recurrence Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__RECURRENCE_INTERVAL = PORT_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Performing Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__PERFORMING_ROLE = PORT_CONTAINER_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = PORT_CONTAINER_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_OPERATION_COUNT = PORT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PortImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPort()
     * @generated
     */
    int PORT = 25;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Is Intermediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__IS_INTERMEDIATE = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Planning Percentage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__PLANNING_PERCENTAGE = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Batch Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__BATCH_SIZE = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Offset</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__OFFSET = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__CONDITION = MEASURABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT__HANDLER = MEASURABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ExpressionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 26;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Operand</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__OPERAND = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__BODY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.OperandImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOperand()
     * @generated
     */
    int OPERAND = 27;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__MEASURED_CHARACTERISTIC = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND__ALIAS = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Operand</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Operand</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERAND_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ResourceUseImpl <em>Resource Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ResourceUseImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getResourceUse()
     * @generated
     */
    int RESOURCE_USE = 28;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Deliverable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__DELIVERABLE = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__RESOURCE = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__QUANTITY = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__DURATION = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Planning Percentage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__PLANNING_PERCENTAGE = MEASURABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Input Driven</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__INPUT_DRIVEN = MEASURABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__CONDITION = MEASURABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Is Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__IS_EXCLUSIVE = MEASURABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Resource Is Consumed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE__RESOURCE_IS_CONSUMED = MEASURABLE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Resource Use</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Resource Use</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_USE_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OutputPortImpl <em>Output Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.OutputPortImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOutputPort()
     * @generated
     */
    int OUTPUT_PORT = 29;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__ATTRIBUTE = PORT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__ANNOTATION = PORT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__ID = PORT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__NAME = PORT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__ANY_ATTRIBUTE = PORT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__MEASURED_CHARACTERISTIC = PORT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Is Intermediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__IS_INTERMEDIATE = PORT__IS_INTERMEDIATE;

    /**
     * The feature id for the '<em><b>Planning Percentage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__PLANNING_PERCENTAGE = PORT__PLANNING_PERCENTAGE;

    /**
     * The feature id for the '<em><b>Batch Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__BATCH_SIZE = PORT__BATCH_SIZE;

    /**
     * The feature id for the '<em><b>Offset</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__OFFSET = PORT__OFFSET;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__CONDITION = PORT__CONDITION;

    /**
     * The feature id for the '<em><b>Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__HANDLER = PORT__HANDLER;

    /**
     * The feature id for the '<em><b>Output</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__OUTPUT = PORT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__OUTPUT_DEFINITION = PORT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value Add</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__VALUE_ADD = PORT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Delegated Output</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__DELEGATED_OUTPUT = PORT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Output Delegation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__OUTPUT_DELEGATION = PORT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Resource Use</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT__RESOURCE_USE = PORT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Output Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Output Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.DeliverableFlowImpl <em>Deliverable Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.DeliverableFlowImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getDeliverableFlow()
     * @generated
     */
    int DELIVERABLE_FLOW = 30;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Recipient</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__RECIPIENT = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Tangible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__IS_TANGIBLE = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Deliverable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__DELIVERABLE = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__DURATION = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Provider</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__PROVIDER = MEASURABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Channel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW__CHANNEL = MEASURABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Deliverable Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Deliverable Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIVERABLE_FLOW_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.InputPortImpl <em>Input Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.InputPortImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getInputPort()
     * @generated
     */
    int INPUT_PORT = 31;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__ATTRIBUTE = PORT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__ANNOTATION = PORT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__ID = PORT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__NAME = PORT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__ANY_ATTRIBUTE = PORT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__MEASURED_CHARACTERISTIC = PORT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Is Intermediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__IS_INTERMEDIATE = PORT__IS_INTERMEDIATE;

    /**
     * The feature id for the '<em><b>Planning Percentage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__PLANNING_PERCENTAGE = PORT__PLANNING_PERCENTAGE;

    /**
     * The feature id for the '<em><b>Batch Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__BATCH_SIZE = PORT__BATCH_SIZE;

    /**
     * The feature id for the '<em><b>Offset</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__OFFSET = PORT__OFFSET;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__CONDITION = PORT__CONDITION;

    /**
     * The feature id for the '<em><b>Handler</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__HANDLER = PORT__HANDLER;

    /**
     * The feature id for the '<em><b>Resource Use</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__RESOURCE_USE = PORT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delegated Input</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__DELEGATED_INPUT = PORT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Input Delegation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__INPUT_DELEGATION = PORT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__INPUT_DEFINITION = PORT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Correlation Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__CORRELATION_EXPRESSION = PORT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__ASSIGNMENT = PORT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Input</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT__INPUT = PORT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Input Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Input Port</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PortDelegationImpl <em>Port Delegation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PortDelegationImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPortDelegation()
     * @generated
     */
    int PORT_DELEGATION = 33;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Port Delegation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Port Delegation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PORT_DELEGATION_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.InputDelegationImpl <em>Input Delegation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.InputDelegationImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getInputDelegation()
     * @generated
     */
    int INPUT_DELEGATION = 32;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__ATTRIBUTE = PORT_DELEGATION__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__ANNOTATION = PORT_DELEGATION__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__ID = PORT_DELEGATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__NAME = PORT_DELEGATION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__DESCRIPTION = PORT_DELEGATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__ANY_ATTRIBUTE = PORT_DELEGATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__SOURCE = PORT_DELEGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION__TARGET = PORT_DELEGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Input Delegation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION_FEATURE_COUNT = PORT_DELEGATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Input Delegation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DELEGATION_OPERATION_COUNT = PORT_DELEGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemImpl <em>Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItem()
     * @generated
     */
    int BUSINESS_ITEM = 34;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__DEFINITION = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Fungible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__IS_FUNGIBLE = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Store</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__STORE = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Method</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__METHOD = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Shareable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__IS_SHAREABLE = MEASURABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__FLOW = MEASURABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getStore()
     * @generated
     */
    int STORE = 35;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__ATTRIBUTE = PORT_CONTAINER__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__ANNOTATION = PORT_CONTAINER__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__ID = PORT_CONTAINER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__NAME = PORT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__DESCRIPTION = PORT_CONTAINER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__ANY_ATTRIBUTE = PORT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__MEASURED_CHARACTERISTIC = PORT_CONTAINER__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__CONTAINED_PORT = PORT_CONTAINER__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Store Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__STORE_OWNER = PORT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Store Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__STORE_CONTEXT = PORT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Supported Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__SUPPORTED_CAPABILITY = PORT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__DURATION = PORT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Inventory Level</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__INVENTORY_LEVEL = PORT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__RESOURCE = PORT_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Store</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_FEATURE_COUNT = PORT_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Store</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_OPERATION_COUNT = PORT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl <em>Collaboration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCollaboration()
     * @generated
     */
    int COLLABORATION = 37;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ATTRIBUTE = PARTICIPANT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ANNOTATION = PARTICIPANT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ID = PARTICIPANT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__NAME = PARTICIPANT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__DESCRIPTION = PARTICIPANT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ANY_ATTRIBUTE = PARTICIPANT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__MEASURED_CHARACTERISTIC = PARTICIPANT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ASSIGNMENT = PARTICIPANT__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__PARTICIPANT_CALENDAR = PARTICIPANT__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__CONTAINED_PORT = PARTICIPANT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__COLLABORATION_ROLE = PARTICIPANT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ACTIVITY = PARTICIPANT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__FLOW = PARTICIPANT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Business Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__BUSINESS_ITEM = PARTICIPANT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Internal Port Delegation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__INTERNAL_PORT_DELEGATION = PARTICIPANT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Delegation Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__DELEGATION_CONTEXT = PARTICIPANT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__SCENARIO = PARTICIPANT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Owned Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__OWNED_ASSIGNMENT = PARTICIPANT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Collaboration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Collaboration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl <em>Org Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOrgUnit()
     * @generated
     */
    int ORG_UNIT = 36;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__ATTRIBUTE = COLLABORATION__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__ANNOTATION = COLLABORATION__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__ID = COLLABORATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__NAME = COLLABORATION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__DESCRIPTION = COLLABORATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__MEASURED_CHARACTERISTIC = COLLABORATION__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__ASSIGNMENT = COLLABORATION__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__PARTICIPANT_CALENDAR = COLLABORATION__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__CONTAINED_PORT = COLLABORATION__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__COLLABORATION_ROLE = COLLABORATION__COLLABORATION_ROLE;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__ACTIVITY = COLLABORATION__ACTIVITY;

    /**
     * The feature id for the '<em><b>Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__FLOW = COLLABORATION__FLOW;

    /**
     * The feature id for the '<em><b>Business Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__BUSINESS_ITEM = COLLABORATION__BUSINESS_ITEM;

    /**
     * The feature id for the '<em><b>Internal Port Delegation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__INTERNAL_PORT_DELEGATION = COLLABORATION__INTERNAL_PORT_DELEGATION;

    /**
     * The feature id for the '<em><b>Delegation Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__DELEGATION_CONTEXT = COLLABORATION__DELEGATION_CONTEXT;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__SCENARIO = COLLABORATION__SCENARIO;

    /**
     * The feature id for the '<em><b>Owned Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__OWNED_ASSIGNMENT = COLLABORATION__OWNED_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Capability Offer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__CAPABILITY_OFFER = COLLABORATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Method</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__OWNED_METHOD = COLLABORATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Position</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__POSITION = COLLABORATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Owned Store</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__OWNED_STORE = COLLABORATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT__LOCATION = COLLABORATION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Org Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Org Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORG_UNIT_OPERATION_COUNT = COLLABORATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AnalysisContextImpl <em>Analysis Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.AnalysisContextImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAnalysisContext()
     * @generated
     */
    int ANALYSIS_CONTEXT = 39;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Delegationt Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Observation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CONTEXT_OBSERVATION = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Context Store</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CONTEXT_STORE = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Context Based Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT = VDML_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Analysis Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Analysis Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALYSIS_CONTEXT_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.DelegationContextImpl <em>Delegation Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.DelegationContextImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getDelegationContext()
     * @generated
     */
    int DELEGATION_CONTEXT = 38;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__ATTRIBUTE = ANALYSIS_CONTEXT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__ANNOTATION = ANALYSIS_CONTEXT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__ID = ANALYSIS_CONTEXT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__NAME = ANALYSIS_CONTEXT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__DESCRIPTION = ANALYSIS_CONTEXT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__ANY_ATTRIBUTE = ANALYSIS_CONTEXT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Delegationt Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__DELEGATIONT_CONTEXT = ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT;

    /**
     * The feature id for the '<em><b>Context Observation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__CONTEXT_OBSERVATION = ANALYSIS_CONTEXT__CONTEXT_OBSERVATION;

    /**
     * The feature id for the '<em><b>Context Store</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__CONTEXT_STORE = ANALYSIS_CONTEXT__CONTEXT_STORE;

    /**
     * The feature id for the '<em><b>Context Based Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__CONTEXT_BASED_ASSIGNMENT = ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Parent Context</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__PARENT_CONTEXT = ANALYSIS_CONTEXT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Based Port Delegation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION = ANALYSIS_CONTEXT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Delegated Activity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__DELEGATED_ACTIVITY = ANALYSIS_CONTEXT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Context Collaboration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT__CONTEXT_COLLABORATION = ANALYSIS_CONTEXT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Delegation Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT_FEATURE_COUNT = ANALYSIS_CONTEXT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Delegation Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATION_CONTEXT_OPERATION_COUNT = ANALYSIS_CONTEXT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getScenario()
     * @generated
     */
    int SCENARIO = 40;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__ATTRIBUTE = ANALYSIS_CONTEXT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__ANNOTATION = ANALYSIS_CONTEXT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__ID = ANALYSIS_CONTEXT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__NAME = ANALYSIS_CONTEXT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__DESCRIPTION = ANALYSIS_CONTEXT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__ANY_ATTRIBUTE = ANALYSIS_CONTEXT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Delegationt Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__DELEGATIONT_CONTEXT = ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT;

    /**
     * The feature id for the '<em><b>Context Observation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__CONTEXT_OBSERVATION = ANALYSIS_CONTEXT__CONTEXT_OBSERVATION;

    /**
     * The feature id for the '<em><b>Context Store</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__CONTEXT_STORE = ANALYSIS_CONTEXT__CONTEXT_STORE;

    /**
     * The feature id for the '<em><b>Context Based Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__CONTEXT_BASED_ASSIGNMENT = ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Horizon</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__HORIZON = ANALYSIS_CONTEXT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Release Control</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__RELEASE_CONTROL = ANALYSIS_CONTEXT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__IS_DEFAULT = ANALYSIS_CONTEXT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Heat Threshold</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__HEAT_THRESHOLD = ANALYSIS_CONTEXT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Context Actor</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__CONTEXT_ACTOR = ANALYSIS_CONTEXT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Context Collaboration</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO__CONTEXT_COLLABORATION = ANALYSIS_CONTEXT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO_FEATURE_COUNT = ANALYSIS_CONTEXT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCENARIO_OPERATION_COUNT = ANALYSIS_CONTEXT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ReleaseControlImpl <em>Release Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ReleaseControlImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getReleaseControl()
     * @generated
     */
    int RELEASE_CONTROL = 41;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__SCENARIO = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL__STRATEGY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Release Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Release Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELEASE_CONTROL_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl <em>Capability Offer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityOffer()
     * @generated
     */
    int CAPABILITY_OFFER = 42;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Capability</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__CAPABILITY = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Capability Resource</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__CAPABILITY_RESOURCE = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Method</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__METHOD = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Release Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__RELEASE_CONTROL = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Applying Activity</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__APPLYING_ACTIVITY = MEASURABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Heat Index</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__HEAT_INDEX = MEASURABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Capability Provider</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__CAPABILITY_PROVIDER = MEASURABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER__LOCATION = MEASURABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Capability Offer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Capability Offer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_OFFER_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityMethodImpl <em>Capability Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityMethodImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityMethod()
     * @generated
     */
    int CAPABILITY_METHOD = 43;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__ATTRIBUTE = COLLABORATION__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__ANNOTATION = COLLABORATION__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__ID = COLLABORATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__NAME = COLLABORATION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__DESCRIPTION = COLLABORATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__MEASURED_CHARACTERISTIC = COLLABORATION__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__ASSIGNMENT = COLLABORATION__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__PARTICIPANT_CALENDAR = COLLABORATION__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__CONTAINED_PORT = COLLABORATION__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__COLLABORATION_ROLE = COLLABORATION__COLLABORATION_ROLE;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__ACTIVITY = COLLABORATION__ACTIVITY;

    /**
     * The feature id for the '<em><b>Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__FLOW = COLLABORATION__FLOW;

    /**
     * The feature id for the '<em><b>Business Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__BUSINESS_ITEM = COLLABORATION__BUSINESS_ITEM;

    /**
     * The feature id for the '<em><b>Internal Port Delegation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__INTERNAL_PORT_DELEGATION = COLLABORATION__INTERNAL_PORT_DELEGATION;

    /**
     * The feature id for the '<em><b>Delegation Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__DELEGATION_CONTEXT = COLLABORATION__DELEGATION_CONTEXT;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__SCENARIO = COLLABORATION__SCENARIO;

    /**
     * The feature id for the '<em><b>Owned Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__OWNED_ASSIGNMENT = COLLABORATION__OWNED_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__PERFORMER = COLLABORATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Method Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__METHOD_OWNER = COLLABORATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Implemented Practice</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__IMPLEMENTED_PRACTICE = COLLABORATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Method Resource</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__METHOD_RESOURCE = COLLABORATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Capability</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__CAPABILITY = COLLABORATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Supported Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD__SUPPORTED_CAPABILITY = COLLABORATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Capability Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Capability Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_METHOD_OPERATION_COUNT = COLLABORATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PerformerImpl <em>Performer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PerformerImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPerformer()
     * @generated
     */
    int PERFORMER = 44;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ATTRIBUTE = ROLE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ANNOTATION = ROLE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ID = ROLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__NAME = ROLE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__DESCRIPTION = ROLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ANY_ATTRIBUTE = ROLE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__MEASURED_CHARACTERISTIC = ROLE__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ASSIGNMENT = ROLE__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__PARTICIPANT_CALENDAR = ROLE__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Performed Work</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__PERFORMED_WORK = ROLE__PERFORMED_WORK;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__PORT = ROLE__PORT;

    /**
     * The feature id for the '<em><b>Provided Proposition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__PROVIDED_PROPOSITION = ROLE__PROVIDED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Received Proposition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__RECEIVED_PROPOSITION = ROLE__RECEIVED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Is Lead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__IS_LEAD = ROLE__IS_LEAD;

    /**
     * The feature id for the '<em><b>Role Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ROLE_DEFINITION = ROLE__ROLE_DEFINITION;

    /**
     * The feature id for the '<em><b>Role Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ROLE_ASSIGNMENT = ROLE__ROLE_ASSIGNMENT;

    /**
     * The number of structural features of the '<em>Performer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Performer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PositionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPosition()
     * @generated
     */
    int POSITION = 45;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ATTRIBUTE = ROLE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ANNOTATION = ROLE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ID = ROLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__NAME = ROLE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__DESCRIPTION = ROLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ANY_ATTRIBUTE = ROLE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__MEASURED_CHARACTERISTIC = ROLE__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ASSIGNMENT = ROLE__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__PARTICIPANT_CALENDAR = ROLE__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Performed Work</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__PERFORMED_WORK = ROLE__PERFORMED_WORK;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__PORT = ROLE__PORT;

    /**
     * The feature id for the '<em><b>Provided Proposition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__PROVIDED_PROPOSITION = ROLE__PROVIDED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Received Proposition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__RECEIVED_PROPOSITION = ROLE__RECEIVED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Is Lead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__IS_LEAD = ROLE__IS_LEAD;

    /**
     * The feature id for the '<em><b>Role Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ROLE_DEFINITION = ROLE__ROLE_DEFINITION;

    /**
     * The feature id for the '<em><b>Role Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ROLE_ASSIGNMENT = ROLE__ROLE_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Actor Pool</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__ACTOR_POOL = ROLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PoolImpl <em>Pool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PoolImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPool()
     * @generated
     */
    int POOL = 46;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__ATTRIBUTE = STORE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__ANNOTATION = STORE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__ID = STORE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__NAME = STORE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__DESCRIPTION = STORE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__ANY_ATTRIBUTE = STORE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__MEASURED_CHARACTERISTIC = STORE__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__CONTAINED_PORT = STORE__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Store Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__STORE_OWNER = STORE__STORE_OWNER;

    /**
     * The feature id for the '<em><b>Store Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__STORE_CONTEXT = STORE__STORE_CONTEXT;

    /**
     * The feature id for the '<em><b>Supported Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__SUPPORTED_CAPABILITY = STORE__SUPPORTED_CAPABILITY;

    /**
     * The feature id for the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__DURATION = STORE__DURATION;

    /**
     * The feature id for the '<em><b>Inventory Level</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__INVENTORY_LEVEL = STORE__INVENTORY_LEVEL;

    /**
     * The feature id for the '<em><b>Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__RESOURCE = STORE__RESOURCE;

    /**
     * The feature id for the '<em><b>Pool Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__POOL_CALENDAR = STORE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pool Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__POOL_SIZE = STORE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Position</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL__POSITION = STORE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Pool</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL_FEATURE_COUNT = STORE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Pool</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POOL_OPERATION_COUNT = STORE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CalendarServiceImpl <em>Calendar Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CalendarServiceImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCalendarService()
     * @generated
     */
    int CALENDAR_SERVICE = 47;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Calendar Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Calendar Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALENDAR_SERVICE_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl <em>Value Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueElement()
     * @generated
     */
    int VALUE_ELEMENT = 49;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Value Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__VALUE_DEFINITION = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__VALUE_MEASUREMENT = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Benchmark</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT__BENCHMARK = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Value Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Value Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ELEMENT_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl <em>Value Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueAdd()
     * @generated
     */
    int VALUE_ADD = 48;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__ATTRIBUTE = VALUE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__ANNOTATION = VALUE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__ID = VALUE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__NAME = VALUE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__DESCRIPTION = VALUE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__ANY_ATTRIBUTE = VALUE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__MEASURED_CHARACTERISTIC = VALUE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Value Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__VALUE_DEFINITION = VALUE_ELEMENT__VALUE_DEFINITION;

    /**
     * The feature id for the '<em><b>Value Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__VALUE_MEASUREMENT = VALUE_ELEMENT__VALUE_MEASUREMENT;

    /**
     * The feature id for the '<em><b>Benchmark</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__BENCHMARK = VALUE_ELEMENT__BENCHMARK;

    /**
     * The feature id for the '<em><b>Proposition Component</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__PROPOSITION_COMPONENT = VALUE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Aggregated From</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__AGGREGATED_FROM = VALUE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Aggregated To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD__AGGREGATED_TO = VALUE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Value Add</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Value Add</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_ADD_OPERATION_COUNT = VALUE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl <em>Value Proposition Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValuePropositionComponent()
     * @generated
     */
    int VALUE_PROPOSITION_COMPONENT = 50;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__ATTRIBUTE = VALUE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__ANNOTATION = VALUE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__ID = VALUE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__NAME = VALUE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__DESCRIPTION = VALUE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__ANY_ATTRIBUTE = VALUE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__MEASURED_CHARACTERISTIC = VALUE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Value Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__VALUE_DEFINITION = VALUE_ELEMENT__VALUE_DEFINITION;

    /**
     * The feature id for the '<em><b>Value Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__VALUE_MEASUREMENT = VALUE_ELEMENT__VALUE_MEASUREMENT;

    /**
     * The feature id for the '<em><b>Benchmark</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__BENCHMARK = VALUE_ELEMENT__BENCHMARK;

    /**
     * The feature id for the '<em><b>Percentage Weight</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT = VALUE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Satisfaction Level</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL = VALUE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value Impact For Provider</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER = VALUE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value Impact For Recipient</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT = VALUE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Articulated Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE = VALUE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Value Proposition Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Value Proposition Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_COMPONENT_OPERATION_COUNT = VALUE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OutputDelegationImpl <em>Output Delegation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.OutputDelegationImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOutputDelegation()
     * @generated
     */
    int OUTPUT_DELEGATION = 51;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__ATTRIBUTE = PORT_DELEGATION__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__ANNOTATION = PORT_DELEGATION__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__ID = PORT_DELEGATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__NAME = PORT_DELEGATION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__DESCRIPTION = PORT_DELEGATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__ANY_ATTRIBUTE = PORT_DELEGATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__SOURCE = PORT_DELEGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION__TARGET = PORT_DELEGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Output Delegation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION_FEATURE_COUNT = PORT_DELEGATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Output Delegation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DELEGATION_OPERATION_COUNT = PORT_DELEGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionImpl <em>Value Proposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueProposition()
     * @generated
     */
    int VALUE_PROPOSITION = 52;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__ATTRIBUTE = MEASURABLE_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__ANNOTATION = MEASURABLE_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__ID = MEASURABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__NAME = MEASURABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__DESCRIPTION = MEASURABLE_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__ANY_ATTRIBUTE = MEASURABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__MEASURED_CHARACTERISTIC = MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__COMPONENT = MEASURABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Recipient</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__RECIPIENT = MEASURABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Proposition Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__PROPOSITION_VALUE = MEASURABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Satisfaction Level</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__SATISFACTION_LEVEL = MEASURABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Value Impact For Provider</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__VALUE_IMPACT_FOR_PROVIDER = MEASURABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Value Impact For Recipient</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__VALUE_IMPACT_FOR_RECIPIENT = MEASURABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Provider</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION__PROVIDER = MEASURABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Value Proposition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_FEATURE_COUNT = MEASURABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Value Proposition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_PROPOSITION_OPERATION_COUNT = MEASURABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleDefinitionImpl <em>Role Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleDefinitionImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRoleDefinition()
     * @generated
     */
    int ROLE_DEFINITION = 53;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION__CHARACTERISTIC_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Role Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Role Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DEFINITION_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleCategoryImpl <em>Role Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleCategoryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRoleCategory()
     * @generated
     */
    int ROLE_CATEGORY = 54;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Role</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY__CATEGORY_ROLE = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Role Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Role Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_CATEGORY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeLibraryImpl <em>Practice Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PracticeLibraryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPracticeLibrary()
     * @generated
     */
    int PRACTICE_LIBRARY = 55;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Practice Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__PRACTICE_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Practice Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY__PRACTICE_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Practice Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Practice Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRACTICE_LIBRARY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleLibraryImpl <em>Role Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleLibraryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRoleLibrary()
     * @generated
     */
    int ROLE_LIBRARY = 56;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__ATTRIBUTE = VDML_ELEMENT__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__ANNOTATION = VDML_ELEMENT__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__ID = VDML_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__NAME = VDML_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__DESCRIPTION = VDML_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__ANY_ATTRIBUTE = VDML_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Role Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__ROLE_DEFINITION = VDML_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY__ROLE_CATEGORY = VDML_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Role Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY_FEATURE_COUNT = VDML_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Role Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_LIBRARY_OPERATION_COUNT = VDML_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessNetworkImpl <em>Business Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessNetworkImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessNetwork()
     * @generated
     */
    int BUSINESS_NETWORK = 57;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__ATTRIBUTE = COLLABORATION__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__ANNOTATION = COLLABORATION__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__ID = COLLABORATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__NAME = COLLABORATION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__DESCRIPTION = COLLABORATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__MEASURED_CHARACTERISTIC = COLLABORATION__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__ASSIGNMENT = COLLABORATION__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__PARTICIPANT_CALENDAR = COLLABORATION__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__CONTAINED_PORT = COLLABORATION__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__COLLABORATION_ROLE = COLLABORATION__COLLABORATION_ROLE;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__ACTIVITY = COLLABORATION__ACTIVITY;

    /**
     * The feature id for the '<em><b>Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__FLOW = COLLABORATION__FLOW;

    /**
     * The feature id for the '<em><b>Business Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__BUSINESS_ITEM = COLLABORATION__BUSINESS_ITEM;

    /**
     * The feature id for the '<em><b>Internal Port Delegation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__INTERNAL_PORT_DELEGATION = COLLABORATION__INTERNAL_PORT_DELEGATION;

    /**
     * The feature id for the '<em><b>Delegation Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__DELEGATION_CONTEXT = COLLABORATION__DELEGATION_CONTEXT;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__SCENARIO = COLLABORATION__SCENARIO;

    /**
     * The feature id for the '<em><b>Owned Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__OWNED_ASSIGNMENT = COLLABORATION__OWNED_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Party</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK__PARTY = COLLABORATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Business Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Business Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_NETWORK_OPERATION_COUNT = COLLABORATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PartyImpl <em>Party</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PartyImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getParty()
     * @generated
     */
    int PARTY = 58;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ATTRIBUTE = ROLE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ANNOTATION = ROLE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ID = ROLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__NAME = ROLE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__DESCRIPTION = ROLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ANY_ATTRIBUTE = ROLE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__MEASURED_CHARACTERISTIC = ROLE__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ASSIGNMENT = ROLE__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__PARTICIPANT_CALENDAR = ROLE__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Performed Work</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__PERFORMED_WORK = ROLE__PERFORMED_WORK;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__PORT = ROLE__PORT;

    /**
     * The feature id for the '<em><b>Provided Proposition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__PROVIDED_PROPOSITION = ROLE__PROVIDED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Received Proposition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__RECEIVED_PROPOSITION = ROLE__RECEIVED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Is Lead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__IS_LEAD = ROLE__IS_LEAD;

    /**
     * The feature id for the '<em><b>Role Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ROLE_DEFINITION = ROLE__ROLE_DEFINITION;

    /**
     * The feature id for the '<em><b>Role Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__ROLE_ASSIGNMENT = ROLE__ROLE_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Value Margin</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__VALUE_MARGIN = ROLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Party</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Party</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CommunityImpl <em>Community</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CommunityImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCommunity()
     * @generated
     */
    int COMMUNITY = 59;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__ATTRIBUTE = COLLABORATION__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__ANNOTATION = COLLABORATION__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__ID = COLLABORATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__NAME = COLLABORATION__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__DESCRIPTION = COLLABORATION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__MEASURED_CHARACTERISTIC = COLLABORATION__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__ASSIGNMENT = COLLABORATION__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__PARTICIPANT_CALENDAR = COLLABORATION__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__CONTAINED_PORT = COLLABORATION__CONTAINED_PORT;

    /**
     * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__COLLABORATION_ROLE = COLLABORATION__COLLABORATION_ROLE;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__ACTIVITY = COLLABORATION__ACTIVITY;

    /**
     * The feature id for the '<em><b>Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__FLOW = COLLABORATION__FLOW;

    /**
     * The feature id for the '<em><b>Business Item</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__BUSINESS_ITEM = COLLABORATION__BUSINESS_ITEM;

    /**
     * The feature id for the '<em><b>Internal Port Delegation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__INTERNAL_PORT_DELEGATION = COLLABORATION__INTERNAL_PORT_DELEGATION;

    /**
     * The feature id for the '<em><b>Delegation Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__DELEGATION_CONTEXT = COLLABORATION__DELEGATION_CONTEXT;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__SCENARIO = COLLABORATION__SCENARIO;

    /**
     * The feature id for the '<em><b>Owned Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__OWNED_ASSIGNMENT = COLLABORATION__OWNED_ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Member</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY__MEMBER = COLLABORATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Community</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Community</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNITY_OPERATION_COUNT = COLLABORATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.MemberImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getMember()
     * @generated
     */
    int MEMBER = 60;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ATTRIBUTE = ROLE__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ANNOTATION = ROLE__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ID = ROLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__NAME = ROLE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__DESCRIPTION = ROLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ANY_ATTRIBUTE = ROLE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__MEASURED_CHARACTERISTIC = ROLE__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ASSIGNMENT = ROLE__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__PARTICIPANT_CALENDAR = ROLE__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Performed Work</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__PERFORMED_WORK = ROLE__PERFORMED_WORK;

    /**
     * The feature id for the '<em><b>Port</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__PORT = ROLE__PORT;

    /**
     * The feature id for the '<em><b>Provided Proposition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__PROVIDED_PROPOSITION = ROLE__PROVIDED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Received Proposition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__RECEIVED_PROPOSITION = ROLE__RECEIVED_PROPOSITION;

    /**
     * The feature id for the '<em><b>Is Lead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__IS_LEAD = ROLE__IS_LEAD;

    /**
     * The feature id for the '<em><b>Role Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ROLE_DEFINITION = ROLE__ROLE_DEFINITION;

    /**
     * The feature id for the '<em><b>Role Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ROLE_ASSIGNMENT = ROLE__ROLE_ASSIGNMENT;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.PersonImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPerson()
     * @generated
     */
    int PERSON = 61;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ATTRIBUTE = ACTOR__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ANNOTATION = ACTOR__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ID = ACTOR__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__NAME = ACTOR__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__DESCRIPTION = ACTOR__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ANY_ATTRIBUTE = ACTOR__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__MEASURED_CHARACTERISTIC = ACTOR__MEASURED_CHARACTERISTIC;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ASSIGNMENT = ACTOR__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Participant Calendar</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__PARTICIPANT_CALENDAR = ACTOR__PARTICIPANT_CALENDAR;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__SCENARIO = ACTOR__SCENARIO;

    /**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityCategoryImpl <em>Capability Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityCategoryImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityCategory()
     * @generated
     */
    int CAPABILITY_CATEGORY = 62;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__ATTRIBUTE = CAPABILITY__ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__ANNOTATION = CAPABILITY__ANNOTATION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__ID = CAPABILITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__NAME = CAPABILITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__DESCRIPTION = CAPABILITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__ANY_ATTRIBUTE = CAPABILITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parent Cabability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__PARENT_CABABILITY = CAPABILITY__PARENT_CABABILITY;

    /**
     * The feature id for the '<em><b>Child Capability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__CHILD_CAPABILITY = CAPABILITY__CHILD_CAPABILITY;

    /**
     * The feature id for the '<em><b>Characteristic Definition</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY__CHARACTERISTIC_DEFINITION = CAPABILITY__CHARACTERISTIC_DEFINITION;

    /**
     * The number of structural features of the '<em>Capability Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Capability Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAPABILITY_CATEGORY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.integerImpl <em>integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdml.impl.integerImpl
     * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getinteger()
     * @generated
     */
    int INTEGER = 63;

    /**
     * The number of structural features of the '<em>integer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>integer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel <em>Value Delivery Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Delivery Model</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel
     * @generated
     */
    EClass getValueDeliveryModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getMetricsModel <em>Metrics Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Metrics Model</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getMetricsModel()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_MetricsModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getValueLibrary <em>Value Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getValueLibrary()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_ValueLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getCapabilitylibrary <em>Capabilitylibrary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Capabilitylibrary</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getCapabilitylibrary()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_Capabilitylibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getBusinessItemLibrary <em>Business Item Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Item Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getBusinessItemLibrary()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_BusinessItemLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getActor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Actor</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getActor()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_Actor();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getPracticeLibrary <em>Practice Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Practice Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getPracticeLibrary()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_PracticeLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scenario</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getScenario()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_Scenario();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getCollaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Collaboration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getCollaboration()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_Collaboration();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getRoleLibrary <em>Role Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Role Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getRoleLibrary()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_RoleLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Diagram</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getDiagram()
     * @see #getValueDeliveryModel()
     * @generated
     */
    EReference getValueDeliveryModel_Diagram();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement
     * @generated
     */
    EClass getVdmlElement();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement#getName()
     * @see #getVdmlElement()
     * @generated
     */
    EAttribute getVdmlElement_Name();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement#getDescription()
     * @see #getVdmlElement()
     * @generated
     */
    EAttribute getVdmlElement_Description();

    /**
     * Returns the meta object for the attribute list '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAnyAttribute()
     * @see #getVdmlElement()
     * @generated
     */
    EAttribute getVdmlElement_AnyAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAttribute()
     * @see #getVdmlElement()
     * @generated
     */
    EReference getVdmlElement_Attribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAnnotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement#getAnnotation()
     * @see #getVdmlElement()
     * @generated
     */
    EReference getVdmlElement_Annotation();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement#getId()
     * @see #getVdmlElement()
     * @generated
     */
    EAttribute getVdmlElement_Id();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Attribute#getTag <em>Tag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tag</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Attribute#getTag()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Tag();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Attribute#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Attribute#getValue()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Value();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Annotation
     * @generated
     */
    EClass getAnnotation();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Annotation#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Annotation#getText()
     * @see #getAnnotation()
     * @generated
     */
    EAttribute getAnnotation_Text();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary <em>Value Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueLibrary
     * @generated
     */
    EClass getValueLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary#getValueDefinition <em>Value Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueLibrary#getValueDefinition()
     * @see #getValueLibrary()
     * @generated
     */
    EReference getValueLibrary_ValueDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary#getValueCategory <em>Value Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueLibrary#getValueCategory()
     * @see #getValueLibrary()
     * @generated
     */
    EReference getValueLibrary_ValueCategory();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueDefinition <em>Value Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDefinition
     * @generated
     */
    EClass getValueDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDefinition#getCategory()
     * @see #getValueDefinition()
     * @generated
     */
    EReference getValueDefinition_Category();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Characteristic Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDefinition#getCharacteristicDefinition()
     * @see #getValueDefinition()
     * @generated
     */
    EReference getValueDefinition_CharacteristicDefinition();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueCategory <em>Value Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueCategory
     * @generated
     */
    EClass getValueCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Parent Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueCategory#getParentCategory()
     * @see #getValueCategory()
     * @generated
     */
    EReference getValueCategory_ParentCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Child Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueCategory#getChildCategory()
     * @see #getValueCategory()
     * @generated
     */
    EReference getValueCategory_ChildCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueCategory#getCategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category Value</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueCategory#getCategoryValue()
     * @see #getValueCategory()
     * @generated
     */
    EReference getValueCategory_CategoryValue();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary <em>Capability Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary
     * @generated
     */
    EClass getCapabilityLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary#getCapability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary#getCapability()
     * @see #getCapabilityLibrary()
     * @generated
     */
    EReference getCapabilityLibrary_Capability();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary#getCapabilityDependency <em>Capability Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Capability Dependency</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary#getCapabilityDependency()
     * @see #getCapabilityLibrary()
     * @generated
     */
    EReference getCapabilityLibrary_CapabilityDependency();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Capability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Capability
     * @generated
     */
    EClass getCapability();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Capability#getParentCabability <em>Parent Cabability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Parent Cabability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Capability#getParentCabability()
     * @see #getCapability()
     * @generated
     */
    EReference getCapability_ParentCabability();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Capability#getChildCapability <em>Child Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Child Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Capability#getChildCapability()
     * @see #getCapability()
     * @generated
     */
    EReference getCapability_ChildCapability();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Capability#getCharacteristicDefinition <em>Characteristic Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Characteristic Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Capability#getCharacteristicDefinition()
     * @see #getCapability()
     * @generated
     */
    EReference getCapability_CharacteristicDefinition();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency <em>Capability Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Dependency</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency
     * @generated
     */
    EClass getCapabilityDependency();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#isTangible <em>Is Tangible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Tangible</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#isTangible()
     * @see #getCapabilityDependency()
     * @generated
     */
    EAttribute getCapabilityDependency_IsTangible();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Deliverable Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getDeliverableDefinition()
     * @see #getCapabilityDependency()
     * @generated
     */
    EReference getCapabilityDependency_DeliverableDefinition();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getSource()
     * @see #getCapabilityDependency()
     * @generated
     */
    EReference getCapabilityDependency_Source();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getTarget()
     * @see #getCapabilityDependency()
     * @generated
     */
    EReference getCapabilityDependency_Target();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#isFromExternalSource <em>Is From External Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is From External Source</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#isFromExternalSource()
     * @see #getCapabilityDependency()
     * @generated
     */
    EAttribute getCapabilityDependency_IsFromExternalSource();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#isForExternalTarget <em>Is For External Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is For External Target</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#isForExternalTarget()
     * @see #getCapabilityDependency()
     * @generated
     */
    EAttribute getCapabilityDependency_IsForExternalTarget();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition <em>Business Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Item Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition
     * @generated
     */
    EClass getBusinessItemDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getPracticeDefinition <em>Practice Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Practice Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getPracticeDefinition()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EReference getBusinessItemDefinition_PracticeDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getSupportedCapability <em>Supported Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Supported Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getSupportedCapability()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EReference getBusinessItemDefinition_SupportedCapability();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isFungible <em>Is Fungible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Fungible</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isFungible()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EAttribute getBusinessItemDefinition_IsFungible();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCategory()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EReference getBusinessItemDefinition_Category();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Characteristic Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCharacteristicDefinition()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EReference getBusinessItemDefinition_CharacteristicDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isShareable <em>Is Shareable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Shareable</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isShareable()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EAttribute getBusinessItemDefinition_IsShareable();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCapabilityDependency <em>Capability Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Capability Dependency</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCapabilityDependency()
     * @see #getBusinessItemDefinition()
     * @generated
     */
    EReference getBusinessItemDefinition_CapabilityDependency();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemLibraryElement <em>Business Item Library Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Item Library Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemLibraryElement
     * @generated
     */
    EClass getBusinessItemLibraryElement();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition <em>Practice Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Practice Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition
     * @generated
     */
    EClass getPracticeDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getCategory()
     * @see #getPracticeDefinition()
     * @generated
     */
    EReference getPracticeDefinition_Category();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getCapability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getCapability()
     * @see #getPracticeDefinition()
     * @generated
     */
    EReference getPracticeDefinition_Capability();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getResourceDefinition <em>Resource Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getResourceDefinition()
     * @see #getPracticeDefinition()
     * @generated
     */
    EReference getPracticeDefinition_ResourceDefinition();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory <em>Practice Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Practice Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory
     * @generated
     */
    EClass getPracticeCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Parent Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getParentCategory()
     * @see #getPracticeCategory()
     * @generated
     */
    EReference getPracticeCategory_ParentCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Child Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getChildCategory()
     * @see #getPracticeCategory()
     * @generated
     */
    EReference getPracticeCategory_ChildCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getCategoryPractice <em>Category Practice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category Practice</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getCategoryPractice()
     * @see #getPracticeCategory()
     * @generated
     */
    EReference getPracticeCategory_CategoryPractice();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition <em>Capability Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition
     * @generated
     */
    EClass getCapabilityDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Output</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getOutput()
     * @see #getCapabilityDefinition()
     * @generated
     */
    EReference getCapabilityDefinition_Output();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Input</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getInput()
     * @see #getCapabilityDefinition()
     * @generated
     */
    EReference getCapabilityDefinition_Input();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getCapabilityResourceDefinition <em>Capability Resource Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Capability Resource Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getCapabilityResourceDefinition()
     * @see #getCapabilityDefinition()
     * @generated
     */
    EReference getCapabilityDefinition_CapabilityResourceDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getPracticeDefinition <em>Practice Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Practice Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getPracticeDefinition()
     * @see #getCapabilityDefinition()
     * @generated
     */
    EReference getCapabilityDefinition_PracticeDefinition();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory <em>Business Item Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Item Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory
     * @generated
     */
    EClass getBusinessItemCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Parent Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getParentCategory()
     * @see #getBusinessItemCategory()
     * @generated
     */
    EReference getBusinessItemCategory_ParentCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Child Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getChildCategory()
     * @see #getBusinessItemCategory()
     * @generated
     */
    EReference getBusinessItemCategory_ChildCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getCategoryItem <em>Category Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category Item</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getCategoryItem()
     * @see #getBusinessItemCategory()
     * @generated
     */
    EReference getBusinessItemCategory_CategoryItem();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary <em>Business Item Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Item Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary
     * @generated
     */
    EClass getBusinessItemLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary#getBusinessItemLibraryElement <em>Business Item Library Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Item Library Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary#getBusinessItemLibraryElement()
     * @see #getBusinessItemLibrary()
     * @generated
     */
    EReference getBusinessItemLibrary_BusinessItemLibraryElement();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Actor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Actor</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Actor
     * @generated
     */
    EClass getActor();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Actor#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Scenario</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Actor#getScenario()
     * @see #getActor()
     * @generated
     */
    EReference getActor_Scenario();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Participant</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Participant
     * @generated
     */
    EClass getParticipant();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Participant#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Assignment</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Participant#getAssignment()
     * @see #getParticipant()
     * @generated
     */
    EReference getParticipant_Assignment();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Participant#getParticipantCalendar <em>Participant Calendar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Calendar</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Participant#getParticipantCalendar()
     * @see #getParticipant()
     * @generated
     */
    EReference getParticipant_ParticipantCalendar();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.MeasurableElement <em>Measurable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measurable Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasurableElement
     * @generated
     */
    EClass getMeasurableElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.MeasurableElement#getMeasuredCharacteristic <em>Measured Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Measured Characteristic</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasurableElement#getMeasuredCharacteristic()
     * @see #getMeasurableElement()
     * @generated
     */
    EReference getMeasurableElement_MeasuredCharacteristic();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic <em>Measured Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measured Characteristic</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic
     * @generated
     */
    EClass getMeasuredCharacteristic();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getMeasurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Measurement</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getMeasurement()
     * @see #getMeasuredCharacteristic()
     * @generated
     */
    EReference getMeasuredCharacteristic_Measurement();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getCharacteristicDefinition <em>Characteristic Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Characteristic Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getCharacteristicDefinition()
     * @see #getMeasuredCharacteristic()
     * @generated
     */
    EReference getMeasuredCharacteristic_CharacteristicDefinition();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getAssignedRole <em>Assigned Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Assigned Role</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Assignment#getAssignedRole()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_AssignedRole();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getRoleResource <em>Role Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Role Resource</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Assignment#getRoleResource()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_RoleResource();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Participant</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Assignment#getParticipant()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Participant();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Role <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role
     * @generated
     */
    EClass getRole();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Role#getPerformedWork <em>Performed Work</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Performed Work</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getPerformedWork()
     * @see #getRole()
     * @generated
     */
    EReference getRole_PerformedWork();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Role#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Port</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getPort()
     * @see #getRole()
     * @generated
     */
    EReference getRole_Port();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Role#getProvidedProposition <em>Provided Proposition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Provided Proposition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getProvidedProposition()
     * @see #getRole()
     * @generated
     */
    EReference getRole_ProvidedProposition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Role#getReceivedProposition <em>Received Proposition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Received Proposition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getReceivedProposition()
     * @see #getRole()
     * @generated
     */
    EReference getRole_ReceivedProposition();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Role#isLead <em>Is Lead</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Lead</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#isLead()
     * @see #getRole()
     * @generated
     */
    EAttribute getRole_IsLead();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Role#getRoleDefinition <em>Role Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getRoleDefinition()
     * @see #getRole()
     * @generated
     */
    EReference getRole_RoleDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Role#getRoleAssignment <em>Role Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Role Assignment</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getRoleAssignment()
     * @see #getRole()
     * @generated
     */
    EReference getRole_RoleAssignment();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getCapabilityRequirement <em>Capability Requirement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Capability Requirement</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getCapabilityRequirement()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_CapabilityRequirement();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getResourceUse <em>Resource Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource Use</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getResourceUse()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_ResourceUse();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getDelegationContext <em>Delegation Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Delegation Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getDelegationContext()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_DelegationContext();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Applied Capability Offer</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getAppliedCapabilityOffer()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_AppliedCapabilityOffer();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Duration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getDuration()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_Duration();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getImplementedPractice <em>Implemented Practice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Implemented Practice</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getImplementedPractice()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_ImplementedPractice();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getRecurrenceInterval <em>Recurrence Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Recurrence Interval</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getRecurrenceInterval()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_RecurrenceInterval();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Activity#getPerformingRole <em>Performing Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Performing Role</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity#getPerformingRole()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_PerformingRole();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.PortContainer <em>Port Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port Container</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PortContainer
     * @generated
     */
    EClass getPortContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.PortContainer#getContainedPort <em>Contained Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Port</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PortContainer#getContainedPort()
     * @see #getPortContainer()
     * @generated
     */
    EReference getPortContainer_ContainedPort();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port
     * @generated
     */
    EClass getPort();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Port#isIntermediate <em>Is Intermediate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Intermediate</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port#isIntermediate()
     * @see #getPort()
     * @generated
     */
    EAttribute getPort_IsIntermediate();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Port#getPlanningPercentage <em>Planning Percentage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Planning Percentage</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port#getPlanningPercentage()
     * @see #getPort()
     * @generated
     */
    EReference getPort_PlanningPercentage();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Port#getBatchSize <em>Batch Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Batch Size</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port#getBatchSize()
     * @see #getPort()
     * @generated
     */
    EReference getPort_BatchSize();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Port#getOffset <em>Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Offset</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port#getOffset()
     * @see #getPort()
     * @generated
     */
    EReference getPort_Offset();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Port#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port#getCondition()
     * @see #getPort()
     * @generated
     */
    EReference getPort_Condition();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Port#getHandler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Handler</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Port#getHandler()
     * @see #getPort()
     * @generated
     */
    EReference getPort_Handler();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Expression#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Expression#getBody()
     * @see #getExpression()
     * @generated
     */
    EAttribute getExpression_Body();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Expression#getOperand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operand</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Expression#getOperand()
     * @see #getExpression()
     * @generated
     */
    EReference getExpression_Operand();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Operand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operand</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Operand
     * @generated
     */
    EClass getOperand();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Operand#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Operand#getAlias()
     * @see #getOperand()
     * @generated
     */
    EAttribute getOperand_Alias();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Operand#getMeasuredCharacteristic <em>Measured Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Measured Characteristic</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Operand#getMeasuredCharacteristic()
     * @see #getOperand()
     * @generated
     */
    EReference getOperand_MeasuredCharacteristic();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse <em>Resource Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Use</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse
     * @generated
     */
    EClass getResourceUse();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getDeliverable <em>Deliverable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Deliverable</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getDeliverable()
     * @see #getResourceUse()
     * @generated
     */
    EReference getResourceUse_Deliverable();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getResource()
     * @see #getResourceUse()
     * @generated
     */
    EReference getResourceUse_Resource();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getQuantity <em>Quantity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Quantity</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getQuantity()
     * @see #getResourceUse()
     * @generated
     */
    EReference getResourceUse_Quantity();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Duration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getDuration()
     * @see #getResourceUse()
     * @generated
     */
    EReference getResourceUse_Duration();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getPlanningPercentage <em>Planning Percentage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Planning Percentage</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getPlanningPercentage()
     * @see #getResourceUse()
     * @generated
     */
    EReference getResourceUse_PlanningPercentage();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#isInputDriven <em>Input Driven</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Driven</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#isInputDriven()
     * @see #getResourceUse()
     * @generated
     */
    EAttribute getResourceUse_InputDriven();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getCondition()
     * @see #getResourceUse()
     * @generated
     */
    EReference getResourceUse_Condition();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#isExclusive <em>Is Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Exclusive</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#isExclusive()
     * @see #getResourceUse()
     * @generated
     */
    EAttribute getResourceUse_IsExclusive();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#isResourceIsConsumed <em>Resource Is Consumed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Is Consumed</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#isResourceIsConsumed()
     * @see #getResourceUse()
     * @generated
     */
    EAttribute getResourceUse_ResourceIsConsumed();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort <em>Output Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Port</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort
     * @generated
     */
    EClass getOutputPort();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Output</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutput()
     * @see #getOutputPort()
     * @generated
     */
    EReference getOutputPort_Output();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDefinition <em>Output Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Output Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDefinition()
     * @see #getOutputPort()
     * @generated
     */
    EReference getOutputPort_OutputDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getValueAdd <em>Value Add</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Add</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getValueAdd()
     * @see #getOutputPort()
     * @generated
     */
    EReference getOutputPort_ValueAdd();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getDelegatedOutput <em>Delegated Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Delegated Output</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getDelegatedOutput()
     * @see #getOutputPort()
     * @generated
     */
    EReference getOutputPort_DelegatedOutput();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDelegation <em>Output Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Output Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDelegation()
     * @see #getOutputPort()
     * @generated
     */
    EReference getOutputPort_OutputDelegation();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getResourceUse <em>Resource Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Use</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getResourceUse()
     * @see #getOutputPort()
     * @generated
     */
    EReference getOutputPort_ResourceUse();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow <em>Deliverable Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deliverable Flow</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow
     * @generated
     */
    EClass getDeliverableFlow();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getRecipient <em>Recipient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Recipient</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getRecipient()
     * @see #getDeliverableFlow()
     * @generated
     */
    EReference getDeliverableFlow_Recipient();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#isTangible <em>Is Tangible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Tangible</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#isTangible()
     * @see #getDeliverableFlow()
     * @generated
     */
    EAttribute getDeliverableFlow_IsTangible();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDeliverable <em>Deliverable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Deliverable</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDeliverable()
     * @see #getDeliverableFlow()
     * @generated
     */
    EReference getDeliverableFlow_Deliverable();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Duration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDuration()
     * @see #getDeliverableFlow()
     * @generated
     */
    EReference getDeliverableFlow_Duration();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getChannel <em>Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Channel</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getChannel()
     * @see #getDeliverableFlow()
     * @generated
     */
    EAttribute getDeliverableFlow_Channel();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Provider</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getProvider()
     * @see #getDeliverableFlow()
     * @generated
     */
    EReference getDeliverableFlow_Provider();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.InputPort <em>Input Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Port</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort
     * @generated
     */
    EClass getInputPort();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getResourceUse <em>Resource Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Use</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getResourceUse()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_ResourceUse();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getDelegatedInput <em>Delegated Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Delegated Input</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getDelegatedInput()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_DelegatedInput();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDelegation <em>Input Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Input Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDelegation()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_InputDelegation();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDefinition <em>Input Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Input Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDefinition()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_InputDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Expression</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getCorrelationExpression()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_CorrelationExpression();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Assignment</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getAssignment()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_Assignment();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Input</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getInput()
     * @see #getInputPort()
     * @generated
     */
    EReference getInputPort_Input();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation <em>Input Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputDelegation
     * @generated
     */
    EClass getInputDelegation();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputDelegation#getSource()
     * @see #getInputDelegation()
     * @generated
     */
    EReference getInputDelegation_Source();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.InputDelegation#getTarget()
     * @see #getInputDelegation()
     * @generated
     */
    EReference getInputDelegation_Target();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.PortDelegation <em>Port Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PortDelegation
     * @generated
     */
    EClass getPortDelegation();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem <em>Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Item</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem
     * @generated
     */
    EClass getBusinessItem();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#getDefinition()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_Definition();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#isFungible <em>Is Fungible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Fungible</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#isFungible()
     * @see #getBusinessItem()
     * @generated
     */
    EAttribute getBusinessItem_IsFungible();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getStore <em>Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Store</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#getStore()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_Store();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Method</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#getMethod()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_Method();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#isShareable <em>Is Shareable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Shareable</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#isShareable()
     * @see #getBusinessItem()
     * @generated
     */
    EAttribute getBusinessItem_IsShareable();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getFlow <em>Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Flow</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#getFlow()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_Flow();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Store <em>Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Store</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store
     * @generated
     */
    EClass getStore();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.vdml.Store#getStoreOwner <em>Store Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Store Owner</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getStoreOwner()
     * @see #getStore()
     * @generated
     */
    EReference getStore_StoreOwner();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Store#getStoreContext <em>Store Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Store Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getStoreContext()
     * @see #getStore()
     * @generated
     */
    EReference getStore_StoreContext();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Store#getSupportedCapability <em>Supported Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Supported Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getSupportedCapability()
     * @see #getStore()
     * @generated
     */
    EReference getStore_SupportedCapability();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Store#getDuration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Duration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getDuration()
     * @see #getStore()
     * @generated
     */
    EReference getStore_Duration();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Store#getInventoryLevel <em>Inventory Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inventory Level</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getInventoryLevel()
     * @see #getStore()
     * @generated
     */
    EReference getStore_InventoryLevel();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.Store#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Resource</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getResource()
     * @see #getStore()
     * @generated
     */
    EReference getStore_Resource();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit <em>Org Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Org Unit</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit
     * @generated
     */
    EClass getOrgUnit();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit#getCapabilityOffer <em>Capability Offer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Capability Offer</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit#getCapabilityOffer()
     * @see #getOrgUnit()
     * @generated
     */
    EReference getOrgUnit_CapabilityOffer();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit#getOwnedMethod <em>Owned Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Method</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit#getOwnedMethod()
     * @see #getOrgUnit()
     * @generated
     */
    EReference getOrgUnit_OwnedMethod();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Position</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit#getPosition()
     * @see #getOrgUnit()
     * @generated
     */
    EReference getOrgUnit_Position();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit#getLocation()
     * @see #getOrgUnit()
     * @generated
     */
    EAttribute getOrgUnit_Location();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit#getOwnedStore <em>Owned Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Store</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit#getOwnedStore()
     * @see #getOrgUnit()
     * @generated
     */
    EReference getOrgUnit_OwnedStore();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Collaboration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration
     * @generated
     */
    EClass getCollaboration();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getCollaborationRole <em>Collaboration Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Collaboration Role</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getCollaborationRole()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_CollaborationRole();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getActivity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Activity</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getActivity()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Activity();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getFlow <em>Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getFlow()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Flow();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getBusinessItem <em>Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Item</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getBusinessItem()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_BusinessItem();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getInternalPortDelegation <em>Internal Port Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Internal Port Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getInternalPortDelegation()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_InternalPortDelegation();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getDelegationContext <em>Delegation Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Delegation Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getDelegationContext()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_DelegationContext();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Scenario</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getScenario()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Scenario();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getOwnedAssignment <em>Owned Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Assignment</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration#getOwnedAssignment()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_OwnedAssignment();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext <em>Delegation Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delegation Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext
     * @generated
     */
    EClass getDelegationContext();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getParentContext <em>Parent Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext#getParentContext()
     * @see #getDelegationContext()
     * @generated
     */
    EReference getDelegationContext_ParentContext();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextBasedPortDelegation <em>Context Based Port Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Based Port Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextBasedPortDelegation()
     * @see #getDelegationContext()
     * @generated
     */
    EReference getDelegationContext_ContextBasedPortDelegation();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Delegated Activity</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext#getDelegatedActivity()
     * @see #getDelegationContext()
     * @generated
     */
    EReference getDelegationContext_DelegatedActivity();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Collaboration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextCollaboration()
     * @see #getDelegationContext()
     * @generated
     */
    EReference getDelegationContext_ContextCollaboration();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext <em>Analysis Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analysis Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext
     * @generated
     */
    EClass getAnalysisContext();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getDelegationtContext <em>Delegationt Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Delegationt Context</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getDelegationtContext()
     * @see #getAnalysisContext()
     * @generated
     */
    EReference getAnalysisContext_DelegationtContext();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextObservation <em>Context Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Observation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextObservation()
     * @see #getAnalysisContext()
     * @generated
     */
    EReference getAnalysisContext_ContextObservation();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextStore <em>Context Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context Store</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextStore()
     * @see #getAnalysisContext()
     * @generated
     */
    EReference getAnalysisContext_ContextStore();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextBasedAssignment <em>Context Based Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Based Assignment</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextBasedAssignment()
     * @see #getAnalysisContext()
     * @generated
     */
    EReference getAnalysisContext_ContextBasedAssignment();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Scenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scenario</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario
     * @generated
     */
    EClass getScenario();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getHorizon <em>Horizon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Horizon</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getHorizon()
     * @see #getScenario()
     * @generated
     */
    EReference getScenario_Horizon();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getReleaseControl <em>Release Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Release Control</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getReleaseControl()
     * @see #getScenario()
     * @generated
     */
    EReference getScenario_ReleaseControl();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#isDefault <em>Is Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Default</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#isDefault()
     * @see #getScenario()
     * @generated
     */
    EAttribute getScenario_IsDefault();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getHeatThreshold <em>Heat Threshold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Heat Threshold</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getHeatThreshold()
     * @see #getScenario()
     * @generated
     */
    EReference getScenario_HeatThreshold();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getContextActor <em>Context Actor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context Actor</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getContextActor()
     * @see #getScenario()
     * @generated
     */
    EReference getScenario_ContextActor();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getContextCollaboration <em>Context Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context Collaboration</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getContextCollaboration()
     * @see #getScenario()
     * @generated
     */
    EReference getScenario_ContextCollaboration();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl <em>Release Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Release Control</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ReleaseControl
     * @generated
     */
    EClass getReleaseControl();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getStrategy <em>Strategy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Strategy</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getStrategy()
     * @see #getReleaseControl()
     * @generated
     */
    EAttribute getReleaseControl_Strategy();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Scenario</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getScenario()
     * @see #getReleaseControl()
     * @generated
     */
    EReference getReleaseControl_Scenario();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer <em>Capability Offer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Offer</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer
     * @generated
     */
    EClass getCapabilityOffer();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapability()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_Capability();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapabilityResource <em>Capability Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Capability Resource</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapabilityResource()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_CapabilityResource();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Method</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getMethod()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_Method();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getReleaseControl <em>Release Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Release Control</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getReleaseControl()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_ReleaseControl();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getApplyingActivity <em>Applying Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Applying Activity</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getApplyingActivity()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_ApplyingActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getHeatIndex <em>Heat Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Heat Index</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getHeatIndex()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_HeatIndex();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getLocation()
     * @see #getCapabilityOffer()
     * @generated
     */
    EAttribute getCapabilityOffer_Location();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapabilityProvider <em>Capability Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Capability Provider</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapabilityProvider()
     * @see #getCapabilityOffer()
     * @generated
     */
    EReference getCapabilityOffer_CapabilityProvider();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod <em>Capability Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Method</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod
     * @generated
     */
    EClass getCapabilityMethod();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getPerformer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Performer</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getPerformer()
     * @see #getCapabilityMethod()
     * @generated
     */
    EReference getCapabilityMethod_Performer();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Method Owner</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getMethodOwner()
     * @see #getCapabilityMethod()
     * @generated
     */
    EReference getCapabilityMethod_MethodOwner();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getImplementedPractice <em>Implemented Practice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Implemented Practice</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getImplementedPractice()
     * @see #getCapabilityMethod()
     * @generated
     */
    EReference getCapabilityMethod_ImplementedPractice();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getMethodResource <em>Method Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Method Resource</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getMethodResource()
     * @see #getCapabilityMethod()
     * @generated
     */
    EReference getCapabilityMethod_MethodResource();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getCapability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getCapability()
     * @see #getCapabilityMethod()
     * @generated
     */
    EReference getCapabilityMethod_Capability();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getSupportedCapability <em>Supported Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Supported Capability</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getSupportedCapability()
     * @see #getCapabilityMethod()
     * @generated
     */
    EReference getCapabilityMethod_SupportedCapability();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Performer</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Performer
     * @generated
     */
    EClass getPerformer();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Position <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Position</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Position
     * @generated
     */
    EClass getPosition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Position#getActorPool <em>Actor Pool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Actor Pool</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Position#getActorPool()
     * @see #getPosition()
     * @generated
     */
    EReference getPosition_ActorPool();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Pool <em>Pool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pool</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Pool
     * @generated
     */
    EClass getPool();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Pool#getPoolCalendar <em>Pool Calendar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Pool Calendar</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Pool#getPoolCalendar()
     * @see #getPool()
     * @generated
     */
    EReference getPool_PoolCalendar();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Pool#getPoolSize <em>Pool Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Pool Size</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Pool#getPoolSize()
     * @see #getPool()
     * @generated
     */
    EReference getPool_PoolSize();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.Pool#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Position</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Pool#getPosition()
     * @see #getPool()
     * @generated
     */
    EReference getPool_Position();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CalendarService <em>Calendar Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Calendar Service</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CalendarService
     * @generated
     */
    EClass getCalendarService();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd <em>Value Add</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Add</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd
     * @generated
     */
    EClass getValueAdd();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getPropositionComponent <em>Proposition Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Proposition Component</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd#getPropositionComponent()
     * @see #getValueAdd()
     * @generated
     */
    EReference getValueAdd_PropositionComponent();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedFrom <em>Aggregated From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Aggregated From</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedFrom()
     * @see #getValueAdd()
     * @generated
     */
    EReference getValueAdd_AggregatedFrom();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedTo <em>Aggregated To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Aggregated To</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedTo()
     * @see #getValueAdd()
     * @generated
     */
    EReference getValueAdd_AggregatedTo();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement <em>Value Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueElement
     * @generated
     */
    EClass getValueElement();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueDefinition <em>Value Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Value Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueDefinition()
     * @see #getValueElement()
     * @generated
     */
    EReference getValueElement_ValueDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueMeasurement <em>Value Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Measurement</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueMeasurement()
     * @see #getValueElement()
     * @generated
     */
    EReference getValueElement_ValueMeasurement();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getBenchmark <em>Benchmark</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Benchmark</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueElement#getBenchmark()
     * @see #getValueElement()
     * @generated
     */
    EReference getValueElement_Benchmark();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent <em>Value Proposition Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Proposition Component</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent
     * @generated
     */
    EClass getValuePropositionComponent();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Percentage Weight</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getPercentageWeight()
     * @see #getValuePropositionComponent()
     * @generated
     */
    EReference getValuePropositionComponent_PercentageWeight();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Satisfaction Level</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getSatisfactionLevel()
     * @see #getValuePropositionComponent()
     * @generated
     */
    EReference getValuePropositionComponent_SatisfactionLevel();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForProvider <em>Value Impact For Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Impact For Provider</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForProvider()
     * @see #getValuePropositionComponent()
     * @generated
     */
    EReference getValuePropositionComponent_ValueImpactForProvider();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForRecipient <em>Value Impact For Recipient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Impact For Recipient</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForRecipient()
     * @see #getValuePropositionComponent()
     * @generated
     */
    EReference getValuePropositionComponent_ValueImpactForRecipient();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Articulated Value</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getArticulatedValue()
     * @see #getValuePropositionComponent()
     * @generated
     */
    EReference getValuePropositionComponent_ArticulatedValue();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation <em>Output Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Delegation</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputDelegation
     * @generated
     */
    EClass getOutputDelegation();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getSource()
     * @see #getOutputDelegation()
     * @generated
     */
    EReference getOutputDelegation_Source();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getTarget()
     * @see #getOutputDelegation()
     * @generated
     */
    EReference getOutputDelegation_Target();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition <em>Value Proposition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Proposition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition
     * @generated
     */
    EClass getValueProposition();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Component</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getComponent()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_Component();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getRecipient <em>Recipient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Recipient</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getRecipient()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_Recipient();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getPropositionValue <em>Proposition Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Proposition Value</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getPropositionValue()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_PropositionValue();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getSatisfactionLevel <em>Satisfaction Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Satisfaction Level</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getSatisfactionLevel()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_SatisfactionLevel();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForProvider <em>Value Impact For Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Impact For Provider</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForProvider()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_ValueImpactForProvider();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForRecipient <em>Value Impact For Recipient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Impact For Recipient</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForRecipient()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_ValueImpactForRecipient();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Provider</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition#getProvider()
     * @see #getValueProposition()
     * @generated
     */
    EReference getValueProposition_Provider();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition <em>Role Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleDefinition
     * @generated
     */
    EClass getRoleDefinition();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCategory()
     * @see #getRoleDefinition()
     * @generated
     */
    EReference getRoleDefinition_Category();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Characteristic Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCharacteristicDefinition()
     * @see #getRoleDefinition()
     * @generated
     */
    EReference getRoleDefinition_CharacteristicDefinition();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.RoleCategory <em>Role Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleCategory
     * @generated
     */
    EClass getRoleCategory();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.vdml.RoleCategory#getCategoryRole <em>Category Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Category Role</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleCategory#getCategoryRole()
     * @see #getRoleCategory()
     * @generated
     */
    EReference getRoleCategory_CategoryRole();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary <em>Practice Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Practice Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeLibrary
     * @generated
     */
    EClass getPracticeLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary#getPracticeDefinition <em>Practice Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Practice Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeLibrary#getPracticeDefinition()
     * @see #getPracticeLibrary()
     * @generated
     */
    EReference getPracticeLibrary_PracticeDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary#getPracticeCategory <em>Practice Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Practice Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeLibrary#getPracticeCategory()
     * @see #getPracticeLibrary()
     * @generated
     */
    EReference getPracticeLibrary_PracticeCategory();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary <em>Role Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role Library</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleLibrary
     * @generated
     */
    EClass getRoleLibrary();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary#getRoleDefinition <em>Role Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Role Definition</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleLibrary#getRoleDefinition()
     * @see #getRoleLibrary()
     * @generated
     */
    EReference getRoleLibrary_RoleDefinition();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary#getRoleCategory <em>Role Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Role Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleLibrary#getRoleCategory()
     * @see #getRoleLibrary()
     * @generated
     */
    EReference getRoleLibrary_RoleCategory();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessNetwork <em>Business Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Network</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessNetwork
     * @generated
     */
    EClass getBusinessNetwork();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.BusinessNetwork#getParty <em>Party</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Party</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessNetwork#getParty()
     * @see #getBusinessNetwork()
     * @generated
     */
    EReference getBusinessNetwork_Party();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Party <em>Party</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Party</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Party
     * @generated
     */
    EClass getParty();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdml.Party#getValueMargin <em>Value Margin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Margin</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Party#getValueMargin()
     * @see #getParty()
     * @generated
     */
    EReference getParty_ValueMargin();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Community <em>Community</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Community</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Community
     * @generated
     */
    EClass getCommunity();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdml.Community#getMember <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Community#getMember()
     * @see #getCommunity()
     * @generated
     */
    EReference getCommunity_Member();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityCategory <em>Capability Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Capability Category</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityCategory
     * @generated
     */
    EClass getCapabilityCategory();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdml.integer <em>integer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>integer</em>'.
     * @see org.pavanecce.vdml.metamodel.vdml.integer
     * @generated
     */
    EClass getinteger();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VdmlFactory getVdmlFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl <em>Value Delivery Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueDeliveryModel()
         * @generated
         */
        EClass VALUE_DELIVERY_MODEL = eINSTANCE.getValueDeliveryModel();

        /**
         * The meta object literal for the '<em><b>Metrics Model</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__METRICS_MODEL = eINSTANCE.getValueDeliveryModel_MetricsModel();

        /**
         * The meta object literal for the '<em><b>Value Library</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__VALUE_LIBRARY = eINSTANCE.getValueDeliveryModel_ValueLibrary();

        /**
         * The meta object literal for the '<em><b>Capabilitylibrary</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY = eINSTANCE.getValueDeliveryModel_Capabilitylibrary();

        /**
         * The meta object literal for the '<em><b>Business Item Library</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY = eINSTANCE.getValueDeliveryModel_BusinessItemLibrary();

        /**
         * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__ACTOR = eINSTANCE.getValueDeliveryModel_Actor();

        /**
         * The meta object literal for the '<em><b>Practice Library</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY = eINSTANCE.getValueDeliveryModel_PracticeLibrary();

        /**
         * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__SCENARIO = eINSTANCE.getValueDeliveryModel_Scenario();

        /**
         * The meta object literal for the '<em><b>Collaboration</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__COLLABORATION = eINSTANCE.getValueDeliveryModel_Collaboration();

        /**
         * The meta object literal for the '<em><b>Role Library</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__ROLE_LIBRARY = eINSTANCE.getValueDeliveryModel_RoleLibrary();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DELIVERY_MODEL__DIAGRAM = eINSTANCE.getValueDeliveryModel_Diagram();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.VdmlElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlElementImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getVdmlElement()
         * @generated
         */
        EClass VDML_ELEMENT = eINSTANCE.getVdmlElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_ELEMENT__NAME = eINSTANCE.getVdmlElement_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_ELEMENT__DESCRIPTION = eINSTANCE.getVdmlElement_Description();

        /**
         * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getVdmlElement_AnyAttribute();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_ELEMENT__ATTRIBUTE = eINSTANCE.getVdmlElement_Attribute();

        /**
         * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_ELEMENT__ANNOTATION = eINSTANCE.getVdmlElement_Annotation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_ELEMENT__ID = eINSTANCE.getVdmlElement_Id();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.AttributeImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__TAG = eINSTANCE.getAttribute_Tag();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AnnotationImpl <em>Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.AnnotationImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAnnotation()
         * @generated
         */
        EClass ANNOTATION = eINSTANCE.getAnnotation();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueLibraryImpl <em>Value Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueLibraryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueLibrary()
         * @generated
         */
        EClass VALUE_LIBRARY = eINSTANCE.getValueLibrary();

        /**
         * The meta object literal for the '<em><b>Value Definition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_LIBRARY__VALUE_DEFINITION = eINSTANCE.getValueLibrary_ValueDefinition();

        /**
         * The meta object literal for the '<em><b>Value Category</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_LIBRARY__VALUE_CATEGORY = eINSTANCE.getValueLibrary_ValueCategory();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDefinitionImpl <em>Value Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueDefinitionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueDefinition()
         * @generated
         */
        EClass VALUE_DEFINITION = eINSTANCE.getValueDefinition();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DEFINITION__CATEGORY = eINSTANCE.getValueDefinition_Category();

        /**
         * The meta object literal for the '<em><b>Characteristic Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_DEFINITION__CHARACTERISTIC_DEFINITION = eINSTANCE.getValueDefinition_CharacteristicDefinition();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueCategoryImpl <em>Value Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueCategoryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueCategory()
         * @generated
         */
        EClass VALUE_CATEGORY = eINSTANCE.getValueCategory();

        /**
         * The meta object literal for the '<em><b>Parent Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_CATEGORY__PARENT_CATEGORY = eINSTANCE.getValueCategory_ParentCategory();

        /**
         * The meta object literal for the '<em><b>Child Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_CATEGORY__CHILD_CATEGORY = eINSTANCE.getValueCategory_ChildCategory();

        /**
         * The meta object literal for the '<em><b>Category Value</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_CATEGORY__CATEGORY_VALUE = eINSTANCE.getValueCategory_CategoryValue();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityLibraryImpl <em>Capability Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityLibraryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityLibrary()
         * @generated
         */
        EClass CAPABILITY_LIBRARY = eINSTANCE.getCapabilityLibrary();

        /**
         * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_LIBRARY__CAPABILITY = eINSTANCE.getCapabilityLibrary_Capability();

        /**
         * The meta object literal for the '<em><b>Capability Dependency</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_LIBRARY__CAPABILITY_DEPENDENCY = eINSTANCE.getCapabilityLibrary_CapabilityDependency();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl <em>Capability</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapability()
         * @generated
         */
        EClass CAPABILITY = eINSTANCE.getCapability();

        /**
         * The meta object literal for the '<em><b>Parent Cabability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY__PARENT_CABABILITY = eINSTANCE.getCapability_ParentCabability();

        /**
         * The meta object literal for the '<em><b>Child Capability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY__CHILD_CAPABILITY = eINSTANCE.getCapability_ChildCapability();

        /**
         * The meta object literal for the '<em><b>Characteristic Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY__CHARACTERISTIC_DEFINITION = eINSTANCE.getCapability_CharacteristicDefinition();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl <em>Capability Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDependencyImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityDependency()
         * @generated
         */
        EClass CAPABILITY_DEPENDENCY = eINSTANCE.getCapabilityDependency();

        /**
         * The meta object literal for the '<em><b>Is Tangible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAPABILITY_DEPENDENCY__IS_TANGIBLE = eINSTANCE.getCapabilityDependency_IsTangible();

        /**
         * The meta object literal for the '<em><b>Deliverable Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEPENDENCY__DELIVERABLE_DEFINITION = eINSTANCE.getCapabilityDependency_DeliverableDefinition();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEPENDENCY__SOURCE = eINSTANCE.getCapabilityDependency_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEPENDENCY__TARGET = eINSTANCE.getCapabilityDependency_Target();

        /**
         * The meta object literal for the '<em><b>Is From External Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAPABILITY_DEPENDENCY__IS_FROM_EXTERNAL_SOURCE = eINSTANCE.getCapabilityDependency_IsFromExternalSource();

        /**
         * The meta object literal for the '<em><b>Is For External Target</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAPABILITY_DEPENDENCY__IS_FOR_EXTERNAL_TARGET = eINSTANCE.getCapabilityDependency_IsForExternalTarget();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl <em>Business Item Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemDefinitionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemDefinition()
         * @generated
         */
        EClass BUSINESS_ITEM_DEFINITION = eINSTANCE.getBusinessItemDefinition();

        /**
         * The meta object literal for the '<em><b>Practice Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_DEFINITION__PRACTICE_DEFINITION = eINSTANCE.getBusinessItemDefinition_PracticeDefinition();

        /**
         * The meta object literal for the '<em><b>Supported Capability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY = eINSTANCE.getBusinessItemDefinition_SupportedCapability();

        /**
         * The meta object literal for the '<em><b>Is Fungible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM_DEFINITION__IS_FUNGIBLE = eINSTANCE.getBusinessItemDefinition_IsFungible();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_DEFINITION__CATEGORY = eINSTANCE.getBusinessItemDefinition_Category();

        /**
         * The meta object literal for the '<em><b>Characteristic Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_DEFINITION__CHARACTERISTIC_DEFINITION = eINSTANCE.getBusinessItemDefinition_CharacteristicDefinition();

        /**
         * The meta object literal for the '<em><b>Is Shareable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM_DEFINITION__IS_SHAREABLE = eINSTANCE.getBusinessItemDefinition_IsShareable();

        /**
         * The meta object literal for the '<em><b>Capability Dependency</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_DEFINITION__CAPABILITY_DEPENDENCY = eINSTANCE.getBusinessItemDefinition_CapabilityDependency();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryElementImpl <em>Business Item Library Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryElementImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemLibraryElement()
         * @generated
         */
        EClass BUSINESS_ITEM_LIBRARY_ELEMENT = eINSTANCE.getBusinessItemLibraryElement();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl <em>Practice Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PracticeDefinitionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPracticeDefinition()
         * @generated
         */
        EClass PRACTICE_DEFINITION = eINSTANCE.getPracticeDefinition();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_DEFINITION__CATEGORY = eINSTANCE.getPracticeDefinition_Category();

        /**
         * The meta object literal for the '<em><b>Capability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_DEFINITION__CAPABILITY = eINSTANCE.getPracticeDefinition_Capability();

        /**
         * The meta object literal for the '<em><b>Resource Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_DEFINITION__RESOURCE_DEFINITION = eINSTANCE.getPracticeDefinition_ResourceDefinition();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl <em>Practice Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPracticeCategory()
         * @generated
         */
        EClass PRACTICE_CATEGORY = eINSTANCE.getPracticeCategory();

        /**
         * The meta object literal for the '<em><b>Parent Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_CATEGORY__PARENT_CATEGORY = eINSTANCE.getPracticeCategory_ParentCategory();

        /**
         * The meta object literal for the '<em><b>Child Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_CATEGORY__CHILD_CATEGORY = eINSTANCE.getPracticeCategory_ChildCategory();

        /**
         * The meta object literal for the '<em><b>Category Practice</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_CATEGORY__CATEGORY_PRACTICE = eINSTANCE.getPracticeCategory_CategoryPractice();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl <em>Capability Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityDefinition()
         * @generated
         */
        EClass CAPABILITY_DEFINITION = eINSTANCE.getCapabilityDefinition();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEFINITION__OUTPUT = eINSTANCE.getCapabilityDefinition_Output();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEFINITION__INPUT = eINSTANCE.getCapabilityDefinition_Input();

        /**
         * The meta object literal for the '<em><b>Capability Resource Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION = eINSTANCE.getCapabilityDefinition_CapabilityResourceDefinition();

        /**
         * The meta object literal for the '<em><b>Practice Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_DEFINITION__PRACTICE_DEFINITION = eINSTANCE.getCapabilityDefinition_PracticeDefinition();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl <em>Business Item Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemCategoryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemCategory()
         * @generated
         */
        EClass BUSINESS_ITEM_CATEGORY = eINSTANCE.getBusinessItemCategory();

        /**
         * The meta object literal for the '<em><b>Parent Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_CATEGORY__PARENT_CATEGORY = eINSTANCE.getBusinessItemCategory_ParentCategory();

        /**
         * The meta object literal for the '<em><b>Child Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_CATEGORY__CHILD_CATEGORY = eINSTANCE.getBusinessItemCategory_ChildCategory();

        /**
         * The meta object literal for the '<em><b>Category Item</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_CATEGORY__CATEGORY_ITEM = eINSTANCE.getBusinessItemCategory_CategoryItem();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryImpl <em>Business Item Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemLibraryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItemLibrary()
         * @generated
         */
        EClass BUSINESS_ITEM_LIBRARY = eINSTANCE.getBusinessItemLibrary();

        /**
         * The meta object literal for the '<em><b>Business Item Library Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_LIBRARY__BUSINESS_ITEM_LIBRARY_ELEMENT = eINSTANCE.getBusinessItemLibrary_BusinessItemLibraryElement();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ActorImpl <em>Actor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ActorImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getActor()
         * @generated
         */
        EClass ACTOR = eINSTANCE.getActor();

        /**
         * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTOR__SCENARIO = eINSTANCE.getActor_Scenario();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ParticipantImpl <em>Participant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ParticipantImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getParticipant()
         * @generated
         */
        EClass PARTICIPANT = eINSTANCE.getParticipant();

        /**
         * The meta object literal for the '<em><b>Assignment</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARTICIPANT__ASSIGNMENT = eINSTANCE.getParticipant_Assignment();

        /**
         * The meta object literal for the '<em><b>Participant Calendar</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARTICIPANT__PARTICIPANT_CALENDAR = eINSTANCE.getParticipant_ParticipantCalendar();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.MeasurableElementImpl <em>Measurable Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.MeasurableElementImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getMeasurableElement()
         * @generated
         */
        EClass MEASURABLE_ELEMENT = eINSTANCE.getMeasurableElement();

        /**
         * The meta object literal for the '<em><b>Measured Characteristic</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURABLE_ELEMENT__MEASURED_CHARACTERISTIC = eINSTANCE.getMeasurableElement_MeasuredCharacteristic();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.MeasuredCharacteristicImpl <em>Measured Characteristic</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.MeasuredCharacteristicImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getMeasuredCharacteristic()
         * @generated
         */
        EClass MEASURED_CHARACTERISTIC = eINSTANCE.getMeasuredCharacteristic();

        /**
         * The meta object literal for the '<em><b>Measurement</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURED_CHARACTERISTIC__MEASUREMENT = eINSTANCE.getMeasuredCharacteristic_Measurement();

        /**
         * The meta object literal for the '<em><b>Characteristic Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURED_CHARACTERISTIC__CHARACTERISTIC_DEFINITION = eINSTANCE.getMeasuredCharacteristic_CharacteristicDefinition();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.AssignmentImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '<em><b>Assigned Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__ASSIGNED_ROLE = eINSTANCE.getAssignment_AssignedRole();

        /**
         * The meta object literal for the '<em><b>Role Resource</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__ROLE_RESOURCE = eINSTANCE.getAssignment_RoleResource();

        /**
         * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__PARTICIPANT = eINSTANCE.getAssignment_Participant();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleImpl <em>Role</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRole()
         * @generated
         */
        EClass ROLE = eINSTANCE.getRole();

        /**
         * The meta object literal for the '<em><b>Performed Work</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__PERFORMED_WORK = eINSTANCE.getRole_PerformedWork();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__PORT = eINSTANCE.getRole_Port();

        /**
         * The meta object literal for the '<em><b>Provided Proposition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__PROVIDED_PROPOSITION = eINSTANCE.getRole_ProvidedProposition();

        /**
         * The meta object literal for the '<em><b>Received Proposition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__RECEIVED_PROPOSITION = eINSTANCE.getRole_ReceivedProposition();

        /**
         * The meta object literal for the '<em><b>Is Lead</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROLE__IS_LEAD = eINSTANCE.getRole_IsLead();

        /**
         * The meta object literal for the '<em><b>Role Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__ROLE_DEFINITION = eINSTANCE.getRole_RoleDefinition();

        /**
         * The meta object literal for the '<em><b>Role Assignment</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE__ROLE_ASSIGNMENT = eINSTANCE.getRole_RoleAssignment();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl <em>Activity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getActivity()
         * @generated
         */
        EClass ACTIVITY = eINSTANCE.getActivity();

        /**
         * The meta object literal for the '<em><b>Capability Requirement</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__CAPABILITY_REQUIREMENT = eINSTANCE.getActivity_CapabilityRequirement();

        /**
         * The meta object literal for the '<em><b>Resource Use</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__RESOURCE_USE = eINSTANCE.getActivity_ResourceUse();

        /**
         * The meta object literal for the '<em><b>Delegation Context</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__DELEGATION_CONTEXT = eINSTANCE.getActivity_DelegationContext();

        /**
         * The meta object literal for the '<em><b>Applied Capability Offer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__APPLIED_CAPABILITY_OFFER = eINSTANCE.getActivity_AppliedCapabilityOffer();

        /**
         * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__DURATION = eINSTANCE.getActivity_Duration();

        /**
         * The meta object literal for the '<em><b>Implemented Practice</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__IMPLEMENTED_PRACTICE = eINSTANCE.getActivity_ImplementedPractice();

        /**
         * The meta object literal for the '<em><b>Recurrence Interval</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__RECURRENCE_INTERVAL = eINSTANCE.getActivity_RecurrenceInterval();

        /**
         * The meta object literal for the '<em><b>Performing Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__PERFORMING_ROLE = eINSTANCE.getActivity_PerformingRole();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PortContainerImpl <em>Port Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PortContainerImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPortContainer()
         * @generated
         */
        EClass PORT_CONTAINER = eINSTANCE.getPortContainer();

        /**
         * The meta object literal for the '<em><b>Contained Port</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT_CONTAINER__CONTAINED_PORT = eINSTANCE.getPortContainer_ContainedPort();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PortImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPort()
         * @generated
         */
        EClass PORT = eINSTANCE.getPort();

        /**
         * The meta object literal for the '<em><b>Is Intermediate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PORT__IS_INTERMEDIATE = eINSTANCE.getPort_IsIntermediate();

        /**
         * The meta object literal for the '<em><b>Planning Percentage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__PLANNING_PERCENTAGE = eINSTANCE.getPort_PlanningPercentage();

        /**
         * The meta object literal for the '<em><b>Batch Size</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__BATCH_SIZE = eINSTANCE.getPort_BatchSize();

        /**
         * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__OFFSET = eINSTANCE.getPort_Offset();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__CONDITION = eINSTANCE.getPort_Condition();

        /**
         * The meta object literal for the '<em><b>Handler</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PORT__HANDLER = eINSTANCE.getPort_Handler();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ExpressionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPRESSION__BODY = eINSTANCE.getExpression_Body();

        /**
         * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPRESSION__OPERAND = eINSTANCE.getExpression_Operand();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OperandImpl <em>Operand</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.OperandImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOperand()
         * @generated
         */
        EClass OPERAND = eINSTANCE.getOperand();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERAND__ALIAS = eINSTANCE.getOperand_Alias();

        /**
         * The meta object literal for the '<em><b>Measured Characteristic</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERAND__MEASURED_CHARACTERISTIC = eINSTANCE.getOperand_MeasuredCharacteristic();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ResourceUseImpl <em>Resource Use</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ResourceUseImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getResourceUse()
         * @generated
         */
        EClass RESOURCE_USE = eINSTANCE.getResourceUse();

        /**
         * The meta object literal for the '<em><b>Deliverable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_USE__DELIVERABLE = eINSTANCE.getResourceUse_Deliverable();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_USE__RESOURCE = eINSTANCE.getResourceUse_Resource();

        /**
         * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_USE__QUANTITY = eINSTANCE.getResourceUse_Quantity();

        /**
         * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_USE__DURATION = eINSTANCE.getResourceUse_Duration();

        /**
         * The meta object literal for the '<em><b>Planning Percentage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_USE__PLANNING_PERCENTAGE = eINSTANCE.getResourceUse_PlanningPercentage();

        /**
         * The meta object literal for the '<em><b>Input Driven</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_USE__INPUT_DRIVEN = eINSTANCE.getResourceUse_InputDriven();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_USE__CONDITION = eINSTANCE.getResourceUse_Condition();

        /**
         * The meta object literal for the '<em><b>Is Exclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_USE__IS_EXCLUSIVE = eINSTANCE.getResourceUse_IsExclusive();

        /**
         * The meta object literal for the '<em><b>Resource Is Consumed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_USE__RESOURCE_IS_CONSUMED = eINSTANCE.getResourceUse_ResourceIsConsumed();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OutputPortImpl <em>Output Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.OutputPortImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOutputPort()
         * @generated
         */
        EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

        /**
         * The meta object literal for the '<em><b>Output</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_PORT__OUTPUT = eINSTANCE.getOutputPort_Output();

        /**
         * The meta object literal for the '<em><b>Output Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_PORT__OUTPUT_DEFINITION = eINSTANCE.getOutputPort_OutputDefinition();

        /**
         * The meta object literal for the '<em><b>Value Add</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_PORT__VALUE_ADD = eINSTANCE.getOutputPort_ValueAdd();

        /**
         * The meta object literal for the '<em><b>Delegated Output</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_PORT__DELEGATED_OUTPUT = eINSTANCE.getOutputPort_DelegatedOutput();

        /**
         * The meta object literal for the '<em><b>Output Delegation</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_PORT__OUTPUT_DELEGATION = eINSTANCE.getOutputPort_OutputDelegation();

        /**
         * The meta object literal for the '<em><b>Resource Use</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_PORT__RESOURCE_USE = eINSTANCE.getOutputPort_ResourceUse();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.DeliverableFlowImpl <em>Deliverable Flow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.DeliverableFlowImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getDeliverableFlow()
         * @generated
         */
        EClass DELIVERABLE_FLOW = eINSTANCE.getDeliverableFlow();

        /**
         * The meta object literal for the '<em><b>Recipient</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELIVERABLE_FLOW__RECIPIENT = eINSTANCE.getDeliverableFlow_Recipient();

        /**
         * The meta object literal for the '<em><b>Is Tangible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DELIVERABLE_FLOW__IS_TANGIBLE = eINSTANCE.getDeliverableFlow_IsTangible();

        /**
         * The meta object literal for the '<em><b>Deliverable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELIVERABLE_FLOW__DELIVERABLE = eINSTANCE.getDeliverableFlow_Deliverable();

        /**
         * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELIVERABLE_FLOW__DURATION = eINSTANCE.getDeliverableFlow_Duration();

        /**
         * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DELIVERABLE_FLOW__CHANNEL = eINSTANCE.getDeliverableFlow_Channel();

        /**
         * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELIVERABLE_FLOW__PROVIDER = eINSTANCE.getDeliverableFlow_Provider();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.InputPortImpl <em>Input Port</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.InputPortImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getInputPort()
         * @generated
         */
        EClass INPUT_PORT = eINSTANCE.getInputPort();

        /**
         * The meta object literal for the '<em><b>Resource Use</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__RESOURCE_USE = eINSTANCE.getInputPort_ResourceUse();

        /**
         * The meta object literal for the '<em><b>Delegated Input</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__DELEGATED_INPUT = eINSTANCE.getInputPort_DelegatedInput();

        /**
         * The meta object literal for the '<em><b>Input Delegation</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__INPUT_DELEGATION = eINSTANCE.getInputPort_InputDelegation();

        /**
         * The meta object literal for the '<em><b>Input Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__INPUT_DEFINITION = eINSTANCE.getInputPort_InputDefinition();

        /**
         * The meta object literal for the '<em><b>Correlation Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__CORRELATION_EXPRESSION = eINSTANCE.getInputPort_CorrelationExpression();

        /**
         * The meta object literal for the '<em><b>Assignment</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__ASSIGNMENT = eINSTANCE.getInputPort_Assignment();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PORT__INPUT = eINSTANCE.getInputPort_Input();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.InputDelegationImpl <em>Input Delegation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.InputDelegationImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getInputDelegation()
         * @generated
         */
        EClass INPUT_DELEGATION = eINSTANCE.getInputDelegation();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_DELEGATION__SOURCE = eINSTANCE.getInputDelegation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_DELEGATION__TARGET = eINSTANCE.getInputDelegation_Target();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PortDelegationImpl <em>Port Delegation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PortDelegationImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPortDelegation()
         * @generated
         */
        EClass PORT_DELEGATION = eINSTANCE.getPortDelegation();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemImpl <em>Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessItemImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessItem()
         * @generated
         */
        EClass BUSINESS_ITEM = eINSTANCE.getBusinessItem();

        /**
         * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM__DEFINITION = eINSTANCE.getBusinessItem_Definition();

        /**
         * The meta object literal for the '<em><b>Is Fungible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM__IS_FUNGIBLE = eINSTANCE.getBusinessItem_IsFungible();

        /**
         * The meta object literal for the '<em><b>Store</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM__STORE = eINSTANCE.getBusinessItem_Store();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM__METHOD = eINSTANCE.getBusinessItem_Method();

        /**
         * The meta object literal for the '<em><b>Is Shareable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM__IS_SHAREABLE = eINSTANCE.getBusinessItem_IsShareable();

        /**
         * The meta object literal for the '<em><b>Flow</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM__FLOW = eINSTANCE.getBusinessItem_Flow();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl <em>Store</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.StoreImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getStore()
         * @generated
         */
        EClass STORE = eINSTANCE.getStore();

        /**
         * The meta object literal for the '<em><b>Store Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE__STORE_OWNER = eINSTANCE.getStore_StoreOwner();

        /**
         * The meta object literal for the '<em><b>Store Context</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE__STORE_CONTEXT = eINSTANCE.getStore_StoreContext();

        /**
         * The meta object literal for the '<em><b>Supported Capability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE__SUPPORTED_CAPABILITY = eINSTANCE.getStore_SupportedCapability();

        /**
         * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE__DURATION = eINSTANCE.getStore_Duration();

        /**
         * The meta object literal for the '<em><b>Inventory Level</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE__INVENTORY_LEVEL = eINSTANCE.getStore_InventoryLevel();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STORE__RESOURCE = eINSTANCE.getStore_Resource();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl <em>Org Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.OrgUnitImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOrgUnit()
         * @generated
         */
        EClass ORG_UNIT = eINSTANCE.getOrgUnit();

        /**
         * The meta object literal for the '<em><b>Capability Offer</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ORG_UNIT__CAPABILITY_OFFER = eINSTANCE.getOrgUnit_CapabilityOffer();

        /**
         * The meta object literal for the '<em><b>Owned Method</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ORG_UNIT__OWNED_METHOD = eINSTANCE.getOrgUnit_OwnedMethod();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ORG_UNIT__POSITION = eINSTANCE.getOrgUnit_Position();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ORG_UNIT__LOCATION = eINSTANCE.getOrgUnit_Location();

        /**
         * The meta object literal for the '<em><b>Owned Store</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ORG_UNIT__OWNED_STORE = eINSTANCE.getOrgUnit_OwnedStore();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl <em>Collaboration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CollaborationImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCollaboration()
         * @generated
         */
        EClass COLLABORATION = eINSTANCE.getCollaboration();

        /**
         * The meta object literal for the '<em><b>Collaboration Role</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__COLLABORATION_ROLE = eINSTANCE.getCollaboration_CollaborationRole();

        /**
         * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__ACTIVITY = eINSTANCE.getCollaboration_Activity();

        /**
         * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__FLOW = eINSTANCE.getCollaboration_Flow();

        /**
         * The meta object literal for the '<em><b>Business Item</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__BUSINESS_ITEM = eINSTANCE.getCollaboration_BusinessItem();

        /**
         * The meta object literal for the '<em><b>Internal Port Delegation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__INTERNAL_PORT_DELEGATION = eINSTANCE.getCollaboration_InternalPortDelegation();

        /**
         * The meta object literal for the '<em><b>Delegation Context</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__DELEGATION_CONTEXT = eINSTANCE.getCollaboration_DelegationContext();

        /**
         * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__SCENARIO = eINSTANCE.getCollaboration_Scenario();

        /**
         * The meta object literal for the '<em><b>Owned Assignment</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLLABORATION__OWNED_ASSIGNMENT = eINSTANCE.getCollaboration_OwnedAssignment();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.DelegationContextImpl <em>Delegation Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.DelegationContextImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getDelegationContext()
         * @generated
         */
        EClass DELEGATION_CONTEXT = eINSTANCE.getDelegationContext();

        /**
         * The meta object literal for the '<em><b>Parent Context</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATION_CONTEXT__PARENT_CONTEXT = eINSTANCE.getDelegationContext_ParentContext();

        /**
         * The meta object literal for the '<em><b>Context Based Port Delegation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATION_CONTEXT__CONTEXT_BASED_PORT_DELEGATION = eINSTANCE.getDelegationContext_ContextBasedPortDelegation();

        /**
         * The meta object literal for the '<em><b>Delegated Activity</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATION_CONTEXT__DELEGATED_ACTIVITY = eINSTANCE.getDelegationContext_DelegatedActivity();

        /**
         * The meta object literal for the '<em><b>Context Collaboration</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATION_CONTEXT__CONTEXT_COLLABORATION = eINSTANCE.getDelegationContext_ContextCollaboration();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.AnalysisContextImpl <em>Analysis Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.AnalysisContextImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getAnalysisContext()
         * @generated
         */
        EClass ANALYSIS_CONTEXT = eINSTANCE.getAnalysisContext();

        /**
         * The meta object literal for the '<em><b>Delegationt Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT = eINSTANCE.getAnalysisContext_DelegationtContext();

        /**
         * The meta object literal for the '<em><b>Context Observation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CONTEXT__CONTEXT_OBSERVATION = eINSTANCE.getAnalysisContext_ContextObservation();

        /**
         * The meta object literal for the '<em><b>Context Store</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CONTEXT__CONTEXT_STORE = eINSTANCE.getAnalysisContext_ContextStore();

        /**
         * The meta object literal for the '<em><b>Context Based Assignment</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT = eINSTANCE.getAnalysisContext_ContextBasedAssignment();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl <em>Scenario</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ScenarioImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getScenario()
         * @generated
         */
        EClass SCENARIO = eINSTANCE.getScenario();

        /**
         * The meta object literal for the '<em><b>Horizon</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCENARIO__HORIZON = eINSTANCE.getScenario_Horizon();

        /**
         * The meta object literal for the '<em><b>Release Control</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCENARIO__RELEASE_CONTROL = eINSTANCE.getScenario_ReleaseControl();

        /**
         * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCENARIO__IS_DEFAULT = eINSTANCE.getScenario_IsDefault();

        /**
         * The meta object literal for the '<em><b>Heat Threshold</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCENARIO__HEAT_THRESHOLD = eINSTANCE.getScenario_HeatThreshold();

        /**
         * The meta object literal for the '<em><b>Context Actor</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCENARIO__CONTEXT_ACTOR = eINSTANCE.getScenario_ContextActor();

        /**
         * The meta object literal for the '<em><b>Context Collaboration</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCENARIO__CONTEXT_COLLABORATION = eINSTANCE.getScenario_ContextCollaboration();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ReleaseControlImpl <em>Release Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ReleaseControlImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getReleaseControl()
         * @generated
         */
        EClass RELEASE_CONTROL = eINSTANCE.getReleaseControl();

        /**
         * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELEASE_CONTROL__STRATEGY = eINSTANCE.getReleaseControl_Strategy();

        /**
         * The meta object literal for the '<em><b>Scenario</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELEASE_CONTROL__SCENARIO = eINSTANCE.getReleaseControl_Scenario();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl <em>Capability Offer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityOfferImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityOffer()
         * @generated
         */
        EClass CAPABILITY_OFFER = eINSTANCE.getCapabilityOffer();

        /**
         * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__CAPABILITY = eINSTANCE.getCapabilityOffer_Capability();

        /**
         * The meta object literal for the '<em><b>Capability Resource</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__CAPABILITY_RESOURCE = eINSTANCE.getCapabilityOffer_CapabilityResource();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__METHOD = eINSTANCE.getCapabilityOffer_Method();

        /**
         * The meta object literal for the '<em><b>Release Control</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__RELEASE_CONTROL = eINSTANCE.getCapabilityOffer_ReleaseControl();

        /**
         * The meta object literal for the '<em><b>Applying Activity</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__APPLYING_ACTIVITY = eINSTANCE.getCapabilityOffer_ApplyingActivity();

        /**
         * The meta object literal for the '<em><b>Heat Index</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__HEAT_INDEX = eINSTANCE.getCapabilityOffer_HeatIndex();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAPABILITY_OFFER__LOCATION = eINSTANCE.getCapabilityOffer_Location();

        /**
         * The meta object literal for the '<em><b>Capability Provider</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_OFFER__CAPABILITY_PROVIDER = eINSTANCE.getCapabilityOffer_CapabilityProvider();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityMethodImpl <em>Capability Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityMethodImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityMethod()
         * @generated
         */
        EClass CAPABILITY_METHOD = eINSTANCE.getCapabilityMethod();

        /**
         * The meta object literal for the '<em><b>Performer</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_METHOD__PERFORMER = eINSTANCE.getCapabilityMethod_Performer();

        /**
         * The meta object literal for the '<em><b>Method Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_METHOD__METHOD_OWNER = eINSTANCE.getCapabilityMethod_MethodOwner();

        /**
         * The meta object literal for the '<em><b>Implemented Practice</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_METHOD__IMPLEMENTED_PRACTICE = eINSTANCE.getCapabilityMethod_ImplementedPractice();

        /**
         * The meta object literal for the '<em><b>Method Resource</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_METHOD__METHOD_RESOURCE = eINSTANCE.getCapabilityMethod_MethodResource();

        /**
         * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_METHOD__CAPABILITY = eINSTANCE.getCapabilityMethod_Capability();

        /**
         * The meta object literal for the '<em><b>Supported Capability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAPABILITY_METHOD__SUPPORTED_CAPABILITY = eINSTANCE.getCapabilityMethod_SupportedCapability();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PerformerImpl <em>Performer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PerformerImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPerformer()
         * @generated
         */
        EClass PERFORMER = eINSTANCE.getPerformer();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PositionImpl <em>Position</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PositionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPosition()
         * @generated
         */
        EClass POSITION = eINSTANCE.getPosition();

        /**
         * The meta object literal for the '<em><b>Actor Pool</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POSITION__ACTOR_POOL = eINSTANCE.getPosition_ActorPool();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PoolImpl <em>Pool</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PoolImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPool()
         * @generated
         */
        EClass POOL = eINSTANCE.getPool();

        /**
         * The meta object literal for the '<em><b>Pool Calendar</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POOL__POOL_CALENDAR = eINSTANCE.getPool_PoolCalendar();

        /**
         * The meta object literal for the '<em><b>Pool Size</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POOL__POOL_SIZE = eINSTANCE.getPool_PoolSize();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POOL__POSITION = eINSTANCE.getPool_Position();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CalendarServiceImpl <em>Calendar Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CalendarServiceImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCalendarService()
         * @generated
         */
        EClass CALENDAR_SERVICE = eINSTANCE.getCalendarService();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl <em>Value Add</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueAdd()
         * @generated
         */
        EClass VALUE_ADD = eINSTANCE.getValueAdd();

        /**
         * The meta object literal for the '<em><b>Proposition Component</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_ADD__PROPOSITION_COMPONENT = eINSTANCE.getValueAdd_PropositionComponent();

        /**
         * The meta object literal for the '<em><b>Aggregated From</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_ADD__AGGREGATED_FROM = eINSTANCE.getValueAdd_AggregatedFrom();

        /**
         * The meta object literal for the '<em><b>Aggregated To</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_ADD__AGGREGATED_TO = eINSTANCE.getValueAdd_AggregatedTo();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl <em>Value Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueElement()
         * @generated
         */
        EClass VALUE_ELEMENT = eINSTANCE.getValueElement();

        /**
         * The meta object literal for the '<em><b>Value Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_ELEMENT__VALUE_DEFINITION = eINSTANCE.getValueElement_ValueDefinition();

        /**
         * The meta object literal for the '<em><b>Value Measurement</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_ELEMENT__VALUE_MEASUREMENT = eINSTANCE.getValueElement_ValueMeasurement();

        /**
         * The meta object literal for the '<em><b>Benchmark</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_ELEMENT__BENCHMARK = eINSTANCE.getValueElement_Benchmark();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl <em>Value Proposition Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionComponentImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValuePropositionComponent()
         * @generated
         */
        EClass VALUE_PROPOSITION_COMPONENT = eINSTANCE.getValuePropositionComponent();

        /**
         * The meta object literal for the '<em><b>Percentage Weight</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION_COMPONENT__PERCENTAGE_WEIGHT = eINSTANCE.getValuePropositionComponent_PercentageWeight();

        /**
         * The meta object literal for the '<em><b>Satisfaction Level</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION_COMPONENT__SATISFACTION_LEVEL = eINSTANCE.getValuePropositionComponent_SatisfactionLevel();

        /**
         * The meta object literal for the '<em><b>Value Impact For Provider</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_PROVIDER = eINSTANCE.getValuePropositionComponent_ValueImpactForProvider();

        /**
         * The meta object literal for the '<em><b>Value Impact For Recipient</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION_COMPONENT__VALUE_IMPACT_FOR_RECIPIENT = eINSTANCE.getValuePropositionComponent_ValueImpactForRecipient();

        /**
         * The meta object literal for the '<em><b>Articulated Value</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE = eINSTANCE.getValuePropositionComponent_ArticulatedValue();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.OutputDelegationImpl <em>Output Delegation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.OutputDelegationImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getOutputDelegation()
         * @generated
         */
        EClass OUTPUT_DELEGATION = eINSTANCE.getOutputDelegation();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_DELEGATION__SOURCE = eINSTANCE.getOutputDelegation_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_DELEGATION__TARGET = eINSTANCE.getOutputDelegation_Target();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionImpl <em>Value Proposition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.ValuePropositionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getValueProposition()
         * @generated
         */
        EClass VALUE_PROPOSITION = eINSTANCE.getValueProposition();

        /**
         * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__COMPONENT = eINSTANCE.getValueProposition_Component();

        /**
         * The meta object literal for the '<em><b>Recipient</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__RECIPIENT = eINSTANCE.getValueProposition_Recipient();

        /**
         * The meta object literal for the '<em><b>Proposition Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__PROPOSITION_VALUE = eINSTANCE.getValueProposition_PropositionValue();

        /**
         * The meta object literal for the '<em><b>Satisfaction Level</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__SATISFACTION_LEVEL = eINSTANCE.getValueProposition_SatisfactionLevel();

        /**
         * The meta object literal for the '<em><b>Value Impact For Provider</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__VALUE_IMPACT_FOR_PROVIDER = eINSTANCE.getValueProposition_ValueImpactForProvider();

        /**
         * The meta object literal for the '<em><b>Value Impact For Recipient</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__VALUE_IMPACT_FOR_RECIPIENT = eINSTANCE.getValueProposition_ValueImpactForRecipient();

        /**
         * The meta object literal for the '<em><b>Provider</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALUE_PROPOSITION__PROVIDER = eINSTANCE.getValueProposition_Provider();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleDefinitionImpl <em>Role Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleDefinitionImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRoleDefinition()
         * @generated
         */
        EClass ROLE_DEFINITION = eINSTANCE.getRoleDefinition();

        /**
         * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_DEFINITION__CATEGORY = eINSTANCE.getRoleDefinition_Category();

        /**
         * The meta object literal for the '<em><b>Characteristic Definition</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_DEFINITION__CHARACTERISTIC_DEFINITION = eINSTANCE.getRoleDefinition_CharacteristicDefinition();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleCategoryImpl <em>Role Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleCategoryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRoleCategory()
         * @generated
         */
        EClass ROLE_CATEGORY = eINSTANCE.getRoleCategory();

        /**
         * The meta object literal for the '<em><b>Category Role</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_CATEGORY__CATEGORY_ROLE = eINSTANCE.getRoleCategory_CategoryRole();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeLibraryImpl <em>Practice Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PracticeLibraryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPracticeLibrary()
         * @generated
         */
        EClass PRACTICE_LIBRARY = eINSTANCE.getPracticeLibrary();

        /**
         * The meta object literal for the '<em><b>Practice Definition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_LIBRARY__PRACTICE_DEFINITION = eINSTANCE.getPracticeLibrary_PracticeDefinition();

        /**
         * The meta object literal for the '<em><b>Practice Category</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRACTICE_LIBRARY__PRACTICE_CATEGORY = eINSTANCE.getPracticeLibrary_PracticeCategory();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.RoleLibraryImpl <em>Role Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.RoleLibraryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getRoleLibrary()
         * @generated
         */
        EClass ROLE_LIBRARY = eINSTANCE.getRoleLibrary();

        /**
         * The meta object literal for the '<em><b>Role Definition</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_LIBRARY__ROLE_DEFINITION = eINSTANCE.getRoleLibrary_RoleDefinition();

        /**
         * The meta object literal for the '<em><b>Role Category</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_LIBRARY__ROLE_CATEGORY = eINSTANCE.getRoleLibrary_RoleCategory();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.BusinessNetworkImpl <em>Business Network</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.BusinessNetworkImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getBusinessNetwork()
         * @generated
         */
        EClass BUSINESS_NETWORK = eINSTANCE.getBusinessNetwork();

        /**
         * The meta object literal for the '<em><b>Party</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_NETWORK__PARTY = eINSTANCE.getBusinessNetwork_Party();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PartyImpl <em>Party</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PartyImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getParty()
         * @generated
         */
        EClass PARTY = eINSTANCE.getParty();

        /**
         * The meta object literal for the '<em><b>Value Margin</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARTY__VALUE_MARGIN = eINSTANCE.getParty_ValueMargin();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CommunityImpl <em>Community</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CommunityImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCommunity()
         * @generated
         */
        EClass COMMUNITY = eINSTANCE.getCommunity();

        /**
         * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMUNITY__MEMBER = eINSTANCE.getCommunity_Member();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.MemberImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.PersonImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getPerson()
         * @generated
         */
        EClass PERSON = eINSTANCE.getPerson();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityCategoryImpl <em>Capability Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.CapabilityCategoryImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getCapabilityCategory()
         * @generated
         */
        EClass CAPABILITY_CATEGORY = eINSTANCE.getCapabilityCategory();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdml.impl.integerImpl <em>integer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdml.impl.integerImpl
         * @see org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl#getinteger()
         * @generated
         */
        EClass INTEGER = eINSTANCE.getinteger();

    }

} //VdmlPackage
