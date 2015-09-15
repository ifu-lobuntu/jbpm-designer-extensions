package org.jbpm.vdml.services.impl.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public abstract class PortContainer implements MetaEntity,MeasurableElement {
    @Id
    private String uri;
    private String name;

    @OneToMany(mappedBy = "sourcePortContainer")
    private Set<DirectedFlow> commencedFlows = new HashSet<DirectedFlow>();
    @OneToMany(mappedBy = "targetPortContainer")
    private Set<DirectedFlow> concludedFlows = new HashSet<DirectedFlow>();

    public PortContainer(String uri) {
        this.uri = uri;
    }


    protected PortContainer() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUri() {
        return uri;
    }

    public Set<DirectedFlow> getCommencedFlows() {
        return commencedFlows;
    }

    public Set<DirectedFlow> getConcludedFlows() {
        return concludedFlows;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
