/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.di.DiPackage;
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
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiFactory
 * @model kind="package"
 * @generated
 */
public interface VdmlDiPackage extends EPackage {
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
    VdmlDiPackage eINSTANCE = org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl.init();

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLDiagramImpl <em>VDML Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLDiagramImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLDiagram()
     * @generated
     */
    int VDML_DIAGRAM = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__DOCUMENTATION = DiPackage.DIAGRAM__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Owned Style</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__OWNED_STYLE = DiPackage.DIAGRAM__OWNED_STYLE;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__ROOT_ELEMENT = DiPackage.DIAGRAM__ROOT_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__ID = DiPackage.DIAGRAM__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__NAME = DiPackage.DIAGRAM__NAME;

    /**
     * The feature id for the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__RESOLUTION = DiPackage.DIAGRAM__RESOLUTION;

    /**
     * The feature id for the '<em><b>VDML Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__VDML_PLANE = DiPackage.DIAGRAM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Label Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM__LABEL_STYLE = DiPackage.DIAGRAM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>VDML Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_FEATURE_COUNT = DiPackage.DIAGRAM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>VDML Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_DIAGRAM_OPERATION_COUNT = DiPackage.DIAGRAM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl <em>VDML Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLEdge()
     * @generated
     */
    int VDML_EDGE = 1;

    /**
     * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__OWNING_DIAGRAM = DiPackage.LABELED_EDGE__OWNING_DIAGRAM;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__OWNING_ELEMENT = DiPackage.LABELED_EDGE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__OWNED_ELEMENT = DiPackage.LABELED_EDGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__MODEL_ELEMENT = DiPackage.LABELED_EDGE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__STYLE = DiPackage.LABELED_EDGE__STYLE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__ID = DiPackage.LABELED_EDGE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__ANY_ATTRIBUTE = DiPackage.LABELED_EDGE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__SOURCE = DiPackage.LABELED_EDGE__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__TARGET = DiPackage.LABELED_EDGE__TARGET;

    /**
     * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__WAYPOINT = DiPackage.LABELED_EDGE__WAYPOINT;

    /**
     * The feature id for the '<em><b>Owned Label</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__OWNED_LABEL = DiPackage.LABELED_EDGE__OWNED_LABEL;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__LABEL = DiPackage.LABELED_EDGE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>VDML Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__VDML_ELEMENT = DiPackage.LABELED_EDGE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__SOURCE_ELEMENT = DiPackage.LABELED_EDGE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE__TARGET_ELEMENT = DiPackage.LABELED_EDGE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>VDML Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE_FEATURE_COUNT = DiPackage.LABELED_EDGE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>VDML Edge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_EDGE_OPERATION_COUNT = DiPackage.LABELED_EDGE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelImpl <em>VDML Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLLabel()
     * @generated
     */
    int VDML_LABEL = 2;

    /**
     * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__OWNING_DIAGRAM = DiPackage.LABEL__OWNING_DIAGRAM;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__OWNING_ELEMENT = DiPackage.LABEL__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__OWNED_ELEMENT = DiPackage.LABEL__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__MODEL_ELEMENT = DiPackage.LABEL__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__STYLE = DiPackage.LABEL__STYLE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__ID = DiPackage.LABEL__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__ANY_ATTRIBUTE = DiPackage.LABEL__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__BOUNDS = DiPackage.LABEL__BOUNDS;

    /**
     * The feature id for the '<em><b>Label Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL__LABEL_STYLE = DiPackage.LABEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>VDML Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL_FEATURE_COUNT = DiPackage.LABEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>VDML Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL_OPERATION_COUNT = DiPackage.LABEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelStyleImpl <em>VDML Label Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelStyleImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLLabelStyle()
     * @generated
     */
    int VDML_LABEL_STYLE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL_STYLE__ID = DiPackage.STYLE__ID;

    /**
     * The feature id for the '<em><b>Font</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL_STYLE__FONT = DiPackage.STYLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>VDML Label Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL_STYLE_FEATURE_COUNT = DiPackage.STYLE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>VDML Label Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_LABEL_STYLE_OPERATION_COUNT = DiPackage.STYLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLPlaneImpl <em>VDML Plane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLPlaneImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLPlane()
     * @generated
     */
    int VDML_PLANE = 4;

    /**
     * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__OWNING_DIAGRAM = DiPackage.PLANE__OWNING_DIAGRAM;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__OWNING_ELEMENT = DiPackage.PLANE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__OWNED_ELEMENT = DiPackage.PLANE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__MODEL_ELEMENT = DiPackage.PLANE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__STYLE = DiPackage.PLANE__STYLE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__ID = DiPackage.PLANE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__ANY_ATTRIBUTE = DiPackage.PLANE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Plane Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__PLANE_ELEMENT = DiPackage.PLANE__PLANE_ELEMENT;

    /**
     * The feature id for the '<em><b>VDML Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE__VDML_ELEMENT = DiPackage.PLANE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>VDML Plane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE_FEATURE_COUNT = DiPackage.PLANE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Plane element type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE___PLANE_ELEMENT_TYPE__DIAGNOSTICCHAIN_MAP = DiPackage.PLANE___PLANE_ELEMENT_TYPE__DIAGNOSTICCHAIN_MAP;

    /**
     * The number of operations of the '<em>VDML Plane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_PLANE_OPERATION_COUNT = DiPackage.PLANE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl <em>VDML Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLShape()
     * @generated
     */
    int VDML_SHAPE = 5;

    /**
     * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNING_DIAGRAM = DiPackage.LABELED_SHAPE__OWNING_DIAGRAM;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNING_ELEMENT = DiPackage.LABELED_SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNED_ELEMENT = DiPackage.LABELED_SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__MODEL_ELEMENT = DiPackage.LABELED_SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__STYLE = DiPackage.LABELED_SHAPE__STYLE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__ID = DiPackage.LABELED_SHAPE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__ANY_ATTRIBUTE = DiPackage.LABELED_SHAPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__BOUNDS = DiPackage.LABELED_SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Owned Label</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNED_LABEL = DiPackage.LABELED_SHAPE__OWNED_LABEL;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__LABEL = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>VDML Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__VDML_ELEMENT = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__IS_EXPANDED = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Horizontal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__IS_HORIZONTAL = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Marker Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__IS_MARKER_VISIBLE = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Owned Shape</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE__OWNED_SHAPE = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>VDML Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE_FEATURE_COUNT = DiPackage.LABELED_SHAPE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>VDML Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VDML_SHAPE_OPERATION_COUNT = DiPackage.LABELED_SHAPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl
     * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 6;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DIAGRAM = 3;

    /**
     * The feature id for the '<em><b>Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EDGE = 4;

    /**
     * The feature id for the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LABEL = 5;

    /**
     * The feature id for the '<em><b>Label Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LABEL_STYLE = 6;

    /**
     * The feature id for the '<em><b>Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PLANE = 7;

    /**
     * The feature id for the '<em><b>Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SHAPE = 8;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 9;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram <em>VDML Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Diagram</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram
     * @generated
     */
    EClass getVDMLDiagram();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getVDMLPlane <em>VDML Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>VDML Plane</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getVDMLPlane()
     * @see #getVDMLDiagram()
     * @generated
     */
    EReference getVDMLDiagram_VDMLPlane();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getLabelStyle <em>Label Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Label Style</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getLabelStyle()
     * @see #getVDMLDiagram()
     * @generated
     */
    EReference getVDMLDiagram_LabelStyle();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge <em>VDML Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Edge</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge
     * @generated
     */
    EClass getVDMLEdge();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Label</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getLabel()
     * @see #getVDMLEdge()
     * @generated
     */
    EReference getVDMLEdge_Label();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getVDMLElement <em>VDML Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>VDML Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getVDMLElement()
     * @see #getVDMLEdge()
     * @generated
     */
    EReference getVDMLEdge_VDMLElement();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getSourceElement <em>Source Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getSourceElement()
     * @see #getVDMLEdge()
     * @generated
     */
    EReference getVDMLEdge_SourceElement();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getTargetElement <em>Target Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getTargetElement()
     * @see #getVDMLEdge()
     * @generated
     */
    EReference getVDMLEdge_TargetElement();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel <em>VDML Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Label</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel
     * @generated
     */
    EClass getVDMLLabel();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel#getLabelStyle <em>Label Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Label Style</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel#getLabelStyle()
     * @see #getVDMLLabel()
     * @generated
     */
    EReference getVDMLLabel_LabelStyle();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle <em>VDML Label Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Label Style</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle
     * @generated
     */
    EClass getVDMLLabelStyle();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle#getFont <em>Font</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Font</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle#getFont()
     * @see #getVDMLLabelStyle()
     * @generated
     */
    EReference getVDMLLabelStyle_Font();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane <em>VDML Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Plane</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane
     * @generated
     */
    EClass getVDMLPlane();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane#getVDMLElement <em>VDML Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>VDML Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane#getVDMLElement()
     * @see #getVDMLPlane()
     * @generated
     */
    EReference getVDMLPlane_VDMLElement();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape <em>VDML Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VDML Shape</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape
     * @generated
     */
    EClass getVDMLShape();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Label</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getLabel()
     * @see #getVDMLShape()
     * @generated
     */
    EReference getVDMLShape_Label();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getVDMLElement <em>VDML Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>VDML Element</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getVDMLElement()
     * @see #getVDMLShape()
     * @generated
     */
    EReference getVDMLShape_VDMLElement();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isExpanded <em>Is Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Expanded</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isExpanded()
     * @see #getVDMLShape()
     * @generated
     */
    EAttribute getVDMLShape_IsExpanded();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isHorizontal <em>Is Horizontal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Horizontal</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isHorizontal()
     * @see #getVDMLShape()
     * @generated
     */
    EAttribute getVDMLShape_IsHorizontal();

    /**
     * Returns the meta object for the attribute '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isMarkerVisible <em>Is Marker Visible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Marker Visible</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isMarkerVisible()
     * @see #getVDMLShape()
     * @generated
     */
    EAttribute getVDMLShape_IsMarkerVisible();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getOwnedShape <em>Owned Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Shape</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getOwnedShape()
     * @see #getVDMLShape()
     * @generated
     */
    EReference getVDMLShape_OwnedShape();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Diagram</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getDiagram()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Diagram();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getEdge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Edge</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getEdge()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Edge();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Label</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Label();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabelStyle <em>Label Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Label Style</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabelStyle()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LabelStyle();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Plane</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getPlane()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Plane();

    /**
     * Returns the meta object for the containment reference '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getShape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Shape</em>'.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getShape()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Shape();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VdmlDiFactory getVdmlDiFactory();

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
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLDiagramImpl <em>VDML Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLDiagramImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLDiagram()
         * @generated
         */
        EClass VDML_DIAGRAM = eINSTANCE.getVDMLDiagram();

        /**
         * The meta object literal for the '<em><b>VDML Plane</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_DIAGRAM__VDML_PLANE = eINSTANCE.getVDMLDiagram_VDMLPlane();

        /**
         * The meta object literal for the '<em><b>Label Style</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_DIAGRAM__LABEL_STYLE = eINSTANCE.getVDMLDiagram_LabelStyle();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl <em>VDML Edge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLEdgeImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLEdge()
         * @generated
         */
        EClass VDML_EDGE = eINSTANCE.getVDMLEdge();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_EDGE__LABEL = eINSTANCE.getVDMLEdge_Label();

        /**
         * The meta object literal for the '<em><b>VDML Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_EDGE__VDML_ELEMENT = eINSTANCE.getVDMLEdge_VDMLElement();

        /**
         * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_EDGE__SOURCE_ELEMENT = eINSTANCE.getVDMLEdge_SourceElement();

        /**
         * The meta object literal for the '<em><b>Target Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_EDGE__TARGET_ELEMENT = eINSTANCE.getVDMLEdge_TargetElement();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelImpl <em>VDML Label</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLLabel()
         * @generated
         */
        EClass VDML_LABEL = eINSTANCE.getVDMLLabel();

        /**
         * The meta object literal for the '<em><b>Label Style</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_LABEL__LABEL_STYLE = eINSTANCE.getVDMLLabel_LabelStyle();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelStyleImpl <em>VDML Label Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLLabelStyleImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLLabelStyle()
         * @generated
         */
        EClass VDML_LABEL_STYLE = eINSTANCE.getVDMLLabelStyle();

        /**
         * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_LABEL_STYLE__FONT = eINSTANCE.getVDMLLabelStyle_Font();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLPlaneImpl <em>VDML Plane</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLPlaneImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLPlane()
         * @generated
         */
        EClass VDML_PLANE = eINSTANCE.getVDMLPlane();

        /**
         * The meta object literal for the '<em><b>VDML Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_PLANE__VDML_ELEMENT = eINSTANCE.getVDMLPlane_VDMLElement();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl <em>VDML Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VDMLShapeImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getVDMLShape()
         * @generated
         */
        EClass VDML_SHAPE = eINSTANCE.getVDMLShape();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_SHAPE__LABEL = eINSTANCE.getVDMLShape_Label();

        /**
         * The meta object literal for the '<em><b>VDML Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_SHAPE__VDML_ELEMENT = eINSTANCE.getVDMLShape_VDMLElement();

        /**
         * The meta object literal for the '<em><b>Is Expanded</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_SHAPE__IS_EXPANDED = eINSTANCE.getVDMLShape_IsExpanded();

        /**
         * The meta object literal for the '<em><b>Is Horizontal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_SHAPE__IS_HORIZONTAL = eINSTANCE.getVDMLShape_IsHorizontal();

        /**
         * The meta object literal for the '<em><b>Is Marker Visible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VDML_SHAPE__IS_MARKER_VISIBLE = eINSTANCE.getVDMLShape_IsMarkerVisible();

        /**
         * The meta object literal for the '<em><b>Owned Shape</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VDML_SHAPE__OWNED_SHAPE = eINSTANCE.getVDMLShape_OwnedShape();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl
         * @see org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DIAGRAM = eINSTANCE.getDocumentRoot_Diagram();

        /**
         * The meta object literal for the '<em><b>Edge</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__EDGE = eINSTANCE.getDocumentRoot_Edge();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LABEL = eINSTANCE.getDocumentRoot_Label();

        /**
         * The meta object literal for the '<em><b>Label Style</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__LABEL_STYLE = eINSTANCE.getDocumentRoot_LabelStyle();

        /**
         * The meta object literal for the '<em><b>Plane</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PLANE = eINSTANCE.getDocumentRoot_Plane();

        /**
         * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SHAPE = eINSTANCE.getDocumentRoot_Shape();

    }

} //VdmlDiPackage
