package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.RoleStore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class RoleStorePerformance extends RuntimePortContainer{

    @ManyToOne
    private RoleStorePerformance extendedRoleStorePerformance;
    private double inventoryLevel;
    @ManyToOne
    private RoleStore roleStore;
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private Set<RoleStoreMeasurement> measurements = new HashSet<RoleStoreMeasurement>();//Aggregated from BusinessItemObservation

    public RoleStorePerformance() {
    }

    public RoleStorePerformance(RoleStore roleStore, RolePerformance responsibleRole) {
        super(responsibleRole);
        this.roleStore=roleStore;
        responsibleRole.getStores().add(this);
    }

    public double getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(double inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public RoleStore getRoleStore() {
        return roleStore;
    }

    public Set<RoleStoreMeasurement> getMeasurements() {
        return measurements;
    }

    public RoleStorePerformance getExtendedRoleStorePerformance() {
        return extendedRoleStorePerformance;
    }

    public void setExtendedRoleStorePerformance(RoleStorePerformance extendedRoleStorePerformance) {
        this.extendedRoleStorePerformance = extendedRoleStorePerformance;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return roleStore;
    }
}

