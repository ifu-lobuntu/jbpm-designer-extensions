##Toolbar
 - Generate CaseFileForm
 - Generate Start Case form
 
## Misc
 - Sync the CaseFile from UML model(s) on load (and store) (?)
 
###Stencils for:
 - PlanFragment

###Property editors:
 - *Update all property editors to read UML rather than CaseFile
 - AuthorizedRoleRefs - change to checkbox list
 
###Extensions for CMMN
 - entryScripts
 - exitScripts
 - additional property name for caseFileItem events (its useless without them)

###VDML Integration
 - Generate Case from Activity Network
 - On open, regenerate Activities and their shapes from Activity Network
 - On open, regenerate CaseFileItems for non-fungible BusinessItems
 - Link CMMN Roles to VDMLRoles
  
##Form Modeler:
 - Name/Value construct to represent data
 - Form for CaseFile
 - Lookup of entities in dropdowns
 - Keep entitymanager/JCR session open during the form-request

## Deployment
 - Deploy CMMN cases from console-ng
 - persist root CaseFileITems passed to case 

##ACM
 - Open ended document types with free floating property definitions like ontology
 - Open ended tasks with open ended document types
 - Forms that give access to open ended state
 - Creation of Sentries between any two arbitrary task instances
 - Creation of Sentries between any arbitrary caseFileItem instance and task
