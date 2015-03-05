package org.jbpm.designer.cmmn1.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.Cmmn1Package;
import org.eclipse.cmmn1.TCaseFileItem;
import org.eclipse.cmmn1.TCmmnElement;
import org.eclipse.cmmn1.TDiscretionaryItem;
import org.eclipse.cmmn1.TEvent;
import org.eclipse.cmmn1.TMilestone;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.cmmn1.TPlanItemDefinition;
import org.eclipse.cmmn1.TPlanItemOnPart;
import org.eclipse.cmmn1.TPlanItemStartTrigger;
import org.eclipse.cmmn1.TSentry;
import org.eclipse.cmmndi.CmmnDiFactory;
import org.eclipse.cmmndi.CmmnDiPackage;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.emf.util.StencilInfo;

public enum CmmnStencil implements StencilInfo {
    CMMN_DIAGRAM(Cmmn1Package.eINSTANCE.getTDefinitions(), CmmnDiPackage.eINSTANCE.getCMMNDiagram(), "CMMNDiagram"),
    CASE(Cmmn1Package.eINSTANCE.getTCase(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "Case"),
    HUMAN_TASK(Cmmn1Package.eINSTANCE.getTHumanTask(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "HumanTask1"),
    DISCRETIONARY_HUMAN_TASK(Cmmn1Package.eINSTANCE.getTHumanTask(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "DiscretionaryHumanTask1"),
    CASE_TASK(Cmmn1Package.eINSTANCE.getTCaseTask(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "CaseTask1"),
    DISCRETIONARY_CASE_TASK(Cmmn1Package.eINSTANCE.getTCaseTask(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "DiscretionaryCaseTask1"),
    PROCESS_TASK(Cmmn1Package.eINSTANCE.getTProcessTask(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "ProcessTask1"),
    DISCRETIONARY_PROCESS_TASK(Cmmn1Package.eINSTANCE.getTProcessTask(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "DiscretionaryProcessTask1"),
    STAGE(Cmmn1Package.eINSTANCE.getTStage(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "Stage"),
    DISCRETIONARY_STAGE(Cmmn1Package.eINSTANCE.getTStage(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "DiscretionaryStage"),
    MILESTONE(Cmmn1Package.eINSTANCE.getTMilestone(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "Milestone"),
    USER_EVENT(Cmmn1Package.eINSTANCE.getTUserEvent(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "UserEvent"),
    TIMER_EVENT(Cmmn1Package.eINSTANCE.getTTimerEvent(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "TimerEvent"),
    CASE_FILE_ITEM_START_TRIGGER(Cmmn1Package.eINSTANCE.getTCaseFileItemStartTrigger(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemStartTrigger"),
    PLAN_ITEM_START_TRIGGER(Cmmn1Package.eINSTANCE.getTPlanItemStartTrigger(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "PlanItemStartTrigger"),
    EVENT_START_TRIGGER(Cmmn1Package.eINSTANCE.getTPlanItemStartTrigger(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "EventStartTrigger"),
    ENTRY_SENTRY(Cmmn1Package.eINSTANCE.getTSentry(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "EntrySentry"),
    EXIT_SENTRY(Cmmn1Package.eINSTANCE.getTSentry(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "ExitSentry"),
    CASE_FILE_ITEM(Cmmn1Package.eINSTANCE.getTCaseFileItem(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "CaseFileItem"),
    PROPERTY(Cmmn1Package.eINSTANCE.getTProperty(), CmmnDiPackage.eINSTANCE.getCMMNShape(), "Property"),
    CASE_FILE_ITEM_ON_PART(Cmmn1Package.eINSTANCE.getTCaseFileItemOnPart(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemOnPart"),
    PLAN_ITEM_ON_PART(Cmmn1Package.eINSTANCE.getTPlanItemOnPart(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "PlanItemOnPart"),
    EVENT_ON_PART(Cmmn1Package.eINSTANCE.getTPlanItemOnPart(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "EventOnPart"),
    CASE_FILE_ITEM_CHILD(Cmmn1Package.eINSTANCE.getTCaseFileItem_Children(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemChild"),
    CASE_FILE_ITEM_TARGET(Cmmn1Package.eINSTANCE.getTCaseFileItem_TargetRefs(), CmmnDiPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemTarget"), ;
    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, CmmnStencil> nameMap = new HashMap<String, CmmnStencil>();

    private CmmnStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private CmmnStencil(EReference type, EClass shapeType, String name) {
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
        for (CmmnStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static DiagramElement createDiagramElement(String stencilId) {
        CmmnStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (DiagramElement) CmmnDiFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static TCmmnElement createElement(String stencilId) {
        CmmnStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        TCmmnElement elt = (TCmmnElement) Cmmn1Factory.eINSTANCE.create(stencil.type);
        if (elt instanceof TPlanItemDefinition) {
            if (stencilId.startsWith("Discretionary")) {
                TDiscretionaryItem di = Cmmn1Factory.eINSTANCE.createTDiscretionaryItem();
                di.setDefinitionRef((TPlanItemDefinition) elt);
                elt = di;
            } else {
                TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
                pi.setDefinitionRef((TPlanItemDefinition) elt);
                elt = pi;
            }
        } else if (elt instanceof TCaseFileItem) {
            ((TCaseFileItem) elt).setDefinitionRef(Cmmn1Factory.eINSTANCE.createTCaseFileItemDefinition());
        }
        return elt;
    }

    public static CmmnStencil findStencilById(String stencilId) {
        CmmnStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static CmmnStencil findStencilByElement(EObject me, DiagramElement de) {
        CmmnStencil[] possibilities = null;
        if (me instanceof TPlanItem) {
            me = ((TPlanItem) me).getDefinitionRef();
            possibilities = PLAN_ITEMS;
        } else if (me instanceof TDiscretionaryItem) {
            me = ((TDiscretionaryItem) me).getDefinitionRef();
            possibilities = DISCRETIONARY_ITEMS;
        } else if (me instanceof TSentry) {
            throw new IllegalArgumentException("Sentries do not have consistent stencilIds");
        } else if (de instanceof Edge) {
            Edge edge = (Edge) de;
            if (edge.getSource().getModelElement() instanceof TCaseFileItem && edge.getTarget().getModelElement() instanceof TCaseFileItem) {
                TCaseFileItem source = (TCaseFileItem) edge.getSource().getModelElement();
                TCaseFileItem target = (TCaseFileItem) edge.getTarget().getModelElement();
                if (source.getChildren() != null && source.getChildren().getCaseFileItem().contains(target)) {
                    return CASE_FILE_ITEM_CHILD;
                } else if (source.getTargetRefs().contains(target)) {
                    return CASE_FILE_ITEM_TARGET;
                }
            }
            if (me instanceof TPlanItemOnPart) {
                TPlanItemDefinition definitionRef = ((TPlanItemOnPart) me).getSourceRef().getDefinitionRef();
                if (definitionRef instanceof TEvent || definitionRef instanceof TMilestone) {
                    return CmmnStencil.EVENT_ON_PART;
                } else {
                    return PLAN_ITEM_ON_PART;
                }
            } else if (me instanceof TPlanItemStartTrigger) {
                TPlanItemDefinition definitionRef = ((TPlanItemStartTrigger) me).getSourceRef().getDefinitionRef();
                if (definitionRef instanceof TEvent || definitionRef instanceof TMilestone) {
                    return CmmnStencil.EVENT_START_TRIGGER;
                } else {
                    return CmmnStencil.PLAN_ITEM_START_TRIGGER;
                }

            }
            possibilities = DIRECT_ITEMS;
        } else {
            possibilities = DIRECT_ITEMS;
        }
        if (possibilities != null) {
            for (CmmnStencil cmmnStencil : possibilities) {
                if (cmmnStencil.type.isSuperTypeOf(me.eClass())) {
                    return cmmnStencil;
                }
            }
        }
        return null;
    }

    public static CmmnStencil[] DISCRETIONARY_ITEMS = new CmmnStencil[] { DISCRETIONARY_CASE_TASK, DISCRETIONARY_HUMAN_TASK, DISCRETIONARY_PROCESS_TASK,
            DISCRETIONARY_STAGE };
    public static CmmnStencil[] PLAN_ITEMS = new CmmnStencil[] { CASE_TASK, HUMAN_TASK, PROCESS_TASK, STAGE, MILESTONE, USER_EVENT, TIMER_EVENT };
    public static CmmnStencil[] DIRECT_ITEMS = new CmmnStencil[] { CASE, CMMN_DIAGRAM, CASE_FILE_ITEM_ON_PART, CASE_FILE_ITEM, PROPERTY,
            CASE_FILE_ITEM_START_TRIGGER };
}
