Introduce the following concepts
 a RoleStore which fulfills a similar function to a Store, but is owned by a Role.
 a CollaborationStore which fulfills a similar function to a Store, but is owned by any Collaboration. Important for accounting???
 an AbstractCollaboration which MUST be extended, as opposed to a Collaboration that cannot be extended.
   that cannot have activities, flows or valuePropositions 
Support inheritance for
1. Collaborations (Inherit Roles, BusinessItems)
2. Roles (Inherit RoleStores. Inheritance of Capabilities is derived from PerformedActivities)
3. BusinessItems
4. Capabilities
5. RoleStores
Do not support inheritance for 
1. Activities - that brings dependecies for flows in
2. Flows - brings dependencies for ValueAdds in
3. ValuePropositionComponents - their ValueAdds MUST come from the same or super Collaboration

For durations, make from/Todate selection an option, especially for bookings on Forms

