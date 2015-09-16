package org.jbpm.vdml.services.impl.model.runtime;


import org.jbpm.vdml.services.impl.model.meta.BusinessItemDefinition;
import org.jbpm.vdml.services.impl.model.meta.MetaEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ReusableBusinessItemPerformance implements ActivatableRuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean active;
    @ManyToOne
    private ReusableBusinessItemPerformance extendedReusableBusinessItemPerformance;
    @ManyToOne
    private BusinessItemDefinition definition;

    @ManyToOne
    private PoolPerformance hostingPool;

    @ManyToOne
    @JoinColumn(nullable = true)
    private Participant represents;

    @Embedded
    private ExternalObjectReference instanceReference=new ExternalObjectReference();

    @OneToMany()
    private Set<ReusableBusinessItemMeasurement> measurements=new HashSet<ReusableBusinessItemMeasurement>();//Aggregated from ActivityObservation.measurements

    public ReusableBusinessItemPerformance() {
    }

    public ReusableBusinessItemPerformance(BusinessItemDefinition definition, ExternalObjectReference instance) {
        this.definition = definition;
        this.instanceReference=instance;

    }

    public Participant getRepresents() {
        return represents;
    }

    public void setRepresents(Participant represents) {
        this.represents = represents;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getDefinition();
    }

    public BusinessItemDefinition getDefinition() {
        return definition;
    }

    public Set<ReusableBusinessItemMeasurement> getMeasurements() {
        return measurements;
    }

    public ExternalObjectReference getInstanceReference() {
        return instanceReference;
    }

    public void setInstanceReference(ExternalObjectReference instanceReference) {
        this.instanceReference = instanceReference;
    }

    public ReusableBusinessItemPerformance getExtendedReusableBusinessItemPerformance() {
        return extendedReusableBusinessItemPerformance;
    }

    public void setExtendedReusableBusinessItemPerformance(ReusableBusinessItemPerformance extendedReusableBusinessItemPerformance) {
        this.extendedReusableBusinessItemPerformance = extendedReusableBusinessItemPerformance;
    }
}
