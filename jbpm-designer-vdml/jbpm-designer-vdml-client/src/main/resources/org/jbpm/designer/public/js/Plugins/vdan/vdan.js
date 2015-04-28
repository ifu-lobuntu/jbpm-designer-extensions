 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdan#" ]= {
    "General": 1,
    "Activity": 2,
    "Store" : 3,
    "Flows" : 4
}

/**
 * The VDAN plugin provides layout methods referring to the VDAN stencilsets.
 *
 * @class ORYX.Plugins.VDAN
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDAN = ORYX.Plugins.AbstractExtensionsPlugin.extend(
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
        arguments.callee.$.construct.apply(this, arguments);
		this.facade = facade;
		console.log("Initializing VDAN");
		this.facade.registerOnEvent('layout.vdml.role_lane', this.layoutRoleLanesOnLoad.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.initAfterLoad.bind(this));
        this.decoratorUpdaters["DeliverableFlow"]=this.updateDeliverableFlowDecorations.bind(this);
        this.decoratorUpdaters["Store"]=this.updateStoreDecorations.bind(this);
        this.decoratorUpdaters["Pool"]=this.updateStoreDecorations.bind(this);
        this.decoratorUpdaters["CollaborationOutputPort"]=this.updateOutputPortDecorations.bind(this);
        this.decoratorUpdaters["ActivityOutputPort"]=this.updateOutputPortDecorations.bind(this);
        this.decoratorUpdaters["StoreOutputPort"]=this.updateOutputPortDecorations.bind(this);
		ORYX.CONFIG.BORDER_OFFSET=30;
		console.log("VDAN Initialized");
	},
    initAfterLoad:function (event){
      this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPEADDED, this.maybeUpdateOutputPortDecorations.bind(this));
      this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPE_DELETED, this.maybeUpdateOutputPortDecorations.bind(this));
      this.layoutRoleLanesOnLoad(event);
    },
	maybeUpdateOutputPortDecorations:function (event){
	    if(event.shape instanceof ORYX.Core.Node && event.shape.getStencil().idWithoutNs()=="ValueAdd"){
	        this.updateOutputPortDecorations(event.shape.parent);
	    }else{
	        console.log(event);
	    }
    },
    updateStoreDecorations:function (shape){
        ORYX.Plugins.Extensions.updateNameAndLabel(shape,"storeref", "text_name");
    },
    updateOutputPortDecorations:function (shape){
        var hasValueAdd=false;
        shape.getPersistentChildShapes().forEach(function(child){
           if(child.getStencil().idWithoutNs()=="ValueAdd"){
               hasValueAdd=true;
               return false;
           }
        });
        if(hasValueAdd){
            shape.node.ownerDocument.getElementById(shape.id + "bg_frame").setAttributeNS(null, "fill","black");
            if(shape.getStencil().idWithoutNs()!="CollaborationOutputPort"){
                shape.node.ownerDocument.getElementById(shape.id + "expandbutton").setAttributeNS(null, "stroke","white");
                shape.node.ownerDocument.getElementById(shape.id + "expandvertical").setAttributeNS(null, "stroke","white");
                shape.node.ownerDocument.getElementById(shape.id + "expandhorizontal").setAttributeNS(null, "stroke","white");
            }
        }else{
            shape.node.ownerDocument.getElementById(shape.id + "bg_frame").setAttributeNS(null, "fill","url(#background) #ffffff");
            if(shape.getStencil().idWithoutNs()!="CollaborationOutputPort"){
                shape.node.ownerDocument.getElementById(shape.id + "expandbutton").setAttributeNS(null, "stroke","black");
                shape.node.ownerDocument.getElementById(shape.id + "expandvertical").setAttributeNS(null, "stroke","black");
                shape.node.ownerDocument.getElementById(shape.id + "expandhorizontal").setAttributeNS(null, "stroke","black");
            }
        }
    },
    updateDeliverableFlowDecorations:function (shape){
        var dashArray=shape.properties["oryx-istangible"]==true || shape.properties["oryx-istangible"]=="true"?"none":"5,5";
        shape._paths[0].setAttributeNS(null,"stroke-dasharray",dashArray);
        ORYX.Plugins.Extensions.updateNameAndLabel(shape,"deliverabledefinition", "text_name");
    },
	layoutRoleLanesOnLoad : function(event) {
		try{
		var previousLowerRight={x:600,y:0};
		var roles=[];
		this.facade.getCanvas().getChildNodes(true, function(shape){
			if(shape.getStencil()){
				var stencilId=shape.getStencil().id();
				if(stencilId=="http://b3mn.org/stencilset/vdan#Role"){
				    roles.push(shape);
				}
			}

		}.bind(this));
		roles.sort(function(shape1,shape2){
		   return shape1.bounds.a.y-shape2.bounds.a.y; 
		});
		roles.forEach(function (shape){
            var ul = shape.bounds.upperLeft();
            var lr = shape.bounds.lowerRight();
            var height = shape.bounds.height();
            ul.x = 30;
            ul.y = previousLowerRight.y+10;
            lr.y = ul.y + height;
            shape.bounds.set(ul, lr);
            shape.refresh();
            previousLowerRight=shape.bounds.lowerRight();
		});
		}catch(e){console.log(e.toString());}
	}
});


