/**
 */
package org.jbpm.uml2.dd.umldi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.omg.dd.di.DIPackage;

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
 * @see org.jbpm.uml2.dd.umldi.UMLDIFactory
 * @model kind="package"
 * @generated
 */
public interface UMLDIPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "umldi";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/UML/20131201/DI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "umldi";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UMLDIPackage eINSTANCE = org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl.init();

    /**
     * The meta object id for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLDiagram()
     * @generated
     */
    int UML_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__OWNING_ELEMENT = DIPackage.DIAGRAM__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__OWNED_ELEMENT = DIPackage.DIAGRAM__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__LOCAL_STYLE = DIPackage.DIAGRAM__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__SHARED_STYLE = DIPackage.DIAGRAM__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__MODEL_ELEMENT = DIPackage.DIAGRAM__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__ID = DIPackage.DIAGRAM__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__BOUNDS = DIPackage.DIAGRAM__BOUNDS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__NAME = DIPackage.DIAGRAM__NAME;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__DOCUMENTATION = DIPackage.DIAGRAM__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__RESOLUTION = DIPackage.DIAGRAM__RESOLUTION;

    /**
     * The feature id for the '<em><b>Uml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__UML_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Owned Uml Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM__OWNED_UML_STYLE = DIPackage.DIAGRAM_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>UML Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_FEATURE_COUNT = DIPackage.DIAGRAM_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>UML Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_OPERATION_COUNT = DIPackage.DIAGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl <em>UML Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLEdge()
     * @generated
     */
    int UML_EDGE = 1;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__OWNING_ELEMENT = DIPackage.EDGE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__OWNED_ELEMENT = DIPackage.EDGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__LOCAL_STYLE = DIPackage.EDGE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__MODEL_ELEMENT = DIPackage.EDGE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__ID = DIPackage.EDGE__ID;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__SOURCE = DIPackage.EDGE__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__TARGET = DIPackage.EDGE__TARGET;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

    /**
     * The feature id for the '<em><b>Uml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__UML_ELEMENT = DIPackage.EDGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__SOURCE_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE__TARGET_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>UML Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>UML Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_EDGE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl <em>UML Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLShape()
     * @generated
     */
    int UML_SHAPE = 2;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__OWNING_ELEMENT = DIPackage.SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__OWNED_ELEMENT = DIPackage.SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__LOCAL_STYLE = DIPackage.SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__MODEL_ELEMENT = DIPackage.SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__ID = DIPackage.SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__BOUNDS = DIPackage.SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Uml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__UML_ELEMENT = DIPackage.SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__IS_EXPANDED = DIPackage.SHAPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Previous Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__PREVIOUS_WIDTH = DIPackage.SHAPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Previous Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__PREVIOUS_HEIGHT = DIPackage.SHAPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Owned Compartment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE__OWNED_COMPARTMENT = DIPackage.SHAPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>UML Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>UML Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_SHAPE_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl <em>UML Compartment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLCompartment()
     * @generated
     */
    int UML_COMPARTMENT = 3;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__OWNING_ELEMENT = JBPMDDPackage.COMPARTMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__OWNED_ELEMENT = JBPMDDPackage.COMPARTMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__LOCAL_STYLE = JBPMDDPackage.COMPARTMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__SHARED_STYLE = JBPMDDPackage.COMPARTMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__MODEL_ELEMENT = JBPMDDPackage.COMPARTMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__ID = JBPMDDPackage.COMPARTMENT__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__BOUNDS = JBPMDDPackage.COMPARTMENT__BOUNDS;

    /**
     * The feature id for the '<em><b>Uml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__UML_ELEMENT = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__IS_EXPANDED = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Previous Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__PREVIOUS_WIDTH = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Previous Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__PREVIOUS_HEIGHT = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Owned Shape</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__OWNED_SHAPE = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Feature Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT__FEATURE_NAME = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>UML Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT_FEATURE_COUNT = JBPMDDPackage.COMPARTMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>UML Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_COMPARTMENT_OPERATION_COUNT = JBPMDDPackage.COMPARTMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLStyleImpl <em>UML Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.uml2.dd.umldi.impl.UMLStyleImpl
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLStyle()
     * @generated
     */
    int UML_STYLE = 4;

    /**
     * The feature id for the '<em><b>Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FILL = DIPackage.STYLE__FILL;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FILL_COLOR = DIPackage.STYLE__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FILL_OPACITY = DIPackage.STYLE__FILL_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__STROKE_WIDTH = DIPackage.STYLE__STROKE_WIDTH;

    /**
     * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__STROKE_OPACITY = DIPackage.STYLE__STROKE_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__STROKE_COLOR = DIPackage.STYLE__STROKE_COLOR;

    /**
     * The feature id for the '<em><b>Stroke Dash Length</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__STROKE_DASH_LENGTH = DIPackage.STYLE__STROKE_DASH_LENGTH;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_SIZE = DIPackage.STYLE__FONT_SIZE;

    /**
     * The feature id for the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_NAME = DIPackage.STYLE__FONT_NAME;

    /**
     * The feature id for the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_COLOR = DIPackage.STYLE__FONT_COLOR;

    /**
     * The feature id for the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_ITALIC = DIPackage.STYLE__FONT_ITALIC;

    /**
     * The feature id for the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_BOLD = DIPackage.STYLE__FONT_BOLD;

    /**
     * The feature id for the '<em><b>Font Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_UNDERLINE = DIPackage.STYLE__FONT_UNDERLINE;

    /**
     * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE__FONT_STRIKE_THROUGH = DIPackage.STYLE__FONT_STRIKE_THROUGH;

    /**
     * The number of structural features of the '<em>UML Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Valid font size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid fill opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke width</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid dash length size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The number of operations of the '<em>UML Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement <em>UML Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.uml2.dd.umldi.UMLDiagramElement
     * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLDiagramElement()
     * @generated
     */
    int UML_DIAGRAM_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__OWNING_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__OWNED_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__LOCAL_STYLE = DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__SHARED_STYLE = DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__MODEL_ELEMENT = DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__ID = DIPackage.DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Uml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT__UML_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>UML Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT_FEATURE_COUNT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>UML Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_DIAGRAM_ELEMENT_OPERATION_COUNT = DIPackage.DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.jbpm.uml2.dd.umldi.UMLDiagram <em>UML Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Diagram</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagram
     * @generated
     */
    EClass getUMLDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.uml2.dd.umldi.UMLDiagram#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Uml Diagram Element</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagram#getOwnedUmlDiagramElement()
     * @see #getUMLDiagram()
     * @generated
     */
    EReference getUMLDiagram_OwnedUmlDiagramElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.uml2.dd.umldi.UMLDiagram#getOwnedUmlStyle <em>Owned Uml Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Uml Style</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagram#getOwnedUmlStyle()
     * @see #getUMLDiagram()
     * @generated
     */
    EReference getUMLDiagram_OwnedUmlStyle();

    /**
     * Returns the meta object for class '{@link org.jbpm.uml2.dd.umldi.UMLEdge <em>UML Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Edge</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLEdge
     * @generated
     */
    EClass getUMLEdge();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.uml2.dd.umldi.UMLEdge#getSourceShape <em>Source Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Shape</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLEdge#getSourceShape()
     * @see #getUMLEdge()
     * @generated
     */
    EReference getUMLEdge_SourceShape();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.uml2.dd.umldi.UMLEdge#getTargetShape <em>Target Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Shape</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLEdge#getTargetShape()
     * @see #getUMLEdge()
     * @generated
     */
    EReference getUMLEdge_TargetShape();

    /**
     * Returns the meta object for class '{@link org.jbpm.uml2.dd.umldi.UMLShape <em>UML Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Shape</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLShape
     * @generated
     */
    EClass getUMLShape();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.uml2.dd.umldi.UMLShape#getOwnedCompartment <em>Owned Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Compartment</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLShape#getOwnedCompartment()
     * @see #getUMLShape()
     * @generated
     */
    EReference getUMLShape_OwnedCompartment();

    /**
     * Returns the meta object for class '{@link org.jbpm.uml2.dd.umldi.UMLCompartment <em>UML Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Compartment</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLCompartment
     * @generated
     */
    EClass getUMLCompartment();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.uml2.dd.umldi.UMLCompartment#getOwnedShape <em>Owned Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Shape</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLCompartment#getOwnedShape()
     * @see #getUMLCompartment()
     * @generated
     */
    EReference getUMLCompartment_OwnedShape();

    /**
     * Returns the meta object for the attribute '{@link org.jbpm.uml2.dd.umldi.UMLCompartment#getFeatureName <em>Feature Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Feature Name</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLCompartment#getFeatureName()
     * @see #getUMLCompartment()
     * @generated
     */
    EAttribute getUMLCompartment_FeatureName();

    /**
     * Returns the meta object for class '{@link org.jbpm.uml2.dd.umldi.UMLStyle <em>UML Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Style</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLStyle
     * @generated
     */
    EClass getUMLStyle();

    /**
     * Returns the meta object for class '{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement <em>UML Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Diagram Element</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagramElement
     * @generated
     */
    EClass getUMLDiagramElement();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement#getUmlElement <em>Uml Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Uml Element</em>'.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagramElement#getUmlElement()
     * @see #getUMLDiagramElement()
     * @generated
     */
    EReference getUMLDiagramElement_UmlElement();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UMLDIFactory getUMLDIFactory();

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
         * The meta object literal for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDiagramImpl
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLDiagram()
         * @generated
         */
        EClass UML_DIAGRAM = eINSTANCE.getUMLDiagram();

        /**
         * The meta object literal for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT = eINSTANCE.getUMLDiagram_OwnedUmlDiagramElement();

        /**
         * The meta object literal for the '<em><b>Owned Uml Style</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_DIAGRAM__OWNED_UML_STYLE = eINSTANCE.getUMLDiagram_OwnedUmlStyle();

        /**
         * The meta object literal for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl <em>UML Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.uml2.dd.umldi.impl.UMLEdgeImpl
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLEdge()
         * @generated
         */
        EClass UML_EDGE = eINSTANCE.getUMLEdge();

        /**
         * The meta object literal for the '<em><b>Source Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_EDGE__SOURCE_SHAPE = eINSTANCE.getUMLEdge_SourceShape();

        /**
         * The meta object literal for the '<em><b>Target Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_EDGE__TARGET_SHAPE = eINSTANCE.getUMLEdge_TargetShape();

        /**
         * The meta object literal for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl <em>UML Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.uml2.dd.umldi.impl.UMLShapeImpl
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLShape()
         * @generated
         */
        EClass UML_SHAPE = eINSTANCE.getUMLShape();

        /**
         * The meta object literal for the '<em><b>Owned Compartment</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_SHAPE__OWNED_COMPARTMENT = eINSTANCE.getUMLShape_OwnedCompartment();

        /**
         * The meta object literal for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl <em>UML Compartment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.uml2.dd.umldi.impl.UMLCompartmentImpl
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLCompartment()
         * @generated
         */
        EClass UML_COMPARTMENT = eINSTANCE.getUMLCompartment();

        /**
         * The meta object literal for the '<em><b>Owned Shape</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_COMPARTMENT__OWNED_SHAPE = eINSTANCE.getUMLCompartment_OwnedShape();

        /**
         * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UML_COMPARTMENT__FEATURE_NAME = eINSTANCE.getUMLCompartment_FeatureName();

        /**
         * The meta object literal for the '{@link org.jbpm.uml2.dd.umldi.impl.UMLStyleImpl <em>UML Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.uml2.dd.umldi.impl.UMLStyleImpl
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLStyle()
         * @generated
         */
        EClass UML_STYLE = eINSTANCE.getUMLStyle();

        /**
         * The meta object literal for the '{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement <em>UML Diagram Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.uml2.dd.umldi.UMLDiagramElement
         * @see org.jbpm.uml2.dd.umldi.impl.UMLDIPackageImpl#getUMLDiagramElement()
         * @generated
         */
        EClass UML_DIAGRAM_ELEMENT = eINSTANCE.getUMLDiagramElement();

        /**
         * The meta object literal for the '<em><b>Uml Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_DIAGRAM_ELEMENT__UML_ELEMENT = eINSTANCE.getUMLDiagramElement_UmlElement();

    }

} //UMLDIPackage
