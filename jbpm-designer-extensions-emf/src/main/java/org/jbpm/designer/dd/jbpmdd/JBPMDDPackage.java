/**
 */
package org.jbpm.designer.dd.jbpmdd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.jbpm.designer.dd.jbpmdd.JBPMDDFactory
 * @model kind="package"
 * @generated
 */
public interface JBPMDDPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "jbpmdd";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.jbpm.org/DD";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "jBPMDD";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JBPMDDPackage eINSTANCE = org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl.init();

    /**
     * The meta object id for the '{@link org.jbpm.designer.dd.jbpmdd.BoundariedShape <em>Boundaried Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.designer.dd.jbpmdd.BoundariedShape
     * @see org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl#getBoundariedShape()
     * @generated
     */
    int BOUNDARIED_SHAPE = 0;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__OWNING_ELEMENT = DIPackage.SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__OWNED_ELEMENT = DIPackage.SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__LOCAL_STYLE = DIPackage.SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__MODEL_ELEMENT = DIPackage.SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__ID = DIPackage.SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__BOUNDS = DIPackage.SHAPE__BOUNDS;

    /**
     * The feature id for the '<em><b>Boundary Shapes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE__BOUNDARY_SHAPES = DIPackage.SHAPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boundaried Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Boundaried Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARIED_SHAPE_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.jbpm.designer.dd.jbpmdd.Compartment <em>Compartment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.designer.dd.jbpmdd.Compartment
     * @see org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl#getCompartment()
     * @generated
     */
    int COMPARTMENT = 1;

    /**
     * The feature id for the '<em><b>Owning Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__OWNING_ELEMENT = DIPackage.SHAPE__OWNING_ELEMENT;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__OWNED_ELEMENT = DIPackage.SHAPE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__LOCAL_STYLE = DIPackage.SHAPE__LOCAL_STYLE;

    /**
     * The feature id for the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__SHARED_STYLE = DIPackage.SHAPE__SHARED_STYLE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__MODEL_ELEMENT = DIPackage.SHAPE__MODEL_ELEMENT;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__ID = DIPackage.SHAPE__ID;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT__BOUNDS = DIPackage.SHAPE__BOUNDS;

    /**
     * The number of structural features of the '<em>Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT_FEATURE_COUNT = DIPackage.SHAPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Compartment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPARTMENT_OPERATION_COUNT = DIPackage.SHAPE_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape <em>Collapsible Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape
     * @see org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl#getCollapsibleShape()
     * @generated
     */
    int COLLAPSIBLE_SHAPE = 2;

    /**
     * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLAPSIBLE_SHAPE__IS_EXPANDED = 0;

    /**
     * The feature id for the '<em><b>Previous Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH = 1;

    /**
     * The feature id for the '<em><b>Previous Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT = 2;

    /**
     * The number of structural features of the '<em>Collapsible Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLAPSIBLE_SHAPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Collapsible Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLAPSIBLE_SHAPE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.jbpm.designer.dd.jbpmdd.BoundariedShape <em>Boundaried Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boundaried Shape</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.BoundariedShape
     * @generated
     */
    EClass getBoundariedShape();

    /**
     * Returns the meta object for the reference list '{@link org.jbpm.designer.dd.jbpmdd.BoundariedShape#getBoundaryShapes <em>Boundary Shapes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Boundary Shapes</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.BoundariedShape#getBoundaryShapes()
     * @see #getBoundariedShape()
     * @generated
     */
    EReference getBoundariedShape_BoundaryShapes();

    /**
     * Returns the meta object for class '{@link org.jbpm.designer.dd.jbpmdd.Compartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compartment</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.Compartment
     * @generated
     */
    EClass getCompartment();

    /**
     * Returns the meta object for class '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape <em>Collapsible Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Collapsible Shape</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape
     * @generated
     */
    EClass getCollapsibleShape();

    /**
     * Returns the meta object for the attribute '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#isIsExpanded <em>Is Expanded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Expanded</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape#isIsExpanded()
     * @see #getCollapsibleShape()
     * @generated
     */
    EAttribute getCollapsibleShape_IsExpanded();

    /**
     * Returns the meta object for the attribute '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousWidth <em>Previous Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Previous Width</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousWidth()
     * @see #getCollapsibleShape()
     * @generated
     */
    EAttribute getCollapsibleShape_PreviousWidth();

    /**
     * Returns the meta object for the attribute '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousHeight <em>Previous Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Previous Height</em>'.
     * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape#getPreviousHeight()
     * @see #getCollapsibleShape()
     * @generated
     */
    EAttribute getCollapsibleShape_PreviousHeight();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JBPMDDFactory getJBPMDDFactory();

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
         * The meta object literal for the '{@link org.jbpm.designer.dd.jbpmdd.BoundariedShape <em>Boundaried Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.designer.dd.jbpmdd.BoundariedShape
         * @see org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl#getBoundariedShape()
         * @generated
         */
        EClass BOUNDARIED_SHAPE = eINSTANCE.getBoundariedShape();

        /**
         * The meta object literal for the '<em><b>Boundary Shapes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOUNDARIED_SHAPE__BOUNDARY_SHAPES = eINSTANCE.getBoundariedShape_BoundaryShapes();

        /**
         * The meta object literal for the '{@link org.jbpm.designer.dd.jbpmdd.Compartment <em>Compartment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.designer.dd.jbpmdd.Compartment
         * @see org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl#getCompartment()
         * @generated
         */
        EClass COMPARTMENT = eINSTANCE.getCompartment();

        /**
         * The meta object literal for the '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape <em>Collapsible Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape
         * @see org.jbpm.designer.dd.jbpmdd.impl.JBPMDDPackageImpl#getCollapsibleShape()
         * @generated
         */
        EClass COLLAPSIBLE_SHAPE = eINSTANCE.getCollapsibleShape();

        /**
         * The meta object literal for the '<em><b>Is Expanded</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLLAPSIBLE_SHAPE__IS_EXPANDED = eINSTANCE.getCollapsibleShape_IsExpanded();

        /**
         * The meta object literal for the '<em><b>Previous Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH = eINSTANCE.getCollapsibleShape_PreviousWidth();

        /**
         * The meta object literal for the '<em><b>Previous Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT = eINSTANCE.getCollapsibleShape_PreviousHeight();

    }

} //JBPMDDPackage
