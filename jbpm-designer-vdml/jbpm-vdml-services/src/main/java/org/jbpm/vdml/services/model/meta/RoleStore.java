package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class RoleStore extends PortContainer{

    @ManyToOne
    private Role owningRole;
    @ManyToOne
    private BusinessItem resource;
    @ManyToMany
    private Set<Measure> measures=new HashSet<Measure>();//Aggregated from resource.measures

    public RoleStore(String uri, Role owningRole) {
        super(uri);
        this.owningRole = owningRole;
        owningRole.getOwnedStores().add(this);
    }

    public RoleStore() {
    }

    public Role getOwningRole() {
        return owningRole;
    }

    public BusinessItem getResource() {
        return resource;
    }

    public void setResource(BusinessItem resource) {
        this.resource = resource;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }
}
