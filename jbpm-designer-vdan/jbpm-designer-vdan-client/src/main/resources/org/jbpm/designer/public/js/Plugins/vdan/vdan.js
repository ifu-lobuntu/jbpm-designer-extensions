 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The VDAN plugin provides layout methods referring to the VDAN stencilsets.
 *
 * @class ORYX.Plugins.VDAN
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDAN = Clazz.extend(
/** @lends ORYX.Plugins.VDAN.prototype */
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
		console.log("Initializing VDAN");
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LAYOUT , this.testEvent.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAG_TRACKER_DRAG, this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAGDOCKER_MOVE_FINISHED , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_CANVAS_RESIZE_SHAPES_MOVED , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAG_TRACKER_RESIZE , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_RESIZE_END , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_RESIZE_END , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_RESIZE_END , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.testEvent.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DOCKERDRAG , this.testEvent.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAG_TRACKER_DRAG , this.testEvent.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DROP_SHAPE , this.testEvent.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_AUTOLAYOUT_LAYOUT , this.testEvent.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAGDROP_END , this.testEvent.bind(this));
//		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAGDROP_START, this.testEvent.bind(this));
		this.facade.registerOnEvent('layout.vdml.role_lane', this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEOUT, this.handleMouseOut.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEOVER, this.handleMouseOver.bind(this));
		ORYX.CONFIG.BORDER_OFFSET=30;
		console.log("VDAN Initialized");
	},
	handlePropertyChanged : function(event) {
	},
	layoutRoleLanesOnLoad : function(event) {
		try{
		var previousLowerRight={x:600,y:0};
		this.facade.getCanvas().getChildNodes(true, function(shape){
			if(shape.getStencil()){
				var stencilId=shape.getStencil().id();
				if(stencilId=="http://b3mn.org/stencilset/vdan#Role"){
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
	setCurve:function(uiObject){
		if(uiObject._paths && uiObject.getStencil().idWithoutNs()=="ResourceUse"){
			console.log(uiObject);
			uiObject._paths.each(function (path){
				var from = uiObject.dockers[0].bounds.center();
				var to = uiObject.dockers[uiObject.dockers.length-1].bounds.center();
				var start="M " + from.x + " " + from.y; 
				var end=" " + to.x + " " + to.y; 
				var curvePoint="";
				if(uiObject.dockers.length%2==1){
					var midDocker = uiObject.dockers[(uiObject.dockers.length-1)/2].bounds.center();
					curvePoint= " Q " +  midDocker.x + " " + midDocker.y;
				}else{
					curvePoint = " Q " +  ((from.x + to.x)/2) + " " + (((from.y + to.y)/2) + 30);
				}
				console.log(start+ curvePoint + end);
				path.setAttributeNS(null, "d", start+ curvePoint + end);
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
	},
	testEvent: function (event,uiObject){
		console.log(event.type);
		this.facade.getCanvas().getChildEdges(true, function(shape){
				console.log(shape);
				this.setCurve(shape);
		}.bind(this));
	}
});


