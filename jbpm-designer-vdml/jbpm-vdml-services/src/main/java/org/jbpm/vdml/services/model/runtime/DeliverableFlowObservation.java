package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.DeliverableFlow;
import org.jbpm.vdml.services.model.meta.MetaEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DeliverableFlowObservation implements RuntimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CollaborationObservation collaboration;
    @ManyToOne
    private DeliverableFlow deliverableFlow;
    @ManyToOne
    private RuntimePortContainer fromPortContainer;
    @ManyToOne
    private RuntimePortContainer toPortContainer;
    @ManyToOne
    private BusinessItemObservation deliverable;
    @OneToMany(mappedBy = "deliverableFlow")
    private Set<ValueAddMeasurement> valueAddMeasurements=new HashSet<ValueAddMeasurement>();
    @OneToMany(mappedBy = "deliverableFlow")
    private Set<DeliverableFlowMeasurement> measurements=new HashSet<DeliverableFlowMeasurement>();

    public DeliverableFlowObservation() {
    }

    public DeliverableFlowObservation(CollaborationObservation collaboration, DeliverableFlow deliverableFlow) {
        this.collaboration = collaboration;
        this.deliverableFlow = deliverableFlow;
        this.collaboration.getDeliverableFlowObservations().add(this);
    }

    public DeliverableFlowObservation(CollaborationObservation collaboration, DeliverableFlow deliverableFlow, ActivityObservation from, ActivityObservation to) {
        this(collaboration,deliverableFlow);
        this.fromPortContainer = from;
        this.toPortContainer = to;
        from.getObservedOutput().add(this);
        to.getObservedInput().add(this);
    }
    public DeliverableFlowObservation(CollaborationObservation collaboration, DeliverableFlow deliverableFlow, SuppliedStoreObservation from, SuppliedStoreObservation to) {
        this(collaboration,deliverableFlow);
        this.fromPortContainer = from;
        this.toPortContainer = to;
    }

    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getDeliverableFlow();
    }

    public CollaborationObservation getCollaboration() {
        return collaboration;
    }

    public DeliverableFlow getDeliverableFlow() {
        return deliverableFlow;
    }

    public RuntimePortContainer getFromPortContainer() {
        return fromPortContainer;
    }

    public RuntimePortContainer getToPortContainer() {
        return toPortContainer;
    }

    public void setDeliverable(BusinessItemObservation deliverable) {
        this.deliverable = deliverable;
    }

    public BusinessItemObservation getDeliverable() {
        return deliverable;
    }

    public Set<ValueAddMeasurement> getValueAddMeasurements() {
        return valueAddMeasurements;
    }

    public Set<DeliverableFlowMeasurement> getMeasurements() {
        return measurements;
    }

    public DeliverableFlowMeasurement getQuantity() {
        for (DeliverableFlowMeasurement measurement : measurements) {
            if(measurement.getMeasure().equals(deliverableFlow.getQuantity())){
                return measurement;
            }
        }
        return null;
    }
}
