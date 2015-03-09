/**
 */
package org.omg.dd.dg.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.omg.dd.dg.Canvas;
import org.omg.dd.dg.Circle;
import org.omg.dd.dg.ClipPath;
import org.omg.dd.dg.ClosePath;
import org.omg.dd.dg.CubicCurveTo;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.dd.dg.DGPackage
 * @generated
 */
public class DGAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DGPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DGAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DGPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DGSwitch<Adapter> modelSwitch =
        new DGSwitch<Adapter>() {
            @Override
            public Adapter caseRadialGradient(RadialGradient object) {
                return createRadialGradientAdapter();
            }
            @Override
            public Adapter caseGradient(Gradient object) {
                return createGradientAdapter();
            }
            @Override
            public Adapter caseFill(Fill object) {
                return createFillAdapter();
            }
            @Override
            public Adapter caseCanvas(Canvas object) {
                return createCanvasAdapter();
            }
            @Override
            public Adapter caseGroup(Group object) {
                return createGroupAdapter();
            }
            @Override
            public Adapter caseGraphicalElement(GraphicalElement object) {
                return createGraphicalElementAdapter();
            }
            @Override
            public Adapter caseTransform(Transform object) {
                return createTransformAdapter();
            }
            @Override
            public Adapter caseClipPath(ClipPath object) {
                return createClipPathAdapter();
            }
            @Override
            public Adapter caseMarker(Marker object) {
                return createMarkerAdapter();
            }
            @Override
            public Adapter caseGradientStop(GradientStop object) {
                return createGradientStopAdapter();
            }
            @Override
            public Adapter casePattern(Pattern object) {
                return createPatternAdapter();
            }
            @Override
            public Adapter caseLinearGradient(LinearGradient object) {
                return createLinearGradientAdapter();
            }
            @Override
            public Adapter caseMarkedElement(MarkedElement object) {
                return createMarkedElementAdapter();
            }
            @Override
            public Adapter caseRectangle(Rectangle object) {
                return createRectangleAdapter();
            }
            @Override
            public Adapter caseEllipse(Ellipse object) {
                return createEllipseAdapter();
            }
            @Override
            public Adapter caseText(Text object) {
                return createTextAdapter();
            }
            @Override
            public Adapter caseLine(Line object) {
                return createLineAdapter();
            }
            @Override
            public Adapter casePolyline(Polyline object) {
                return createPolylineAdapter();
            }
            @Override
            public Adapter casePolygon(Polygon object) {
                return createPolygonAdapter();
            }
            @Override
            public Adapter casePath(Path object) {
                return createPathAdapter();
            }
            @Override
            public Adapter casePathCommand(PathCommand object) {
                return createPathCommandAdapter();
            }
            @Override
            public Adapter caseTranslate(Translate object) {
                return createTranslateAdapter();
            }
            @Override
            public Adapter caseScale(Scale object) {
                return createScaleAdapter();
            }
            @Override
            public Adapter caseRotate(Rotate object) {
                return createRotateAdapter();
            }
            @Override
            public Adapter caseSkew(Skew object) {
                return createSkewAdapter();
            }
            @Override
            public Adapter caseImage(Image object) {
                return createImageAdapter();
            }
            @Override
            public Adapter caseCircle(Circle object) {
                return createCircleAdapter();
            }
            @Override
            public Adapter caseMatrix(Matrix object) {
                return createMatrixAdapter();
            }
            @Override
            public Adapter caseMoveTo(MoveTo object) {
                return createMoveToAdapter();
            }
            @Override
            public Adapter caseLineTo(LineTo object) {
                return createLineToAdapter();
            }
            @Override
            public Adapter caseCubicCurveTo(CubicCurveTo object) {
                return createCubicCurveToAdapter();
            }
            @Override
            public Adapter caseQuadraticCurveTo(QuadraticCurveTo object) {
                return createQuadraticCurveToAdapter();
            }
            @Override
            public Adapter caseEllipticalArcTo(EllipticalArcTo object) {
                return createEllipticalArcToAdapter();
            }
            @Override
            public Adapter caseClosePath(ClosePath object) {
                return createClosePathAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.RadialGradient <em>Radial Gradient</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.RadialGradient
     * @generated
     */
    public Adapter createRadialGradientAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Gradient <em>Gradient</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Gradient
     * @generated
     */
    public Adapter createGradientAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Fill <em>Fill</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Fill
     * @generated
     */
    public Adapter createFillAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Canvas <em>Canvas</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Canvas
     * @generated
     */
    public Adapter createCanvasAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Group
     * @generated
     */
    public Adapter createGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.GraphicalElement <em>Graphical Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.GraphicalElement
     * @generated
     */
    public Adapter createGraphicalElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Transform <em>Transform</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Transform
     * @generated
     */
    public Adapter createTransformAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.ClipPath <em>Clip Path</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.ClipPath
     * @generated
     */
    public Adapter createClipPathAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Marker <em>Marker</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Marker
     * @generated
     */
    public Adapter createMarkerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.GradientStop <em>Gradient Stop</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.GradientStop
     * @generated
     */
    public Adapter createGradientStopAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Pattern
     * @generated
     */
    public Adapter createPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.LinearGradient <em>Linear Gradient</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.LinearGradient
     * @generated
     */
    public Adapter createLinearGradientAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.MarkedElement <em>Marked Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.MarkedElement
     * @generated
     */
    public Adapter createMarkedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Rectangle <em>Rectangle</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Rectangle
     * @generated
     */
    public Adapter createRectangleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Ellipse <em>Ellipse</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Ellipse
     * @generated
     */
    public Adapter createEllipseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Text
     * @generated
     */
    public Adapter createTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Line <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Line
     * @generated
     */
    public Adapter createLineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Polyline <em>Polyline</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Polyline
     * @generated
     */
    public Adapter createPolylineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Polygon <em>Polygon</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Polygon
     * @generated
     */
    public Adapter createPolygonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Path <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Path
     * @generated
     */
    public Adapter createPathAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.PathCommand <em>Path Command</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.PathCommand
     * @generated
     */
    public Adapter createPathCommandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Translate <em>Translate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Translate
     * @generated
     */
    public Adapter createTranslateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Scale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Scale
     * @generated
     */
    public Adapter createScaleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Rotate <em>Rotate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Rotate
     * @generated
     */
    public Adapter createRotateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Skew <em>Skew</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Skew
     * @generated
     */
    public Adapter createSkewAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Image <em>Image</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Image
     * @generated
     */
    public Adapter createImageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Circle <em>Circle</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Circle
     * @generated
     */
    public Adapter createCircleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.Matrix <em>Matrix</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.Matrix
     * @generated
     */
    public Adapter createMatrixAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.MoveTo <em>Move To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.MoveTo
     * @generated
     */
    public Adapter createMoveToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.LineTo <em>Line To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.LineTo
     * @generated
     */
    public Adapter createLineToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.CubicCurveTo <em>Cubic Curve To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.CubicCurveTo
     * @generated
     */
    public Adapter createCubicCurveToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.QuadraticCurveTo <em>Quadratic Curve To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.QuadraticCurveTo
     * @generated
     */
    public Adapter createQuadraticCurveToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.EllipticalArcTo <em>Elliptical Arc To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.EllipticalArcTo
     * @generated
     */
    public Adapter createEllipticalArcToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.dg.ClosePath <em>Close Path</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.dg.ClosePath
     * @generated
     */
    public Adapter createClosePathAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DGAdapterFactory
