package org.jbpm.designer.cmmn1.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCmmnElement;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TEvent;
import org.omg.cmmn.TMilestone;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemDefinition;
import org.omg.cmmn.TPlanItemOnPart;
import org.omg.cmmn.TPlanItemStartTrigger;
import org.omg.cmmn.TSentry;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;

public enum CmmnStencil implements StencilInfo {
    CASE_DIAGRAM(CMMNPackage.eINSTANCE.getTCase(), CMMNDIPackage.eINSTANCE.getCMMNDiagram(), "CaseDiagram"),
    HUMAN_TASK(CMMNPackage.eINSTANCE.getTHumanTask(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "HumanTask1"),
    DISCRETIONARY_HUMAN_TASK(CMMNPackage.eINSTANCE.getTHumanTask(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "DiscretionaryHumanTask1"),
    CASE_TASK(CMMNPackage.eINSTANCE.getTCaseTask(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "CaseTask1"),
    DISCRETIONARY_CASE_TASK(CMMNPackage.eINSTANCE.getTCaseTask(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "DiscretionaryCaseTask1"),
    PROCESS_TASK(CMMNPackage.eINSTANCE.getTProcessTask(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "ProcessTask1"),
    DISCRETIONARY_PROCESS_TASK(CMMNPackage.eINSTANCE.getTProcessTask(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "DiscretionaryProcessTask1"),
    STAGE(CMMNPackage.eINSTANCE.getTStage(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "Stage"),
    DISCRETIONARY_STAGE(CMMNPackage.eINSTANCE.getTStage(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "DiscretionaryStage"),
    MILESTONE(CMMNPackage.eINSTANCE.getTMilestone(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "Milestone"),
    USER_EVENT(CMMNPackage.eINSTANCE.getTUserEvent(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "UserEvent"),
    TIMER_EVENT(CMMNPackage.eINSTANCE.getTTimerEvent(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "TimerEvent"),
    CASE_FILE_ITEM_START_TRIGGER(CMMNPackage.eINSTANCE.getTCaseFileItemStartTrigger(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemStartTrigger"),
    PLAN_ITEM_START_TRIGGER(CMMNPackage.eINSTANCE.getTPlanItemStartTrigger(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "PlanItemStartTrigger"),
    EVENT_START_TRIGGER(CMMNPackage.eINSTANCE.getTPlanItemStartTrigger(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "EventStartTrigger"),
    ENTRY_SENTRY(CMMNPackage.eINSTANCE.getTSentry(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "EntrySentry"),
    EXIT_SENTRY(CMMNPackage.eINSTANCE.getTSentry(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "ExitSentry"),
    CASE_FILE_ITEM(CMMNPackage.eINSTANCE.getTCaseFileItem(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "CaseFileItem"),
    PROPERTY(CMMNPackage.eINSTANCE.getTProperty(), CMMNDIPackage.eINSTANCE.getCMMNShape(), "Property"),
    CASE_FILE_ITEM_ON_PART(CMMNPackage.eINSTANCE.getTCaseFileItemOnPart(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemOnPart"),
    PLAN_ITEM_ON_PART(CMMNPackage.eINSTANCE.getTPlanItemOnPart(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "PlanItemOnPart"),
    EVENT_ON_PART(CMMNPackage.eINSTANCE.getTPlanItemOnPart(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "EventOnPart"),
    CASE_FILE_ITEM_CHILD(CMMNPackage.eINSTANCE.getTCaseFileItem_Children(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemChild"),
    CASE_FILE_ITEM_TARGET(CMMNPackage.eINSTANCE.getTCaseFileItem_TargetRefs(), CMMNDIPackage.eINSTANCE.getCMMNEdge(), "CaseFileItemTarget"), ;
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
        return (DiagramElement) CMMNDIFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static TCmmnElement createElement(String stencilId) {
        CmmnStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        TCmmnElement elt = (TCmmnElement) CMMNFactory.eINSTANCE.create(stencil.type);
        if (elt instanceof TPlanItemDefinition) {
            if (stencilId.startsWith("Discretionary")) {
                TDiscretionaryItem di = CMMNFactory.eINSTANCE.createTDiscretionaryItem();
                di.setDefinitionRef((TPlanItemDefinition) elt);
                elt = di;
            } else {
                TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
                pi.setDefinitionRef((TPlanItemDefinition) elt);
                elt = pi;
            }
        } else if (elt instanceof TCaseFileItem) {
            ((TCaseFileItem) elt).setDefinitionRef(CMMNFactory.eINSTANCE.createTCaseFileItemDefinition());
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
        } else if (de instanceof CMMNEdge) {
            CMMNEdge edge = (CMMNEdge) de;
            if (edge.getSourceShape().getCmmnElement() instanceof TCaseFileItem && edge.getTargetShape().getCmmnElement() instanceof TCaseFileItem) {
                TCaseFileItem source = (TCaseFileItem) edge.getSourceShape().getCmmnElement();
                TCaseFileItem target = (TCaseFileItem) edge.getTargetShape().getCmmnElement();
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
    public static CmmnStencil[] DIRECT_ITEMS = new CmmnStencil[] { CASE_DIAGRAM, CASE_FILE_ITEM_ON_PART, CASE_FILE_ITEM, PROPERTY,
            CASE_FILE_ITEM_START_TRIGGER };
}
