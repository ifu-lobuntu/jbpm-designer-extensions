package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Collaboration;
import org.jbpm.vdml.services.model.meta.MetaEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CollaborationPerformance extends Participant implements RuntimeEntity{

    @ManyToOne
    private Collaboration collaboration;

    @OneToMany(mappedBy = "collaboration")
    private Set<ActivityObservation> activities = new HashSet<ActivityObservation>();
    @OneToMany(mappedBy = "collaboration")
    private Set<SupplyingStoreObservation> suppliedStores = new HashSet<SupplyingStoreObservation>();
    @ManyToMany()
    private Set<RolePerformance> rolePerformances = new HashSet<RolePerformance>();

    @OneToMany(mappedBy = "collaboration")
    private Set<BusinessItemObservation> businessItemObservations = new HashSet<BusinessItemObservation>();
    @OneToMany(mappedBy = "collaboration")
    private Set<DeliverableFlowObservation> deliverableFlowObservations = new HashSet<DeliverableFlowObservation>();
    @OneToMany(mappedBy = "toPortContainer")
    private Set<DeliverableFlowObservation> observedInput = new HashSet<DeliverableFlowObservation>();
    @OneToMany(mappedBy = "fromPortContainer")
    private Set<DeliverableFlowObservation> observedOutput = new HashSet<DeliverableFlowObservation>();


    public CollaborationPerformance(Collaboration collaboration) {
        this.collaboration = collaboration;
    }

    public CollaborationPerformance() {
    }

    public Set<DeliverableFlowObservation> getObservedInput() {
        return observedInput;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getCollaboration();
    }

    public Set<DeliverableFlowObservation> getObservedOutput() {
        return observedOutput;
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

    public Set<SupplyingStoreObservation> getSuppliedStores() {
        return suppliedStores;
    }
}
