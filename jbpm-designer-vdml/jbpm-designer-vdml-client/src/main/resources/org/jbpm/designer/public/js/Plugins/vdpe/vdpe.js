 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdpe#" ]= {
        "Nodes": 1, 
        "Edges": 2
};
/**
 * The VDPE plugin provides layout methods referring to the VDPE stencilsets.
 *
 * @class ORYX.Plugins.VDPE
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDPE = Clazz.extend(
/** @lends ORYX.Plugins.VDPE.prototype */
{
	/**
	 * Creates a new instance of the VDML Proposition Exchange plugin
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
		this.facade = facade;
		console.log("Initializing VDPE");
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.testEvent.bind(this));
		console.log("VDPE Initialized");
	},
	testEvent: function (event,uiObject){
		console.log(event.type);
		this.facade.getCanvas().getChildEdges(true, function(shape){
//				console.log(shape);
		}.bind(this));
	}
});


