package org.jbpm.designer.cmmn;

import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.diagram.Bounds;
import org.jbpm.designer.extensions.diagram.Point;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemDefinition;
import org.omg.cmmn.TCaseFileItemOnPart;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TCmmnElement;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.TEvent;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TImport;
import org.omg.cmmn.TMilestone;
import org.omg.cmmn.TParameter;
import org.omg.cmmn.TParameterMapping;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanItemControl;
import org.omg.cmmn.TPlanItemOnPart;
import org.omg.cmmn.TProcessTask;
import org.omg.cmmn.TSentry;
import org.omg.cmmn.TStage;
import org.omg.cmmn.TTimerEvent;
import org.omg.cmmn.TUserEvent;
import org.omg.cmmn.util.CMMNSwitch;
import org.omg.cmmn.util.ImportHelper;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;

public class CmmnEmfToJsonHelper extends CMMNSwitch<Object> implements EmfToJsonHelper {
    protected Shape targetShape;
    private ShapeMap shapeMap;
    private Map<TSentry, TCmmnElement> sentryContainers = new HashMap<TSentry, TCmmnElement>();
    private Map<TCaseFileItemDefinition, TCaseFileItem> caseFileItemMap = new HashMap<TCaseFileItemDefinition, TCaseFileItem>();

    public CmmnEmfToJsonHelper(ShapeMap resource) {
        super();
        this.shapeMap = resource;
        System.out.println("14234");
        System.out.println("14234");
    }

    @Override
    public void refineJsonShape(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }

    @Override
    public Diagram getDiagram() {
        return ImportHelper.getDefinitions(shapeMap.getResource()).getDiagram().get(0);
    }

    @Override
    public Object caseTCase(TCase object) {
        // Caseroles are converted generically into list of Ids
        this.addTaskParameters(object.getInput(), "inputs", null);
        this.addTaskParameters(object.getOutput(), "outputs", null);
        return super.caseTCase(object);
    }

    @Override
    public Object caseTCaseFileItem(TCaseFileItem object) {
        TCaseFileItemDefinition def = object.getDefinitionRef();
        if (def != null && def.getImportRef() != null && def.getStructureRef() != null) {
            URI uri = URI.createURI(def.getImportRef().getLocation());
            String location = toSimpleLocation(uri);
            targetShape.putProperty("caseFileItemStructureRef", def.getStructureRef().getLocalPart() + "|" + location);
        } else if (def != null && def.getStructureRef() != null) {
            // Legacy files - TODO remove
            URI uri = URI.createURI(def.getStructureRef().getNamespaceURI());
            try {
                Resource res = object.eResource().getResourceSet().getResource(uri, true);
                EObject eObject = res.getEObject(def.getStructureRef().getLocalPart());
                if (eObject != null) {
                    String location = toSimpleLocation(uri);
                    targetShape.putProperty("caseFileItemStructureRef", eObject.eGet(eObject.eClass().getEStructuralFeature("name")) + "|" + location);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return super.caseTCaseFileItem(object);
    }

    public String toSimpleLocation(URI uri) {
        String location = uri.isPlatform() ? uri.toPlatformString(true) : uri.toFileString();
        return location;
    }

    @Override
    public Object caseTCaseTask(TCaseTask object) {
        if (object.getCaseRef() != null) {
            TDefinitions defs = ImportHelper.getDefinitions(shapeMap.getResource());
            TImport imp = ImportHelper.findImportForNamespace(defs, object.getCaseRef().getNamespaceURI());
            String location = toSimpleLocation(URI.createURI(imp.getLocation()));
            targetShape.putProperty("caseRefQName", object.getCaseRef().getLocalPart() + "|" + location);
        }
        addTaskParameters(object.getInputs(), "input", object.getParameterMapping());
        addTaskParameters(object.getOutputs(), "output", object.getParameterMapping());
        return super.caseTCaseTask(object);
    }

    @Override
    public Object caseTHumanTask(THumanTask object) {
        if (object.getPerformerRef() != null) {
            targetShape.getProperties().put("performer", object.getPerformerRef().getName());
        }
        addTaskParameters(object.getInputs(), "input", null);
        addTaskParameters(object.getOutputs(), "output", null);
        return super.caseTHumanTask(object);
    }

    private void addTaskParameters(EList<TCaseParameter> parameterlist, String parameterListname, EList<TParameterMapping> mappings) {
        if (parameterlist.size() > 0) {
            try {
                String s = parametersToJson(parameterlist, mappings);
                targetShape.getProperties().put(parameterListname, s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String parametersToJson(EList<TCaseParameter> parameterlist, EList<TParameterMapping> mappings) {
        String s = "";
        try {
            CaseParametersJson params = new CaseParametersJson();
            params.setParameters(new ArrayList<CaseParameterJson>());
            for (TCaseParameter cp : parameterlist) {
                CaseParameterJson p = new CaseParameterJson();
                p.setName(cp.getName());
                p.setId(cp.getId());
                if (cp.getBindingRef() != null) {
                    p.setBinding(cp.getBindingRef().getName());
                }
                if (cp.getBindingRefinement() != null) {
                    p.setBindingRefinement(cp.getBindingRefinement().getBody());
                    p.setBindingRefinementLanguage(cp.getBindingRefinement().getLanguage());
                }
                if (mappings != null) {
                    for (TParameterMapping m : mappings) {
                        if (m.getSourceRef() == cp) {
                            p.setMappedParameter(m.getTargetRef().getName());
                            p.setExpectedType(getExpectedType(m.getTargetRef()));
                        } else if (m.getTargetRef() == cp) {
                            p.setMappedParameter(m.getSourceRef().getName());
                            p.setExpectedType(getExpectedType(m.getSourceRef()));
                        }
                    }
                }
                params.getParameters().add(p);
            }
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
            s = om.writeValueAsString(params);
        } catch (Exception e) {
            // TODO handle properly
            e.printStackTrace();
        }
        return s;
    }

    private static String getExpectedType(TParameter sourceRef) {
        if (sourceRef instanceof TCaseParameter) {
            TCaseFileItem bindingRef = ((TCaseParameter) sourceRef).getBindingRef();
            if(bindingRef!=null){
                return bindingRef.getName();
            }
        }
        return null;// we don't know
    }

    @Override
    public Object caseTProcessTask(TProcessTask object) {
        addTaskParameters(object.getInputs(), "input", object.getParameterMapping());
        addTaskParameters(object.getOutputs(), "output", object.getParameterMapping());
        if (object.getProcessRef() != null) {
            TDefinitions defs = ImportHelper.getDefinitions(shapeMap.getResource());
            TImport imp = ImportHelper.findImportForNamespace(defs, object.getProcessRef().getNamespaceURI());
            String location = toSimpleLocation(URI.createURI(imp.getLocation()));
            targetShape.putProperty("processRefQName", object.getProcessRef().getLocalPart() + "|" + location);
        }
        return super.caseTProcessTask(object);
    }

    @Override
    public Object caseTTimerEvent(TTimerEvent object) {
        return super.caseTTimerEvent(object);
    }

    @Override
    public Object caseTEvent(TEvent object) {
        addMidPointDocker();
        return super.caseTEvent(object);
    }

    private void addMidPointDocker() {
        Bounds bounds = this.targetShape.getBounds();
        double newX = (bounds.getUpperLeft().getX() + bounds.getLowerRight().getX()) / 2;
        double newY = (bounds.getUpperLeft().getY() + bounds.getLowerRight().getY()) / 2;
        this.targetShape.getDockers().add(new Point(newX, newY));
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

    @Override
    public Object caseTPlanItem(TPlanItem object) {
        doSwitch(object.getDefinitionRef());
        addSentries(object.getEntryCriteriaRefs());
        addSentries(object.getExitCriteriaRefs());
        return super.caseTPlanItem(object);
    }

    private void addSentries(EList<TSentry> entryCriteriaRefs) {
        // for (TSentry s : entryCriteriaRefs) {
        // DiagramElement de = getDiagramElement(s);
        // Shape out = this.getShape(de);
        // this.targetShape.addOutgoing(out);
        // Point upperLeft = out.getUpperLeft();
        // Point lowerRight = out.getLowerRight();
        // if (upperLeft != null && upperLeft.getX() != null && upperLeft.getY()
        // != null && lowerRight != null && lowerRight.getY() != null) {
        // double absoluteX = (upperLeft.getX() + lowerRight.getX()) / 2;
        // double absoluteY = (upperLeft.getY() + lowerRight.getY()) / 2;
        // out.getDockers().add(
        // new Point(absoluteX - targetShape.getBounds().getUpperLeft().getX(),
        // absoluteY - targetShape.getBounds().getUpperLeft().getY()));
        // }
        // }
    }

    //
    // private DiagramElement getDiagramElement(TSentry s) {
    // return shapeMap.getDiagramElement(s.getId());
    // }

    @Override
    public Object caseTDiscretionaryItem(TDiscretionaryItem object) {
        this.doSwitch(object.getDefinitionRef());
        this.doSwitch(object.getItemControl());
        addSentries(object.getEntryCriteriaRefs());
        addSentries(object.getExitCriteriaRefs());
        return super.caseTDiscretionaryItem(object);
    }

    @Override
    public Object caseTSentry(TSentry object) {
        Object result = super.caseTSentry(object);
        return result;
    }

    @Override
    public Object caseTCaseFileItemOnPart(TCaseFileItemOnPart object) {
        return super.caseTCaseFileItemOnPart(object);
    }

    @Override
    public Object caseTPlanItemOnPart(TPlanItemOnPart object) {
        if (object.getSentryRef() != null) {
            shapeMap.getShape(object.getSentryRef()).getOutgoing().add(new ShapeReference(object.getId()));
        }
        return super.caseTPlanItemOnPart(object);
    }

    // private Shape getShape(DiagramElement de) {
    // return this.shapeMap.getShape(de);
    // }

    @Override
    public void linkElements(DiagramElement diagramElement, Shape shape) {
        EObject modelElement = diagramElement.getModelElement().isEmpty() ? null : diagramElement.getModelElement().get(0);
        if (modelElement instanceof TDiscretionaryItem) {
            putSentries(modelElement, ((TDiscretionaryItem) modelElement).getEntryCriteriaRefs());
            putSentries(modelElement, ((TDiscretionaryItem) modelElement).getExitCriteriaRefs());
        } else if (modelElement instanceof TPlanItem) {
            TPlanItem pi = (TPlanItem) modelElement;
            putSentries(modelElement, pi.getEntryCriteriaRefs());
            putSentries(modelElement, pi.getExitCriteriaRefs());
            if (pi.getDefinitionRef() instanceof TStage) {
                putSentries(pi.getDefinitionRef(), ((TStage) pi.getDefinitionRef()).getExitCriteriaRefs());
            }
        } else if (modelElement instanceof TCase) {
            putSentries(modelElement, ((TCase) modelElement).getCasePlanModel().getExitCriteriaRefs());
        } else if (modelElement instanceof TCaseFileItem) {
            this.caseFileItemMap.put(((TCaseFileItem) modelElement).getDefinitionRef(), (TCaseFileItem) modelElement);
        }
    }

    private void putSentries(EObject modelElement, EList<TSentry> entryCriteriaRefs) {
        for (TSentry tSentry : entryCriteriaRefs) {
            this.sentryContainers.put(tSentry, (TCmmnElement) modelElement);
        }
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        if (me instanceof TSentry) {
            TCmmnElement container = this.sentryContainers.get(me);
            if (container instanceof TDiscretionaryItem && ((TDiscretionaryItem) container).getEntryCriteriaRefs().contains(me)) {
                return CmmnStencil.ENTRY_SENTRY;
            } else if (container instanceof TPlanItem) {
                if (((TPlanItem) container).getEntryCriteriaRefs().contains(me)) {
                    return CmmnStencil.ENTRY_SENTRY;
                } else {
                    return CmmnStencil.EXIT_SENTRY;
                }
            } else if (container instanceof TCase && ((TCase) container).getCasePlanModel().getExitCriteriaRefs().contains(me)) {
                return CmmnStencil.CONTAINER_EXIT_SENTRY;
            } else if (container instanceof TStage && ((TStage) container).getExitCriteriaRefs().contains(me)) {
                return CmmnStencil.CONTAINER_EXIT_SENTRY;
            } else {
                return CmmnStencil.EXIT_SENTRY;
            }
        }
        return CmmnStencil.findStencilByElement(me, de);
    }

    @Override
    public String convertToString(LinkedProperty property, Object val) {
        return null;
    }

    @Override
    public void preprocessResource() {
    }
}
