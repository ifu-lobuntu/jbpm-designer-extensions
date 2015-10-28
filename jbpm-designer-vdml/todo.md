#1. Stencils
##ActivityNetworks

##Role Collaboration

##Value Proposition Exchange

##Library Modeling
 - BusinessItemCategory
 - ImportedBusinessItemCategory
 - BusinessItemGeneralization
 - CapabilityGeneralization
 - StoreDefinitionGeneralization
 - StoreDefinitionResource
 - CapabilityResource
 

#2. Property Editors
##ActivityNetworks
 - ResourceUse.isExclusive
 - ResourceUse.location
 - DeliverableFlow.milestone
 - CapabilityMethod.milestones
 - Activity.delegationContext.contextCollaboration
 - DeliverableFlow.multiplexing(manyToOne):demultiplexing (oneToMany)
 - InputPort.inputDelegation.target
 - OutputPort.delegatedOutput.source
 - Role.assignment.roleResource - NB!!!! for role delegation in Activity.delegationContext.contextCollaboration 

##Role Collaboration
 - DeliverableFlow.providingStore
 - DeliverableFlow.receivingStore

##Value Proposition Exchange
 - ValueElement.valueDefinition - start thinking about repo of ValueDefinitions (UML Profile?)
 - ValueProposition.overallSatisfaction.measure (filtered, singleselect, eobjectref)
 - ValueElement.benchmark.measure (filtered, singleselect, eobjectref)
 - ValueElement.aggregatedTo/From - allow capabilityMethods valueAdds to aggregate to ValueNetwork valueAdds

##Library Modeling
 - StoreDefinition.exchangeConfiguration.exchangeMethod
 - StoreDefinition.exchangeConfiguration.exchangeMilestone
 - StoreDefinition.exchangeConfiguration.supplierRole
 - PoolDefinition.exchangeConfiguration.resourceUseFromPool
 - PoolDefinition.exchangeConfiguration.exchangeMethod
 - PoolDefinition.exchangeConfiguration.exchangeMilestone
 - PoolDefinition.exchangeConfiguration.supplierRole
 - CapabilityDefinition.exchangeConfiguration.exchangeMethod
 - CapabilityDefinition.exchangeConfiguration.exchangeMilestone
 - CapabilityDefinition.exchangeConfiguration.supplierRole

##Capability Management
 - *Pool.position
 - CapabilityOffer.definition
 - OrgUnit.referencedOrgUnit
 - ExternalStore.storeRef
 - ExternalPool.poolRef

#3. Decorators
##ActivityNetworks
 - Has ValueAdds
 - DeliverableFlow.milestone

##Role Collaboration

##Value Proposition Exchange

##Library Modeling

##Capability Management
 - Label of ExternalStore
 - Label of ExternalPool
 - Label of ExternalCapabilityMethod 

#4. Collapse/Expand
##ActivityNetworks
 - Make collaboration outputPorts expandable and put valueadds in them, change to rectangle
 - Make store outputPorts expandable and put valueadds in them

##Role Collaboration

##Value Proposition Exchange
 
##Library Modeling

##Capability Management

#5. Automatic diagram generation

##Library Modeling
 - *BusinessItemDefinition
 - BusinessItemCategory
 - *Characteristic
 - *Capability Definition
 - *Capability Category

##Capability Management

#6. Form generation
##ActivityNetworks
 - ActivityValueHolder - one per activity, decompose to ResourceUses, duration, MeasuredCharacteristics of Activity.definition
 
##Library Modeling

##Capability Management

#7. Misc
##ActivityNetworks
 - Don't delete a Store's ports that are not displayed. May need to store hidden portIDs in a property on Store
 - Generate CMMN CaseModels from ActivityNetwork, assume front activity creates the case 

##Role Collaboration
 - Generate Library (BusinessItemDefinitions,RoleDefinitions)

##Capability Management
 - Update names of imported elements

##Value Proposition Exchange
 
##Library Modeling
 - Generate Code for all the VDML Elements
 - Associate one library of each type with a single collaboration and store it in the vdcol file
 - Only remove characteristics from elements associated with the current collaboration 