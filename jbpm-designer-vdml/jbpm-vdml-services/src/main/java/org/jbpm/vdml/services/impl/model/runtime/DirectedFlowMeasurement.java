package org.jbpm.vdml.services.impl.model.runtime;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class DirectedFlowMeasurement extends Measurement{
    @ManyToOne
    private DirectedFlowObservation directedFlow;

    public DirectedFlowMeasurement() {
    }

    public DirectedFlowMeasurement(DirectedFlowObservation directedFlow) {
        this.directedFlow = directedFlow;
        this.directedFlow.getMeasurements().add(this);
    }

    public DirectedFlowObservation getDirectedFlow() {
        return directedFlow;
    }
}
