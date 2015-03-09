package org.jbpm.designer.cmmn1.impl;

import java.util.ArrayList;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.jbpmext.JbpmextPackage;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.DocumentRoot;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemOnPart;
import org.omg.cmmn.TCaseFileItemStartTrigger;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TCmmnElement;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TEvent;
import org.omg.cmmn.TExpression;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TMilestone;
import org.omg.cmmn.TOnPart;
import org.omg.cmmn.TParameter;
import org.omg.cmmn.TParameterMapping;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemOnPart;
import org.omg.cmmn.TPlanItemStartTrigger;
import org.omg.cmmn.TProcess;
import org.omg.cmmn.TProcessParameter;
import org.omg.cmmn.TProcessTask;
import org.omg.cmmn.TProperty;
import org.omg.cmmn.TRole;
import org.omg.cmmn.TSentry;
import org.omg.cmmn.TStage;
import org.omg.cmmn.TStartTrigger;
import org.omg.cmmn.TTimerEvent;
import org.omg.cmmn.TUserEvent;
import org.omg.cmmn.util.CMMNSwitch;
import org.omg.cmmn.util.ImportHelper;
import org.omg.dd.di.DiagramElement;

public class CmmnJsonToEmfHelper extends CMMNSwitch<Object> implements JsonToEmfHelper {
    private ShapeMap shapeMap;
    protected Shape sourceShape;

    private LinkedStencil currentStencil;

    public CmmnJsonToEmfHelper(ShapeMap resource) {
        this.shapeMap = resource;
    }
    @Override
    public DiagramElement createElements(Shape shape) {
        DiagramElement de = CmmnStencil.createDiagramElement(shape.getStencilId());
        TCmmnElement ce = CmmnStencil.createElement(shape.getStencilId());
        if (de instanceof CMMNShape) {
            ((CMMNShape) de).setCmmnElement((TCmmnElement) ce);
        } else if (de instanceof CMMNEdge) {
            ((CMMNEdge) de).setCmmnElement((TCmmnElement) ce);
        }
        de.setLocalStyle(CMMNDIFactory.eINSTANCE.createCMMNStyle());
        return de;
    }
    private EObject getModelElement(String id) {
        return shapeMap.getModelElement(id);
    }

    private DiagramElement getDiagramElement(String id) {
        return shapeMap.getDiagramElement(id);
    }

    @Override
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(getModelElement(sourceShape.getResourceId()));
    }

    @Override
    public Object caseTDefinitions(TDefinitions object) {
        for (Shape shape : sourceShape.getChildShapes()) {
            if (shape.getStencilId().equals(CmmnStencil.CASE_DIAGRAM.getStencilId())) {
                object.getCase().add((TCase) getModelElement(shape.getResourceId()));
            }
        }
        return super.caseTDefinitions(object);
    }

    @Override
    public Object caseTCase(TCase object) {
        TStage stage = object.getCasePlanModel();
        if (stage == null) {
            object.setCasePlanModel(stage = CMMNFactory.eINSTANCE.createTStage());
        }
        if (object.getCaseFileModel() == null) {
            object.setCaseFileModel(CMMNFactory.eINSTANCE.createTCaseFile());
        }
        for (Shape shape : sourceShape.getChildShapes()) {
            if (shape.getStencilId().equals(CmmnStencil.CASE_FILE_ITEM.getStencilId())) {
                object.getCaseFileModel().getCaseFileItem().add((TCaseFileItem) getModelElement(shape.getResourceId()));
            } else {
                processPlanItemInStage(stage, shape);
            }
        }
        String caseRoles = sourceShape.getProperty("caseroles");
        if (caseRoles != null && caseRoles.trim().length() > 0) {
            for (String string : caseRoles.split(",")) {
                TRole role = CMMNFactory.eINSTANCE.createTRole();
                role.setName(string);
                role.setId(string);
                object.getCaseRoles().add(role);
            }
        }
        this.addTaskParameters(object, object.getInput(), "inputs", null, null);
        this.addTaskParameters(object, object.getOutput(), "outputs", null, null);
        return super.caseTCase(object);
    }

    @Override
    public Object caseTStage(TStage object) {
        for (Shape shape : sourceShape.getChildShapes()) {
            processPlanItemInStage(object, shape);
        }
        return super.caseTStage(object);
    }

    private void processPlanItemInStage(TStage stage, Shape shape) {
        CmmnStencil s = CmmnStencil.findStencilById(shape.getStencilId());
        if (s.getType() != null && CMMNPackage.eINSTANCE.getTPlanItemDefinition().isSuperTypeOf(s.getType())) {
            if (s.getStencilId().startsWith("Discretionary")) {
                if (stage.getPlanningTable() == null) {
                    stage.setPlanningTable(CMMNFactory.eINSTANCE.createTPlanningTable());
                }
                TDiscretionaryItem di = (TDiscretionaryItem) getModelElement(shape.getResourceId());
                stage.getPlanningTable().getTableItem().add(di);
                getCasePlanModel(stage).getPlanItemDefinition().add(di.getDefinitionRef());
                // TODO authorizedRoles
                // TODO applicabilityRules
            } else {
                TPlanItem pi = (TPlanItem) getModelElement(shape.getResourceId());
                stage.getPlanItem().add(pi);
                getCasePlanModel(stage).getPlanItemDefinition().add(pi.getDefinitionRef());
            }
        }
    }

    @Override
    public Object caseTCaseFileItem(TCaseFileItem object) {
        getDefinitions().getCaseFileItemDefinition().add(object.getDefinitionRef());
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            if (shape.getStencilId().equals(CmmnStencil.CASE_FILE_ITEM_CHILD.getStencilId())) {
                if (object.getChildren() == null) {
                    object.setChildren(CMMNFactory.eINSTANCE.createTChildren());
                }
                if (shape.getOutgoing().size() == 1) {
                    object.getChildren().getCaseFileItem().add((TCaseFileItem) getModelElement(shape.getOutgoing().get(0).getResourceId()));
                } else {
                    throw new IllegalStateException("CaseFileItemChild edge must have target");
                }
            } else if (shape.getStencilId().equals(CmmnStencil.CASE_FILE_ITEM_TARGET.getStencilId())) {
                if (shape.getOutgoing().size() == 1) {
                    object.getTargetRefs().add((TCaseFileItem) getModelElement(shape.getOutgoing().get(0).getResourceId()));
                } else {
                    throw new IllegalStateException("CaseFileItemTarget edge must have target");
                }
            } else if (shape.getStencilId().equals(CmmnStencil.CASE_FILE_ITEM_ON_PART.getStencilId())) {
                TCaseFileItemOnPart onPart = (TCaseFileItemOnPart) shapeMap.getModelElement(sr.getResourceId());
                onPart.setSourceRef(object);
            } else if (shape.getStencilId().equals(CmmnStencil.CASE_FILE_ITEM_START_TRIGGER.getStencilId())) {
                TCaseFileItemStartTrigger startTrigger = (TCaseFileItemStartTrigger) this.shapeMap.getModelElement(sr.getResourceId());
                startTrigger.setSourceRef(object);
            }
        }
        for (Shape shape : sourceShape.getChildShapes()) {
            if (shape.getStencilId().equals(CmmnStencil.PROPERTY.getStencilId())) {
                object.getDefinitionRef().getProperty().add((TProperty) getModelElement(shape.getResourceId()));
            }
        }
        return super.caseTCaseFileItem(object);
    }

    private TDefinitions getDefinitions() {
        return ImportHelper.getDefinitions(shapeMap.getResource());
    }

    @Override
    public Object caseTCaseTask(TCaseTask object) {
        String calledCase = sourceShape.getProperty("calledcase");
        if (calledCase != null && calledCase.contains("|")) {
            String[] split = calledCase.split("\\|");
            String caseId = split[0];
            URI uri = URI.createPlatformResourceURI(split[1], true);
            Resource res = object.eResource().getResourceSet().getResource(uri, true);
            // TODO optimise this
            EcoreUtil.resolveAll(res);
            object.setCaseRef((TCase) res.getEObject(caseId));
        }
        addTaskParameters(object, object.getInputs(), "input", object.getCaseRef() == null ? null : object.getCaseRef().getInput(),
                object.getParameterMapping());
        addTaskParameters(object, object.getOutputs(), "output", object.getCaseRef() == null ? null : object.getCaseRef().getOutput(),
                object.getParameterMapping());
        return super.caseTCaseTask(object);
    }

    @Override
    public Object caseTHumanTask(THumanTask object) {
        String performerName = sourceShape.getProperty("performer");
        if (performerName != null) {
            TCase theCase = (TCase) getCasePlanModel(object).eContainer();
            TRole found = null;
            for (TRole r : theCase.getCaseRoles()) {
                if (r.getName().equals(performerName)) {
                    found = r;
                    break;
                }
            }
            object.setPerformerRef(found);
        }
        addTaskParameters(object, object.getInputs(), "input", null, null);
        addTaskParameters(object, object.getOutputs(), "output", null, null);
        return super.caseTHumanTask(object);
    }

    private void addTaskParameters(TCmmnElement object, EList<TCaseParameter> list, String paramListName, EList<? extends TParameter> mappedParameterList,
            EList<TParameterMapping> parameterMappings) {
        if (sourceShape.getProperty(paramListName) != null) {
            try {
                ObjectMapper om = new ObjectMapper();
                om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
                CaseParametersJson params = om.readValue(sourceShape.getProperty(paramListName), CaseParametersJson.class);
                for (CaseParameterJson cp : params.getParameters()) {
                    TCaseParameter p = CMMNFactory.eINSTANCE.createTCaseParameter();
                    p.setName(cp.getName());
                    p.setId(cp.getId());
                    String name = cp.getBinding();
                    if (name != null) {
                        TCase theCase = getCase(object);
                        EList<TCaseFileItem> caseFileItem = theCase.getCaseFileModel().getCaseFileItem();
                        TCaseFileItem found = findCaseFileItem(name, caseFileItem);
                        p.setBindingRef(found);
                    }
                    if (cp.getBindingRefinement() != null) {
                        TExpression e = CMMNFactory.eINSTANCE.createTExpression();
                        e.setBody(cp.getBindingRefinement());
                        e.setLanguage(cp.getBindingRefinementLanguage());
                        p.setBindingRefinement(e);
                    }
                    if (cp.getMappedParameter() != null && cp.getMappedParameter().length() > 0) {
                        TParameterMapping mapping = CMMNFactory.eINSTANCE.createTParameterMapping();
                        if (paramListName.contains("in")) {
                            mapping.setSourceRef(p);
                            mapping.setTargetRef(findParameter(cp.getMappedParameter(), mappedParameterList));
                        } else {
                            mapping.setSourceRef(findParameter(cp.getMappedParameter(), mappedParameterList));
                            mapping.setTargetRef(p);
                        }
                        parameterMappings.add(mapping);
                    }
                    list.add(p);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private TParameter findParameter(String mappedParameter, EList<? extends TParameter> mappedParameterList) {
        for (TParameter p : mappedParameterList) {
            if (p.getName().equals(mappedParameter)) {
                return p;
            }
        }
        return null;
    }

    private TCase getCase(TCmmnElement object) {
        if (object instanceof TCase) {
            return (TCase) object;
        }
        return (TCase) getCasePlanModel(object).eContainer();
    }

    private TCaseFileItem findCaseFileItem(String name, EList<TCaseFileItem> caseFileItem) {
        TCaseFileItem found = null;
        for (TCaseFileItem cfi : caseFileItem) {
            if (cfi.getName().equals(name)) {
                found = cfi;
                break;
            } else {
                if (cfi.getChildren() != null) {
                    found = findCaseFileItem(name, cfi.getChildren().getCaseFileItem());
                    if (found != null) {
                        break;
                    }
                }
            }
        }
        return found;
    }

    private static boolean isEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }

    @Override
    public Object caseTProcessTask(TProcessTask object) {
        String calledCase = sourceShape.getProperty("calledprocess");
        if (calledCase != null && calledCase.contains("|")) {
            TDefinitions td = (TDefinitions) getCase(object).eContainer();
            TProcess process = syncProcessInDefinitions(object, calledCase, td);
            object.setProcessRef(process);
        }
        addTaskParameters(object, object.getInputs(), "input", object.getProcessRef() == null ? null : object.getProcessRef().getInput(),
                object.getParameterMapping());
        addTaskParameters(object, object.getOutputs(), "output", object.getProcessRef() == null ? null : object.getProcessRef().getOutput(),
                object.getParameterMapping());
        return super.caseTProcessTask(object);
    }

    public static TProcess syncProcessInDefinitions(TProcessTask object, String calledProcessString, TDefinitions td) {
        object.eResource().getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("bpmn2", new Bpmn2ResourceFactoryImpl());
        String[] split = calledProcessString.split("\\|");
        String processId = split[0];
        URI uri = URI.createPlatformResourceURI(split[1], true);
        Resource res = object.eResource().getResourceSet().getResource(uri, true);
        // TODO optimise this
        EcoreUtil.resolveAll(res);
        Process calledProcess = (Process) res.getEObject(processId);
        TProcess process = (TProcess) object.eResource().getEObject(processId);
        if (process == null) {
            process = CMMNFactory.eINSTANCE.createTProcess();
            process.setId(processId);
            td.getProcess().add(process);
        }
        // ExtendedMetaData metadata = ExtendedMetaData.INSTANCE;
        //
        // EAttributeImpl processUriAttr = (EAttributeImpl)
        // metadata.demandFeature(JbpmextPackage.eNS_URI, "processURI", false,
        // false);
        process.getAnyAttribute().set(JbpmextPackage.eINSTANCE.getDocumentRoot_ProcessURI(), uri.toString());
        syncParameters(object, calledProcess, process.getInput());
        syncParameters(object, calledProcess, process.getOutput());
        process.setName(isEmpty(process.getName()) ? process.getId() : process.getName());
        return process;
    }

    private static void syncParameters(TProcessTask object, Process calledProcess, EList<TProcessParameter> input) {
        for (Property property : calledProcess.getProperties()) {
            String parameterId = calledProcess.getId() + "." + (isEmpty(property.getName()) ? property.getId() : property.getName());
            TProcessParameter parameter = (TProcessParameter) object.eResource().getEObject(parameterId);
            if (parameter == null) {
                parameter = CMMNFactory.eINSTANCE.createTProcessParameter();
                parameter.setId(parameterId);
                input.add(parameter);
            }
            parameter.setName(isEmpty(property.getName()) ? property.getId() : property.getName());
        }
        for (TProcessParameter p : new ArrayList<TProcessParameter>(input)) {
            if (!isParameterPresentInProcess(calledProcess, p)) {
                input.remove(p);
            }
        }
    }

    private static boolean isParameterPresentInProcess(Process calledProcess, TProcessParameter p) {
        boolean found = false;
        for (Property property : calledProcess.getProperties()) {
            String parameterId = calledProcess.getId() + "." + (isEmpty(property.getName()) ? property.getId() : property.getName());
            if (p.getId().equals(parameterId)) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public Object caseTTimerEvent(TTimerEvent object) {
        return super.caseTTimerEvent(object);
    }

    @Override
    public Object caseTEvent(TEvent object) {
        return super.caseTEvent(object);
    }

    @Override
    public Object caseTUserEvent(TUserEvent object) {
        return super.caseTUserEvent(object);
    }

    @Override
    public Object caseTPlanItemControl(TPlanItemControl object) {
        return super.caseTPlanItemControl(object);
    }

    @Override
    public Object caseTMilestone(TMilestone object) {
        return super.caseTMilestone(object);
    }

    /***
     * @see CmmnStencil#createElement(String) for creation of PlanItem and its
     *      Definition
     */
    @Override
    public Object caseTPlanItem(TPlanItem object) {
        doSwitch(object.getDefinitionRef());
        TStage stage = getNearestStage(object);
        addSentries(stage, object.getEntryCriteriaRefs(), object.getExitCriteriaRefs());
        object.getDefinitionRef().setName(object.getName());
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            if (shape.getStencilId().equals(CmmnStencil.PLAN_ITEM_ON_PART.getStencilId())
                    || shape.getStencilId().equals(CmmnStencil.EVENT_ON_PART.getStencilId())) {
                TPlanItemOnPart onPart = (TPlanItemOnPart) this.shapeMap.getModelElement(sr.getResourceId());
                onPart.setSourceRef(object);
            } else if (shape.getStencilId().equals(CmmnStencil.PLAN_ITEM_START_TRIGGER.getStencilId())
                    || shape.getStencilId().equals(CmmnStencil.EVENT_START_TRIGGER.getStencilId())) {
                TPlanItemStartTrigger startTrigger = (TPlanItemStartTrigger) this.shapeMap.getModelElement(sr.getResourceId());
                startTrigger.setSourceRef(object);
            }
        }

        return super.caseTPlanItem(object);
    }

    private void addSentries(TStage stage, EList<TSentry> entryCriteriaRefs, EList<TSentry> exitCriteriaRefs) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = this.shapeMap.get(sr.getResourceId());
            EObject modelElement = getModelElement(shape.getResourceId());
            if (modelElement instanceof TSentry) {
                TSentry sentry = (TSentry) modelElement;
                stage.getSentry().add(sentry);
                if (shape.getStencilId().equals(CmmnStencil.ENTRY_SENTRY.getStencilId())) {
                    entryCriteriaRefs.add(sentry);
                } else if (shape.getStencilId().equals(CmmnStencil.EXIT_SENTRY.getStencilId())) {
                    exitCriteriaRefs.add(sentry);
                }
            }
        }
    }

    private TStage getNearestStage(TCmmnElement object) {
        EObject container = object.eContainer();
        if (container instanceof TStage) {
            return (TStage) container;
        } else if (container instanceof TCmmnElement) {
            return getNearestStage((TCmmnElement) container);
        }
        return null;
    }

    private TStage getCasePlanModel(TCmmnElement object) {
        EObject container = object.eContainer();
        if (container instanceof TCase) {
            return ((TCase) container).getCasePlanModel();
        } else if (container instanceof TCmmnElement) {
            return getCasePlanModel((TCmmnElement) container);
        }
        return null;
    }

    @Override
    public Object caseTDiscretionaryItem(TDiscretionaryItem object) {
        doSwitch(object.getDefinitionRef());
        TStage stage = getNearestStage(object);
        addSentries(stage, object.getEntryCriteriaRefs(), object.getExitCriteriaRefs());
        return super.caseTDiscretionaryItem(object);
    }

    @Override
    public Object caseTSentry(TSentry object) {

        return super.caseTSentry(object);
    }

    @Override
    public Object caseTCaseFileItemOnPart(TCaseFileItemOnPart object) {
        addOnPartToSentry(object);
        return super.caseTCaseFileItemOnPart(object);
    }

    @Override
    public Object caseTPlanItemOnPart(TPlanItemOnPart object) {
        addOnPartToSentry(object);
        return super.caseTPlanItemOnPart(object);
    }

    private void addOnPartToSentry(TOnPart onPart) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            if (shape.getStencilId().equals(CmmnStencil.ENTRY_SENTRY.getStencilId())) {
                TSentry s = (TSentry) getModelElement(shape.getResourceId());
                s.getOnPart().add(onPart);
            }
        }
    }

    @Override
    public Object caseTCaseFileItemStartTrigger(TCaseFileItemStartTrigger object) {
        setStartTriggerOnTimerEvent(object);
        return super.caseTCaseFileItemStartTrigger(object);
    }

    private void setStartTriggerOnTimerEvent(TStartTrigger startTrigger) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            if (shape.getStencilId().equals(CmmnStencil.TIMER_EVENT.getStencilId())) {
                TTimerEvent s = (TTimerEvent) ((TPlanItem) getModelElement(shape.getResourceId())).getDefinitionRef();
                s.setTimerStart(startTrigger);
            }
        }
    }

    @Override
    public Object caseTPlanItemStartTrigger(TPlanItemStartTrigger object) {
        setStartTriggerOnTimerEvent(object);
        return super.caseTPlanItemStartTrigger(object);
    }

    public CMMNDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        CMMNDiagram cmmnDiagram = CMMNDIFactory.eINSTANCE.createCMMNDiagram();
        cmmnDiagram.setLocalStyle(CMMNDIFactory.eINSTANCE.createCMMNStyle());
        TDefinitions def = CMMNFactory.eINSTANCE.createTDefinitions();
        TCase theCase = CMMNFactory.eINSTANCE.createTCase();
        def.getCase().add(theCase);
        theCase.setId(json.getResourceId());
        cmmnDiagram.setCmmnElement(theCase);
        DocumentRoot root = CMMNFactory.eINSTANCE.createDocumentRoot();
        root.setDefinitions(def);
        result.getContents().add(root);
        def.getDiagram().add(cmmnDiagram);
        return cmmnDiagram;
    }

    public void setupDiagramElement(EObject el, DiagramElement de) {
        if (de instanceof CMMNShape) {
            ((CMMNShape) de).setCmmnElement((TCmmnElement) el);
            // ((CMMNShape) de).setCMMNLabel(label =
            // CMMNDIFactory.eINSTANCE.createCMMNLabel());
        } else if (de instanceof CMMNEdge) {
            ((CMMNEdge) de).setCmmnElement((TCmmnElement) el);
            // ((CMMNEdge) de).setCMMNLabel(label =
            // CMMNDIFactory.eINSTANCE.createCMMNLabel());
        }
    }

    @Override
    public EObject create(EClass eType) {
        return CMMNFactory.eINSTANCE.create(eType);
    }

}
