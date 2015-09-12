package org.jbpm.vdml.services.impl;


import org.jbpm.vdml.services.model.meta.Capability;
import org.jbpm.vdml.services.model.meta.Role;
import org.jbpm.vdml.services.model.meta.StoreDefinition;
import org.jbpm.vdml.services.model.runtime.*;

import javax.persistence.EntityManager;

public class ParticipantService {
    EntityManager entityManager;
    public Participant findParticipant(String id){
        return entityManager.find(Participant.class,id);
    }
    public Participant createParticipant(String id){
        Participant entity = new IndividualParticipant(id);
        entityManager.persist(entity);
        entityManager.flush();
        return entity;
    }
    public void addRole(Long participantId, String roleId){
        entityManager.persist(new RolePerformance(entityManager.find(Role.class,roleId),entityManager.find(Participant.class,participantId)));
        entityManager.flush();
    }
    public void addStore(Long participantId, String storeDefId){
        entityManager.persist(new StorePerformance(entityManager.find(StoreDefinition.class,storeDefId),entityManager.find(Participant.class,participantId)));
        entityManager.flush();
    }
    public void addCapability(Long participantId, String capabilityId){
        entityManager.persist(new CapabilityPerformance(entityManager.find(Capability.class,capabilityId),entityManager.find(Participant.class,participantId)));
        entityManager.flush();
    }
}
