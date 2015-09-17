/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.omg.vdml.*;
import org.omg.vdml.Activity;
import org.omg.vdml.Actor;
import org.omg.vdml.Annotation;
import org.omg.vdml.Assignment;
import org.omg.vdml.Attribute;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.BusinessItemCategory;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.BusinessNetwork;
import org.omg.vdml.CalendarService;
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
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Member;
import org.omg.vdml.Operand;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Party;
import org.omg.vdml.Performer;
import org.omg.vdml.Person;
import org.omg.vdml.Pool;
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
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueCategory;
import org.omg.vdml.ValueDefinition;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueLibrary;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VDMLFactoryImpl extends EFactoryImpl implements VDMLFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static VDMLFactory init() {
		try {
			VDMLFactory theVDMLFactory = (VDMLFactory)EPackage.Registry.INSTANCE.getEFactory(VDMLPackage.eNS_URI);
			if (theVDMLFactory != null) {
				return theVDMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VDMLFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VDMLFactoryImpl() {
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
			case VDMLPackage.VALUE_DELIVERY_MODEL: return createValueDeliveryModel();
			case VDMLPackage.ATTRIBUTE: return createAttribute();
			case VDMLPackage.ANNOTATION: return createAnnotation();
			case VDMLPackage.VALUE_LIBRARY: return createValueLibrary();
			case VDMLPackage.VALUE_DEFINITION: return createValueDefinition();
			case VDMLPackage.VALUE_CATEGORY: return createValueCategory();
			case VDMLPackage.CAPABILITY_LIBRARY: return createCapabilityLibrary();
			case VDMLPackage.CAPABILITY_DEPENDENCY: return createCapabilityDependency();
			case VDMLPackage.BUSINESS_ITEM_DEFINITION: return createBusinessItemDefinition();
			case VDMLPackage.PRACTICE_DEFINITION: return createPracticeDefinition();
			case VDMLPackage.PRACTICE_CATEGORY: return createPracticeCategory();
			case VDMLPackage.CAPABILITY_DEFINITION: return createCapabilityDefinition();
			case VDMLPackage.BUSINESS_ITEM_CATEGORY: return createBusinessItemCategory();
			case VDMLPackage.BUSINESS_ITEM_LIBRARY: return createBusinessItemLibrary();
			case VDMLPackage.ACTOR: return createActor();
			case VDMLPackage.MEASURED_CHARACTERISTIC: return createMeasuredCharacteristic();
			case VDMLPackage.ASSIGNMENT: return createAssignment();
			case VDMLPackage.ROLE: return createRole();
			case VDMLPackage.ACTIVITY: return createActivity();
			case VDMLPackage.EXPRESSION: return createExpression();
			case VDMLPackage.OPERAND: return createOperand();
			case VDMLPackage.RESOURCE_USE: return createResourceUse();
			case VDMLPackage.OUTPUT_PORT: return createOutputPort();
			case VDMLPackage.DELIVERABLE_FLOW: return createDeliverableFlow();
			case VDMLPackage.INPUT_PORT: return createInputPort();
			case VDMLPackage.INPUT_DELEGATION: return createInputDelegation();
			case VDMLPackage.BUSINESS_ITEM: return createBusinessItem();
			case VDMLPackage.STORE: return createStore();
			case VDMLPackage.ORG_UNIT: return createOrgUnit();
			case VDMLPackage.COLLABORATION: return createCollaboration();
			case VDMLPackage.DELEGATION_CONTEXT: return createDelegationContext();
			case VDMLPackage.SCENARIO: return createScenario();
			case VDMLPackage.RELEASE_CONTROL: return createReleaseControl();
			case VDMLPackage.CAPABILITY_OFFER: return createCapabilityOffer();
			case VDMLPackage.CAPABILITY_METHOD: return createCapabilityMethod();
			case VDMLPackage.PERFORMER: return createPerformer();
			case VDMLPackage.POSITION: return createPosition();
			case VDMLPackage.POOL: return createPool();
			case VDMLPackage.CALENDAR_SERVICE: return createCalendarService();
			case VDMLPackage.VALUE_ADD: return createValueAdd();
			case VDMLPackage.OUTPUT_DELEGATION: return createOutputDelegation();
			case VDMLPackage.VALUE_PROPOSITION: return createValueProposition();
			case VDMLPackage.VALUE_PROPOSITION_COMPONENT: return createValuePropositionComponent();
			case VDMLPackage.ROLE_DEFINITION: return createRoleDefinition();
			case VDMLPackage.ROLE_CATEGORY: return createRoleCategory();
			case VDMLPackage.PRACTICE_LIBRARY: return createPracticeLibrary();
			case VDMLPackage.ROLE_LIBRARY: return createRoleLibrary();
			case VDMLPackage.BUSINESS_NETWORK: return createBusinessNetwork();
			case VDMLPackage.PARTY: return createParty();
			case VDMLPackage.COMMUNITY: return createCommunity();
			case VDMLPackage.MEMBER: return createMember();
			case VDMLPackage.PERSON: return createPerson();
			case VDMLPackage.CAPABILITY_CATEGORY: return createCapabilityCategory();
			case VDMLPackage.STORE_LIBRARY: return createStoreLibrary();
			case VDMLPackage.STORE_DEFINITION: return createStoreDefinition();
			case VDMLPackage.SUPPLYING_STORE: return createSupplyingStore();
			case VDMLPackage.POOL_DEFINITION: return createPoolDefinition();
			case VDMLPackage.SUPPLYING_POOL: return createSupplyingPool();
			case VDMLPackage.EXCHANGE_CONFIGURATION: return createExchangeConfiguration();
			case VDMLPackage.MILESTONE: return createMilestone();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueDeliveryModel createValueDeliveryModel() {
		ValueDeliveryModelImpl valueDeliveryModel = new ValueDeliveryModelImpl();
		return valueDeliveryModel;
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
    public ValueLibrary createValueLibrary() {
		ValueLibraryImpl valueLibrary = new ValueLibraryImpl();
		return valueLibrary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueDefinition createValueDefinition() {
		ValueDefinitionImpl valueDefinition = new ValueDefinitionImpl();
		return valueDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueCategory createValueCategory() {
		ValueCategoryImpl valueCategory = new ValueCategoryImpl();
		return valueCategory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityLibrary createCapabilityLibrary() {
		CapabilityLibraryImpl capabilityLibrary = new CapabilityLibraryImpl();
		return capabilityLibrary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityDependency createCapabilityDependency() {
		CapabilityDependencyImpl capabilityDependency = new CapabilityDependencyImpl();
		return capabilityDependency;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemDefinition createBusinessItemDefinition() {
		BusinessItemDefinitionImpl businessItemDefinition = new BusinessItemDefinitionImpl();
		return businessItemDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PracticeDefinition createPracticeDefinition() {
		PracticeDefinitionImpl practiceDefinition = new PracticeDefinitionImpl();
		return practiceDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PracticeCategory createPracticeCategory() {
		PracticeCategoryImpl practiceCategory = new PracticeCategoryImpl();
		return practiceCategory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityDefinition createCapabilityDefinition() {
		CapabilityDefinitionImpl capabilityDefinition = new CapabilityDefinitionImpl();
		return capabilityDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemCategory createBusinessItemCategory() {
		BusinessItemCategoryImpl businessItemCategory = new BusinessItemCategoryImpl();
		return businessItemCategory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemLibrary createBusinessItemLibrary() {
		BusinessItemLibraryImpl businessItemLibrary = new BusinessItemLibraryImpl();
		return businessItemLibrary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic createMeasuredCharacteristic() {
		MeasuredCharacteristicImpl measuredCharacteristic = new MeasuredCharacteristicImpl();
		return measuredCharacteristic;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operand createOperand() {
		OperandImpl operand = new OperandImpl();
		return operand;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResourceUse createResourceUse() {
		ResourceUseImpl resourceUse = new ResourceUseImpl();
		return resourceUse;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeliverableFlow createDeliverableFlow() {
		DeliverableFlowImpl deliverableFlow = new DeliverableFlowImpl();
		return deliverableFlow;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InputDelegation createInputDelegation() {
		InputDelegationImpl inputDelegation = new InputDelegationImpl();
		return inputDelegation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItem createBusinessItem() {
		BusinessItemImpl businessItem = new BusinessItemImpl();
		return businessItem;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OrgUnit createOrgUnit() {
		OrgUnitImpl orgUnit = new OrgUnitImpl();
		return orgUnit;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DelegationContext createDelegationContext() {
		DelegationContextImpl delegationContext = new DelegationContextImpl();
		return delegationContext;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReleaseControl createReleaseControl() {
		ReleaseControlImpl releaseControl = new ReleaseControlImpl();
		return releaseControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityOffer createCapabilityOffer() {
		CapabilityOfferImpl capabilityOffer = new CapabilityOfferImpl();
		return capabilityOffer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityMethod createCapabilityMethod() {
		CapabilityMethodImpl capabilityMethod = new CapabilityMethodImpl();
		return capabilityMethod;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CalendarService createCalendarService() {
		CalendarServiceImpl calendarService = new CalendarServiceImpl();
		return calendarService;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueAdd createValueAdd() {
		ValueAddImpl valueAdd = new ValueAddImpl();
		return valueAdd;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputDelegation createOutputDelegation() {
		OutputDelegationImpl outputDelegation = new OutputDelegationImpl();
		return outputDelegation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueProposition createValueProposition() {
		ValuePropositionImpl valueProposition = new ValuePropositionImpl();
		return valueProposition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuePropositionComponent createValuePropositionComponent() {
		ValuePropositionComponentImpl valuePropositionComponent = new ValuePropositionComponentImpl();
		return valuePropositionComponent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RoleDefinition createRoleDefinition() {
		RoleDefinitionImpl roleDefinition = new RoleDefinitionImpl();
		return roleDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RoleCategory createRoleCategory() {
		RoleCategoryImpl roleCategory = new RoleCategoryImpl();
		return roleCategory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PracticeLibrary createPracticeLibrary() {
		PracticeLibraryImpl practiceLibrary = new PracticeLibraryImpl();
		return practiceLibrary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RoleLibrary createRoleLibrary() {
		RoleLibraryImpl roleLibrary = new RoleLibraryImpl();
		return roleLibrary;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessNetwork createBusinessNetwork() {
		BusinessNetworkImpl businessNetwork = new BusinessNetworkImpl();
		return businessNetwork;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Community createCommunity() {
		CommunityImpl community = new CommunityImpl();
		return community;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CapabilityCategory createCapabilityCategory() {
		CapabilityCategoryImpl capabilityCategory = new CapabilityCategoryImpl();
		return capabilityCategory;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreLibrary createStoreLibrary() {
		StoreLibraryImpl storeLibrary = new StoreLibraryImpl();
		return storeLibrary;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDefinition createStoreDefinition() {
		StoreDefinitionImpl storeDefinition = new StoreDefinitionImpl();
		return storeDefinition;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyingStore createSupplyingStore() {
		SupplyingStoreImpl supplyingStore = new SupplyingStoreImpl();
		return supplyingStore;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolDefinition createPoolDefinition() {
		PoolDefinitionImpl poolDefinition = new PoolDefinitionImpl();
		return poolDefinition;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyingPool createSupplyingPool() {
		SupplyingPoolImpl supplyingPool = new SupplyingPoolImpl();
		return supplyingPool;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeConfiguration createExchangeConfiguration() {
		ExchangeConfigurationImpl exchangeConfiguration = new ExchangeConfigurationImpl();
		return exchangeConfiguration;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VDMLPackage getVDMLPackage() {
		return (VDMLPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static VDMLPackage getPackage() {
		return VDMLPackage.eINSTANCE;
	}

} //VDMLFactoryImpl
