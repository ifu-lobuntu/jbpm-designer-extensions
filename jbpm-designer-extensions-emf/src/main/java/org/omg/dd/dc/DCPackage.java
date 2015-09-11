/**
 */
package org.omg.dd.dc;

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
 * @see org.omg.dd.dc.DCFactory
 * @model kind="package"
 * @generated
 */
public interface DCPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/DD/20131001/DC";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "DC";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DCPackage eINSTANCE = org.omg.dd.dc.impl.DCPackageImpl.init();

    /**
     * The meta object id for the '{@link org.omg.dd.dc.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dc.impl.ColorImpl
     * @see org.omg.dd.dc.impl.DCPackageImpl#getColor()
     * @generated
     */
    int COLOR = 0;

    /**
     * The feature id for the '<em><b>Red</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR__RED = 0;

    /**
     * The feature id for the '<em><b>Green</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR__GREEN = 1;

    /**
     * The feature id for the '<em><b>Blue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR__BLUE = 2;

    /**
     * The number of structural features of the '<em>Color</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_FEATURE_COUNT = 3;

    /**
     * The operation id for the '<em>Valid rgb</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR___VALID_RGB__DIAGNOSTICCHAIN_MAP = 0;

    /**
     * The number of operations of the '<em>Color</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.omg.dd.dc.impl.DimensionImpl <em>Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dc.impl.DimensionImpl
     * @see org.omg.dd.dc.impl.DCPackageImpl#getDimension()
     * @generated
     */
    int DIMENSION = 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__WIDTH = 0;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION__HEIGHT = 1;

    /**
     * The number of structural features of the '<em>Dimension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>Non negative dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION___NON_NEGATIVE_DIMENSION__DIAGNOSTICCHAIN_MAP = 0;

    /**
     * The number of operations of the '<em>Dimension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIMENSION_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.omg.dd.dc.impl.BoundsImpl <em>Bounds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dc.impl.BoundsImpl
     * @see org.omg.dd.dc.impl.DCPackageImpl#getBounds()
     * @generated
     */
    int BOUNDS = 2;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__X = 0;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__Y = 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__WIDTH = 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__HEIGHT = 3;

    /**
     * The number of structural features of the '<em>Bounds</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_FEATURE_COUNT = 4;

    /**
     * The operation id for the '<em>Non negative size</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS___NON_NEGATIVE_SIZE__DIAGNOSTICCHAIN_MAP = 0;

    /**
     * The number of operations of the '<em>Bounds</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.omg.dd.dc.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dc.impl.PointImpl
     * @see org.omg.dd.dc.impl.DCPackageImpl#getPoint()
     * @generated
     */
    int POINT = 3;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__X = 0;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__Y = 1;

    /**
     * The number of structural features of the '<em>Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.omg.dd.dc.AlignmentKind <em>Alignment Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dc.AlignmentKind
     * @see org.omg.dd.dc.impl.DCPackageImpl#getAlignmentKind()
     * @generated
     */
    int ALIGNMENT_KIND = 4;

    /**
     * The meta object id for the '{@link org.omg.dd.dc.KnownColor <em>Known Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.omg.dd.dc.KnownColor
     * @see org.omg.dd.dc.impl.DCPackageImpl#getKnownColor()
     * @generated
     */
    int KNOWN_COLOR = 5;


    /**
     * Returns the meta object for class '{@link org.omg.dd.dc.Color <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Color</em>'.
     * @see org.omg.dd.dc.Color
     * @generated
     */
    EClass getColor();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Color#getRed <em>Red</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Red</em>'.
     * @see org.omg.dd.dc.Color#getRed()
     * @see #getColor()
     * @generated
     */
    EAttribute getColor_Red();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Color#getGreen <em>Green</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Green</em>'.
     * @see org.omg.dd.dc.Color#getGreen()
     * @see #getColor()
     * @generated
     */
    EAttribute getColor_Green();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Color#getBlue <em>Blue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Blue</em>'.
     * @see org.omg.dd.dc.Color#getBlue()
     * @see #getColor()
     * @generated
     */
    EAttribute getColor_Blue();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dc.Color#valid_rgb(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid rgb</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Valid rgb</em>' operation.
     * @see org.omg.dd.dc.Color#valid_rgb(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getColor__Valid_rgb__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dc.Dimension <em>Dimension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dimension</em>'.
     * @see org.omg.dd.dc.Dimension
     * @generated
     */
    EClass getDimension();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Dimension#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see org.omg.dd.dc.Dimension#getWidth()
     * @see #getDimension()
     * @generated
     */
    EAttribute getDimension_Width();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Dimension#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see org.omg.dd.dc.Dimension#getHeight()
     * @see #getDimension()
     * @generated
     */
    EAttribute getDimension_Height();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dc.Dimension#non_negative_dimension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non negative dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Non negative dimension</em>' operation.
     * @see org.omg.dd.dc.Dimension#non_negative_dimension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getDimension__Non_negative_dimension__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dc.Bounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bounds</em>'.
     * @see org.omg.dd.dc.Bounds
     * @generated
     */
    EClass getBounds();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Bounds#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.omg.dd.dc.Bounds#getX()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_X();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Bounds#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.omg.dd.dc.Bounds#getY()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Y();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Bounds#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see org.omg.dd.dc.Bounds#getWidth()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Width();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Bounds#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see org.omg.dd.dc.Bounds#getHeight()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Height();

    /**
     * Returns the meta object for the '{@link org.omg.dd.dc.Bounds#non_negative_size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non negative size</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Non negative size</em>' operation.
     * @see org.omg.dd.dc.Bounds#non_negative_size(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getBounds__Non_negative_size__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link org.omg.dd.dc.Point <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point</em>'.
     * @see org.omg.dd.dc.Point
     * @generated
     */
    EClass getPoint();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Point#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.omg.dd.dc.Point#getX()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_X();

    /**
     * Returns the meta object for the attribute '{@link org.omg.dd.dc.Point#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.omg.dd.dc.Point#getY()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_Y();

    /**
     * Returns the meta object for enum '{@link org.omg.dd.dc.AlignmentKind <em>Alignment Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Alignment Kind</em>'.
     * @see org.omg.dd.dc.AlignmentKind
     * @generated
     */
    EEnum getAlignmentKind();

    /**
     * Returns the meta object for enum '{@link org.omg.dd.dc.KnownColor <em>Known Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Known Color</em>'.
     * @see org.omg.dd.dc.KnownColor
     * @generated
     */
    EEnum getKnownColor();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DCFactory getDCFactory();

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
         * The meta object literal for the '{@link org.omg.dd.dc.impl.ColorImpl <em>Color</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dc.impl.ColorImpl
         * @see org.omg.dd.dc.impl.DCPackageImpl#getColor()
         * @generated
         */
        EClass COLOR = eINSTANCE.getColor();

        /**
         * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLOR__RED = eINSTANCE.getColor_Red();

        /**
         * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

        /**
         * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

        /**
         * The meta object literal for the '<em><b>Valid rgb</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COLOR___VALID_RGB__DIAGNOSTICCHAIN_MAP = eINSTANCE.getColor__Valid_rgb__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dc.impl.DimensionImpl <em>Dimension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dc.impl.DimensionImpl
         * @see org.omg.dd.dc.impl.DCPackageImpl#getDimension()
         * @generated
         */
        EClass DIMENSION = eINSTANCE.getDimension();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

        /**
         * The meta object literal for the '<em><b>Non negative dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation DIMENSION___NON_NEGATIVE_DIMENSION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDimension__Non_negative_dimension__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dc.impl.BoundsImpl <em>Bounds</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dc.impl.BoundsImpl
         * @see org.omg.dd.dc.impl.DCPackageImpl#getBounds()
         * @generated
         */
        EClass BOUNDS = eINSTANCE.getBounds();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

        /**
         * The meta object literal for the '<em><b>Non negative size</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation BOUNDS___NON_NEGATIVE_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBounds__Non_negative_size__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link org.omg.dd.dc.impl.PointImpl <em>Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dc.impl.PointImpl
         * @see org.omg.dd.dc.impl.DCPackageImpl#getPoint()
         * @generated
         */
        EClass POINT = eINSTANCE.getPoint();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__X = eINSTANCE.getPoint_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__Y = eINSTANCE.getPoint_Y();

        /**
         * The meta object literal for the '{@link org.omg.dd.dc.AlignmentKind <em>Alignment Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dc.AlignmentKind
         * @see org.omg.dd.dc.impl.DCPackageImpl#getAlignmentKind()
         * @generated
         */
        EEnum ALIGNMENT_KIND = eINSTANCE.getAlignmentKind();

        /**
         * The meta object literal for the '{@link org.omg.dd.dc.KnownColor <em>Known Color</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.omg.dd.dc.KnownColor
         * @see org.omg.dd.dc.impl.DCPackageImpl#getKnownColor()
         * @generated
         */
        EEnum KNOWN_COLOR = eINSTANCE.getKnownColor();

    }

} //DCPackage
