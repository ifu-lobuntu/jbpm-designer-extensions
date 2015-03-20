 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The VDML plugin provides layout methods referring to the VDML stencilsets.
 *
 * @class ORYX.Plugins.VDML
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDML = Clazz.extend(
/** @lends ORYX.Plugins.VDML.prototype */
{
	/**
	 * Creates a new instance of the CMMN plugin and registers it on the
	 * layout events listed in the CMMN stencil set.
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
		this.facade = facade;
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_RESIZE_END, this.layoutRoleLanesOnLoad.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DROP_SHAPE, this.layoutRoleLanesOnLoad.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPE_ADDED, this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent('layout.vdml.role_lane', this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.layoutRoleLanesOnLoad.bind(this));
		ORYX.CONFIG.BORDER_OFFSET=30;
	},
	handlePropertyChanged : function(event) {
	},
	layoutRoleLanesOnLoad : function(event) {
		try{
		var previousLowerRight={x:600,y:0};
		this.facade.getCanvas().getChildNodes(true, function(shape){
			if(shape.getStencil()){
				var stencilId=shape.getStencil().id();
				if(stencilId=="http://b3mn.org/stencilset/vdmlactivitynetwork#Role"){
					var ul = shape.bounds.upperLeft();
					var lr = shape.bounds.lowerRight();
					var height = shape.bounds.height();
					ul.x = 30;
					ul.y = previousLowerRight.y+5;
					lr.y = ul.y + height;
					shape.bounds.set(ul, lr);
					shape.refresh();
					previousLowerRight=shape.bounds.lowerRight();
				}
			}

		}.bind(this));
		}catch(e){alert(e);}
	},
	handleLayoutRoleLanes : function(event) {
	}
});


