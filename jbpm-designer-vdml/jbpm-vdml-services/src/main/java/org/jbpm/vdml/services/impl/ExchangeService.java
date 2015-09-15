package org.jbpm.vdml.services.impl;

import org.jbpm.vdml.services.impl.model.runtime.*;

import javax.persistence.EntityManager;
import java.util.Arrays;

/**
 * 4. As a consumer/supplier, I would like to exchange value with another in order to gain a benefit from the network. Isolated exchanges based on a single Store, Pool or Capability
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
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cp.getExchangeConfiguration().getRequestorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(participant, cp.getExchangeConfiguration().getRequestorRole());
        return collaborationService.startCollaboration(cp.getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }

    public CollaborationObservation startExchangeForProduct(Long requestorId, String collaboration, Long storePerformanceId) {
        return null;
    }

    public CollaborationObservation startExchangeForReusableProduct(Long requestorIdr, String collaboration, Long poolPerformanceId, ResourceAvailability requiredAvailability) {
        return null;
    }
}
