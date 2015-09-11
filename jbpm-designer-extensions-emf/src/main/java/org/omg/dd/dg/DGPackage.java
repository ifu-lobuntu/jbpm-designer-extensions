/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.ecore.*;

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
 * @see org.omg.dd.dg.DGFactory
 * @model kind="package"
 * @generated
 */
public interface DGPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dg";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/DD/20131001/DG";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "DG";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DGPackage eINSTANCE = org.omg.dd.dg.impl.DGPackageImpl.init();

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.FillImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getFill()
     * @generated
     */
    int FILL = 2;

    /**
     * The feature id for the '<em><b>Canvas</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILL__CANVAS = 0;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILL__TRANSFORM = 1;

    /**
     * The number of structural features of the '<em>Fill</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILL_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Fill</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.GradientImpl <em>Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.GradientImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getGradient()
     * @generated
     */
    int GRADIENT = 1;

    /**
     * The feature id for the '<em><b>Canvas</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT__CANVAS = FILL__CANVAS;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT__TRANSFORM = FILL__TRANSFORM;

    /**
     * The feature id for the '<em><b>Stop</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT__STOP = FILL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_FEATURE_COUNT = FILL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_OPERATION_COUNT = FILL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.RadialGradientImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getRadialGradient()
     * @generated
     */
    int RADIAL_GRADIENT = 0;

    /**
     * The feature id for the '<em><b>Canvas</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__CANVAS = GRADIENT__CANVAS;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__TRANSFORM = GRADIENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Stop</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__STOP = GRADIENT__STOP;

    /**
     * The feature id for the '<em><b>Center X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__CENTER_X = GRADIENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Center Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__CENTER_Y = GRADIENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__RADIUS = GRADIENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Focus X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__FOCUS_X = GRADIENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Focus Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT__FOCUS_Y = GRADIENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Radial Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT_FEATURE_COUNT = GRADIENT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Valid center point</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Valid focus point</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Valid radius</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Radial Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RADIAL_GRADIENT_OPERATION_COUNT = GRADIENT_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.GraphicalElementImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getGraphicalElement()
     * @generated
     */
    int GRAPHICAL_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT__GROUP = 0;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT__LOCAL_STYLE = 1;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT__SHARED_STYLE = 2;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT__TRANSFORM = 3;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT__CLIP_PATH = 4;

    /**
     * The number of structural features of the '<em>Graphical Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Graphical Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPHICAL_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.GroupImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getGroup()
     * @generated
     */
    int GROUP = 4;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Member</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__MEMBER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.CanvasImpl <em>Canvas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.CanvasImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getCanvas()
     * @generated
     */
    int CANVAS = 3;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__GROUP = GROUP__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__LOCAL_STYLE = GROUP__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__SHARED_STYLE = GROUP__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__TRANSFORM = GROUP__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__CLIP_PATH = GROUP__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Member</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__MEMBER = GROUP__MEMBER;

    /**
     * The feature id for the '<em><b>Background Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__BACKGROUND_FILL = GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Background Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__BACKGROUND_COLOR = GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Packaged Marker</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__PACKAGED_MARKER = GROUP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Packaged Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__PACKAGED_STYLE = GROUP_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Packaged Fill</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS__PACKAGED_FILL = GROUP_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Canvas</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS_FEATURE_COUNT = GROUP_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Canvas</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANVAS_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.TransformImpl <em>Transform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.TransformImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getTransform()
     * @generated
     */
    int TRANSFORM = 6;

    /**
     * The number of structural features of the '<em>Transform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Transform</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.ClipPathImpl <em>Clip Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.ClipPathImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getClipPath()
     * @generated
     */
    int CLIP_PATH = 7;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__GROUP = GROUP__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__LOCAL_STYLE = GROUP__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__SHARED_STYLE = GROUP__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__TRANSFORM = GROUP__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__CLIP_PATH = GROUP__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Member</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__MEMBER = GROUP__MEMBER;

    /**
     * The feature id for the '<em><b>Clipped Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH__CLIPPED_ELEMENT = GROUP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Clip Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Clip Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIP_PATH_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.MarkerImpl <em>Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.MarkerImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getMarker()
     * @generated
     */
    int MARKER = 8;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__GROUP = GROUP__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__LOCAL_STYLE = GROUP__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__SHARED_STYLE = GROUP__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__TRANSFORM = GROUP__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__CLIP_PATH = GROUP__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Member</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__MEMBER = GROUP__MEMBER;

    /**
     * The feature id for the '<em><b>Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__SIZE = GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__REFERENCE = GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Canvas</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__CANVAS = GROUP_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_FEATURE_COUNT = GROUP_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.GradientStopImpl <em>Gradient Stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.GradientStopImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getGradientStop()
     * @generated
     */
    int GRADIENT_STOP = 9;

    /**
     * The feature id for the '<em><b>Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP__COLOR = 0;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP__OFFSET = 1;

    /**
     * The feature id for the '<em><b>Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP__OPACITY = 2;

    /**
     * The number of structural features of the '<em>Gradient Stop</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP_FEATURE_COUNT = 3;

    /**
     * The operation id for the '<em>Valid offset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP = 0;

    /**
     * The operation id for the '<em>Valid opacity</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP = 1;

    /**
     * The number of operations of the '<em>Gradient Stop</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_STOP_OPERATION_COUNT = 2;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.PatternImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 10;

    /**
     * The feature id for the '<em><b>Canvas</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__CANVAS = FILL__CANVAS;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__TRANSFORM = FILL__TRANSFORM;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__BOUNDS = FILL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Tile</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__TILE = FILL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_FEATURE_COUNT = FILL_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_OPERATION_COUNT = FILL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.LinearGradientImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getLinearGradient()
     * @generated
     */
    int LINEAR_GRADIENT = 11;

    /**
     * The feature id for the '<em><b>Canvas</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__CANVAS = GRADIENT__CANVAS;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__TRANSFORM = GRADIENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Stop</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__STOP = GRADIENT__STOP;

    /**
     * The feature id for the '<em><b>X1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__X1 = GRADIENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>X2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__X2 = GRADIENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Y1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__Y1 = GRADIENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Y2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT__Y2 = GRADIENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Linear Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT_FEATURE_COUNT = GRADIENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Valid gradient vector</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Linear Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINEAR_GRADIENT_OPERATION_COUNT = GRADIENT_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.MarkedElementImpl <em>Marked Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.MarkedElementImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getMarkedElement()
     * @generated
     */
    int MARKED_ELEMENT = 12;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Start Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__START_MARKER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__END_MARKER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mid Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT__MID_MARKER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Marked Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Marked Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKED_ELEMENT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.RectangleImpl <em>Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.RectangleImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getRectangle()
     * @generated
     */
    int RECTANGLE = 13;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__BOUNDS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Corner Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE__CORNER_RADIUS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Rectangle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Rectangle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECTANGLE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.EllipseImpl <em>Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.EllipseImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getEllipse()
     * @generated
     */
    int ELLIPSE = 14;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Center</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__CENTER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Radii</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE__RADII = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Ellipse</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Ellipse</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.TextImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getText()
     * @generated
     */
    int TEXT = 15;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__DATA = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__BOUNDS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Alignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__ALIGNMENT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.LineImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getLine()
     * @generated
     */
    int LINE = 16;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__GROUP = MARKED_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__LOCAL_STYLE = MARKED_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__SHARED_STYLE = MARKED_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Start Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__START_MARKER = MARKED_ELEMENT__START_MARKER;

    /**
     * The feature id for the '<em><b>End Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__END_MARKER = MARKED_ELEMENT__END_MARKER;

    /**
     * The feature id for the '<em><b>Mid Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

    /**
     * The feature id for the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__START = MARKED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__END = MARKED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Line</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Line</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.PolylineImpl <em>Polyline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.PolylineImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getPolyline()
     * @generated
     */
    int POLYLINE = 17;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__GROUP = MARKED_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__LOCAL_STYLE = MARKED_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__SHARED_STYLE = MARKED_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Start Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__START_MARKER = MARKED_ELEMENT__START_MARKER;

    /**
     * The feature id for the '<em><b>End Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__END_MARKER = MARKED_ELEMENT__END_MARKER;

    /**
     * The feature id for the '<em><b>Mid Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE__POINT = MARKED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Polyline</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Polyline</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYLINE_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.PolygonImpl <em>Polygon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.PolygonImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getPolygon()
     * @generated
     */
    int POLYGON = 18;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__GROUP = MARKED_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__LOCAL_STYLE = MARKED_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__SHARED_STYLE = MARKED_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Start Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__START_MARKER = MARKED_ELEMENT__START_MARKER;

    /**
     * The feature id for the '<em><b>End Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__END_MARKER = MARKED_ELEMENT__END_MARKER;

    /**
     * The feature id for the '<em><b>Mid Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON__POINT = MARKED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Polygon</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Polygon</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLYGON_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.PathImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getPath()
     * @generated
     */
    int PATH = 19;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__GROUP = MARKED_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__LOCAL_STYLE = MARKED_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__SHARED_STYLE = MARKED_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Start Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__START_MARKER = MARKED_ELEMENT__START_MARKER;

    /**
     * The feature id for the '<em><b>End Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__END_MARKER = MARKED_ELEMENT__END_MARKER;

    /**
     * The feature id for the '<em><b>Mid Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

    /**
     * The feature id for the '<em><b>Command</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH__COMMAND = MARKED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.PathCommandImpl <em>Path Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.PathCommandImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getPathCommand()
     * @generated
     */
    int PATH_COMMAND = 20;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_COMMAND__IS_RELATIVE = 0;

    /**
     * The number of structural features of the '<em>Path Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_COMMAND_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Path Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATH_COMMAND_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.TranslateImpl <em>Translate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.TranslateImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getTranslate()
     * @generated
     */
    int TRANSLATE = 21;

    /**
     * The feature id for the '<em><b>Delta X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSLATE__DELTA_X = TRANSFORM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delta Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSLATE__DELTA_Y = TRANSFORM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Translate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSLATE_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Translate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSLATE_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.ScaleImpl <em>Scale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.ScaleImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getScale()
     * @generated
     */
    int SCALE = 22;

    /**
     * The feature id for the '<em><b>Factor X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALE__FACTOR_X = TRANSFORM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Factor Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALE__FACTOR_Y = TRANSFORM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Scale</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALE_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Nonnegativescale</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP = TRANSFORM_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Scale</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALE_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.RotateImpl <em>Rotate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.RotateImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getRotate()
     * @generated
     */
    int ROTATE = 23;

    /**
     * The feature id for the '<em><b>Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__ANGLE = TRANSFORM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Center</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__CENTER = TRANSFORM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Rotate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Rotate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.SkewImpl <em>Skew</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.SkewImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getSkew()
     * @generated
     */
    int SKEW = 24;

    /**
     * The feature id for the '<em><b>Angle X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKEW__ANGLE_X = TRANSFORM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Angle Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKEW__ANGLE_Y = TRANSFORM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Skew</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKEW_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Skew</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKEW_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.ImageImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getImage()
     * @generated
     */
    int IMAGE = 25;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__SOURCE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__BOUNDS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Aspect Ratio Preserved</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE__IS_ASPECT_RATIO_PRESERVED = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Image</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Image</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMAGE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.CircleImpl <em>Circle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.CircleImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getCircle()
     * @generated
     */
    int CIRCLE = 26;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__GROUP = GRAPHICAL_ELEMENT__GROUP;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__LOCAL_STYLE = GRAPHICAL_ELEMENT__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__SHARED_STYLE = GRAPHICAL_ELEMENT__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Transform</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

    /**
     * The feature id for the '<em><b>Clip Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

    /**
     * The feature id for the '<em><b>Center</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__CENTER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE__RADIUS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Circle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Non negative radius</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE___NON_NEGATIVE_RADIUS__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Circle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CIRCLE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.MatrixImpl <em>Matrix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.MatrixImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getMatrix()
     * @generated
     */
    int MATRIX = 27;

    /**
     * The feature id for the '<em><b>A</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX__A = TRANSFORM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>B</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX__B = TRANSFORM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>C</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX__C = TRANSFORM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>D</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX__D = TRANSFORM_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>E</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX__E = TRANSFORM_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>F</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX__F = TRANSFORM_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Matrix</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Matrix</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATRIX_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.MoveToImpl <em>Move To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.MoveToImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getMoveTo()
     * @generated
     */
    int MOVE_TO = 28;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Move To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Move To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.LineToImpl <em>Line To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.LineToImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getLineTo()
     * @generated
     */
    int LINE_TO = 29;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Line To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Line To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.CubicCurveToImpl <em>Cubic Curve To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.CubicCurveToImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getCubicCurveTo()
     * @generated
     */
    int CUBIC_CURVE_TO = 30;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUBIC_CURVE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUBIC_CURVE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Start Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUBIC_CURVE_TO__START_CONTROL = PATH_COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>End Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUBIC_CURVE_TO__END_CONTROL = PATH_COMMAND_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Cubic Curve To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUBIC_CURVE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Cubic Curve To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUBIC_CURVE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.QuadraticCurveToImpl <em>Quadratic Curve To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.QuadraticCurveToImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getQuadraticCurveTo()
     * @generated
     */
    int QUADRATIC_CURVE_TO = 31;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUADRATIC_CURVE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUADRATIC_CURVE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUADRATIC_CURVE_TO__CONTROL = PATH_COMMAND_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Quadratic Curve To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUADRATIC_CURVE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Quadratic Curve To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUADRATIC_CURVE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.EllipticalArcToImpl <em>Elliptical Arc To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.EllipticalArcToImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getEllipticalArcTo()
     * @generated
     */
    int ELLIPTICAL_ARC_TO = 32;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Radii</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO__RADII = PATH_COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rotation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO__ROTATION = PATH_COMMAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Large Arc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO__IS_LARGE_ARC = PATH_COMMAND_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Sweep</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO__IS_SWEEP = PATH_COMMAND_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Elliptical Arc To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Elliptical Arc To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPTICAL_ARC_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dg.impl.ClosePathImpl <em>Close Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dg.impl.ClosePathImpl
     * @see org.omg.dd.dg.impl.DGPackageImpl#getClosePath()
     * @generated
     */
    int CLOSE_PATH = 33;

    /**
     * The feature id for the '<em><b>Is Relative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOSE_PATH__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

    /**
     * The number of structural features of the '<em>Close Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOSE_PATH_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Close Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLOSE_PATH_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.RadialGradient <em>Radial Gradient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Radial Gradient</em>'.
     * @see org.omg.dd.dg.RadialGradient
     * @generated
     */
    EClass getRadialGradient();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.RadialGradient#getCenterX <em>Center X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Center X</em>'.
     * @see org.omg.dd.dg.RadialGradient#getCenterX()
     * @see #getRadialGradient()
     * @generated
     */
    EAttribute getRadialGradient_CenterX();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.RadialGradient#getCenterY <em>Center Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Center Y</em>'.
     * @see org.omg.dd.dg.RadialGradient#getCenterY()
     * @see #getRadialGradient()
     * @generated
     */
    EAttribute getRadialGradient_CenterY();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.RadialGradient#getRadius <em>Radius</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Radius</em>'.
     * @see org.omg.dd.dg.RadialGradient#getRadius()
     * @see #getRadialGradient()
     * @generated
     */
    EAttribute getRadialGradient_Radius();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.RadialGradient#getFocusX <em>Focus X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Focus X</em>'.
     * @see org.omg.dd.dg.RadialGradient#getFocusX()
     * @see #getRadialGradient()
     * @generated
     */
    EAttribute getRadialGradient_FocusX();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.RadialGradient#getFocusY <em>Focus Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Focus Y</em>'.
     * @see org.omg.dd.dg.RadialGradient#getFocusY()
     * @see #getRadialGradient()
     * @generated
     */
    EAttribute getRadialGradient_FocusY();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.RadialGradient#valid_center_point(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid center point</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid center point</em>' operation.
     * @see org.omg.dd.dg.RadialGradient#valid_center_point(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getRadialGradient__Valid_center_point__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.RadialGradient#valid_focus_point(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid focus point</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid focus point</em>' operation.
     * @see org.omg.dd.dg.RadialGradient#valid_focus_point(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getRadialGradient__Valid_focus_point__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.RadialGradient#valid_radius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid radius</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid radius</em>' operation.
     * @see org.omg.dd.dg.RadialGradient#valid_radius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getRadialGradient__Valid_radius__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Gradient <em>Gradient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gradient</em>'.
     * @see org.omg.dd.dg.Gradient
     * @generated
     */
    EClass getGradient();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Gradient#getStop <em>Stop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stop</em>'.
     * @see org.omg.dd.dg.Gradient#getStop()
     * @see #getGradient()
     * @generated
     */
    EReference getGradient_Stop();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Fill <em>Fill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Fill</em>'.
     * @see org.omg.dd.dg.Fill
     * @generated
     */
    EClass getFill();

    /**
     * Returns the meta object for the container reference '{@link org.omg.dd.dg.Fill#getCanvas <em>Canvas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Canvas</em>'.
     * @see org.omg.dd.dg.Fill#getCanvas()
     * @see #getFill()
     * @generated
     */
    EReference getFill_Canvas();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Fill#getTransform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transform</em>'.
     * @see org.omg.dd.dg.Fill#getTransform()
     * @see #getFill()
     * @generated
     */
    EReference getFill_Transform();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Canvas <em>Canvas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Canvas</em>'.
     * @see org.omg.dd.dg.Canvas
     * @generated
     */
    EClass getCanvas();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.dg.Canvas#getBackgroundFill <em>Background Fill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Background Fill</em>'.
     * @see org.omg.dd.dg.Canvas#getBackgroundFill()
     * @see #getCanvas()
     * @generated
     */
    EReference getCanvas_BackgroundFill();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Canvas#getBackgroundColor <em>Background Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Background Color</em>'.
     * @see org.omg.dd.dg.Canvas#getBackgroundColor()
     * @see #getCanvas()
     * @generated
     */
    EReference getCanvas_BackgroundColor();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Canvas#getPackagedMarker <em>Packaged Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Marker</em>'.
     * @see org.omg.dd.dg.Canvas#getPackagedMarker()
     * @see #getCanvas()
     * @generated
     */
    EReference getCanvas_PackagedMarker();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Canvas#getPackagedStyle <em>Packaged Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Style</em>'.
     * @see org.omg.dd.dg.Canvas#getPackagedStyle()
     * @see #getCanvas()
     * @generated
     */
    EReference getCanvas_PackagedStyle();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Canvas#getPackagedFill <em>Packaged Fill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Fill</em>'.
     * @see org.omg.dd.dg.Canvas#getPackagedFill()
     * @see #getCanvas()
     * @generated
     */
    EReference getCanvas_PackagedFill();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group</em>'.
     * @see org.omg.dd.dg.Group
     * @generated
     */
    EClass getGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Group#getMember <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member</em>'.
     * @see org.omg.dd.dg.Group#getMember()
     * @see #getGroup()
     * @generated
     */
    EReference getGroup_Member();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.GraphicalElement <em>Graphical Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Graphical Element</em>'.
     * @see org.omg.dd.dg.GraphicalElement
     * @generated
     */
    EClass getGraphicalElement();

    /**
     * Returns the meta object for the container reference '{@link org.omg.dd.dg.GraphicalElement#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Group</em>'.
     * @see org.omg.dd.dg.GraphicalElement#getGroup()
     * @see #getGraphicalElement()
     * @generated
     */
    EReference getGraphicalElement_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.GraphicalElement#getLocalStyle <em>Local Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Local Style</em>'.
     * @see org.omg.dd.dg.GraphicalElement#getLocalStyle()
     * @see #getGraphicalElement()
     * @generated
     */
    EReference getGraphicalElement_LocalStyle();

    /**
     * Returns the meta object for the reference list '{@link org.omg.dd.dg.GraphicalElement#getSharedStyle <em>Shared Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Shared Style</em>'.
     * @see org.omg.dd.dg.GraphicalElement#getSharedStyle()
     * @see #getGraphicalElement()
     * @generated
     */
    EReference getGraphicalElement_SharedStyle();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.GraphicalElement#getTransform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transform</em>'.
     * @see org.omg.dd.dg.GraphicalElement#getTransform()
     * @see #getGraphicalElement()
     * @generated
     */
    EReference getGraphicalElement_Transform();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.GraphicalElement#getClipPath <em>Clip Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Clip Path</em>'.
     * @see org.omg.dd.dg.GraphicalElement#getClipPath()
     * @see #getGraphicalElement()
     * @generated
     */
    EReference getGraphicalElement_ClipPath();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Transform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transform</em>'.
     * @see org.omg.dd.dg.Transform
     * @generated
     */
    EClass getTransform();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.ClipPath <em>Clip Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Clip Path</em>'.
     * @see org.omg.dd.dg.ClipPath
     * @generated
     */
    EClass getClipPath();

    /**
     * Returns the meta object for the container reference '{@link org.omg.dd.dg.ClipPath#getClippedElement <em>Clipped Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Clipped Element</em>'.
     * @see org.omg.dd.dg.ClipPath#getClippedElement()
     * @see #getClipPath()
     * @generated
     */
    EReference getClipPath_ClippedElement();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Marker <em>Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Marker</em>'.
     * @see org.omg.dd.dg.Marker
     * @generated
     */
    EClass getMarker();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Marker#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Size</em>'.
     * @see org.omg.dd.dg.Marker#getSize()
     * @see #getMarker()
     * @generated
     */
    EReference getMarker_Size();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Marker#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Reference</em>'.
     * @see org.omg.dd.dg.Marker#getReference()
     * @see #getMarker()
     * @generated
     */
    EReference getMarker_Reference();

    /**
     * Returns the meta object for the container reference '{@link org.omg.dd.dg.Marker#getCanvas <em>Canvas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Canvas</em>'.
     * @see org.omg.dd.dg.Marker#getCanvas()
     * @see #getMarker()
     * @generated
     */
    EReference getMarker_Canvas();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.GradientStop <em>Gradient Stop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gradient Stop</em>'.
     * @see org.omg.dd.dg.GradientStop
     * @generated
     */
    EClass getGradientStop();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.GradientStop#getColor <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Color</em>'.
     * @see org.omg.dd.dg.GradientStop#getColor()
     * @see #getGradientStop()
     * @generated
     */
    EReference getGradientStop_Color();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.GradientStop#getOffset <em>Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset</em>'.
     * @see org.omg.dd.dg.GradientStop#getOffset()
     * @see #getGradientStop()
     * @generated
     */
    EAttribute getGradientStop_Offset();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.GradientStop#getOpacity <em>Opacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Opacity</em>'.
     * @see org.omg.dd.dg.GradientStop#getOpacity()
     * @see #getGradientStop()
     * @generated
     */
    EAttribute getGradientStop_Opacity();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.GradientStop#valid_offset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid offset</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid offset</em>' operation.
     * @see org.omg.dd.dg.GradientStop#valid_offset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getGradientStop__Valid_offset__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.GradientStop#valid_opacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid opacity</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid opacity</em>' operation.
     * @see org.omg.dd.dg.GradientStop#valid_opacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getGradientStop__Valid_opacity__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern</em>'.
     * @see org.omg.dd.dg.Pattern
     * @generated
     */
    EClass getPattern();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Pattern#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.omg.dd.dg.Pattern#getBounds()
     * @see #getPattern()
     * @generated
     */
    EReference getPattern_Bounds();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Pattern#getTile <em>Tile</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Tile</em>'.
     * @see org.omg.dd.dg.Pattern#getTile()
     * @see #getPattern()
     * @generated
     */
    EReference getPattern_Tile();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.LinearGradient <em>Linear Gradient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linear Gradient</em>'.
     * @see org.omg.dd.dg.LinearGradient
     * @generated
     */
    EClass getLinearGradient();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.LinearGradient#getX1 <em>X1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X1</em>'.
     * @see org.omg.dd.dg.LinearGradient#getX1()
     * @see #getLinearGradient()
     * @generated
     */
    EAttribute getLinearGradient_X1();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.LinearGradient#getX2 <em>X2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X2</em>'.
     * @see org.omg.dd.dg.LinearGradient#getX2()
     * @see #getLinearGradient()
     * @generated
     */
    EAttribute getLinearGradient_X2();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.LinearGradient#getY1 <em>Y1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y1</em>'.
     * @see org.omg.dd.dg.LinearGradient#getY1()
     * @see #getLinearGradient()
     * @generated
     */
    EAttribute getLinearGradient_Y1();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.LinearGradient#getY2 <em>Y2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y2</em>'.
     * @see org.omg.dd.dg.LinearGradient#getY2()
     * @see #getLinearGradient()
     * @generated
     */
    EAttribute getLinearGradient_Y2();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.LinearGradient#valid_gradient_vector(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid gradient vector</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid gradient vector</em>' operation.
     * @see org.omg.dd.dg.LinearGradient#valid_gradient_vector(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getLinearGradient__Valid_gradient_vector__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.MarkedElement <em>Marked Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Marked Element</em>'.
     * @see org.omg.dd.dg.MarkedElement
     * @generated
     */
    EClass getMarkedElement();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.dg.MarkedElement#getStartMarker <em>Start Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Start Marker</em>'.
     * @see org.omg.dd.dg.MarkedElement#getStartMarker()
     * @see #getMarkedElement()
     * @generated
     */
    EReference getMarkedElement_StartMarker();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.dg.MarkedElement#getEndMarker <em>End Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>End Marker</em>'.
     * @see org.omg.dd.dg.MarkedElement#getEndMarker()
     * @see #getMarkedElement()
     * @generated
     */
    EReference getMarkedElement_EndMarker();

    /**
     * Returns the meta object for the reference '{@link org.omg.dd.dg.MarkedElement#getMidMarker <em>Mid Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Mid Marker</em>'.
     * @see org.omg.dd.dg.MarkedElement#getMidMarker()
     * @see #getMarkedElement()
     * @generated
     */
    EReference getMarkedElement_MidMarker();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Rectangle <em>Rectangle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rectangle</em>'.
     * @see org.omg.dd.dg.Rectangle
     * @generated
     */
    EClass getRectangle();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Rectangle#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.omg.dd.dg.Rectangle#getBounds()
     * @see #getRectangle()
     * @generated
     */
    EReference getRectangle_Bounds();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Rectangle#getCornerRadius <em>Corner Radius</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Corner Radius</em>'.
     * @see org.omg.dd.dg.Rectangle#getCornerRadius()
     * @see #getRectangle()
     * @generated
     */
    EAttribute getRectangle_CornerRadius();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Ellipse <em>Ellipse</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ellipse</em>'.
     * @see org.omg.dd.dg.Ellipse
     * @generated
     */
    EClass getEllipse();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Ellipse#getCenter <em>Center</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Center</em>'.
     * @see org.omg.dd.dg.Ellipse#getCenter()
     * @see #getEllipse()
     * @generated
     */
    EReference getEllipse_Center();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Ellipse#getRadii <em>Radii</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Radii</em>'.
     * @see org.omg.dd.dg.Ellipse#getRadii()
     * @see #getEllipse()
     * @generated
     */
    EReference getEllipse_Radii();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text</em>'.
     * @see org.omg.dd.dg.Text
     * @generated
     */
    EClass getText();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Text#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see org.omg.dd.dg.Text#getData()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Data();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Text#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.omg.dd.dg.Text#getBounds()
     * @see #getText()
     * @generated
     */
    EReference getText_Bounds();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Text#getAlignment <em>Alignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alignment</em>'.
     * @see org.omg.dd.dg.Text#getAlignment()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Alignment();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Line <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Line</em>'.
     * @see org.omg.dd.dg.Line
     * @generated
     */
    EClass getLine();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Line#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start</em>'.
     * @see org.omg.dd.dg.Line#getStart()
     * @see #getLine()
     * @generated
     */
    EReference getLine_Start();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Line#getEnd <em>End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End</em>'.
     * @see org.omg.dd.dg.Line#getEnd()
     * @see #getLine()
     * @generated
     */
    EReference getLine_End();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Polyline <em>Polyline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Polyline</em>'.
     * @see org.omg.dd.dg.Polyline
     * @generated
     */
    EClass getPolyline();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Polyline#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Point</em>'.
     * @see org.omg.dd.dg.Polyline#getPoint()
     * @see #getPolyline()
     * @generated
     */
    EReference getPolyline_Point();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Polygon <em>Polygon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Polygon</em>'.
     * @see org.omg.dd.dg.Polygon
     * @generated
     */
    EClass getPolygon();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Polygon#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Point</em>'.
     * @see org.omg.dd.dg.Polygon#getPoint()
     * @see #getPolygon()
     * @generated
     */
    EReference getPolygon_Point();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Path <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Path</em>'.
     * @see org.omg.dd.dg.Path
     * @generated
     */
    EClass getPath();

    /**
     * Returns the meta object for the containment reference list '{@link org.omg.dd.dg.Path#getCommand <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Command</em>'.
     * @see org.omg.dd.dg.Path#getCommand()
     * @see #getPath()
     * @generated
     */
    EReference getPath_Command();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.PathCommand <em>Path Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Path Command</em>'.
     * @see org.omg.dd.dg.PathCommand
     * @generated
     */
    EClass getPathCommand();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.PathCommand#getIsRelative <em>Is Relative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Relative</em>'.
     * @see org.omg.dd.dg.PathCommand#getIsRelative()
     * @see #getPathCommand()
     * @generated
     */
    EAttribute getPathCommand_IsRelative();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Translate <em>Translate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Translate</em>'.
     * @see org.omg.dd.dg.Translate
     * @generated
     */
    EClass getTranslate();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Translate#getDeltaX <em>Delta X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delta X</em>'.
     * @see org.omg.dd.dg.Translate#getDeltaX()
     * @see #getTranslate()
     * @generated
     */
    EAttribute getTranslate_DeltaX();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Translate#getDeltaY <em>Delta Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delta Y</em>'.
     * @see org.omg.dd.dg.Translate#getDeltaY()
     * @see #getTranslate()
     * @generated
     */
    EAttribute getTranslate_DeltaY();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Scale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scale</em>'.
     * @see org.omg.dd.dg.Scale
     * @generated
     */
    EClass getScale();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Scale#getFactorX <em>Factor X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Factor X</em>'.
     * @see org.omg.dd.dg.Scale#getFactorX()
     * @see #getScale()
     * @generated
     */
    EAttribute getScale_FactorX();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Scale#getFactorY <em>Factor Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Factor Y</em>'.
     * @see org.omg.dd.dg.Scale#getFactorY()
     * @see #getScale()
     * @generated
     */
    EAttribute getScale_FactorY();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.Scale#nonnegativescale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nonnegativescale</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Nonnegativescale</em>' operation.
     * @see org.omg.dd.dg.Scale#nonnegativescale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getScale__Nonnegativescale__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Rotate <em>Rotate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rotate</em>'.
     * @see org.omg.dd.dg.Rotate
     * @generated
     */
    EClass getRotate();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Rotate#getAngle <em>Angle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Angle</em>'.
     * @see org.omg.dd.dg.Rotate#getAngle()
     * @see #getRotate()
     * @generated
     */
    EAttribute getRotate_Angle();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Rotate#getCenter <em>Center</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Center</em>'.
     * @see org.omg.dd.dg.Rotate#getCenter()
     * @see #getRotate()
     * @generated
     */
    EReference getRotate_Center();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Skew <em>Skew</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Skew</em>'.
     * @see org.omg.dd.dg.Skew
     * @generated
     */
    EClass getSkew();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Skew#getAngleX <em>Angle X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Angle X</em>'.
     * @see org.omg.dd.dg.Skew#getAngleX()
     * @see #getSkew()
     * @generated
     */
    EAttribute getSkew_AngleX();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Skew#getAngleY <em>Angle Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Angle Y</em>'.
     * @see org.omg.dd.dg.Skew#getAngleY()
     * @see #getSkew()
     * @generated
     */
    EAttribute getSkew_AngleY();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Image <em>Image</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Image</em>'.
     * @see org.omg.dd.dg.Image
     * @generated
     */
    EClass getImage();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Image#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.omg.dd.dg.Image#getSource()
     * @see #getImage()
     * @generated
     */
    EAttribute getImage_Source();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Image#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.omg.dd.dg.Image#getBounds()
     * @see #getImage()
     * @generated
     */
    EReference getImage_Bounds();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Image#getIsAspectRatioPreserved <em>Is Aspect Ratio Preserved</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Aspect Ratio Preserved</em>'.
     * @see org.omg.dd.dg.Image#getIsAspectRatioPreserved()
     * @see #getImage()
     * @generated
     */
    EAttribute getImage_IsAspectRatioPreserved();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Circle <em>Circle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Circle</em>'.
     * @see org.omg.dd.dg.Circle
     * @generated
     */
    EClass getCircle();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.Circle#getCenter <em>Center</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Center</em>'.
     * @see org.omg.dd.dg.Circle#getCenter()
     * @see #getCircle()
     * @generated
     */
    EReference getCircle_Center();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Circle#getRadius <em>Radius</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Radius</em>'.
     * @see org.omg.dd.dg.Circle#getRadius()
     * @see #getCircle()
     * @generated
     */
    EAttribute getCircle_Radius();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dg.Circle#non_negative_radius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non negative radius</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Non negative radius</em>' operation.
     * @see org.omg.dd.dg.Circle#non_negative_radius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getCircle__Non_negative_radius__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.Matrix <em>Matrix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Matrix</em>'.
     * @see org.omg.dd.dg.Matrix
     * @generated
     */
    EClass getMatrix();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Matrix#getA <em>A</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>A</em>'.
     * @see org.omg.dd.dg.Matrix#getA()
     * @see #getMatrix()
     * @generated
     */
    EAttribute getMatrix_A();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Matrix#getB <em>B</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>B</em>'.
     * @see org.omg.dd.dg.Matrix#getB()
     * @see #getMatrix()
     * @generated
     */
    EAttribute getMatrix_B();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Matrix#getC <em>C</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>C</em>'.
     * @see org.omg.dd.dg.Matrix#getC()
     * @see #getMatrix()
     * @generated
     */
    EAttribute getMatrix_C();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Matrix#getD <em>D</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>D</em>'.
     * @see org.omg.dd.dg.Matrix#getD()
     * @see #getMatrix()
     * @generated
     */
    EAttribute getMatrix_D();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Matrix#getE <em>E</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>E</em>'.
     * @see org.omg.dd.dg.Matrix#getE()
     * @see #getMatrix()
     * @generated
     */
    EAttribute getMatrix_E();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.Matrix#getF <em>F</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>F</em>'.
     * @see org.omg.dd.dg.Matrix#getF()
     * @see #getMatrix()
     * @generated
     */
    EAttribute getMatrix_F();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.MoveTo <em>Move To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Move To</em>'.
     * @see org.omg.dd.dg.MoveTo
     * @generated
     */
    EClass getMoveTo();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.MoveTo#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.omg.dd.dg.MoveTo#getPoint()
     * @see #getMoveTo()
     * @generated
     */
    EReference getMoveTo_Point();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.LineTo <em>Line To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Line To</em>'.
     * @see org.omg.dd.dg.LineTo
     * @generated
     */
    EClass getLineTo();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.LineTo#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.omg.dd.dg.LineTo#getPoint()
     * @see #getLineTo()
     * @generated
     */
    EReference getLineTo_Point();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.CubicCurveTo <em>Cubic Curve To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cubic Curve To</em>'.
     * @see org.omg.dd.dg.CubicCurveTo
     * @generated
     */
    EClass getCubicCurveTo();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.CubicCurveTo#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.omg.dd.dg.CubicCurveTo#getPoint()
     * @see #getCubicCurveTo()
     * @generated
     */
    EReference getCubicCurveTo_Point();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.CubicCurveTo#getStartControl <em>Start Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start Control</em>'.
     * @see org.omg.dd.dg.CubicCurveTo#getStartControl()
     * @see #getCubicCurveTo()
     * @generated
     */
    EReference getCubicCurveTo_StartControl();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.CubicCurveTo#getEndControl <em>End Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End Control</em>'.
     * @see org.omg.dd.dg.CubicCurveTo#getEndControl()
     * @see #getCubicCurveTo()
     * @generated
     */
    EReference getCubicCurveTo_EndControl();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.QuadraticCurveTo <em>Quadratic Curve To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quadratic Curve To</em>'.
     * @see org.omg.dd.dg.QuadraticCurveTo
     * @generated
     */
    EClass getQuadraticCurveTo();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.QuadraticCurveTo#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.omg.dd.dg.QuadraticCurveTo#getPoint()
     * @see #getQuadraticCurveTo()
     * @generated
     */
    EReference getQuadraticCurveTo_Point();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.QuadraticCurveTo#getControl <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Control</em>'.
     * @see org.omg.dd.dg.QuadraticCurveTo#getControl()
     * @see #getQuadraticCurveTo()
     * @generated
     */
    EReference getQuadraticCurveTo_Control();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.EllipticalArcTo <em>Elliptical Arc To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elliptical Arc To</em>'.
     * @see org.omg.dd.dg.EllipticalArcTo
     * @generated
     */
    EClass getEllipticalArcTo();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.EllipticalArcTo#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.omg.dd.dg.EllipticalArcTo#getPoint()
     * @see #getEllipticalArcTo()
     * @generated
     */
    EReference getEllipticalArcTo_Point();

    /**
     * Returns the meta object for the containment reference '{@link org.omg.dd.dg.EllipticalArcTo#getRadii <em>Radii</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Radii</em>'.
     * @see org.omg.dd.dg.EllipticalArcTo#getRadii()
     * @see #getEllipticalArcTo()
     * @generated
     */
    EReference getEllipticalArcTo_Radii();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.EllipticalArcTo#getRotation <em>Rotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rotation</em>'.
     * @see org.omg.dd.dg.EllipticalArcTo#getRotation()
     * @see #getEllipticalArcTo()
     * @generated
     */
    EAttribute getEllipticalArcTo_Rotation();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.EllipticalArcTo#getIsLargeArc <em>Is Large Arc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Large Arc</em>'.
     * @see org.omg.dd.dg.EllipticalArcTo#getIsLargeArc()
     * @see #getEllipticalArcTo()
     * @generated
     */
    EAttribute getEllipticalArcTo_IsLargeArc();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dg.EllipticalArcTo#getIsSweep <em>Is Sweep</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Sweep</em>'.
     * @see org.omg.dd.dg.EllipticalArcTo#getIsSweep()
     * @see #getEllipticalArcTo()
     * @generated
     */
    EAttribute getEllipticalArcTo_IsSweep();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dg.ClosePath <em>Close Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Close Path</em>'.
     * @see org.omg.dd.dg.ClosePath
     * @generated
     */
    EClass getClosePath();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DGFactory getDGFactory();

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
         * The meta object literal for the '{@link org.omg.dd.dg.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.RadialGradientImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getRadialGradient()
         * @generated
         */
        EClass RADIAL_GRADIENT = eINSTANCE.getRadialGradient();

        /**
         * The meta object literal for the '<em><b>Center X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RADIAL_GRADIENT__CENTER_X = eINSTANCE.getRadialGradient_CenterX();

        /**
         * The meta object literal for the '<em><b>Center Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RADIAL_GRADIENT__CENTER_Y = eINSTANCE.getRadialGradient_CenterY();

        /**
         * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RADIAL_GRADIENT__RADIUS = eINSTANCE.getRadialGradient_Radius();

        /**
         * The meta object literal for the '<em><b>Focus X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RADIAL_GRADIENT__FOCUS_X = eINSTANCE.getRadialGradient_FocusX();

        /**
         * The meta object literal for the '<em><b>Focus Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RADIAL_GRADIENT__FOCUS_Y = eINSTANCE.getRadialGradient_FocusY();

        /**
         * The meta object literal for the '<em><b>Valid center point</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRadialGradient__Valid_center_point__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid focus point</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRadialGradient__Valid_focus_point__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid radius</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRadialGradient__Valid_radius__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.GradientImpl <em>Gradient</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.GradientImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getGradient()
         * @generated
         */
        EClass GRADIENT = eINSTANCE.getGradient();

        /**
         * The meta object literal for the '<em><b>Stop</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT__STOP = eINSTANCE.getGradient_Stop();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.FillImpl <em>Fill</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.FillImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getFill()
         * @generated
         */
        EClass FILL = eINSTANCE.getFill();

        /**
         * The meta object literal for the '<em><b>Canvas</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILL__CANVAS = eINSTANCE.getFill_Canvas();

        /**
         * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILL__TRANSFORM = eINSTANCE.getFill_Transform();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.CanvasImpl <em>Canvas</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.CanvasImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getCanvas()
         * @generated
         */
        EClass CANVAS = eINSTANCE.getCanvas();

        /**
         * The meta object literal for the '<em><b>Background Fill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CANVAS__BACKGROUND_FILL = eINSTANCE.getCanvas_BackgroundFill();

        /**
         * The meta object literal for the '<em><b>Background Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CANVAS__BACKGROUND_COLOR = eINSTANCE.getCanvas_BackgroundColor();

        /**
         * The meta object literal for the '<em><b>Packaged Marker</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CANVAS__PACKAGED_MARKER = eINSTANCE.getCanvas_PackagedMarker();

        /**
         * The meta object literal for the '<em><b>Packaged Style</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CANVAS__PACKAGED_STYLE = eINSTANCE.getCanvas_PackagedStyle();

        /**
         * The meta object literal for the '<em><b>Packaged Fill</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CANVAS__PACKAGED_FILL = eINSTANCE.getCanvas_PackagedFill();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.GroupImpl <em>Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.GroupImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getGroup()
         * @generated
         */
        EClass GROUP = eINSTANCE.getGroup();

        /**
         * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP__MEMBER = eINSTANCE.getGroup_Member();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.GraphicalElementImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getGraphicalElement()
         * @generated
         */
        EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPHICAL_ELEMENT__GROUP = eINSTANCE.getGraphicalElement_Group();

        /**
         * The meta object literal for the '<em><b>Local Style</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPHICAL_ELEMENT__LOCAL_STYLE = eINSTANCE.getGraphicalElement_LocalStyle();

        /**
         * The meta object literal for the '<em><b>Shared Style</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPHICAL_ELEMENT__SHARED_STYLE = eINSTANCE.getGraphicalElement_SharedStyle();

        /**
         * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPHICAL_ELEMENT__TRANSFORM = eINSTANCE.getGraphicalElement_Transform();

        /**
         * The meta object literal for the '<em><b>Clip Path</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPHICAL_ELEMENT__CLIP_PATH = eINSTANCE.getGraphicalElement_ClipPath();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.TransformImpl <em>Transform</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.TransformImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getTransform()
         * @generated
         */
        EClass TRANSFORM = eINSTANCE.getTransform();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.ClipPathImpl <em>Clip Path</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.ClipPathImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getClipPath()
         * @generated
         */
        EClass CLIP_PATH = eINSTANCE.getClipPath();

        /**
         * The meta object literal for the '<em><b>Clipped Element</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLIP_PATH__CLIPPED_ELEMENT = eINSTANCE.getClipPath_ClippedElement();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.MarkerImpl <em>Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.MarkerImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getMarker()
         * @generated
         */
        EClass MARKER = eINSTANCE.getMarker();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKER__SIZE = eINSTANCE.getMarker_Size();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKER__REFERENCE = eINSTANCE.getMarker_Reference();

        /**
         * The meta object literal for the '<em><b>Canvas</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKER__CANVAS = eINSTANCE.getMarker_Canvas();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.GradientStopImpl <em>Gradient Stop</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.GradientStopImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getGradientStop()
         * @generated
         */
        EClass GRADIENT_STOP = eINSTANCE.getGradientStop();

        /**
         * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT_STOP__COLOR = eINSTANCE.getGradientStop_Color();

        /**
         * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRADIENT_STOP__OFFSET = eINSTANCE.getGradientStop_Offset();

        /**
         * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRADIENT_STOP__OPACITY = eINSTANCE.getGradientStop_Opacity();

        /**
         * The meta object literal for the '<em><b>Valid offset</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGradientStop__Valid_offset__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Valid opacity</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGradientStop__Valid_opacity__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.PatternImpl <em>Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.PatternImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getPattern()
         * @generated
         */
        EClass PATTERN = eINSTANCE.getPattern();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATTERN__BOUNDS = eINSTANCE.getPattern_Bounds();

        /**
         * The meta object literal for the '<em><b>Tile</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATTERN__TILE = eINSTANCE.getPattern_Tile();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.LinearGradientImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getLinearGradient()
         * @generated
         */
        EClass LINEAR_GRADIENT = eINSTANCE.getLinearGradient();

        /**
         * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINEAR_GRADIENT__X1 = eINSTANCE.getLinearGradient_X1();

        /**
         * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINEAR_GRADIENT__X2 = eINSTANCE.getLinearGradient_X2();

        /**
         * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINEAR_GRADIENT__Y1 = eINSTANCE.getLinearGradient_Y1();

        /**
         * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINEAR_GRADIENT__Y2 = eINSTANCE.getLinearGradient_Y2();

        /**
         * The meta object literal for the '<em><b>Valid gradient vector</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLinearGradient__Valid_gradient_vector__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.MarkedElementImpl <em>Marked Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.MarkedElementImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getMarkedElement()
         * @generated
         */
        EClass MARKED_ELEMENT = eINSTANCE.getMarkedElement();

        /**
         * The meta object literal for the '<em><b>Start Marker</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKED_ELEMENT__START_MARKER = eINSTANCE.getMarkedElement_StartMarker();

        /**
         * The meta object literal for the '<em><b>End Marker</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKED_ELEMENT__END_MARKER = eINSTANCE.getMarkedElement_EndMarker();

        /**
         * The meta object literal for the '<em><b>Mid Marker</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKED_ELEMENT__MID_MARKER = eINSTANCE.getMarkedElement_MidMarker();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.RectangleImpl <em>Rectangle</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.RectangleImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getRectangle()
         * @generated
         */
        EClass RECTANGLE = eINSTANCE.getRectangle();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RECTANGLE__BOUNDS = eINSTANCE.getRectangle_Bounds();

        /**
         * The meta object literal for the '<em><b>Corner Radius</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RECTANGLE__CORNER_RADIUS = eINSTANCE.getRectangle_CornerRadius();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.EllipseImpl <em>Ellipse</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.EllipseImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getEllipse()
         * @generated
         */
        EClass ELLIPSE = eINSTANCE.getEllipse();

        /**
         * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELLIPSE__CENTER = eINSTANCE.getEllipse_Center();

        /**
         * The meta object literal for the '<em><b>Radii</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELLIPSE__RADII = eINSTANCE.getEllipse_Radii();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.TextImpl <em>Text</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.TextImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getText()
         * @generated
         */
        EClass TEXT = eINSTANCE.getText();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT__DATA = eINSTANCE.getText_Data();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEXT__BOUNDS = eINSTANCE.getText_Bounds();

        /**
         * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT__ALIGNMENT = eINSTANCE.getText_Alignment();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.LineImpl <em>Line</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.LineImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getLine()
         * @generated
         */
        EClass LINE = eINSTANCE.getLine();

        /**
         * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINE__START = eINSTANCE.getLine_Start();

        /**
         * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINE__END = eINSTANCE.getLine_End();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.PolylineImpl <em>Polyline</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.PolylineImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getPolyline()
         * @generated
         */
        EClass POLYLINE = eINSTANCE.getPolyline();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLYLINE__POINT = eINSTANCE.getPolyline_Point();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.PolygonImpl <em>Polygon</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.PolygonImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getPolygon()
         * @generated
         */
        EClass POLYGON = eINSTANCE.getPolygon();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLYGON__POINT = eINSTANCE.getPolygon_Point();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.PathImpl <em>Path</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.PathImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getPath()
         * @generated
         */
        EClass PATH = eINSTANCE.getPath();

        /**
         * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATH__COMMAND = eINSTANCE.getPath_Command();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.PathCommandImpl <em>Path Command</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.PathCommandImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getPathCommand()
         * @generated
         */
        EClass PATH_COMMAND = eINSTANCE.getPathCommand();

        /**
         * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PATH_COMMAND__IS_RELATIVE = eINSTANCE.getPathCommand_IsRelative();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.TranslateImpl <em>Translate</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.TranslateImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getTranslate()
         * @generated
         */
        EClass TRANSLATE = eINSTANCE.getTranslate();

        /**
         * The meta object literal for the '<em><b>Delta X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSLATE__DELTA_X = eINSTANCE.getTranslate_DeltaX();

        /**
         * The meta object literal for the '<em><b>Delta Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSLATE__DELTA_Y = eINSTANCE.getTranslate_DeltaY();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.ScaleImpl <em>Scale</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.ScaleImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getScale()
         * @generated
         */
        EClass SCALE = eINSTANCE.getScale();

        /**
         * The meta object literal for the '<em><b>Factor X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCALE__FACTOR_X = eINSTANCE.getScale_FactorX();

        /**
         * The meta object literal for the '<em><b>Factor Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCALE__FACTOR_Y = eINSTANCE.getScale_FactorY();

        /**
         * The meta object literal for the '<em><b>Nonnegativescale</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScale__Nonnegativescale__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.RotateImpl <em>Rotate</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.RotateImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getRotate()
         * @generated
         */
        EClass ROTATE = eINSTANCE.getRotate();

        /**
         * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

        /**
         * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROTATE__CENTER = eINSTANCE.getRotate_Center();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.SkewImpl <em>Skew</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.SkewImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getSkew()
         * @generated
         */
        EClass SKEW = eINSTANCE.getSkew();

        /**
         * The meta object literal for the '<em><b>Angle X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SKEW__ANGLE_X = eINSTANCE.getSkew_AngleX();

        /**
         * The meta object literal for the '<em><b>Angle Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SKEW__ANGLE_Y = eINSTANCE.getSkew_AngleY();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.ImageImpl <em>Image</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.ImageImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getImage()
         * @generated
         */
        EClass IMAGE = eINSTANCE.getImage();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMAGE__SOURCE = eINSTANCE.getImage_Source();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMAGE__BOUNDS = eINSTANCE.getImage_Bounds();

        /**
         * The meta object literal for the '<em><b>Is Aspect Ratio Preserved</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IMAGE__IS_ASPECT_RATIO_PRESERVED = eINSTANCE.getImage_IsAspectRatioPreserved();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.CircleImpl <em>Circle</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.CircleImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getCircle()
         * @generated
         */
        EClass CIRCLE = eINSTANCE.getCircle();

        /**
         * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CIRCLE__CENTER = eINSTANCE.getCircle_Center();

        /**
         * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

        /**
         * The meta object literal for the '<em><b>Non negative radius</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CIRCLE___NON_NEGATIVE_RADIUS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCircle__Non_negative_radius__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.MatrixImpl <em>Matrix</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.MatrixImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getMatrix()
         * @generated
         */
        EClass MATRIX = eINSTANCE.getMatrix();

        /**
         * The meta object literal for the '<em><b>A</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX__A = eINSTANCE.getMatrix_A();

        /**
         * The meta object literal for the '<em><b>B</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX__B = eINSTANCE.getMatrix_B();

        /**
         * The meta object literal for the '<em><b>C</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX__C = eINSTANCE.getMatrix_C();

        /**
         * The meta object literal for the '<em><b>D</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX__D = eINSTANCE.getMatrix_D();

        /**
         * The meta object literal for the '<em><b>E</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX__E = eINSTANCE.getMatrix_E();

        /**
         * The meta object literal for the '<em><b>F</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MATRIX__F = eINSTANCE.getMatrix_F();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.MoveToImpl <em>Move To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.MoveToImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getMoveTo()
         * @generated
         */
        EClass MOVE_TO = eINSTANCE.getMoveTo();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MOVE_TO__POINT = eINSTANCE.getMoveTo_Point();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.LineToImpl <em>Line To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.LineToImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getLineTo()
         * @generated
         */
        EClass LINE_TO = eINSTANCE.getLineTo();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINE_TO__POINT = eINSTANCE.getLineTo_Point();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.CubicCurveToImpl <em>Cubic Curve To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.CubicCurveToImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getCubicCurveTo()
         * @generated
         */
        EClass CUBIC_CURVE_TO = eINSTANCE.getCubicCurveTo();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CUBIC_CURVE_TO__POINT = eINSTANCE.getCubicCurveTo_Point();

        /**
         * The meta object literal for the '<em><b>Start Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CUBIC_CURVE_TO__START_CONTROL = eINSTANCE.getCubicCurveTo_StartControl();

        /**
         * The meta object literal for the '<em><b>End Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CUBIC_CURVE_TO__END_CONTROL = eINSTANCE.getCubicCurveTo_EndControl();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.QuadraticCurveToImpl <em>Quadratic Curve To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.QuadraticCurveToImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getQuadraticCurveTo()
         * @generated
         */
        EClass QUADRATIC_CURVE_TO = eINSTANCE.getQuadraticCurveTo();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUADRATIC_CURVE_TO__POINT = eINSTANCE.getQuadraticCurveTo_Point();

        /**
         * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUADRATIC_CURVE_TO__CONTROL = eINSTANCE.getQuadraticCurveTo_Control();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.EllipticalArcToImpl <em>Elliptical Arc To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.EllipticalArcToImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getEllipticalArcTo()
         * @generated
         */
        EClass ELLIPTICAL_ARC_TO = eINSTANCE.getEllipticalArcTo();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELLIPTICAL_ARC_TO__POINT = eINSTANCE.getEllipticalArcTo_Point();

        /**
         * The meta object literal for the '<em><b>Radii</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELLIPTICAL_ARC_TO__RADII = eINSTANCE.getEllipticalArcTo_Radii();

        /**
         * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELLIPTICAL_ARC_TO__ROTATION = eINSTANCE.getEllipticalArcTo_Rotation();

        /**
         * The meta object literal for the '<em><b>Is Large Arc</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELLIPTICAL_ARC_TO__IS_LARGE_ARC = eINSTANCE.getEllipticalArcTo_IsLargeArc();

        /**
         * The meta object literal for the '<em><b>Is Sweep</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELLIPTICAL_ARC_TO__IS_SWEEP = eINSTANCE.getEllipticalArcTo_IsSweep();

        /**
         * The meta object literal for the '{@link org.omg.dd.dg.impl.ClosePathImpl <em>Close Path</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dg.impl.ClosePathImpl
         * @see org.omg.dd.dg.impl.DGPackageImpl#getClosePath()
         * @generated
         */
        EClass CLOSE_PATH = eINSTANCE.getClosePath();

    }

} //DGPackage
