 if(!ORYX.Plugins)
	ORYX.Plugins = new Object();
 if(!ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ)
		ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ={};
 ORYX.CONFIG.STENCIL_GROUP_ORDER_OBJ["http://b3mn.org/stencilset/meas#"]={
		            "Basic": 1, 
		            "Collective": 2,
		            "Rescaled": 3,
		            "Grading": 4,
		            "Ranking": 5
		        };

/**
 * The MEAS plugin provides layout methods referring to the MEAS stencilsets.
 *
 * @class ORYX.Plugins.MEAS
 * @extends Clazz
 * @param {Object} facade The facade of the editor
 */
ORYX.Plugins.MEAS = ORYX.Plugins.AbstractExtensionsPlugin.extend(
/** @lends ORYX.Plugins.MEAS.prototype */
{
	/**
	 * Creates a new instance of the VDML Proposition Exchange plugin
	 *
	 * @constructor
	 * @param {Object} facade The facade of the editor
	 */
	construct: function(facade) {
        arguments.callee.$.construct.apply(this, arguments);
		this.facade = facade;
		console.log("Initializing MEAS");
        this.decoratorUpdaters["RescaledMeasure"]=this.updateRescaledMeasureDecorations.bind(this);
        this.decoratorUpdaters["BinaryMeasure"]=this.updateBinaryMeasureDecorations.bind(this);
        this.decoratorUpdaters["CollectiveMeasure"]=this.updateCollectiveMeasureDecorations.bind(this);
        this.decoratorUpdaters["RankingInterval"]=this.updateIntervalDecorations.bind(this);
        this.decoratorUpdaters["GradeInterval"]=this.updateIntervalDecorations.bind(this);
		console.log("MEAS Initialized");
	},
	updateRescaledMeasureDecorations : function(shape){
	    console.log(shape);
        shape.getLabels().forEach(function(label){
            if(label.id==shape.id+"keyword"){
                var offset= new Number(shape.properties["oryx-offset"]);
                var mult= new Number(shape.properties["oryx-multiplier"]);
                if(isNaN(offset)){
                    offset=0;
                }
                if(isNaN(mult)){
                    mult=1;
                }
                var name="X";
                if(shape.outgoing.length>0 && shape.outgoing[0].outgoing.length>0){
                    name=shape.outgoing[0].outgoing[0].properties["oryx-name"];
                }
                label.text("(" + mult + "×" +name  +"+"+ offset +")");
                label.update();
            }
        });
	},
    updateBinaryMeasureDecorations : function(shape){
        console.log(shape);
        shape.getLabels().forEach(function(label){
            if(label.id==shape.id+"keyword"){
                var functor="+" ;
                switch(shape.properties["oryx-functor"]){
                case "minus":
                    functor="-";
                    break
                case "divide":
                    functor="÷";
                    break
                case "multiply":
                    functor="×";
                    break
                }
                var a="A";
                var b="B";
                shape.outgoing.forEach(function(edge){
                    if(edge.getStencil().idWithoutNs()=="Base1MeasureRelationship"){
                        a=edge.outgoing[0].properties["oryx-name"];
                    }else if(edge.getStencil().idWithoutNs()=="Base2MeasureRelationship"){
                        b=edge.outgoing[0].properties["oryx-name"];
                    }
                });
                label.text("(" + a + "\n" + functor +  "\n" + b+")");
                label.update();
            }
        });
    },
    updateCollectiveMeasureDecorations : function(shape){
        console.log(shape);
        shape.getLabels().forEach(function(label){
            if(label.id==shape.id+"keyword"){
                var aggregator=shape.properties["oryx-aggregator"];
                if(aggregator){
                    aggregator=aggregator.toUpperCase();
                }else{
                    aggregator="SUM";
                }
                aggregator=aggregator+"(";
                shape.outgoing.forEach(function(edge){
                    if(edge.getStencil().idWithoutNs()=="BaseNMeasureRelationship"){
                        aggregator=aggregator+edge.outgoing[0].properties["oryx-name"]+",";
                    }
                });
                aggregator=aggregator.slice(0,-1) +")";
                label.text(aggregator);
                label.update();
            }
        });
    },
    updateIntervalDecorations : function(shape){
        shape.getLabels().forEach(function(label){
            if(label.id==shape.id+"text_fullname"){
                var fromBracket=shape.properties["oryx-minimumopen"]=="true" || shape.properties["oryx-minimumopen"]==true?"(":"[";
                var toBracket=shape.properties["oryx-maximumopen"]=="true" || shape.properties["oryx-maximumopen"]==true?")":"]";
                label.text(shape.properties["oryx-name"] +" " + fromBracket + shape.properties["oryx-minimumendpoint"] + "," + shape.properties["oryx-maximumendpoint"] + toBracket);
                label.update();
            }
        });
    }
});


