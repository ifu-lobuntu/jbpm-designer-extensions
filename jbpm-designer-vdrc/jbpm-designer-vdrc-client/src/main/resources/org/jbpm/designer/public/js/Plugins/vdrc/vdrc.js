 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The VDRC plugin provides layout methods referring to the VDRC stencilsets.
 *
 * @class ORYX.Plugins.VDRC
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDRC = Clazz.extend(
/** @lends ORYX.Plugins.VDRC.prototype */
{
	/**
	 * Creates a new instance of the VDML Proposition Exchange plugin
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
		this.facade = facade;
		console.log("Initializing VDRC");
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.testEvent.bind(this));
		console.log("VDRC Initialized");
	},
	testEvent: function (event,uiObject){
		console.log(event.type);
		this.facade.getCanvas().getChildEdges(true, function(shape){
				console.log(shape);
		}.bind(this));
	}
});


