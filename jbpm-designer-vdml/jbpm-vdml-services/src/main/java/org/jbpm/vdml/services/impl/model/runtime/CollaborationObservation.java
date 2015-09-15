package org.jbpm.vdml.services.impl.model.runtime;

import org.jbpm.vdml.services.impl.model.meta.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CollaborationObservation extends PortContainerObservation {

    @ManyToOne
    private Collaboration collaboration;

    @OneToMany(mappedBy = "collaboration")
    private Set<ActivityObservation> activities = new HashSet<ActivityObservation>();
    @OneToMany(mappedBy = "collaboration")
    private Set<SupplyingStoreObservation> supplyingStores = new HashSet<SupplyingStoreObservation>();
    @ManyToMany()
    private Set<RolePerformance> collaborationRoles = new HashSet<RolePerformance>();

    @OneToMany(mappedBy = "collaboration")
    private Set<BusinessItemObservation> businessItems = new HashSet<BusinessItemObservation>();
    @OneToMany(mappedBy = "collaboration")
    private Set<DirectedFlowObservation> ownedDirectedFlows = new HashSet<DirectedFlowObservation>();


    public CollaborationObservation(Collaboration collaboration) {
        this.collaboration = collaboration;
    }

    public CollaborationObservation() {
    }

    public PortContainerObservation findPortContainer(PortContainer pc) {
        if(pc instanceof Activity){
            return findActivity((Activity) pc);
        }else{
            return findSupplyingStore((SupplyingStore) pc);
        }
    }

    public ActivityObservation findActivity(Activity pc) {
        for (ActivityObservation activity : this.getActivities()) {
            if (activity.getActivity().getUri().equals(pc.getUri())) {
                return activity;
            }
        }
        throw new IllegalArgumentException(pc.getName() + " not found");
    }

    public SupplyingStoreObservation findSupplyingStore(SupplyingStore pc) {
        for (SupplyingStoreObservation suppliedStore : this.getSupplyingStores()) {
            if (suppliedStore.getSupplyingStore().getUri().equals(pc.getUri())) {
                return suppliedStore;
            }
        }
        throw new IllegalArgumentException(pc.getName() + " not found");
    }

    public BusinessItemObservation findBusinessItem(BusinessItemDefinition deliverable) {
        for (BusinessItemObservation businessItem : businessItems) {
            if (businessItem.getBusinessItemDefinition().equals(deliverable)) {
                return businessItem;
            }
        }
        throw new IllegalArgumentException(deliverable.getName() + " not found");
    }


    @Override
    public MetaEntity getMetaEntity() {
        return getCollaboration();
    }

    public Collaboration getCollaboration() {
        return collaboration;
    }
    public Set<ActivityObservation> getActivities() {
        return activities;
    }

    public Set<RolePerformance> getCollaborationRoles() {
        return collaborationRoles;
    }

    public Set<BusinessItemObservation> getBusinessItems() {
        return businessItems;
    }

    public Set<DirectedFlowObservation> getOwnedDirectedFlows() {
        return ownedDirectedFlows;
    }

    public Set<SupplyingStoreObservation> getSupplyingStores() {
        return supplyingStores;
    }
}
