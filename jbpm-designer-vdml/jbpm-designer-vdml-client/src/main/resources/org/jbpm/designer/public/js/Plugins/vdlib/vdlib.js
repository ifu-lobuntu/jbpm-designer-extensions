if (!ORYX.Plugins)
    ORYX.Plugins = new Object();
if (!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
    ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ = {};

ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/vdlib#"] = {
    "BusinessItemDefinition" : 1,
    "OrgStructures" : 2,
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
        this.decoratorUpdaters["ImportedOrgElement"]=this.updateImportDecorations.bind(this);
        console.log("VDLib Initialized");
    }
});
