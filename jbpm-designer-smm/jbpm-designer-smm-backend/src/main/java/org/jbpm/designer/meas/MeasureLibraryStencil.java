package org.jbpm.designer.meas;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.SMMFactory;
import org.omg.smm.SMMPackage;
import org.omg.smm.SmmElement;
import org.omg.smm.UnitOfMeasure;
import org.omg.vdml.VDMLPackage;

public enum MeasureLibraryStencil implements StencilInfo {
    MEASURE_LIBRARY(SMMPackage.eINSTANCE.getMeasureLibrary(), SMMDIPackage.eINSTANCE.getSMMDiagram(), "MeasureLibraryDiagram"),
    UNIT_OF_MEASURE(SMMPackage.eINSTANCE.getUnitOfMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "UnitOfMeasure"),
    DIRECT_MEASURE(SMMPackage.eINSTANCE.getDirectMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "DirectMeasure"),
    COUNTING_MEASURE(SMMPackage.eINSTANCE.getCountingMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "CountingMeasure"),
    NAMED_MEASURE(SMMPackage.eINSTANCE.getNamedMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "NamedMeasure"),
    BINARY_MEASURE(SMMPackage.eINSTANCE.getBinaryMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "BinaryMeasure"),
    COLLECTIVE_MEASURE(SMMPackage.eINSTANCE.getCollectiveMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "CollectiveMeasure"),
    RESCALED_MEASURE(SMMPackage.eINSTANCE.getRescaledMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "RescaledMeasure"),
    GRADE_MEASURE(SMMPackage.eINSTANCE.getGradeMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "GradeMeasure"),
    GRADE_INTERVAL(SMMPackage.eINSTANCE.getGradeInterval(), SMMDIPackage.eINSTANCE.getSMMShape(), "GradeInterval"),
    GRADE_MEASURE_RELATIONSHIP(SMMPackage.eINSTANCE.getGradeMeasureRelationship(), SMMDIPackage.eINSTANCE.getSMMEdge(), "GradeMeasureRelationship"),
    RANKING_MEASURE(SMMPackage.eINSTANCE.getRankingMeasure(), SMMDIPackage.eINSTANCE.getSMMShape(), "RankingMeasure"),
    RANKING_INTERVAL(SMMPackage.eINSTANCE.getRankingInterval(), SMMDIPackage.eINSTANCE.getSMMShape(), "RankingInterval"),
    RANKING_MEASURE_RELATIONSHIP(SMMPackage.eINSTANCE.getRankingMeasureRelationship(), SMMDIPackage.eINSTANCE.getSMMEdge(), "RankingMeasureRelationship"),
    BASE1_MEASURE_RELATIONSHIP(SMMPackage.eINSTANCE.getBase1MeasureRelationship(), SMMDIPackage.eINSTANCE.getSMMEdge(), "Base1MeasureRelationship"),
    BASE2_MEASURE_RELATIONSHIP(SMMPackage.eINSTANCE.getBase2MeasureRelationship(), SMMDIPackage.eINSTANCE.getSMMEdge(), "Base2MeasureRelationship"),
    BASEN_MEASURE_RELATIONSHIP(SMMPackage.eINSTANCE.getBaseNMeasureRelationship(), SMMDIPackage.eINSTANCE.getSMMEdge(), "BaseNMeasureRelationship"),
    RESCALED_MEASURE_RELATIONSHIP(SMMPackage.eINSTANCE.getRescaledMeasureRelationship(), SMMDIPackage.eINSTANCE.getSMMEdge(), "RescaledMeasureRelationship"),
    USE_UNIT_OF_MEASURE(SMMPackage.eINSTANCE.getDimensionalMeasure_Unit(), SMMDIPackage.eINSTANCE.getSMMEdge(), "UseUnitOfMeasure"),
    ;

    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, MeasureLibraryStencil> nameMap = new HashMap<String, MeasureLibraryStencil>();

    private MeasureLibraryStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private MeasureLibraryStencil(EReference type, EClass shapeType, String name) {
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    public EClass getType() {
        return type;
    }

    public String getStencilId() {
        return stencilId;
    }

    static {
        for (MeasureLibraryStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static DiagramElement createDiagramElement(String stencilId) {
        MeasureLibraryStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (DiagramElement) SMMDIFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static SmmElement createElement(String stencilId) {
        MeasureLibraryStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        return (SmmElement) SMMFactory.eINSTANCE.create(stencil.type);
    }

    public static MeasureLibraryStencil findStencilById(String stencilId) {
        MeasureLibraryStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static MeasureLibraryStencil findStencilByElement(EObject me, DiagramElement de) {
        if(de instanceof SMMEdge && ((SMMEdge) de).getTargetShape().getSmmElement() instanceof UnitOfMeasure){
            return USE_UNIT_OF_MEASURE;
        }
        MeasureLibraryStencil[] possibilities = values();
        if (possibilities != null) {
            for (MeasureLibraryStencil cmmnStencil : possibilities) {
                if (cmmnStencil.type!=null && cmmnStencil.type.isSuperTypeOf(me.eClass())) {
                    return cmmnStencil;
                }
            }
        }
        return null;
    }
    public static final String MEAS_URI= SMMPackage.eINSTANCE.getNsURI();
}
