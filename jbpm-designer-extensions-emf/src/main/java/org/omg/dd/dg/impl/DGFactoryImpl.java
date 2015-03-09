/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.omg.dd.dg.Canvas;
import org.omg.dd.dg.Circle;
import org.omg.dd.dg.ClipPath;
import org.omg.dd.dg.ClosePath;
import org.omg.dd.dg.CubicCurveTo;
import org.omg.dd.dg.DGFactory;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Ellipse;
import org.omg.dd.dg.EllipticalArcTo;
import org.omg.dd.dg.GradientStop;
import org.omg.dd.dg.Group;
import org.omg.dd.dg.Image;
import org.omg.dd.dg.Line;
import org.omg.dd.dg.LineTo;
import org.omg.dd.dg.LinearGradient;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DGFactoryImpl extends EFactoryImpl implements DGFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DGFactory init() {
        try {
            DGFactory theDGFactory = (DGFactory)EPackage.Registry.INSTANCE.getEFactory(DGPackage.eNS_URI);
            if (theDGFactory != null) {
                return theDGFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DGFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DGFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DGPackage.RADIAL_GRADIENT: return createRadialGradient();
            case DGPackage.CANVAS: return createCanvas();
            case DGPackage.GROUP: return createGroup();
            case DGPackage.TRANSFORM: return createTransform();
            case DGPackage.CLIP_PATH: return createClipPath();
            case DGPackage.MARKER: return createMarker();
            case DGPackage.GRADIENT_STOP: return createGradientStop();
            case DGPackage.PATTERN: return createPattern();
            case DGPackage.LINEAR_GRADIENT: return createLinearGradient();
            case DGPackage.RECTANGLE: return createRectangle();
            case DGPackage.ELLIPSE: return createEllipse();
            case DGPackage.TEXT: return createText();
            case DGPackage.LINE: return createLine();
            case DGPackage.POLYLINE: return createPolyline();
            case DGPackage.POLYGON: return createPolygon();
            case DGPackage.PATH: return createPath();
            case DGPackage.PATH_COMMAND: return createPathCommand();
            case DGPackage.TRANSLATE: return createTranslate();
            case DGPackage.SCALE: return createScale();
            case DGPackage.ROTATE: return createRotate();
            case DGPackage.SKEW: return createSkew();
            case DGPackage.IMAGE: return createImage();
            case DGPackage.CIRCLE: return createCircle();
            case DGPackage.MATRIX: return createMatrix();
            case DGPackage.MOVE_TO: return createMoveTo();
            case DGPackage.LINE_TO: return createLineTo();
            case DGPackage.CUBIC_CURVE_TO: return createCubicCurveTo();
            case DGPackage.QUADRATIC_CURVE_TO: return createQuadraticCurveTo();
            case DGPackage.ELLIPTICAL_ARC_TO: return createEllipticalArcTo();
            case DGPackage.CLOSE_PATH: return createClosePath();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RadialGradient createRadialGradient() {
        RadialGradientImpl radialGradient = new RadialGradientImpl();
        return radialGradient;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Canvas createCanvas() {
        CanvasImpl canvas = new CanvasImpl();
        return canvas;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group createGroup() {
        GroupImpl group = new GroupImpl();
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transform createTransform() {
        TransformImpl transform = new TransformImpl();
        return transform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClipPath createClipPath() {
        ClipPathImpl clipPath = new ClipPathImpl();
        return clipPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Marker createMarker() {
        MarkerImpl marker = new MarkerImpl();
        return marker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradientStop createGradientStop() {
        GradientStopImpl gradientStop = new GradientStopImpl();
        return gradientStop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern createPattern() {
        PatternImpl pattern = new PatternImpl();
        return pattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinearGradient createLinearGradient() {
        LinearGradientImpl linearGradient = new LinearGradientImpl();
        return linearGradient;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rectangle createRectangle() {
        RectangleImpl rectangle = new RectangleImpl();
        return rectangle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ellipse createEllipse() {
        EllipseImpl ellipse = new EllipseImpl();
        return ellipse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Text createText() {
        TextImpl text = new TextImpl();
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Line createLine() {
        LineImpl line = new LineImpl();
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Polyline createPolyline() {
        PolylineImpl polyline = new PolylineImpl();
        return polyline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Polygon createPolygon() {
        PolygonImpl polygon = new PolygonImpl();
        return polygon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Path createPath() {
        PathImpl path = new PathImpl();
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PathCommand createPathCommand() {
        PathCommandImpl pathCommand = new PathCommandImpl();
        return pathCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Translate createTranslate() {
        TranslateImpl translate = new TranslateImpl();
        return translate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scale createScale() {
        ScaleImpl scale = new ScaleImpl();
        return scale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rotate createRotate() {
        RotateImpl rotate = new RotateImpl();
        return rotate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Skew createSkew() {
        SkewImpl skew = new SkewImpl();
        return skew;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Image createImage() {
        ImageImpl image = new ImageImpl();
        return image;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Circle createCircle() {
        CircleImpl circle = new CircleImpl();
        return circle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Matrix createMatrix() {
        MatrixImpl matrix = new MatrixImpl();
        return matrix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MoveTo createMoveTo() {
        MoveToImpl moveTo = new MoveToImpl();
        return moveTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LineTo createLineTo() {
        LineToImpl lineTo = new LineToImpl();
        return lineTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CubicCurveTo createCubicCurveTo() {
        CubicCurveToImpl cubicCurveTo = new CubicCurveToImpl();
        return cubicCurveTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuadraticCurveTo createQuadraticCurveTo() {
        QuadraticCurveToImpl quadraticCurveTo = new QuadraticCurveToImpl();
        return quadraticCurveTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EllipticalArcTo createEllipticalArcTo() {
        EllipticalArcToImpl ellipticalArcTo = new EllipticalArcToImpl();
        return ellipticalArcTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClosePath createClosePath() {
        ClosePathImpl closePath = new ClosePathImpl();
        return closePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DGPackage getDGPackage() {
        return (DGPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DGPackage getPackage() {
        return DGPackage.eINSTANCE;
    }

} //DGFactoryImpl
