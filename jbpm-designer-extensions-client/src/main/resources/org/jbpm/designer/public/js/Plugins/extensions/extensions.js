if (!ORYX.Plugins)
	ORYX.Plugins = new Object();

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
		ORYX.Core.Edge = ORYX.Plugins.Extensions.CurvedEdge;
		ORYX.FieldEditors["eobjectref"] = new ORYX.Plugins.Extensions.EObjectRefEditorFactory();
		this.facade.registerOnEvent('layout.collapsible', this.handleLayoutCollapsible.bind(this));
		this.facade.registerOnEvent('layout.list', this.handleLayoutList.bind(this));
		this.facade.registerOnEvent('layout.compartments', this.handleLayoutCompartments.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_MOUSEDOWN, this.handleExpand.bind(this));
		this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED, this.handlePropertyChanged.bind(this));
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
	handleExpand : function(event, uiObject) {
		if (event.explicitOriginalTarget && event.explicitOriginalTarget.id && event.explicitOriginalTarget.id.indexOf("expand_") >= 0) {
			var newWidth = parseFloat(uiObject.properties["oryx-previouswidth"]);
			if (isNaN(newWidth)) {
				newWidth = 200;
			}
			var newHeight = parseFloat(uiObject.properties["oryx-previousheight"]);
			if (isNaN(newHeight)) {
				newHeight = 30;
			}
			uiObject.properties["oryx-previouswidth"] = uiObject.bounds.width();
			uiObject.properties["oryx-previousheight"] = uiObject.bounds.height();
			var topLeft = uiObject.bounds.a;
			uiObject.bounds.set(topLeft, {
				x : topLeft.x + newWidth,
				y : topLeft.y + newHeight
			});
			if (ORYX.Plugins.Extensions.isExpanded(uiObject)) {
				uiObject.properties["oryx-isexpanded"] = false;
			} else {
				uiObject.properties["oryx-isexpanded"] = true;
			}
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
		}
	},
	handlePropertyChanged : function(event) {
		if (event["key"] == "oryx-name" || event["key"] == "oryx-type") {
			this.updateDecorations(event.elements[0]);
		}
	},
	updateDecorations : function(shape) {
		var labels = shape.getLabels();
		for (var i = 0; i < labels.length; i++) {
			if (labels[i].id == shape.id + "text_type") {
				var type = shape.properties["oryx-propertytype"];
				labels[i].text(shape.properties["oryx-name"] + " : " + type);
				labels[i].update();
			}
		}
	},
	updateExpanded : function(collapsibleShape) {
		console.log(collapsibleShape.getStencil().id());
		// var
		// verticalPath=collapsibleShape.node.ownerDocument.getElementById(collapsibleShape.id+"expand_vertical");

		var paths = collapsibleShape.node.ownerDocument.getElementsByTagName("path");
		var verticalPath = null;
		for (var j = 0; j < paths.length; j++) {
			console.log(paths[j].id);
			console.log(collapsibleShape.id + "expand_vertical");
			if (paths[j].id == collapsibleShape.id + "expand_vertical") {
				verticalPath = paths[j];
				break;
			}
		}
		if (ORYX.Plugins.Extensions.isExpanded(collapsibleShape)) {
			verticalPath.setAttributeNS(null, 'display', 'none');
			collapsibleShape.children.each(function(uiObject) {
				if (uiObject instanceof ORYX.Core.Shape) {
					ORYX.Plugins.Extensions.showShape(uiObject);
				}
			}.bind(this));
		} else {
			verticalPath.setAttributeNS(null, 'display', 'inherit');
			collapsibleShape.children.each(function(uiObject) {
				if (uiObject instanceof ORYX.Core.Shape) {
					ORYX.Plugins.Extensions.hideShape(uiObject);
				}
			}.bind(this));
		}
		;
	},
	handleLayoutCollapsible : function(event) {
		this.updateExpanded(event.shape);
	},
	handleLayoutList : function(event) {
		console.log(event);
		var shape = event.shape;
		var currentOffset = 15;
		if (event.options && event.options.offsetY) {
			currentOffset = event.options.offsetY;
		}
		shape.getChildShapes(false).forEach(function(item) {
			item.bounds.set(1, currentOffset, shape.bounds.b.x - shape.bounds.a.x - 2, currentOffset + 20);
			currentOffset += 21;
		});
		// if(ORYX.Plugins.Extensions.isCollapsible(shape)){
		// this.updateExpanded(shape);
		// }

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
		}
		event.shape._changed();
		event.shape._update();
		event.shape.update();
		event.shape.refresh();
	}
});
ORYX.Plugins.Extensions.isExpanded = function(shape) {
	return shape.properties["oryx-isexpanded"] == true || shape.properties["oryx-isexpanded"] == "true";
}, ORYX.Plugins.Extensions.isCollapsible = function(shape) {
	return typeof (shape.properties["oryx-isexpanded"]) == "string" || typeof (shape.properties["oryx-isexpanded"]) == "boolean";
}, ORYX.Plugins.Extensions.extractName = function(reference) {
	return reference.slice(reference.indexOf("::") + 2, reference.indexOf("|"));
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
			cf.profile = 'cmmn';
			cf.targetProfile = jsonProp.reference.targetProfile;
			cf.filter = jsonProp.reference.filter;
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
ORYX.Plugins.Extensions.EObjectRefField = Ext
		.extend(
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
								}, {
									name : 'pkgname'
								}, {
									name : 'imgsrc'
								}
						]);

						var calldefsProxy = new Ext.data.MemoryProxy({
							root : []
						});

						var calldefs = new Ext.data.Store({
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
						calldefs.load();

						var processJSON = ORYX.EDITOR.getSerializedJSON();
						var processPackage = jsonPath(processJSON.evalJSON(), "$.properties.package");
						var processId = jsonPath(processJSON.evalJSON(), "$.properties.id");

						this.facade.raiseEvent({
							type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
							ntype : 'info',
							msg : ORYX.I18N.PropertyWindow.loadingProcessInf,
							title : ''

						});
						Ext.Ajax
								.request({
									url : ORYX.PATH + 'calledelement',
									method : 'POST',
									success : function(response) {
										try {
											if (response.responseText.length > 0 && response.responseText != "false") {
												var responseJson = Ext.decode(response.responseText);
												for ( var key in responseJson) {
													var keyParts = key.split("|");
													calldefs.add(new CallElementDef({
														name : keyParts[0],
														pkgname : keyParts[1],
														imgsrc : responseJson[key]
													}));
												}
												calldefs.commitChanges();
												console.log(this.multiSelect);
												var gridId = Ext.id();
												var grid = new Ext.grid.EditorGridPanel(
														{
															autoScroll : true,
															autoHeight : true,
															selModel:new Ext.grid.RowSelectionModel(),
															store : calldefs,
															id : gridId,
															stripeRows : true,
															cm : new Ext.grid.ColumnModel(
																	[
																			new Ext.grid.RowNumberer(),
																			{
																				id : 'pid',
																				header : ORYX.I18N.extensions.eobjectName,
																				width : 200,
																				dataIndex : 'name',
																				editor : new Ext.form.TextField({
																					allowBlank : true,
																					disabled : true
																				})
																			},
																			{
																				id : 'pkgn',
																				header : ORYX.I18N.extensions.eobjectAsset,
																				width : 200,
																				dataIndex : 'pkgname',
																				editor : new Ext.form.TextField({
																					allowBlank : true,
																					disabled : true
																				})
																			},
																			{
																				id : 'pim',
																				header : ORYX.I18N.extensions.eobjectImage,
																				width : 250,
																				dataIndex : 'imgsrc',
																				renderer : function(val) {
																					if (val && val.length > 0) {
																						return '<center><img src="'
																								+ ORYX.PATH
																								+ 'images/page_white_picture.png" onclick="new ImageViewer({title: \'Process Image\', width: \'650\', height: \'450\', autoScroll: true, fixedcenter: true, src: \''
																								+ val
																								+ '\',hideAction: \'close\'}).show();" alt="Click to view Process Image"/></center>';
																					} else {
																						return ORYX.I18N.LocalHistory.headertxt.ProcessImage.NoAvailable;
																					}
																				}
																			}
																	]),
															autoHeight : true
														});
												grid.on('afterrender', function(e) {
													if (this.value.length > 0) {
														var index = 0;
														var val = this.value;
														var mygrid = grid;
														calldefs.data.each(function() {
															if (this.data['name'] == val) {
																mygrid.getSelectionModel().select(index, 1);
															}
															index++;
														});
													}
												}.bind(this));
												grid.getSelectionModel().singleSelect=this.singleSelect;

												var calledElementsPanel = new Ext.Panel({
													id : 'calledElementsPanel',
													title : '<center>' + ORYX.I18N.PropertyWindow.selectProcessId + '</center>',
													layout : 'column',
													items : [
														grid
													],
													layoutConfig : {
														columns : 1
													},
													defaults : {
														columnWidth : 1.0
													}
												});

												var dialog = new Ext.Window({
													layout : 'anchor',
													autoCreate : true,
													title : ORYX.I18N.PropertyWindow.editorForCalledEvents,
													height : 350,
													width : 680,
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
																	var selections=grid.getSelectionModel().getSelections();
																	if (selections.length > 0) {
																		var outValue ="";
																		for(var k=0;k<selections.length;k++){
																			var row = selections[k];
																			outValue += row.data['name'] + '|'
																					+ row.data['pkgname'];
																			if(k<selections.length-1){
																				outValue+=",";
																			}
																		}
																		grid.stopEditing();
																		grid.getView().refresh();
																		this.setValue(outValue);
																		this.dataSource.getAt(this.row).set('value', outValue)
																		this.dataSource.commitChanges()
																		dialog.hide()
																	} else {
																		this.facade.raiseEvent({
																			type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
																			ntype : 'error',
																			msg : ORYX.I18N.LocalHistory.LocalHistoryView.msg,
																			title : ''

																		});
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
											// alert(key + "=" + e[key]);
										}
										this.facade.raiseEvent({
											type : ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,
											ntype : 'error',
											msg : ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo + '.',
											title : ''

										});
									},
									params : {
										profile : this.profile,
										targetProfile : this.targetProfile,
										elementTypes : this.elementTypes,
										nameFeature : this.nameFeature,
										sourceElementId:this.sourceElementId,
										uuid : ORYX.UUID,
										assetid : ORYX.UUID,
										json : ORYX.EDITOR.getSerializedJSON(),
										ppackage : processPackage,
										pid : processId,
										action : "getEmfElements"
									}
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
				console.log("FOrms menu offered");
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
					console.log(d);
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