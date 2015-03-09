/**
 */
package org.omg.dd.dg.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jbpm.designer.dd.util.Switch;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.omg.dd.dg.DGPackage
 * @generated
 */
public class DGSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DGPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DGSwitch() {
        if (modelPackage == null) {
            modelPackage = DGPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DGPackage.RADIAL_GRADIENT: {
                RadialGradient radialGradient = (RadialGradient)theEObject;
                T result = caseRadialGradient(radialGradient);
                if (result == null) result = caseGradient(radialGradient);
                if (result == null) result = caseFill(radialGradient);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.GRADIENT: {
                Gradient gradient = (Gradient)theEObject;
                T result = caseGradient(gradient);
                if (result == null) result = caseFill(gradient);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.FILL: {
                Fill fill = (Fill)theEObject;
                T result = caseFill(fill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.CANVAS: {
                Canvas canvas = (Canvas)theEObject;
                T result = caseCanvas(canvas);
                if (result == null) result = caseGroup(canvas);
                if (result == null) result = caseGraphicalElement(canvas);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.GROUP: {
                Group group = (Group)theEObject;
                T result = caseGroup(group);
                if (result == null) result = caseGraphicalElement(group);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.GRAPHICAL_ELEMENT: {
                GraphicalElement graphicalElement = (GraphicalElement)theEObject;
                T result = caseGraphicalElement(graphicalElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.TRANSFORM: {
                Transform transform = (Transform)theEObject;
                T result = caseTransform(transform);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.CLIP_PATH: {
                ClipPath clipPath = (ClipPath)theEObject;
                T result = caseClipPath(clipPath);
                if (result == null) result = caseGroup(clipPath);
                if (result == null) result = caseGraphicalElement(clipPath);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.MARKER: {
                Marker marker = (Marker)theEObject;
                T result = caseMarker(marker);
                if (result == null) result = caseGroup(marker);
                if (result == null) result = caseGraphicalElement(marker);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.GRADIENT_STOP: {
                GradientStop gradientStop = (GradientStop)theEObject;
                T result = caseGradientStop(gradientStop);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.PATTERN: {
                Pattern pattern = (Pattern)theEObject;
                T result = casePattern(pattern);
                if (result == null) result = caseFill(pattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.LINEAR_GRADIENT: {
                LinearGradient linearGradient = (LinearGradient)theEObject;
                T result = caseLinearGradient(linearGradient);
                if (result == null) result = caseGradient(linearGradient);
                if (result == null) result = caseFill(linearGradient);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.MARKED_ELEMENT: {
                MarkedElement markedElement = (MarkedElement)theEObject;
                T result = caseMarkedElement(markedElement);
                if (result == null) result = caseGraphicalElement(markedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.RECTANGLE: {
                Rectangle rectangle = (Rectangle)theEObject;
                T result = caseRectangle(rectangle);
                if (result == null) result = caseGraphicalElement(rectangle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.ELLIPSE: {
                Ellipse ellipse = (Ellipse)theEObject;
                T result = caseEllipse(ellipse);
                if (result == null) result = caseGraphicalElement(ellipse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.TEXT: {
                Text text = (Text)theEObject;
                T result = caseText(text);
                if (result == null) result = caseGraphicalElement(text);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.LINE: {
                Line line = (Line)theEObject;
                T result = caseLine(line);
                if (result == null) result = caseMarkedElement(line);
                if (result == null) result = caseGraphicalElement(line);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.POLYLINE: {
                Polyline polyline = (Polyline)theEObject;
                T result = casePolyline(polyline);
                if (result == null) result = caseMarkedElement(polyline);
                if (result == null) result = caseGraphicalElement(polyline);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.POLYGON: {
                Polygon polygon = (Polygon)theEObject;
                T result = casePolygon(polygon);
                if (result == null) result = caseMarkedElement(polygon);
                if (result == null) result = caseGraphicalElement(polygon);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.PATH: {
                Path path = (Path)theEObject;
                T result = casePath(path);
                if (result == null) result = caseMarkedElement(path);
                if (result == null) result = caseGraphicalElement(path);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.PATH_COMMAND: {
                PathCommand pathCommand = (PathCommand)theEObject;
                T result = casePathCommand(pathCommand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.TRANSLATE: {
                Translate translate = (Translate)theEObject;
                T result = caseTranslate(translate);
                if (result == null) result = caseTransform(translate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.SCALE: {
                Scale scale = (Scale)theEObject;
                T result = caseScale(scale);
                if (result == null) result = caseTransform(scale);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.ROTATE: {
                Rotate rotate = (Rotate)theEObject;
                T result = caseRotate(rotate);
                if (result == null) result = caseTransform(rotate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.SKEW: {
                Skew skew = (Skew)theEObject;
                T result = caseSkew(skew);
                if (result == null) result = caseTransform(skew);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.IMAGE: {
                Image image = (Image)theEObject;
                T result = caseImage(image);
                if (result == null) result = caseGraphicalElement(image);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.CIRCLE: {
                Circle circle = (Circle)theEObject;
                T result = caseCircle(circle);
                if (result == null) result = caseGraphicalElement(circle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.MATRIX: {
                Matrix matrix = (Matrix)theEObject;
                T result = caseMatrix(matrix);
                if (result == null) result = caseTransform(matrix);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.MOVE_TO: {
                MoveTo moveTo = (MoveTo)theEObject;
                T result = caseMoveTo(moveTo);
                if (result == null) result = casePathCommand(moveTo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.LINE_TO: {
                LineTo lineTo = (LineTo)theEObject;
                T result = caseLineTo(lineTo);
                if (result == null) result = casePathCommand(lineTo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.CUBIC_CURVE_TO: {
                CubicCurveTo cubicCurveTo = (CubicCurveTo)theEObject;
                T result = caseCubicCurveTo(cubicCurveTo);
                if (result == null) result = casePathCommand(cubicCurveTo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.QUADRATIC_CURVE_TO: {
                QuadraticCurveTo quadraticCurveTo = (QuadraticCurveTo)theEObject;
                T result = caseQuadraticCurveTo(quadraticCurveTo);
                if (result == null) result = casePathCommand(quadraticCurveTo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.ELLIPTICAL_ARC_TO: {
                EllipticalArcTo ellipticalArcTo = (EllipticalArcTo)theEObject;
                T result = caseEllipticalArcTo(ellipticalArcTo);
                if (result == null) result = casePathCommand(ellipticalArcTo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DGPackage.CLOSE_PATH: {
                ClosePath closePath = (ClosePath)theEObject;
                T result = caseClosePath(closePath);
                if (result == null) result = casePathCommand(closePath);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRadialGradient(RadialGradient object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gradient</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gradient</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradient(Gradient object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFill(Fill object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCanvas(Canvas object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroup(Group object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGraphicalElement(GraphicalElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransform(Transform object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clip Path</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clip Path</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClipPath(ClipPath object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Marker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Marker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMarker(Marker object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gradient Stop</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gradient Stop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradientStop(GradientStop object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePattern(Pattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinearGradient(LinearGradient object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Marked Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Marked Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMarkedElement(MarkedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRectangle(Rectangle object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEllipse(Ellipse object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseText(Text object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLine(Line object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePolyline(Polyline object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePolygon(Polygon object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Path</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePath(Path object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Path Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Path Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePathCommand(PathCommand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Translate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Translate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTranslate(Translate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scale</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scale</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScale(Scale object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRotate(Rotate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Skew</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Skew</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSkew(Skew object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Image</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImage(Image object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCircle(Circle object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMatrix(Matrix object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Move To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Move To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMoveTo(MoveTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLineTo(LineTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cubic Curve To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cubic Curve To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCubicCurveTo(CubicCurveTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quadratic Curve To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quadratic Curve To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuadraticCurveTo(QuadraticCurveTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Elliptical Arc To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Elliptical Arc To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEllipticalArcTo(EllipticalArcTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Close Path</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Close Path</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClosePath(ClosePath object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //DGSwitch
