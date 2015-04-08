package org.jbpm.designer.vdcm;

import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.junit.Test;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Pool;
import org.omg.vdml.Position;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;

public class CapabilityManagementDiagramMarshallingTest extends AbstractVdcmDiagramMarshallingTest {
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
        orgUnitShape.getOwnedShape().add(methodShape);
        VDMLShape offerShape = createShape(offer);
        inputDiagram.getOwnedVdmlDiagramElement().add(offerShape);
        orgUnitShape.getBoundaryShapes().add(offerShape);
        addEdge(null, offer, capabilityMethod);
        print(diagramResource);
        saveCollaborationResource();
        saveCapabilityMethodResource();
        assertOutputValid();
        print(diagramResource);
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
        addEdge(null, pool, position);
        saveCollaborationResource();
        print(diagramResource);
        assertOutputValid();
        print(diagramResource);
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
        addEdge(null, offer, pool);
        saveCollaborationResource();
        print(diagramResource);
        assertOutputValid();
        print(diagramResource);
    }
}
