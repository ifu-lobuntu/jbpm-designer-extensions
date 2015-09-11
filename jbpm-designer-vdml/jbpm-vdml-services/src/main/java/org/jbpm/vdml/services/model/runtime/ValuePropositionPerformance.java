package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.ValueProposition;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ValuePropositionPerformance implements RuntimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ValuePropositionPerformance extendedValuePropositionPerformance;
    @ManyToOne
    private ValueProposition valueProposition;
    @ManyToOne
    private RolePerformance provider;
    @ManyToOne
    private RolePerformance receiver;
    @OneToMany(mappedBy = "valueProposition")
    private Set< ValuePropositionComponentPerformance> components = new HashSet< ValuePropositionComponentPerformance>();

    public ValuePropositionPerformance() {
    }

    public ValuePropositionPerformance(ValueProposition valueProposition, RolePerformance provider, RolePerformance receiver) {
        this.valueProposition = valueProposition;
        this.provider = provider;
        this.provider.getProvidedValuePropositions().add(this);
        this.receiver = receiver;
        this.receiver.getReceivedValuePropositions().add(this);
    }

    public ValuePropositionPerformance getExtendedValuePropositionPerformance() {
        return extendedValuePropositionPerformance;
    }

    public void setExtendedValuePropositionPerformance(ValuePropositionPerformance extendedValuePropositionPerformance) {
        this.extendedValuePropositionPerformance = extendedValuePropositionPerformance;
    }

    public RolePerformance getProvider() {
        return provider;
    }

    public RolePerformance getReceiver() {
        return receiver;
    }

    public Set< ValuePropositionComponentPerformance> getComponents() {
        return components;
    }

    public ValueProposition getValueProposition() {
        return valueProposition;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getValueProposition();
    }
}
