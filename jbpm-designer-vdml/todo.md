#1. Stencils
##ActivityNetworks

##Role Collaboration

##Value Proposition Exchange

##Library Modeling
 - OwnedPool
 - OwnedStore
 - OwnedCapabilityOffer
 - OrgUnit
 - ExternalPool
 - ExternalStore
 - ExternalCapabilityOffer
 - ExternalOrgUnit
 - BusinessItemCategory
 - ImportedBusinessItemCategory
 - ImportedBusinessItemDefinition
 - CapabilityDependency
 - ImportedCapabilityCategory
 - ImportedCapabilityDefinition
 - Actor
 - ImportedActor
 - RoleCategory
 - ImportedRoleCategory
 - RoleDefinition
 - ImportedRoleDefinition
 - ValueDefinition
 - ImportedValueDefinition
 - ValueCategory
 - ImportedValueCategory
 
##Capability Management
 - Owned CapabilityMethod (need to solve containment issue)
 - Activity.appliedCapabilityOffer (do fromActivity in propertyEditor)
 - ExternalOrgUnit
 - ExternalPosition
 - ExternalCapabiltyOffer

#2. Property Editors
##ActivityNetworks
 - ResourceUse.isExclusive

##Role Collaboration

##Value Proposition Exchange
 - ValueElement.valueDefinition - start thinking about repo of ValueDefinitions (UML Profile?)
 - ValueProposition.overallSatisfaction.measure (filtered, singleselect, eobjectref)
 - ValueElement.benchmark.measure (filtered, singleselect, eobjectref)

##Library Modeling

##Capability Management
 - *Pool.position
 - CapabilityOffer.capability
 - OrgUnit.referencedOrgUnit
 - ExternalStore.storeRef
 - ExternalPool.poolRef

#3. Decorators
##ActivityNetworks
 - Has ValueAdds

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
 - Generate shapes for each element directly contained in the current vdcol file
 - *OrgUnits
 - *Stores
 - *Pools
 - *BusinessItemDefinition
 - BusinessItemCategory
 - *MeasuredCharacteristic
 - *Characteristic
 - *Capability Definition
 - *Capability Category
 - Value Definition
 - Value Category

##Capability Management

#6. Form generation
##ActivityNetworks
 - ActivityValueHolder - one per activity, decompose to ResourceUses, duration, MeasuredCharacteristics of Activity.capability
 
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
 - 