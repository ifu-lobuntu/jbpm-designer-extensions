if(!ORYX.Plugins){ORYX.Plugins=new Object()
}ORYX.Plugins.CMMN=Clazz.extend({construct:function(a){this.facade=a;
this.facade.registerOnEvent("layout.cmmn.case_file_item",this.handleLayoutCaseFileItem.bind(this));
ORYX.FieldEditors.calledprocess=new ORYX.Plugins.CMMN.CalledProcessEditorFactory();
ORYX.FieldEditors.calledcase=new ORYX.Plugins.CMMN.CalledProcessEditorFactory();
ORYX.FieldEditors.caseroleref=new ORYX.Plugins.CMMN.CaseRoleRefEditorFactory();
ORYX.FieldEditors.taskparameters=new ORYX.Plugins.CMMN.TaskParametersEditorFactory();
ORYX.FieldEditors.taskinparameterandmappings=new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory();
ORYX.FieldEditors.taskoutparameterandmappings=new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory();
this.facade.registerOnEvent(ORYX.CONFIG.EVENT_PROPWINDOW_PROP_CHANGED,this.handlePropertyChanged.bind(this));
this.facade.registerOnEvent(ORYX.CONFIG.EVENT_LOADED,this.updateDecorationsOnLoad.bind(this))
},handlePropertyChanged:function(a){if(a.key=="oryx-autocomplete"||a.key=="oryx-manualactivationrulebody"||a.key=="oryx-repetitionrulebody"||a.key=="oryx-requiredrulebody"||a.key=="oryx-propertytype"||a.key=="oryx-name"||a.key=="oryx-standardevent"){this.updateDecorations(a.elements[0])
}},updateDecorationsOnLoad:function(d){this.facade.getCanvas().getChildNodes(true,function(g){if(g.getStencil()){var e=g.getStencil().id();
if(e.indexOf("Task")>=0||e.indexOf("Stage")>=0||e.indexOf("Milestone")>=0||e.indexOf("Property")>=0){this.updateDecorations(g)
}}}.bind(this));
try{for(var b=0;
b<this.facade.getCanvas().edges.length;
b++){var c=this.facade.getCanvas().edges[b];
if(c.getStencil()){var a=c.getStencil().id();
if(a.indexOf("OnPart")>=0||a.indexOf("StartTrigger")>=0){this.updateDecorations(c)
}}}}catch(f){alert(f)
}},updateDecorations:function(b){if(b._svgShapes){b._svgShapes.each(function(g){if(g.element.id==b.id+"autoCompleteRect"){g.element.setAttributeNS(null,"display",b.properties["oryx-autocomplete"]?"inherit":"none")
}else{if(g.element.id==b.id+"manualActivationPath"){var f=b.properties["oryx-manualactivationrulebody"];
g.element.setAttributeNS(null,"display",f&&f.length>0?"inherit":"none")
}}})
}var e=b.getLabels();
for(var c=0;
c<e.length;
c++){if(e[c].id==b.id+"repetitionText"){var a=b.properties["oryx-repetitionrulebody"];
e[c].node.setAttributeNS(null,"display",a&&a.length>0?"inherit":"none")
}else{if(e[c].id==b.id+"requiredText"){var a=b.properties["oryx-requiredrulebody"];
e[c].node.setAttributeNS(null,"display",a&&a.length>0?"inherit":"none")
}else{if(e[c].id==b.id+"text_type"){var d=b.properties["oryx-propertytype"];
e[c].text(b.properties["oryx-name"]+" : "+d.substring(d.lastIndexOf("/")+1));
e[c].update()
}else{if(e[c].id==b.id+"text_event"){var d=b.properties["oryx-standardevent"];
e[c].text(b.properties["oryx-standardevent"]);
e[c].update()
}}}}}},handleLayoutCaseFileItem:function(b){var a=b.shape;
var c=30;
a.getChildShapes(false).forEach(function(d){d.bounds.set(5,c,a.bounds.b.x-a.bounds.a.x-10,c+20);
c+=20
})
}});
ORYX.Plugins.CMMN.TaskParametersEditorFactory=Clazz.extend({construct:function(){},init:function(){var c=arguments[0];
var g=arguments[1];
var b=arguments[3];
try{var a=g._jsonProp.lookupType;
var d=new ORYX.Plugins.CMMN.TaskParametersEditor({allowBlank:g.optional(),dataSource:this.dataSource,grid:this.grid,row:b,facade:this.facade,shapes:this.shapeSelection.shapes});
d.on("dialogClosed",this.dialogClosed,{scope:this,row:b,col:1,field:d});
return new Ext.Editor(d)
}catch(f){alert(f)
}}});
ORYX.Plugins.CMMN.TaskParametersEditor=Ext.extend(Ext.form.TriggerField,{windowTitle:"",addButtonLabel:"",single:false,editable:false,readOnly:true,dtype:"",onTriggerClick:function(){try{var f=new Array();
this.facade.getCanvas().getChildNodes(true,function(i){if(i.getStencil()){var e=i.getStencil().id();
if(e.endsWith("CaseFileItem")){var o=new Array();
o.push(i.properties["oryx-name"]);
o.push(i.properties["oryx-name"]);
f.push(o)
}}}.bind(this));
var j=Ext.data.Record.create([{name:"name"},{name:"binding"},{name:"bindingRefinementLanguage"},{name:"bindingRefinement"}]);
var b=new Ext.data.MemoryProxy({root:[]});
var d=new Ext.data.Store({autoDestroy:true,reader:new Ext.data.JsonReader({root:"root"},j),proxy:b,sorters:[{property:"name",direction:"ASC"}]});
d.load();
if(this.value.length>0){var n=this.value.evalJSON();
if(n.parameters){n=n.parameters
}for(var g=0;
g<n.length;
g++){var h=n[g];
d.add(new j({name:h.name,binding:h.binding,bindingRefinementLanguage:h.bindingRefinementLanguage,bindingRefinement:h.bindingRefinement}))
}}var k=new Extensive.grid.ItemDeleter();
k.setDType(this.dtype);
var c=Ext.id();
Ext.form.VTypes.inputNameVal=/^[a-z0-9\-\.\_]*$/i;
Ext.form.VTypes.inputNameText="Invalid name";
Ext.form.VTypes.inputName=function(e){return Ext.form.VTypes.inputNameVal.test(e)
};
var a=new Ext.grid.EditorGridPanel({autoScroll:true,autoHeight:true,store:d,id:c,stripeRows:true,cm:new Ext.grid.ColumnModel([new Ext.grid.RowNumberer(),{id:"name",header:"Name",width:100,dataIndex:"name",editor:new Ext.form.TextField({allowBlank:true,vtype:"inputName",regex:/^[a-z0-9\-\.\_]*$/i}),renderer:Ext.util.Format.htmlEncode},{id:"binding",header:"Case File Item",width:150,dataIndex:"binding",editor:new Ext.form.ComboBox({typeAhead:true,anyMatch:true,id:"bindingCombo",valueField:"value",displayField:"name",labelStyle:"display:none",submitValue:true,typeAhead:true,queryMode:"local",mode:"local",triggerAction:"all",selectOnFocus:true,hideTrigger:false,forceSelection:false,selectOnFocus:true,autoSelect:false,editable:true,store:new Ext.data.SimpleStore({fields:["name","value"],data:f})})},{id:"bindingRefinementLanguage",header:"Language",width:70,dataIndex:"bindingRefinementLanguage",editor:new Ext.form.ComboBox({typeAhead:true,anyMatch:true,id:"languageCombo",valueField:"value",displayField:"name",labelStyle:"display:none",submitValue:true,typeAhead:true,queryMode:"local",mode:"local",triggerAction:"all",selectOnFocus:true,hideTrigger:false,forceSelection:false,selectOnFocus:true,autoSelect:false,editable:true,store:new Ext.data.SimpleStore({fields:["name","value"],data:[["Java","java"],["MVEL","mvel"]]})})},{id:"bindingRefinement",header:"Refinement",width:200,dataIndex:"bindingRefinement",editor:new Ext.form.TextField({allowBlank:true}),renderer:Ext.util.Format.htmlEncode},k]),selModel:k,autoHeight:true,tbar:[{text:"Add",handler:function(){if(this.single&&d.getCount()>0){this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:ORYX.I18N.PropertyWindow.OnlySingleEntry,title:""})
}else{d.add(new j({name:"",binding:"",bindingRefinementLanguage:"",bindingRefinement:""}));
a.fireEvent("cellclick",a,d.getCount()-1,1,null)
}}.bind(this)}],clicksToEdit:1});
var m=new Ext.Window({layout:"anchor",autoCreate:true,title:this.windowTitle,height:300,width:600,modal:true,collapsible:false,fixedcenter:true,shadow:true,resizable:true,proxyDrag:true,autoScroll:true,keys:[{key:27,fn:function(){m.hide()
}.bind(this)}],items:[a],listeners:{hide:function(){this.fireEvent("dialogClosed",this.value);
m.destroy()
}.bind(this)},buttons:[{text:ORYX.I18N.PropertyWindow.ok,handler:function(){var e="";
a.stopEditing();
a.getView().refresh();
var i={parameters:[]};
d.data.each(function(){if(this.data.name.length>0){i.parameters.push({name:this.data.name,binding:this.data.binding,bindingRefinementLanguage:this.data.bindingRefinementLanguage,bindingRefinement:this.data.bindingRefinement,})
}});
var e=Object.toJSON(i);
this.setValue(e);
this.dataSource.getAt(this.row).set("value",e);
this.dataSource.commitChanges();
m.hide()
}.bind(this)},{text:ORYX.I18N.PropertyWindow.cancel,handler:function(){this.setValue(this.value);
m.hide()
}.bind(this)}]});
m.show();
a.render();
this.grid.stopEditing();
a.focus(false,100)
}catch(l){alert(l)
}}});
ORYX.Plugins.CMMN.TaskParameterAndMappingsEditorFactory=Clazz.extend({construct:function(){},init:function(){var c=arguments[0];
var g=arguments[1];
var b=arguments[3];
try{var a=g._jsonProp.lookupType;
var d=new ORYX.Plugins.CMMN.TaskParameterAndMappingsEditor({allowBlank:g.optional(),dataSource:this.dataSource,grid:this.grid,row:b,facade:this.facade,shapes:this.shapeSelection.shapes,});
d.servletAction=g.type().endsWith("taskinparameterandmappings")?"showprocessinput":"showprocessoutput";
if(this.shapeSelection.shapes.first().getStencil().id().contains("ProcessTask")){d.profile="jbpm";
d.processId=this.shapeSelection.shapes.first().properties["oryx-calledprocess"]
}else{d.profile="cmmn1.0";
d.processId=this.shapeSelection.shapes.first().properties["oryx-calledcase"]
}d.on("dialogClosed",this.dialogClosed,{scope:this,row:b,col:1,field:d});
return new Ext.Editor(d)
}catch(f){alert(f)
}}});
ORYX.Plugins.CMMN.TaskParameterAndMappingsEditor=Ext.extend(Ext.form.TriggerField,{windowTitle:"",addButtonLabel:"",single:false,editable:false,readOnly:true,dtype:"",servletAction:"",processId:"",profile:"",parametersToMap:function(c){if(c.parameters){c=c.parameters
}var a={};
for(var b=0;
b<c.length;
b++){a[c[b].name]=c[b]
}return a
},onTriggerClick:function(){var a=ORYX.EDITOR.getSerializedJSON();
var b=jsonPath(a.evalJSON(),"$.properties.package");
var c=jsonPath(a.evalJSON(),"$.properties.id");
Ext.Ajax.request({url:ORYX.PATH+"calledelement",method:"POST",success:function(k){try{if(k.responseText.length>=0&&k.responseText!="false"){var j=new Array();
this.facade.getCanvas().getChildNodes(true,function(i){if(i.getStencil()){var e=i.getStencil().id();
if(e.endsWith("CaseFileItem")){var v=new Array();
v.push(i.properties["oryx-name"]);
v.push(i.properties["oryx-name"]);
j.push(v)
}}}.bind(this));
var n=Ext.data.Record.create([{name:"name"},{name:"binding"},{name:"bindingRefinementLanguage"},{name:"bindingRefinement"}]);
var f=new Ext.data.MemoryProxy({root:[]});
var h=new Ext.data.Store({autoDestroy:true,reader:new Ext.data.JsonReader({root:"root"},n),proxy:f,sorters:[{property:"name",direction:"ASC"}]});
h.load();
var u=this.parametersToMap(this.value.length>0?this.value.evalJSON():[]);
var o=this.parametersToMap(k.responseText.evalJSON());
var t=[];
for(var s in o){if(u[s]){t.push(u[s])
}else{t.push(o[s])
}}for(var l=0;
l<t.length;
l++){var m=t[l];
h.add(new n({name:m.name,binding:m.binding,bindingRefinementLanguage:m.bindingRefinementLanguage,bindingRefinement:m.bindingRefinement}))
}var p=new Extensive.grid.ItemDeleter();
p.setDType(this.dtype);
var g=Ext.id();
Ext.form.VTypes.inputNameVal=/^[a-z0-9\-\.\_]*$/i;
Ext.form.VTypes.inputNameText="Invalid name";
Ext.form.VTypes.inputName=function(e){return Ext.form.VTypes.inputNameVal.test(e)
};
var d=new Ext.grid.EditorGridPanel({autoScroll:true,autoHeight:true,store:h,id:g,stripeRows:true,cm:new Ext.grid.ColumnModel([new Ext.grid.RowNumberer(),{id:"name",header:"Name",width:100,dataIndex:"name",editor:new Ext.form.TextField({allowBlank:true,vtype:"inputName",regex:/^[a-z0-9\-\.\_]*$/i}),renderer:Ext.util.Format.htmlEncode},{id:"binding",header:"Case File Item",width:150,dataIndex:"binding",editor:new Ext.form.ComboBox({typeAhead:true,anyMatch:true,id:"bindingCombo",valueField:"value",displayField:"name",labelStyle:"display:none",submitValue:true,typeAhead:true,queryMode:"local",mode:"local",triggerAction:"all",selectOnFocus:true,hideTrigger:false,forceSelection:false,selectOnFocus:true,autoSelect:false,editable:true,store:new Ext.data.SimpleStore({fields:["name","value"],data:j})})},{id:"bindingRefinementLanguage",header:"Language",width:70,dataIndex:"bindingRefinementLanguage",editor:new Ext.form.ComboBox({typeAhead:true,anyMatch:true,id:"languageCombo",valueField:"value",displayField:"name",labelStyle:"display:none",submitValue:true,typeAhead:true,queryMode:"local",mode:"local",triggerAction:"all",selectOnFocus:true,hideTrigger:false,forceSelection:false,selectOnFocus:true,autoSelect:false,editable:true,store:new Ext.data.SimpleStore({fields:["name","value"],data:[["Java","java"],["MVEL","mvel"]]})})},{id:"bindingRefinement",header:"Refinement",width:200,dataIndex:"bindingRefinement",editor:new Ext.form.TextField({allowBlank:true}),renderer:Ext.util.Format.htmlEncode},p]),selModel:p,autoHeight:true,tbar:[],clicksToEdit:1});
var r=new Ext.Window({layout:"anchor",autoCreate:true,title:this.windowTitle,height:300,width:600,modal:true,collapsible:false,fixedcenter:true,shadow:true,resizable:true,proxyDrag:true,autoScroll:true,keys:[{key:27,fn:function(){r.hide()
}.bind(this)}],items:[d],listeners:{hide:function(){this.fireEvent("dialogClosed",this.value);
r.destroy()
}.bind(this)},buttons:[{text:ORYX.I18N.PropertyWindow.ok,handler:function(){var e="";
d.stopEditing();
d.getView().refresh();
var i={parameters:[]};
h.data.each(function(){if(this.data.name.length>0){i.parameters.push({name:this.data.name,binding:this.data.binding,bindingRefinementLanguage:this.data.bindingRefinementLanguage,bindingRefinement:this.data.bindingRefinement,})
}});
var e=Object.toJSON(i);
this.setValue(e);
this.dataSource.getAt(this.row).set("value",e);
this.dataSource.commitChanges();
r.hide()
}.bind(this)},{text:ORYX.I18N.PropertyWindow.cancel,handler:function(){this.setValue(this.value);
r.hide()
}.bind(this)}]});
r.show();
d.render();
this.grid.stopEditing();
d.focus(false,100)
}else{this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:"Unable to find Data Types.",title:""})
}}catch(q){alert("Error1"+q);
this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:"Error retrieving Data Types info  :\n"+q,title:""})
}}.bind(this),failure:function(f){for(var d in f){alert(d+"="+f[d])
}this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:"Error retrieving Data Types info.",title:""})
},params:{profile:this.profile,uuid:ORYX.UUID,pid:this.processId,action:this.servletAction}})
}});
ORYX.Plugins.CMMN.CaseRoleRefEditorFactory=Clazz.extend({construct:function(){},init:function(){var k=arguments[0];
var b=arguments[1];
var g=arguments[3];
var l=[];
try{var a=this.facade.getSelection().first();
while(!a.getStencil().id().endsWith("#Case")){a=a.getParentShape()
}if(a.properties["oryx-caseroles"]){var f=a.properties["oryx-caseroles"].split(",");
for(var d=0;
d<f.length;
d++){l.push(["",f[d],f[d]])
}}var j=new Ext.data.SimpleStore({fields:[{name:"icon"},{name:"title"},{name:"value"}],data:l});
var c=new Ext.form.ComboBox({editable:false,tpl:'<tpl for="."><div class="x-combo-list-item">{[(values.icon) ? "<img src=\'" + values.icon + "\' />" : ""]} {title}</div></tpl>',store:j,displayField:"title",valueField:"value",typeAhead:true,mode:"local",triggerAction:"all",selectOnFocus:true});
return new Ext.Editor(c)
}catch(h){alert(h)
}}});
ORYX.Plugins.CMMN.CalledProcessEditorFactory=Clazz.extend({construct:function(){},init:function(){try{var c=arguments[0];
var g=arguments[1];
var b=arguments[3];
var a=g._jsonProp.lookupType;
var d=new ORYX.Plugins.CMMN.ComplexCalledProcessField({allowBlank:g.optional(),dataSource:this.dataSource,grid:this.grid,row:b,facade:this.facade,shapes:this.shapeSelection.shapes});
d.profile=g.id()=="calledcase"?"cmmn1.0":"jbpm";
d.on("dialogClosed",this.dialogClosed,{scope:this,row:b,col:1,field:d});
return new Ext.Editor(d)
}catch(f){alert(f)
}}});
ORYX.Plugins.CMMN.ComplexCalledProcessField=Ext.extend(Ext.form.TriggerField,{editable:true,readOnly:false,onTriggerClick:function(){if(this.disabled){return
}var a=Ext.data.Record.create([{name:"name"},{name:"pkgname"},{name:"imgsrc"}]);
var e=new Ext.data.MemoryProxy({root:[]});
var d=new Ext.data.Store({autoDestroy:true,reader:new Ext.data.JsonReader({root:"root"},a),proxy:e,sorters:[{property:"name",direction:"ASC"}]});
d.load();
var b=ORYX.EDITOR.getSerializedJSON();
var c=jsonPath(b.evalJSON(),"$.properties.package");
var f=jsonPath(b.evalJSON(),"$.properties.id");
this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"info",msg:ORYX.I18N.PropertyWindow.loadingProcessInf,title:""});
Ext.Ajax.request({url:ORYX.PATH+"calledelement",method:"POST",success:function(i){try{if(i.responseText.length>0&&i.responseText!="false"){var l=Ext.decode(i.responseText);
for(var n in l){var o=n.split("|");
d.add(new a({name:o[0],pkgname:o[1],imgsrc:l[n]}))
}d.commitChanges();
var h=Ext.id();
var g=new Ext.grid.EditorGridPanel({autoScroll:true,autoHeight:true,store:d,id:h,stripeRows:true,cm:new Ext.grid.ColumnModel([new Ext.grid.RowNumberer(),{id:"pid",header:ORYX.I18N.PropertyWindow.processId,width:200,dataIndex:"name",editor:new Ext.form.TextField({allowBlank:true,disabled:true})},{id:"pkgn",header:ORYX.I18N.PropertyWindow.packageName,width:200,dataIndex:"pkgname",editor:new Ext.form.TextField({allowBlank:true,disabled:true})},{id:"pim",header:ORYX.I18N.LocalHistory.headertxt.ProcessImage,width:250,dataIndex:"imgsrc",renderer:function(p){if(p&&p.length>0){return'<center><img src="'+ORYX.PATH+"images/page_white_picture.png\" onclick=\"new ImageViewer({title: 'Process Image', width: '650', height: '450', autoScroll: true, fixedcenter: true, src: '"+p+"',hideAction: 'close'}).show();\" alt=\"Click to view Process Image\"/></center>"
}else{return ORYX.I18N.LocalHistory.headertxt.ProcessImage.NoAvailable
}}}]),autoHeight:true});
g.on("afterrender",function(r){if(this.value.length>0){var p=0;
var s=this.value;
var q=g;
d.data.each(function(){if(this.data.name==s){q.getSelectionModel().select(p,1)
}p++
})
}}.bind(this));
var m=new Ext.Panel({id:"calledElementsPanel",title:"<center>"+ORYX.I18N.PropertyWindow.selectProcessId+"</center>",layout:"column",items:[g],layoutConfig:{columns:1},defaults:{columnWidth:1}});
var k=new Ext.Window({layout:"anchor",autoCreate:true,title:ORYX.I18N.PropertyWindow.editorForCalledEvents,height:350,width:680,modal:true,collapsible:false,fixedcenter:true,shadow:true,resizable:true,proxyDrag:true,autoScroll:true,keys:[{key:27,fn:function(){k.hide()
}.bind(this)}],items:[m],listeners:{hide:function(){this.fireEvent("dialogClosed",this.value);
k.destroy()
}.bind(this)},buttons:[{text:ORYX.I18N.Save.save,handler:function(){if(g.getSelectionModel().getSelectedCell()!=null){var p=g.getSelectionModel().getSelectedCell()[0];
var q=d.getAt(p).data.name+"|"+d.getAt(p).data.pkgname;
g.stopEditing();
g.getView().refresh();
this.setValue(q);
this.dataSource.getAt(this.row).set("value",q);
this.dataSource.commitChanges();
k.hide()
}else{this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:ORYX.I18N.LocalHistory.LocalHistoryView.msg,title:""})
}}.bind(this)},{text:ORYX.I18N.PropertyWindow.cancel,handler:function(){this.setValue(this.value);
k.hide()
}.bind(this)}]});
k.show();
g.render();
g.fireEvent("afterrender");
this.grid.stopEditing();
g.focus(false,100)
}else{this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:ORYX.I18N.PropertyWindow.unableToFindOtherProcess,title:""})
}}catch(j){this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo+" :\n"+j,title:""})
}}.bind(this),failure:function(h){alert("Error");
for(var g in h){}this.facade.raiseEvent({type:ORYX.CONFIG.EVENT_NOTIFICATION_SHOW,ntype:"error",msg:ORYX.I18N.PropertyWindow.errorResolvingOtherProcessInfo+".",title:""})
},params:{profile:this.profile,uuid:ORYX.UUID,ppackage:c,pid:f,action:"getCallableCMMNElement"}})
}});