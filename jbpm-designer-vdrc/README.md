jbpm-designer-vdrc
====================

VDML Role Collaboration extensions to the jBPM Designer

Currently the idea is that the VDML Role Collaboration Diagram should be the master diagram containing all the Roles in a Collaboration. 

All other VDML Diagrams at the Collaboration level should refer to the Collaboration contained in the VDRC file. When they contribute new roles, such new roles should be 
added in this file. They should not be allowed to delete roles. We only delete roles from the VDRC file, with the necessary warning that all the related activities, flows and 
propositions will be deleted forever. The other Collaboration Diagrams should be clever enough to remove all elements associated with a deleted role.
