package org.jbpm.vdml.services.impl.model.runtime;


import org.jbpm.vdml.services.impl.model.meta.MetaEntity;
import org.jbpm.vdml.services.impl.model.meta.StoreDefinition;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class StorePerformance implements ActivatableRuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Participant owner;
    private boolean active;
    private Location location=new Location();
    @ManyToOne
    private StorePerformance extendedPresentedStoreMeasurement;
    private double inventoryLevel;
    private double projectedInventoryLevel;
    @ManyToOne
    private ExchangeConfiguration exchangeConfiguration;
    @ManyToOne
    private StoreDefinition storeDefinition;
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private Set<StoreMeasurement> measurements = new HashSet<StoreMeasurement>();//Aggregated from SupplyingStoreObservation

    public StorePerformance() {
    }

    public StorePerformance(StoreDefinition storeDefinition, Participant owner) {
        this.storeDefinition = storeDefinition;
        this.owner = owner;
        owner.getOfferedStores().add(this);
    }

    public ExchangeConfiguration getExchangeConfiguration() {
        return exchangeConfiguration;
    }

    public void setExchangeConfiguration(ExchangeConfiguration exchangeConfiguration) {
        this.exchangeConfiguration = exchangeConfiguration;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public Long getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return storeDefinition;
    }


    public double getProjectedInventoryLevel() {
        return projectedInventoryLevel;
    }

    public void setProjectedInventoryLevel(double projectedInventoryLevel) {
        this.projectedInventoryLevel = projectedInventoryLevel;
    }

    public Participant getOwner() {
        return owner;
    }
}

