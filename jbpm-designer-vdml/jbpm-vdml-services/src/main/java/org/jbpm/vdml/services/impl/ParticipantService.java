package org.jbpm.vdml.services.impl;


import org.jbpm.vdml.services.model.meta.Role;
import org.jbpm.vdml.services.model.runtime.IndividualParticipant;
import org.jbpm.vdml.services.model.runtime.Participant;
import org.jbpm.vdml.services.model.runtime.RolePerformance;

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
    public void addRole(String participantId, String roleId){
        entityManager.persist(new RolePerformance(entityManager.find(Role.class,roleId),entityManager.find(Participant.class,participantId)));
        entityManager.flush();
    }
}
