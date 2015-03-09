/**
 */
package org.jbpm.vdml.dd.vdmldi;

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
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIFactory
 * @model kind="package"
 * @generated
 */
public interface VDMLDIPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "vdmldi";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/VDML/20131201/DI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "vdmldi";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VDMLDIPackage eINSTANCE = org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl.init();

    /**
     * The meta object id for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLDiagramImpl <em>VDML Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDiagramImpl
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLDiagram()
     * @generated
     */
    int VDML_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__OWNING_ELEMENT = DIPackage.DIAGRAM__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__OWNED_ELEMENT = DIPackage.DIAGRAM__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__LOCAL_STYLE = DIPackage.DIAGRAM__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__SHARED_STYLE = DIPackage.DIAGRAM__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__MODEL_ELEMENT = DIPackage.DIAGRAM__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__ID = DIPackage.DIAGRAM__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__BOUNDS = DIPackage.DIAGRAM__BOUNDS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__NAME = DIPackage.DIAGRAM__NAME;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__DOCUMENTATION = DIPackage.DIAGRAM__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__RESOLUTION = DIPackage.DIAGRAM__RESOLUTION;

    /**
     * The feature id for the '<em><b>Vdml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__VDML_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Vdml Diagram Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>VDML Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_FEATURE_COUNT = DIPackage.DIAGRAM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>VDML Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_OPERATION_COUNT = DIPackage.DIAGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl <em>VDML Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLEdge()
     * @generated
     */
    int VDML_EDGE = 1;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__OWNING_ELEMENT = DIPackage.EDGE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__OWNED_ELEMENT = DIPackage.EDGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__LOCAL_STYLE = DIPackage.EDGE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__MODEL_ELEMENT = DIPackage.EDGE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__ID = DIPackage.EDGE__ID;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__SOURCE = DIPackage.EDGE__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__TARGET = DIPackage.EDGE__TARGET;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

    /**
     * The feature id for the '<em><b>Vdml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__VDML_ELEMENT = DIPackage.EDGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__SOURCE_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__TARGET_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>VDML Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>VDML Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl <em>VDML Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLShape()
     * @generated
     */
    int VDML_SHAPE = 2;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNING_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNED_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__LOCAL_STYLE = JBPMDDPackage.BOUNDARIED_SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__SHARED_STYLE = JBPMDDPackage.BOUNDARIED_SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__MODEL_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__ID = JBPMDDPackage.BOUNDARIED_SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__BOUNDS = JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Boundary Shapes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__BOUNDARY_SHAPES = JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES;

    /**
     * The feature id for the '<em><b>Vdml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__VDML_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__IS_EXPANDED = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Owned Shape</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNED_SHAPE = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>VDML Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE_FEATURE_COUNT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>VDML Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE_OPERATION_COUNT = JBPMDDPackage.BOUNDARIED_SHAPE_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement <em>VDML Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLDiagramElement()
     * @generated
     */
    int VDML_DIAGRAM_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__OWNING_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__OWNED_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__LOCAL_STYLE = DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__SHARED_STYLE = DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__MODEL_ELEMENT = DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__ID = DIPackage.DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Vdml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT__VDML_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>VDML Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT_FEATURE_COUNT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>VDML Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_ELEMENT_OPERATION_COUNT = DIPackage.DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLStyleImpl <em>VDML Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLStyleImpl
     * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLStyle()
     * @generated
     */
    int VDML_STYLE = 4;

    /**
     * The feature id for the '<em><b>Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FILL = DIPackage.STYLE__FILL;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FILL_COLOR = DIPackage.STYLE__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FILL_OPACITY = DIPackage.STYLE__FILL_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__STROKE_WIDTH = DIPackage.STYLE__STROKE_WIDTH;

    /**
     * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__STROKE_OPACITY = DIPackage.STYLE__STROKE_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__STROKE_COLOR = DIPackage.STYLE__STROKE_COLOR;

    /**
     * The feature id for the '<em><b>Stroke Dash Length</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__STROKE_DASH_LENGTH = DIPackage.STYLE__STROKE_DASH_LENGTH;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_SIZE = DIPackage.STYLE__FONT_SIZE;

    /**
     * The feature id for the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_NAME = DIPackage.STYLE__FONT_NAME;

    /**
     * The feature id for the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_COLOR = DIPackage.STYLE__FONT_COLOR;

    /**
     * The feature id for the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_ITALIC = DIPackage.STYLE__FONT_ITALIC;

    /**
     * The feature id for the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_BOLD = DIPackage.STYLE__FONT_BOLD;

    /**
     * The feature id for the '<em><b>Font Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_UNDERLINE = DIPackage.STYLE__FONT_UNDERLINE;

    /**
     * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE__FONT_STRIKE_THROUGH = DIPackage.STYLE__FONT_STRIKE_THROUGH;

    /**
     * The number of structural features of the '<em>VDML Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Valid font size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid fill opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke width</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid dash length size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The number of operations of the '<em>VDML Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagram <em>VDML Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Diagram</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagram
     * @generated
     */
    EClass getVDMLDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagram#getOwnedVdmlDiagramElement <em>Owned Vdml Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Vdml Diagram Element</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagram#getOwnedVdmlDiagramElement()
     * @see #getVDMLDiagram()
     * @generated
     */
    EReference getVDMLDiagram_OwnedVdmlDiagramElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge <em>VDML Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Edge</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLEdge
     * @generated
     */
    EClass getVDMLEdge();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge#getSourceShape <em>Source Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Shape</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLEdge#getSourceShape()
     * @see #getVDMLEdge()
     * @generated
     */
    EReference getVDMLEdge_SourceShape();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge#getTargetShape <em>Target Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Shape</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLEdge#getTargetShape()
     * @see #getVDMLEdge()
     * @generated
     */
    EReference getVDMLEdge_TargetShape();

    /**
     * Returns the meta object for class '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape <em>VDML Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Shape</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLShape
     * @generated
     */
    EClass getVDMLShape();

    /**
     * Returns the meta object for the attribute '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#isIsExpanded <em>Is Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Expanded</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLShape#isIsExpanded()
     * @see #getVDMLShape()
     * @generated
     */
    EAttribute getVDMLShape_IsExpanded();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#getOwnedShape <em>Owned Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Shape</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLShape#getOwnedShape()
     * @see #getVDMLShape()
     * @generated
     */
    EReference getVDMLShape_OwnedShape();

    /**
     * Returns the meta object for class '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement <em>VDML Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Diagram Element</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement
     * @generated
     */
    EClass getVDMLDiagramElement();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement#getVdmlElement <em>Vdml Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Vdml Element</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement#getVdmlElement()
     * @see #getVDMLDiagramElement()
     * @generated
     */
    EReference getVDMLDiagramElement_VdmlElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.vdml.dd.vdmldi.VDMLStyle <em>VDML Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Style</em>'.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLStyle
     * @generated
     */
    EClass getVDMLStyle();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VDMLDIFactory getVDMLDIFactory();

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
         * The meta object literal for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLDiagramImpl <em>VDML Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDiagramImpl
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLDiagram()
         * @generated
         */
        EClass VDML_DIAGRAM = eINSTANCE.getVDMLDiagram();

        /**
         * The meta object literal for the '<em><b>Owned Vdml Diagram Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT = eINSTANCE.getVDMLDiagram_OwnedVdmlDiagramElement();

        /**
         * The meta object literal for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl <em>VDML Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLEdgeImpl
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLEdge()
         * @generated
         */
        EClass VDML_EDGE = eINSTANCE.getVDMLEdge();

        /**
         * The meta object literal for the '<em><b>Source Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_EDGE__SOURCE_SHAPE = eINSTANCE.getVDMLEdge_SourceShape();

        /**
         * The meta object literal for the '<em><b>Target Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_EDGE__TARGET_SHAPE = eINSTANCE.getVDMLEdge_TargetShape();

        /**
         * The meta object literal for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl <em>VDML Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLShapeImpl
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLShape()
         * @generated
         */
        EClass VDML_SHAPE = eINSTANCE.getVDMLShape();

        /**
         * The meta object literal for the '<em><b>Is Expanded</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_SHAPE__IS_EXPANDED = eINSTANCE.getVDMLShape_IsExpanded();

        /**
         * The meta object literal for the '<em><b>Owned Shape</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_SHAPE__OWNED_SHAPE = eINSTANCE.getVDMLShape_OwnedShape();

        /**
         * The meta object literal for the '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement <em>VDML Diagram Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLDiagramElement()
         * @generated
         */
        EClass VDML_DIAGRAM_ELEMENT = eINSTANCE.getVDMLDiagramElement();

        /**
         * The meta object literal for the '<em><b>Vdml Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_DIAGRAM_ELEMENT__VDML_ELEMENT = eINSTANCE.getVDMLDiagramElement_VdmlElement();

        /**
         * The meta object literal for the '{@link org.jbpm.vdml.dd.vdmldi.impl.VDMLStyleImpl <em>VDML Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLStyleImpl
         * @see org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl#getVDMLStyle()
         * @generated
         */
        EClass VDML_STYLE = eINSTANCE.getVDMLStyle();

    }

} //VDMLDIPackage
