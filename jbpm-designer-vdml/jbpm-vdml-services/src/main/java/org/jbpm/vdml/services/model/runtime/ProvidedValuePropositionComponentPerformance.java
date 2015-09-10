package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.ValuePropositionComponent;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProvidedValuePropositionComponentPerformance implements RuntimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ProvidedValuePropositionPerformance valueProposition;
    @ManyToOne
    private ValuePropositionComponent valuePropositionComponent;
    @OneToMany(mappedBy = "component", cascade = CascadeType.ALL)
    private Set<ProvidedValuePropositionComponentMeasurement> measurements;//Aggregated from related PortMeasurements

    public ProvidedValuePropositionComponentPerformance() {
    }

    public ProvidedValuePropositionComponentPerformance(ProvidedValuePropositionPerformance valueProposition, ValuePropositionComponent valuePropositionComponent) {
        this.valueProposition = valueProposition;
        this.valuePropositionComponent = valuePropositionComponent;
        this.valueProposition.getComponents().add(this);
    }

    public ProvidedValuePropositionPerformance getValueProposition() {
        return valueProposition;
    }


    public ValuePropositionComponent getValuePropositionComponent() {
        return valuePropositionComponent;
    }


    public Set<ProvidedValuePropositionComponentMeasurement> getMeasurements() {
        return this.measurements;
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
