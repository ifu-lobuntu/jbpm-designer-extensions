if (!ORYX.Plugins)
	ORYX.Plugins = new Object();
if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
	ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/bpmn2.0#"]={
                                        "Tasks": 1,
                                        "Start Events": 3,
                                        "Catching Intermediate Events": 5,
                                        "Throwing Intermediate Events": 6,
                                        "End Events": 4,
                                        "Gateways": 7,
                                        "Subprocesses": 2,
                                        "Service Tasks": 8,
                                        "Connecting Objects": 9,
                                        "Data Objects": 10,
                                        "Swimlanes": 11,
                                        "Artifacts": 12,
                                        "Workflow Patterns": 13
};
ORYX.CONFIG.STENCIL_GROUP_ORDER=function(){
	return ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ;
};
ORYX.Plugins.AbstractExtensionsPlugin = ORYX.Plugins.AbstractPlugin.extend(
/** @lends ORYX.Plugins.Extensions.prototype */
{
    decoratorUpdaters:{},

    /**
     * Creates a new instance of the Collapsible plugin and registers it on the
     * layout events listed in the Collapsible stencil set.
     *
     * @constructor
     * @param {Object}
     *            facade The facade of the editor
     */
    construct : function(facade) {
        this.facade = facade;
        this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
        this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED, this.updateDecorationsOnLoad.bind(this));
        this.facade.registerOnEvent(ORYX.CONFIG.EVENT_SHAPEADDED,this.handleShapeAdded.bind(this));
    },
    handlePropertyChanged: function (event){
        try{
            var element = event.elements[0];
            if(typeof element ==="undefined"){
                element=event.elements;
            }
            var d=this.decoratorUpdaters[element.getStencil().idWithoutNs()];
            if(d){
                d(element);
            }
            if(element instanceof ORYX.Core.Shape){
                var shape=element;
                var refProp=shape.getStencil()._jsonStencil.referenceProperty;
                console.log(refProp);
                if(refProp && event.key == "oryx-" + refProp.toLowerCase()){
                    var name=shape.properties["oryx-"+ refProp.toLowerCase()];
                    if(name.indexOf(":")>0){
                        name=name.slice(name.lastIndexOf("::")+2,name.indexOf("|"));
                    }else{
                        name=name.slice(0,name.indexOf("|"));
                    }
                    shape.setProperty("oryx-name", name,true);
                    shape.refresh();
                }
            }
        }catch(e){
            alert(e.toString());
        }
    },
    handleShapeAdded: function (event){
        try{
            if(event.shape instanceof ORYX.Core.Shape) {
                var d = this.decoratorUpdaters[event.shape.getStencil().idWithoutNs()];
                if (d) {
                    d(event.shape);
                }
            }
        }catch(e){
            alert(e.toString());
        }
    },
    updateDecorationsOnLoad: function (event){
        this.facade.getCanvas().getChildEdges(true, function(shape){
            try{
                var d=this.decoratorUpdaters[shape.getStencil().idWithoutNs()];
                if(d){
                    d(shape);
                }
            }catch(e){
                alert(e.toString());
            }
        }.bind(this));
        this.facade.getCanvas().getChildNodes(true, function(shape){
            var d=this.decoratorUpdaters[shape.getStencil().idWithoutNs()];
            if(d){
                d(shape);
            }
        }.bind(this));
    }
});

/**
 * The Collapsible plugin provides layout methods referring to the Collapsible
 * stencilset.
 *
 * @class ORYX.Plugins.Extensions
 * @extends Clazz
 * @param {Object}
 *            facade The facade of the editor
 */
ORYX.Plugins.Extensions = ORYX.Plugins.AbstractPlugin.extend(
/** @lends ORYX.Plugins.Extensions.prototype */
{
	/**
	 * Creates a new instance of the Collapsible plugin and registers it on the
	 * layout events listed in the Collapsible stencil set.
	 *
	 * @constructor
	 * @param {Object}
	 *            facade The facade of the editor
	 */
	construct : function(facade) {
		this.facade = facade;
        arguments.callee.$.construct.apply(this, arguments);
		ORYX.Core.Edge = ORYX.Plugins.Extensions.CurvedEdge;
		ORYX.FieldEditors["eobjectref"] = new ORYX.Plugins.Extensions.EObjectRefEditorFactory();
		this.facade.registerOnEvent('layout.collapsible', this.handleLayoutCollapsible.bind(this));
		this.facade.registerOnEvent('layout.list', this.handleLayoutList.bind(this));
		this.facade.registerOnEvent('layout.compartments', this.handleLayoutCompartments.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEDOWN, this.handleExpandOnClick.bind(this));
        this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEOUT, this.handleMouseOut.bind(this));
        this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEOVER, this.handleMouseOver.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_DBLCLICK,this.handleExpandOnDoubleClick.bind(this));
		console.log("Extensions initialized");
		ORYX.I18N.forms.editForm = "Edit Form";
		ORYX.I18N.forms.editFormDesc = "Edit Form";
		ORYX.I18N.forms.generateFormDesc = "Generate Form";
		ORYX.I18N.forms.generateForm = "Generate Form";
		ORYX.I18N.extensions = {};
		ORYX.I18N.extensions.eobjectName = "Element";
		ORYX.I18N.extensions.eobjectAsset = "Asset";
		ORYX.I18N.extensions.eobjectImage = "Image";
	},
	getExpansionTrigger : function(target,uiObject){
        var expansionTrigger = target.getAttributeNS(ORYX.CONFIG.NAMESPACE_ORYX, 'expansion-trigger');
        if(expansionTrigger){
            if (ORYX.Plugins.Extensions.isExpanded(uiObject)) {
                //Collapse is always simple click
                return "click";
            }else{
                return expansionTrigger;
            }
        }else if(target && target.id && target.id.indexOf("expand_") >= 0){
            //Default, legacy way of doing it - deprecated
            return "click";
        }else{
            return null;
        }
	},
    handleExpandOnClick : function(event, uiObject) {
        if (this.getExpansionTrigger(event.target,uiObject)=="click") {
            this.handleExpand(event,uiObject);
        }
    },
    handleExpandOnDoubleClick : function(event, uiObject) {
        if (this.getExpansionTrigger(event.target,uiObject)=="doubleClick") {
            this.handleExpand(event,uiObject);
        }
    },
    handleMouseOver : function (event,uiObject){
        this.handleMouse(uiObject,true);
    },
    handleMouseOut : function (event,uiObject){
        this.handleMouse(uiObject,false);
    },
    handleMouse: function (uiObject,mouseOver){
        if(ORYX.Plugins.Extensions.isCollapsible(uiObject)){
            var expanded=ORYX.Plugins.Extensions.isExpanded(uiObject);
            uiObject._svgShapes.forEach(function(svgShape){
                    svgShape.element.setAttributeNS(null, "display",this.calculateExpansionDisplay(svgShape.element,expanded,mouseOver));
            }.bind(this));
        }
    },
	handleExpand : function(event, uiObject) {
		var newWidth = parseFloat(uiObject.properties["oryx-previouswidth"]);
		if (isNaN(newWidth) || newWidth==0) {
			newWidth = 200;
		}
		var newHeight = parseFloat(uiObject.properties["oryx-previousheight"]);
		if (isNaN(newHeight)|| newHeight==0) {
			newHeight = 30;
		}
		uiObject.properties["oryx-previouswidth"] = uiObject.bounds.width();
		uiObject.properties["oryx-previousheight"] = uiObject.bounds.height();
		var topLeft = {
				x:uiObject.bounds.a.x,
				y:uiObject.bounds.a.y,
		}
		var bottomRight = uiObject.bounds.b;
		if (ORYX.Plugins.Extensions.isExpanded(uiObject)) {
			uiObject.properties["oryx-isexpanded"] = false;
            uiObject.getIncomingNodes().forEach(function (boundariedShape){
                //I'm a boundary shape
                if(uiObject.bounds.a.x<boundariedShape.bounds.a.x){
                    topLeft.x=bottomRight.x-newWidth;
                    //Expand to the left
                }
                if(uiObject.bounds.a.y<boundariedShape.bounds.a.y){
                    topLeft.y=bottomRight.y-newHeight;
                    //Expand to the top
                }
                //Now check if we're still on the boundary - 2 corners inside, 2 outside
                var corners=[topLeft,{x:topLeft.x,y:topLeft.y+newHeight},{x:topLeft.x+newWidth,y:topLeft.y+newHeight},{x:topLeft.x+newWidth,y:topLeft.y}];
                var inside=0;
                var outside=0;
                corners.forEach(function(point){
                    if(boundariedShape.bounds.isIncluded(point)){
                        inside++;
                    }else{
                        outside++;
                    }
                })
                if(inside==2 && outside == 2){
                    //Still on boundary
                    return false;
                }else{
                    //assuming its docker is in the center
                    var center=uiObject.bounds.center();
                    if(boundariedShape.bounds.isIncluded(center,7)){
                        topLeft.x=center.x - (newWidth/2);
                        topLeft.y=center.y - (newHeight/2);
                    }
                }
            });
		} else {
            uiObject.getIncomingNodes().forEach(function (boundariedShape){
                //I'm a boundary shape
                if(uiObject.bounds.a.x<boundariedShape.bounds.a.x){
                    topLeft.x=bottomRight.x-newWidth;
                    //Expand to the left
                }
                if(uiObject.bounds.a.y<boundariedShape.bounds.a.y){
                    topLeft.y=bottomRight.y-newHeight;
                    //Expand to the top
                }
                return false;
            });
			uiObject.properties["oryx-isexpanded"] = true;
		}
        uiObject.bounds.set(topLeft, {
            x : topLeft.x + newWidth,
            y : topLeft.y + newHeight
        });
		// TODO too many updates. Find the right one
		uiObject._update();
		uiObject._changed();
		if (uiObject.getStencil()._jsonStencil.isCompartment && uiObject.parent instanceof ORYX.Core.Shape) {
			uiObject.parent._update();
			uiObject.parent._changed();
		}
		this.facade.getCanvas().update();
		this.facade.updateSelection();
		this.facade.raiseEvent({
			type : ORYX.CONFIG.EVENT_RESIZE_END,
			shapes : [
				uiObject
			]
		});
	},
    calculateExpansionDisplay : function(svgElement,expanded,mouseOver){
        var expansionDisplay = svgElement.getAttributeNS(ORYX.CONFIG.NAMESPACE_ORYX, 'expansion-display');
        if(expansionDisplay){
            var display=expansionDisplay.split(" ");
            if(expanded){
                if(display.indexOf("expanded")>=0){
                    return "inherit";
                }else if(mouseOver && display.indexOf("expandedMouseOver")>=0){
                    return "inherit";
                }
            }else{
                if(display.indexOf("collapsed")>=0){
                    return "inherit";
                }else if(mouseOver && display.indexOf("collapsedMouseOver")>=0){
                    return "inherit";
                }
            }
            return "none";
        }else if(svgElement.id.indexOf("expand_vertical") >= 0){
            //Legacy way, deprecated
            return expanded?"none":"inherit";
        }else {
            return svgElement.getAttributeNS(null,"display");
        }
    },
	updateExpanded : function(collapsibleShape) {
		if (ORYX.Plugins.Extensions.isExpanded(collapsibleShape)) {
            collapsibleShape._svgShapes.each(function(shape){
                shape.element.setAttributeNS(null, "display",this.calculateExpansionDisplay(shape.element,true,false));
            }.bind(this));
			collapsibleShape.children.each(function(uiObject) {
				if (uiObject instanceof ORYX.Core.Shape) {
					ORYX.Plugins.Extensions.showShape(uiObject);
				}
			}.bind(this));
		} else {
	        collapsibleShape._svgShapes.each(function(shape){
	            shape.element.setAttributeNS(null, "display",this.calculateExpansionDisplay(shape.element,false,false));
	        }.bind(this));
			collapsibleShape.children.each(function(uiObject) {
				if (uiObject instanceof ORYX.Core.Shape) {
					ORYX.Plugins.Extensions.hideShape(uiObject);
				}
			}.bind(this));
		}
	},
	handleLayoutCollapsible : function(event) {
		this.updateExpanded(event.shape);
	},
	handleLayoutList : function(event) {
		var shape = event.shape;
		if(ORYX.Plugins.Extensions.isCollapsible(shape) && ORYX.Plugins.Extensions.isExpanded(shape)==false){
		    return;
		}else{
    	    var currentOffset = 15;
    		if (event.options && "paddingTop" in event.options) {
    			currentOffset = event.options.paddingTop;
    		}
    		shape.getPersistentChildShapes().forEach(function(item) {
    			item.bounds.set(1, currentOffset, shape.bounds.b.x - shape.bounds.a.x - 2, currentOffset + 20);
    			currentOffset += 21;
    		});
            if (event.options && "paddingBottom" in event.options) {
                currentOffset += event.options.paddingBottom;
            }else{
                currentOffset += 10;
            }
            if (event.options && "minimumHeight" in event.options) {
                currentOffset = currentOffset=Math.max(currentOffset,event.options.minimumHeight);
            }else{
                currentOffset=Math.max(currentOffset,14);
            }
            if(shape.minimumSize){
                currentOffset=Math.max(currentOffset,shape.minimumSize.height);
                console.log(currentOffset);
            }
    		shape.bounds.set(shape.bounds.a.x,shape.bounds.a.y,shape.bounds.b.x, shape.bounds.a.y+currentOffset);
    		shape.update();
		}
	},
	handleLayoutCompartments : function(event) {
		var height = 30;
		var bounds = event.shape.bounds;
		event.shape.getChildShapes(false, function(child) {
			var topLeft = {
				x : 1,
				y : height
			};
			height = height + Math.max(child.bounds.height(), 20);
			var bottomRight = {
				x : bounds.width() - 1,
				y : height
			};
			child.bounds.set(topLeft, bottomRight);
			if (ORYX.Plugins.Extensions.isCollapsible(child)) {
				this.updateExpanded(child);
			}
		}.bind(this));
		if (height != 0) {
			height += 15;
			event.shape.bounds.set(bounds.a.x, bounds.a.y, bounds.b.x, bounds.a.y + height);
			console.log(event.shape);
		}
		event.shape._changed();
		event.shape._update();
		event.shape.update();
		event.shape.refresh();
	}
});
ORYX.Plugins.Extensions.isExpanded = function(shape) {
	return shape.properties["oryx-isexpanded"] == true || shape.properties["oryx-isexpanded"] == "true";
};
ORYX.Plugins.Extensions.isCollapsible = function(shape) {
    if("properties" in shape){
        return typeof (shape.properties["oryx-isexpanded"]) == "string" || typeof (shape.properties["oryx-isexpanded"]) == "boolean";
    }else{
        console.log(shape);
        return false;
    }

};
ORYX.Plugins.Extensions.extractName = function(reference) {
    if(reference){
        var split=reference.slice(0, reference.indexOf("|")).split(/[\:\.]{1,2}/);
        return split[split.length-1];
    }else{
        return "";
    }
};
ORYX.Plugins.Extensions.updateNameAndLabel = function(shape,refProperty,labelId) {
    if(shape.properties["oryx-"+refProperty]){
        var name=ORYX.Plugins.Extensions.extractName(shape.properties["oryx-"+refProperty]);
        shape.properties["oryx-name"]=name;
        shape.getLabels().forEach(function(label){
           if(label.id=shape.id+labelId){
               label.text(name);
               label.update();
           }
        });
    }
};
ORYX.Plugins.Extensions.showShape = function(uiObject) {
	uiObject.node.setAttributeNS(null, 'display', 'inherit');
	uiObject.isVisible = true;
	uiObject.behindCollapsedParent = false;
	if (uiObject.incoming && uiObject.outgoing) {
		uiObject.incoming.each(function(edge) {
			if (edge instanceof ORYX.Core.Edge) {
				ORYX.Plugins.Extensions.showShape(edge);
			}
		});
		uiObject.outgoing.each(function(edge) {
			if (edge instanceof ORYX.Core.Edge) {
				ORYX.Plugins.Extensions.showShape(edge);
			}
		});
	}
};
ORYX.Plugins.Extensions.hideShape = function(uiObject) {
	uiObject.node.setAttributeNS(null, 'display', 'none');
	uiObject.isVisible = false;
	uiObject.behindCollapsedParent = true;
	if (uiObject.incoming && uiObject.outgoing) {
		uiObject.incoming.each(function(edge) {
			if (edge instanceof ORYX.Core.Edge) {
				this.hideShape(edge);
			}
		}.bind(this));
		uiObject.outgoing.each(function(edge) {
			if (edge instanceof ORYX.Core.Edge) {
				this.hideShape(edge);
			}
		}.bind(this));
	}

};

ORYX.Plugins.Extensions.EObjectRefEditorFactory = Clazz.extend({
	construct : function() {

	},
	/**
	 * This function gets executed by propertyWindow in its own context, so this =
	 * propertyWindow
	 */
	init : function() {
		// arguments: key, pair, icons, index
		try {
			var key = arguments[0];
			var pair = arguments[1];
			var index = arguments[3];

			var factType = pair._jsonProp.lookupType;

			var cf = new ORYX.Plugins.Extensions.EObjectRefField({
				allowBlank : pair.optional(),
				dataSource : this.dataSource,
				grid : this.grid,
				row : index,
				facade : this.facade,
				shapes : this.shapeSelection.shapes
			});
			var jsonProp = pair._jsonProp;
			cf.targetProfile = jsonProp.reference.targetProfile;
			cf.filter = jsonProp.reference.filter;
			cf.matchFirstReference=jsonProp.reference.matchFirstReference;
			cf.filterParamaters= jsonProp.reference.filterParamaters;
			cf.elementTypes = jsonProp.reference.allowedElementTypes;
			cf.nameFeature = jsonProp.reference.nameFeature;
			if(this.facade.getSelection().first()){
				cf.sourceElementId = this.facade.getSelection().first().resourceId;
			}
			cf.singleSelect = !jsonProp.reference.multiSelect;
			cf.on('dialogClosed', this.dialogClosed, {
				scope : this,
				row : index,
				col : 1,
				field : cf
			});

			return new Ext.Editor(cf);
		} catch (e) {
			alert(e);
		}
	}
});
ORYX.Plugins.Extensions.EObjectRefField = Ext.extend(
				Ext.form.TriggerField,
				{
					editable : true,
					readOnly : false,
					onTriggerClick : function() {
						if (this.disabled) {
							return;
						}

						var CallElementDef = Ext.data.Record.create([
								{
									name : 'name'
								},
                                {
                                    name : 'type'
                                },
                                {
                                    name : 'fileName'
                                },

                                {
                                    name : 'filePath'
                                },
								{
									name : 'imgsrc'
								}
						]);

						var calldefsProxy = new Ext.data.MemoryProxy({
							root : []
						});

						var potentialReferenceStore = new Ext.data.Store({
							autoDestroy : true,
							reader : new Ext.data.JsonReader({
								root : "root"
							}, CallElementDef),
							proxy : calldefsProxy,
							sorters : [
								{
									property : 'name',
									direction : 'ASC'
								}
							]
						});
						potentialReferenceStore.load();

						var processJSON = ORYX.EDITOR.getSerializedJSON();
						var processPackage = jsonPath(processJSON.evalJSON(), "$.properties.package");
						var processId = jsonPath(processJSON.evalJSON(), "$.properties.id");

						this.facade.raiseEvent({
							type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
							ntype : 'info',
							msg : ORYX.I18N.PropertyWindow.loadingProcessInf,
							title : ''

						});
						var theParams={ profile : ORYX.PROFILE,
										targetProfile : this.targetProfile,
										elementTypes : this.elementTypes,
										nameFeature : this.nameFeature,
										matchFirstReference : this.matchFirstReference,
										sourceElementId : this.sourceElementId,
										uuid : ORYX.UUID,
										assetid : ORYX.UUID,
										json : ORYX.EDITOR.getSerializedJSON(),
										ppackage : processPackage,
										pid : processId,
										filter : this.filter,
										action : "getEmfElements"
						}
						for(key in this.filterParamaters){
							theParams[key]=this.filterParamaters[key];
						}
						Ext.Ajax.request({
									url : ORYX.PATH + 'calledelement',
									method : 'POST',
									success : function(response) {
										try {
											if (response.responseText.length > 0 && response.responseText != "false") {
												var responseJson = Ext.decode(response.responseText);
												for ( var key in responseJson) {
													var keyParts = key.split(/\|/);
													var filePath = keyParts[1].split(/\//);
													potentialReferenceStore.add(new CallElementDef({
														name : keyParts[0],
                                                        filePath : keyParts[1],
                                                        fileName : filePath[filePath.length-1],
														type : keyParts[2]
													}));
												}
												potentialReferenceStore.commitChanges();
                                                var theColumnModel= new Ext.grid.ColumnModel(
                                                    [
                                                        new Ext.grid.RowNumberer(),
                                                        {
                                                            id : 'pid',
                                                            header : ORYX.I18N.extensions.eobjectName,
                                                            width : 200,
                                                            dataIndex : 'name',
                                                            sortable : true,
                                                            editor : new Ext.form.TextField({
                                                                allowBlank : true,
                                                                disabled : true
                                                            })
                                                        },
                                                        {
                                                            id : 'fileName',
                                                            header : ORYX.I18N.extensions.eobjectAsset,
                                                            width : 200,
                                                            sortable : true,
                                                            dataIndex : 'fileName',
                                                            editor : new Ext.form.TextField({
                                                                allowBlank : true,
                                                                disabled : true
                                                            })
                                                        },
                                                        {
                                                            id : 'type',
                                                            header : "Type",
                                                            width : 200,
                                                            sortable : true,
                                                            dataIndex : 'type',
                                                            editor : new Ext.form.TextField({
                                                                allowBlank : true,
                                                                disabled : true
                                                            })
                                                        }
                                                    ]);
                                                var gridId = Ext.id();
                                                var grid = new Ext.grid.EditorGridPanel(
                                                    {
                                                        autoScroll : true,
                                                        autoHeight : true,
                                                        selModel:new Ext.grid.RowSelectionModel(),
                                                        store : potentialReferenceStore,
                                                        id : gridId,
                                                        stripeRows : true,
                                                        cm:theColumnModel,
                                                        allowDragDrop:true,
                                                        autoHeight : true,
                                                        title: 'Potential Items'
                                                    });
                                                var selectedStore = new Ext.data.Store({
                                                    autoDestroy : true,
                                                    reader : new Ext.data.JsonReader({
                                                        root : "root"
                                                    }, CallElementDef),
                                                    proxy : calldefsProxy,
                                                    sorters : [
                                                        {
                                                            property : 'name',
                                                            direction : 'ASC'
                                                        }
                                                    ]
                                                });
                                                selectedStore.load();

                                                var selectedGrid = new Ext.grid.EditorGridPanel(
                                                    {
                                                        autoScroll : true,
                                                        autoHeight : true,
                                                        selModel:new Ext.grid.RowSelectionModel(),
                                                        store : selectedStore,
                                                        id : gridId+'1',
                                                        stripeRows : true,
                                                        allowDragDrop:true,
                                                        cm:theColumnModel,
                                                        autoHeight : true,
                                                        title: 'Selected Items'
                                                    });
                                                var addRemoveButtonPanel = new Ext.Panel({
                                                        layout:'column',
                                                        layoutConfig : {
                                                            columns : 1
                                                        },
                                                        defaults : {
                                                            columnWidth : 1.0
                                                        },
                                                        items : [
                                                            new ORYX.Plugins.Extensions.Button({
                                                                text:'Add',
                                                                handler:function(){
                                                                    grid.getSelections().each(function(record) {
                                                                        selectedStore.add(record);
                                                                        selectedStore.sort('name', 'ASC');
                                                                        potentialReferenceStore.remove(record);
                                                                    });
                                                                }
                                                            }),
                                                            new ORYX.Plugins.Extensions.Button({
                                                                text:'Remove',
                                                                handler:function(){
                                                                    selectedGrid.getSelections().each(function(record) {
                                                                        potentialReferenceStore.add(record);
                                                                        potentialReferenceStore.sort('name', 'ASC');
                                                                        selectedStore.remove(record);
                                                                    });
                                                                }
                                                            })
                                                        ]
                                                    }

                                                );
												grid.on('afterrender', function(e) {
                                                    console.log(this.value);
													if (this.value.length > 0) {
														var index = 0;
														var val = this.value.split(",");
														var mygrid = grid;
														potentialReferenceStore.data.each(function(record) {
															var refName=record.data['name'];
															val.each(function(valRow){
																if (valRow.indexOf(refName)>=0) {
                                                                    selectedStore.add(record);
                                                                    selectedStore.sort('name', 'ASC');
                                                                    potentialReferenceStore.remove(record);
                                                                }
															});
															index++;
														});
													}
												}.bind(this));
												grid.getSelectionModel().singleSelect=this.singleSelect;

												var calledElementsPanel = new Ext.Panel({
													id : 'calledElementsPanel',
													title : '<center>' + "Select items" + '</center>',
                                                    layout : 'column',
                                                    layoutConfig : {
                                                        columns : 1
                                                    },
													items : [
                                                        {
                                                            columnWidth:0.47,
                                                            items : [grid]
                                                        },
                                                        {
                                                            columnWidth:0.06,
                                                            items : [addRemoveButtonPanel]
                                                        },
                                                        {
                                                            columnWidth:0.47,
                                                            items : [selectedGrid]
                                                        }
													]
												});

												var dialog = new Ext.Window({
													layout : 'anchor',
													autoCreate : true,
													title : ORYX.I18N.PropertyWindow.editorForCalledEvents,
													height : 600,
													width : 1200,
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
														calledElementsPanel
													],
													listeners : {
														hide : function() {
															this.fireEvent('dialogClosed', this.value);
															dialog.destroy();
														}.bind(this)
													},
													buttons : [
															{
																text : ORYX.I18N.Save.save,
																handler : function() {
																    try{
                                                                        var outValue ="";
    																	selectedStore.data.each(function (row){
                                                                            outValue += row.data['name'] + '|'
                                                                                + row.data['filePath'];
                                                                            outValue+=",";
                                                                        });
                                                                        outValue= outValue.substr(0,outValue.length-1);
    																	grid.stopEditing();
    																	grid.getView().refresh();
    																	this.setValue(outValue);
    																	this.dataSource.getAt(this.row).set('value',outValue);
    																	this.dataSource.commitChanges();
    																	dialog.hide();
																    }catch(e){
																        alert(e.toString());
																    }
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
												grid.fireEvent('afterrender');
												this.grid.stopEditing();
												grid.focus(false, 100);
											} else {
												this.facade.raiseEvent({
													type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
													ntype : 'error',
													msg : ORYX.I18N.PropertyWindow.unableToFindOtherProcess,
													title : ''

												});
											}
										} catch (e) {
										    alert(e.toString());
											this.facade.raiseEvent({
												type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
												ntype : 'error',
												msg : ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo + ' :\n' + e,
												title : ''

											});
										}
									}.bind(this),
									failure : function(e) {

										alert('Error');
										for ( var key in e) {
											alert(key + "=" + e[key]);
										}
										this.facade.raiseEvent({
											type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
											ntype : 'error',
											msg : ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo + '.',
											title : ''

										});
									}.bind(this),
									params : theParams
								});
					}
				});

ORYX.Plugins.ExtensionsFormEditing = Clazz.extend({
	construct : function(facade) {
		// TODO find a better place to do this
		this.facade = facade;
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_TASKFORM_EDIT, this.openForm.bind(this));
		if (ORYX.READONLY != true) {
			// disable for ruleflow perspective preset
			if (ORYX.PRESET_PERSPECTIVE != "ruleflow") {
				this.facade.offer({
					'name' : ORYX.I18N.forms.editForm,
					'functionality' : this.openForm.bind(this),
					'group' : "editprocessforms",
					'icon' : ORYX.BASE_FILE_PATH + "images/processforms.png",
					dropDownGroupIcon : ORYX.BASE_FILE_PATH + "images/processforms.png",
					'description' : ORYX.I18N.View.editFormDesc,
					'index' : 1,
					'minShape' : 1,
					'maxShape' : 1,
					'isEnabled' : function() {
                        return ORYX.READONLY != true && this.facade.getSelection().length > 0
                        && this.facade.getSelection().first().properties["oryx-hasform"] == true;
					}.bind(this)
				});

				this.facade.offer({
					'name' : ORYX.I18N.forms.generateForm,
					'functionality' : this.generateForm.bind(this),
					'group' : "editprocessforms",
					'icon' : ORYX.BASE_FILE_PATH + "images/processforms.png",
					dropDownGroupIcon : ORYX.BASE_FILE_PATH + "images/processforms.png",
					'description' : ORYX.I18N.forms.generateFormDesc,
					'index' : 2,
					'minShape' : 1,
					'maxShape' : 1,
					'isEnabled' : function() {
						return ORYX.READONLY != true && this.facade.getSelection().length > 0
								&& this.facade.getSelection().first().properties["oryx-hasform"] == true;
					}.bind(this)
				});

				this.facade.offer({
					'name' : ORYX.I18N.forms.generateAllForms,
					'functionality' : this.generateAllForms.bind(this),
					'group' : "editprocessforms",
					'icon' : ORYX.BASE_FILE_PATH + "images/processforms.png",
					dropDownGroupIcon : ORYX.BASE_FILE_PATH + "images/processforms.png",
					'description' : ORYX.I18N.forms.generateAllForms_desc,
					'index' : 3,
					'minShape' : 0,
					'maxShape' : 0,
					'isEnabled' : function() {
						return ORYX.READONLY != true;
					}.bind(this)
				});
				console.log("Forms menu offered");
			}
		}
	},
	processFormAction : function(theAction, theFormType, showFormEditor) {
		Ext.Ajax.request({
			url : ORYX.PATH + 'extensionsforms',
			method : 'POST',
			success : function(response) {
				if (showFormEditor) {
					try {
						var form = response.responseText.evalJSON();
						parent.designeropenintab(form.fileName, form.uri);
					} catch (e) {
						this.facade.raiseEvent({
							type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
							ntype : 'error',
							msg : ORYX.I18N.inlineTaskFormEditor.errorInitiatingEditor + ': ' + e,
							title : ''

						});
					}
				}
			}.bind(this),
			failure : function() {
				this.facade.raiseEvent({
					type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
					ntype : 'error',
					msg : ORYX.I18N.inlineTaskFormEditor.errorInitiatingEditor + '.',
					title : ''

				});
			}.bind(this),
			params : {
				action : theAction,
				formType : theFormType,
				elementId : this.facade.getSelection().first() ? this.facade.getSelection().first().resourceId : "",
				profile : ORYX.PROFILE,
				uuid : window.btoa(encodeURI(ORYX.UUID)),
				json : ORYX.EDITOR.getSerializedJSON()
			}
		});
	},
	openForm : function() {
		this.processFormAction("openForm", "", true);
	},

	generateForm : function() {
		this.processFormAction("generateForm", "", true);
	},

	generateAllForms : function() {
		this.processFormAction("generateAllForms", "", false);
	}

});
ORYX.Plugins.Extensions.Button = Ext.extend(Ext.Button,{
    setSize: function() {

    }
});
ORYX.Plugins.Extensions.CurvedEdge = ORYX.Core.Edge.extend({
	_update : function(force) {
		arguments.callee.$._update.apply(this, arguments);
	},
	_init : function(svgDoc) {
		arguments.callee.$._init.apply(this, arguments);
	},
	refresh : function(svgDoc) {
		arguments.callee.$.refresh.apply(this, arguments);
		this._curve();
	},
	_curve : function() {
		if (this.getStencil()._jsonStencil.curved) {
			this._paths.each(function(path) {
				if (this.dockers.length > 2) {
					var d = this.updateSplines(this.dockers);
					path.setAttributeNS(null, "d", d);
				}
			}.bind(this));
		}
	},
	construct : function(options, stencil) {
		arguments.callee.$.construct.apply(this, arguments);
	},
	/* computes spline control points */
	updateSplines : function(dockers) {
		x = new Array();
		y = new Array();
		for (i = 0; i < dockers.length; i++) {
			var point = dockers[i].bounds.center();
			x[i] = point.x;
			y[i] = point.y;
		}
		px = this.computeControlPoints(x);
		py = this.computeControlPoints(y);
		var d = "";
		for (i = 0; i < dockers.length - 1; i++) {
			d += this.path(x[i], y[i], px.p1[i], py.p1[i], px.p2[i], py.p2[i], x[i + 1], y[i + 1]) + " ";
		}
		return d;
	},

	/* creates formated path string for SVG cubic path element */
	path : function(x1, y1, px1, py1, px2, py2, x2, y2) {
		return "M " + x1 + " " + y1 + " C " + px1 + " " + py1 + " " + px2 + " " + py2 + " " + x2 + " " + y2;
	},

	/* computes control points given knots K, this is the brain of the operation */
	/*
	 * thank you to https://www.particleincell.com/2012/bezier-splines/ for this
	 * algorithm
	 */
	computeControlPoints : function(K) {
		p1 = new Array();
		p2 = new Array();
		n = K.length - 1;

		/* rhs vector */
		a = new Array();
		b = new Array();
		c = new Array();
		r = new Array();

		/* left most segment */
		a[0] = 0;
		b[0] = 2;
		c[0] = 1;
		r[0] = K[0] + 2 * K[1];

		/* internal segments */
		for (i = 1; i < n - 1; i++) {
			a[i] = 1;
			b[i] = 4;
			c[i] = 1;
			r[i] = 4 * K[i] + 2 * K[i + 1];
		}

		/* right segment */
		a[n - 1] = 2;
		b[n - 1] = 7;
		c[n - 1] = 0;
		r[n - 1] = 8 * K[n - 1] + K[n];

		/* solves Ax=b with the Thomas algorithm (from Wikipedia) */
		for (i = 1; i < n; i++) {
			m = a[i] / b[i - 1];
			b[i] = b[i] - m * c[i - 1];
			r[i] = r[i] - m * r[i - 1];
		}

		p1[n - 1] = r[n - 1] / b[n - 1];
		for (i = n - 2; i >= 0; --i)
			p1[i] = (r[i] - c[i] * p1[i + 1]) / b[i];

		/* we have p1, now compute p2 */
		for (i = 0; i < n - 1; i++)
			p2[i] = 2 * K[i + 1] - p1[i + 1];

		p2[n - 1] = 0.5 * (K[n] + p1[n - 1]);

		return {
			p1 : p1,
			p2 : p2
		};
	}
});