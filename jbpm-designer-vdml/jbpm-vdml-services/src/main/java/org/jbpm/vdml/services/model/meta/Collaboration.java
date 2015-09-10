package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Collaboration implements  MetaEntity {
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private Collaboration extendedCollaboration;
    @OneToMany(mappedBy = "collaboration")
    private Set<Role> roles=new HashSet<Role>();
    @OneToMany(mappedBy = "collaboration")
    private Set<Activity> activities=new HashSet<Activity>();
    @OneToMany(mappedBy = "collaboration")
    private Set<DeliverableFlow> deliverableFlows=new HashSet<DeliverableFlow>();
    @OneToMany(mappedBy = "collaboration")
    private Set<BusinessItem> businessItems=new HashSet<BusinessItem>();
    public Collaboration() {
    }

    public Collaboration(String uri) {
        this.uri = uri;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public Set<DeliverableFlow> getDeliverableFlows() {
        return deliverableFlows;
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

    public Collaboration getExtendedCollaboration() {
        return extendedCollaboration;
    }

    public void setExtendedCollaboration(Collaboration superCollaboration) {
        this.extendedCollaboration = superCollaboration;
    }

    public Set<BusinessItem> getBusinessItems() {
        return businessItems;
    }

}
