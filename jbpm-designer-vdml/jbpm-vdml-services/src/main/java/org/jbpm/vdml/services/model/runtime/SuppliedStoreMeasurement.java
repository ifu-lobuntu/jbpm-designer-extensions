package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Measure;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SuppliedStoreMeasurement extends Measurement{
    @ManyToOne
    private SuppliedStoreObservation store;

    public SuppliedStoreMeasurement() {
    }

    public SuppliedStoreMeasurement(Measure measure, SuppliedStoreObservation store) {
        super(measure);
        this.store = store;
        this.store.getMeasurements().add(this);
    }

    public SuppliedStoreObservation getStore() {
        return store;
    }
}
