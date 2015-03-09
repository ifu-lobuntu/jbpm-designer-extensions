/**
 */
package org.omg.dd.dg.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.omg.dd.dg.DGPackage
 * @generated
 */
public class DGValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final DGValidator INSTANCE = new DGValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.omg.dd.dg";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid center point' of 'Radial Gradient'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int RADIAL_GRADIENT__VALID_CENTER_POINT = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid focus point' of 'Radial Gradient'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int RADIAL_GRADIENT__VALID_FOCUS_POINT = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid radius' of 'Radial Gradient'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int RADIAL_GRADIENT__VALID_RADIUS = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid offset' of 'Gradient Stop'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int GRADIENT_STOP__VALID_OFFSET = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid opacity' of 'Gradient Stop'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int GRADIENT_STOP__VALID_OPACITY = 5;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid gradient vector' of 'Linear Gradient'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int LINEAR_GRADIENT__VALID_GRADIENT_VECTOR = 6;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nonnegativescale' of 'Scale'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SCALE__NONNEGATIVESCALE = 7;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non negative radius' of 'Circle'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int CIRCLE__NON_NEGATIVE_RADIUS = 8;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DGValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return DGPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case DGPackage.RADIAL_GRADIENT:
                return validateRadialGradient((RadialGradient)value, diagnostics, context);
            case DGPackage.GRADIENT:
                return validateGradient((Gradient)value, diagnostics, context);
            case DGPackage.FILL:
                return validateFill((Fill)value, diagnostics, context);
            case DGPackage.CANVAS:
                return validateCanvas((Canvas)value, diagnostics, context);
            case DGPackage.GROUP:
                return validateGroup((Group)value, diagnostics, context);
            case DGPackage.GRAPHICAL_ELEMENT:
                return validateGraphicalElement((GraphicalElement)value, diagnostics, context);
            case DGPackage.TRANSFORM:
                return validateTransform((Transform)value, diagnostics, context);
            case DGPackage.CLIP_PATH:
                return validateClipPath((ClipPath)value, diagnostics, context);
            case DGPackage.MARKER:
                return validateMarker((Marker)value, diagnostics, context);
            case DGPackage.GRADIENT_STOP:
                return validateGradientStop((GradientStop)value, diagnostics, context);
            case DGPackage.PATTERN:
                return validatePattern((Pattern)value, diagnostics, context);
            case DGPackage.LINEAR_GRADIENT:
                return validateLinearGradient((LinearGradient)value, diagnostics, context);
            case DGPackage.MARKED_ELEMENT:
                return validateMarkedElement((MarkedElement)value, diagnostics, context);
            case DGPackage.RECTANGLE:
                return validateRectangle((Rectangle)value, diagnostics, context);
            case DGPackage.ELLIPSE:
                return validateEllipse((Ellipse)value, diagnostics, context);
            case DGPackage.TEXT:
                return validateText((Text)value, diagnostics, context);
            case DGPackage.LINE:
                return validateLine((Line)value, diagnostics, context);
            case DGPackage.POLYLINE:
                return validatePolyline((Polyline)value, diagnostics, context);
            case DGPackage.POLYGON:
                return validatePolygon((Polygon)value, diagnostics, context);
            case DGPackage.PATH:
                return validatePath((Path)value, diagnostics, context);
            case DGPackage.PATH_COMMAND:
                return validatePathCommand((PathCommand)value, diagnostics, context);
            case DGPackage.TRANSLATE:
                return validateTranslate((Translate)value, diagnostics, context);
            case DGPackage.SCALE:
                return validateScale((Scale)value, diagnostics, context);
            case DGPackage.ROTATE:
                return validateRotate((Rotate)value, diagnostics, context);
            case DGPackage.SKEW:
                return validateSkew((Skew)value, diagnostics, context);
            case DGPackage.IMAGE:
                return validateImage((Image)value, diagnostics, context);
            case DGPackage.CIRCLE:
                return validateCircle((Circle)value, diagnostics, context);
            case DGPackage.MATRIX:
                return validateMatrix((Matrix)value, diagnostics, context);
            case DGPackage.MOVE_TO:
                return validateMoveTo((MoveTo)value, diagnostics, context);
            case DGPackage.LINE_TO:
                return validateLineTo((LineTo)value, diagnostics, context);
            case DGPackage.CUBIC_CURVE_TO:
                return validateCubicCurveTo((CubicCurveTo)value, diagnostics, context);
            case DGPackage.QUADRATIC_CURVE_TO:
                return validateQuadraticCurveTo((QuadraticCurveTo)value, diagnostics, context);
            case DGPackage.ELLIPTICAL_ARC_TO:
                return validateEllipticalArcTo((EllipticalArcTo)value, diagnostics, context);
            case DGPackage.CLOSE_PATH:
                return validateClosePath((ClosePath)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRadialGradient(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(radialGradient, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validateRadialGradient_valid_center_point(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validateRadialGradient_valid_focus_point(radialGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validateRadialGradient_valid_radius(radialGradient, diagnostics, context);
        return result;
    }

    /**
     * Validates the valid_center_point constraint of '<em>Radial Gradient</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRadialGradient_valid_center_point(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return radialGradient.valid_center_point(diagnostics, context);
    }

    /**
     * Validates the valid_focus_point constraint of '<em>Radial Gradient</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRadialGradient_valid_focus_point(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return radialGradient.valid_focus_point(diagnostics, context);
    }

    /**
     * Validates the valid_radius constraint of '<em>Radial Gradient</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRadialGradient_valid_radius(RadialGradient radialGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return radialGradient.valid_radius(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradient(Gradient gradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gradient, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFill(Fill fill, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(fill, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCanvas(Canvas canvas, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(canvas, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(group, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGraphicalElement(GraphicalElement graphicalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(graphicalElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTransform(Transform transform, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(transform, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateClipPath(ClipPath clipPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(clipPath, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMarker(Marker marker, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(marker, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradientStop(GradientStop gradientStop, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(gradientStop, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validateGradientStop_valid_offset(gradientStop, diagnostics, context);
        if (result || diagnostics != null) result &= validateGradientStop_valid_opacity(gradientStop, diagnostics, context);
        return result;
    }

    /**
     * Validates the valid_offset constraint of '<em>Gradient Stop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradientStop_valid_offset(GradientStop gradientStop, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return gradientStop.valid_offset(diagnostics, context);
    }

    /**
     * Validates the valid_opacity constraint of '<em>Gradient Stop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradientStop_valid_opacity(GradientStop gradientStop, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return gradientStop.valid_opacity(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePattern(Pattern pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pattern, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLinearGradient(LinearGradient linearGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(linearGradient, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linearGradient, diagnostics, context);
        if (result || diagnostics != null) result &= validateLinearGradient_valid_gradient_vector(linearGradient, diagnostics, context);
        return result;
    }

    /**
     * Validates the valid_gradient_vector constraint of '<em>Linear Gradient</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLinearGradient_valid_gradient_vector(LinearGradient linearGradient, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return linearGradient.valid_gradient_vector(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMarkedElement(MarkedElement markedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(markedElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRectangle(Rectangle rectangle, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rectangle, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEllipse(Ellipse ellipse, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ellipse, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(text, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(line, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePolyline(Polyline polyline, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(polyline, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePolygon(Polygon polygon, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(polygon, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(path, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePathCommand(PathCommand pathCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pathCommand, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTranslate(Translate translate, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(translate, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScale(Scale scale, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(scale, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scale, diagnostics, context);
        if (result || diagnostics != null) result &= validateScale_nonnegativescale(scale, diagnostics, context);
        return result;
    }

    /**
     * Validates the nonnegativescale constraint of '<em>Scale</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScale_nonnegativescale(Scale scale, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return scale.nonnegativescale(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRotate(Rotate rotate, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rotate, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSkew(Skew skew, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(skew, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(image, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCircle(Circle circle, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(circle, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(circle, diagnostics, context);
        if (result || diagnostics != null) result &= validateCircle_non_negative_radius(circle, diagnostics, context);
        return result;
    }

    /**
     * Validates the non_negative_radius constraint of '<em>Circle</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCircle_non_negative_radius(Circle circle, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return circle.non_negative_radius(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMatrix(Matrix matrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(matrix, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMoveTo(MoveTo moveTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moveTo, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLineTo(LineTo lineTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(lineTo, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCubicCurveTo(CubicCurveTo cubicCurveTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(cubicCurveTo, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateQuadraticCurveTo(QuadraticCurveTo quadraticCurveTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(quadraticCurveTo, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEllipticalArcTo(EllipticalArcTo ellipticalArcTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ellipticalArcTo, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateClosePath(ClosePath closePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(closePath, diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //DGValidator
