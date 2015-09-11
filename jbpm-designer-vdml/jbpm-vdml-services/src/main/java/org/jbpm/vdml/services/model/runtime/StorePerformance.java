package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.StoreDefinition;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class StorePerformance implements RuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Participant owner;

    @ManyToOne
    private StorePerformance extendedPresentedStoreMeasurement;
    private double inventoryLevel;
    @ManyToOne
    private StoreDefinition storeDefinition;
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private Set<StoreMeasurement> measurements = new HashSet<StoreMeasurement>();//Aggregated from BusinessItemObservation

    public StorePerformance() {
    }

    public StorePerformance(StoreDefinition storeDefinition, Participant owner) {
        this.storeDefinition = storeDefinition;
        this.owner = owner;
        owner.getOfferedStores().add(this);
    }

    public double getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(double inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public StoreDefinition getStoreDefinition() {
        return storeDefinition;
    }

    public Set<StoreMeasurement> getMeasurements() {
        return measurements;
    }

    public StorePerformance getExtendedPresentedStoreMeasurement() {
        return extendedPresentedStoreMeasurement;
    }

    public void setExtendedPresentedStoreMeasurement(StorePerformance extendedPresentedStoreMeasurement) {
        this.extendedPresentedStoreMeasurement = extendedPresentedStoreMeasurement;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return storeDefinition;
    }
}

