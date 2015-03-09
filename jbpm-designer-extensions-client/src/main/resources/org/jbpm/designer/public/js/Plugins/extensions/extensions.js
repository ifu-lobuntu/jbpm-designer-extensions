 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The CMMN plugin provides layout methods referring to the CMMN stencilset.
 *
 * @class ORYX.Plugins.CMMN
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.Collapsible = ORYX.Plugins.AbstractPlugin.extend(
/** @lends ORYX.Plugins.CMMN.prototype */  
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
		this.facade.registerOnEvent('layout.collapsible', this.handleLayoutCollapsible.bind(this));
		this.facade.registerOnEvent('layout.list', this.handleLayoutList.bind(this));
		this.facade.registerOnEvent('layout.compartments', this.handleLayoutCompartments.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEDOWN, this.handleExpand.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
	},
	handleExpand : function(event, uiObject){
		if(event.explicitOriginalTarget && event.explicitOriginalTarget.id && event.explicitOriginalTarget.id.indexOf("expand_")>=0){
			var newWidth=parseFloat(uiObject.properties["oryx-previouswidth"]);
			var newHeight=parseFloat(uiObject.properties["oryx-previousheight"]);
			uiObject.properties["oryx-previouswidth"]=uiObject.bounds.width();
			uiObject.properties["oryx-previousheight"]=uiObject.bounds.height();
			var topLeft=uiObject.bounds.a;
			uiObject.bounds.set(topLeft,{x:topLeft.x+newWidth, y:topLeft.y + newHeight})
			if(uiObject.properties["oryx-isexpanded"]=="false"){
				uiObject.properties["oryx-isexpanded"]="true";
			}else{
				uiObject.properties["oryx-isexpanded"]="false";
			}
			uiObject._update();
			uiObject._changed();
			if(uiObject.parent instanceof ORYX.Core.Shape){
//				uiObject.parent._update();
//				uiObject.parent._changed();
			}
			this.facade.getCanvas().update();
			this.facade.updateSelection();
		}
	},
	handlePropertyChanged : function(event) {
		if (event["key"] == "oryx-name" || event["key"] == "oryx-type") {
			this.updateDecorations(event.elements[0]);
		}
	},
	updateDecorations : function(shape) {
		var labels=shape.getLabels();
		for(var i=0 ; i < labels.length; i++){
		    if(labels[i].id==shape.id+"text_type"){
				var type=shape.properties["oryx-propertytype"];
				labels[i].text(shape.properties["oryx-name"] + " : " + type);
				labels[i].update();
			}
		}
	},
	updateExpanded : function(collapsibleShape) {
		var currentOffset=25;
		var paths=collapsibleShape.node.getElementsByTagName("path");
		var verticalPath=null;
		for(var j=0; j < paths.length; j ++){
			if(paths[j].id == collapsibleShape.id+"expand_vertical"){
				verticalPath=paths[j];
				break;
			}
		}
		if(collapsibleShape.properties["oryx-isexpanded"] == "true"){
			verticalPath.setAttributeNS(null,'display','none');
			collapsibleShape.children.each(function(uiObject) {
				if(uiObject instanceof ORYX.Core.Shape){
					this.showShape(uiObject);
					console.log(uiObject);
				}
			}.bind(this));
		}else{
			verticalPath.setAttributeNS(null,'display','inherit');
			collapsibleShape.children.each(function(uiObject){
				if(uiObject instanceof ORYX.Core.Shape){
					this.hideShape(uiObject);
				}
			}.bind(this));
		};
	},
	showShape: function(uiObject){
		uiObject.node.setAttributeNS(null, 'display', 'inherit');
		uiObject.isVisible = true;
		uiObject.behindCollapsedParent=false;
		if(uiObject.incoming && uiObject.outgoing){
			uiObject.incoming.each(function(edge){
				if(edge instanceof ORYX.Core.Edge){
					this.showShape(edge);
				}
			}.bind(this));
			uiObject.outgoing.each(function(edge){
				if(edge instanceof ORYX.Core.Edge){
					this.showShape(edge);
				}
			}.bind(this));
		}
	},
	hideShape: function(uiObject){
		uiObject.node.setAttributeNS(null, 'display', 'none');
		uiObject.isVisible = false;
		uiObject.behindCollapsedParent=true;
		if(uiObject.incoming && uiObject.outgoing){
			uiObject.incoming.each(function(edge){
				if(edge instanceof ORYX.Core.Edge){
					this.hideShape(edge);
				}
			}.bind(this));
			uiObject.outgoing.each(function(edge){
				if(edge instanceof ORYX.Core.Edge){
					this.hideShape(edge);
				}
			}.bind(this));
		}

	},
	handleLayoutCollapsible : function(event) {
		this.updateExpanded(event.shape);
	},
	handleLayoutList : function(event) {
		var shape = event.shape;
		var currentOffset=15;
		shape.getChildShapes(false).forEach(function(item){
			item.bounds.set(
					1,
					currentOffset,
					shape.bounds.b.x - shape.bounds.a.x - 2,
					currentOffset + 20
			);
			currentOffset+=21;
		});
	},
	handleLayoutCompartments : function(event) {
	}

});
