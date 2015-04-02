#Done and Tested
##Stencils
 - Role

##Property Editors

#In Progress

##Property Editors

#To do
##Misc
 - Test merge logic
 - Test VDPE in conjunction with merge logic
 - Test multiple resource save from VDPE
 - Test create resource
 - Test create VDPE collaboration diagram linked to collaboration
 - Test VDAN in conjunction with merge logic
 - Test VDAN deletion of flows and activities from source model
 - Test VDAN automatic generation of Edges and Shapes for new Flows, Activities and Ports	

##Stencils
 - Existing  DeliverableFlow - hidden from palette
 - New DeliverableFlow - available from palette

##Property Editors
 - Role.performedActivities
 - DeliverableFlow.from/toActivityName
 - DeliverableFlow.businessItem (select businessItemDefinition from BusinessItemLibrary)

##Role of UML in Library modeling
 - Create a massive UML DiagramProfile for VDML extensions.
 - In the UML profile, use stereotypes to link to the actual VDML Elements
 - UML can be the master for BusinessItemDefintions, ValueDefinitions, RoleDefinitions and Capabilities (Model Kandu as UML and see which is which)
 - It should be possible to keep the VDML Libraries in sync with UML at all times
 - For tool interoperability we can also generate UML files from VDML libraries
 - UML can also be used to refine Collaborations, but VDML needs to be the master here.
 - Information about Fungible business items is stored in totals for batches (ports) or inventory levels (stores), (Kandu: fresh produce) 
 - Information about non - fungible business items is stored per business item instance  (Kandu: tractor, etc.)

##Role of OrgUnitTemplates
 - Because of our model, we interpret OrgUnits as templates by default.
 - The relational structure of an orgUnit is aggregated from its Stores, CapabilityOffers, and the structure involved in the Roles it fulfills
 - Stores of fungible resources contain only information pertaining to its entire content (totals, averages etc.)
 - Stores of infungible resources in addition contain links to individual instances
 - UML Diagrams are where we link Collaborations, Stores, BusinessItems etc. to Measures