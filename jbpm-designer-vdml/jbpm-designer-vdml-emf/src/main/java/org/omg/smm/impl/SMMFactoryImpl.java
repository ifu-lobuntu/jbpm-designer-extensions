/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.omg.smm.Accumulator;
import org.omg.smm.Annotation;
import org.omg.smm.Argument;
import org.omg.smm.Attribute;
import org.omg.smm.Base1MeasureRelationship;
import org.omg.smm.Base1MeasurementRelationship;
import org.omg.smm.Base2MeasureRelationship;
import org.omg.smm.Base2MeasurementRelationship;
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
import org.omg.smm.DirectMeasure;
import org.omg.smm.DirectMeasurement;
import org.omg.smm.EquivalentMeasureRelationship;
import org.omg.smm.EquivalentMeasurementRelationship;
import org.omg.smm.GradeInterval;
import org.omg.smm.GradeMeasure;
import org.omg.smm.GradeMeasureRelationship;
import org.omg.smm.GradeMeasurement;
import org.omg.smm.GradeMeasurementRelationship;
import org.omg.smm.Influence;
import org.omg.smm.MeasureCategory;
import org.omg.smm.MeasureLibrary;
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
import org.omg.smm.SMMFactory;
import org.omg.smm.SMMPackage;
import org.omg.smm.ScaleOfMeasurement;
import org.omg.smm.Scope;
import org.omg.smm.SmmModel;
import org.omg.smm.UnitOfMeasure;
import org.omg.smm.string;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SMMFactoryImpl extends EFactoryImpl implements SMMFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SMMFactory init() {
        try {
            SMMFactory theSMMFactory = (SMMFactory)EPackage.Registry.INSTANCE.getEFactory(SMMPackage.eNS_URI);
            if (theSMMFactory != null) {
                return theSMMFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SMMFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMFactoryImpl() {
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
            case SMMPackage.STRING: return createstring();
            case SMMPackage.ATTRIBUTE: return createAttribute();
            case SMMPackage.ANNOTATION: return createAnnotation();
            case SMMPackage.ARGUMENT: return createArgument();
            case SMMPackage.OBSERVED_MEASURE: return createObservedMeasure();
            case SMMPackage.EQUIVALENT_MEASUREMENT_RELATIONSHIP: return createEquivalentMeasurementRelationship();
            case SMMPackage.REFINEMENT_MEASUREMENT_RELATIONSHIP: return createRefinementMeasurementRelationship();
            case SMMPackage.REFINEMENT_MEASURE_RELATIONSHIP: return createRefinementMeasureRelationship();
            case SMMPackage.OPERATION: return createOperation();
            case SMMPackage.EQUIVALENT_MEASURE_RELATIONSHIP: return createEquivalentMeasureRelationship();
            case SMMPackage.MEASURE_CATEGORY: return createMeasureCategory();
            case SMMPackage.SCOPE: return createScope();
            case SMMPackage.CHARACTERISTIC: return createCharacteristic();
            case SMMPackage.BASE1_MEASURE_RELATIONSHIP: return createBase1MeasureRelationship();
            case SMMPackage.RESCALED_MEASURE: return createRescaledMeasure();
            case SMMPackage.BASE_NMEASURE_RELATIONSHIP: return createBaseNMeasureRelationship();
            case SMMPackage.COLLECTIVE_MEASURE: return createCollectiveMeasure();
            case SMMPackage.BASE2_MEASURE_RELATIONSHIP: return createBase2MeasureRelationship();
            case SMMPackage.BINARY_MEASURE: return createBinaryMeasure();
            case SMMPackage.RANKING_MEASURE_RELATIONSHIP: return createRankingMeasureRelationship();
            case SMMPackage.RANKING_MEASURE: return createRankingMeasure();
            case SMMPackage.RANKING_INTERVAL: return createRankingInterval();
            case SMMPackage.RESCALED_MEASURE_RELATIONSHIP: return createRescaledMeasureRelationship();
            case SMMPackage.GRADE_MEASURE_RELATIONSHIP: return createGradeMeasureRelationship();
            case SMMPackage.GRADE_MEASURE: return createGradeMeasure();
            case SMMPackage.GRADE_INTERVAL: return createGradeInterval();
            case SMMPackage.UNIT_OF_MEASURE: return createUnitOfMeasure();
            case SMMPackage.BASE1_MEASUREMENT_RELATIONSHIP: return createBase1MeasurementRelationship();
            case SMMPackage.BASE_NMEASUREMENT_RELATIONSHIP: return createBaseNMeasurementRelationship();
            case SMMPackage.COLLECTIVE_MEASUREMENT: return createCollectiveMeasurement();
            case SMMPackage.BASE2_MEASUREMENT_RELATIONSHIP: return createBase2MeasurementRelationship();
            case SMMPackage.BINARY_MEASUREMENT: return createBinaryMeasurement();
            case SMMPackage.GRADE_MEASUREMENT_RELATIONSHIP: return createGradeMeasurementRelationship();
            case SMMPackage.GRADE_MEASUREMENT: return createGradeMeasurement();
            case SMMPackage.RESCALED_MEASUREMENT_RELATIONSHIP: return createRescaledMeasurementRelationship();
            case SMMPackage.RESCALED_MEASUREMENT: return createRescaledMeasurement();
            case SMMPackage.RANKING_MEASUREMENT_RELATIONSHIP: return createRankingMeasurementRelationship();
            case SMMPackage.RANKING_MEASUREMENT: return createRankingMeasurement();
            case SMMPackage.CATEGORY_RELATIONSHIP: return createCategoryRelationship();
            case SMMPackage.COUNTING_MEASUREMENT: return createCountingMeasurement();
            case SMMPackage.DIRECT_MEASUREMENT: return createDirectMeasurement();
            case SMMPackage.COUNTING_MEASURE: return createCountingMeasure();
            case SMMPackage.DIRECT_MEASURE: return createDirectMeasure();
            case SMMPackage.MEASURE_LIBRARY: return createMeasureLibrary();
            case SMMPackage.NAMED_MEASURE: return createNamedMeasure();
            case SMMPackage.NAMED_MEASUREMENT: return createNamedMeasurement();
            case SMMPackage.OCL_OPERATION: return createOCLOperation();
            case SMMPackage.OBSERVATION: return createObservation();
            case SMMPackage.OBSERVATION_SCOPE: return createObservationScope();
            case SMMPackage.RATIO_MEASURE: return createRatioMeasure();
            case SMMPackage.RATIO_MEASUREMENT: return createRatioMeasurement();
            case SMMPackage.EOBJECT: return createEObject();
            case SMMPackage.SMM_MODEL: return createSmmModel();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SMMPackage.ACCUMULATOR:
                return createAccumulatorFromString(eDataType, initialValue);
            case SMMPackage.INFLUENCE:
                return createInfluenceFromString(eDataType, initialValue);
            case SMMPackage.SCALE_OF_MEASUREMENT:
                return createScaleOfMeasurementFromString(eDataType, initialValue);
            case SMMPackage.BINARY_FUNCTOR:
                return createBinaryFunctorFromString(eDataType, initialValue);
            case SMMPackage.MEASUREMENT_SCALE:
                return createMeasurementScaleFromString(eDataType, initialValue);
            case SMMPackage.TIME_STAMP:
                return createTimeStampFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SMMPackage.ACCUMULATOR:
                return convertAccumulatorToString(eDataType, instanceValue);
            case SMMPackage.INFLUENCE:
                return convertInfluenceToString(eDataType, instanceValue);
            case SMMPackage.SCALE_OF_MEASUREMENT:
                return convertScaleOfMeasurementToString(eDataType, instanceValue);
            case SMMPackage.BINARY_FUNCTOR:
                return convertBinaryFunctorToString(eDataType, instanceValue);
            case SMMPackage.MEASUREMENT_SCALE:
                return convertMeasurementScaleToString(eDataType, instanceValue);
            case SMMPackage.TIME_STAMP:
                return convertTimeStampToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string createstring() {
        stringImpl string = new stringImpl();
        return string;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Annotation createAnnotation() {
        AnnotationImpl annotation = new AnnotationImpl();
        return annotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Argument createArgument() {
        ArgumentImpl argument = new ArgumentImpl();
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservedMeasure createObservedMeasure() {
        ObservedMeasureImpl observedMeasure = new ObservedMeasureImpl();
        return observedMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EquivalentMeasurementRelationship createEquivalentMeasurementRelationship() {
        EquivalentMeasurementRelationshipImpl equivalentMeasurementRelationship = new EquivalentMeasurementRelationshipImpl();
        return equivalentMeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementMeasurementRelationship createRefinementMeasurementRelationship() {
        RefinementMeasurementRelationshipImpl refinementMeasurementRelationship = new RefinementMeasurementRelationshipImpl();
        return refinementMeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementMeasureRelationship createRefinementMeasureRelationship() {
        RefinementMeasureRelationshipImpl refinementMeasureRelationship = new RefinementMeasureRelationshipImpl();
        return refinementMeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EquivalentMeasureRelationship createEquivalentMeasureRelationship() {
        EquivalentMeasureRelationshipImpl equivalentMeasureRelationship = new EquivalentMeasureRelationshipImpl();
        return equivalentMeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasureCategory createMeasureCategory() {
        MeasureCategoryImpl measureCategory = new MeasureCategoryImpl();
        return measureCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope createScope() {
        ScopeImpl scope = new ScopeImpl();
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic createCharacteristic() {
        CharacteristicImpl characteristic = new CharacteristicImpl();
        return characteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Base1MeasureRelationship createBase1MeasureRelationship() {
        Base1MeasureRelationshipImpl base1MeasureRelationship = new Base1MeasureRelationshipImpl();
        return base1MeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RescaledMeasure createRescaledMeasure() {
        RescaledMeasureImpl rescaledMeasure = new RescaledMeasureImpl();
        return rescaledMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseNMeasureRelationship createBaseNMeasureRelationship() {
        BaseNMeasureRelationshipImpl baseNMeasureRelationship = new BaseNMeasureRelationshipImpl();
        return baseNMeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectiveMeasure createCollectiveMeasure() {
        CollectiveMeasureImpl collectiveMeasure = new CollectiveMeasureImpl();
        return collectiveMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Base2MeasureRelationship createBase2MeasureRelationship() {
        Base2MeasureRelationshipImpl base2MeasureRelationship = new Base2MeasureRelationshipImpl();
        return base2MeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryMeasure createBinaryMeasure() {
        BinaryMeasureImpl binaryMeasure = new BinaryMeasureImpl();
        return binaryMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RankingMeasureRelationship createRankingMeasureRelationship() {
        RankingMeasureRelationshipImpl rankingMeasureRelationship = new RankingMeasureRelationshipImpl();
        return rankingMeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RankingMeasure createRankingMeasure() {
        RankingMeasureImpl rankingMeasure = new RankingMeasureImpl();
        return rankingMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RankingInterval createRankingInterval() {
        RankingIntervalImpl rankingInterval = new RankingIntervalImpl();
        return rankingInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RescaledMeasureRelationship createRescaledMeasureRelationship() {
        RescaledMeasureRelationshipImpl rescaledMeasureRelationship = new RescaledMeasureRelationshipImpl();
        return rescaledMeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradeMeasureRelationship createGradeMeasureRelationship() {
        GradeMeasureRelationshipImpl gradeMeasureRelationship = new GradeMeasureRelationshipImpl();
        return gradeMeasureRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradeMeasure createGradeMeasure() {
        GradeMeasureImpl gradeMeasure = new GradeMeasureImpl();
        return gradeMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradeInterval createGradeInterval() {
        GradeIntervalImpl gradeInterval = new GradeIntervalImpl();
        return gradeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitOfMeasure createUnitOfMeasure() {
        UnitOfMeasureImpl unitOfMeasure = new UnitOfMeasureImpl();
        return unitOfMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Base1MeasurementRelationship createBase1MeasurementRelationship() {
        Base1MeasurementRelationshipImpl base1MeasurementRelationship = new Base1MeasurementRelationshipImpl();
        return base1MeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseNMeasurementRelationship createBaseNMeasurementRelationship() {
        BaseNMeasurementRelationshipImpl baseNMeasurementRelationship = new BaseNMeasurementRelationshipImpl();
        return baseNMeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectiveMeasurement createCollectiveMeasurement() {
        CollectiveMeasurementImpl collectiveMeasurement = new CollectiveMeasurementImpl();
        return collectiveMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Base2MeasurementRelationship createBase2MeasurementRelationship() {
        Base2MeasurementRelationshipImpl base2MeasurementRelationship = new Base2MeasurementRelationshipImpl();
        return base2MeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryMeasurement createBinaryMeasurement() {
        BinaryMeasurementImpl binaryMeasurement = new BinaryMeasurementImpl();
        return binaryMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradeMeasurementRelationship createGradeMeasurementRelationship() {
        GradeMeasurementRelationshipImpl gradeMeasurementRelationship = new GradeMeasurementRelationshipImpl();
        return gradeMeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradeMeasurement createGradeMeasurement() {
        GradeMeasurementImpl gradeMeasurement = new GradeMeasurementImpl();
        return gradeMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RescaledMeasurementRelationship createRescaledMeasurementRelationship() {
        RescaledMeasurementRelationshipImpl rescaledMeasurementRelationship = new RescaledMeasurementRelationshipImpl();
        return rescaledMeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RescaledMeasurement createRescaledMeasurement() {
        RescaledMeasurementImpl rescaledMeasurement = new RescaledMeasurementImpl();
        return rescaledMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RankingMeasurementRelationship createRankingMeasurementRelationship() {
        RankingMeasurementRelationshipImpl rankingMeasurementRelationship = new RankingMeasurementRelationshipImpl();
        return rankingMeasurementRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RankingMeasurement createRankingMeasurement() {
        RankingMeasurementImpl rankingMeasurement = new RankingMeasurementImpl();
        return rankingMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CategoryRelationship createCategoryRelationship() {
        CategoryRelationshipImpl categoryRelationship = new CategoryRelationshipImpl();
        return categoryRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CountingMeasurement createCountingMeasurement() {
        CountingMeasurementImpl countingMeasurement = new CountingMeasurementImpl();
        return countingMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectMeasurement createDirectMeasurement() {
        DirectMeasurementImpl directMeasurement = new DirectMeasurementImpl();
        return directMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CountingMeasure createCountingMeasure() {
        CountingMeasureImpl countingMeasure = new CountingMeasureImpl();
        return countingMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectMeasure createDirectMeasure() {
        DirectMeasureImpl directMeasure = new DirectMeasureImpl();
        return directMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasureLibrary createMeasureLibrary() {
        MeasureLibraryImpl measureLibrary = new MeasureLibraryImpl();
        return measureLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedMeasure createNamedMeasure() {
        NamedMeasureImpl namedMeasure = new NamedMeasureImpl();
        return namedMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedMeasurement createNamedMeasurement() {
        NamedMeasurementImpl namedMeasurement = new NamedMeasurementImpl();
        return namedMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OCLOperation createOCLOperation() {
        OCLOperationImpl oclOperation = new OCLOperationImpl();
        return oclOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Observation createObservation() {
        ObservationImpl observation = new ObservationImpl();
        return observation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservationScope createObservationScope() {
        ObservationScopeImpl observationScope = new ObservationScopeImpl();
        return observationScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RatioMeasure createRatioMeasure() {
        RatioMeasureImpl ratioMeasure = new RatioMeasureImpl();
        return ratioMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RatioMeasurement createRatioMeasurement() {
        RatioMeasurementImpl ratioMeasurement = new RatioMeasurementImpl();
        return ratioMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.omg.smm.EObject createEObject() {
        EObjectImpl eObject = new EObjectImpl();
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmModel createSmmModel() {
        SmmModelImpl smmModel = new SmmModelImpl();
        return smmModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Accumulator createAccumulatorFromString(EDataType eDataType, String initialValue) {
        Accumulator result = Accumulator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAccumulatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Influence createInfluenceFromString(EDataType eDataType, String initialValue) {
        Influence result = Influence.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInfluenceToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScaleOfMeasurement createScaleOfMeasurementFromString(EDataType eDataType, String initialValue) {
        ScaleOfMeasurement result = ScaleOfMeasurement.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertScaleOfMeasurementToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryFunctor createBinaryFunctorFromString(EDataType eDataType, String initialValue) {
        BinaryFunctor result = BinaryFunctor.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBinaryFunctorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementScale createMeasurementScaleFromString(EDataType eDataType, String initialValue) {
        MeasurementScale result = MeasurementScale.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMeasurementScaleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createTimeStampFromString(EDataType eDataType, String initialValue) {
        return (Object)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeStampToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMPackage getSMMPackage() {
        return (SMMPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SMMPackage getPackage() {
        return SMMPackage.eINSTANCE;
    }

} //SMMFactoryImpl
