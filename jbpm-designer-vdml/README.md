#Proposed VDML Modeling extension for jBPM
##Background
This modeling extension is intended specifically to define the contracts amongst participants in a networked business collaboration. 

##Known issues
Certain elements from VDML are not supported because the direct benefit to networked business collaborations isn't immediately clear (as yet).
 - Practice Libraries
 - MeasurementDependency diagrams
 - Capability Heatmap
 
Certain elements from VDML still being defined
 - Role Libraries
 - Value Libraries
 - Capability Libraries
 
##Class Diagrams
Class Diagrams are used to model certain library elements because the entities modeled at this level are often associated with measurable Characteristics.
 - BusinessItemLibraries
 - CapabilityLibraries (interim solution until CapabilityModeling is supported)
In these cases the Class Diagrams are the master copy, and these Capabilities/BusinessItemsDefinitions can be imported into Collaborations. 

There are also plans to pull VDML OrgUnit and other CollaborationStructures into ClassDiagrams to allow them to be refined in UML, but this is a low priority.

##CMMN Integrations
VDML OrgUnit and other CollaborationStructures can be used in CMMN as a CaseFileItem
Any Element modeled in VDML ClassDiagrams can also be used in CMMN as a CaseFileItem 
A CMMN Case can be linked to a CapabilityMethod
When CMMN Tasks are annotated with linked VDML Activities, the various MeasuredCharacteristics from the Activity can be edited and/or displayed on the Task form. 

##Deviations from VDML
This platform uses standard Eclipse XMI based on the VDML metamodel to store VDML artifacts. However, in order to support jBPM and Uberfire's virtual file system design, a decision was made to only store one collaboration per file. More than this would cause conflicts in the underlying Git file system provider. Some additional code would be required to export all these files as a single ValueDeliveryModel in a resource. One side effect of this is that CapabilityMethods are not stored under OrgUnits. We are still working on a potential solution to this.

Since this platform will initially support networked business collaborations where literally thousands of participants share a single business design, a decision was made to provide an alternative interpretation for OrgUnits. OrgUnits are considered as templates for OrgUnits, and when a participant joins the collaboration, the template is used to create a more standard OrgUnit (instance) from the template.

In order to keep the modeling simple, we hide the indirection between Measure and Characteristic, and enforce a one-to-one relationship in the background.
