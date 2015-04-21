if (!ORYX.Plugins)
    ORYX.Plugins = new Object();
if (!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
    ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ = {};

ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdlib#"] = {
    "BusinessItemDefinition" : 1,
    "OrgStructures" : 2,
    "Capability" : 3,
    "Types" : 5,
    "Compartments" : 6,
    "Features" : 7,
    "Inheritance" : 8,
    "Associations" : 9,
    "Imports" : 10
};

/**
 * The VDLib plugin provides layout methods referring to the VDLib stencilsets.
 * 
 * @class ORYX.Plugins.VDLib
 * @extends Clazz
 * @param {Object}
 *            facade The facade of the editor
 */
ORYX.Plugins.VDLib = ORYX.Plugins.UCD.extend(
/** @lends ORYX.Plugins.VDLib.prototype */
{
    /**
     * Creates a new instance of the VDML Proposition Exchange plugin
     * 
     * @constructor
     * @param {Object}
     *            facade The facade of the editor
     */
    construct : function(facade) {
        this.facade = facade;
        arguments.callee.$.construct.apply(this, arguments);
        console.log("Initializing VDLib");
        this.decoratorUpdaters["ExternalOrgUnit"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ExternalStore"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ExternalPool"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ExternalCapabilityOffer"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedBusinessItemDefinition"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedBusinessItemCategory"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedCapabilityDefinition"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedCapabilityCategory"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedRoleDefinition"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedRoleCategory"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedValueDefinition"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["ImportedValueCategory"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["OrgUnit"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["Store"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["Pool"]=this.updateImportDecorations.bind(this);
        this.decoratorUpdaters["CapabilityOffer"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["BusinessItemDefinition"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["BusinessItemCategory"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["CapabilityDefinition"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["CapabilityCategory"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["RoleDefinition"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["RoleCategory"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["ValueDefinition"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["ValueCategory"]=this.updateKeywordDecorations.bind(this);
        this.decoratorUpdaters["Characteristic"]=this.updateCharacteristicDecorations.bind(this);
        
        console.log("VDLib Initialized");
    },
    updateCharacteristicDecorations : function(shape){
        var labels=shape.getLabels();
        for(var i=0 ; i < labels.length; i++){
            if(labels[i].id==shape.id+"text_name"){
                var name="";
                for(var key in shape.properties){
                    if(key.indexOf("measure")>=0){
                        name=shape.properties[key];
                        break;
                    }
                }
                name=name.substring(0, name.indexOf("|"));
                shape.properties["oryx-name"]=name;
                labels[i].text(name);
                labels[i].update();
            }
        }
    },
    updateImportDecorations : function(shape){
        arguments.callee.$.updateImportDecorations.apply(this, arguments);
        this.updateKeywordDecorations(shape);
        
    },
    updateKeywordDecorations : function(shape){
        var labels=shape.getLabels();
        for(var i=0 ; i < labels.length; i++){
            if(labels[i].id==shape.id+"text_keyword"){
                labels[i].text("≪" + shape.getStencil().title() + "≫");
                labels[i].update();
            }
        }
    }
});
