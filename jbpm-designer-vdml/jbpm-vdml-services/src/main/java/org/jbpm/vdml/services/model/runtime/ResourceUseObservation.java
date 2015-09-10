package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Measure;
import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.ResourceUse;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ResourceUseObservation implements RuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ResourceUse resourceUse;
    @ManyToOne
    private ActivityObservation activity;
    @ManyToOne
    private DeliverableFlowObservation input;
    @ManyToOne
    private DeliverableFlowObservation output;
    @OneToMany(mappedBy = "resourceUse")
    private Set<ResourceUseMeasurement> measurements = new HashSet<ResourceUseMeasurement>();

    public ResourceUseObservation() {
    }

    public ResourceUseObservation(ResourceUse resourceUse, ActivityObservation activity) {
        this.resourceUse = resourceUse;
        this.activity = activity;
        this.activity.getResourceUseObservation().add(this);
    }

    public ResourceUseMeasurement getQuantity() {
        return getMeasurement(this.resourceUse.getQuantity());
    }
    public ResourceUseMeasurement getDuration() {
        return getMeasurement(this.resourceUse.getDuration());
    }

    private ResourceUseMeasurement getMeasurement(Measure m) {
        for (ResourceUseMeasurement measurement : measurements) {
            if (measurement.getMeasure().equals(m)) {
                return measurement;
            }
        }
        return null;
    }


    public DeliverableFlowObservation getOutput() {
        return output;
    }

    public void setOutput(DeliverableFlowObservation output) {
        this.output = output;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getResourceUse();
    }

    public ResourceUse getResourceUse() {
        return resourceUse;
    }

    public ActivityObservation getActivity() {
        return activity;
    }

    public DeliverableFlowObservation getInput() {
        return input;
    }

    public Set<ResourceUseMeasurement> getMeasurements() {
        return measurements;
    }

    public void setInput(DeliverableFlowObservation input) {
        this.input = input;
    }
}
