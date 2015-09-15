package org.jbpm.vdml.services.impl;

import org.jbpm.vdml.services.impl.model.meta.*;
import org.jbpm.vdml.services.impl.model.runtime.*;


import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.Date;

/**
 *9. As a project custodian, when planning on a project has been completed, I want all collaborating participants, including myself, to commit to the times, locations and quantitiesm so that subsequent planning can be based on accurate data.
 *10. As a project custodian, when a given milestone has been reached, I want relevant flow of value to be effected so that the inventory levels on the stores and pools used reflect the current state of affairs accurately.
 */
public class CollaborationService extends AbstractRuntimeService {
    AssignmentService assignmentService;

    public CollaborationService() {

    }

    public CollaborationService(EntityManager entityManager) {
        super(entityManager);
        this.assignmentService=new AssignmentService(entityManager);
    }

    public CollaborationObservation startCollaboration(Collaboration collaboration, Collection<RolePerformance> rolePerformances) {
        CollaborationObservation observation = new CollaborationObservation(collaboration);
        entityManager.persist(observation);
        syncRuntimeEntities(observation.getActivities(), collaboration.getActivities(), ActivityObservation.class, observation);
        syncRuntimeEntities(observation.getSupplyingStores(), collaboration.getSupplyingStores(), SupplyingStoreObservation.class, observation);
        syncRuntimeEntities(observation.getBusinessItems(), collaboration.getBusinessItemDefinitions(), BusinessItemObservation.class, observation);
        for (BusinessItemObservation bio : observation.getBusinessItems()) {
            syncRuntimeEntities(bio.getMeasurements(), bio.getBusinessItemDefinition().getImmediateMeasures(), BusinessItemMeasurement.class, bio);
        }
        syncRuntimeEntities(observation.getOwnedDirectedFlows(), collaboration.getFlows(), DirectedFlowObservation.class, observation);
        for (DirectedFlowObservation dfo : observation.getOwnedDirectedFlows()) {
            syncRuntimeEntities(dfo.getMeasurements(), dfo.getDirectedFlow().getMeasures(), DirectedFlowMeasurement.class, dfo);
        }
        assignmentService.assignToRoles(observation, rolePerformances);
        return observation;
    }

    public ActivityObservation newActivity(String activityId, Long collaborationObservationId, Long capabilityPerformance) {
        CollaborationObservation co = entityManager.find(CollaborationObservation.class, collaborationObservationId);
        CapabilityPerformance cp = entityManager.find(CapabilityPerformance.class, capabilityPerformance);
        Activity a = entityManager.find(Activity.class, activityId);
        ActivityObservation ao = new ActivityObservation( a,co);
        entityManager.persist(ao);
        for (DirectedFlow flow : a.getConcludedFlows()) {
            new DirectedFlowObservation(flow, co, co.findPortContainer(flow.getSourcePortContainer()), ao);
        }
        for (DirectedFlow flow : a.getCommencedFlows()) {
            new DirectedFlowObservation(flow, co, ao, co.findPortContainer(flow.getTargetPortContainer()));
        }
        entityManager.flush();
        return ao;
    }

    public void commitToActivity(Long activityObservationId) {
        ActivityObservation ao = entityManager.find(ActivityObservation.class, activityObservationId);
        for (DirectedFlowObservation flow : ao.getConcludedFlow()) {
            if (flow.getSourcePortContainer() instanceof SupplyingStoreObservation) {
                SupplyingStoreObservation rsp = (SupplyingStoreObservation) flow.getSourcePortContainer();
                if (flow.getQuantity() != null) {
                    flow.setStatus(ValueFlowStatus.COMMITTED);
                    Measurement q = flow.getQuantity();
                    if (q.getValue() != null) {
                        rsp.getStore().setProjectedInventoryLevel(rsp.getStore().getProjectedInventoryLevel() - q.getValue());
                    }
                }
            }
        }
        for (DirectedFlowObservation flow : ao.getCommencedFlow()) {
            if (flow.getTargetPortContainer() instanceof SupplyingStoreObservation) {
                SupplyingStoreObservation rsp = (SupplyingStoreObservation) flow.getTargetPortContainer();
                if (flow.getQuantity() != null) {
                    Measurement q = flow.getQuantity();
                    flow.setStatus(ValueFlowStatus.COMMITTED);
                    if (q.getValue() != null) {
                        rsp.getStore().setProjectedInventoryLevel(rsp.getStore().getProjectedInventoryLevel() + q.getValue());
                    }
                }
            }
        }
    }

    public void fulfillActivity(Long activityObservationId) {
        ActivityObservation ao = entityManager.find(ActivityObservation.class, activityObservationId);
        for (DirectedFlowObservation flow : ao.getConcludedFlow()) {
            if (flow.getSourcePortContainer() instanceof SupplyingStoreObservation) {
                SupplyingStoreObservation rsp = (SupplyingStoreObservation) flow.getSourcePortContainer();
                if (flow.getQuantity() != null) {
                    flow.setStatus(ValueFlowStatus.FULFILLED);
                    flow.setActualDate(new Date());
                    Measurement q = flow.getQuantity();
                    if (q.getValue() != null) {
                        rsp.getStore().setInventoryLevel(rsp.getStore().getInventoryLevel() - q.getValue());
                    }
                }
            }
        }
        for (DirectedFlowObservation flow : ao.getCommencedFlow()) {
            if (flow.getTargetPortContainer() instanceof SupplyingStoreObservation) {
                SupplyingStoreObservation rsp = (SupplyingStoreObservation) flow.getTargetPortContainer();
                if (flow.getQuantity() != null) {
                    Measurement q = flow.getQuantity();
                    flow.setStatus(ValueFlowStatus.FULFILLED);
                    flow.setActualDate(new Date());
                    if (q.getValue() != null) {
                        rsp.getStore().setInventoryLevel(rsp.getStore().getInventoryLevel() + q.getValue());
                    }
                }
            }
        }
    }
}
