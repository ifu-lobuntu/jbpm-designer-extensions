package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Collaboration extends PortContainer {
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<Role> roles=new HashSet<Role>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<Activity> activities=new HashSet<Activity>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<SupplyingStore> supplyingStores =new HashSet<SupplyingStore>();
    @ManyToMany()
    private Set<BusinessItemDefinition> businessItemDefinitions =new HashSet<BusinessItemDefinition>();
    @OneToMany(mappedBy = "owningCollaboration", cascade = CascadeType.ALL)
    private Set<DirectedFlow> ownedDirectedFlows =new HashSet<DirectedFlow>();
    public Collaboration() {
    }

    public Collaboration(String uri) {
        super(uri);
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public Set<DirectedFlow> getFlows() {
        return ownedDirectedFlows;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Set<SupplyingStore> getSupplyingStores() {
        return supplyingStores;
    }

    public Set<BusinessItemDefinition> getBusinessItemDefinitions() {
        return businessItemDefinitions;
    }

    @Override
    public Collection<Measure> getMeasures() {
        return Collections.emptySet();
    }
}
