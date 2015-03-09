/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dc.impl.DCPackageImpl;
import org.omg.dd.dg.Canvas;
import org.omg.dd.dg.Circle;
import org.omg.dd.dg.ClipPath;
import org.omg.dd.dg.ClosePath;
import org.omg.dd.dg.CubicCurveTo;
import org.omg.dd.dg.DGFactory;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Ellipse;
import org.omg.dd.dg.EllipticalArcTo;
import org.omg.dd.dg.Fill;
import org.omg.dd.dg.Gradient;
import org.omg.dd.dg.GradientStop;
import org.omg.dd.dg.GraphicalElement;
import org.omg.dd.dg.Group;
import org.omg.dd.dg.Image;
import org.omg.dd.dg.Line;
import org.omg.dd.dg.LineTo;
import org.omg.dd.dg.LinearGradient;
import org.omg.dd.dg.MarkedElement;
import org.omg.dd.dg.Marker;
import org.omg.dd.dg.Matrix;
import org.omg.dd.dg.MoveTo;
import org.omg.dd.dg.Path;
import org.omg.dd.dg.PathCommand;
import org.omg.dd.dg.Pattern;
import org.omg.dd.dg.Polygon;
import org.omg.dd.dg.Polyline;
import org.omg.dd.dg.QuadraticCurveTo;
import org.omg.dd.dg.RadialGradient;
import org.omg.dd.dg.Rectangle;
import org.omg.dd.dg.Rotate;
import org.omg.dd.dg.Scale;
import org.omg.dd.dg.Skew;
import org.omg.dd.dg.Text;
import org.omg.dd.dg.Transform;
import org.omg.dd.dg.Translate;
import org.omg.dd.dg.util.DGValidator;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.impl.DIPackageImpl;
import org.omg.dd.primitivetypes.PrimitiveTypesPackage;
import org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DGPackageImpl extends EPackageImpl implements DGPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass radialGradientEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gradientEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fillEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass canvasEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass graphicalElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clipPathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass markerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gradientStopEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass patternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linearGradientEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass markedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rectangleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ellipseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lineEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass polylineEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass polygonEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pathEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pathCommandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass translateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scaleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rotateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass skewEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass imageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass circleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass matrixEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moveToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lineToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cubicCurveToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass quadraticCurveToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ellipticalArcToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass closePathEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.omg.dd.dg.DGPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DGPackageImpl() {
        super(eNS_URI, DGFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link DGPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DGPackage init() {
        if (isInited) return (DGPackage)EPackage.Registry.INSTANCE.getEPackage(DGPackage.eNS_URI);

        // Obtain or create and register package
        DGPackageImpl theDGPackage = (DGPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DGPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DGPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        DIPackageImpl theDIPackage = (DIPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI) instanceof DIPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI) : DIPackage.eINSTANCE);
        DCPackageImpl theDCPackage = (DCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) instanceof DCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) : DCPackage.eINSTANCE);
        PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);

        // Create package meta-data objects
        theDGPackage.createPackageContents();
        theDIPackage.createPackageContents();
        theDCPackage.createPackageContents();
        thePrimitiveTypesPackage.createPackageContents();

        // Initialize created meta-data
        theDGPackage.initializePackageContents();
        theDIPackage.initializePackageContents();
        theDCPackage.initializePackageContents();
        thePrimitiveTypesPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theDGPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return DGValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theDGPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DGPackage.eNS_URI, theDGPackage);
        return theDGPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRadialGradient() {
        return radialGradientEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRadialGradient_CenterX() {
        return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRadialGradient_CenterY() {
        return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRadialGradient_Radius() {
        return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRadialGradient_FocusX() {
        return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRadialGradient_FocusY() {
        return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getRadialGradient__Valid_center_point__DiagnosticChain_Map() {
        return radialGradientEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getRadialGradient__Valid_focus_point__DiagnosticChain_Map() {
        return radialGradientEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getRadialGradient__Valid_radius__DiagnosticChain_Map() {
        return radialGradientEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGradient() {
        return gradientEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGradient_Stop() {
        return (EReference)gradientEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFill() {
        return fillEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFill_Canvas() {
        return (EReference)fillEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFill_Transform() {
        return (EReference)fillEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCanvas() {
        return canvasEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCanvas_BackgroundFill() {
        return (EReference)canvasEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCanvas_BackgroundColor() {
        return (EReference)canvasEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCanvas_PackagedMarker() {
        return (EReference)canvasEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCanvas_PackagedStyle() {
        return (EReference)canvasEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCanvas_PackagedFill() {
        return (EReference)canvasEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroup() {
        return groupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Member() {
        return (EReference)groupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGraphicalElement() {
        return graphicalElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGraphicalElement_Group() {
        return (EReference)graphicalElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGraphicalElement_LocalStyle() {
        return (EReference)graphicalElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGraphicalElement_SharedStyle() {
        return (EReference)graphicalElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGraphicalElement_Transform() {
        return (EReference)graphicalElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGraphicalElement_ClipPath() {
        return (EReference)graphicalElementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransform() {
        return transformEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClipPath() {
        return clipPathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClipPath_ClippedElement() {
        return (EReference)clipPathEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMarker() {
        return markerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarker_Size() {
        return (EReference)markerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarker_Reference() {
        return (EReference)markerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarker_Canvas() {
        return (EReference)markerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGradientStop() {
        return gradientStopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGradientStop_Color() {
        return (EReference)gradientStopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGradientStop_Offset() {
        return (EAttribute)gradientStopEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGradientStop_Opacity() {
        return (EAttribute)gradientStopEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getGradientStop__Valid_offset__DiagnosticChain_Map() {
        return gradientStopEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getGradientStop__Valid_opacity__DiagnosticChain_Map() {
        return gradientStopEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPattern() {
        return patternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPattern_Bounds() {
        return (EReference)patternEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPattern_Tile() {
        return (EReference)patternEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinearGradient() {
        return linearGradientEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinearGradient_X1() {
        return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinearGradient_X2() {
        return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinearGradient_Y1() {
        return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinearGradient_Y2() {
        return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getLinearGradient__Valid_gradient_vector__DiagnosticChain_Map() {
        return linearGradientEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMarkedElement() {
        return markedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarkedElement_StartMarker() {
        return (EReference)markedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarkedElement_EndMarker() {
        return (EReference)markedElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMarkedElement_MidMarker() {
        return (EReference)markedElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRectangle() {
        return rectangleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRectangle_Bounds() {
        return (EReference)rectangleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRectangle_CornerRadius() {
        return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEllipse() {
        return ellipseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEllipse_Center() {
        return (EReference)ellipseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEllipse_Radii() {
        return (EReference)ellipseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getText() {
        return textEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getText_Data() {
        return (EAttribute)textEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getText_Bounds() {
        return (EReference)textEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getText_Alignment() {
        return (EAttribute)textEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLine() {
        return lineEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLine_Start() {
        return (EReference)lineEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLine_End() {
        return (EReference)lineEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPolyline() {
        return polylineEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPolyline_Point() {
        return (EReference)polylineEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPolygon() {
        return polygonEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPolygon_Point() {
        return (EReference)polygonEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPath() {
        return pathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPath_Command() {
        return (EReference)pathEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPathCommand() {
        return pathCommandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPathCommand_IsRelative() {
        return (EAttribute)pathCommandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTranslate() {
        return translateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTranslate_DeltaX() {
        return (EAttribute)translateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTranslate_DeltaY() {
        return (EAttribute)translateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScale() {
        return scaleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScale_FactorX() {
        return (EAttribute)scaleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScale_FactorY() {
        return (EAttribute)scaleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getScale__Nonnegativescale__DiagnosticChain_Map() {
        return scaleEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRotate() {
        return rotateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRotate_Angle() {
        return (EAttribute)rotateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRotate_Center() {
        return (EReference)rotateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSkew() {
        return skewEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSkew_AngleX() {
        return (EAttribute)skewEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSkew_AngleY() {
        return (EAttribute)skewEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImage() {
        return imageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImage_Source() {
        return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getImage_Bounds() {
        return (EReference)imageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImage_IsAspectRatioPreserved() {
        return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCircle() {
        return circleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCircle_Center() {
        return (EReference)circleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCircle_Radius() {
        return (EAttribute)circleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getCircle__Non_negative_radius__DiagnosticChain_Map() {
        return circleEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMatrix() {
        return matrixEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrix_A() {
        return (EAttribute)matrixEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrix_B() {
        return (EAttribute)matrixEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrix_C() {
        return (EAttribute)matrixEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrix_D() {
        return (EAttribute)matrixEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrix_E() {
        return (EAttribute)matrixEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMatrix_F() {
        return (EAttribute)matrixEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMoveTo() {
        return moveToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMoveTo_Point() {
        return (EReference)moveToEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLineTo() {
        return lineToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLineTo_Point() {
        return (EReference)lineToEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCubicCurveTo() {
        return cubicCurveToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCubicCurveTo_Point() {
        return (EReference)cubicCurveToEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCubicCurveTo_StartControl() {
        return (EReference)cubicCurveToEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCubicCurveTo_EndControl() {
        return (EReference)cubicCurveToEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQuadraticCurveTo() {
        return quadraticCurveToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQuadraticCurveTo_Point() {
        return (EReference)quadraticCurveToEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getQuadraticCurveTo_Control() {
        return (EReference)quadraticCurveToEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEllipticalArcTo() {
        return ellipticalArcToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEllipticalArcTo_Point() {
        return (EReference)ellipticalArcToEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEllipticalArcTo_Radii() {
        return (EReference)ellipticalArcToEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEllipticalArcTo_Rotation() {
        return (EAttribute)ellipticalArcToEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEllipticalArcTo_IsLargeArc() {
        return (EAttribute)ellipticalArcToEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEllipticalArcTo_IsSweep() {
        return (EAttribute)ellipticalArcToEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClosePath() {
        return closePathEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DGFactory getDGFactory() {
        return (DGFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        radialGradientEClass = createEClass(RADIAL_GRADIENT);
        createEAttribute(radialGradientEClass, RADIAL_GRADIENT__CENTER_X);
        createEAttribute(radialGradientEClass, RADIAL_GRADIENT__CENTER_Y);
        createEAttribute(radialGradientEClass, RADIAL_GRADIENT__RADIUS);
        createEAttribute(radialGradientEClass, RADIAL_GRADIENT__FOCUS_X);
        createEAttribute(radialGradientEClass, RADIAL_GRADIENT__FOCUS_Y);
        createEOperation(radialGradientEClass, RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP);
        createEOperation(radialGradientEClass, RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP);
        createEOperation(radialGradientEClass, RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP);

        gradientEClass = createEClass(GRADIENT);
        createEReference(gradientEClass, GRADIENT__STOP);

        fillEClass = createEClass(FILL);
        createEReference(fillEClass, FILL__CANVAS);
        createEReference(fillEClass, FILL__TRANSFORM);

        canvasEClass = createEClass(CANVAS);
        createEReference(canvasEClass, CANVAS__BACKGROUND_FILL);
        createEReference(canvasEClass, CANVAS__BACKGROUND_COLOR);
        createEReference(canvasEClass, CANVAS__PACKAGED_MARKER);
        createEReference(canvasEClass, CANVAS__PACKAGED_STYLE);
        createEReference(canvasEClass, CANVAS__PACKAGED_FILL);

        groupEClass = createEClass(GROUP);
        createEReference(groupEClass, GROUP__MEMBER);

        graphicalElementEClass = createEClass(GRAPHICAL_ELEMENT);
        createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__GROUP);
        createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__LOCAL_STYLE);
        createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__SHARED_STYLE);
        createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__TRANSFORM);
        createEReference(graphicalElementEClass, GRAPHICAL_ELEMENT__CLIP_PATH);

        transformEClass = createEClass(TRANSFORM);

        clipPathEClass = createEClass(CLIP_PATH);
        createEReference(clipPathEClass, CLIP_PATH__CLIPPED_ELEMENT);

        markerEClass = createEClass(MARKER);
        createEReference(markerEClass, MARKER__SIZE);
        createEReference(markerEClass, MARKER__REFERENCE);
        createEReference(markerEClass, MARKER__CANVAS);

        gradientStopEClass = createEClass(GRADIENT_STOP);
        createEReference(gradientStopEClass, GRADIENT_STOP__COLOR);
        createEAttribute(gradientStopEClass, GRADIENT_STOP__OFFSET);
        createEAttribute(gradientStopEClass, GRADIENT_STOP__OPACITY);
        createEOperation(gradientStopEClass, GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP);
        createEOperation(gradientStopEClass, GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP);

        patternEClass = createEClass(PATTERN);
        createEReference(patternEClass, PATTERN__BOUNDS);
        createEReference(patternEClass, PATTERN__TILE);

        linearGradientEClass = createEClass(LINEAR_GRADIENT);
        createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X1);
        createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X2);
        createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y1);
        createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y2);
        createEOperation(linearGradientEClass, LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP);

        markedElementEClass = createEClass(MARKED_ELEMENT);
        createEReference(markedElementEClass, MARKED_ELEMENT__START_MARKER);
        createEReference(markedElementEClass, MARKED_ELEMENT__END_MARKER);
        createEReference(markedElementEClass, MARKED_ELEMENT__MID_MARKER);

        rectangleEClass = createEClass(RECTANGLE);
        createEReference(rectangleEClass, RECTANGLE__BOUNDS);
        createEAttribute(rectangleEClass, RECTANGLE__CORNER_RADIUS);

        ellipseEClass = createEClass(ELLIPSE);
        createEReference(ellipseEClass, ELLIPSE__CENTER);
        createEReference(ellipseEClass, ELLIPSE__RADII);

        textEClass = createEClass(TEXT);
        createEAttribute(textEClass, TEXT__DATA);
        createEReference(textEClass, TEXT__BOUNDS);
        createEAttribute(textEClass, TEXT__ALIGNMENT);

        lineEClass = createEClass(LINE);
        createEReference(lineEClass, LINE__START);
        createEReference(lineEClass, LINE__END);

        polylineEClass = createEClass(POLYLINE);
        createEReference(polylineEClass, POLYLINE__POINT);

        polygonEClass = createEClass(POLYGON);
        createEReference(polygonEClass, POLYGON__POINT);

        pathEClass = createEClass(PATH);
        createEReference(pathEClass, PATH__COMMAND);

        pathCommandEClass = createEClass(PATH_COMMAND);
        createEAttribute(pathCommandEClass, PATH_COMMAND__IS_RELATIVE);

        translateEClass = createEClass(TRANSLATE);
        createEAttribute(translateEClass, TRANSLATE__DELTA_X);
        createEAttribute(translateEClass, TRANSLATE__DELTA_Y);

        scaleEClass = createEClass(SCALE);
        createEAttribute(scaleEClass, SCALE__FACTOR_X);
        createEAttribute(scaleEClass, SCALE__FACTOR_Y);
        createEOperation(scaleEClass, SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP);

        rotateEClass = createEClass(ROTATE);
        createEAttribute(rotateEClass, ROTATE__ANGLE);
        createEReference(rotateEClass, ROTATE__CENTER);

        skewEClass = createEClass(SKEW);
        createEAttribute(skewEClass, SKEW__ANGLE_X);
        createEAttribute(skewEClass, SKEW__ANGLE_Y);

        imageEClass = createEClass(IMAGE);
        createEAttribute(imageEClass, IMAGE__SOURCE);
        createEReference(imageEClass, IMAGE__BOUNDS);
        createEAttribute(imageEClass, IMAGE__IS_ASPECT_RATIO_PRESERVED);

        circleEClass = createEClass(CIRCLE);
        createEReference(circleEClass, CIRCLE__CENTER);
        createEAttribute(circleEClass, CIRCLE__RADIUS);
        createEOperation(circleEClass, CIRCLE___NON_NEGATIVE_RADIUS__DIAGNOSTICCHAIN_MAP);

        matrixEClass = createEClass(MATRIX);
        createEAttribute(matrixEClass, MATRIX__A);
        createEAttribute(matrixEClass, MATRIX__B);
        createEAttribute(matrixEClass, MATRIX__C);
        createEAttribute(matrixEClass, MATRIX__D);
        createEAttribute(matrixEClass, MATRIX__E);
        createEAttribute(matrixEClass, MATRIX__F);

        moveToEClass = createEClass(MOVE_TO);
        createEReference(moveToEClass, MOVE_TO__POINT);

        lineToEClass = createEClass(LINE_TO);
        createEReference(lineToEClass, LINE_TO__POINT);

        cubicCurveToEClass = createEClass(CUBIC_CURVE_TO);
        createEReference(cubicCurveToEClass, CUBIC_CURVE_TO__POINT);
        createEReference(cubicCurveToEClass, CUBIC_CURVE_TO__START_CONTROL);
        createEReference(cubicCurveToEClass, CUBIC_CURVE_TO__END_CONTROL);

        quadraticCurveToEClass = createEClass(QUADRATIC_CURVE_TO);
        createEReference(quadraticCurveToEClass, QUADRATIC_CURVE_TO__POINT);
        createEReference(quadraticCurveToEClass, QUADRATIC_CURVE_TO__CONTROL);

        ellipticalArcToEClass = createEClass(ELLIPTICAL_ARC_TO);
        createEReference(ellipticalArcToEClass, ELLIPTICAL_ARC_TO__POINT);
        createEReference(ellipticalArcToEClass, ELLIPTICAL_ARC_TO__RADII);
        createEAttribute(ellipticalArcToEClass, ELLIPTICAL_ARC_TO__ROTATION);
        createEAttribute(ellipticalArcToEClass, ELLIPTICAL_ARC_TO__IS_LARGE_ARC);
        createEAttribute(ellipticalArcToEClass, ELLIPTICAL_ARC_TO__IS_SWEEP);

        closePathEClass = createEClass(CLOSE_PATH);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
        DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
        DIPackage theDIPackage = (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        radialGradientEClass.getESuperTypes().add(this.getGradient());
        gradientEClass.getESuperTypes().add(this.getFill());
        canvasEClass.getESuperTypes().add(this.getGroup());
        groupEClass.getESuperTypes().add(this.getGraphicalElement());
        clipPathEClass.getESuperTypes().add(this.getGroup());
        markerEClass.getESuperTypes().add(this.getGroup());
        patternEClass.getESuperTypes().add(this.getFill());
        linearGradientEClass.getESuperTypes().add(this.getGradient());
        markedElementEClass.getESuperTypes().add(this.getGraphicalElement());
        rectangleEClass.getESuperTypes().add(this.getGraphicalElement());
        ellipseEClass.getESuperTypes().add(this.getGraphicalElement());
        textEClass.getESuperTypes().add(this.getGraphicalElement());
        lineEClass.getESuperTypes().add(this.getMarkedElement());
        polylineEClass.getESuperTypes().add(this.getMarkedElement());
        polygonEClass.getESuperTypes().add(this.getMarkedElement());
        pathEClass.getESuperTypes().add(this.getMarkedElement());
        translateEClass.getESuperTypes().add(this.getTransform());
        scaleEClass.getESuperTypes().add(this.getTransform());
        rotateEClass.getESuperTypes().add(this.getTransform());
        skewEClass.getESuperTypes().add(this.getTransform());
        imageEClass.getESuperTypes().add(this.getGraphicalElement());
        circleEClass.getESuperTypes().add(this.getGraphicalElement());
        matrixEClass.getESuperTypes().add(this.getTransform());
        moveToEClass.getESuperTypes().add(this.getPathCommand());
        lineToEClass.getESuperTypes().add(this.getPathCommand());
        cubicCurveToEClass.getESuperTypes().add(this.getPathCommand());
        quadraticCurveToEClass.getESuperTypes().add(this.getPathCommand());
        ellipticalArcToEClass.getESuperTypes().add(this.getPathCommand());
        closePathEClass.getESuperTypes().add(this.getPathCommand());

        // Initialize classes, features, and operations; add parameters
        initEClass(radialGradientEClass, RadialGradient.class, "RadialGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRadialGradient_CenterX(), thePrimitiveTypesPackage.getReal(), "centerX", "0.5", 1, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getRadialGradient_CenterY(), thePrimitiveTypesPackage.getReal(), "centerY", "0.5", 1, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getRadialGradient_Radius(), thePrimitiveTypesPackage.getReal(), "radius", "0.5", 1, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getRadialGradient_FocusX(), thePrimitiveTypesPackage.getReal(), "focusX", "0.5", 1, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getRadialGradient_FocusY(), thePrimitiveTypesPackage.getReal(), "focusY", "0.5", 1, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = initEOperation(getRadialGradient__Valid_center_point__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_center_point", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getRadialGradient__Valid_focus_point__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_focus_point", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getRadialGradient__Valid_radius__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_radius", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(gradientEClass, Gradient.class, "Gradient", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGradient_Stop(), this.getGradientStop(), null, "stop", null, 2, -1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(fillEClass, Fill.class, "Fill", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFill_Canvas(), this.getCanvas(), this.getCanvas_PackagedFill(), "canvas", null, 1, 1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getFill_Transform(), this.getTransform(), null, "transform", null, 0, -1, Fill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCanvas_BackgroundFill(), this.getFill(), null, "backgroundFill", null, 0, 1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCanvas_BackgroundColor(), theDCPackage.getColor(), null, "backgroundColor", null, 0, 1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCanvas_PackagedMarker(), this.getMarker(), this.getMarker_Canvas(), "packagedMarker", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCanvas_PackagedStyle(), theDIPackage.getStyle(), null, "packagedStyle", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCanvas_PackagedFill(), this.getFill(), this.getFill_Canvas(), "packagedFill", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGroup_Member(), this.getGraphicalElement(), this.getGraphicalElement_Group(), "member", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(graphicalElementEClass, GraphicalElement.class, "GraphicalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGraphicalElement_Group(), this.getGroup(), this.getGroup_Member(), "group", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getGraphicalElement_LocalStyle(), theDIPackage.getStyle(), null, "localStyle", null, 0, -1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGraphicalElement_SharedStyle(), theDIPackage.getStyle(), null, "sharedStyle", null, 0, -1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGraphicalElement_Transform(), this.getTransform(), null, "transform", null, 0, -1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGraphicalElement_ClipPath(), this.getClipPath(), this.getClipPath_ClippedElement(), "clipPath", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(transformEClass, Transform.class, "Transform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(clipPathEClass, ClipPath.class, "ClipPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClipPath_ClippedElement(), this.getGraphicalElement(), this.getGraphicalElement_ClipPath(), "clippedElement", null, 1, 1, ClipPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(markerEClass, Marker.class, "Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMarker_Size(), theDCPackage.getDimension(), null, "size", null, 1, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getMarker_Reference(), theDCPackage.getPoint(), null, "reference", null, 1, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getMarker_Canvas(), this.getCanvas(), this.getCanvas_PackagedMarker(), "canvas", null, 1, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(gradientStopEClass, GradientStop.class, "GradientStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGradientStop_Color(), theDCPackage.getColor(), null, "color", null, 1, 1, GradientStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getGradientStop_Offset(), thePrimitiveTypesPackage.getReal(), "offset", null, 1, 1, GradientStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getGradientStop_Opacity(), thePrimitiveTypesPackage.getReal(), "opacity", "1.0", 1, 1, GradientStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = initEOperation(getGradientStop__Valid_offset__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_offset", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getGradientStop__Valid_opacity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_opacity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPattern_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getPattern_Tile(), this.getGraphicalElement(), null, "tile", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(linearGradientEClass, LinearGradient.class, "LinearGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLinearGradient_X1(), thePrimitiveTypesPackage.getReal(), "x1", "0.0", 1, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getLinearGradient_X2(), thePrimitiveTypesPackage.getReal(), "x2", "1.0", 1, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getLinearGradient_Y1(), thePrimitiveTypesPackage.getReal(), "y1", "0.0", 1, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getLinearGradient_Y2(), thePrimitiveTypesPackage.getReal(), "y2", "1.0", 1, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = initEOperation(getLinearGradient__Valid_gradient_vector__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_gradient_vector", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(markedElementEClass, MarkedElement.class, "MarkedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMarkedElement_StartMarker(), this.getMarker(), null, "startMarker", null, 0, 1, MarkedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getMarkedElement_EndMarker(), this.getMarker(), null, "endMarker", null, 0, 1, MarkedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getMarkedElement_MidMarker(), this.getMarker(), null, "midMarker", null, 0, 1, MarkedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRectangle_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 1, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getRectangle_CornerRadius(), thePrimitiveTypesPackage.getReal(), "cornerRadius", "0.0", 1, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEllipse_Center(), theDCPackage.getPoint(), null, "center", null, 1, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getEllipse_Radii(), theDCPackage.getDimension(), null, "radii", null, 1, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getText_Data(), thePrimitiveTypesPackage.getString(), "data", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getText_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getText_Alignment(), theDCPackage.getAlignmentKind(), "alignment", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLine_Start(), theDCPackage.getPoint(), null, "start", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getLine_End(), theDCPackage.getPoint(), null, "end", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPolyline_Point(), theDCPackage.getPoint(), null, "point", null, 2, -1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPolygon_Point(), theDCPackage.getPoint(), null, "point", null, 3, -1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPath_Command(), this.getPathCommand(), null, "command", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pathCommandEClass, PathCommand.class, "PathCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPathCommand_IsRelative(), thePrimitiveTypesPackage.getBoolean(), "isRelative", "false", 1, 1, PathCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(translateEClass, Translate.class, "Translate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTranslate_DeltaX(), thePrimitiveTypesPackage.getReal(), "deltaX", null, 1, 1, Translate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getTranslate_DeltaY(), thePrimitiveTypesPackage.getReal(), "deltaY", null, 1, 1, Translate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(scaleEClass, Scale.class, "Scale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getScale_FactorX(), thePrimitiveTypesPackage.getReal(), "factorX", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getScale_FactorY(), thePrimitiveTypesPackage.getReal(), "factorY", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = initEOperation(getScale__Nonnegativescale__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonnegativescale", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRotate_Angle(), thePrimitiveTypesPackage.getReal(), "angle", null, 1, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getRotate_Center(), theDCPackage.getPoint(), null, "center", null, 0, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(skewEClass, Skew.class, "Skew", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSkew_AngleX(), thePrimitiveTypesPackage.getReal(), "angleX", null, 1, 1, Skew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getSkew_AngleY(), thePrimitiveTypesPackage.getReal(), "angleY", null, 1, 1, Skew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImage_Source(), thePrimitiveTypesPackage.getString(), "source", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getImage_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getImage_IsAspectRatioPreserved(), thePrimitiveTypesPackage.getBoolean(), "isAspectRatioPreserved", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCircle_Center(), theDCPackage.getPoint(), null, "center", null, 1, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getCircle_Radius(), thePrimitiveTypesPackage.getReal(), "radius", null, 1, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = initEOperation(getCircle__Non_negative_radius__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "non_negative_radius", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMatrix_A(), thePrimitiveTypesPackage.getReal(), "a", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getMatrix_B(), thePrimitiveTypesPackage.getReal(), "b", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getMatrix_C(), thePrimitiveTypesPackage.getReal(), "c", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getMatrix_D(), thePrimitiveTypesPackage.getReal(), "d", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getMatrix_E(), thePrimitiveTypesPackage.getReal(), "e", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getMatrix_F(), thePrimitiveTypesPackage.getReal(), "f", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(moveToEClass, MoveTo.class, "MoveTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMoveTo_Point(), theDCPackage.getPoint(), null, "point", null, 1, 1, MoveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(lineToEClass, LineTo.class, "LineTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLineTo_Point(), theDCPackage.getPoint(), null, "point", null, 1, 1, LineTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(cubicCurveToEClass, CubicCurveTo.class, "CubicCurveTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCubicCurveTo_Point(), theDCPackage.getPoint(), null, "point", null, 1, 1, CubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCubicCurveTo_StartControl(), theDCPackage.getPoint(), null, "startControl", null, 1, 1, CubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getCubicCurveTo_EndControl(), theDCPackage.getPoint(), null, "endControl", null, 1, 1, CubicCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(quadraticCurveToEClass, QuadraticCurveTo.class, "QuadraticCurveTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQuadraticCurveTo_Point(), theDCPackage.getPoint(), null, "point", null, 1, 1, QuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getQuadraticCurveTo_Control(), theDCPackage.getPoint(), null, "control", null, 1, 1, QuadraticCurveTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(ellipticalArcToEClass, EllipticalArcTo.class, "EllipticalArcTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEllipticalArcTo_Point(), theDCPackage.getPoint(), null, "point", null, 1, 1, EllipticalArcTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getEllipticalArcTo_Radii(), theDCPackage.getDimension(), null, "radii", null, 1, 1, EllipticalArcTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getEllipticalArcTo_Rotation(), thePrimitiveTypesPackage.getReal(), "rotation", null, 1, 1, EllipticalArcTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getEllipticalArcTo_IsLargeArc(), thePrimitiveTypesPackage.getBoolean(), "isLargeArc", null, 1, 1, EllipticalArcTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getEllipticalArcTo_IsSweep(), thePrimitiveTypesPackage.getBoolean(), "isSweep", null, 1, 1, EllipticalArcTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(closePathEClass, ClosePath.class, "ClosePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/uml2/2.0.0/UML
        createUMLAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createUMLAnnotations() {
        String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
        addAnnotation
          (getScale__Nonnegativescale__DiagnosticChain_Map(), 
           source, 
           new String[] {
             "originalName", "non-negative-scale"
           });
    }

} //DGPackageImpl
