package org.jbpm.vdml.services.model.runtime;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ValueAddMeasurement extends Measurement{
    @ManyToOne
    private DeliverableFlowObservation deliverableFlow;

    public ValueAddMeasurement() {
    }

    public ValueAddMeasurement(DeliverableFlowObservation deliverableFlow) {
        this.deliverableFlow = deliverableFlow;
        this.deliverableFlow.getValueAddMeasurements().add(this);
    }

    public DeliverableFlowObservation getDeliverableFlow() {
        return deliverableFlow;
    }
}
