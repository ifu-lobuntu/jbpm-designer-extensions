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
	 * Creates a new instance of the VDAN plugin and registers it on the
	 * layout events listed in the VDAN stencil set.
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
        ORYX.FieldEditors["rolemappings"] = new ORYX.Plugins.VDAN.RoleMappingsEditorFactory();
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
 ORYX.Plugins.VDAN.RoleMappingsEditorFactory = Clazz.extend({
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
         var index = arguments[3];
         try{
             var factType = pair._jsonProp.lookupType;
             var cf = new ORYX.Plugins.VDAN.RoleMappingsEditor({
                 allowBlank: pair.optional(),
                 dataSource: this.dataSource,
                 grid: this.grid,
                 row: index,
                 facade: this.facade,
                 shapes: this.shapeSelection.shapes,
             });

             //cf.servletAction=pair.type().endsWith('taskinparameterandmappings') ? 'showprocessinput' : 'showprocessoutput';
             //cf.targetProfile='cmmn';
             //cf.processId=this.shapeSelection.shapes.first().properties['oryx-caserefqname'];
             cf.on('dialogClosed', this.dialogClosed, {scope:this, row:index, col:1,field:cf});
             return new Ext.Editor(cf);
         }catch(e){
             console.log(e);
         }
     }
 });
 ORYX.Plugins.VDAN.RoleMappingsEditor = Ext.extend(Ext.form.TriggerField, {

     windowTitle : "",
     addButtonLabel : "",
     single : false,
     editable : false,
     readOnly : true,
     dtype : '',
     servletAction:'',
     processId:'',
     profile:'',
     rolesToMap : function(roleMappings){
         if(roleMappings.roleMappings){
             roleMappings=roleMappings.roleMappings;
         }
         var result={};
         for (var i = 0; i < roleMappings.length; i++) {
             result[roleMappings[i].toRole]=roleMappings[i];
         }
         return result;
     },

     /**
      * If the trigger was clicked a dialog has to be opened to enter the values
      * for the complex property.
      */
     onTriggerClick : function() {
         var processJSON = ORYX.EDITOR.getSerializedJSON();
         var processPackage = jsonPath(processJSON.evalJSON(), "$.properties.package");
         var processId = jsonPath(processJSON.evalJSON(), "$.properties.id");
         Ext.Ajax.request({
             url: ORYX.PATH + 'calledelement',
             method: 'POST',
             success: function(response) {
                 try {
                     if(response.responseText.length >= 0 && response.responseText != "false") {
                         var customTypeData = new Array();
                         this.facade.getCanvas().getChildNodes(true, function(shape){
                             if(shape.getStencil()){
                                 var stencilId=shape.getStencil().id();
                                 if(stencilId.endsWith('Role')){
                                     var newCustomType = new Array();
                                     newCustomType.push(shape.properties['oryx-name']);
                                     newCustomType.push(shape.properties['oryx-name']);
                                     customTypeData.push(newCustomType);
                                 }
                             }

                         }.bind(this));

                         var VarDef = Ext.data.Record.create([
                             {
                                 name : 'toRole'
                             }, {
                                 name : 'fromRole'
                             }
                         ]);

                         var vardefsProxy = new Ext.data.MemoryProxy({
                             root : []
                         });

                         var vardefs = new Ext.data.Store({
                             autoDestroy : true,
                             reader : new Ext.data.JsonReader({
                                 root : "root"
                             }, VarDef),
                             proxy : vardefsProxy,
                             sorters : [
                                 {
                                     property : 'toRole',
                                     direction : 'ASC'
                                 }
                             ]
                         });
                         vardefs.load();

                         var activityRoleMappings = this.rolesToMap(this.value.length > 0?this.value.evalJSON():[]);
                         var delegatedCollaborationRoleMappings = this.rolesToMap(response.responseText.evalJSON());
                         var roleMappings=[];
                         for (var key in delegatedCollaborationRoleMappings) {
                             if(activityRoleMappings[key]){
                                 roleMappings.push(activityRoleMappings[key]);
                             }else{
                                 roleMappings.push(delegatedCollaborationRoleMappings[key]);
                             }
                         }
                         for (var i = 0; i < roleMappings.length; i++) {
                             var parm = roleMappings[i];
                             vardefs.add(new VarDef({
                                 toRole : parm.toRole,
                                 fromRole : parm.fromRole
                             }));
                         }

                         var gridId = Ext.id();
                         Ext.form.VTypes["inputNameVal"] = /^[a-z0-9\-\.\_]*$/i;
                         Ext.form.VTypes["inputNameText"] = 'Invalid name';
                         Ext.form.VTypes["inputName"] = function(v) {
                             return Ext.form.VTypes["inputNameVal"].test(v);
                         };

                         var grid = new Ext.grid.EditorGridPanel({
                             autoScroll : true,
                             autoHeight : true,
                             store : vardefs,
                             id : gridId,
                             stripeRows : true,
                             cm : new Ext.grid.ColumnModel([
                                 new Ext.grid.RowNumberer(), {
                                     id : 'toRole',
                                     header : 'To Role',
                                     width : 100,
                                     dataIndex : 'toRole',
                                     editor : new Ext.form.TextField({
                                         allowBlank : true,
                                         vtype : 'inputName',
                                         regex : /^[a-z0-9\-\.\_]*$/i
                                     }),
                                     renderer : Ext.util.Format.htmlEncode
                                 }, {
                                     id : 'fromRole',
                                     header : 'From Role',
                                     width : 150,
                                     dataIndex : 'fromRole',
                                     editor : new Ext.form.ComboBox({
                                         typeAhead : true,
                                         anyMatch : true,
                                         id : 'fromRoleCombo',
                                         valueField : 'value',
                                         displayField : 'name',
                                         labelStyle : 'display:none',
                                         submitValue : true,
                                         queryMode : 'local',
                                         mode : 'local',
                                         triggerAction : 'all',
                                         hideTrigger : false,
                                         forceSelection : false,
                                         selectOnFocus : true,
                                         autoSelect : false,
                                         editable : true,
                                         store : new Ext.data.SimpleStore({
                                             fields : [
                                                 'name', 'value'
                                             ],
                                             data : customTypeData
                                         })
                                     })
                                 }
                             ]),
                             tbar : [],
                             clicksToEdit : 1
                         });

                         var dialog = new Ext.Window({
                             layout : 'anchor',
                             autoCreate : true,
                             title : this.windowTitle,
                             height : 300,
                             width : 600,
                             modal : true,
                             collapsible : false,
                             fixedcenter : true,
                             shadow : true,
                             resizable : true,
                             proxyDrag : true,
                             autoScroll : true,
                             keys : [
                                 {
                                     key : 27,
                                     fn : function() {
                                         dialog.hide()
                                     }.bind(this)
                                 }
                             ],
                             items : [
                                 grid
                             ],
                             listeners : {
                                 hide : function() {
                                     this.fireEvent('dialogClosed', this.value);
                                     // this.focus.defer(10,
                                     // this);
                                     dialog.destroy();
                                 }.bind(this)
                             },
                             buttons : [
                                 {
                                     text : ORYX.I18N.PropertyWindow.ok,
                                     handler : function() {
                                         var outValue = "";
                                         grid.stopEditing();
                                         grid.getView().refresh();
                                         var roleMappings ={roleMappings:[]};
                                         vardefs.data.each(function() {
                                             if (this.data['toRole'].length > 0) {
                                                 roleMappings.roleMappings.push({
                                                     toRole:this.data['toRole'],
                                                     fromRole:this.data['fromRole']
                                                 });
                                             }
                                         });
                                         var outValue=Object.toJSON(roleMappings);
                                         this.setValue(outValue);
                                         this.dataSource.getAt(this.row).set('value', outValue);
                                         this.dataSource.commitChanges();

                                         dialog.hide()
                                     }.bind(this)
                                 }, {
                                     text : ORYX.I18N.PropertyWindow.cancel,
                                     handler : function() {
                                         this.setValue(this.value);
                                         dialog.hide()
                                     }.bind(this)
                                 }
                             ]
                         });

                         dialog.show();
                         grid.render();

                         this.grid.stopEditing();
                         grid.focus(false, 100);
                     }else {
                         this.facade.raiseEvent({
                             type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                             ntype		: 'error',
                             msg         : 'Unable to find Data Types.',
                             title       : ''

                         });
                     }
                 } catch(e) {
                     alert('Error1' + e);
                     this.facade.raiseEvent({
                         type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                         ntype		: 'error',
                         msg         : 'Error retrieving Data Types info '+' :\n' + e,
                         title       : ''

                     });
                 }
             }.bind(this),
             failure: function(e){
                 for(var key in e){
                     alert(key + "=" + e[key]);
                 }
                 this.facade.raiseEvent({
                     type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                     ntype		: 'error',
                     msg         : 'Error retrieving Data Types info.',
                     title       : ''

                 });
             },
             params: {
                 targetProfile: "vdcol",
                 profile: "vdan",
                 filter: "roleMappings",
                 uuid : ORYX.UUID,
                 assetid : ORYX.UUID,
                 pid: this.processId,
                 sourceElementId:this.facade.getSelection().first().resourceId,
                 json : ORYX.EDITOR.getSerializedJSON(),
                 action: this.servletAction
             }
         });
     }
 });


