 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdrc#" ]= {
        "Elements": 1, 
        "Edges": 2
}

/**
 * The VDRC plugin provides layout methods referring to the VDRC stencilsets.
 *
 * @class ORYX.Plugins.VDRC
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.VDRC = ORYX.Plugins.AbstractExtensionsPlugin.extend(
/** @lends ORYX.Plugins.VDRC.prototype */
{
	/**
	 * Creates a new instance of the VDML Proposition Exchange plugin
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
        arguments.callee.$.construct.apply(this, arguments);
		this.facade = facade;
		console.log("Initializing VDRC");
	    ORYX.FieldEditors["activity"] = new ORYX.Plugins.VDRC.ActivityEditorFactory();
        this.decoratorUpdaters["ExistingDeliverableFlow"]=this.updateDeliverableFlowDecorations.bind(this);
        this.decoratorUpdaters["NewDeliverableFlow"]=this.updateDeliverableFlowDecorations.bind(this);
		console.log("VDRC Initialized");
	},
	updateDeliverableFlowDecorations:function (shape){
		var dashArray=shape.properties["oryx-istangible"]==true || shape.properties["oryx-istangible"]=="true"?"none":"5,5";
		shape._paths[0].setAttributeNS(null,"stroke-dasharray",dashArray);
		if(shape.properties["oryx-deliverabledefinition"]){
		    var name=shape.properties["oryx-deliverabledefinition"].split("|")[0];
		    name=name.substring(name.indexOf("::")+2);
            shape.properties["oryx-name"]=name;
            console.log(shape.getLabels());
		    shape.getLabels()[0].text(name);
		    shape.getLabels()[0].update();
		}
	}
});
ORYX.Plugins.VDRC.ActivityEditorFactory = Clazz.extend({
    construct: function(){

    },
    /**
     * This function gets executed by propertyWindow in its own context,
     * so this = propertyWindow
     */
    init: function(){
        //arguments: key, pair, icons, index

    	var key = arguments[0];
        var pair = arguments[1];
        console.log(pair);
        var index = arguments[3];
		var options=[];
		try{
			var flow=this.facade.getSelection().first();
			var propId=pair._jsonProp.id;
			var roleShape=null;
			if(propId.indexOf("providing")>=0){
				roleShape=flow.getSource();
			}else{
				roleShape=flow.getTarget();
			}
			if(roleShape.properties["oryx-performedactivities"]){
				var roleNames=roleShape.properties["oryx-performedactivities"].split(",");
				for(var i=0; i<roleNames.length; i++){
					options.push(["", roleNames[i], roleNames[i]]);
				}
			}
			var store = new Ext.data.SimpleStore({
				fields: [{name: 'icon'},
				         {name: 'title'},
				         {name: 'value'}	],
				         data : options
			});
	        var editorCombo = new Ext.form.ComboBox({
	            editable: true,
	            tpl: '<tpl for="."><div class="x-combo-list-item">{[(values.icon) ? "<img src=\'" + values.icon + "\' />" : ""]} {title}</div></tpl>',
	            store: store,
	            forceSelection:false,
	            displayField:'title',
	            valueField: 'value',
	            typeAhead: true,
	            mode: 'local',
	            triggerAction: 'all',
	            selectOnFocus:true
	        });
//	        ;
	        var editor=new Ext.Editor(editorCombo,{completeOnEnter:false});
	        var applyValue=function(v){
	        	//TODO find the correct way to do this
	        	this.editDirectly(key,v.field.lastQuery);
	        	editorCombo.setValue(v.field.lastQuery);
	        	editor.setValue(v.field.lastQuery);
	        	editor.boundEl.update(v.field.lastQuery);
	        }.bind(this);
	        editor.on("complete", applyValue);
	        return editor;
		}catch(e){
			console.log(e.toString());
		}
    }
});



