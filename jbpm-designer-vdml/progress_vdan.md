#Done and Tested
##Stencils
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

##Collapse/Expand
 - Make outputPorts expandable and put valueadds in them

##Decorators
 - Tangible/Intangible
 
##Property Editors
 - DeliverableFlow.isTangible 

#In Progress
##Stencils

##Property Editors

#To do
##Stencils

##Misc
 - Don't delete a Store's ports that are not displayed. May need to store hidden portIDs in a property on Store 
 
##Decorators
 - Has ValueAdds

 
##Property Editors
 - ResourceUse.isExclusive
 - *ResourceUse.resourceIsConsumed
 - *ValueAdd.valueMeasurement.measure
 - *ValueAdd.aggregatedFrom (think about SMM Measure relationships here, limit to specific ValueAdds that would fall within the SMM Measure Hierarchy)
 - *ResourceUse.quantity.measure
 - Port.batchSize.measure ? (we don't really want to have to create a valueAdd just for quantity, but we do need to specify the UOM somewhere)
 - DeliverableFlow.deliverable (BusinessItemDefinition)

##FormModeler
 - InputPortValueHolder - decompose to received ValueAdds and include port.offset, deliverableFlow.isTangible, port.batchSize
 - OutputPortValueHolder - decompose to provided ValueAdds and include deliverableFlow.duration, port.batchSize
 - Activity - one per activity, decompose to ResourceUses, duration, MeasuredCharacteristics of Activity.capability

