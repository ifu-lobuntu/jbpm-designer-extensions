/**
 */
package org.jbpm.cmmn.dd.cmmndi;

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
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory
 * @model kind="package"
 * @generated
 */
public interface CMMNDIPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cmmndi";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/CMMN/20131201/DI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cmmndi";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CMMNDIPackage eINSTANCE = org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl.init();

    /**
     * The meta object id for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl <em>CMMN Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNDiagram()
     * @generated
     */
    int CMMN_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__OWNING_ELEMENT = DIPackage.DIAGRAM__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__OWNED_ELEMENT = DIPackage.DIAGRAM__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__LOCAL_STYLE = DIPackage.DIAGRAM__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__SHARED_STYLE = DIPackage.DIAGRAM__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__MODEL_ELEMENT = DIPackage.DIAGRAM__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__ID = DIPackage.DIAGRAM__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__BOUNDS = DIPackage.DIAGRAM__BOUNDS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__NAME = DIPackage.DIAGRAM__NAME;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__DOCUMENTATION = DIPackage.DIAGRAM__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__RESOLUTION = DIPackage.DIAGRAM__RESOLUTION;

    /**
     * The feature id for the '<em><b>Owned Cmmn Diagram Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Cmmn Styles</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__OWNED_CMMN_STYLES = DIPackage.DIAGRAM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cmmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM__CMMN_ELEMENT = DIPackage.DIAGRAM_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>CMMN Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_FEATURE_COUNT = DIPackage.DIAGRAM_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>CMMN Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_OPERATION_COUNT = DIPackage.DIAGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl <em>CMMN Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNEdge()
     * @generated
     */
    int CMMN_EDGE = 1;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__OWNING_ELEMENT = DIPackage.EDGE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__OWNED_ELEMENT = DIPackage.EDGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__LOCAL_STYLE = DIPackage.EDGE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__SHARED_STYLE = DIPackage.EDGE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__MODEL_ELEMENT = DIPackage.EDGE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__ID = DIPackage.EDGE__ID;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__SOURCE = DIPackage.EDGE__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__TARGET = DIPackage.EDGE__TARGET;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__WAYPOINT = DIPackage.EDGE__WAYPOINT;

    /**
     * The feature id for the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__SOURCE_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__TARGET_SHAPE = DIPackage.EDGE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cmmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE__CMMN_ELEMENT = DIPackage.EDGE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>CMMN Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE_FEATURE_COUNT = DIPackage.EDGE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>CMMN Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_EDGE_OPERATION_COUNT = DIPackage.EDGE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl <em>CMMN Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNShape()
     * @generated
     */
    int CMMN_SHAPE = 2;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__OWNING_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__OWNED_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__LOCAL_STYLE = JBPMDDPackage.BOUNDARIED_SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__SHARED_STYLE = JBPMDDPackage.BOUNDARIED_SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__MODEL_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__ID = JBPMDDPackage.BOUNDARIED_SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__BOUNDS = JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Boundary Shapes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__BOUNDARY_SHAPES = JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__IS_EXPANDED = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Previous Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__PREVIOUS_WIDTH = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Previous Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__PREVIOUS_HEIGHT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Owned Shape</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__OWNED_SHAPE = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Planning Table Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Cmmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE__CMMN_ELEMENT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>CMMN Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE_FEATURE_COUNT = JBPMDDPackage.BOUNDARIED_SHAPE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>CMMN Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_SHAPE_OPERATION_COUNT = JBPMDDPackage.BOUNDARIED_SHAPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramElementImpl <em>CMMN Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramElementImpl
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNDiagramElement()
     * @generated
     */
    int CMMN_DIAGRAM_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT__OWNING_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT__OWNED_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT__LOCAL_STYLE = DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT__SHARED_STYLE = DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT__MODEL_ELEMENT = DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT__ID = DIPackage.DIAGRAM_ELEMENT__ID;

    /**
     * The number of structural features of the '<em>CMMN Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT_FEATURE_COUNT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>CMMN Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_DIAGRAM_ELEMENT_OPERATION_COUNT = DIPackage.DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNStyleImpl <em>CMMN Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNStyleImpl
     * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNStyle()
     * @generated
     */
    int CMMN_STYLE = 4;

    /**
     * The feature id for the '<em><b>Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FILL = DIPackage.STYLE__FILL;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FILL_COLOR = DIPackage.STYLE__FILL_COLOR;

    /**
     * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FILL_OPACITY = DIPackage.STYLE__FILL_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__STROKE_WIDTH = DIPackage.STYLE__STROKE_WIDTH;

    /**
     * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__STROKE_OPACITY = DIPackage.STYLE__STROKE_OPACITY;

    /**
     * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__STROKE_COLOR = DIPackage.STYLE__STROKE_COLOR;

    /**
     * The feature id for the '<em><b>Stroke Dash Length</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__STROKE_DASH_LENGTH = DIPackage.STYLE__STROKE_DASH_LENGTH;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_SIZE = DIPackage.STYLE__FONT_SIZE;

    /**
     * The feature id for the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_NAME = DIPackage.STYLE__FONT_NAME;

    /**
     * The feature id for the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_COLOR = DIPackage.STYLE__FONT_COLOR;

    /**
     * The feature id for the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_ITALIC = DIPackage.STYLE__FONT_ITALIC;

    /**
     * The feature id for the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_BOLD = DIPackage.STYLE__FONT_BOLD;

    /**
     * The feature id for the '<em><b>Font Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_UNDERLINE = DIPackage.STYLE__FONT_UNDERLINE;

    /**
     * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE__FONT_STRIKE_THROUGH = DIPackage.STYLE__FONT_STRIKE_THROUGH;

    /**
     * The number of structural features of the '<em>CMMN Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Valid font size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid fill opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke width</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid dash length size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Valid stroke opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP;

    /**
     * The number of operations of the '<em>CMMN Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CMMN_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram <em>CMMN Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CMMN Diagram</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDiagram
     * @generated
     */
    EClass getCMMNDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getOwnedCmmnDiagramElement <em>Owned Cmmn Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Cmmn Diagram Element</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getOwnedCmmnDiagramElement()
     * @see #getCMMNDiagram()
     * @generated
     */
    EReference getCMMNDiagram_OwnedCmmnDiagramElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getOwnedCmmnStyles <em>Owned Cmmn Styles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Cmmn Styles</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getOwnedCmmnStyles()
     * @see #getCMMNDiagram()
     * @generated
     */
    EReference getCMMNDiagram_OwnedCmmnStyles();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getCmmnElement <em>Cmmn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Cmmn Element</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getCmmnElement()
     * @see #getCMMNDiagram()
     * @generated
     */
    EReference getCMMNDiagram_CmmnElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge <em>CMMN Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CMMN Edge</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNEdge
     * @generated
     */
    EClass getCMMNEdge();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getSourceShape <em>Source Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Shape</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getSourceShape()
     * @see #getCMMNEdge()
     * @generated
     */
    EReference getCMMNEdge_SourceShape();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getTargetShape <em>Target Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Shape</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getTargetShape()
     * @see #getCMMNEdge()
     * @generated
     */
    EReference getCMMNEdge_TargetShape();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getCmmnElement <em>Cmmn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Cmmn Element</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getCmmnElement()
     * @see #getCMMNEdge()
     * @generated
     */
    EReference getCMMNEdge_CmmnElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape <em>CMMN Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CMMN Shape</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNShape
     * @generated
     */
    EClass getCMMNShape();

    /**
     * Returns the meta object for the containment reference list '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#getOwnedShape <em>Owned Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Shape</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNShape#getOwnedShape()
     * @see #getCMMNShape()
     * @generated
     */
    EReference getCMMNShape_OwnedShape();

    /**
     * Returns the meta object for the attribute '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Planning Table Expanded</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNShape#isIsPlanningTableExpanded()
     * @see #getCMMNShape()
     * @generated
     */
    EAttribute getCMMNShape_IsPlanningTableExpanded();

    /**
     * Returns the meta object for the reference '{@link org.jbpm.cmmn.dd.cmmndi.CMMNShape#getCmmnElement <em>Cmmn Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Cmmn Element</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNShape#getCmmnElement()
     * @see #getCMMNShape()
     * @generated
     */
    EReference getCMMNShape_CmmnElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement <em>CMMN Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CMMN Diagram Element</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement
     * @generated
     */
    EClass getCMMNDiagramElement();

    /**
     * Returns the meta object for class '{@link org.jbpm.cmmn.dd.cmmndi.CMMNStyle <em>CMMN Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CMMN Style</em>'.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNStyle
     * @generated
     */
    EClass getCMMNStyle();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CMMNDIFactory getCMMNDIFactory();

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
         * The meta object literal for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl <em>CMMN Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNDiagram()
         * @generated
         */
        EClass CMMN_DIAGRAM = eINSTANCE.getCMMNDiagram();

        /**
         * The meta object literal for the '<em><b>Owned Cmmn Diagram Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT = eINSTANCE.getCMMNDiagram_OwnedCmmnDiagramElement();

        /**
         * The meta object literal for the '<em><b>Owned Cmmn Styles</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_DIAGRAM__OWNED_CMMN_STYLES = eINSTANCE.getCMMNDiagram_OwnedCmmnStyles();

        /**
         * The meta object literal for the '<em><b>Cmmn Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_DIAGRAM__CMMN_ELEMENT = eINSTANCE.getCMMNDiagram_CmmnElement();

        /**
         * The meta object literal for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl <em>CMMN Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNEdgeImpl
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNEdge()
         * @generated
         */
        EClass CMMN_EDGE = eINSTANCE.getCMMNEdge();

        /**
         * The meta object literal for the '<em><b>Source Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_EDGE__SOURCE_SHAPE = eINSTANCE.getCMMNEdge_SourceShape();

        /**
         * The meta object literal for the '<em><b>Target Shape</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_EDGE__TARGET_SHAPE = eINSTANCE.getCMMNEdge_TargetShape();

        /**
         * The meta object literal for the '<em><b>Cmmn Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_EDGE__CMMN_ELEMENT = eINSTANCE.getCMMNEdge_CmmnElement();

        /**
         * The meta object literal for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl <em>CMMN Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNShapeImpl
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNShape()
         * @generated
         */
        EClass CMMN_SHAPE = eINSTANCE.getCMMNShape();

        /**
         * The meta object literal for the '<em><b>Owned Shape</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_SHAPE__OWNED_SHAPE = eINSTANCE.getCMMNShape_OwnedShape();

        /**
         * The meta object literal for the '<em><b>Is Planning Table Expanded</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED = eINSTANCE.getCMMNShape_IsPlanningTableExpanded();

        /**
         * The meta object literal for the '<em><b>Cmmn Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CMMN_SHAPE__CMMN_ELEMENT = eINSTANCE.getCMMNShape_CmmnElement();

        /**
         * The meta object literal for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramElementImpl <em>CMMN Diagram Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramElementImpl
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNDiagramElement()
         * @generated
         */
        EClass CMMN_DIAGRAM_ELEMENT = eINSTANCE.getCMMNDiagramElement();

        /**
         * The meta object literal for the '{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNStyleImpl <em>CMMN Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNStyleImpl
         * @see org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIPackageImpl#getCMMNStyle()
         * @generated
         */
        EClass CMMN_STYLE = eINSTANCE.getCMMNStyle();

    }

} //CMMNDIPackage
