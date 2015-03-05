/**
 */
package org.pavanecce.vdml.metamodel.vdml.util;

import org.eclipse.cmmn1.Switch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage
 * @generated
 */
public class VdmlSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VdmlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlSwitch() {
        if (modelPackage == null) {
            modelPackage = VdmlPackage.eINSTANCE;
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
            case VdmlPackage.VALUE_DELIVERY_MODEL: {
                ValueDeliveryModel valueDeliveryModel = (ValueDeliveryModel)theEObject;
                T result = caseValueDeliveryModel(valueDeliveryModel);
                if (result == null) result = caseVdmlElement(valueDeliveryModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VDML_ELEMENT: {
                VdmlElement vdmlElement = (VdmlElement)theEObject;
                T result = caseVdmlElement(vdmlElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T result = caseAttribute(attribute);
                if (result == null) result = caseVdmlElement(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ANNOTATION: {
                Annotation annotation = (Annotation)theEObject;
                T result = caseAnnotation(annotation);
                if (result == null) result = caseVdmlElement(annotation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_LIBRARY: {
                ValueLibrary valueLibrary = (ValueLibrary)theEObject;
                T result = caseValueLibrary(valueLibrary);
                if (result == null) result = caseVdmlElement(valueLibrary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_DEFINITION: {
                ValueDefinition valueDefinition = (ValueDefinition)theEObject;
                T result = caseValueDefinition(valueDefinition);
                if (result == null) result = caseVdmlElement(valueDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_CATEGORY: {
                ValueCategory valueCategory = (ValueCategory)theEObject;
                T result = caseValueCategory(valueCategory);
                if (result == null) result = caseVdmlElement(valueCategory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY_LIBRARY: {
                CapabilityLibrary capabilityLibrary = (CapabilityLibrary)theEObject;
                T result = caseCapabilityLibrary(capabilityLibrary);
                if (result == null) result = caseVdmlElement(capabilityLibrary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY: {
                Capability capability = (Capability)theEObject;
                T result = caseCapability(capability);
                if (result == null) result = caseVdmlElement(capability);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY_DEPENDENCY: {
                CapabilityDependency capabilityDependency = (CapabilityDependency)theEObject;
                T result = caseCapabilityDependency(capabilityDependency);
                if (result == null) result = caseVdmlElement(capabilityDependency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.BUSINESS_ITEM_DEFINITION: {
                BusinessItemDefinition businessItemDefinition = (BusinessItemDefinition)theEObject;
                T result = caseBusinessItemDefinition(businessItemDefinition);
                if (result == null) result = caseBusinessItemLibraryElement(businessItemDefinition);
                if (result == null) result = caseVdmlElement(businessItemDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.BUSINESS_ITEM_LIBRARY_ELEMENT: {
                BusinessItemLibraryElement businessItemLibraryElement = (BusinessItemLibraryElement)theEObject;
                T result = caseBusinessItemLibraryElement(businessItemLibraryElement);
                if (result == null) result = caseVdmlElement(businessItemLibraryElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PRACTICE_DEFINITION: {
                PracticeDefinition practiceDefinition = (PracticeDefinition)theEObject;
                T result = casePracticeDefinition(practiceDefinition);
                if (result == null) result = caseVdmlElement(practiceDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PRACTICE_CATEGORY: {
                PracticeCategory practiceCategory = (PracticeCategory)theEObject;
                T result = casePracticeCategory(practiceCategory);
                if (result == null) result = caseVdmlElement(practiceCategory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY_DEFINITION: {
                CapabilityDefinition capabilityDefinition = (CapabilityDefinition)theEObject;
                T result = caseCapabilityDefinition(capabilityDefinition);
                if (result == null) result = caseCapability(capabilityDefinition);
                if (result == null) result = caseVdmlElement(capabilityDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.BUSINESS_ITEM_CATEGORY: {
                BusinessItemCategory businessItemCategory = (BusinessItemCategory)theEObject;
                T result = caseBusinessItemCategory(businessItemCategory);
                if (result == null) result = caseBusinessItemLibraryElement(businessItemCategory);
                if (result == null) result = caseVdmlElement(businessItemCategory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.BUSINESS_ITEM_LIBRARY: {
                BusinessItemLibrary businessItemLibrary = (BusinessItemLibrary)theEObject;
                T result = caseBusinessItemLibrary(businessItemLibrary);
                if (result == null) result = caseVdmlElement(businessItemLibrary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ACTOR: {
                Actor actor = (Actor)theEObject;
                T result = caseActor(actor);
                if (result == null) result = caseParticipant(actor);
                if (result == null) result = caseMeasurableElement(actor);
                if (result == null) result = caseVdmlElement(actor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PARTICIPANT: {
                Participant participant = (Participant)theEObject;
                T result = caseParticipant(participant);
                if (result == null) result = caseMeasurableElement(participant);
                if (result == null) result = caseVdmlElement(participant);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.MEASURABLE_ELEMENT: {
                MeasurableElement measurableElement = (MeasurableElement)theEObject;
                T result = caseMeasurableElement(measurableElement);
                if (result == null) result = caseVdmlElement(measurableElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.MEASURED_CHARACTERISTIC: {
                MeasuredCharacteristic measuredCharacteristic = (MeasuredCharacteristic)theEObject;
                T result = caseMeasuredCharacteristic(measuredCharacteristic);
                if (result == null) result = caseVdmlElement(measuredCharacteristic);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ASSIGNMENT: {
                Assignment assignment = (Assignment)theEObject;
                T result = caseAssignment(assignment);
                if (result == null) result = caseVdmlElement(assignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ROLE: {
                Role role = (Role)theEObject;
                T result = caseRole(role);
                if (result == null) result = caseParticipant(role);
                if (result == null) result = caseMeasurableElement(role);
                if (result == null) result = caseVdmlElement(role);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ACTIVITY: {
                Activity activity = (Activity)theEObject;
                T result = caseActivity(activity);
                if (result == null) result = casePortContainer(activity);
                if (result == null) result = caseMeasurableElement(activity);
                if (result == null) result = caseVdmlElement(activity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PORT_CONTAINER: {
                PortContainer portContainer = (PortContainer)theEObject;
                T result = casePortContainer(portContainer);
                if (result == null) result = caseMeasurableElement(portContainer);
                if (result == null) result = caseVdmlElement(portContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PORT: {
                Port port = (Port)theEObject;
                T result = casePort(port);
                if (result == null) result = caseMeasurableElement(port);
                if (result == null) result = caseVdmlElement(port);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.EXPRESSION: {
                Expression expression = (Expression)theEObject;
                T result = caseExpression(expression);
                if (result == null) result = caseVdmlElement(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.OPERAND: {
                Operand operand = (Operand)theEObject;
                T result = caseOperand(operand);
                if (result == null) result = caseVdmlElement(operand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.RESOURCE_USE: {
                ResourceUse resourceUse = (ResourceUse)theEObject;
                T result = caseResourceUse(resourceUse);
                if (result == null) result = caseMeasurableElement(resourceUse);
                if (result == null) result = caseVdmlElement(resourceUse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.OUTPUT_PORT: {
                OutputPort outputPort = (OutputPort)theEObject;
                T result = caseOutputPort(outputPort);
                if (result == null) result = casePort(outputPort);
                if (result == null) result = caseMeasurableElement(outputPort);
                if (result == null) result = caseVdmlElement(outputPort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.DELIVERABLE_FLOW: {
                DeliverableFlow deliverableFlow = (DeliverableFlow)theEObject;
                T result = caseDeliverableFlow(deliverableFlow);
                if (result == null) result = caseMeasurableElement(deliverableFlow);
                if (result == null) result = caseVdmlElement(deliverableFlow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.INPUT_PORT: {
                InputPort inputPort = (InputPort)theEObject;
                T result = caseInputPort(inputPort);
                if (result == null) result = casePort(inputPort);
                if (result == null) result = caseMeasurableElement(inputPort);
                if (result == null) result = caseVdmlElement(inputPort);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.INPUT_DELEGATION: {
                InputDelegation inputDelegation = (InputDelegation)theEObject;
                T result = caseInputDelegation(inputDelegation);
                if (result == null) result = casePortDelegation(inputDelegation);
                if (result == null) result = caseVdmlElement(inputDelegation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PORT_DELEGATION: {
                PortDelegation portDelegation = (PortDelegation)theEObject;
                T result = casePortDelegation(portDelegation);
                if (result == null) result = caseVdmlElement(portDelegation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.BUSINESS_ITEM: {
                BusinessItem businessItem = (BusinessItem)theEObject;
                T result = caseBusinessItem(businessItem);
                if (result == null) result = caseMeasurableElement(businessItem);
                if (result == null) result = caseVdmlElement(businessItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.STORE: {
                Store store = (Store)theEObject;
                T result = caseStore(store);
                if (result == null) result = casePortContainer(store);
                if (result == null) result = caseMeasurableElement(store);
                if (result == null) result = caseVdmlElement(store);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ORG_UNIT: {
                OrgUnit orgUnit = (OrgUnit)theEObject;
                T result = caseOrgUnit(orgUnit);
                if (result == null) result = caseCollaboration(orgUnit);
                if (result == null) result = caseParticipant(orgUnit);
                if (result == null) result = casePortContainer(orgUnit);
                if (result == null) result = caseMeasurableElement(orgUnit);
                if (result == null) result = caseVdmlElement(orgUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.COLLABORATION: {
                Collaboration collaboration = (Collaboration)theEObject;
                T result = caseCollaboration(collaboration);
                if (result == null) result = caseParticipant(collaboration);
                if (result == null) result = casePortContainer(collaboration);
                if (result == null) result = caseMeasurableElement(collaboration);
                if (result == null) result = caseVdmlElement(collaboration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.DELEGATION_CONTEXT: {
                DelegationContext delegationContext = (DelegationContext)theEObject;
                T result = caseDelegationContext(delegationContext);
                if (result == null) result = caseAnalysisContext(delegationContext);
                if (result == null) result = caseVdmlElement(delegationContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ANALYSIS_CONTEXT: {
                AnalysisContext analysisContext = (AnalysisContext)theEObject;
                T result = caseAnalysisContext(analysisContext);
                if (result == null) result = caseVdmlElement(analysisContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.SCENARIO: {
                Scenario scenario = (Scenario)theEObject;
                T result = caseScenario(scenario);
                if (result == null) result = caseAnalysisContext(scenario);
                if (result == null) result = caseVdmlElement(scenario);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.RELEASE_CONTROL: {
                ReleaseControl releaseControl = (ReleaseControl)theEObject;
                T result = caseReleaseControl(releaseControl);
                if (result == null) result = caseVdmlElement(releaseControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY_OFFER: {
                CapabilityOffer capabilityOffer = (CapabilityOffer)theEObject;
                T result = caseCapabilityOffer(capabilityOffer);
                if (result == null) result = caseMeasurableElement(capabilityOffer);
                if (result == null) result = caseVdmlElement(capabilityOffer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY_METHOD: {
                CapabilityMethod capabilityMethod = (CapabilityMethod)theEObject;
                T result = caseCapabilityMethod(capabilityMethod);
                if (result == null) result = caseCollaboration(capabilityMethod);
                if (result == null) result = caseParticipant(capabilityMethod);
                if (result == null) result = casePortContainer(capabilityMethod);
                if (result == null) result = caseMeasurableElement(capabilityMethod);
                if (result == null) result = caseVdmlElement(capabilityMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PERFORMER: {
                Performer performer = (Performer)theEObject;
                T result = casePerformer(performer);
                if (result == null) result = caseRole(performer);
                if (result == null) result = caseParticipant(performer);
                if (result == null) result = caseMeasurableElement(performer);
                if (result == null) result = caseVdmlElement(performer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.POSITION: {
                Position position = (Position)theEObject;
                T result = casePosition(position);
                if (result == null) result = caseRole(position);
                if (result == null) result = caseParticipant(position);
                if (result == null) result = caseMeasurableElement(position);
                if (result == null) result = caseVdmlElement(position);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.POOL: {
                Pool pool = (Pool)theEObject;
                T result = casePool(pool);
                if (result == null) result = caseStore(pool);
                if (result == null) result = casePortContainer(pool);
                if (result == null) result = caseMeasurableElement(pool);
                if (result == null) result = caseVdmlElement(pool);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CALENDAR_SERVICE: {
                CalendarService calendarService = (CalendarService)theEObject;
                T result = caseCalendarService(calendarService);
                if (result == null) result = caseVdmlElement(calendarService);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_ADD: {
                ValueAdd valueAdd = (ValueAdd)theEObject;
                T result = caseValueAdd(valueAdd);
                if (result == null) result = caseValueElement(valueAdd);
                if (result == null) result = caseMeasurableElement(valueAdd);
                if (result == null) result = caseVdmlElement(valueAdd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_ELEMENT: {
                ValueElement valueElement = (ValueElement)theEObject;
                T result = caseValueElement(valueElement);
                if (result == null) result = caseMeasurableElement(valueElement);
                if (result == null) result = caseVdmlElement(valueElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_PROPOSITION_COMPONENT: {
                ValuePropositionComponent valuePropositionComponent = (ValuePropositionComponent)theEObject;
                T result = caseValuePropositionComponent(valuePropositionComponent);
                if (result == null) result = caseValueElement(valuePropositionComponent);
                if (result == null) result = caseMeasurableElement(valuePropositionComponent);
                if (result == null) result = caseVdmlElement(valuePropositionComponent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.OUTPUT_DELEGATION: {
                OutputDelegation outputDelegation = (OutputDelegation)theEObject;
                T result = caseOutputDelegation(outputDelegation);
                if (result == null) result = casePortDelegation(outputDelegation);
                if (result == null) result = caseVdmlElement(outputDelegation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.VALUE_PROPOSITION: {
                ValueProposition valueProposition = (ValueProposition)theEObject;
                T result = caseValueProposition(valueProposition);
                if (result == null) result = caseMeasurableElement(valueProposition);
                if (result == null) result = caseVdmlElement(valueProposition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ROLE_DEFINITION: {
                RoleDefinition roleDefinition = (RoleDefinition)theEObject;
                T result = caseRoleDefinition(roleDefinition);
                if (result == null) result = caseVdmlElement(roleDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ROLE_CATEGORY: {
                RoleCategory roleCategory = (RoleCategory)theEObject;
                T result = caseRoleCategory(roleCategory);
                if (result == null) result = caseVdmlElement(roleCategory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PRACTICE_LIBRARY: {
                PracticeLibrary practiceLibrary = (PracticeLibrary)theEObject;
                T result = casePracticeLibrary(practiceLibrary);
                if (result == null) result = caseVdmlElement(practiceLibrary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.ROLE_LIBRARY: {
                RoleLibrary roleLibrary = (RoleLibrary)theEObject;
                T result = caseRoleLibrary(roleLibrary);
                if (result == null) result = caseVdmlElement(roleLibrary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.BUSINESS_NETWORK: {
                BusinessNetwork businessNetwork = (BusinessNetwork)theEObject;
                T result = caseBusinessNetwork(businessNetwork);
                if (result == null) result = caseCollaboration(businessNetwork);
                if (result == null) result = caseParticipant(businessNetwork);
                if (result == null) result = casePortContainer(businessNetwork);
                if (result == null) result = caseMeasurableElement(businessNetwork);
                if (result == null) result = caseVdmlElement(businessNetwork);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PARTY: {
                Party party = (Party)theEObject;
                T result = caseParty(party);
                if (result == null) result = caseRole(party);
                if (result == null) result = caseParticipant(party);
                if (result == null) result = caseMeasurableElement(party);
                if (result == null) result = caseVdmlElement(party);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.COMMUNITY: {
                Community community = (Community)theEObject;
                T result = caseCommunity(community);
                if (result == null) result = caseCollaboration(community);
                if (result == null) result = caseParticipant(community);
                if (result == null) result = casePortContainer(community);
                if (result == null) result = caseMeasurableElement(community);
                if (result == null) result = caseVdmlElement(community);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.MEMBER: {
                Member member = (Member)theEObject;
                T result = caseMember(member);
                if (result == null) result = caseRole(member);
                if (result == null) result = caseParticipant(member);
                if (result == null) result = caseMeasurableElement(member);
                if (result == null) result = caseVdmlElement(member);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.PERSON: {
                Person person = (Person)theEObject;
                T result = casePerson(person);
                if (result == null) result = caseActor(person);
                if (result == null) result = caseParticipant(person);
                if (result == null) result = caseMeasurableElement(person);
                if (result == null) result = caseVdmlElement(person);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.CAPABILITY_CATEGORY: {
                CapabilityCategory capabilityCategory = (CapabilityCategory)theEObject;
                T result = caseCapabilityCategory(capabilityCategory);
                if (result == null) result = caseCapability(capabilityCategory);
                if (result == null) result = caseVdmlElement(capabilityCategory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VdmlPackage.INTEGER: {
                integer integer = (integer)theEObject;
                T result = caseinteger(integer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Delivery Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Delivery Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueDeliveryModel(ValueDeliveryModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVdmlElement(VdmlElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotation(Annotation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueLibrary(ValueLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueDefinition(ValueDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueCategory(ValueCategory object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityLibrary(CapabilityLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapability(Capability object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability Dependency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Dependency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityDependency(CapabilityDependency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Item Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Item Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessItemDefinition(BusinessItemDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Item Library Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Item Library Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessItemLibraryElement(BusinessItemLibraryElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Practice Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Practice Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePracticeDefinition(PracticeDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Practice Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Practice Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePracticeCategory(PracticeCategory object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityDefinition(CapabilityDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Item Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Item Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessItemCategory(BusinessItemCategory object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Item Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Item Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessItemLibrary(BusinessItemLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActor(Actor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParticipant(Participant object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurableElement(MeasurableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measured Characteristic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measured Characteristic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasuredCharacteristic(MeasuredCharacteristic object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignment(Assignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRole(Role object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivity(Activity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePortContainer(PortContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePort(Port object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperand(Operand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Use</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Use</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceUse(ResourceUse object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputPort(OutputPort object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deliverable Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deliverable Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeliverableFlow(DeliverableFlow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputPort(InputPort object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Delegation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Delegation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputDelegation(InputDelegation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Port Delegation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Port Delegation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePortDelegation(PortDelegation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessItem(BusinessItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Store</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStore(Store object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Org Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Org Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrgUnit(OrgUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCollaboration(Collaboration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delegation Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delegation Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDelegationContext(DelegationContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analysis Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analysis Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalysisContext(AnalysisContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScenario(Scenario object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Release Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Release Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReleaseControl(ReleaseControl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability Offer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Offer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityOffer(CapabilityOffer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityMethod(CapabilityMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Performer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Performer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerformer(Performer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Position</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePosition(Position object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePool(Pool object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Calendar Service</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Calendar Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCalendarService(CalendarService object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Add</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Add</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueAdd(ValueAdd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueElement(ValueElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Proposition Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Proposition Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValuePropositionComponent(ValuePropositionComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Delegation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Delegation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputDelegation(OutputDelegation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Proposition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Proposition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueProposition(ValueProposition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Role Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Role Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoleDefinition(RoleDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Role Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Role Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoleCategory(RoleCategory object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Practice Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Practice Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePracticeLibrary(PracticeLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Role Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Role Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoleLibrary(RoleLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Network</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessNetwork(BusinessNetwork object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Party</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParty(Party object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Community</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Community</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunity(Community object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMember(Member object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerson(Person object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Capability Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capability Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCapabilityCategory(CapabilityCategory object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>integer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>integer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseinteger(integer object) {
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

} //VdmlSwitch
