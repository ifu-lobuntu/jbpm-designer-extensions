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
		try{
		this.facade = facade;
		console.log("Initializing VDRC");
	    ORYX.FieldEditors["activity"] = new ORYX.Plugins.VDRC.ActivityEditorFactory();
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.updateDecorations.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		console.log("VDRC Initialized");
		}catch(e){alert(e.toString());}
	},
	updateDecorations: function (event){
		this.facade.getCanvas().getChildEdges(true, function(shape){
			if(shape.getStencil().id().indexOf("DeliverableFlow")>=0){
				this.setDashArray(shape);
			}
		}.bind(this));
	},
	setDashArray:function (shape){
		var dashArray=shape.properties["oryx-istangible"]==true || shape.properties["oryx-istangible"]=="true"?"none":"5,5";
		shape._paths[0].setAttributeNS(null,"stroke-dasharray",dashArray);
	},
	handlePropertyChanged: function (event){
		if(event.key=="oryx-istangible"){
			this.setDashArray(event.elements[0]);
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



