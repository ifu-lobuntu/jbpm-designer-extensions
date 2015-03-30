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

##Property Editors

#In Progress
##Stencils

##Property Editors

#To do
##Stencils
 
##Toolbar (in CMMN Editor or Form Editor?)
 - Generate contract form (Use produced/received ValueAdds and ResourceUse)
 
##Property Editors
 - ResourceUse.isExclusive
 - ResourceUse.resourceIsConsumed
 - ValueAdd.valueMeasurement.measure
 - ValueAdd.aggregatedFrom (think about SMM Measure relationships here, limit to specific ValueAdds that would fall within the SMM Measure Hierarchy)
 - ResourceUse.quantity.measure
 - Port.batchSize.measure ? (we don't really want to have to create a valueAdd just for quantity, but we do need to specify the UOM somewhere)
 - DeliverableFlow.deliverable.name (businessItem)
 - DeliverableFlow.deliverable.isFungible 
 - DeliverableFlow.deliverable.isShareable 
 - DeliverableFlow.isTangible 

##FormModeler
 - InputPortValueHolder - decompose to received ValueAdds and include port.offset, deliverableFlow.isTangible, port.batchSize
 - OutputPortValueHolder - decompose to provided ValueAdds and include deliverableFlow.duration, port.batchSize
 - Activity - one per activity, decompose to ResourceUses, duration,

