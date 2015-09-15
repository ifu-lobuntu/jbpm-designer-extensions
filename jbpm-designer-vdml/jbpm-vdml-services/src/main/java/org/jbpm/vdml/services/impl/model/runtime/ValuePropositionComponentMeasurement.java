package org.jbpm.vdml.services.impl.model.runtime;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ValuePropositionComponentMeasurement extends Measurement{
    @ManyToOne
    private ValuePropositionComponentPerformance component;

    public ValuePropositionComponentMeasurement() {
    }

    public ValuePropositionComponentMeasurement(ValuePropositionComponentPerformance component) {
        this.component = component;
        this.component.getMeasurements().add(this);
    }

    public ValuePropositionComponentPerformance getComponent() {
        return component;
    }
}
