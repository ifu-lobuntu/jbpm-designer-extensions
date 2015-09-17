/**
 */
package org.omg.vdml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.omg.vdml.*;
import org.omg.vdml.Activity;
import org.omg.vdml.Actor;
import org.omg.vdml.AnalysisContext;
import org.omg.vdml.Annotation;
import org.omg.vdml.Assignment;
import org.omg.vdml.Attribute;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.BusinessItemCategory;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.BusinessNetwork;
import org.omg.vdml.CalendarService;
import org.omg.vdml.Capability;
import org.omg.vdml.CapabilityCategory;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.CapabilityDependency;
import org.omg.vdml.CapabilityLibrary;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Community;
import org.omg.vdml.DelegationContext;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Expression;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.MeasurableElement;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Member;
import org.omg.vdml.Operand;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Participant;
import org.omg.vdml.Party;
import org.omg.vdml.Performer;
import org.omg.vdml.Person;
import org.omg.vdml.Pool;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.PortDelegation;
import org.omg.vdml.Position;
import org.omg.vdml.PracticeCategory;
import org.omg.vdml.PracticeDefinition;
import org.omg.vdml.PracticeLibrary;
import org.omg.vdml.ReleaseControl;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.RoleCategory;
import org.omg.vdml.RoleDefinition;
import org.omg.vdml.RoleLibrary;
import org.omg.vdml.Scenario;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueCategory;
import org.omg.vdml.ValueDefinition;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueElement;
import org.omg.vdml.ValueLibrary;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.vdml.VDMLPackage
 * @generated
 */
public class VDMLAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static VDMLPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VDMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VDMLPackage.eINSTANCE;
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
    protected VDMLSwitch<Adapter> modelSwitch =
        new VDMLSwitch<Adapter>() {
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
			public Adapter caseOutputDelegation(OutputDelegation object) {
				return createOutputDelegationAdapter();
			}
			@Override
			public Adapter caseValueProposition(ValueProposition object) {
				return createValuePropositionAdapter();
			}
			@Override
			public Adapter caseValuePropositionComponent(ValuePropositionComponent object) {
				return createValuePropositionComponentAdapter();
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
			public Adapter caseStoreLibrary(StoreLibrary object) {
				return createStoreLibraryAdapter();
			}
			@Override
			public Adapter caseStoreDefinition(StoreDefinition object) {
				return createStoreDefinitionAdapter();
			}
			@Override
			public Adapter caseSupplyingStore(SupplyingStore object) {
				return createSupplyingStoreAdapter();
			}
			@Override
			public Adapter casePoolDefinition(PoolDefinition object) {
				return createPoolDefinitionAdapter();
			}
			@Override
			public Adapter caseSupplyingPool(SupplyingPool object) {
				return createSupplyingPoolAdapter();
			}
			@Override
			public Adapter caseExchangeConfiguration(ExchangeConfiguration object) {
				return createExchangeConfigurationAdapter();
			}
			@Override
			public Adapter caseMilestone(Milestone object) {
				return createMilestoneAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueDeliveryModel <em>Value Delivery Model</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueDeliveryModel
	 * @generated
	 */
    public Adapter createValueDeliveryModelAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.VdmlElement <em>Vdml Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.VdmlElement
	 * @generated
	 */
    public Adapter createVdmlElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Attribute
	 * @generated
	 */
    public Adapter createAttributeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Annotation
	 * @generated
	 */
    public Adapter createAnnotationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueLibrary <em>Value Library</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueLibrary
	 * @generated
	 */
    public Adapter createValueLibraryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueDefinition
	 * @generated
	 */
    public Adapter createValueDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueCategory <em>Value Category</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueCategory
	 * @generated
	 */
    public Adapter createValueCategoryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CapabilityLibrary <em>Capability Library</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CapabilityLibrary
	 * @generated
	 */
    public Adapter createCapabilityLibraryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Capability
	 * @generated
	 */
    public Adapter createCapabilityAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CapabilityDependency <em>Capability Dependency</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CapabilityDependency
	 * @generated
	 */
    public Adapter createCapabilityDependencyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.BusinessItemDefinition <em>Business Item Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.BusinessItemDefinition
	 * @generated
	 */
    public Adapter createBusinessItemDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.BusinessItemLibraryElement <em>Business Item Library Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.BusinessItemLibraryElement
	 * @generated
	 */
    public Adapter createBusinessItemLibraryElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.PracticeDefinition <em>Practice Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.PracticeDefinition
	 * @generated
	 */
    public Adapter createPracticeDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.PracticeCategory <em>Practice Category</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.PracticeCategory
	 * @generated
	 */
    public Adapter createPracticeCategoryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CapabilityDefinition <em>Capability Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CapabilityDefinition
	 * @generated
	 */
    public Adapter createCapabilityDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.BusinessItemCategory <em>Business Item Category</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.BusinessItemCategory
	 * @generated
	 */
    public Adapter createBusinessItemCategoryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.BusinessItemLibrary <em>Business Item Library</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.BusinessItemLibrary
	 * @generated
	 */
    public Adapter createBusinessItemLibraryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Actor
	 * @generated
	 */
    public Adapter createActorAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Participant
	 * @generated
	 */
    public Adapter createParticipantAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.MeasurableElement <em>Measurable Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.MeasurableElement
	 * @generated
	 */
    public Adapter createMeasurableElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.MeasuredCharacteristic <em>Measured Characteristic</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.MeasuredCharacteristic
	 * @generated
	 */
    public Adapter createMeasuredCharacteristicAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Assignment
	 * @generated
	 */
    public Adapter createAssignmentAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Role
	 * @generated
	 */
    public Adapter createRoleAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Activity
	 * @generated
	 */
    public Adapter createActivityAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.PortContainer <em>Port Container</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.PortContainer
	 * @generated
	 */
    public Adapter createPortContainerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Port
	 * @generated
	 */
    public Adapter createPortAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Expression
	 * @generated
	 */
    public Adapter createExpressionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Operand
	 * @generated
	 */
    public Adapter createOperandAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ResourceUse <em>Resource Use</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ResourceUse
	 * @generated
	 */
    public Adapter createResourceUseAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.OutputPort
	 * @generated
	 */
    public Adapter createOutputPortAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.DeliverableFlow <em>Deliverable Flow</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.DeliverableFlow
	 * @generated
	 */
    public Adapter createDeliverableFlowAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.InputPort
	 * @generated
	 */
    public Adapter createInputPortAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.InputDelegation <em>Input Delegation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.InputDelegation
	 * @generated
	 */
    public Adapter createInputDelegationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.PortDelegation <em>Port Delegation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.PortDelegation
	 * @generated
	 */
    public Adapter createPortDelegationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.BusinessItem <em>Business Item</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.BusinessItem
	 * @generated
	 */
    public Adapter createBusinessItemAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Store
	 * @generated
	 */
    public Adapter createStoreAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.OrgUnit <em>Org Unit</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.OrgUnit
	 * @generated
	 */
    public Adapter createOrgUnitAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Collaboration
	 * @generated
	 */
    public Adapter createCollaborationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.DelegationContext <em>Delegation Context</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.DelegationContext
	 * @generated
	 */
    public Adapter createDelegationContextAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.AnalysisContext <em>Analysis Context</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.AnalysisContext
	 * @generated
	 */
    public Adapter createAnalysisContextAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Scenario
	 * @generated
	 */
    public Adapter createScenarioAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ReleaseControl <em>Release Control</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ReleaseControl
	 * @generated
	 */
    public Adapter createReleaseControlAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CapabilityOffer <em>Capability Offer</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CapabilityOffer
	 * @generated
	 */
    public Adapter createCapabilityOfferAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CapabilityMethod <em>Capability Method</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CapabilityMethod
	 * @generated
	 */
    public Adapter createCapabilityMethodAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Performer
	 * @generated
	 */
    public Adapter createPerformerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Position
	 * @generated
	 */
    public Adapter createPositionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Pool
	 * @generated
	 */
    public Adapter createPoolAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CalendarService <em>Calendar Service</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CalendarService
	 * @generated
	 */
    public Adapter createCalendarServiceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueAdd <em>Value Add</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueAdd
	 * @generated
	 */
    public Adapter createValueAddAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueElement
	 * @generated
	 */
    public Adapter createValueElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.OutputDelegation <em>Output Delegation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.OutputDelegation
	 * @generated
	 */
    public Adapter createOutputDelegationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValueProposition <em>Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValueProposition
	 * @generated
	 */
    public Adapter createValuePropositionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ValuePropositionComponent <em>Value Proposition Component</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ValuePropositionComponent
	 * @generated
	 */
    public Adapter createValuePropositionComponentAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.RoleDefinition <em>Role Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.RoleDefinition
	 * @generated
	 */
    public Adapter createRoleDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.RoleCategory <em>Role Category</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.RoleCategory
	 * @generated
	 */
    public Adapter createRoleCategoryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.PracticeLibrary <em>Practice Library</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.PracticeLibrary
	 * @generated
	 */
    public Adapter createPracticeLibraryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.RoleLibrary <em>Role Library</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.RoleLibrary
	 * @generated
	 */
    public Adapter createRoleLibraryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.BusinessNetwork <em>Business Network</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.BusinessNetwork
	 * @generated
	 */
    public Adapter createBusinessNetworkAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Party
	 * @generated
	 */
    public Adapter createPartyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Community
	 * @generated
	 */
    public Adapter createCommunityAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Member
	 * @generated
	 */
    public Adapter createMemberAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Person
	 * @generated
	 */
    public Adapter createPersonAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.CapabilityCategory <em>Capability Category</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.CapabilityCategory
	 * @generated
	 */
    public Adapter createCapabilityCategoryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.StoreLibrary <em>Store Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.StoreLibrary
	 * @generated
	 */
	public Adapter createStoreLibraryAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.StoreDefinition <em>Store Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.StoreDefinition
	 * @generated
	 */
	public Adapter createStoreDefinitionAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.SupplyingStore <em>Supplying Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.SupplyingStore
	 * @generated
	 */
	public Adapter createSupplyingStoreAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.PoolDefinition <em>Pool Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.PoolDefinition
	 * @generated
	 */
	public Adapter createPoolDefinitionAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.SupplyingPool <em>Supplying Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.SupplyingPool
	 * @generated
	 */
	public Adapter createSupplyingPoolAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.ExchangeConfiguration <em>Exchange Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.ExchangeConfiguration
	 * @generated
	 */
	public Adapter createExchangeConfigurationAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for an object of class '{@link org.omg.vdml.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.vdml.Milestone
	 * @generated
	 */
	public Adapter createMilestoneAdapter() {
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

} //VDMLAdapterFactory
