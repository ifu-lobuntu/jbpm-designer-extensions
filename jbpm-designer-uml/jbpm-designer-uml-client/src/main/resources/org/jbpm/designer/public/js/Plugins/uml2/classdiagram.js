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
	decoratorUpdaters:{},
	/**
	 * Creates a new instance of the CMMN plugin and registers it on the
	 * layout events listed in the CMMN stencil set.
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
		this.facade = facade;
		try{
			this.decoratorUpdaters={};
			this.decoratorUpdaters["Property"]=this.updatePropertyDecorations.bind(this);
			this.decoratorUpdaters["ImportedClass"]=this.updateImportDecorations.bind(this);
			this.decoratorUpdaters["ImportedInterface"]=this.updateImportDecorations.bind(this);
			this.decoratorUpdaters["ImportedEnumeration"]=this.updateImportDecorations.bind(this);

		this.facade.registerOnEvent('layout.compartments', this.handleLayoutCompartments.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEDOWN, this.handleExpand.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.updateDecorationsOnLoad.bind(this));
		console.log("success");
		}catch(e){alert(e);}
	},
	handleExpand : function(event, uiObj){
	},
	updatePropertyDecorations : function(shape){
		var labels=shape.getLabels();
		for(var i=0 ; i < labels.length; i++){
		    if(labels[i].id==shape.id+"text_fullname"){
				var type= ORYX.Plugins.Extensions.extractName(shape.properties["oryx-type"]);
				var mult= ORYX.Plugins.Extensions.extractName(shape.properties["oryx-multiplicity"]);
				labels[i].text(shape.properties["oryx-name"] + " : " + type +" [" + mult + "]");
				labels[i].update();
			}
		}
	},
	updateImportDecorations : function(shape){
		console.log("here");
		var labels=shape.getLabels();
		for(var i=0 ; i < labels.length; i++){
		    if(labels[i].id==shape.id+"text_name"){
		    	var name="";
		    	for(var key in shape.properties){
		    		if(key.indexOf("imported")>=0){
		    			name=shape.properties[key];
		    			break;
		    		}
		    	}
		    	name=name.substring(0, name.indexOf("|"));
				labels[i].text(name);
				labels[i].update();
			}
		}
	},
	handlePropertyChanged : function(event) {
		try{
		console.log(event.elements[0].getStencil().idWithoutNs());
		var updater = this.decoratorUpdaters[event.elements[0].getStencil().idWithoutNs()];
		console.log(updater);
		if(updater){
			updater(event.elements[0]);
		}}catch(e){alert(e);}
	},
	updateDecorationsOnLoad : function() {
		this.facade.getCanvas().getChildNodes(true,function(shape){
			var updater = this.decoratorUpdaters[shape.getStencil().idWithoutNs()];
			if(updater){
				updater(shape);
			}
		}.bind(this));
	},
	updateExpanded : function(parentShape) {
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
	}

});
