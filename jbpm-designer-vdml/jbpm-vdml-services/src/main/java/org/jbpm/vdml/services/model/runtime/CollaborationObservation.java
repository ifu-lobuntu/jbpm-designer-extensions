package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Collaboration;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CollaborationObservation extends Participant{

    @ManyToOne
    private Collaboration collaboration;

    @OneToMany(mappedBy = "collaboration")
    private Set<ActivityObservation> observedActivities = new HashSet<ActivityObservation>();
    @ManyToMany()
    private Set<RolePerformance> rolePerformances = new HashSet<RolePerformance>();

    @OneToMany(mappedBy = "collaboration")
    private Set<BusinessItemObservation> businessItemObservations = new HashSet<BusinessItemObservation>();
    @OneToMany(mappedBy = "collaboration")
    private Set<DeliverableFlowObservation> deliverableFlowObservations = new HashSet<DeliverableFlowObservation>();

    public CollaborationObservation(Collaboration collaboration) {
        this.collaboration = collaboration;
    }

    public CollaborationObservation() {
    }

    public Collaboration getCollaboration() {
        return collaboration;
    }

    public Set<ActivityObservation> getObservedActivities() {
        return observedActivities;
    }

    public Set<RolePerformance> getRolePerformances() {
        return rolePerformances;
    }

    public Set<BusinessItemObservation> getBusinessItemObservations() {
        return businessItemObservations;
    }

    public Set<DeliverableFlowObservation> getDeliverableFlowObservations() {
        return deliverableFlowObservations;
    }
}
