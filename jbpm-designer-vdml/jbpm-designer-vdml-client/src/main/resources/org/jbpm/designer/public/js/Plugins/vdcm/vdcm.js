 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdcm#" ]= {
        "OrgUnit": 1, 
        "Capability": 2,
        "Position": 3,
        "Resource": 4,
        "Imports": 5
}

/**
 * The VDCM plugin provides layout methods referring to the VDCM stencilsets.
 *
 * @class ORYX.Plugins.VDCM
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDCM = Clazz.extend(
/** @lends ORYX.Plugins.VDCM.prototype */
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
		console.log("Initializing VDCM");
		this.facade.registerOnEvent('layout.vdml.role_lane', this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEOUT, this.handleMouseOut.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEOVER, this.handleMouseOver.bind(this));
		ORYX.CONFIG.BORDER_OFFSET=30;
		console.log("VDCM Initialized");
	},
	handlePropertyChanged : function(event) {
	},
	layoutRoleLanesOnLoad : function(event) {
		try{
		var previousLowerRight={x:600,y:0};
		this.facade.getCanvas().getChildNodes(true, function(shape){
			if(shape.getStencil()){
				var stencilId=shape.getStencil().id();
				if(stencilId=="http://b3mn.org/stencilset/vdcm#Role"){
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
	},
	handleMouse : function (uiObject, display){
		if(uiObject.getStencil && uiObject.getStencil().idWithoutNs()=="ActivityOutputPort"){
			uiObject._svgShapes.each(function(shape){
				if(shape.element.id.indexOf("expand")>0){
					if(shape.element.id.indexOf("expand_vertical") > 0 && ORYX.Plugins.Extensions.isExpanded(uiObject)){
						shape.element.setAttributeNS(null, "display","none");
					}else{
						shape.element.setAttributeNS(null, "display",display);
					}
				}
			});
		}
	},
	handleMouseOver : function (event,uiObject){
		this.handleMouse(uiObject,"inherit");
	},
	handleMouseOut : function (event,uiObject){
		this.handleMouse(uiObject,"none");
	},
	handleLayout: function (event,uiObject){
	}
});


