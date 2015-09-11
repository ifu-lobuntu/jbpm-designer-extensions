package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Collaboration implements  MetaEntity {
    @Id
    private String uri;
    private String name;
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<Role> roles=new HashSet<Role>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<Activity> activities=new HashSet<Activity>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<SuppliedStore> suppliedStores =new HashSet<SuppliedStore>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<DeliverableFlow> flows =new HashSet<DeliverableFlow>();
    @ManyToMany()
    private Set<BusinessItemDefinition> businessItemDefinitions =new HashSet<BusinessItemDefinition>();
    public Collaboration() {
    }

    public Collaboration(String uri) {
        this.uri = uri;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public Set<DeliverableFlow> getFlows() {
        return flows;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getUri() {
        return uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SuppliedStore> getSuppliedStores() {
        return suppliedStores;
    }

    public Set<BusinessItemDefinition> getBusinessItemDefinitions() {
        return businessItemDefinitions;
    }

}
