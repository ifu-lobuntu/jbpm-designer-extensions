package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.ValuePropositionComponent;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class ValuePropositionComponentPerformance implements RuntimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ValuePropositionPerformance valueProposition;
    @ManyToOne
    private ValuePropositionComponent valuePropositionComponent;
    @OneToMany(mappedBy = "component")
    private Set< ValuePropositionComponentMeasurement> measurements=new HashSet<ValuePropositionComponentMeasurement>();//Aggregated from related ValueAddMeasurements

    public ValuePropositionComponentPerformance() {
    }

    public ValuePropositionComponentPerformance(ValuePropositionPerformance valuePropositionPerformance, ValuePropositionComponent valuePropositionComponent) {
        this.valueProposition = valuePropositionPerformance;
        this.valuePropositionComponent = valuePropositionComponent;
        this.valueProposition.getComponents().add(this);
    }

    public ValuePropositionPerformance getValueProposition() {
        return valueProposition;
    }


    public ValuePropositionComponent getValuePropositionComponent() {
        return valuePropositionComponent;
    }


    public Set< ValuePropositionComponentMeasurement> getMeasurements() {
        return measurements;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getValuePropositionComponent();
    }
}
