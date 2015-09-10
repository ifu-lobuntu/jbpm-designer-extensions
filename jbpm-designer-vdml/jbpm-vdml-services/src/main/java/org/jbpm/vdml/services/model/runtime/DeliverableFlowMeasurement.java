package org.jbpm.vdml.services.model.runtime;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class DeliverableFlowMeasurement extends Measurement{
    @ManyToOne
    private DeliverableFlowObservation deliverableFlow;

    public DeliverableFlowMeasurement() {
    }

    public DeliverableFlowMeasurement(DeliverableFlowObservation deliverableFlow) {
        this.deliverableFlow = deliverableFlow;
        this.deliverableFlow.getMeasurements().add(this);
    }

    public DeliverableFlowObservation getDeliverableFlow() {
        return deliverableFlow;
    }
}
