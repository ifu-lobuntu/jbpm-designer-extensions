package org.jbpm.vdml.services.model.runtime;


import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.Role;
import org.jbpm.vdml.services.model.meta.ValueProposition;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ProvidedValuePropositionPerformance implements RuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ProvidedValuePropositionPerformance extendedValuePropositionPerformance;
    @ManyToOne
    private ValueProposition valueProposition;
    @ManyToOne
    private RolePerformance provider;

    @OneToMany(mappedBy = "valueProposition", cascade = CascadeType.ALL)
    private Set<ProvidedValuePropositionComponentPerformance> components = new HashSet<ProvidedValuePropositionComponentPerformance>();

    public ProvidedValuePropositionPerformance() {
    }

    public ProvidedValuePropositionPerformance(ValueProposition valueProposition, RolePerformance provider, Role receiver) {
        this.valueProposition = valueProposition;
        this.provider = provider;
        this.provider.getOverallProvidedValuePropositions().add(this);
    }

    public ProvidedValuePropositionPerformance getExtendedValuePropositionPerformance() {
        return extendedValuePropositionPerformance;
    }

    public void setExtendedValuePropositionPerformance(ProvidedValuePropositionPerformance extendedValuePropositionPerformance) {
        this.extendedValuePropositionPerformance = extendedValuePropositionPerformance;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getValueProposition();
    }

    public RolePerformance getProvider() {
        return provider;
    }

    public Set<ProvidedValuePropositionComponentPerformance> getComponents() {
        return components;
    }

    public ValueProposition getValueProposition() {
        return valueProposition;
    }
}
