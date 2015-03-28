/**
 */
package org.omg.vdml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.vdml.VDMLPackage
 * @generated
 */
public interface VDMLFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VDMLFactory eINSTANCE = org.omg.vdml.impl.VDMLFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Value Delivery Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Delivery Model</em>'.
     * @generated
     */
    ValueDeliveryModel createValueDeliveryModel();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    Attribute createAttribute();

    /**
     * Returns a new object of class '<em>Annotation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation</em>'.
     * @generated
     */
    Annotation createAnnotation();

    /**
     * Returns a new object of class '<em>Value Library</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Library</em>'.
     * @generated
     */
    ValueLibrary createValueLibrary();

    /**
     * Returns a new object of class '<em>Value Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Definition</em>'.
     * @generated
     */
    ValueDefinition createValueDefinition();

    /**
     * Returns a new object of class '<em>Value Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Category</em>'.
     * @generated
     */
    ValueCategory createValueCategory();

    /**
     * Returns a new object of class '<em>Capability Library</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capability Library</em>'.
     * @generated
     */
    CapabilityLibrary createCapabilityLibrary();

    /**
     * Returns a new object of class '<em>Capability Dependency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capability Dependency</em>'.
     * @generated
     */
    CapabilityDependency createCapabilityDependency();

    /**
     * Returns a new object of class '<em>Business Item Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Item Definition</em>'.
     * @generated
     */
    BusinessItemDefinition createBusinessItemDefinition();

    /**
     * Returns a new object of class '<em>Practice Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Practice Definition</em>'.
     * @generated
     */
    PracticeDefinition createPracticeDefinition();

    /**
     * Returns a new object of class '<em>Practice Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Practice Category</em>'.
     * @generated
     */
    PracticeCategory createPracticeCategory();

    /**
     * Returns a new object of class '<em>Capability Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capability Definition</em>'.
     * @generated
     */
    CapabilityDefinition createCapabilityDefinition();

    /**
     * Returns a new object of class '<em>Business Item Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Item Category</em>'.
     * @generated
     */
    BusinessItemCategory createBusinessItemCategory();

    /**
     * Returns a new object of class '<em>Business Item Library</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Item Library</em>'.
     * @generated
     */
    BusinessItemLibrary createBusinessItemLibrary();

    /**
     * Returns a new object of class '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor</em>'.
     * @generated
     */
    Actor createActor();

    /**
     * Returns a new object of class '<em>Measured Characteristic</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measured Characteristic</em>'.
     * @generated
     */
    MeasuredCharacteristic createMeasuredCharacteristic();

    /**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
    Assignment createAssignment();

    /**
     * Returns a new object of class '<em>Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Role</em>'.
     * @generated
     */
    Role createRole();

    /**
     * Returns a new object of class '<em>Activity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity</em>'.
     * @generated
     */
    Activity createActivity();

    /**
     * Returns a new object of class '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression</em>'.
     * @generated
     */
    Expression createExpression();

    /**
     * Returns a new object of class '<em>Operand</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operand</em>'.
     * @generated
     */
    Operand createOperand();

    /**
     * Returns a new object of class '<em>Resource Use</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource Use</em>'.
     * @generated
     */
    ResourceUse createResourceUse();

    /**
     * Returns a new object of class '<em>Output Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Port</em>'.
     * @generated
     */
    OutputPort createOutputPort();

    /**
     * Returns a new object of class '<em>Deliverable Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deliverable Flow</em>'.
     * @generated
     */
    DeliverableFlow createDeliverableFlow();

    /**
     * Returns a new object of class '<em>Input Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Port</em>'.
     * @generated
     */
    InputPort createInputPort();

    /**
     * Returns a new object of class '<em>Input Delegation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Delegation</em>'.
     * @generated
     */
    InputDelegation createInputDelegation();

    /**
     * Returns a new object of class '<em>Business Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Item</em>'.
     * @generated
     */
    BusinessItem createBusinessItem();

    /**
     * Returns a new object of class '<em>Store</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Store</em>'.
     * @generated
     */
    Store createStore();

    /**
     * Returns a new object of class '<em>Org Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Org Unit</em>'.
     * @generated
     */
    OrgUnit createOrgUnit();

    /**
     * Returns a new object of class '<em>Collaboration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Collaboration</em>'.
     * @generated
     */
    Collaboration createCollaboration();

    /**
     * Returns a new object of class '<em>Delegation Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delegation Context</em>'.
     * @generated
     */
    DelegationContext createDelegationContext();

    /**
     * Returns a new object of class '<em>Scenario</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scenario</em>'.
     * @generated
     */
    Scenario createScenario();

    /**
     * Returns a new object of class '<em>Release Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Release Control</em>'.
     * @generated
     */
    ReleaseControl createReleaseControl();

    /**
     * Returns a new object of class '<em>Capability Offer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capability Offer</em>'.
     * @generated
     */
    CapabilityOffer createCapabilityOffer();

    /**
     * Returns a new object of class '<em>Capability Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capability Method</em>'.
     * @generated
     */
    CapabilityMethod createCapabilityMethod();

    /**
     * Returns a new object of class '<em>Performer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Performer</em>'.
     * @generated
     */
    Performer createPerformer();

    /**
     * Returns a new object of class '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position</em>'.
     * @generated
     */
    Position createPosition();

    /**
     * Returns a new object of class '<em>Pool</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pool</em>'.
     * @generated
     */
    Pool createPool();

    /**
     * Returns a new object of class '<em>Calendar Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Calendar Service</em>'.
     * @generated
     */
    CalendarService createCalendarService();

    /**
     * Returns a new object of class '<em>Value Add</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Add</em>'.
     * @generated
     */
    ValueAdd createValueAdd();

    /**
     * Returns a new object of class '<em>Output Delegation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Delegation</em>'.
     * @generated
     */
    OutputDelegation createOutputDelegation();

    /**
     * Returns a new object of class '<em>Value Proposition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Proposition</em>'.
     * @generated
     */
    ValueProposition createValueProposition();

    /**
     * Returns a new object of class '<em>Value Proposition Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Proposition Component</em>'.
     * @generated
     */
    ValuePropositionComponent createValuePropositionComponent();

    /**
     * Returns a new object of class '<em>Role Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Role Definition</em>'.
     * @generated
     */
    RoleDefinition createRoleDefinition();

    /**
     * Returns a new object of class '<em>Role Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Role Category</em>'.
     * @generated
     */
    RoleCategory createRoleCategory();

    /**
     * Returns a new object of class '<em>Practice Library</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Practice Library</em>'.
     * @generated
     */
    PracticeLibrary createPracticeLibrary();

    /**
     * Returns a new object of class '<em>Role Library</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Role Library</em>'.
     * @generated
     */
    RoleLibrary createRoleLibrary();

    /**
     * Returns a new object of class '<em>Business Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Network</em>'.
     * @generated
     */
    BusinessNetwork createBusinessNetwork();

    /**
     * Returns a new object of class '<em>Party</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Party</em>'.
     * @generated
     */
    Party createParty();

    /**
     * Returns a new object of class '<em>Community</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Community</em>'.
     * @generated
     */
    Community createCommunity();

    /**
     * Returns a new object of class '<em>Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Member</em>'.
     * @generated
     */
    Member createMember();

    /**
     * Returns a new object of class '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Person</em>'.
     * @generated
     */
    Person createPerson();

    /**
     * Returns a new object of class '<em>Capability Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Capability Category</em>'.
     * @generated
     */
    CapabilityCategory createCapabilityCategory();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VDMLPackage getVDMLPackage();

} //VDMLFactory
