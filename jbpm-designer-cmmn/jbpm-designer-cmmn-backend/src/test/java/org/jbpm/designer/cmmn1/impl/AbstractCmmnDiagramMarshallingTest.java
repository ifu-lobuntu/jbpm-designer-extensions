package org.jbpm.designer.cmmn1.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.extensions.emf.util.GenericEcoreComparator;
import org.jbpm.designer.extensions.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.extensions.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.extensions.emf.util.TestUriHandler;
import org.junit.Before;
import org.junit.Test;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.DocumentRoot;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TCmmnElement;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TDiscretionaryItem;
import org.omg.cmmn.THumanTask;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.TPlanningTable;
import org.omg.cmmn.TProcessTask;
import org.omg.cmmn.TRole;
import org.omg.cmmn.TSentry;
import org.omg.cmmn.TStage;
import org.omg.cmmn.util.CMMNResourceFactoryImpl;
import org.omg.cmmn.util.CMMNResourceImpl;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.Point;
import org.omg.dd.di.DIFactory;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Style;

public class AbstractCmmnDiagramMarshallingTest {

    protected CmmnProfileImpl profile = new CmmnProfileImpl();{
        profile.setUriHandler(new TestUriHandler());
    }
    protected GenericEmfToJsonDiagramUnmarshaller unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile);
    protected GenericJsonToEmfDiagramMarshaller marshaller = new GenericJsonToEmfDiagramMarshaller(profile);
    protected CMMNResourceImpl inputResource;
    protected ResourceSet resourceSet;
    protected CMMNDiagram inputDiagram;
    protected TDefinitions inputDefinitions;
    protected Map<EObject, DiagramElement> elementDiagramElementMap = new HashMap<EObject, DiagramElement>();
    protected TCase tCase;
    protected TStage casePlanModel;

    public AbstractCmmnDiagramMarshallingTest() {
        super();
    }
    @Test
    public void test()throws Exception{
        assertOutputValid();
    }

    @Before
    public void setup() throws Exception {
        resourceSet=new ResourceSetImpl();
        profile.prepareResourceSet(resourceSet);
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        inputResource = (CMMNResourceImpl) resourceSet.createResource(URI.createURI("file:/dummy.cmmn"));
        inputDefinitions = CMMNFactory.eINSTANCE.createTDefinitions();
        DocumentRoot root = CMMNFactory.eINSTANCE.createDocumentRoot();
        root.setDefinitions(inputDefinitions);
        inputDiagram = CMMNDIFactory.eINSTANCE.createCMMNDiagram();
        inputDiagram.setLocalStyle(CMMNDIFactory.eINSTANCE.createCMMNStyle());
        inputDefinitions.getDiagram().add(inputDiagram);
        inputResource.getContents().add(root);
        profile.loadLinkedStencilSet("../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn1.0/cmmn1.0.json");
        this.tCase = createCase();
        inputDiagram.setCmmnElement(inputDefinitions);
        elementDiagramElementMap.put(inputDefinitions, inputDiagram);
        tCase.setCasePlanModel(CMMNFactory.eINSTANCE.createTStage());
        casePlanModel= tCase.getCasePlanModel();
        casePlanModel.setAutoComplete(true);
        tCase.setName("MyCase");
        addShapeFor(inputDefinitions, tCase);
    }

    private TCase createCase() {
        TCase tCase = CMMNFactory.eINSTANCE.createTCase();
        inputDefinitions.getCase().add(tCase);
        inputDefinitions.setTargetNamespace("http://asdf.com/");
        tCase.setCaseFileModel(CMMNFactory.eINSTANCE.createTCaseFile());
        return tCase;
    }
    protected TRole addRole(String name) {
        TRole role = CMMNFactory.eINSTANCE.createTRole();
        TCase theCase= (TCase) casePlanModel.eContainer();
        role.setName(name);
        role.setId(role.getName());
        theCase.getCaseRoles().add(role);
        return role;
    }


    protected void assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        XMLResource outputResource = marshaller.getResource(json, "");
        Set<EClassifier> ignore =new HashSet<EClassifier>();
        ignore.add(CMMNPackage.eINSTANCE.getTApplicabilityRule());
        new GenericEcoreComparator(inputResource, outputResource,ignore).validate();
    }

    protected String buildXmlString(CMMNResourceImpl resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        resource.save(writer, options);
        String string = writer.toString();
        return string;
    }

    protected void addEdge(TCmmnElement modelElement, TCmmnElement from, TCmmnElement to) {
        CMMNEdge edge = CMMNDIFactory.eINSTANCE.createCMMNEdge();
        CMMNShape fromShape = (CMMNShape) elementDiagramElementMap.get(from);
        edge.setSourceShape(fromShape);
        CMMNShape toShape = (CMMNShape) elementDiagramElementMap.get(to);
        edge.setTargetShape(toShape);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, fromShape);
        Point middle = DCFactory.eINSTANCE.createPoint();
        edge.getWaypoint().add(middle);
        middle.setX(50d);
        middle.setY(60d);
        edge.setLocalStyle(buildTestStyle());

        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, toShape);
        inputDiagram.getOwnedElement().add(edge);
        edge.setCmmnElement(modelElement);
    }

    protected TPlanItem addHumanTaskPlanItem(TCmmnElement parent, TStage stage) {
        THumanTask htpid = CMMNFactory.eINSTANCE.createTHumanTask();
        casePlanModel.getPlanItemDefinition().add(htpid);
        TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(htpid);
        stage.getPlanItem().add(pi);
        pi.setName("MyHumanTaskPlanItem");
        htpid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }
    protected TPlanItem addCaseTaskPlanItem(TCmmnElement parent,TStage stage) {
        TCaseTask ctpid = CMMNFactory.eINSTANCE.createTCaseTask();
        casePlanModel.getPlanItemDefinition().add(ctpid);
        TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(ctpid);
        stage.getPlanItem().add(pi);
        pi.setName("MyCaseTaskPlanItem");
        ctpid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }
    protected TPlanItem addProcessTaskPlanItem(TCmmnElement parent, TStage stage) {
        TProcessTask ctpid = CMMNFactory.eINSTANCE.createTProcessTask();
        casePlanModel.getPlanItemDefinition().add(ctpid);
        TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(ctpid);
        stage.getPlanItem().add(pi);
        pi.setName("MyProcessTaskPlanItem");
        ctpid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }

    protected TPlanItem addStagePlanItem(TCmmnElement parent, TStage stage) {
        TStage spid = CMMNFactory.eINSTANCE.createTStage();
        casePlanModel.getPlanItemDefinition().add(spid);
        TPlanItem pi = CMMNFactory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(spid);
        stage.getPlanItem().add(pi);
        pi.setName("MyStagePlanItem");
        spid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }

    protected TDiscretionaryItem addStageDiscretionaryItem(TCmmnElement parent, TStage stage) {
        TStage spid = CMMNFactory.eINSTANCE.createTStage();
        casePlanModel.getPlanItemDefinition().add(spid);
        TDiscretionaryItem di = CMMNFactory.eINSTANCE.createTDiscretionaryItem();
        di.setDefinitionRef(spid);
        if (stage.getPlanningTable() == null) {
            stage.setPlanningTable(CMMNFactory.eINSTANCE.createTPlanningTable());
        }
        stage.getPlanningTable().getTableItem().add(di);
        spid.setName("MyStageDiscretionaryItem");
        addShapeFor(parent, di);
        return di;
    }

    protected TDiscretionaryItem addHumanTaskDiscretionaryItem(TCmmnElement parent, TStage stage) {
        TPlanningTable planningTable = stage.getPlanningTable();
        if (planningTable == null) {
            stage.setPlanningTable(planningTable =CMMNFactory.eINSTANCE.createTPlanningTable());
        }
        return addDiscretionaryHumanTask(parent, planningTable);
    }
    protected TDiscretionaryItem addDiscretionaryHumanTask(TCmmnElement parent, TPlanningTable planningTable) {
        THumanTask htpid = CMMNFactory.eINSTANCE.createTHumanTask();
        casePlanModel.getPlanItemDefinition().add(htpid);
        TDiscretionaryItem di = CMMNFactory.eINSTANCE.createTDiscretionaryItem();
        di.setDefinitionRef(htpid);
        planningTable.getTableItem().add(di);
        htpid.setName("MyHumanTaskDiscretionaryItem");
        addShapeFor(parent, di);
        return di;
    }

    protected CMMNShape addShapeFor(EObject parentElement, TCmmnElement element, int... boundsInfo) {
        CMMNShape shape = CMMNDIFactory.eINSTANCE.createCMMNShape();
        DiagramElement parentDiagramElement = this.elementDiagramElementMap.get(parentElement);
        parentDiagramElement.getOwnedElement().add(shape);
        shape.setCmmnElement(element);
        shape.setBounds(DCFactory.eINSTANCE.createBounds());
        shape.setLocalStyle(buildTestStyle());
        Bounds bounds = shape.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10.0);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10d);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300d);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300d);
        this.elementDiagramElementMap.put(element, shape);
        return shape;
    }

    private Style buildTestStyle() {
        Style style = CMMNDIFactory.eINSTANCE.createCMMNStyle();
        style.setFillColor(buildTestColor());
        style.setStrokeColor(buildTestColor());
        style.setFontColor(buildTestColor());
        style.setFontSize(23d);
        return style;
    }

    private Color buildTestColor() {
        Color fillColor = DCFactory.eINSTANCE.createColor();
        fillColor.setRed(77);
        fillColor.setGreen(66);
        fillColor.setBlue(55);
        return fillColor;
    }
    protected TSentry addEntrySentry(String sentryName, TDiscretionaryItem htdi) {
        EList<TSentry> sentries = htdi.getEntryCriteriaRefs();
        return addSentry(sentryName, htdi, sentries);
    }
    protected TSentry addExitSentry(String sentryName, TStage stage, TCmmnElement shapeOwner) {
        TSentry sentry = CMMNFactory.eINSTANCE.createTSentry();
        sentry.setName(sentryName);
        stage.getSentry().add(sentry);
        stage.getExitCriteriaRefs().add(sentry);
        BoundariedShape stageShape = (BoundariedShape)this.elementDiagramElementMap.get(shapeOwner);
        stageShape.getBoundaryShapes().add(addShapeFor(((DiagramElement)stageShape.eContainer()).getModelElement().get(0),sentry));
        return sentry;
    }
    private TSentry addSentry(String sentryName, TCmmnElement htdi, EList<TSentry> sentries) {
        TSentry sentry = CMMNFactory.eINSTANCE.createTSentry();
        sentry.setName(sentryName);
        TCmmnElement stage=(TCmmnElement) htdi.eContainer();
        while(!(stage instanceof TStage)){
            stage=(TCmmnElement) stage.eContainer();
        }
        ((TStage)stage).getSentry().add(sentry);
        sentries.add(sentry);
        BoundariedShape taskShape = (BoundariedShape)this.elementDiagramElementMap.get(htdi);
        taskShape.getBoundaryShapes().add(addShapeFor(tCase,sentry));
        return sentry;
    }
    protected TSentry addExitSentry(String sentryName, TDiscretionaryItem htdi) {
        EList<TSentry> sentries = htdi.getExitCriteriaRefs();
        return addSentry(sentryName, htdi, sentries);
    }
    protected TSentry addExitSentry(String sentryName, TPlanItem htdi) {
        EList<TSentry> sentries = htdi.getExitCriteriaRefs();
        return addSentry(sentryName, htdi, sentries);
    }

}