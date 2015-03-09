 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

/**
 * The CMMN plugin provides layout methods referring to the CMMN stencilset.
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
		this.facade = facade;
		this.facade.registerOnEvent('layout.cmmn.case_file_item', this.handleLayoutCaseFileItem.bind(this));
        ORYX.FieldEditors["calledprocess"] = new ORYX.Plugins.CMMN.CalledProcessEditorFactory();
        ORYX.FieldEditors["calledcase"] = new ORYX.Plugins.CMMN.CalledProcessEditorFactory();
        ORYX.FieldEditors["caseroleref"] = new ORYX.Plugins.CMMN.CaseRoleRefEditorFactory();
        ORYX.FieldEditors["taskparameters"] = new ORYX.Plugins.CMMN.TaskParametersEditorFactory();
        ORYX.FieldEditors["taskinparameterandmappings"] = new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory();
        ORYX.FieldEditors["taskoutparameterandmappings"] = new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory();
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.updateDecorationsOnLoad.bind(this));
	},
	handlePropertyChanged : function(event) {
		//TODO : clean this yp
		if (event["key"] == "oryx-casefileitemstructureref"){
			var name=event.elements[0].properties["oryx-casefileitemstructureref"];
			name=name.slice(name.indexOf("::")+2,name.indexOf("|"));
			event.elements[0].setProperty("oryx-name", name,true);
			event.elements[0].refresh();
		}else if (event["key"] == "oryx-autocomplete" || event["key"] == "oryx-manualactivationrulebody" || event["key"] == "oryx-repetitionrulebody"
			|| event["key"] == "oryx-requiredrulebody" || event["key"] == "oryx-propertytype" || event["key"] == "oryx-name" || event["key"] == "oryx-standardevent") {
			this.updateDecorations(event.elements[0]);
		}
	},
	updateDecorationsOnLoad : function(event) {
		this.facade.getCanvas().getChildNodes(true, function(shape){
			if(shape.getStencil()){
				var stencilId=shape.getStencil().id();
				if(stencilId.indexOf("Task")>=0 || stencilId.indexOf("Stage")>=0 || stencilId.indexOf("Milestone") >=0 || stencilId.indexOf("Property") >=0){
					this.updateDecorations (shape);
				}
			}

		}.bind(this));
		try{
			for(var i=0; i < this.facade.getCanvas().edges.length; i ++){
				var edge=this.facade.getCanvas().edges[i];
				if(edge.getStencil()){
					var stencilId=edge.getStencil().id();
					if(stencilId.indexOf("OnPart") >=0 || stencilId.indexOf("StartTrigger") >=0){
						this.updateDecorations (edge);
					}
				}
			}
		}catch(e){
			alert(e);
		}
	},
	updateDecorations : function(shape){
        if(shape._svgShapes){
			shape._svgShapes.each(function(node){
				if(node.element.id==shape.id+"autoCompleteRect"){
					node.element.setAttributeNS(null, 'display', Boolean(shape.properties["oryx-autocomplete"]) ? 'inherit' : 'none');
				} else  if(node.element.id==shape.id+"manualActivationPath"){
					var body=shape.properties["oryx-manualactivationrulebody"];
					node.element.setAttributeNS(null, 'display',  body && body.length > 0? 'inherit' : 'none');
				}
			});
        }
		var labels=shape.getLabels();
		for(var i=0 ; i < labels.length; i++){
		    if(labels[i].id==shape.id+"repetitionText"){
				var body=shape.properties["oryx-repetitionrulebody"];
				labels[i].node.setAttributeNS(null, 'display',  body && body.length > 0? 'inherit' : 'none');
			}else if(labels[i].id==shape.id+"requiredText"){
				var body=shape.properties["oryx-requiredrulebody"];
				labels[i].node.setAttributeNS(null, 'display',  body && body.length > 0? 'inherit' : 'none');
			}else if(labels[i].id==shape.id+"text_type"){
				var type=shape.properties["oryx-propertytype"];
				labels[i].text(shape.properties["oryx-name"] + " : " + type.substring(type.lastIndexOf("/")+1));
				labels[i].update();
			}else if(labels[i].id==shape.id+"text_event"){
				var type=shape.properties["oryx-standardevent"];
				labels[i].text(shape.properties["oryx-standardevent"]);
				labels[i].update();
			}
		}
	},

	/**
	 */
	handleLayoutCaseFileItem : function(event) {
		var shape = event.shape;
		var currentOffset=30;
		shape.getChildShapes(false).forEach(function(item){
			item.bounds.set(
					5,
					currentOffset,
					shape.bounds.b.x - shape.bounds.a.x - 10,
					currentOffset + 20
			);
			currentOffset+=20;
		});
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
        return new Ext.Editor(cf);}catch(e){alert(e);}
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
		}catch(e){alert(e);}

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
            	cf.profile='cmmn1.0';
        		cf.processId=this.shapeSelection.shapes.first().properties['oryx-calledcase'];
        	}
        	cf.on('dialogClosed', this.dialogClosed, {scope:this, row:index, col:1,field:cf});
        	return new Ext.Editor(cf);
        }catch(e){
        	alert(e);
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
			while(!caseShape.getStencil().id().endsWith("#CaseDiagram")){
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
			alert(e);
		}
    }
});
ORYX.Plugins.CMMN.CalledProcessEditorFactory = Clazz.extend({
    construct: function(){

    },
    /**
     * This function gets executed by propertyWindow in its own context,
     * so this = propertyWindow
     */
    init: function(){
        //arguments: key, pair, icons, index
    	try{
        var key = arguments[0];
        var pair = arguments[1];
        var index = arguments[3];

        var factType = pair._jsonProp.lookupType;

        var cf = new ORYX.Plugins.CMMN.ComplexCalledProcessField({
                allowBlank: pair.optional(),
                dataSource: this.dataSource,
                grid: this.grid,
                row: index,
                facade: this.facade,
                shapes: this.shapeSelection.shapes
        });
        cf.profile=pair.id()=='calledcase'?'cmmn1.0':'jbpm';
        cf.on('dialogClosed', this.dialogClosed, {scope:this, row:index, col:1,field:cf});

        return new Ext.Editor(cf);}catch(e){alert(e);}
    }
});
ORYX.Plugins.CMMN.ComplexCalledProcessField = Ext.extend(Ext.form.TriggerField,  {
    editable: true,
    readOnly: false,
	onTriggerClick : function(){
        if(this.disabled){
            return;
        }

        var CallElementDef = Ext.data.Record.create([{
            name: 'name'
        }, {
        	name: 'pkgname'
        }, {
            name: 'imgsrc'
        }]);

    	var calldefsProxy = new Ext.data.MemoryProxy({
            root: []
        });

    	var calldefs = new Ext.data.Store({
    		autoDestroy: true,
            reader: new Ext.data.JsonReader({
                root: "root"
            }, CallElementDef),
            proxy: calldefsProxy,
            sorters: [{
                property: 'name',
                direction:'ASC'
            }]
        });
    	calldefs.load();

        var processJSON = ORYX.EDITOR.getSerializedJSON();
        var processPackage = jsonPath(processJSON.evalJSON(), "$.properties.package");
        var processId = jsonPath(processJSON.evalJSON(), "$.properties.id");

        this.facade.raiseEvent({
            type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
            ntype		: 'info',
            msg         : ORYX.I18N.PropertyWindow.loadingProcessInf,
            title       : ''

        });
        Ext.Ajax.request({
            url: ORYX.PATH + 'calledelement',
            method: 'POST',
            success: function(response) {
    	   		try {
    	   			if(response.responseText.length > 0 && response.responseText != "false") {
    	   				var responseJson = Ext.decode(response.responseText);
    		            for(var key in responseJson){
    		            	var keyParts = key.split("|");
    		            	calldefs.add(new CallElementDef({
                                name: keyParts[0],
                                pkgname: keyParts[1],
                                imgsrc: responseJson[key]
                            }));
    		            }
    		            calldefs.commitChanges();

    		            var gridId = Ext.id();
    		        	var grid = new Ext.grid.EditorGridPanel({
                            autoScroll: true,
                            autoHeight: true,
    		                store: calldefs,
    		                id: gridId,
    		                stripeRows: true,
    		                cm: new Ext.grid.ColumnModel([new Ext.grid.RowNumberer(), {
    		                	id: 'pid',
    		                    header: ORYX.I18N.PropertyWindow.processId,
    		                    width: 200,
    		                    dataIndex: 'name',
    		                    editor: new Ext.form.TextField({ allowBlank: true, disabled: true })
    		                }, {
    		                	id: 'pkgn',
    		                    header: ORYX.I18N.PropertyWindow.packageName,
    		                    width: 200,
    		                    dataIndex: 'pkgname',
    		                    editor: new Ext.form.TextField({ allowBlank: true, disabled: true })
    		                },{
    		                	id: 'pim',
    		                    header: ORYX.I18N.LocalHistory.headertxt.ProcessImage,
    		                    width: 250,
    		                    dataIndex: 'imgsrc',
    		                    renderer: function(val) {
    		                    	if(val && val.length > 0) {
    		                    		return '<center><img src="'+ORYX.PATH+'images/page_white_picture.png" onclick="new ImageViewer({title: \'Process Image\', width: \'650\', height: \'450\', autoScroll: true, fixedcenter: true, src: \''+val+'\',hideAction: \'close\'}).show();" alt="Click to view Process Image"/></center>';
    		                    	} else {
    		                    		return ORYX.I18N.LocalHistory.headertxt.ProcessImage.NoAvailable;
    		                    	}
    		                    }
    		                }]),
    		                autoHeight: true
    		            });

    		        	grid.on('afterrender', function(e) {
    		        		if(this.value.length > 0) {
	    		        		var index = 0;
	    		        		var val = this.value;
	    		        		var mygrid = grid;
	    		        		calldefs.data.each(function() {
	    	                		if(this.data['name'] == val) {
	    	                			mygrid.getSelectionModel().select(index, 1);
	    	                		}
	    	                		index++;
	    	                    });
	    		        	}
    		        		}.bind(this));

    		        	var calledElementsPanel = new Ext.Panel({
    		        		id: 'calledElementsPanel',
    		        		title: '<center>'+ORYX.I18N.PropertyWindow.selectProcessId+'</center>',
    		        		layout:'column',
    		        		items:[
    		        		       grid
    		                      ],
    		        		layoutConfig: {
    		        			columns: 1
    		        		},
    		        		defaults: {
    		        	        columnWidth: 1.0
    		        	    }
    		        	});

    		        	var dialog = new Ext.Window({
    		    			layout		: 'anchor',
    		    			autoCreate	: true,
    		    			title		: ORYX.I18N.PropertyWindow.editorForCalledEvents,
    		    			height		: 350,
    		    			width		: 680,
    		    			modal		: true,
    		    			collapsible	: false,
    		    			fixedcenter	: true,
    		    			shadow		: true,
    		    			resizable   : true,
    		    			proxyDrag	: true,
    		    			autoScroll  : true,
    		    			keys:[{
    		    				key	: 27,
    		    				fn	: function(){
    		    						dialog.hide()
    		    				}.bind(this)
    		    			}],
    		    			items		:[calledElementsPanel],
    		    			listeners	:{
    		    				hide: function(){
    		    					this.fireEvent('dialogClosed', this.value);
    		    					dialog.destroy();
    		    				}.bind(this)
    		    			},
    		    			buttons		: [{
    		                    text: ORYX.I18N.Save.save,
    		                    handler: function(){
    		                    	if(grid.getSelectionModel().getSelectedCell() != null) {
    		                    		var selectedIndex = grid.getSelectionModel().getSelectedCell()[0];
    		                    		var outValue = calldefs.getAt(selectedIndex).data['name'] + '|' + calldefs.getAt(selectedIndex).data['pkgname'];
    		                    		grid.stopEditing();
    		                        	grid.getView().refresh();
    		        					this.setValue(outValue);
    		        					this.dataSource.getAt(this.row).set('value', outValue)
    		        					this.dataSource.commitChanges()
    		        					dialog.hide()
    		                    	} else {
                                        this.facade.raiseEvent({
                                            type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                                            ntype		: 'error',
                                            msg         : ORYX.I18N.LocalHistory.LocalHistoryView.msg,
                                            title       : ''

                                        });
    		                    	}
    		                    }.bind(this)
    		                }, {
    		                    text: ORYX.I18N.PropertyWindow.cancel,
    		                    handler: function(){
    		    					this.setValue(this.value);
    		                    	dialog.hide()
    		                    }.bind(this)
    		                }]
    		    		});

    		    		dialog.show();
    		    		grid.render();
    		    		grid.fireEvent('afterrender');
    		    		this.grid.stopEditing();
    		    		grid.focus( false, 100 );
    		        } else {
                           this.facade.raiseEvent({
                               type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                               ntype		: 'error',
                               msg         : ORYX.I18N.PropertyWindow.unableToFindOtherProcess,
                               title       : ''

                           });
    		        }
    	   		} catch(e) {
                       this.facade.raiseEvent({
                           type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                           ntype		: 'error',
                           msg         : ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo+' :\n' + e,
                           title       : ''

                       });
    	   		}
            }.bind(this),
            failure: function(e){
            	alert('Error');
            	for(var key in e){
//            		alert(key + "=" + e[key]);
            	}
                this.facade.raiseEvent({
                    type 		: ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
                    ntype		: 'error',
                    msg         : ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo+'.',
                    title       : ''

                });
            },
            params: {
            	profile: this.profile,
            	uuid : ORYX.UUID,
            	ppackage: processPackage,
            	pid: processId,
            	action:"getCallableCMMNElement"
            }
        });
	}
});


