#1. Done and Tested
##1.1. Stencils
###ActivityNetworks
 - Role
 - Activity
 - Store
 - InputDelegation
 - OutputDelegation
 - DeliverableFlow
 - InputPort
 - OutputPort
 - ValueAdd
 - ResourceUse
 - Pool

###Role Collaboration
 - Role
 - Existing  DeliverableFlow - hidden from palette
 - New DeliverableFlow - available from palette

###Value Proposition Exchange
 - Role
 - providedProposition
 - recipient
 - ValueProposition
 - ValuePropositionComponent

###Library Modeling
 - BusinessItemDefinition stencil
 - MeasuresCompartment
 - Measure
 - CapabilityDefition
 - CapabilityCategory
 - Imported Organization Element

###Capability Management
 - OrgUnit
 - Position
 - CapabilityOffer
 - ExternalPool
 - ExternalStore
 - Store
 - Pool
 - ExternalCapabilityMethod
 - CapabilityOffer.capabilityResource
 - CapabilityOffer.capabilityMethod
 - Pool.position

##1.2. Property Editors
###ActivityNetworks
 - DeliverableFlow.isTangible 
 - ValueAdd.aggregatedTo (think about SMM Measure relationships here, limit to specific ValueAdds that would fall within the SMM Measure Hierarchy)
 - ValueAdd.valueMeasurement
 - ResourceUse.resourceIsConsumed
 - ResourceUse.quantity.measure
 - Store.storeRef
 - DeliverableFlow.deliverable (BusinessItemDefinition)
 - Role.assignedParticipants
 - Port.batchSize.measure

###Role Collaboration
 - DeliverableFlow.fromActivity
 - DeliverableFlow.toActivity
 - DeliverableFlow.businessItem (select businessItemDefinition from BusinessItemLibrary)
 - Role.assignedParticipants
 
###Value Proposition Exchange
 - ValuePropositionComponent.aggregatedFrom (filtered, multiselect, eobjectref)
 - ValueElement.valueMeasurement (filtered, singleselect, eobjectref)
 - Role.assignedParticipants
 - ValuePropositionComponent.satisfactionLevel.measure (filtered, singleselect, eobjectref)
 

###Library Modeling
 - Characteristic.measure
 - BusinessItemDefinition.isFungible
 - BusinessItemDefinition.isShareable

###Capability Management
 - ExternalCapabilityMethod.referencedCapabilityMethod
 - Role.assignedParticipants
 - Store/Pool.resourceDefinition
 - Store.duration
 - Store.inventoryLevel
 - Store.resource
 - Pool.poolSize
 

##1.3. Decorators
###ActivityNetworks
 - Tangible/Intangible

###Role Collaboration
 - Intangible deliverable flows
 - Curved deliverable flows

###Value Proposition Exchange

###Library Modeling

###Capability Management

##1.4. Collapse/Expand
###ActivityNetworks
 - Make activity outputPorts expandable and put valueadds in them

###Role Collaboration

###Value Proposition Exchange
 - ValueProposition 
 
###Library Modeling

###Capability Management
 - OrgUnits
 - Make stores expandable and put measuredCharacteristics in them, change to rectangle when expanded


##1.5. Automatic Diagram Generation
###ActivityNetworks
 - Roles
 - Deliverable Flows
 - Activities
 
###Role Collaboration
 - Generate only inter-role DeliverableFlows
 - Roles

###Value Proposition Exchange
 - Roles

###Library Modeling

###Capability Management
 - Roles
 
##1.6. Form Generation
###ActivityNetworks
 - VdmlPortValueHolder - decompose to received/offered ValueAdds and include port.offset, deliverableFlow.isTangible, port.batchSize
 - Display Grade Intervals in dropdown for containing GradeMeasure
 
###Capability Management
   
##1.7. Misc
###ActivityNetworks

###Role Collaboration
 - Ensure that VDRC Diagrams only add and delete deliverable flows and roles, nothing else

###Value Proposition Exchange

###Library Modeling
 - Store both VDModel and UMLPackage in same file
 - Don't use profile, just use EAnnotation.reference to link items
 - Implement merge functionaliy that takes UML stencilset and injects Measure elements into it
 - Show images in Palette

###Capability Management
 - Build equivalent UML elements for OrgUnit, CapabilityOffer, Store and Pool

#2. In Progress

#3. To do
##3.1. Stencils
###ActivityNetworks

###Role Collaboration

###Value Proposition Exchange

###Library Modeling
 - CapabilityDependency
 - Actor
 - RoleDefinition
 - ValueDefinition

###Capability Management
 - Owned CapabilityMethod (need to solve containment issue)
 - Activity.appliedCapabilityOffer (do fromActivity in propertyEditor)
 - ExternalOrgUnit
 - ExternalPosition
 - ExternalCapabiltyOffer

##3.2. Property Editors
###ActivityNetworks
 - ResourceUse.isExclusive

###Role Collaboration

###Value Proposition Exchange
 - ValueElement.valueDefinition - start thinking about repo of ValueDefinitions (UML Profile?)
 - ValueProposition.overallSatisfaction.measure (filtered, singleselect, eobjectref)
 - ValueElement.benchmark.measure (filtered, singleselect, eobjectref)

###Library Modeling

###Capability Management
 - *Pool.position
 - CapabilityOffer.capability
 - OrgUnit.referencedOrgUnit
 - ExternalStore.storeRef
 - ExternalPool.poolRef

##3.3. Decorators
###ActivityNetworks
 - Has ValueAdds

###Role Collaboration

###Value Proposition Exchange

###Library Modeling

###Capability Management
 - Label of ExternalStore
 - Label of ExternalPool
 - Label of ExternalCapabilityMethod 

##3.4. Collapse/Expand
###ActivityNetworks
 - Make collaboration outputPorts expandable and put valueadds in them, change to rectangle
 - Make store outputPorts expandable and put valueadds in them

###Role Collaboration

###Value Proposition Exchange
 
###Library Modeling

###Capability Management

##3.5. Automatic diagram generation

###Library Modeling

###Capability Management

##3.6. Form generation
###ActivityNetworks
 - ActivityValueHolder - one per activity, decompose to ResourceUses, duration, MeasuredCharacteristics of Activity.capability
 
###Library Modeling

###Capability Management

##3.7. Misc
###ActivityNetworks
 - Don't delete a Store's ports that are not displayed. May need to store hidden portIDs in a property on Store
 - Generate CMMN CaseModels from ActivityNetwork, assume front activity creates the case 

###Role Collaboration
 - Generate Library (BusinessItemDefinitions,RoleDefinitions)

###Value Proposition Exchange
 
###Library Modeling
 - Generate Code for all the VDML Elements