 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The CMMN plugin provides layout methods referring to the CMMN stencilset.
 *
 * @class ORYX.Plugins.CMMN
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.ClassDiagram = ORYX.Plugins.AbstractPlugin.extend(
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
		this.facade.registerOnEvent('layout.compartments', this.handleLayoutCompartments.bind(this));
		this.facade.registerOnEvent('layout.compartment.list', this.handleLayoutList.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEDOWN, this.handleExpand.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
	},
	handleExpand : function(event, uiObj){
		if(event.explicitOriginalTarget && event.explicitOriginalTarget.id && event.explicitOriginalTarget.id.indexOf("expand_")>=0){
			if(uiObj.properties["oryx-isexpanded"]=="false"){
				uiObj.properties["oryx-isexpanded"]="true";
			}else{
				uiObj.properties["oryx-isexpanded"]="false";
			}
			uiObj._update();
			uiObj._changed();
			uiObj.parent._update();
			uiObj.parent._changed();
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
	updateExpanded : function(parentShape) {
		var currentOffset=25;
		parentShape.getChildShapes(false).forEach(function(compartment){
			var paths=compartment.node.getElementsByTagName("path");
			var verticalPath=null;
			for(var j=0; j < paths.length; j ++){
				if(paths[j].id.indexOf("expand_vertical")>0){
					verticalPath=paths[j];
				}
			}
			var myHeight=0;
			if(compartment.properties["oryx-isexpanded"] =="true"){
				myHeight=(this.calcHeight(compartment));
				compartment.children.each(function(uiObject) {
					if(uiObject instanceof ORYX.Core.Shape) {
						uiObject.behindCollapsedParent=false;
						uiObject.show();
					}
				});
				verticalPath.setAttributeNS(null,"display","none");

			}else{
				verticalPath.setAttributeNS(null,"display","inherit");
				myHeight=13;
				compartment.getChildShapes(true).forEach(function(child){
					child.hide();
					child.behindCollapsedParent=true;
				});
			};
			compartment.bounds.set(1,currentOffset,parentShape.bounds.width()-1, currentOffset+myHeight);
			compartment._changed();
			currentOffset+=myHeight;
		}.bind(this));
		var bounds=parentShape.bounds;
		if(currentOffset==25){
			currentOffset=40;
		}
		currentOffset+=10;
		parentShape.bounds.set(bounds.a.x,bounds.a.y,bounds.b.x,bounds.a.y+currentOffset);
		parentShape._changed();
	},
	calcHeight : function(compartment){
		var currentHeight=13;
		var children=compartment.getChildren();
		for(var i=0; i < children.length; i++){
			var child=children[i];
			if(compartment instanceof ORYX.Core.Shape){
				currentHeight+=20;
			}
		}
		if(currentHeight==13){
			currentHeight=22;//For space to drop children
		}
		return currentHeight;
	},
	handleLayoutCompartments : function(event) {
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
	}

});
