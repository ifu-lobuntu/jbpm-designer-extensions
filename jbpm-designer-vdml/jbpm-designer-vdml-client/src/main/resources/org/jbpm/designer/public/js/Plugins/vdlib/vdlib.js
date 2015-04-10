 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};

 ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdlib#"]= {
            "BusinessItemDefinition": 1,
            "Types": 2,
            "Compartments": 3,
            "Features": 4,
            "Inheritance" :5,
            "Associations" :6,
            "Imports" :7
		};
 
/**
 * The VDLib plugin provides layout methods referring to the VDLib stencilsets.
 *
 * @class ORYX.Plugins.VDLib
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDLib = Clazz.extend(
/** @lends ORYX.Plugins.VDLib.prototype */
{
	/**
	 * Creates a new instance of the VDML Proposition Exchange plugin
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
		try{
		this.facade = facade;
		console.log("Initializing VDLib");
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.updateDecorations.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		console.log("VDLib Initialized");
		}catch(e){alert(e.toString());}
	},
	updateDecorations: function (event){
		this.facade.getCanvas().getChildEdges(true, function(shape){
		}.bind(this));
	},
	handlePropertyChanged: function (event){
	}
});



