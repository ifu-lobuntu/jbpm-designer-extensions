package org.jbpm.designer.cmmn1.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.cmmn1.Cmmn1Package;
import org.eclipse.cmmn1.DocumentRoot;
import org.eclipse.cmmn1.TCase;
import org.eclipse.cmmn1.TCaseTask;
import org.eclipse.cmmn1.TCmmnElement;
import org.eclipse.cmmn1.TDefinitions;
import org.eclipse.cmmn1.TDiscretionaryItem;
import org.eclipse.cmmn1.THumanTask;
import org.eclipse.cmmn1.TPlanItem;
import org.eclipse.cmmn1.TProcessTask;
import org.eclipse.cmmn1.TRole;
import org.eclipse.cmmn1.TStage;
import org.eclipse.cmmn1.util.Cmmn1ResourceFactoryImpl;
import org.eclipse.cmmn1.util.Cmmn1ResourceImpl;
import org.eclipse.cmmndi.CMMNDiagram;
import org.eclipse.cmmndi.CMMNEdge;
import org.eclipse.cmmndi.CMMNPlane;
import org.eclipse.cmmndi.CMMNShape;
import org.eclipse.cmmndi.CmmnDiFactory;
import org.eclipse.cmmndi.CmmnDiPackage;
import org.eclipse.dd.cmmn.dc.Bounds;
import org.eclipse.dd.cmmn.dc.DcFactory;
import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.dc.Point;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Shape;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.emf.util.GenericEcoreComparator;
import org.jbpm.designer.emf.util.GenericEmfToJsonDiagramUnmarshaller;
import org.jbpm.designer.emf.util.GenericJsonToEmfDiagramMarshaller;
import org.jbpm.designer.emf.util.TestUriHandler;
import org.junit.Before;

public class AbstractCmmnDiagramMarshallingTest {

    protected CmmnProfileImpl profile = new CmmnProfileImpl();{
        profile.setUriHandler(new TestUriHandler());
    }
    protected GenericEmfToJsonDiagramUnmarshaller unmarshaller = new GenericEmfToJsonDiagramUnmarshaller(profile);
    protected GenericJsonToEmfDiagramMarshaller marshaller = new GenericJsonToEmfDiagramMarshaller(profile);
    protected Cmmn1ResourceImpl inputResource;
    protected ResourceSet resourceSet;
    protected CMMNDiagram inputDiagram;
    protected TDefinitions inputDefinitions;
    protected Map<EObject, DiagramElement> elementDiagramElementMap = new HashMap<EObject, DiagramElement>();
    protected TCase tCase;
    private CMMNPlane plane;
    protected TStage casePlanModel;

    public AbstractCmmnDiagramMarshallingTest() {
        super();
    }

    @Before
    public void setup() throws Exception {
        resourceSet=new ResourceSetImpl();
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        uriHandlers.clear();
        uriHandlers.add(new TestUriHandler());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("cmmn",new Cmmn1ResourceFactoryImpl());
        resourceSet.getPackageRegistry().put(DiPackage.eNS_PREFIX, DiPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DcPackage.eNS_PREFIX, DcPackage.eINSTANCE);
        inputResource = (Cmmn1ResourceImpl) resourceSet.createResource(URI.createURI("file:/dummy.cmmn"));
        inputDefinitions = Cmmn1Factory.eINSTANCE.createTDefinitions();
        DocumentRoot root = Cmmn1Factory.eINSTANCE.createDocumentRoot();
        root.setDefinitions(inputDefinitions);
        inputDiagram = CmmnDiFactory.eINSTANCE.createCMMNDiagram();
        inputResource.getContents().add(root);
        inputDefinitions.getCMMNDiagram().add(inputDiagram);
        CMMNPlane casePlane = CmmnDiFactory.eINSTANCE.createCMMNPlane();
        inputDiagram.setCMMNPlane(casePlane);
        elementDiagramElementMap.put(inputDefinitions, casePlane);
        profile.loadLinkedStencilSet("../jbpm-designer-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn1.0/cmmn1.0.json");
        this.tCase = createCase();
        this.plane = createPlane();
        this.casePlanModel = createCasePlanModel();
    }

    private TStage createCasePlanModel() {
        TStage stage = tCase.getCasePlanModel();
        stage.setAutoComplete(true);
        tCase.setName("MyCase");
        addShapeFor(inputDefinitions,tCase);
        return stage;
    }

    protected TRole addRole(String name) {
        TRole role = Cmmn1Factory.eINSTANCE.createTRole();
        TCase theCase= (TCase) casePlanModel.eContainer();
        role.setName(name);
        role.setId(role.getName());
        theCase.getCaseRoles().add(role);
        return role;
    }

    private CMMNPlane createPlane() {
        CMMNPlane plane = inputDiagram.getCMMNPlane();
        plane.setCmmnElement(inputDefinitions);
        tCase.setCaseFileModel(Cmmn1Factory.eINSTANCE.createTCaseFile());
        tCase.setCasePlanModel(Cmmn1Factory.eINSTANCE.createTStage());
        return plane;
    }

    private TCase createCase() {
        TCase tCase = Cmmn1Factory.eINSTANCE.createTCase();
        inputDefinitions.getCase().add(tCase);
        inputDefinitions.setTargetNamespace("http://asdf.com/");
        return tCase;
    }

    protected void assertOutputValid() throws IOException, Exception {
        String xmlString = buildXmlString(inputResource);
        String json = unmarshaller.parseModel(xmlString, profile, "");
        // System.out.println(xmlString);
        // System.out.println(json);
        XMLResource outputResource = marshaller.getResource(json, "");
        // System.out.println(buildXmlString((Cmmn1ResourceImpl)
        // outputResource));
        new GenericEcoreComparator(inputResource, outputResource).validate();
    }

    protected String buildXmlString(Cmmn1ResourceImpl resource) throws IOException {
        StringWriter writer = new StringWriter();
        HashMap<String, Object> options = new HashMap<String, Object>();
        ExtendedMetaData emd = new BasicExtendedMetaData();
        emd.setQualified(Cmmn1Package.eINSTANCE, true);
        emd.setQualified(CmmnDiPackage.eINSTANCE, true);
        emd.setQualified(DiPackage.eINSTANCE, true);
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, emd);
        options.put(Cmmn1ResourceImpl.OPTION_SAVE_TYPE_INFORMATION, false);
        resource.save(writer, options);
        String string = writer.toString();
        return string;
    }

    protected void addEdge(TCmmnElement modelElement, TCmmnElement from, TCmmnElement to) {
        CMMNEdge edge = CmmnDiFactory.eINSTANCE.createCMMNEdge();
        Shape fromShape = (Shape) elementDiagramElementMap.get(from);
        edge.setSourceElement(fromShape);
        Shape toShape = (Shape) elementDiagramElementMap.get(to);
        edge.setTargetElement(toShape);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, fromShape);
        Point middle = DcFactory.eINSTANCE.createPoint();
        edge.getWaypoint().add(middle);
        middle.setX(50);
        middle.setY(60);
        GenericJsonToEmfDiagramMarshaller.addWaypointToCenterOf(edge, toShape);
        plane.getPlaneElement().add(edge);
        edge.setCmmnElement(modelElement);
    }

    protected TPlanItem addHumanTaskPlanItem(TCmmnElement parent, TStage stage) {
        THumanTask htpid = Cmmn1Factory.eINSTANCE.createTHumanTask();
        casePlanModel.getPlanItemDefinition().add(htpid);
        TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(htpid);
        stage.getPlanItem().add(pi);
        pi.setName("MyHumanTaskPlanItem");
        htpid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }
    protected TPlanItem addCaseTaskPlanItem(TCmmnElement parent,TStage stage) {
        TCaseTask ctpid = Cmmn1Factory.eINSTANCE.createTCaseTask();
        casePlanModel.getPlanItemDefinition().add(ctpid);
        TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(ctpid);
        stage.getPlanItem().add(pi);
        pi.setName("MyCaseTaskPlanItem");
        ctpid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }
    protected TPlanItem addProcessTaskPlanItem(TCmmnElement parent, TStage stage) {
        TProcessTask ctpid = Cmmn1Factory.eINSTANCE.createTProcessTask();
        casePlanModel.getPlanItemDefinition().add(ctpid);
        TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(ctpid);
        stage.getPlanItem().add(pi);
        pi.setName("MyProcessTaskPlanItem");
        ctpid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }

    protected TPlanItem addStagePlanItem(TCmmnElement parent, TStage stage) {
        TStage spid = Cmmn1Factory.eINSTANCE.createTStage();
        casePlanModel.getPlanItemDefinition().add(spid);
        TPlanItem pi = Cmmn1Factory.eINSTANCE.createTPlanItem();
        pi.setDefinitionRef(spid);
        stage.getPlanItem().add(pi);
        pi.setName("MyStagePlanItem");
        spid.setName(pi.getName());
        addShapeFor(parent, pi);
        return pi;
    }

    protected TDiscretionaryItem addStageDiscretionaryItem(TCmmnElement parent, TStage stage) {
        TStage spid = Cmmn1Factory.eINSTANCE.createTStage();
        casePlanModel.getPlanItemDefinition().add(spid);
        TDiscretionaryItem di = Cmmn1Factory.eINSTANCE.createTDiscretionaryItem();
        di.setDefinitionRef(spid);
        if (stage.getPlanningTable() == null) {
            stage.setPlanningTable(Cmmn1Factory.eINSTANCE.createTPlanningTable());
        }
        stage.getPlanningTable().getTableItem().add(di);
        spid.setName("MyStageDiscretionaryItem");
        addShapeFor(parent, di);
        return di;
    }

    protected TDiscretionaryItem addHumanTaskDiscretionaryItem(TCmmnElement parent, TStage stage) {
        THumanTask htpid = Cmmn1Factory.eINSTANCE.createTHumanTask();
        casePlanModel.getPlanItemDefinition().add(htpid);
        TDiscretionaryItem di = Cmmn1Factory.eINSTANCE.createTDiscretionaryItem();
        di.setDefinitionRef(htpid);
        if (stage.getPlanningTable() == null) {
            stage.setPlanningTable(Cmmn1Factory.eINSTANCE.createTPlanningTable());
        }
        stage.getPlanningTable().getTableItem().add(di);
        htpid.setName("MyHumanTaskDiscretionaryItem");
        addShapeFor(parent, di);
        return di;
    }

    protected void addShapeFor(EObject parentElement, TCmmnElement element, int... boundsInfo) {
        CMMNShape shape = CmmnDiFactory.eINSTANCE.createCMMNShape();
        DiagramElement parentDiagramElement = this.elementDiagramElementMap.get(parentElement);
        parentDiagramElement.getOwnedElement().add(shape);
        shape.setCmmnElement(element);
        shape.setBounds(DcFactory.eINSTANCE.createBounds());
        Bounds bounds = shape.getBounds();
        bounds.setX(boundsInfo.length > 0 ? boundsInfo[0] : 10);
        bounds.setY(boundsInfo.length > 1 ? boundsInfo[1] : 10);
        bounds.setWidth(boundsInfo.length > 2 ? boundsInfo[2] : 300);
        bounds.setHeight(boundsInfo.length > 3 ? boundsInfo[3] : 300);
        this.elementDiagramElementMap.put(element, shape);
    }

}