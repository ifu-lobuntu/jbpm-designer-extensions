package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.SuppliedStore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SuppliedStoreObservation extends RuntimePortContainer{
    @ManyToOne
    private SuppliedStoreObservation extendedSuppliedStoreObservation;
    @ManyToOne
    private StorePerformance store;
    @ManyToOne
    private RolePerformance supplyingRole;
    @ManyToOne
    private CollaborationObservation collaboration;
    @ManyToOne
    private SuppliedStore suppliedStore;
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private Set<SuppliedStoreMeasurement> measurements = new HashSet<SuppliedStoreMeasurement>();//Aggregated from BusinessItemObservation

    public SuppliedStoreObservation() {
    }

    public SuppliedStoreObservation(SuppliedStore suppliedStore, CollaborationObservation collaboration, RolePerformance supplyingRole,StorePerformance store) {
        super();
        this.suppliedStore = suppliedStore;
        this.collaboration=collaboration;
        this.supplyingRole=supplyingRole;
        this.getCollaboration().getSuppliedStores().add(this);
        this.store=store;
    }

    public RolePerformance getSupplyingRole() {
        return supplyingRole;
    }

    public CollaborationObservation getCollaboration() {
        return collaboration;
    }

    public SuppliedStore getSuppliedStore() {
        return suppliedStore;
    }

    public Set<SuppliedStoreMeasurement> getMeasurements() {
        return measurements;
    }

    public SuppliedStoreObservation getExtendedSuppliedStoreObservation() {
        return extendedSuppliedStoreObservation;
    }

    public void setExtendedSuppliedStoreObservation(SuppliedStoreObservation extendedSuppliedStoreObservation) {
        this.extendedSuppliedStoreObservation = extendedSuppliedStoreObservation;
    }

    public StorePerformance getStore() {
        return store;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return suppliedStore;
    }
}

