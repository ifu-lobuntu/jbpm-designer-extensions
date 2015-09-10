package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ValuePropositionComponent implements MetaEntity{
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private ValueProposition valueProposition;

    public ValuePropositionComponent(String uri, ValueProposition valueProposition) {
        this.uri = uri;
        this.valueProposition = valueProposition;
        this.valueProposition.getComponents().add(this);
    }

    public ValuePropositionComponent() {
    }

    @Override
    public String getUri() {
        return uri;
    }

    public ValueProposition getValueProposition() {
        return valueProposition;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
