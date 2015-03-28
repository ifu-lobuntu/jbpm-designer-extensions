 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The CMMN plugin provides layout and decoration methods referring to the CMMN stencilset.
 *
 * @class ORYX.Plugins.CMMN
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.CMMN = Clazz.extend(
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
		try{
			this.facade = facade;
			this.decoratorUpdaters={};
			this.affectedShapes=[];
			this.decoratorUpdaters["CaseFileItem"]=this.updateCaseFileItemDecorations.bind(this);
			this.decoratorUpdaters["HumanTask1"]=this.updateHumanTaskDecorations.bind(this);
			this.decoratorUpdaters["DiscretionaryHumanTask1"]=this.updateHumanTaskDecorations.bind(this);
			this.decoratorUpdaters["Stage"]=this.updateStageAndCaseDecorations.bind(this);
			this.decoratorUpdaters["DiscretionaryStage"]=this.updateStageAndCaseDecorations.bind(this);
			this.decoratorUpdaters["Case"]=this.updateStageAndCaseDecorations.bind(this);
	        ORYX.FieldEditors["caseroleref"] = new ORYX.Plugins.CMMN.CaseRoleRefEditorFactory();
	        ORYX.FieldEditors["taskparameters"] = new ORYX.Plugins.CMMN.TaskParametersEditorFactory();
	        ORYX.FieldEditors["taskinparameterandmappings"] = new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory();
	        ORYX.FieldEditors["taskoutparameterandmappings"] = new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory();
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.updateDecorationsOnLoad.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEDOWN, this.handlePlanningTableExpand.bind(this));
		}catch(e){
			console.log(e);
		}
	},
	onAdd : function(event){
		try{
			if(event.shape instanceof ORYX.Core.Node){
				console.log(event);
				this.affectedShapes.push(event.shape);
				this.affectedShapes.push(event.shape.getParentShape());
				this.updateAffectedShapes(event);
			}
		}catch(e){
			console.log(e.toString());
		}
	},
	onCommand : function(event) {
		try{
			var updateAffectedShapes=event.type==ORYX.CONFIG.EVENT_UNDO_ROLLBACK || event.type==ORYX.CONFIG.EVENT_UNDO_EXECUTE;
			this.maybeAddAffectedShape(this.facade.getSelection());
			for(var i=0; i < event.commands.length; i ++){
				var command=event.commands[i];
				if(command.dock){//dragDocker.js command
					updateAffectedShapes=true;
				}
				for(var key in command){
					this.maybeAddAffectedShape(command[key]);
				}
			}
			if(updateAffectedShapes){
				this.updateAffectedShapes();
			}
		}catch(e){
			console.log(e.toString());
		}
	},
	maybeAddAffectedShape : function(obj){
		if(obj){
			var shape=null;
			if(obj instanceof ORYX.Core.Shape){
				shape=obj;
			}else if(obj.dockedShape){
				shape=obj.dockedShape;
			}else if(obj.selection){
			}else if(obj._dockedShape){
				shape=obj._dockedShape;
			}
			if(shape && this.affectedShapes.indexOf(shape)<0){
				this.affectedShapes.push(shape);
				if(shape.getParentShape() && this.affectedShapes.indexOf(shape.getParentShape())<0){
					this.affectedShapes.push(shape.getParentShape());
				}
			}
			if(Array.isArray(obj)){
				for(var j=0; j < obj.length;j++){
					this.maybeAddAffectedShape(obj[j]);
				}
			}
		}
	},
	updateAffectedShapes : function(event){
		console.log(event);
		var parents=[];
		if(this.affectedShapes.length==0){
			//More than one event affected the shapes, restore from the buffer
			this.affectedShapes=this.bufferedAffectedShapes;
		}
		this.affectedShapes.forEach(function(s){
			console.log(s);
			if(s.parent){
				//ignore deleted shapes
				var handler=this.decoratorUpdaters[s.getStencil().idWithoutNs()];
				if(handler){
					handler(s);
				}
			}
		}.bind(this));
		this.bufferedAffectedShapes=this.affectedShapes;
		this.affectedShapes=[];
	},
	updateCaseFileItemDecorations: function(shape){
		var name=shape.properties["oryx-casefileitemstructureref"];
		name=name.slice(name.indexOf("::")+2,name.indexOf("|"));
		shape.setProperty("oryx-name", name,true);
		shape.refresh();
	},
	handlePropertyChanged : function(event) {
		var handler=this.decoratorUpdaters[event.elements[0].getStencil().idWithoutNs()];
		if(handler){
			handler(event.elements[0]);
		}
		//TODO : clean this up as above
		if (event["key"] == "oryx-autocomplete" || event["key"] == "oryx-manualactivationrulebody" || event["key"] == "oryx-repetitionrulebody"
			|| event["key"] == "oryx-requiredrulebody" || event["key"] == "oryx-propertytype" || event["key"] == "oryx-name" || event["key"] == "oryx-standardevent") {
			this.updateDecorations(event.elements[0]);
		}
	},
	updateDecorationsOnLoad : function(event) {
		try{
			this.facade.getCanvas().getChildNodes(true, function(shape){
				if(shape.getStencil()){
					var stencilId=shape.getStencil().idWithoutNs();
					var handler=this.decoratorUpdaters[stencilId];
					if(handler){
						handler(shape);
					}else  if(stencilId.indexOf("Task")>=0 || stencilId.indexOf("Stage")>=0 || stencilId.indexOf("Milestone") >=0 || stencilId.indexOf("Property") >=0){
						this.updateDecorations (shape);
					}
				}
	
			}.bind(this));
			for(var i=0; i < this.facade.getCanvas().edges.length; i ++){
				var edge=this.facade.getCanvas().edges[i];
				if(edge.getStencil()){
					var stencilId=edge.getStencil().id();
					if(stencilId.indexOf("OnPart") >=0 || stencilId.indexOf("StartTrigger") >=0){
						this.updateDecorations (edge);
					}
				}
			}
			//Only now we register further events
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_RESIZE_END,function(event){
				console.log(event.shapes[0]);
				this.affectedShapes.push(event.shapes[0]);
				this.updateAffectedShapes();
				}.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DRAGDOCKER_DOCKED,this.updateAffectedShapes.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPE_ADDED, this.updateAffectedShapes.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPEADDED, this.onAdd.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPE_DELETED, this.updateAffectedShapes.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPEADDED, this.updateAffectedShapes.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_UNDO_ROLLBACK, this.onCommand.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_UNDO_EXECUTE, this.onCommand.bind(this));
			this.facade.registerOnEvent(ORYX.CONFIG.EVENT_EXECUTE_COMMANDS, this.onCommand.bind(this));
		}catch(e){
			console.log(e.toString());
		}
	},
	updateStageAndCaseDecorations : function(shape){
		console.log("updateStageAndCaseDecorations");
		try{
		this.updateDecorations(shape);
		var hasPlanningTable=false;
		for(var i =0; i < shape.children.length; i++ ){
			var child=shape.children[i];
			if(child instanceof ORYX.Core.Node && child.getStencil().idWithoutNs().indexOf("Discretionary")>=0){
				hasPlanningTable=true;
				for(var j =0; j < child.incoming.length; j++ ){
					var incoming=child.incoming[j];
					if(incoming.getStencil().idWithoutNs()=="DiscretionaryLink"){
						hasPlanningTable=false;
					}
				}
				if(hasPlanningTable){
					break;
				}
			}
		}
		console.log("here");
		this.setPlanningTableDisplay(shape,hasPlanningTable?"inherit":"none");
		this.updatePlanningTableDecorator(shape);}catch(e){alert(e);}
	},
	updateHumanTaskDecorations : function(shape){
		console.log("updateHumanTaskDecorations");
		this.updateDecorations(shape);
		var hasPlanningTable=false;
		for(var i =0; i < shape.outgoing.length; i++ ){
			var outgoing=shape.outgoing[i];
			if(outgoing.getStencil().idWithoutNs()=="DiscretionaryLink"){
				hasPlanningTable=true;
			}
		}
		this.setPlanningTableDisplay(shape,hasPlanningTable?"inherit":"none");
		this.updatePlanningTableDecorator(shape);
	},
	setPlanningTableDisplay:function(shape,display){
		shape._svgShapes.each(function(node){
			if(node.element.id.indexOf("planning_table_")>=0){
				node.element.setAttributeNS(null, "display", display);
			}
		});
	},
	updateDecorations : function(shape){
		console.log("updateDecorations");

    	try{
    		var DecorationHelper = Clazz.extend({
    			construct: function(theShape) {
    				this.shape=theShape;
    				this.elements=[];
    				this.totalWidth=0;
    				this.ratio=Math.max(1, this.shape.bounds.width()/400);
    			    this.addElement("expand_button",true,0);
    			    this.addElement("expand_vertical",true,0);
    			    this.addElement("expand_horizontal",true,13);
    			    this.addElement("auto_complete_rect",Boolean(shape.properties["oryx-autocomplete"]),14);
    				var body=shape.properties["oryx-manualactivationrulebody"];
    				this.addElement("manual_activation_path",body && body.length > 0,11);
    				body=shape.properties["oryx-repetitionrulebody"];
    				this.addElement("repetition_text",body && body.length > 0,8);
    				body=shape.properties["oryx-requiredrulebody"];
    				this.addElement("required_text",body && body.length > 0,8);
    			},
    			addElement: function(suffix,condition,xIncrement){
					var el= this.shape.node.ownerDocument.getElementById(this.shape.id+suffix);
					if(el){
						if(condition){
							this.totalWidth+=(xIncrement*this.ratio);
						}
						this.elements.push({
							element:el,
							isVisible:condition,
							width:xIncrement*this.ratio
						});
					}
    			},	
    			updateDecorations : function(){
    				var x = (this.shape.bounds.width()/2) - (this.totalWidth/2);
    				this.elements.each(function (el){
    					if(el.isVisible){
    						el.element.setAttributeNS(null, "display","inherit");
        					el.element.setAttributeNS(null, "transform","translate(" + x + ",0)");
        					x+=el.width;
    					}else{
    						el.element.setAttributeNS(null, "display", "none");
    					}
    				}.bind(this));
    			}
    		});
    		new DecorationHelper(shape).updateDecorations();
		}catch(e){
				console.log(e.toString());
		}
        if(shape.getLabels){
			var labels=shape.getLabels();
			for(var i=0 ; i < labels.length; i++){
				if(labels[i].id==shape.id+"text_type"){
					var type=shape.properties["oryx-propertytype"];
					labels[i].text(shape.properties["oryx-name"] + " : " + type.substring(type.lastIndexOf("/")+1));
					labels[i].update();
				}else if(labels[i].id==shape.id+"text_event"){
					var type=shape.properties["oryx-standardevent"];
					labels[i].text(shape.properties["oryx-standardevent"]);
					labels[i].update();
				}
			}
        }
	},
	updatePlanningTableDecorator: function(uiObject){
		console.log("updatePlanningTableDecorator");

		var horizontalPath=uiObject.node.ownerDocument.getElementById(uiObject.id+"planning_table_horizontal");
		if(horizontalPath && horizontalPath.getAttributeNS(null,"display") == "inherit"){
			var verticalPath=uiObject.node.ownerDocument.getElementById(uiObject.id+"planning_table_vertical");
			if(this.isExpanded(uiObject)){
				verticalPath.setAttributeNS(null,'display','none');
				if(uiObject.getStencil().id().indexOf("HumanTask")>=0){
					for(var i=0; i< uiObject.outgoing.length ; i ++){
						var edge=uiObject.outgoing[i];
						if(edge.getStencil().idWithoutNs() == "DiscretionaryLink" && edge.outgoing.length>0){
							ORYX.Plugins.Extensions.showShape(edge.outgoing[0]);
						}
					}
				}else{
					uiObject.children.each(function(shape){
						if(this.isMyItem(uiObject, shape)){
							ORYX.Plugins.Extensions.showShape(shape);
						}
					}.bind(this));
				}
			}else{
				verticalPath.setAttributeNS(null,'display','inherit');
				if(uiObject.getStencil().id().indexOf("HumanTask")>=0){
					for(var i=0; i< uiObject.outgoing.length ; i ++){
						var edge=uiObject.outgoing[i];
						if(edge.getStencil().idWithoutNs() == "DiscretionaryLink" && edge.outgoing.length>0){
							ORYX.Plugins.Extensions.hideShape(edge.outgoing[0]);
						}
					}
				}else{
					uiObject.getChildShapes(false,function(shape){
						if(this.isMyItem(uiObject, shape)){
							ORYX.Plugins.Extensions.hideShape(shape);
						}
					}.bind(this));
				}
			}
		}
	},
	handlePlanningTableExpand : function(event, uiObject){
		if(event.explicitOriginalTarget && event.explicitOriginalTarget.id && event.explicitOriginalTarget.id.indexOf("planning_table")>=0){
			uiObject.properties["oryx-isplanningtableexpanded"]=!this.isExpanded(uiObject);
			this.updatePlanningTableDecorator(uiObject);
		}
	},
	isMyItem: function(planningShape, shape){
		if(shape instanceof ORYX.Core.Shape && shape.getStencil().id().indexOf("Discretionary")>=0){
			for(var i=0; i< shape.incoming.length ; i ++){
				var edge=shape.incoming[i];
				if(edge.getStencil().idWithoutNs() == "DiscretionaryLink"){
					return false;
				}
			}
			return true;
		}
		
	},
	isExpanded : function(shape){
		return shape.properties["oryx-isplanningtableexpanded"] == true || shape.properties["oryx-isplanningtableexpanded"]=="true"  || shape.properties["oryx-isplanningtableexpanded"]===undefined;
	}
});
ORYX.Plugins.CMMN.TaskParametersEditorFactory = Clazz.extend({
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
        	
        	var cf = new ORYX.Plugins.CMMN.TaskParametersEditor({
                allowBlank: pair.optional(),
                dataSource: this.dataSource,
                grid: this.grid,
                row: index,
                facade: this.facade,
                shapes: this.shapeSelection.shapes
        	});

        	cf.on('dialogClosed', this.dialogClosed, {scope:this, row:index, col:1,field:cf});
        	return new Ext.Editor(cf);
        }catch(e){
        	console.log(e);
        }
    }
});
ORYX.Plugins.CMMN.TaskParametersEditor = Ext.extend(Ext.form.TriggerField, {

	windowTitle : "",
	addButtonLabel : "",
	single : false,
	editable : false,
	readOnly : true,
	dtype : "",

	/**
	 * If the trigger was clicked a dialog has to be opened to enter the values
	 * for the complex property.
	 */
	onTriggerClick : function() {
		try{
			var customTypeData = new Array();
			this.facade.getCanvas().getChildNodes(true, function(shape){
				if(shape.getStencil()){
					var stencilId=shape.getStencil().id();
					if(stencilId.endsWith("CaseFileItem")){
						var newCustomType = new Array();
						newCustomType.push(shape.properties['oryx-name']);
						newCustomType.push(shape.properties['oryx-name']);
						customTypeData.push(newCustomType);
					}
				}
			}.bind(this));
	
			var VarDef = Ext.data.Record.create([
					{
						name : 'name'
					}, {
						name : 'binding'
					}, {
						name : 'bindingRefinementLanguage'
					}, {
						name : 'bindingRefinement'
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
						property : 'name',
						direction : 'ASC'
					}
				]
			});
			vardefs.load();
			if (this.value.length > 0) {
				var parameters = this.value.evalJSON();
				if(parameters.parameters){
					parameters=parameters.parameters;
				}
				for (var i = 0; i < parameters.length; i++) {
					var parm = parameters[i];
					vardefs.add(new VarDef({
						name : parm.name,
						binding : parm.binding,
						bindingRefinementLanguage : parm.bindingRefinementLanguage,
						bindingRefinement : parm.bindingRefinement
					}));
				}
			}
	
			var itemDeleter = new Extensive.grid.ItemDeleter();
			itemDeleter.setDType(this.dtype);
	
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
							id : 'name',
							header : 'Name',
							width : 100,
							dataIndex : 'name',
							editor : new Ext.form.TextField({
								allowBlank : true,
								vtype : 'inputName',
								regex : /^[a-z0-9\-\.\_]*$/i
							}),
							renderer : Ext.util.Format.htmlEncode
						}, {
							id : 'binding',
							header : 'Case File Item',
							width : 150,
							dataIndex : 'binding',
							editor : new Ext.form.ComboBox({
								typeAhead : true,
								anyMatch : true,
								id : 'bindingCombo',
								valueField : 'value',
								displayField : 'name',
								labelStyle : 'display:none',
								submitValue : true,
								typeAhead : true,
								queryMode : 'local',
								mode : 'local',
								triggerAction : 'all',
								selectOnFocus : true,
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
						}, {
							id : 'bindingRefinementLanguage',
							header : 'Language',
							width : 70,
							dataIndex : 'bindingRefinementLanguage',
							editor : new Ext.form.ComboBox({
								typeAhead : true,
								anyMatch : true,
								id : 'languageCombo',
								valueField : 'value',
								displayField : 'name',
								labelStyle : 'display:none',
								submitValue : true,
								typeAhead : true,
								queryMode : 'local',
								mode : 'local',
								triggerAction : 'all',
								selectOnFocus : true,
								hideTrigger : false,
								forceSelection : false,
								selectOnFocus : true,
								autoSelect : false,
								editable : true,
								store : new Ext.data.SimpleStore({
									fields : [
											'name', 'value'
									],
									data : [["Java","java"],["MVEL","mvel"]]
								})
							})
						}, {
							id : 'bindingRefinement',
							header : 'Refinement',
							width : 200,
							dataIndex : 'bindingRefinement',
							editor : new Ext.form.TextField({
								allowBlank : true
							}),
							renderer : Ext.util.Format.htmlEncode
						}, itemDeleter
				]),
				selModel : itemDeleter,
				autoHeight : true,
				tbar : [
					{
						text : "Add",
						handler : function() {
							if (this.single && vardefs.getCount() > 0) {
								this.facade.raiseEvent({
									type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
									ntype : 'error',
									msg : ORYX.I18N.PropertyWindow.OnlySingleEntry,
									title : ''
	
								});
							} else {
								vardefs.add(new VarDef({
									name : '',
									binding : '',
									bindingRefinementLanguage : '',
									bindingRefinement : ''
								}));
								grid.fireEvent('cellclick', grid, vardefs.getCount() - 1, 1, null);
							}
						}.bind(this)
					}
				],
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
								var parameters ={parameters:[]};
								vardefs.data.each(function() {
									if (this.data['name'].length > 0) {
										parameters.parameters.push({
											name:this.data['name'],
											binding:this.data['binding'],
											bindingRefinementLanguage:this.data['bindingRefinementLanguage'],
											bindingRefinement:this.data['bindingRefinement'],
										});
									}
								});
								var outValue=Object.toJSON(parameters);
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
		}catch(e){
			console.log(e);
		}
	}
});
ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory = Clazz.extend({
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
        	var cf = new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditor({
                allowBlank: pair.optional(),
                dataSource: this.dataSource,
                grid: this.grid,
                row: index,
                facade: this.facade,
                shapes: this.shapeSelection.shapes,
        	});

            cf.servletAction=pair.type().endsWith('taskinparameterandmappings') ? 'showprocessinput' : 'showprocessoutput';
            if(this.shapeSelection.shapes.first().getStencil().id().contains('ProcessTask')){
            	cf.profile= 'jbpm';
        		cf.processId=this.shapeSelection.shapes.first().properties['oryx-calledprocess'];
        	}else{
            	cf.profile='cmmn';
        		cf.processId=this.shapeSelection.shapes.first().properties['oryx-calledcase'];
        	}
        	cf.on('dialogClosed', this.dialogClosed, {scope:this, row:index, col:1,field:cf});
        	return new Ext.Editor(cf);
        }catch(e){
        	console.log(e);
        }
    }
});
ORYX.Plugins.CMMN.TaskParameterAndMappingsEditor = Ext.extend(Ext.form.TriggerField, {

	windowTitle : "",
	addButtonLabel : "",
	single : false,
	editable : false,
	readOnly : true,
	dtype : '',
	servletAction:'',
	processId:'',
	profile:'',
	parametersToMap : function(parameters){
		if(parameters.parameters){
			parameters=parameters.parameters;
		}
		var result={};
		for (var i = 0; i < parameters.length; i++) {
			result[parameters[i].name]=parameters[i];
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
								if(stencilId.endsWith('CaseFileItem')){
									var newCustomType = new Array();
									newCustomType.push(shape.properties['oryx-name']);
									newCustomType.push(shape.properties['oryx-name']);
									customTypeData.push(newCustomType);
								}
							}

						}.bind(this));

						var VarDef = Ext.data.Record.create([
								{
									name : 'name'
								}, {
									name : 'binding'
								}, {
									name : 'bindingRefinementLanguage'
								}, {
									name : 'bindingRefinement'
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
									property : 'name',
									direction : 'ASC'
								}
							]
						});
						vardefs.load();

						var taskParameters = this.parametersToMap(this.value.length > 0?this.value.evalJSON():[]);
						var calledElementParameters = this.parametersToMap(response.responseText.evalJSON());
						var parameters=[];
						for (var key in calledElementParameters) {
							if(taskParameters[key]){
								parameters.push(taskParameters[key]);
							}else{
								parameters.push(calledElementParameters[key]);
							}
						}
						for (var i = 0; i < parameters.length; i++) {
							var parm = parameters[i];
							vardefs.add(new VarDef({
								name : parm.name,
								binding : parm.binding,
								bindingRefinementLanguage : parm.bindingRefinementLanguage,
								bindingRefinement : parm.bindingRefinement
							}));
						}

						var itemDeleter = new Extensive.grid.ItemDeleter();
						itemDeleter.setDType(this.dtype);

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
										id : 'name',
										header : 'Name',
										width : 100,
										dataIndex : 'name',
										editor : new Ext.form.TextField({
											allowBlank : true,
											vtype : 'inputName',
											regex : /^[a-z0-9\-\.\_]*$/i
										}),
										renderer : Ext.util.Format.htmlEncode
									}, {
										id : 'binding',
										header : 'Case File Item',
										width : 150,
										dataIndex : 'binding',
										editor : new Ext.form.ComboBox({
											typeAhead : true,
											anyMatch : true,
											id : 'bindingCombo',
											valueField : 'value',
											displayField : 'name',
											labelStyle : 'display:none',
											submitValue : true,
											typeAhead : true,
											queryMode : 'local',
											mode : 'local',
											triggerAction : 'all',
											selectOnFocus : true,
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
									}, {
										id : 'bindingRefinementLanguage',
										header : 'Language',
										width : 70,
										dataIndex : 'bindingRefinementLanguage',
										editor : new Ext.form.ComboBox({
											typeAhead : true,
											anyMatch : true,
											id : 'languageCombo',
											valueField : 'value',
											displayField : 'name',
											labelStyle : 'display:none',
											submitValue : true,
											typeAhead : true,
											queryMode : 'local',
											mode : 'local',
											triggerAction : 'all',
											selectOnFocus : true,
											hideTrigger : false,
											forceSelection : false,
											selectOnFocus : true,
											autoSelect : false,
											editable : true,
											store : new Ext.data.SimpleStore({
												fields : [
														'name', 'value'
												],
												data : [["Java","java"],["MVEL","mvel"]]
											})
										})
									}, {
										id : 'bindingRefinement',
										header : 'Refinement',
										width : 200,
										dataIndex : 'bindingRefinement',
										editor : new Ext.form.TextField({
											allowBlank : true
										}),
										renderer : Ext.util.Format.htmlEncode
									}, itemDeleter
							]),
							selModel : itemDeleter,
							autoHeight : true,
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
											var parameters ={parameters:[]};
											vardefs.data.each(function() {
												if (this.data['name'].length > 0) {
													parameters.parameters.push({
														name:this.data['name'],
														binding:this.data['binding'],
														bindingRefinementLanguage:this.data['bindingRefinementLanguage'],
														bindingRefinement:this.data['bindingRefinement'],
													});
												}
											});
											var outValue=Object.toJSON(parameters);
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
	             profile: this.profile,
	             uuid : ORYX.UUID,
	             pid: this.processId,
	             action: this.servletAction
	         }
	     });
	}
});


ORYX.Plugins.CMMN.CaseRoleRefEditorFactory = Clazz.extend({
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
		var options=[];
		try{
			var caseShape=this.facade.getSelection().first();
			while(caseShape.getStencil().idWithoutNs() != "CMMNDiagram"){
				caseShape=caseShape.getParentShape();
			}
			if(caseShape.properties["oryx-caseroles"]){
				var roleNames=caseShape.properties["oryx-caseroles"].split(",");
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
	            editable: false,
	            tpl: '<tpl for="."><div class="x-combo-list-item">{[(values.icon) ? "<img src=\'" + values.icon + "\' />" : ""]} {title}</div></tpl>',
	            store: store,
	            displayField:'title',
	            valueField: 'value',
	            typeAhead: true,
	            mode: 'local',
	            triggerAction: 'all',
	            selectOnFocus:true
	        });

	        return new Ext.Editor(editorCombo);
		}catch(e){
			console.log(e);
		}
    }
});


