/**
 */
package org.omg.smm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.omg.smm.AbstractMeasureElement;
import org.omg.smm.Accumulator;
import org.omg.smm.Annotation;
import org.omg.smm.Argument;
import org.omg.smm.Attribute;
import org.omg.smm.Base1MeasureRelationship;
import org.omg.smm.Base1MeasurementRelationship;
import org.omg.smm.Base2MeasureRelationship;
import org.omg.smm.Base2MeasurementRelationship;
import org.omg.smm.BaseMeasureRelationship;
import org.omg.smm.BaseMeasurementRelationship;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.BaseNMeasurementRelationship;
import org.omg.smm.BinaryFunctor;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.BinaryMeasurement;
import org.omg.smm.CategoryRelationship;
import org.omg.smm.Characteristic;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.CollectiveMeasurement;
import org.omg.smm.CountingMeasure;
import org.omg.smm.CountingMeasurement;
import org.omg.smm.DimensionalMeasure;
import org.omg.smm.DimensionalMeasurement;
import org.omg.smm.DirectMeasure;
import org.omg.smm.DirectMeasurement;
import org.omg.smm.EObject;
import org.omg.smm.EquivalentMeasureRelationship;
import org.omg.smm.EquivalentMeasurementRelationship;
import org.omg.smm.GradeInterval;
import org.omg.smm.GradeMeasure;
import org.omg.smm.GradeMeasureRelationship;
import org.omg.smm.GradeMeasurement;
import org.omg.smm.GradeMeasurementRelationship;
import org.omg.smm.Influence;
import org.omg.smm.Interval;
import org.omg.smm.Measure;
import org.omg.smm.MeasureCategory;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.MeasureRelationship;
import org.omg.smm.Measurement;
import org.omg.smm.MeasurementRelationship;
import org.omg.smm.MeasurementScale;
import org.omg.smm.NamedMeasure;
import org.omg.smm.NamedMeasurement;
import org.omg.smm.OCLOperation;
import org.omg.smm.Observation;
import org.omg.smm.ObservationScope;
import org.omg.smm.ObservedMeasure;
import org.omg.smm.Operation;
import org.omg.smm.RankingInterval;
import org.omg.smm.RankingMeasure;
import org.omg.smm.RankingMeasureRelationship;
import org.omg.smm.RankingMeasurement;
import org.omg.smm.RankingMeasurementRelationship;
import org.omg.smm.RatioMeasure;
import org.omg.smm.RatioMeasurement;
import org.omg.smm.RefinementMeasureRelationship;
import org.omg.smm.RefinementMeasurementRelationship;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.RescaledMeasureRelationship;
import org.omg.smm.RescaledMeasurement;
import org.omg.smm.RescaledMeasurementRelationship;
import org.omg.smm.SMMPackage;
import org.omg.smm.ScaleOfMeasurement;
import org.omg.smm.Scope;
import org.omg.smm.SmmElement;
import org.omg.smm.SmmModel;
import org.omg.smm.SmmRelationship;
import org.omg.smm.UnitOfMeasure;
import org.omg.smm.string;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.omg.smm.SMMPackage
 * @generated
 */
public class SMMValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final SMMValidator INSTANCE = new SMMValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.omg.smm";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Specified' of 'Scope'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SCOPE__IS_SPECIFIED = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
    public SMMValidator() {
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
      return SMMPackage.eINSTANCE;
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
            case SMMPackage.ABSTRACT_MEASURE_ELEMENT:
                return validateAbstractMeasureElement((AbstractMeasureElement)value, diagnostics, context);
            case SMMPackage.SMM_ELEMENT:
                return validateSmmElement((SmmElement)value, diagnostics, context);
            case SMMPackage.STRING:
                return validatestring((string)value, diagnostics, context);
            case SMMPackage.SMM_RELATIONSHIP:
                return validateSmmRelationship((SmmRelationship)value, diagnostics, context);
            case SMMPackage.ATTRIBUTE:
                return validateAttribute((Attribute)value, diagnostics, context);
            case SMMPackage.ANNOTATION:
                return validateAnnotation((Annotation)value, diagnostics, context);
            case SMMPackage.ARGUMENT:
                return validateArgument((Argument)value, diagnostics, context);
            case SMMPackage.OBSERVED_MEASURE:
                return validateObservedMeasure((ObservedMeasure)value, diagnostics, context);
            case SMMPackage.MEASUREMENT:
                return validateMeasurement((Measurement)value, diagnostics, context);
            case SMMPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP:
                return validateEquivalentMeasurementRelationship((EquivalentMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.MEASUREMENT_RELATIONSHIP:
                return validateMeasurementRelationship((MeasurementRelationship)value, diagnostics, context);
            case SMMPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP:
                return validateRefinementMeasurementRelationship((RefinementMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.MEASURE:
                return validateMeasure((Measure)value, diagnostics, context);
            case SMMPackage.REFINEMENT_MEASURE_RELATIONSHIP:
                return validateRefinementMeasureRelationship((RefinementMeasureRelationship)value, diagnostics, context);
            case SMMPackage.MEASURE_RELATIONSHIP:
                return validateMeasureRelationship((MeasureRelationship)value, diagnostics, context);
            case SMMPackage.OPERATION:
                return validateOperation((Operation)value, diagnostics, context);
            case SMMPackage.EQUIVALENT_MEASURE_RELATIONSHIP:
                return validateEquivalentMeasureRelationship((EquivalentMeasureRelationship)value, diagnostics, context);
            case SMMPackage.MEASURE_CATEGORY:
                return validateMeasureCategory((MeasureCategory)value, diagnostics, context);
            case SMMPackage.SCOPE:
                return validateScope((Scope)value, diagnostics, context);
            case SMMPackage.CHARACTERISTIC:
                return validateCharacteristic((Characteristic)value, diagnostics, context);
            case SMMPackage.BASE1_MEASURE_RELATIONSHIP:
                return validateBase1MeasureRelationship((Base1MeasureRelationship)value, diagnostics, context);
            case SMMPackage.BASE_MEASURE_RELATIONSHIP:
                return validateBaseMeasureRelationship((BaseMeasureRelationship)value, diagnostics, context);
            case SMMPackage.RESCALED_MEASURE:
                return validateRescaledMeasure((RescaledMeasure)value, diagnostics, context);
            case SMMPackage.DIMENSIONAL_MEASURE:
                return validateDimensionalMeasure((DimensionalMeasure)value, diagnostics, context);
            case SMMPackage.BASE_NMEASURE_RELATIONSHIP:
                return validateBaseNMeasureRelationship((BaseNMeasureRelationship)value, diagnostics, context);
            case SMMPackage.COLLECTIVE_MEASURE:
                return validateCollectiveMeasure((CollectiveMeasure)value, diagnostics, context);
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP:
                return validateBase2MeasureRelationship((Base2MeasureRelationship)value, diagnostics, context);
            case SMMPackage.BINARY_MEASURE:
                return validateBinaryMeasure((BinaryMeasure)value, diagnostics, context);
            case SMMPackage.RANKING_MEASURE_RELATIONSHIP:
                return validateRankingMeasureRelationship((RankingMeasureRelationship)value, diagnostics, context);
            case SMMPackage.RANKING_MEASURE:
                return validateRankingMeasure((RankingMeasure)value, diagnostics, context);
            case SMMPackage.RANKING_INTERVAL:
                return validateRankingInterval((RankingInterval)value, diagnostics, context);
            case SMMPackage.INTERVAL:
                return validateInterval((Interval)value, diagnostics, context);
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP:
                return validateRescaledMeasureRelationship((RescaledMeasureRelationship)value, diagnostics, context);
            case SMMPackage.GRADE_MEASURE_RELATIONSHIP:
                return validateGradeMeasureRelationship((GradeMeasureRelationship)value, diagnostics, context);
            case SMMPackage.GRADE_MEASURE:
                return validateGradeMeasure((GradeMeasure)value, diagnostics, context);
            case SMMPackage.GRADE_INTERVAL:
                return validateGradeInterval((GradeInterval)value, diagnostics, context);
            case SMMPackage.UNIT_OF_MEASURE:
                return validateUnitOfMeasure((UnitOfMeasure)value, diagnostics, context);
            case SMMPackage.BASE1_MEASUREMENT_RELATIONSHIP:
                return validateBase1MeasurementRelationship((Base1MeasurementRelationship)value, diagnostics, context);
            case SMMPackage.BASE_MEASUREMENT_RELATIONSHIP:
                return validateBaseMeasurementRelationship((BaseMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.DIMENSIONAL_MEASUREMENT:
                return validateDimensionalMeasurement((DimensionalMeasurement)value, diagnostics, context);
            case SMMPackage.BASE_NMEASUREMENT_RELATIONSHIP:
                return validateBaseNMeasurementRelationship((BaseNMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.COLLECTIVE_MEASUREMENT:
                return validateCollectiveMeasurement((CollectiveMeasurement)value, diagnostics, context);
            case SMMPackage.BASE2_MEASUREMENT_RELATIONSHIP:
                return validateBase2MeasurementRelationship((Base2MeasurementRelationship)value, diagnostics, context);
            case SMMPackage.BINARY_MEASUREMENT:
                return validateBinaryMeasurement((BinaryMeasurement)value, diagnostics, context);
            case SMMPackage.GRADE_MEASUREMENT_RELATIONSHIP:
                return validateGradeMeasurementRelationship((GradeMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.GRADE_MEASUREMENT:
                return validateGradeMeasurement((GradeMeasurement)value, diagnostics, context);
            case SMMPackage.RESCALED_MEASUREMENT_RELATIONSHIP:
                return validateRescaledMeasurementRelationship((RescaledMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.RESCALED_MEASUREMENT:
                return validateRescaledMeasurement((RescaledMeasurement)value, diagnostics, context);
            case SMMPackage.RANKING_MEASUREMENT_RELATIONSHIP:
                return validateRankingMeasurementRelationship((RankingMeasurementRelationship)value, diagnostics, context);
            case SMMPackage.RANKING_MEASUREMENT:
                return validateRankingMeasurement((RankingMeasurement)value, diagnostics, context);
            case SMMPackage.CATEGORY_RELATIONSHIP:
                return validateCategoryRelationship((CategoryRelationship)value, diagnostics, context);
            case SMMPackage.COUNTING_MEASUREMENT:
                return validateCountingMeasurement((CountingMeasurement)value, diagnostics, context);
            case SMMPackage.DIRECT_MEASUREMENT:
                return validateDirectMeasurement((DirectMeasurement)value, diagnostics, context);
            case SMMPackage.COUNTING_MEASURE:
                return validateCountingMeasure((CountingMeasure)value, diagnostics, context);
            case SMMPackage.DIRECT_MEASURE:
                return validateDirectMeasure((DirectMeasure)value, diagnostics, context);
            case SMMPackage.MEASURE_LIBRARY:
                return validateMeasureLibrary((MeasureLibrary)value, diagnostics, context);
            case SMMPackage.NAMED_MEASURE:
                return validateNamedMeasure((NamedMeasure)value, diagnostics, context);
            case SMMPackage.NAMED_MEASUREMENT:
                return validateNamedMeasurement((NamedMeasurement)value, diagnostics, context);
            case SMMPackage.OCL_OPERATION:
                return validateOCLOperation((OCLOperation)value, diagnostics, context);
            case SMMPackage.OBSERVATION:
                return validateObservation((Observation)value, diagnostics, context);
            case SMMPackage.OBSERVATION_SCOPE:
                return validateObservationScope((ObservationScope)value, diagnostics, context);
            case SMMPackage.RATIO_MEASURE:
                return validateRatioMeasure((RatioMeasure)value, diagnostics, context);
            case SMMPackage.RATIO_MEASUREMENT:
                return validateRatioMeasurement((RatioMeasurement)value, diagnostics, context);
            case SMMPackage.EOBJECT:
                return validateEObject((EObject)value, diagnostics, context);
            case SMMPackage.SMM_MODEL:
                return validateSmmModel((SmmModel)value, diagnostics, context);
            case SMMPackage.ACCUMULATOR:
                return validateAccumulator((Accumulator)value, diagnostics, context);
            case SMMPackage.INFLUENCE:
                return validateInfluence((Influence)value, diagnostics, context);
            case SMMPackage.SCALE_OF_MEASUREMENT:
                return validateScaleOfMeasurement((ScaleOfMeasurement)value, diagnostics, context);
            case SMMPackage.BINARY_FUNCTOR:
                return validateBinaryFunctor((BinaryFunctor)value, diagnostics, context);
            case SMMPackage.MEASUREMENT_SCALE:
                return validateMeasurementScale((MeasurementScale)value, diagnostics, context);
            case SMMPackage.TIME_STAMP:
                return validateTimeStamp((Object)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAbstractMeasureElement(AbstractMeasureElement abstractMeasureElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(abstractMeasureElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSmmElement(SmmElement smmElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(smmElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatestring(string string, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(string, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSmmRelationship(SmmRelationship smmRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(smmRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(attribute, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(annotation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(argument, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateObservedMeasure(ObservedMeasure observedMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(observedMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasurement(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(measurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEquivalentMeasurementRelationship(EquivalentMeasurementRelationship equivalentMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(equivalentMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasurementRelationship(MeasurementRelationship measurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(measurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRefinementMeasurementRelationship(RefinementMeasurementRelationship refinementMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(refinementMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(measure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRefinementMeasureRelationship(RefinementMeasureRelationship refinementMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(refinementMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasureRelationship(MeasureRelationship measureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(measureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(operation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEquivalentMeasureRelationship(EquivalentMeasureRelationship equivalentMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(equivalentMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasureCategory(MeasureCategory measureCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(measureCategory, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(scope, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scope, diagnostics, context);
        if (result || diagnostics != null) result &= validateScope_IsSpecified(scope, diagnostics, context);
        return result;
    }

    /**
     * Validates the IsSpecified constraint of '<em>Scope</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScope_IsSpecified(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return scope.IsSpecified(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCharacteristic(Characteristic characteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characteristic, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBase1MeasureRelationship(Base1MeasureRelationship base1MeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(base1MeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBaseMeasureRelationship(BaseMeasureRelationship baseMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(baseMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRescaledMeasure(RescaledMeasure rescaledMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rescaledMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDimensionalMeasure(DimensionalMeasure dimensionalMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(dimensionalMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBaseNMeasureRelationship(BaseNMeasureRelationship baseNMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(baseNMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCollectiveMeasure(CollectiveMeasure collectiveMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(collectiveMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBase2MeasureRelationship(Base2MeasureRelationship base2MeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(base2MeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBinaryMeasure(BinaryMeasure binaryMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(binaryMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRankingMeasureRelationship(RankingMeasureRelationship rankingMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rankingMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRankingMeasure(RankingMeasure rankingMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rankingMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRankingInterval(RankingInterval rankingInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rankingInterval, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(interval, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRescaledMeasureRelationship(RescaledMeasureRelationship rescaledMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rescaledMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradeMeasureRelationship(GradeMeasureRelationship gradeMeasureRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gradeMeasureRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradeMeasure(GradeMeasure gradeMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gradeMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradeInterval(GradeInterval gradeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gradeInterval, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUnitOfMeasure(UnitOfMeasure unitOfMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(unitOfMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBase1MeasurementRelationship(Base1MeasurementRelationship base1MeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(base1MeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBaseMeasurementRelationship(BaseMeasurementRelationship baseMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(baseMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDimensionalMeasurement(DimensionalMeasurement dimensionalMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(dimensionalMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBaseNMeasurementRelationship(BaseNMeasurementRelationship baseNMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(baseNMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCollectiveMeasurement(CollectiveMeasurement collectiveMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(collectiveMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBase2MeasurementRelationship(Base2MeasurementRelationship base2MeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(base2MeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBinaryMeasurement(BinaryMeasurement binaryMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(binaryMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradeMeasurementRelationship(GradeMeasurementRelationship gradeMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gradeMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGradeMeasurement(GradeMeasurement gradeMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gradeMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRescaledMeasurementRelationship(RescaledMeasurementRelationship rescaledMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rescaledMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRescaledMeasurement(RescaledMeasurement rescaledMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rescaledMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRankingMeasurementRelationship(RankingMeasurementRelationship rankingMeasurementRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rankingMeasurementRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRankingMeasurement(RankingMeasurement rankingMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rankingMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCategoryRelationship(CategoryRelationship categoryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(categoryRelationship, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCountingMeasurement(CountingMeasurement countingMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(countingMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDirectMeasurement(DirectMeasurement directMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(directMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCountingMeasure(CountingMeasure countingMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(countingMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDirectMeasure(DirectMeasure directMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(directMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasureLibrary(MeasureLibrary measureLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(measureLibrary, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNamedMeasure(NamedMeasure namedMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(namedMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNamedMeasurement(NamedMeasurement namedMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(namedMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateOCLOperation(OCLOperation oclOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(oclOperation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(observation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateObservationScope(ObservationScope observationScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(observationScope, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRatioMeasure(RatioMeasure ratioMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ratioMeasure, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRatioMeasurement(RatioMeasurement ratioMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(ratioMeasurement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEObject(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(eObject, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSmmModel(SmmModel smmModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(smmModel, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAccumulator(Accumulator accumulator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInfluence(Influence influence, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScaleOfMeasurement(ScaleOfMeasurement scaleOfMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBinaryFunctor(BinaryFunctor binaryFunctor, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMeasurementScale(MeasurementScale measurementScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTimeStamp(Object timeStamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
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

} //SMMValidator
