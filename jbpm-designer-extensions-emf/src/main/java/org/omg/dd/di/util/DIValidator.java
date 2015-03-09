/**
 */
package org.omg.dd.di.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;
import org.omg.dd.di.Shape;
import org.omg.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.omg.dd.di.DIPackage
 * @generated
 */
public class DIValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final DIValidator INSTANCE = new DIValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.omg.dd.di";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid font size' of 'Style'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int STYLE__VALID_FONT_SIZE = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid fill opacity' of 'Style'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int STYLE__VALID_FILL_OPACITY = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid stroke width' of 'Style'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int STYLE__VALID_STROKE_WIDTH = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid dash length size' of 'Style'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int STYLE__VALID_DASH_LENGTH_SIZE = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid stroke opacity' of 'Style'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int STYLE__VALID_STROKE_OPACITY = 5;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

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
    public DIValidator() {
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
      return DIPackage.eINSTANCE;
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
            case DIPackage.DIAGRAM_ELEMENT:
                return validateDiagramElement((DiagramElement)value, diagnostics, context);
            case DIPackage.EDGE:
                return validateEdge((Edge)value, diagnostics, context);
            case DIPackage.DIAGRAM:
                return validateDiagram((Diagram)value, diagnostics, context);
            case DIPackage.SHAPE:
                return validateShape((Shape)value, diagnostics, context);
            case DIPackage.STYLE:
                return validateStyle((Style)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDiagramElement(DiagramElement diagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(diagramElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(edge, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(diagram, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(shape, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(style, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(style, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(style, diagnostics, context);
        if (result || diagnostics != null) result &= validateStyle_valid_font_size(style, diagnostics, context);
        if (result || diagnostics != null) result &= validateStyle_valid_fill_opacity(style, diagnostics, context);
        if (result || diagnostics != null) result &= validateStyle_valid_stroke_width(style, diagnostics, context);
        if (result || diagnostics != null) result &= validateStyle_valid_dash_length_size(style, diagnostics, context);
        if (result || diagnostics != null) result &= validateStyle_valid_stroke_opacity(style, diagnostics, context);
        return result;
    }

    /**
     * Validates the valid_font_size constraint of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle_valid_font_size(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return style.valid_font_size(diagnostics, context);
    }

    /**
     * Validates the valid_fill_opacity constraint of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle_valid_fill_opacity(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return style.valid_fill_opacity(diagnostics, context);
    }

    /**
     * Validates the valid_stroke_width constraint of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle_valid_stroke_width(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return style.valid_stroke_width(diagnostics, context);
    }

    /**
     * Validates the valid_dash_length_size constraint of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle_valid_dash_length_size(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return style.valid_dash_length_size(diagnostics, context);
    }

    /**
     * Validates the valid_stroke_opacity constraint of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle_valid_stroke_opacity(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return style.valid_stroke_opacity(diagnostics, context);
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

} //DIValidator
