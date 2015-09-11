package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Collaboration;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CollaborationObservation extends Participant{

    @ManyToOne
    private Collaboration collaboration;

    @OneToMany(mappedBy = "collaboration")
    private Set<ActivityObservation> activities = new HashSet<ActivityObservation>();
    @OneToMany(mappedBy = "collaboration")
    private Set<SuppliedStoreObservation> suppliedStores = new HashSet<SuppliedStoreObservation>();
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

    public Set<ActivityObservation> getActivities() {
        return activities;
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

    public Set<SuppliedStoreObservation> getSuppliedStores() {
        return suppliedStores;
    }
}
