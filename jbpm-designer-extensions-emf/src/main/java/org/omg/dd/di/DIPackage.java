/**
 */
package org.omg.dd.di;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.omg.dd.di.DIFactory
 * @model kind="package"
 * @generated
 */
public interface DIPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "di";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/DD/20131001/DI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "DI";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DIPackage eINSTANCE = org.omg.dd.di.impl.DIPackageImpl.init();

    /**
     * The meta object id for the '{@link org.omg.dd.di.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.di.impl.DiagramElementImpl
     * @see org.omg.dd.di.impl.DIPackageImpl#getDiagramElement()
     * @generated
     */
    int DIAGRAM_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__OWNING_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__OWNED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__LOCAL_STYLE = 2;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__SHARED_STYLE = 3;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__MODEL_ELEMENT = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT__ID = 5;

    /**
     * The number of structural features of the '<em>Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Diagram Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.dd.di.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.di.impl.EdgeImpl
     * @see org.omg.dd.di.impl.DIPackageImpl#getEdge()
     * @generated
     */
    int EDGE = 1;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__OWNING_ELEMENT = DIAGRAM_ELEMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__OWNED_ELEMENT = DIAGRAM_ELEMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__LOCAL_STYLE = DIAGRAM_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__MODEL_ELEMENT = DIAGRAM_ELEMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__ID = DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__SOURCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__TARGET = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE__WAYPOINT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDGE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.di.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.di.impl.ShapeImpl
     * @see org.omg.dd.di.impl.DIPackageImpl#getShape()
     * @generated
     */
    int SHAPE = 3;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__OWNING_ELEMENT = DIAGRAM_ELEMENT__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__OWNED_ELEMENT = DIAGRAM_ELEMENT__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__LOCAL_STYLE = DIAGRAM_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__MODEL_ELEMENT = DIAGRAM_ELEMENT__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__ID = DIAGRAM_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__BOUNDS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.di.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.di.impl.DiagramImpl
     * @see org.omg.dd.di.impl.DIPackageImpl#getDiagram()
     * @generated
     */
    int DIAGRAM = 2;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__OWNING_ELEMENT = SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__OWNED_ELEMENT = SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__LOCAL_STYLE = SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__SHARED_STYLE = SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__MODEL_ELEMENT = SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__ID = SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__BOUNDS = SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__NAME = SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__DOCUMENTATION = SHAPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__RESOLUTION = SHAPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.di.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.di.impl.StyleImpl
     * @see org.omg.dd.di.impl.DIPackageImpl#getStyle()
     * @generated
     */
    int STYLE = 4;

    /**
     * The feature id for the '<em><b>Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FILL = 0;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FILL_COLOR = 1;

    /**
     * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FILL_OPACITY = 2;

    /**
     * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__STROKE_WIDTH = 3;

    /**
     * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__STROKE_OPACITY = 4;

    /**
     * The feature id for the '<em><b>Stroke Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__STROKE_COLOR = 5;

    /**
     * The feature id for the '<em><b>Stroke Dash Length</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__STROKE_DASH_LENGTH = 6;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_SIZE = 7;

    /**
     * The feature id for the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_NAME = 8;

    /**
     * The feature id for the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_COLOR = 9;

    /**
     * The feature id for the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_ITALIC = 10;

    /**
     * The feature id for the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_BOLD = 11;

    /**
     * The feature id for the '<em><b>Font Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_UNDERLINE = 12;

    /**
     * The feature id for the '<em><b>Font Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__FONT_STRIKE_THROUGH = 13;

    /**
     * The number of structural features of the '<em>Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_FEATURE_COUNT = 14;

    /**
     * The operation id for the '<em>Valid font size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = 0;

    /**
     * The operation id for the '<em>Valid fill opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = 1;

    /**
     * The operation id for the '<em>Valid stroke width</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = 2;

    /**
     * The operation id for the '<em>Valid dash length size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = 3;

    /**
     * The operation id for the '<em>Valid stroke opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = 4;

    /**
     * The number of operations of the '<em>Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_OPERATION_COUNT = 5;


    /**
     * Returns the meta object for class '{@link org.omg.dd.di.DiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Element</em>'.
     * @see org.omg.dd.di.DiagramElement
     * @generated
     */
    EClass getDiagramElement();

    /**
     * Returns the meta object for the reference list '{@link org.omg.dd.di.DiagramElement#getModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Model Element</em>'.
     * @see org.omg.dd.di.DiagramElement#getModelElement()
     * @see #getDiagramElement()
     * @generated
     */
    EReference getDiagramElement_ModelElement();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.DiagramElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.omg.dd.di.DiagramElement#getId()
     * @see #getDiagramElement()
     * @generated
     */
    EAttribute getDiagramElement_Id();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owning Element</em>'.
     * @see org.omg.dd.di.DiagramElement#getOwningElement()
     * @see #getDiagramElement()
     * @generated
     */
    EReference getDiagramElement_OwningElement();

    /**
     * Returns the meta object for the reference list '{@link org.omg.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Owned Element</em>'.
     * @see org.omg.dd.di.DiagramElement#getOwnedElement()
     * @see #getDiagramElement()
     * @generated
     */
    EReference getDiagramElement_OwnedElement();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.di.DiagramElement#getLocalStyle <em>Local Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Style</em>'.
     * @see org.omg.dd.di.DiagramElement#getLocalStyle()
     * @see #getDiagramElement()
     * @generated
     */
    EReference getDiagramElement_LocalStyle();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.di.DiagramElement#getSharedStyle <em>Shared Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Shared Style</em>'.
     * @see org.omg.dd.di.DiagramElement#getSharedStyle()
     * @see #getDiagramElement()
     * @generated
     */
    EReference getDiagramElement_SharedStyle();

    /**
     * Returns the meta object for class '{@link org.omg.dd.di.Edge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Edge</em>'.
     * @see org.omg.dd.di.Edge
     * @generated
     */
    EClass getEdge();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.di.Edge#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.omg.dd.di.Edge#getSource()
     * @see #getEdge()
     * @generated
     */
    EReference getEdge_Source();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.di.Edge#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.omg.dd.di.Edge#getTarget()
     * @see #getEdge()
     * @generated
     */
    EReference getEdge_Target();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.di.Edge#getWaypoint <em>Waypoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Waypoint</em>'.
     * @see org.omg.dd.di.Edge#getWaypoint()
     * @see #getEdge()
     * @generated
     */
    EReference getEdge_Waypoint();

    /**
     * Returns the meta object for class '{@link org.omg.dd.di.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see org.omg.dd.di.Diagram
     * @generated
     */
    EClass getDiagram();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Diagram#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.omg.dd.di.Diagram#getName()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Name();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Diagram#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Documentation</em>'.
     * @see org.omg.dd.di.Diagram#getDocumentation()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Diagram#getResolution <em>Resolution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resolution</em>'.
     * @see org.omg.dd.di.Diagram#getResolution()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Resolution();

    /**
     * Returns the meta object for class '{@link org.omg.dd.di.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shape</em>'.
     * @see org.omg.dd.di.Shape
     * @generated
     */
    EClass getShape();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.di.Shape#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.omg.dd.di.Shape#getBounds()
     * @see #getShape()
     * @generated
     */
    EReference getShape_Bounds();

    /**
     * Returns the meta object for class '{@link org.omg.dd.di.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style</em>'.
     * @see org.omg.dd.di.Style
     * @generated
     */
    EClass getStyle();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.di.Style#getFill <em>Fill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fill</em>'.
     * @see org.omg.dd.di.Style#getFill()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_Fill();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.di.Style#getFillColor <em>Fill Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Fill Color</em>'.
     * @see org.omg.dd.di.Style#getFillColor()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_FillColor();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFillOpacity <em>Fill Opacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fill Opacity</em>'.
     * @see org.omg.dd.di.Style#getFillOpacity()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FillOpacity();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getStrokeWidth <em>Stroke Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stroke Width</em>'.
     * @see org.omg.dd.di.Style#getStrokeWidth()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_StrokeWidth();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getStrokeOpacity <em>Stroke Opacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
     * @see org.omg.dd.di.Style#getStrokeOpacity()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_StrokeOpacity();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.di.Style#getStrokeColor <em>Stroke Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Stroke Color</em>'.
     * @see org.omg.dd.di.Style#getStrokeColor()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_StrokeColor();

    /**
     * Returns the meta object for the attribute list '{@link org.omg.dd.di.Style#getStrokeDashLength <em>Stroke Dash Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Stroke Dash Length</em>'.
     * @see org.omg.dd.di.Style#getStrokeDashLength()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_StrokeDashLength();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFontSize <em>Font Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Size</em>'.
     * @see org.omg.dd.di.Style#getFontSize()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FontSize();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFontName <em>Font Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Name</em>'.
     * @see org.omg.dd.di.Style#getFontName()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FontName();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.di.Style#getFontColor <em>Font Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Font Color</em>'.
     * @see org.omg.dd.di.Style#getFontColor()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_FontColor();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFontItalic <em>Font Italic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Italic</em>'.
     * @see org.omg.dd.di.Style#getFontItalic()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FontItalic();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFontBold <em>Font Bold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Bold</em>'.
     * @see org.omg.dd.di.Style#getFontBold()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FontBold();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFontUnderline <em>Font Underline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Underline</em>'.
     * @see org.omg.dd.di.Style#getFontUnderline()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FontUnderline();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.di.Style#getFontStrikeThrough <em>Font Strike Through</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Strike Through</em>'.
     * @see org.omg.dd.di.Style#getFontStrikeThrough()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_FontStrikeThrough();

    /**
     * Returns the meta object for the '{@link org.omg.dd.di.Style#valid_font_size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid font size</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid font size</em>' operation.
     * @see org.omg.dd.di.Style#valid_font_size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getStyle__Valid_font_size__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.di.Style#valid_fill_opacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid fill opacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid fill opacity</em>' operation.
     * @see org.omg.dd.di.Style#valid_fill_opacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getStyle__Valid_fill_opacity__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.di.Style#valid_stroke_width(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid stroke width</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid stroke width</em>' operation.
     * @see org.omg.dd.di.Style#valid_stroke_width(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getStyle__Valid_stroke_width__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.di.Style#valid_dash_length_size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid dash length size</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid dash length size</em>' operation.
     * @see org.omg.dd.di.Style#valid_dash_length_size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getStyle__Valid_dash_length_size__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.di.Style#valid_stroke_opacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid stroke opacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid stroke opacity</em>' operation.
     * @see org.omg.dd.di.Style#valid_stroke_opacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getStyle__Valid_stroke_opacity__DiagnosticChain_Map();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DIFactory getDIFactory();

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
         * The meta object literal for the '{@link org.omg.dd.di.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.di.impl.DiagramElementImpl
         * @see org.omg.dd.di.impl.DIPackageImpl#getDiagramElement()
         * @generated
         */
        EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

        /**
         * The meta object literal for the '<em><b>Model Element</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENT__MODEL_ELEMENT = eINSTANCE.getDiagramElement_ModelElement();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT__ID = eINSTANCE.getDiagramElement_Id();

        /**
         * The meta object literal for the '<em><b>Owning Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENT__OWNING_ELEMENT = eINSTANCE.getDiagramElement_OwningElement();

        /**
         * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENT__OWNED_ELEMENT = eINSTANCE.getDiagramElement_OwnedElement();

        /**
         * The meta object literal for the '<em><b>Local Style</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENT__LOCAL_STYLE = eINSTANCE.getDiagramElement_LocalStyle();

        /**
         * The meta object literal for the '<em><b>Shared Style</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENT__SHARED_STYLE = eINSTANCE.getDiagramElement_SharedStyle();

        /**
         * The meta object literal for the '{@link org.omg.dd.di.impl.EdgeImpl <em>Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.di.impl.EdgeImpl
         * @see org.omg.dd.di.impl.DIPackageImpl#getEdge()
         * @generated
         */
        EClass EDGE = eINSTANCE.getEdge();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

        /**
         * The meta object literal for the '<em><b>Waypoint</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EDGE__WAYPOINT = eINSTANCE.getEdge_Waypoint();

        /**
         * The meta object literal for the '{@link org.omg.dd.di.impl.DiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.di.impl.DiagramImpl
         * @see org.omg.dd.di.impl.DIPackageImpl#getDiagram()
         * @generated
         */
        EClass DIAGRAM = eINSTANCE.getDiagram();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__DOCUMENTATION = eINSTANCE.getDiagram_Documentation();

        /**
         * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__RESOLUTION = eINSTANCE.getDiagram_Resolution();

        /**
         * The meta object literal for the '{@link org.omg.dd.di.impl.ShapeImpl <em>Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.di.impl.ShapeImpl
         * @see org.omg.dd.di.impl.DIPackageImpl#getShape()
         * @generated
         */
        EClass SHAPE = eINSTANCE.getShape();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHAPE__BOUNDS = eINSTANCE.getShape_Bounds();

        /**
         * The meta object literal for the '{@link org.omg.dd.di.impl.StyleImpl <em>Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.di.impl.StyleImpl
         * @see org.omg.dd.di.impl.DIPackageImpl#getStyle()
         * @generated
         */
        EClass STYLE = eINSTANCE.getStyle();

        /**
         * The meta object literal for the '<em><b>Fill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__FILL = eINSTANCE.getStyle_Fill();

        /**
         * The meta object literal for the '<em><b>Fill Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__FILL_COLOR = eINSTANCE.getStyle_FillColor();

        /**
         * The meta object literal for the '<em><b>Fill Opacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FILL_OPACITY = eINSTANCE.getStyle_FillOpacity();

        /**
         * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__STROKE_WIDTH = eINSTANCE.getStyle_StrokeWidth();

        /**
         * The meta object literal for the '<em><b>Stroke Opacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__STROKE_OPACITY = eINSTANCE.getStyle_StrokeOpacity();

        /**
         * The meta object literal for the '<em><b>Stroke Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__STROKE_COLOR = eINSTANCE.getStyle_StrokeColor();

        /**
         * The meta object literal for the '<em><b>Stroke Dash Length</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__STROKE_DASH_LENGTH = eINSTANCE.getStyle_StrokeDashLength();

        /**
         * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FONT_SIZE = eINSTANCE.getStyle_FontSize();

        /**
         * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FONT_NAME = eINSTANCE.getStyle_FontName();

        /**
         * The meta object literal for the '<em><b>Font Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__FONT_COLOR = eINSTANCE.getStyle_FontColor();

        /**
         * The meta object literal for the '<em><b>Font Italic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FONT_ITALIC = eINSTANCE.getStyle_FontItalic();

        /**
         * The meta object literal for the '<em><b>Font Bold</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FONT_BOLD = eINSTANCE.getStyle_FontBold();

        /**
         * The meta object literal for the '<em><b>Font Underline</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FONT_UNDERLINE = eINSTANCE.getStyle_FontUnderline();

        /**
         * The meta object literal for the '<em><b>Font Strike Through</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__FONT_STRIKE_THROUGH = eINSTANCE.getStyle_FontStrikeThrough();

        /**
         * The meta object literal for the '<em><b>Valid font size</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStyle__Valid_font_size__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid fill opacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStyle__Valid_fill_opacity__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid stroke width</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStyle__Valid_stroke_width__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid dash length size</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStyle__Valid_dash_length_size__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid stroke opacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStyle__Valid_stroke_opacity__DiagnosticChain_Map();

    }

} //DIPackage
