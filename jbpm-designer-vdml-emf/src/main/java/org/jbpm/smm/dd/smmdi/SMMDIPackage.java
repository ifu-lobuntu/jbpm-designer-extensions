/**
 */
package org.jbpm.smm.dd.smmdi;

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
 * @see org.jbpm.smm.dd.smmdi.SMMDIFactory
 * @model kind="package"
 * @generated
 */
public interface SMMDIPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "smmdi";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/SMM/20150201/DI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "smmdi";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SMMDIPackage eINSTANCE = org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl.init();

    /**
     * The meta object id for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMDiagramImpl <em>SMM Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.smm.dd.smmdi.impl.SMMDiagramImpl
     * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMDiagram()
     * @generated
     */
    int SMM_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__OWNING_ELEMENT = DIPackage.DIAGRAM__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__OWNED_ELEMENT = DIPackage.DIAGRAM__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__LOCAL_STYLE = DIPackage.DIAGRAM__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__SHARED_STYLE = DIPackage.DIAGRAM__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__MODEL_ELEMENT = DIPackage.DIAGRAM__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__ID = DIPackage.DIAGRAM__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__BOUNDS = DIPackage.DIAGRAM__BOUNDS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__NAME = DIPackage.DIAGRAM__NAME;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__DOCUMENTATION = DIPackage.DIAGRAM__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__RESOLUTION = DIPackage.DIAGRAM__RESOLUTION;

    /**
     * The feature id for the '<em><b>Smm Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__SMM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Smm Diagram Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SMM Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_FEATURE_COUNT = DIPackage.DIAGRAM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>SMM Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_OPERATION_COUNT = DIPackage.DIAGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl <em>SMM Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl
     * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMEdge()
     * @generated
     */
    int SMM_EDGE = 1;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__OWNING_ELEMENT = DIPackage.EDGE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__OWNED_ELEMENT = DIPackage.EDGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__LOCAL_STYLE = DIPackage.EDGE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__MODEL_ELEMENT = DIPackage.EDGE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__ID = DIPackage.EDGE__ID;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__SOURCE = DIPackage.EDGE__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__TARGET = DIPackage.EDGE__TARGET;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

    /**
     * The feature id for the '<em><b>Smm Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__SMM_ELEMENT = DIPackage.EDGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__SOURCE_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE__TARGET_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>SMM Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>SMM Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_EDGE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMShapeImpl <em>SMM Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.smm.dd.smmdi.impl.SMMShapeImpl
     * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMShape()
     * @generated
     */
    int SMM_SHAPE = 2;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__OWNING_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__OWNED_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__LOCAL_STYLE = JBPMDDPackage.BOUNDARIED_SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__SHARED_STYLE = JBPMDDPackage.BOUNDARIED_SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__MODEL_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__ID = JBPMDDPackage.BOUNDARIED_SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__BOUNDS = JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Boundary Shapes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__BOUNDARY_SHAPES = JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES;

    /**
     * The feature id for the '<em><b>Smm Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__SMM_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__IS_EXPANDED = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Previous Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__PREVIOUS_WIDTH = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Previous Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__PREVIOUS_HEIGHT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Owned Shape</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE__OWNED_SHAPE = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>SMM Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE_FEATURE_COUNT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>SMM Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_SHAPE_OPERATION_COUNT = JBPMDDPackage.BOUNDARIED_SHAPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.smm.dd.smmdi.SMMDiagramElement <em>SMM Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.smm.dd.smmdi.SMMDiagramElement
     * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMDiagramElement()
     * @generated
     */
    int SMM_DIAGRAM_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__OWNING_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__OWNED_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__LOCAL_STYLE = DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__SHARED_STYLE = DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__MODEL_ELEMENT = DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__ID = DIPackage.DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Smm Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT__SMM_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SMM Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT_FEATURE_COUNT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>SMM Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_DIAGRAM_ELEMENT_OPERATION_COUNT = DIPackage.DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMStyleImpl <em>SMM Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.smm.dd.smmdi.impl.SMMStyleImpl
     * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMStyle()
     * @generated
     */
    int SMM_STYLE = 4;

    /**
     * The feature id for the '<em><b>Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FILL = DIPackage.STYLE__FILL;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FILL_COLOR = DIPackage.STYLE__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FILL_OPACITY = DIPackage.STYLE__FILL_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__STROKE_WIDTH = DIPackage.STYLE__STROKE_WIDTH;

    /**
     * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__STROKE_OPACITY = DIPackage.STYLE__STROKE_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__STROKE_COLOR = DIPackage.STYLE__STROKE_COLOR;

    /**
     * The feature id for the '<em><b>Stroke Dash Length</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__STROKE_DASH_LENGTH = DIPackage.STYLE__STROKE_DASH_LENGTH;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_SIZE = DIPackage.STYLE__FONT_SIZE;

    /**
     * The feature id for the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_NAME = DIPackage.STYLE__FONT_NAME;

    /**
     * The feature id for the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_COLOR = DIPackage.STYLE__FONT_COLOR;

    /**
     * The feature id for the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_ITALIC = DIPackage.STYLE__FONT_ITALIC;

    /**
     * The feature id for the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_BOLD = DIPackage.STYLE__FONT_BOLD;

    /**
     * The feature id for the '<em><b>Font Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_UNDERLINE = DIPackage.STYLE__FONT_UNDERLINE;

    /**
     * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE__FONT_STRIKE_THROUGH = DIPackage.STYLE__FONT_STRIKE_THROUGH;

    /**
     * The number of structural features of the '<em>SMM Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Valid font size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid fill opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke width</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid dash length size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The number of operations of the '<em>SMM Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.jbpm.smm.dd.smmdi.SMMDiagram <em>SMM Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMM Diagram</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMDiagram
     * @generated
     */
    EClass getSMMDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.smm.dd.smmdi.SMMDiagram#getOwnedSmmDiagramElement <em>Owned Smm Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Smm Diagram Element</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMDiagram#getOwnedSmmDiagramElement()
     * @see #getSMMDiagram()
     * @generated
     */
    EReference getSMMDiagram_OwnedSmmDiagramElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.smm.dd.smmdi.SMMEdge <em>SMM Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMM Edge</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMEdge
     * @generated
     */
    EClass getSMMEdge();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.smm.dd.smmdi.SMMEdge#getSourceShape <em>Source Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Shape</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMEdge#getSourceShape()
     * @see #getSMMEdge()
     * @generated
     */
    EReference getSMMEdge_SourceShape();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.smm.dd.smmdi.SMMEdge#getTargetShape <em>Target Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Shape</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMEdge#getTargetShape()
     * @see #getSMMEdge()
     * @generated
     */
    EReference getSMMEdge_TargetShape();

    /**
     * Returns the meta object for class '{@link org.jbpm.smm.dd.smmdi.SMMShape <em>SMM Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMM Shape</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMShape
     * @generated
     */
    EClass getSMMShape();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.smm.dd.smmdi.SMMShape#getOwnedShape <em>Owned Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Shape</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMShape#getOwnedShape()
     * @see #getSMMShape()
     * @generated
     */
    EReference getSMMShape_OwnedShape();

    /**
     * Returns the meta object for class '{@link org.jbpm.smm.dd.smmdi.SMMDiagramElement <em>SMM Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMM Diagram Element</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMDiagramElement
     * @generated
     */
    EClass getSMMDiagramElement();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.smm.dd.smmdi.SMMDiagramElement#getSmmElement <em>Smm Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Smm Element</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMDiagramElement#getSmmElement()
     * @see #getSMMDiagramElement()
     * @generated
     */
    EReference getSMMDiagramElement_SmmElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.smm.dd.smmdi.SMMStyle <em>SMM Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMM Style</em>'.
     * @see org.jbpm.smm.dd.smmdi.SMMStyle
     * @generated
     */
    EClass getSMMStyle();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SMMDIFactory getSMMDIFactory();

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
         * The meta object literal for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMDiagramImpl <em>SMM Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.smm.dd.smmdi.impl.SMMDiagramImpl
         * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMDiagram()
         * @generated
         */
        EClass SMM_DIAGRAM = eINSTANCE.getSMMDiagram();

        /**
         * The meta object literal for the '<em><b>Owned Smm Diagram Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT = eINSTANCE.getSMMDiagram_OwnedSmmDiagramElement();

        /**
         * The meta object literal for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl <em>SMM Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.smm.dd.smmdi.impl.SMMEdgeImpl
         * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMEdge()
         * @generated
         */
        EClass SMM_EDGE = eINSTANCE.getSMMEdge();

        /**
         * The meta object literal for the '<em><b>Source Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_EDGE__SOURCE_SHAPE = eINSTANCE.getSMMEdge_SourceShape();

        /**
         * The meta object literal for the '<em><b>Target Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_EDGE__TARGET_SHAPE = eINSTANCE.getSMMEdge_TargetShape();

        /**
         * The meta object literal for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMShapeImpl <em>SMM Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.smm.dd.smmdi.impl.SMMShapeImpl
         * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMShape()
         * @generated
         */
        EClass SMM_SHAPE = eINSTANCE.getSMMShape();

        /**
         * The meta object literal for the '<em><b>Owned Shape</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_SHAPE__OWNED_SHAPE = eINSTANCE.getSMMShape_OwnedShape();

        /**
         * The meta object literal for the '{@link org.jbpm.smm.dd.smmdi.SMMDiagramElement <em>SMM Diagram Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.smm.dd.smmdi.SMMDiagramElement
         * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMDiagramElement()
         * @generated
         */
        EClass SMM_DIAGRAM_ELEMENT = eINSTANCE.getSMMDiagramElement();

        /**
         * The meta object literal for the '<em><b>Smm Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_DIAGRAM_ELEMENT__SMM_ELEMENT = eINSTANCE.getSMMDiagramElement_SmmElement();

        /**
         * The meta object literal for the '{@link org.jbpm.smm.dd.smmdi.impl.SMMStyleImpl <em>SMM Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.smm.dd.smmdi.impl.SMMStyleImpl
         * @see org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl#getSMMStyle()
         * @generated
         */
        EClass SMM_STYLE = eINSTANCE.getSMMStyle();

    }

} //SMMDIPackage
