 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
 ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/meas#"]={
		            "Basic": 1, 
		            "Collective": 2,
		            "Rescaled": 3,
		            "Grading": 4,
		            "Ranking": 5
		        };

/**
 * The MEAS plugin provides layout methods referring to the MEAS stencilsets.
 *
 * @class ORYX.Plugins.MEAS
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.MEAS = Clazz.extend(
/** @lends ORYX.Plugins.MEAS.prototype */
{
	/**
	 * Creates a new instance of the VDML Proposition Exchange plugin
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
		console.log(ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ);
		this.facade = facade;
		console.log("Initializing MEAS");
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.testEvent.bind(this));
		console.log("MEAS Initialized");
	},
	testEvent: function (event,uiObject){
		console.log(event.type);
		this.facade.getCanvas().getChildEdges(true, function(shape){
		}.bind(this));
	}
});


