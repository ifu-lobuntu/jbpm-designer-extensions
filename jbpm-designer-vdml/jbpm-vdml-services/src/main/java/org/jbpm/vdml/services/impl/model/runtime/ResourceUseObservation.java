package org.jbpm.vdml.services.impl.model.runtime;

import org.jbpm.vdml.services.impl.model.meta.Measure;
import org.jbpm.vdml.services.impl.model.meta.MetaEntity;
import org.jbpm.vdml.services.impl.model.meta.ResourceUse;

import javax.persistence.*;
import java.util.Date;
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
    private DirectedFlowObservation input;
    @ManyToOne
    private DirectedFlowObservation output;

    @ManyToOne
    private PoolPerformance pool;

    @ManyToOne
    private ReusableBusinessItemPerformance nonFungibleResource;
    @Temporal(TemporalType.TIMESTAMP)
    private Date from;
    @Temporal(TemporalType.TIMESTAMP)
    private Date to;

    private double quantity;


    @OneToMany(mappedBy = "resourceUse")
    private Set<ResourceUseMeasurement> measurements = new HashSet<ResourceUseMeasurement>();

    public ResourceUseObservation() {
    }

    public ReusableBusinessItemPerformance getNonFungibleResource() {
        return nonFungibleResource;
    }

    public void setNonFungibleResource(ReusableBusinessItemPerformance nonFungibleResource) {
        this.nonFungibleResource = nonFungibleResource;
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

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public PoolPerformance getPool() {
        return pool;
    }

    public void setPool(PoolPerformance pool) {
        this.pool = pool;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public DirectedFlowObservation getOutput() {
        return output;
    }

    public void setOutput(DirectedFlowObservation output) {
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

    public DirectedFlowObservation getInput() {
        return input;
    }

    public Set<ResourceUseMeasurement> getMeasurements() {
        return measurements;
    }

    public void setInput(DirectedFlowObservation input) {
        this.input = input;
    }
}
