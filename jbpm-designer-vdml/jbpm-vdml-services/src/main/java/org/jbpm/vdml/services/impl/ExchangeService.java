package org.jbpm.vdml.services.impl;

import org.jbpm.vdml.services.api.model.ResourceAvailability;
import org.jbpm.vdml.services.impl.model.meta.Collaboration;
import org.jbpm.vdml.services.impl.model.runtime.*;

import javax.persistence.EntityManager;
import java.util.Arrays;

/**
 * As a consumer/supplier, I would like to exchange value with another in order to gain a benefit from the network. Isolated exchanges based on a single Store, Pool or Capability
 */
public class ExchangeService extends AbstractRuntimeService {
    private CollaborationService collaborationService;

    public ExchangeService() {
    }

    public ExchangeService(EntityManager em) {
        super(em);
    }

    public CollaborationObservation startExchangeForService(Long requestorId, Long capabilityPerformanceId) {
        CapabilityPerformance cp = entityManager.find(CapabilityPerformance.class, capabilityPerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cp.getExchangeConfiguration().getCollaborationToUse().getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getParticipant(), cp.getExchangeConfiguration().getSupplierRole());
        return collaborationService.startCollaboration(cp.getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }

    public CollaborationObservation startExchangeForProduct(Long requestorId, Long storePerformanceId) {
        StorePerformance cp = entityManager.find(StorePerformance.class, storePerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cp.getExchangeConfiguration().getCollaborationToUse().getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getOwner(), cp.getExchangeConfiguration().getSupplierRole());
        return collaborationService.startCollaboration(cp.getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }

    public CollaborationObservation startExchangeForReusableProduct(Long requestorId, Long poolPerformanceId, ResourceAvailability requiredAvailability) {
        PoolPerformance cp = entityManager.find(PoolPerformance.class, poolPerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        Collaboration collaboration1 = cp.getExchangeConfiguration().getCollaborationToUse();
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, collaboration1.getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getOwner(), cp.getExchangeConfiguration().getSupplierRole());
        CollaborationObservation observation = collaborationService.startCollaboration(collaboration1, Arrays.asList(requestorRolePerformance, supplierRolePerformance));
        ActivityObservation ao = observation.findActivity(cp.getExchangeConfiguration().getPoolBooking().getActivity());
        ResourceUseObservation resourceUse = ao.findResourceUse(cp.getExchangeConfiguration().getPoolBooking());
        resourceUse.setFrom(requiredAvailability.getStartDate());
        resourceUse.setTo(requiredAvailability.getEndDate());
        resourceUse.setQuantity(requiredAvailability.getQuantity());
        entityManager.flush();
        return observation;
    }
}
