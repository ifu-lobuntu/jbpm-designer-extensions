package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity

public abstract class PortContainer implements MetaEntity{
    @Id
    private String uri;
    private String name;
    @OneToMany(mappedBy = "fromPortContainer")
    private Set<DeliverableFlow> output=new HashSet<DeliverableFlow>();
    @OneToMany(mappedBy = "toPortContainer")
    private Set<DeliverableFlow> input=new HashSet<DeliverableFlow>();
    public PortContainer() {
    }

    public PortContainer(String uri) {
        this.uri = uri;
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
