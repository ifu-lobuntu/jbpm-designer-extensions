 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

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
		this.facade = facade;
		console.log("Initializing MEAS");
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.testEvent.bind(this));
		console.log("MEAS Initialized");
	},
	testEvent: function (event,uiObject){
		console.log(event.type);
		this.facade.getCanvas().getChildEdges(true, function(shape){
				console.log(shape);
		}.bind(this));
	}
});


