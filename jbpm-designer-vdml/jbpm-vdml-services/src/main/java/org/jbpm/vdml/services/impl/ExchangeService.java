package org.jbpm.vdml.services.impl;

import org.jbpm.vdml.services.api.model.ResourceAvailability;
import org.jbpm.vdml.services.impl.model.meta.Capability;
import org.jbpm.vdml.services.impl.model.meta.Collaboration;
import org.jbpm.vdml.services.impl.model.runtime.*;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * As a consumer/supplier, I would like to exchange value with another in order to gain a benefit from the network. Isolated exchanges based on a single Store, Pool or Capability
 */
public class ExchangeService extends AbstractRuntimeService {
    private CollaborationService collaborationService;

    public ExchangeService() {
    }

    public ExchangeService(EntityManager em) {
        super(em);
        this.collaborationService = new CollaborationService(em);
    }

    public void commitToExchange(Long collaborationId) {
        MilestoneObservation mo = findExchangeMilestone(collaborationId);
        collaborationService.commitToMilestone(mo);
    }
    public void fulfillExchange(Long collaborationId) {
        MilestoneObservation mo = findExchangeMilestone(collaborationId);
        collaborationService.fulfillMilestone(mo);
    }

    protected MilestoneObservation findExchangeMilestone(Long collaborationId) {
        CollaborationObservation collaborationObservation = entityManager.find(CollaborationObservation.class, collaborationId);
        MilestoneObservation mo = null;
        Collection<DirectlyExchangable> offer = new ArrayList<DirectlyExchangable>();
        offer.addAll(collaborationObservation.getStoresUsed());
        offer.addAll(collaborationObservation.getCapabilityOffersUsed());
        for (DirectlyExchangable ao : offer) {
            ExchangeConfiguration ec = ao.getExchangeConfiguration();
            if (ec != null && ec.getCollaborationToUse().equals(collaborationObservation.getCollaboration())) {
                if (ao.getSupplier().equals(collaborationObservation.findRole(ec.getSupplierRole()).getParticipant())) {
                    mo = collaborationObservation.findMilestone(ec.getExchangeMilestone());
                    break;
                }
            }
        }
        return mo;
    }

    public CollaborationObservation startExchangeForService(Long requestorId, Long capabilityPerformanceId) {
        CapabilityPerformance cp = entityManager.find(CapabilityPerformance.class, capabilityPerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        Capability cpd = cp.getCapability();
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cpd.getExchangeConfiguration().getCollaborationToUse().getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getParticipant(), cpd.getExchangeConfiguration().getSupplierRole());
        return collaborationService.startCollaboration(cpd.getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }

    public CollaborationObservation startExchangeForProduct(Long requestorId, Long storePerformanceId) {
        StorePerformance cp = entityManager.find(StorePerformance.class, storePerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cp.getStoreDefinition().getExchangeConfiguration().getCollaborationToUse().getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getOwner(), cp.getStoreDefinition().getExchangeConfiguration().getSupplierRole());
        return collaborationService.startCollaboration(cp.getStoreDefinition().getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }

    public CollaborationObservation startExchangeForReusableProduct(Long requestorId, Long poolPerformanceId, ResourceAvailability requiredAvailability) {
        PoolPerformance cp = entityManager.find(PoolPerformance.class, poolPerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        Collaboration collaboration1 = cp.getStoreDefinition().getExchangeConfiguration().getCollaborationToUse();
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, collaboration1.getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getOwner(), cp.getStoreDefinition().getExchangeConfiguration().getSupplierRole());
        CollaborationObservation observation = collaborationService.startCollaboration(collaboration1, Arrays.asList(requestorRolePerformance, supplierRolePerformance));
        ActivityObservation ao = observation.findActivity(cp.getStoreDefinition().getExchangeConfiguration().getPoolBooking().getActivity());
        ResourceUseObservation resourceUse = ao.findResourceUse(cp.getStoreDefinition().getExchangeConfiguration().getPoolBooking());
        resourceUse.setFrom(requiredAvailability.getStartDate());
        resourceUse.setTo(requiredAvailability.getEndDate());
        resourceUse.setQuantity(requiredAvailability.getQuantity());
        entityManager.flush();
        return observation;
    }
}
