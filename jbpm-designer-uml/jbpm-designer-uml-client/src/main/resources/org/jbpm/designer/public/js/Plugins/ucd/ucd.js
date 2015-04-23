if(!ORYX.Plugins)
	ORYX.Plugins = new Object();

if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
	ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};

ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/ucd#"] = {
            "Types": 1,
            "Compartments": 2,
            "Features": 3,
            "Inheritance" :4,
            "Associations" :5,
            "Imports" :6
};
/**
 * The UML plugin provides layout methods referring to the UML stencilset.
 *
 * @class ORYX.Plugins.UML
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.UCD = ORYX.Plugins.AbstractExtensionsPlugin.extend(
/** @lends ORYX.Plugins.UML.prototype */  
{
	/**
	 * Creates a new instance of the UML plugin and registers it on the
	 * layout events listed in the UML stencil set.
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
	    try{
    	    arguments.callee.$.construct.apply(this, arguments);
    		console.log("Initialising UCD");
    		this.facade = facade;
    		this.decoratorUpdaters["Property"]=this.updatePropertyDecorations.bind(this);
    		this.decoratorUpdaters["ImportedClass"]=this.updateImportDecorations.bind(this);
    		this.decoratorUpdaters["ImportedInterface"]=this.updateImportDecorations.bind(this);
    		this.decoratorUpdaters["ImportedEnumeration"]=this.updateImportDecorations.bind(this);
    		console.log("UCD Initialised");
		}catch(e){
		    alert(e.toString());
		}
	},
	updatePropertyDecorations : function(shape){
		var labels=shape.getLabels();
		for(var i=0 ; i < labels.length; i++){
		    if(labels[i].id==shape.id+"text_fullname"){
				var type= ORYX.Plugins.Extensions.extractName(shape.properties["oryx-propertytype"]);
				var mult= shape.properties["oryx-multiplicity"];
				labels[i].text(shape.properties["oryx-name"] + " : " + type + mult);
				labels[i].update();
			}
		}
	},
	updateImportDecorations : function(shape){
		var labels=shape.getLabels();
        var name="";
        for(var key in shape.properties){
            if(key.indexOf("imported")>=0){
                name=shape.properties[key];
                break;
            }
        }
        console.log(name);
        if(name.length>0){
            name=name.substring(0, name.indexOf("|"));
            var pkgName="";
            if(name.indexOf("::")>0){
                pkgName=name.substring(0,name.indexOf("::"));
                name=name.substring(name.indexOf("::")+2);
            }
            for(var i=0 ; i < labels.length; i++){
    		    if(labels[i].id==shape.id+"text_name"){
                    shape.properties["oryx-name"]=name;
    				labels[i].text(name);
    				labels[i].update();
    			}else if(labels[i].id==shape.id+"text_from"){
                    labels[i].text("("+pkgName+")");
                    labels[i].update();
    			}
    		}
        }
	}
});
