package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public abstract class RoleBasedPortContainer implements MetaEntity,MeasurableElement {
    @Id
    private String uri;
    private String name;

    @OneToMany(mappedBy = "providingPortContainer")
    private Set<DeliverableFlow> output = new HashSet<DeliverableFlow>();
    @OneToMany(mappedBy = "receivingPortContainer")
    private Set<DeliverableFlow> input = new HashSet<DeliverableFlow>();


    public RoleBasedPortContainer(String uri) {
        this.uri = uri;
    }


    protected RoleBasedPortContainer() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUri() {
        return uri;
    }

    public Set<DeliverableFlow> getOutput() {
        return output;
    }

    public Set<DeliverableFlow> getInput() {
        return input;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
