package org.jbpm.vdml.services.impl;


import org.jbpm.vdml.services.impl.model.meta.*;
import org.jbpm.vdml.services.impl.model.runtime.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.*;

/**
 * 1. As a participant, I would like to register with the platform so that I can transact on it.
 * 2. As a supplier, I would like to register the Stores/Pools/Capabilities that I offer so that other participants can use it.
 */
public class ParticipantService extends AbstractRuntimeService {

    public ParticipantService() {
    }

    public ParticipantService(EntityManager entityManager) {
        super(entityManager);
    }
    //TODO:
    //findParticipantByValueProposition(valuePropositionId, Collection<MeasurementCriterion>)
    //findParticipantByCapability(capabilityId, Collection<MeasurementCriterion>)
    //findParticipantByStore(storeDefId, Collection<MeasurementCriterion>)
    //connect(participantId,Collection<Long> selectedValuePropositionPerformances);


    public Participant findParticipant(String id) {
        return entityManager.find(Participant.class, id);
    }

    public IndividualParticipant createIndividualParticipant(String userName) {
        IndividualParticipant entity = new IndividualParticipant(userName);
        entityManager.persist(entity);
        entityManager.flush();
        return entity;
    }

    public IndividualParticipant findIndividualParticipant(String userName) {
        Query q = entityManager.createQuery("select  rp from IndividualParticipant rp where rp.userName=:userName");
        q.setParameter("userName", userName);
        return (IndividualParticipant) q.getSingleResult();
    }

    public void setRoles(Long participantId, Collection<String> roleIds) {
        Collection<Role> storeDefinitions = entityManager.createQuery("select c from Role c where c.uri in :roleIds").setParameter("roleIds",roleIds).getResultList();
        Participant participant = entityManager.find(Participant.class, participantId);
        syncRuntimeEntities(participant.getRolePerformances(), storeDefinitions, RolePerformance.class, participant);
        for (RolePerformance cp : participant.getRolePerformances()) {
            Collection<ProvidedValuePropositionPerformance> pvpp = syncRuntimeEntities(cp.getOverallProvidedValuePropositions(), cp.getRole().getProvidedValuePropositions(), ProvidedValuePropositionPerformance.class, cp);
            for (ProvidedValuePropositionPerformance p : pvpp) {
                Collection<ProvidedValuePropositionComponentPerformance> cs = syncRuntimeEntities(p.getComponents(), p.getValueProposition().getComponents(), ProvidedValuePropositionComponentPerformance.class, p);
                for (ProvidedValuePropositionComponentPerformance cc : cs) {
                    syncRuntimeEntities(cc.getMeasurements(),cc.getValuePropositionComponent().getMeasures(), ProvidedValuePropositionComponentMeasurement.class,cc);
                }
            }
        }
    }

    public void setStores(Long participantId, Collection<String> storeDefIds) {
        Collection<StoreDefinition> storeDefinitions = entityManager.createQuery("select c from StoreDefinition c where c.uri in :storeDefIds").setParameter("storeDefIds",storeDefIds).getResultList();
        Participant participant = entityManager.find(Participant.class, participantId);
        syncRuntimeEntities(participant.getOfferedStores(), storeDefinitions, StorePerformance.class, participant);
        for (StorePerformance cp : participant.getOfferedStores()) {
            syncRuntimeEntities(cp.getMeasurements(), cp.getStoreDefinition().getMeasures(), StoreMeasurement.class, cp);
        }
    }

    public void setCapabilities(Long participantId, Collection<String> capabilityIds) {
        Collection<Capability> capabilities = entityManager.createQuery("select c from Capability c where c.uri in :capabilityIds").setParameter("capabilityIds",capabilityIds).getResultList();
        Participant participant = entityManager.find(Participant.class, participantId);
        syncRuntimeEntities(participant.getCapabilityOffers(),capabilities,CapabilityPerformance.class,participant);
        for (CapabilityPerformance cp : participant.getCapabilityOffers()) {
            syncRuntimeEntities(cp.getMeasurements(), cp.getCapability().getMeasures(), CapabilityMeasurement.class, cp);
        }
    }

}
