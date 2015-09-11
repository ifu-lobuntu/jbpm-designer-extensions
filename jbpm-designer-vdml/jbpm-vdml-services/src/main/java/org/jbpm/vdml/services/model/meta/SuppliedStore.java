package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SuppliedStore extends RoleBasedPortContainer {

    @ManyToOne
    private StoreDefinition storeRequirement;
    @ManyToOne
    private Role supplyingRole;
    @ManyToOne
    private Collaboration collaboration;
    @ManyToMany
    private Set<Measure> measures = new HashSet<Measure>();//Aggregated from resource.measures

    public SuppliedStore(String uri, Role supplyingRole) {
        super(uri);
        this.supplyingRole = supplyingRole;
        this.supplyingRole.getSuppliedStores().add(this);
        this.collaboration=this.getSupplyingRole().getCollaboration();
        this.getCollaboration().getSuppliedStores().add(this);
    }

    public SuppliedStore() {
    }

    public Role getSupplyingRole() {
        return supplyingRole;
    }

    public Collaboration getCollaboration() {
        return collaboration;
    }

    public StoreDefinition getStoreRequirement() {
        return storeRequirement;
    }

    public void setStoreRequirement(StoreDefinition resource) {
        this.storeRequirement = resource;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }
}
