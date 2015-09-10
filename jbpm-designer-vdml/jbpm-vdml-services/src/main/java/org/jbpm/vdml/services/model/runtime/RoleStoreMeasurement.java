package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Measure;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class RoleStoreMeasurement extends Measurement{
    @ManyToOne
    private RoleStorePerformance store;

    public RoleStoreMeasurement() {
    }

    public RoleStoreMeasurement(Measure measure, RoleStorePerformance store) {
        super(measure);
        this.store = store;
        this.store.getMeasurements().add(this);
    }

    public RoleStorePerformance getStore() {
        return store;
    }
}
