/**
 */
package org.pavanecce.vdml.metamodel.vdml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.pavanecce.vdml.metamodel.vdml.Activity;
import org.pavanecce.vdml.metamodel.vdml.Actor;
import org.pavanecce.vdml.metamodel.vdml.AnalysisContext;
import org.pavanecce.vdml.metamodel.vdml.Annotation;
import org.pavanecce.vdml.metamodel.vdml.Assignment;
import org.pavanecce.vdml.metamodel.vdml.Attribute;
import org.pavanecce.vdml.metamodel.vdml.BusinessItem;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemLibraryElement;
import org.pavanecce.vdml.metamodel.vdml.BusinessNetwork;
import org.pavanecce.vdml.metamodel.vdml.CalendarService;
import org.pavanecce.vdml.metamodel.vdml.Capability;
import org.pavanecce.vdml.metamodel.vdml.CapabilityCategory;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDependency;
import org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary;
import org.pavanecce.vdml.metamodel.vdml.CapabilityMethod;
import org.pavanecce.vdml.metamodel.vdml.CapabilityOffer;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.Community;
import org.pavanecce.vdml.metamodel.vdml.DelegationContext;
import org.pavanecce.vdml.metamodel.vdml.DeliverableFlow;
import org.pavanecce.vdml.metamodel.vdml.Expression;
import org.pavanecce.vdml.metamodel.vdml.InputDelegation;
import org.pavanecce.vdml.metamodel.vdml.InputPort;
import org.pavanecce.vdml.metamodel.vdml.MeasurableElement;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.Member;
import org.pavanecce.vdml.metamodel.vdml.Operand;
import org.pavanecce.vdml.metamodel.vdml.OrgUnit;
import org.pavanecce.vdml.metamodel.vdml.OutputDelegation;
import org.pavanecce.vdml.metamodel.vdml.OutputPort;
import org.pavanecce.vdml.metamodel.vdml.Participant;
import org.pavanecce.vdml.metamodel.vdml.Party;
import org.pavanecce.vdml.metamodel.vdml.Performer;
import org.pavanecce.vdml.metamodel.vdml.Person;
import org.pavanecce.vdml.metamodel.vdml.Pool;
import org.pavanecce.vdml.metamodel.vdml.Port;
import org.pavanecce.vdml.metamodel.vdml.PortContainer;
import org.pavanecce.vdml.metamodel.vdml.PortDelegation;
import org.pavanecce.vdml.metamodel.vdml.Position;
import org.pavanecce.vdml.metamodel.vdml.PracticeCategory;
import org.pavanecce.vdml.metamodel.vdml.PracticeDefinition;
import org.pavanecce.vdml.metamodel.vdml.PracticeLibrary;
import org.pavanecce.vdml.metamodel.vdml.ReleaseControl;
import org.pavanecce.vdml.metamodel.vdml.ResourceUse;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.RoleCategory;
import org.pavanecce.vdml.metamodel.vdml.RoleDefinition;
import org.pavanecce.vdml.metamodel.vdml.RoleLibrary;
import org.pavanecce.vdml.metamodel.vdml.Scenario;
import org.pavanecce.vdml.metamodel.vdml.Store;
import org.pavanecce.vdml.metamodel.vdml.ValueAdd;
import org.pavanecce.vdml.metamodel.vdml.ValueCategory;
import org.pavanecce.vdml.metamodel.vdml.ValueDefinition;
import org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel;
import org.pavanecce.vdml.metamodel.vdml.ValueElement;
import org.pavanecce.vdml.metamodel.vdml.ValueLibrary;
import org.pavanecce.vdml.metamodel.vdml.ValueProposition;
import org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdml.integer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage
 * @generated
 */
public class VdmlAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VdmlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = VdmlPackage.eINSTANCE;
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
    protected VdmlSwitch<Adapter> modelSwitch =
        new VdmlSwitch<Adapter>() {
            @Override
            public Adapter caseValueDeliveryModel(ValueDeliveryModel object) {
                return createValueDeliveryModelAdapter();
            }
            @Override
            public Adapter caseVdmlElement(VdmlElement object) {
                return createVdmlElementAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseAnnotation(Annotation object) {
                return createAnnotationAdapter();
            }
            @Override
            public Adapter caseValueLibrary(ValueLibrary object) {
                return createValueLibraryAdapter();
            }
            @Override
            public Adapter caseValueDefinition(ValueDefinition object) {
                return createValueDefinitionAdapter();
            }
            @Override
            public Adapter caseValueCategory(ValueCategory object) {
                return createValueCategoryAdapter();
            }
            @Override
            public Adapter caseCapabilityLibrary(CapabilityLibrary object) {
                return createCapabilityLibraryAdapter();
            }
            @Override
            public Adapter caseCapability(Capability object) {
                return createCapabilityAdapter();
            }
            @Override
            public Adapter caseCapabilityDependency(CapabilityDependency object) {
                return createCapabilityDependencyAdapter();
            }
            @Override
            public Adapter caseBusinessItemDefinition(BusinessItemDefinition object) {
                return createBusinessItemDefinitionAdapter();
            }
            @Override
            public Adapter caseBusinessItemLibraryElement(BusinessItemLibraryElement object) {
                return createBusinessItemLibraryElementAdapter();
            }
            @Override
            public Adapter casePracticeDefinition(PracticeDefinition object) {
                return createPracticeDefinitionAdapter();
            }
            @Override
            public Adapter casePracticeCategory(PracticeCategory object) {
                return createPracticeCategoryAdapter();
            }
            @Override
            public Adapter caseCapabilityDefinition(CapabilityDefinition object) {
                return createCapabilityDefinitionAdapter();
            }
            @Override
            public Adapter caseBusinessItemCategory(BusinessItemCategory object) {
                return createBusinessItemCategoryAdapter();
            }
            @Override
            public Adapter caseBusinessItemLibrary(BusinessItemLibrary object) {
                return createBusinessItemLibraryAdapter();
            }
            @Override
            public Adapter caseActor(Actor object) {
                return createActorAdapter();
            }
            @Override
            public Adapter caseParticipant(Participant object) {
                return createParticipantAdapter();
            }
            @Override
            public Adapter caseMeasurableElement(MeasurableElement object) {
                return createMeasurableElementAdapter();
            }
            @Override
            public Adapter caseMeasuredCharacteristic(MeasuredCharacteristic object) {
                return createMeasuredCharacteristicAdapter();
            }
            @Override
            public Adapter caseAssignment(Assignment object) {
                return createAssignmentAdapter();
            }
            @Override
            public Adapter caseRole(Role object) {
                return createRoleAdapter();
            }
            @Override
            public Adapter caseActivity(Activity object) {
                return createActivityAdapter();
            }
            @Override
            public Adapter casePortContainer(PortContainer object) {
                return createPortContainerAdapter();
            }
            @Override
            public Adapter casePort(Port object) {
                return createPortAdapter();
            }
            @Override
            public Adapter caseExpression(Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public Adapter caseOperand(Operand object) {
                return createOperandAdapter();
            }
            @Override
            public Adapter caseResourceUse(ResourceUse object) {
                return createResourceUseAdapter();
            }
            @Override
            public Adapter caseOutputPort(OutputPort object) {
                return createOutputPortAdapter();
            }
            @Override
            public Adapter caseDeliverableFlow(DeliverableFlow object) {
                return createDeliverableFlowAdapter();
            }
            @Override
            public Adapter caseInputPort(InputPort object) {
                return createInputPortAdapter();
            }
            @Override
            public Adapter caseInputDelegation(InputDelegation object) {
                return createInputDelegationAdapter();
            }
            @Override
            public Adapter casePortDelegation(PortDelegation object) {
                return createPortDelegationAdapter();
            }
            @Override
            public Adapter caseBusinessItem(BusinessItem object) {
                return createBusinessItemAdapter();
            }
            @Override
            public Adapter caseStore(Store object) {
                return createStoreAdapter();
            }
            @Override
            public Adapter caseOrgUnit(OrgUnit object) {
                return createOrgUnitAdapter();
            }
            @Override
            public Adapter caseCollaboration(Collaboration object) {
                return createCollaborationAdapter();
            }
            @Override
            public Adapter caseDelegationContext(DelegationContext object) {
                return createDelegationContextAdapter();
            }
            @Override
            public Adapter caseAnalysisContext(AnalysisContext object) {
                return createAnalysisContextAdapter();
            }
            @Override
            public Adapter caseScenario(Scenario object) {
                return createScenarioAdapter();
            }
            @Override
            public Adapter caseReleaseControl(ReleaseControl object) {
                return createReleaseControlAdapter();
            }
            @Override
            public Adapter caseCapabilityOffer(CapabilityOffer object) {
                return createCapabilityOfferAdapter();
            }
            @Override
            public Adapter caseCapabilityMethod(CapabilityMethod object) {
                return createCapabilityMethodAdapter();
            }
            @Override
            public Adapter casePerformer(Performer object) {
                return createPerformerAdapter();
            }
            @Override
            public Adapter casePosition(Position object) {
                return createPositionAdapter();
            }
            @Override
            public Adapter casePool(Pool object) {
                return createPoolAdapter();
            }
            @Override
            public Adapter caseCalendarService(CalendarService object) {
                return createCalendarServiceAdapter();
            }
            @Override
            public Adapter caseValueAdd(ValueAdd object) {
                return createValueAddAdapter();
            }
            @Override
            public Adapter caseValueElement(ValueElement object) {
                return createValueElementAdapter();
            }
            @Override
            public Adapter caseValuePropositionComponent(ValuePropositionComponent object) {
                return createValuePropositionComponentAdapter();
            }
            @Override
            public Adapter caseOutputDelegation(OutputDelegation object) {
                return createOutputDelegationAdapter();
            }
            @Override
            public Adapter caseValueProposition(ValueProposition object) {
                return createValuePropositionAdapter();
            }
            @Override
            public Adapter caseRoleDefinition(RoleDefinition object) {
                return createRoleDefinitionAdapter();
            }
            @Override
            public Adapter caseRoleCategory(RoleCategory object) {
                return createRoleCategoryAdapter();
            }
            @Override
            public Adapter casePracticeLibrary(PracticeLibrary object) {
                return createPracticeLibraryAdapter();
            }
            @Override
            public Adapter caseRoleLibrary(RoleLibrary object) {
                return createRoleLibraryAdapter();
            }
            @Override
            public Adapter caseBusinessNetwork(BusinessNetwork object) {
                return createBusinessNetworkAdapter();
            }
            @Override
            public Adapter caseParty(Party object) {
                return createPartyAdapter();
            }
            @Override
            public Adapter caseCommunity(Community object) {
                return createCommunityAdapter();
            }
            @Override
            public Adapter caseMember(Member object) {
                return createMemberAdapter();
            }
            @Override
            public Adapter casePerson(Person object) {
                return createPersonAdapter();
            }
            @Override
            public Adapter caseCapabilityCategory(CapabilityCategory object) {
                return createCapabilityCategoryAdapter();
            }
            @Override
            public Adapter caseinteger(integer object) {
                return createintegerAdapter();
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
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel <em>Value Delivery Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel
     * @generated
     */
    public Adapter createValueDeliveryModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.VdmlElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlElement
     * @generated
     */
    public Adapter createVdmlElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Annotation
     * @generated
     */
    public Adapter createAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary <em>Value Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueLibrary
     * @generated
     */
    public Adapter createValueLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueDefinition <em>Value Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueDefinition
     * @generated
     */
    public Adapter createValueDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueCategory <em>Value Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueCategory
     * @generated
     */
    public Adapter createValueCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary <em>Capability Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary
     * @generated
     */
    public Adapter createCapabilityLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Capability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Capability
     * @generated
     */
    public Adapter createCapabilityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency <em>Capability Dependency</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency
     * @generated
     */
    public Adapter createCapabilityDependencyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition <em>Business Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition
     * @generated
     */
    public Adapter createBusinessItemDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemLibraryElement <em>Business Item Library Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemLibraryElement
     * @generated
     */
    public Adapter createBusinessItemLibraryElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition <em>Practice Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition
     * @generated
     */
    public Adapter createPracticeDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory <em>Practice Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory
     * @generated
     */
    public Adapter createPracticeCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition <em>Capability Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition
     * @generated
     */
    public Adapter createCapabilityDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory <em>Business Item Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory
     * @generated
     */
    public Adapter createBusinessItemCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary <em>Business Item Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary
     * @generated
     */
    public Adapter createBusinessItemLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Actor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Actor
     * @generated
     */
    public Adapter createActorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Participant
     * @generated
     */
    public Adapter createParticipantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.MeasurableElement <em>Measurable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasurableElement
     * @generated
     */
    public Adapter createMeasurableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic <em>Measured Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic
     * @generated
     */
    public Adapter createMeasuredCharacteristicAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Role <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Role
     * @generated
     */
    public Adapter createRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.PortContainer <em>Port Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.PortContainer
     * @generated
     */
    public Adapter createPortContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Port
     * @generated
     */
    public Adapter createPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Operand <em>Operand</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Operand
     * @generated
     */
    public Adapter createOperandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse <em>Resource Use</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse
     * @generated
     */
    public Adapter createResourceUseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort <em>Output Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort
     * @generated
     */
    public Adapter createOutputPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow <em>Deliverable Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow
     * @generated
     */
    public Adapter createDeliverableFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.InputPort <em>Input Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort
     * @generated
     */
    public Adapter createInputPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation <em>Input Delegation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.InputDelegation
     * @generated
     */
    public Adapter createInputDelegationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.PortDelegation <em>Port Delegation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.PortDelegation
     * @generated
     */
    public Adapter createPortDelegationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem <em>Business Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem
     * @generated
     */
    public Adapter createBusinessItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Store <em>Store</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Store
     * @generated
     */
    public Adapter createStoreAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit <em>Org Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit
     * @generated
     */
    public Adapter createOrgUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Collaboration
     * @generated
     */
    public Adapter createCollaborationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext <em>Delegation Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext
     * @generated
     */
    public Adapter createDelegationContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext <em>Analysis Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext
     * @generated
     */
    public Adapter createAnalysisContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Scenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario
     * @generated
     */
    public Adapter createScenarioAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl <em>Release Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ReleaseControl
     * @generated
     */
    public Adapter createReleaseControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer <em>Capability Offer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer
     * @generated
     */
    public Adapter createCapabilityOfferAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod <em>Capability Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod
     * @generated
     */
    public Adapter createCapabilityMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Performer
     * @generated
     */
    public Adapter createPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Position <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Position
     * @generated
     */
    public Adapter createPositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Pool <em>Pool</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Pool
     * @generated
     */
    public Adapter createPoolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CalendarService <em>Calendar Service</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CalendarService
     * @generated
     */
    public Adapter createCalendarServiceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd <em>Value Add</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd
     * @generated
     */
    public Adapter createValueAddAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement <em>Value Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueElement
     * @generated
     */
    public Adapter createValueElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent <em>Value Proposition Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent
     * @generated
     */
    public Adapter createValuePropositionComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation <em>Output Delegation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.OutputDelegation
     * @generated
     */
    public Adapter createOutputDelegationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition <em>Value Proposition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.ValueProposition
     * @generated
     */
    public Adapter createValuePropositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition <em>Role Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleDefinition
     * @generated
     */
    public Adapter createRoleDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.RoleCategory <em>Role Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleCategory
     * @generated
     */
    public Adapter createRoleCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary <em>Practice Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeLibrary
     * @generated
     */
    public Adapter createPracticeLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary <em>Role Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.RoleLibrary
     * @generated
     */
    public Adapter createRoleLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.BusinessNetwork <em>Business Network</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessNetwork
     * @generated
     */
    public Adapter createBusinessNetworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Party <em>Party</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Party
     * @generated
     */
    public Adapter createPartyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Community <em>Community</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Community
     * @generated
     */
    public Adapter createCommunityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Member
     * @generated
     */
    public Adapter createMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.Person
     * @generated
     */
    public Adapter createPersonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityCategory <em>Capability Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityCategory
     * @generated
     */
    public Adapter createCapabilityCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdml.integer <em>integer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdml.integer
     * @generated
     */
    public Adapter createintegerAdapter() {
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

} //VdmlAdapterFactory
