#Done and Tested
##Automate marshalling:
 - boundaryShapes property implemented as ConnectionRule.targetBinding
 - sourceBinding
 - targetBindings
 - childBindings
 - viewBindings
 - Laying out decorations sequentially, spaced evenly, but only the visible ones 

## Modularization
 - Implement different projects for different modeling languages - Client/API/Backend
 - Implement processRequest method on profile to delegate to the appropriate action handler
 - Implement redirection logic in StencilSetServiceServlet
 - Config.js


##Misc
 - Getting icons to work in the palette
 - Support for curved edges.
 
#TODO
##Misc
 - Disabling rotation of labels on edges
 - Automatically creating child shapes e.g. compartments
 - Clipping items inside parent
 - Find a way to have a consistent unique id for a resource irrespective of its location in the repository to allow for improved refactoring
 - How to put custom shapes on the diagram
 - How to get the name editing text to show in the right place
 - How to get the boundaryShape area to be a triangle
 
## Modularization
 - inlineditor.jsp
 - Preprocessing

 