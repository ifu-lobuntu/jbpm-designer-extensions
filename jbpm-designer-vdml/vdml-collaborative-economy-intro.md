#1 Overview
The purpose of this project is to provide a modeling facility combined with a runtime execution engine that can facilitate economic collaboration. At first glance it may sound like an attempt at an Enterprise Resource Planning system, but it is not intended to compete with existing ERP systems. Existing ERP systems represent an attempt to simply put existing accounting practices and processes into a software form. The fundamental flaw in existing ERP systems is that these accounting practices were designed, some literally hundreds of years ago, BEFORE the advent of the highly technologically connected world of the 21st century. This project instead attempts to put the basic building blocks in place to allow for business modelers and users to explore and define entirely new and innovative accounting practices that more accurately reflect the advances that technology has made since the current predominant accounting practices and process were put in place. 

There are currently many different economic initiatives that claim to leverage the highly interconnected world of the 21st century. Examples are the Circular Economy, Commons-based Peer production, Peer to Peer business, the Sharing Economy, Open Enterprise, Open Manufacturing, Open Value Networks, Collaborative Consumption, Collaborative Economy, some putting forward perhaps more extreme viewpoints than others. This project does not necessarily adhere to any specific school of thought, but views the proliferation of so many similar approaches to economic activity as evidence of a convergence, an inevitable conclusion of today's increasingly technologically interconnected world. In this project, we do not necessarily adhere to any single one of these, but we would consider it a failure if the project does not at least support all of these schools of thought. We will use the intentionally vague and hopefully slightly more neutral  term "Network Economy" to refer to this set of economic initiatives and styles that are emerging with today's increasingly technologically interconnected world. 

Even though most business management theory and methods find their origins in the industrial economic age, this field has also showed some interesting progress to make sense of the networked economy. Some of these stand out, such Value Network Analysis, Value Stream and Resources Events and Agents as being significantly more adept at making sense of the networked economy. It is therefore particularly significant that representatives from these different schools got togehter under the Object Management Group to define a very interesting new modeling language called Value Delivery Modeling Language. For this reason, this project has chosen VDML as its point of departure. 

#2 The Network Economy.
Blurred organizational boundaries and increased horizontal integration.
Probing questions about the social and environmental sustainability of business practices.
New models of ownership, especially w.r.t. software, data and knowledge.
Open, adaptive processes.
Moving away from centralized governance to more decentralized governance.
More efficient use of resources due to economies of scale.
Transparancy.
Focuses more on the immediate characteristics of capabilities and products offered rather than qualifications, certifications, decades of experience.


#3 VDML.
VDML is a modeling language designed to help business leaders describe and improve their businesses. It offers a high level of abstraction with just enough detail to contextualize various statistics that could be read and correllated from different sources to make sense of the current performance of the business within its ecosystem. However, for a system such as this to be "computationally complete" it was required to bring VDML down to a level of abstraction that it was not intended for. Also, because the networked economy brings in economies of scales for certain concepts, it would make no use trying to model them individually. Imaging trying to visually model the organizational structure of every single AirBNB participant. Yet clearly each of them brings in something unique, yet retains enough similarity to allow for thousands if not millions of them to advertise their services uniformly.

##Collaboration
"A Collaboration represents the interaction of multiple Participants for a shared purpose. Each Participant is in a Role that represents that Participant’s relationship to the rest of the Participants and the shared purpose." VDML defines four different types of Collaboration: Business Network, Community, OrgUnit and Capability Method. This project focuses only on two of these: Business Networks, which we also sometimes call Value Networks, and Capability Methods, that are basically a formal term for templates for collaborations such as projects, case or business processes that repeat similar activities over multiple executions. We generally use the term project for Capability Methods. Since the goal of this project has always been to provide innovative new business models for large amounts of participants, the way VDML defines OrgUnits as individual colloboration instances and not as templates made it of limited use to us and also introduces a level of rigidity of boundaries and centralized thinking that could distract from the networked nature of the platform. Implementing support for OrgUnits is therefore a low priority, although it may be an option later on.

There are certain implications for this lack of support for OrgUnits. VDML introduces a couple of constraints such as the Capability Methods must be owned by OrgUnits, and that OrgUnits are required to declare actual stores of resources and specific capability offerings. We therefore needed to deviate from these restrictions a bit, and allow for CapabilityMethods to be more "free floating". But we also need to extend the idea of a Participant to allow for stores of resources and capability offerings to be represented.

##Participant
A participant is an economic agent that can perform certain activities in a collaboration, thus allowing it to fill a certain role in a collaboration. In VDML, roles can be filled by individuals, by other collaborations (e.g. OrgUnits) or by reference to another role in another collaboration. The latter case is more useful in defining complex algorithism for assigning roles at runtime which we provided interesting alternatives for. This platform therefore does not support Roles as Participants, which leaves only Collaborations and Individuals as Participants. Some deviation from VDML was however required to achieve this, such as that the location of a participant is now carried on the participant him/herself, not the OrgUnit he/she works for. Further deviations deserve to be explored, specifically related to how Capabilities and Stores of resources are conceptualised.

##Capability
In order to perform a specific activity, a Participant needs to directly or indirectly offer a certain Capability. Strictly speaking in VDML, only OrgUnits can offer capabilities, as Capabilities imply access to both skills and resources, and resources are always assumed to be owned by OrgUnits. In order to free this project from this more traditional, slightly dated view of economic activity, Participants (that also exclude Roles) are allowed to offer Capabilities. However, in the networked economy ownership is reconceptualised, and it definitely conceivable that for instance an participant on AirBNB actually owns his/her own house, and therefore supports the BNB Capability? It would also not make sense to model the individual CapabilityOffer, but VDML does provide substantial visual modeling for complex taxonomies of Capabilities. On registration, a Participant would therefore indicate which Capabilities he/she offers from a rich taxonomy of Capabilities, making it easy for potential consumers of that Capability to search for many providers of that Capability.

##Store
Resources are held in stores, and they represent the assets that a participant owns. A store is a much more abstract concept than a physical warehouse or shop, although it includes both. A bank acount is store, where the resource is money. A garden is a store with a yield pontential, but so is your fridge where you keep the fresh produce you bought. Resources flow, usually in measurable quantities from stores, and a basic assumption of linearity, i.e. addition and subtraction on store inventory levels can be made, although stores of intangible assets may try to quantify non-linear resources such as social reputation.  Stores are primarily characterised by the (single) type of resource they store. But stores also carry much more information than just inventory levels pertaining to their overall performance in collaborations. For this reason, and also to increase the usefulness of stores in searches, this project decided to support a taxonomy of stores. For instance, a fruit & veg shop can specialized as an organic fruit & veg Shop, and potentially bring in aspects of consumers' value system to help them refine their choices. This is another deviation from VDML. On registration, a Participant would therefore register his/her stores, and indicate how they fit into the taxonomy of existing store definitions. Such a registered store is exactly what VDML had in mind for its concept of a store, but again it would not make sense to visually model every single house involved in the entire AirBNB business network. 

##Pool
A pool is a type of store that holds reusable resources that can be returned back to the pool after use. It brings in the dimension of time and availability to a store. An AirBNB house could have 4 rooms, but they can only be allocated if they are available for the required period of time. As with stores, pools can be owned by Participants, and as with stores we have introduced a taxonomy of pools to allow for easy searching of pools.

##BusinessItemDefition
BusinessItems are defined as taxonomies and can be used across multiple collaborations.

Now that we have explored the infrastructure that supports Collaborations in more detail, we can look at what a Collaboration is made up of. 

##Role
"A Collaboration represents the
interaction of multiple Participants for a shared purpose. Each Participant is in a Role that
represents that Participant’s relationship to the rest of the Participants and the shared purpose."
A Role in a Collaboration is responsible for a set of Activities 
"A Role will be filled by a Participant that has the Capability required to perform the associated
Activity(s). ... The capability taxonomy (CapabilityLibrary) provides a link to a CapabilityOffer(s) for identification of an OrgUnit(s) that can provide the needed Capability."

##Activity
"Activities define work to be done by Participants in Roles within a Collaboration.
Each Activity is performed by one Role of one or more Participant Roles within the
Collaboration. Within a Collaboration, the same Role may perform multiple Activities
and may provide multiple Capabilities used by the Collaboration. The Collaboration
itself may perform a Role in Activities of another Collaboration. The Activity identifies
the type of Capability required to perform the Activity by reference to a
CapabilityDefinition, and the Role to be filled by a Participant that provides that
Capability. In some cases the Participant will be an Actor (human or automaton), in other
cases it will be filled by a Collaboration (usually an OrgUnit using a CapabilityMethod).
Note that if a Role performs multiple Activities, and the Activities require different
Capabilities, then the selected Participant must be capable of providing each of the
Capabilities required."

##DeliverableFlows
An Activity can have DeliverableFlows from one Activity or Store and to another
Activity or Store (but not from a Store to a Store). In the figure, the BusinessItem is on
both the input and output DeliverableFlows, indicating that the input and output are essentially the
same except the output has some added value. This could be a part going through progressive stages of
production. The ValueAdded to the BusinessItem is associated with the same OutputPort as
the DeliverableFlow of the BusinessItem. The ResourceUse, internal to the Activity,
connects to InputPorts and OutputPorts of the Activity to indicate the resources used by a
particular output (there could be additional InputPorts and OutputPorts). This use of graphical
elements is for illustration only and is not normative.

Deliverable flows represent the contracts between an activity and its environment in the Collaboration.
ResourceUse

##*SupplyingStores
The same CapabilityMethod/Project Type could use different Stores each time it is instantiated. VDML does not support this, as individual Stores are always offered by the org structure that owns the CapabilityMEthod. So to book a tour, we would use different Participants' houses (store of rooms) every time. VDML assumes the rooms will always come from the same store, which would make sense if the store was a Hotel with 1000 rooms, but then that is not the economic model we have prioritised. In order to create a placeholder for the use of a certain type of store, we have introduced the concept of a SupplyingStore which represents the use of a store of a certain type within the context of a Collaboration. In this type of model, the assumption is made that a Store of a certain type (StoreDefinition) from the store taxonomy will be brought in, but the exact instance of a store would only be determined at runtime. Again, there could be thousands of Store instances so it would make no sense to try to model them.

##*SupplyingPools
Similar to SupplyingStores, but only brings in Pools.

##Value Adds

##Value Propositions

##4 Blockchain technology
Essential for inventory levels that could have meaning in other context, such as Account Balance.
Also useful for reputation ratings that could have meaning in other contexts.
Provides an excellent infrastructure for auditable decision making processes, which would allow collaborations to become self-governing yet have full accountability and transparancy.
It is also entirely conceivable that certain Collaborations could be instantiated on geographically separated nodes. Blockchain ensures that, irrespective of where that Collaboration is running from, the changes in real inventory levels are reflected everywhere.


##5 Functional Requirements
User stories:
As a participant, I would like to register with the platform so that I can transact on it.
For each of Stores, Pools and Capabilities:
1. Register my store/pool/capability
2. Find suppliers for immediate isolated exchange based on the immediate requirements of the transaction and the quality of the goods/service.
3. Find suppliers for immediate isolated exchange, based on value system but aslo the immediate requirements of the exchange. 
4. Perform immediate, isolated exchange
4.1. Request quote
4.2. Provide quote
4.3. Request alternative quote.
4.4. Provide counter quote.
4.5. Withdraw from negotiation
4.5. Commit
4.6. Declare completion
4.7. Express dissatisfaction
4.8. Renegue/Declare Dispute
4.9. Withdraw/Declare Dispute
4.10. Express satisfaction
5. Find suppliers for an isolated activity on a project to maximise chances of success on the project.
6. Assign supplier to Activity/SuppliedStore/SuppliedPool in project.
7. When a planning has been completed, commit to the times, quantities and locations promised in the project.
8. When a milestone has been reached, effect changes in the inventory levels on the stores and pools used.
9. Find and evaluate potential suppliers for a long term trust relationship.
10. Establish trust relationship (Facebook/linkedin/g+ connect)

1. Stores:
1.1. As a participant, I would like to register my stores that I can make available so that other participants can buy goods from them. (Register my garden)
1.2. As a participant, I would like to find goods that meet my needs so that I can buy it. (Find cabages)
1.3. As a participant, I would like to find stores that fit my values so that I can feel good about buying from them whilst meeting my immediate needs for the goods. (Find suppliers that produce organically grown cabages)
1.4. As a participant, I would like to exchange the goods from the store that I have found for another form of value so that the inventory levels of their store and my store/account can reflect the current state of affairs. (I have bought cabages, the supplier should now have X crates less, and my account balance should be Y rands/dollars less.)
1.5. As a participant, I would like to find suppliers of goods for a specific activity on a project that meet the requirements of the project context so that I can be sure that our chances at success are maximized. (Find cabage suppliers for catering at event)
1.6. As a participant, I would like indicate that the store from the supplier I have found should supply the input into other activities on the project so that the project can buy goods from them.
1.7. As a participant, when planning has completed, I would like to register a bidirectional commitment with the supplier of the store that I have found for the project so that we can continue with the project. (I have found the cabbage supplier, I commit to buying a certain quantity for a certain amount of money on a certain date and the supplier commits to provide that quantity for that amount of money on that date)
1.8. As a participant, when a milestone is reached on a project, I would like the exchanges completed on the project up to that point to be effected in the various stores involved in 
1.9. As a participant, I would like to evaluate suppliers of goods that fit my values so that I can establish a trust relationship with them. (Check the quantity of insecticide used by the supplier of organically grown cabages)
1.10. As a participant, I would like to establish a trust relationship with suppliers of goods that fit my values so that I can be assured of optimal chances at success for future projects yet feel good about buying from them. (I have a trusted supplier of organically grown cabages that I can use at events, register our trust relationship on the system)
1.11. As a pariticpant, when I am the custodian of a project, I would like to increase the chances for my trusted suppliers of goods so that they can join me on the project. (I have an event to organize for, find suppliers of cabages but ask my trusted cabage suppliers first)

2. Pools:
2.1. As a participant, I would like to register my pools of reusable resources that I can make available so that other participants can make use of them. (Register my fleet of tuk-tuks)
2.2. As a participant, I would like to find reusable resources that meet my needs, location and time so that I can make use of it. (Find a tuk tuk that will be available in my area, at the time that I need goods to be transported).
2.3. As a participant, I would like to find pools of resources that fit my values so that I can feel good about buying from them whilst meeting my immediate needs for making use of the resource. (Find a tuk tuk fleet provider that only employs previously disadvantaged tuk tuk drivers).
2.4. As a participant, I would like to note use a reusable resource in exchange for another form of value so that the inventory levels of the supplier's pool and my store/account can reflect the current state of affairs. (I make use of the tuk tuk, the supplier should now have 1 tuk tuke less available until I finish using it, and my account balance should be Y rands/dollars less.)

2.4. As a participant, I would like to suppliers of pools of resources for a specific activity on a project that meet the requirements of the project context so that I can be sure that our chances at success are maximized. (Find a tuk tuk driver with the best ratings on his parcel deliveries)
As a participant, I would like to establish a trust relationship with suppliers of pools of resources that fit my values so that I can be assured of optimal chances at success for future projects yet feel good about buying from them. (I have a trusted tuk tuk driver I can use to transport parcels, register our trust relationship on the system)
As a participant, I would like to evaluate suppliers of goods that fit my values so that I can establish a trust relationship with them.
As a pariticpant, when I am the custodian of a project, I would like to increase the chances for my trusted suppliers of goods so that they can join me on the project.
As a participant, I would like the pool size and availability of my pools of resources to reflect the current transaction chain so that I always have an accurate view of my resources and account balances.


Capabilities:
As a participant, I would like to register my capabilities that I can make available so that other participants can make use of my services.
As a participant, I would like to find services that meet my needs so that I can make use of it whilst meeting my immediate needs for the service.
As a participant, I would like to find service providers that fit my values so that I can feel good about making use of them.
As a participant, I would like to select providers of services for a specific activity on a project that meet the requirements of the project context so that I can be sure that our chances at success are maximized.
As a participant, I would like to establish a trust relationship with service providers that fit my values so that I can be assured of optimal chances at success for future projects yet feel good about making use of them.
As a participant, I would like to evaluate service providers that fit my values so that I can establish a trust relationship with them.
As a pariticpant, when I am the custodian of a project, I would like to increase the chances for my trusted service providers so that they can join me on the project.

As a participant, I would like to find other like minded participants that I could establish a trust relationship with.
As a participant, I would like to review the participants I currently have a trust relationship with to help me decide whether I want to stay with them.

