package org.jbpm.designer.vdcm;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Bounds;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Point;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.StencilType;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.junit.Test;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Pool;
import org.omg.vdml.Position;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;


public class CapabilityManagementManipulationTest extends AbstractVdcmDiagramMarshallingTest {
    @Test
    public void testCapabilityOfferAndMethod() throws Exception {
        OrgUnit orgUnit = (OrgUnit) super.collaboration;
        VDMLShape orgUnitShape = createShape(null);
        inputDiagram.getOwnedVdmlDiagramElement().add(orgUnitShape);
        CapabilityOffer offer = VDMLFactory.eINSTANCE.createCapabilityOffer();
        offer.setName("MyOffer");
        offer.getMethod().add(super.capabilityMethod);
        orgUnit.getCapabilityOffer().add(offer);
        VDMLShape methodShape = createShape(capabilityMethod);
        inputDiagram.getOwnedVdmlDiagramElement().add(methodShape);
        VDMLShape offerShape = createShape(offer);
        inputDiagram.getOwnedVdmlDiagramElement().add(offerShape);
        orgUnitShape.getBoundaryShapes().add(offerShape);
        VDMLEdge edge = addEdge(null, offer, capabilityMethod);
        saveCollaborationResource();
        saveCapabilityMethodResource();
        saveDiagramResource();
        
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(edge.getId()));
        XMLResource outputXml = marshaller.convert(json);
        OrgUnit foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(0,foundOrgUnit.getCapabilityOffer().get(0).getMethod().size());
        Shape offerJson = json.findChildShapeById(offer.getId());
        Shape capabilityMethodJson = json.findChildShapeById(capabilityMethod.getId());
        Shape linkJson=new Shape("thersourceid123", new StencilType(VdmlCapabilityManagementStencil.METHOD.getStencilId()));
        linkJson.setBounds(new Bounds(new Point(1.0,2.0),new Point(1.0,2.0)));
        json.getChildShapes().add(linkJson);
        offerJson.addOutgoing(linkJson);
        linkJson.addOutgoing(capabilityMethodJson);
        outputXml = marshaller.convert(json);
        foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(1,foundOrgUnit.getCapabilityOffer().get(0).getMethod().size());
    }

    @Test
    public void testPoolPosition() throws Exception {
        OrgUnit orgUnit = (OrgUnit) super.collaboration;
        VDMLShape orgUnitShape = createShape(null);
        inputDiagram.getOwnedVdmlDiagramElement().add(orgUnitShape);
        Position position = VDMLFactory.eINSTANCE.createPosition();
        position.setName("myPosition");
        orgUnit.getPosition().add(position);
        VDMLShape positionShape = createShape(position);
        orgUnitShape.getOwnedShape().add(positionShape);
        Pool pool = VDMLFactory.eINSTANCE.createPool();
        pool.setName("MyPool");
        orgUnit.getOwnedStore().add(pool);
        pool.getPosition().add(position);
        VDMLShape poolShape = createShape(pool);
        orgUnitShape.getOwnedShape().add(poolShape);
        VDMLEdge edge = addEdge(null, pool, position);
        saveCollaborationResource();
        saveCapabilityMethodResource();
        saveDiagramResource();
        
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(edge.getId()));
        XMLResource outputXml = marshaller.convert(json);
        OrgUnit foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(0,foundOrgUnit.getPosition().get(0).getActorPool().size());
        Shape positionJson = json.findChildShapeById(position.getId());
        Shape poolJson = json.findChildShapeById(pool.getId());
        Shape linkJson=new Shape("thersourceid123", new StencilType(VdmlCapabilityManagementStencil.POOL_POSITION.getStencilId()));
        linkJson.setBounds(new Bounds(new Point(1.0,2.0),new Point(1.0,2.0)));
        json.getChildShapes().add(linkJson);
        poolJson.addOutgoing(linkJson);
        linkJson.addOutgoing(positionJson);
        print(json);
        outputXml = marshaller.convert(json);
        print(outputXml);
        foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(1,foundOrgUnit.getPosition().get(0).getActorPool().size());
    }
    @Test
    public void testPoolAndPositionDelete() throws Exception {
        OrgUnit orgUnit = (OrgUnit) super.collaboration;
        VDMLShape orgUnitShape = createShape(null);
        inputDiagram.getOwnedVdmlDiagramElement().add(orgUnitShape);
        Position position = VDMLFactory.eINSTANCE.createPosition();
        position.setName("myPosition");
        orgUnit.getPosition().add(position);
        VDMLShape positionShape = createShape(position);
        orgUnitShape.getOwnedShape().add(positionShape);
        Pool pool = VDMLFactory.eINSTANCE.createPool();
        pool.setName("MyPool");
        orgUnit.getOwnedStore().add(pool);
        pool.getPosition().add(position);
        VDMLShape poolShape = createShape(pool);
        orgUnitShape.getOwnedShape().add(poolShape);
        VDMLEdge edge = addEdge(null, pool, position);
        saveCollaborationResource();
        saveCapabilityMethodResource();
        saveDiagramResource();
        
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(edge.getId()));
        XMLResource outputXml = marshaller.convert(json);
        OrgUnit foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(1,foundOrgUnit.getPosition().size());
        Shape positionJson = json.findChildShapeById(position.getId());
        Shape poolJson = json.findChildShapeById(pool.getId());
        json.deleteShape(positionJson);
        outputXml = marshaller.convert(json);
        foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(0,foundOrgUnit.getPosition().size());
        assertEquals(1,foundOrgUnit.getOwnedStore().size());
        json.deleteShape(poolJson);
        outputXml = marshaller.convert(json);
        foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(0,foundOrgUnit.getOwnedStore().size());
    }

    @Test
    public void testCapabilityOfferAndResource() throws Exception {
        OrgUnit orgUnit = (OrgUnit) super.collaboration;
        VDMLShape orgUnitShape = createShape(null);
        inputDiagram.getOwnedVdmlDiagramElement().add(orgUnitShape);
        CapabilityOffer offer = VDMLFactory.eINSTANCE.createCapabilityOffer();
        offer.setName("MyOffer");
        orgUnit.getCapabilityOffer().add(offer);
        VDMLShape offerShape = createShape(offer);
        inputDiagram.getOwnedVdmlDiagramElement().add(offerShape);
        orgUnitShape.getBoundaryShapes().add(offerShape);

        Store store = VDMLFactory.eINSTANCE.createStore();
        store.setName("MyStore");
        orgUnit.getOwnedStore().add(store);
        VDMLShape storeShape = createShape(store);
        orgUnitShape.getOwnedShape().add(storeShape);
        offer.getCapabilityResource().add(store);
        addEdge(null, offer, store);
        Pool pool = VDMLFactory.eINSTANCE.createPool();
        pool.setName("MyPool");
        orgUnit.getOwnedStore().add(pool);
        VDMLShape poolShape = createShape(pool);
        orgUnitShape.getOwnedShape().add(poolShape);
        offer.getCapabilityResource().add(pool);
        VDMLEdge edge = addEdge(null, offer, pool);
        saveCollaborationResource();
        saveCapabilityMethodResource();
        saveDiagramResource();
        
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(edge.getId()));
        XMLResource outputXml = marshaller.convert(json);
        OrgUnit foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(1,foundOrgUnit.getCapabilityOffer().get(0).getCapabilityResource().size());
        Shape offerJson = json.findChildShapeById(offer.getId());
        Shape poolJson = json.findChildShapeById(pool.getId());
        Shape linkJson=new Shape("thersourceid123", new StencilType(VdmlCapabilityManagementStencil.CAPABILITY_RESOURCE.getStencilId()));
        linkJson.setBounds(new Bounds(new Point(1.0,2.0),new Point(1.0,2.0)));
        json.getChildShapes().add(linkJson);
        offerJson.addOutgoing(linkJson);
        linkJson.addOutgoing(poolJson);
        outputXml = marshaller.convert(json);
        foundOrgUnit = (OrgUnit) VdmlHelper.getCollaboration(outputXml);
        assertEquals(2,foundOrgUnit.getCapabilityOffer().get(0).getCapabilityResource().size());
    }

}
