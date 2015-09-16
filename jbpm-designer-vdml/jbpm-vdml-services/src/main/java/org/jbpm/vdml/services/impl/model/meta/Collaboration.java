package org.jbpm.vdml.services.impl.model.meta;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Collaboration extends PortContainer {
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<Role> collaborationRoles =new HashSet<Role>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<Activity> activities=new HashSet<Activity>();
    @OneToMany(mappedBy = "collaboration",cascade = CascadeType.ALL)
    private Set<SupplyingStore> supplyingStores =new HashSet<SupplyingStore>();
    @ManyToMany()
    private Set<BusinessItemDefinition> businessItemDefinitions =new HashSet<BusinessItemDefinition>();
    @OneToMany(mappedBy = "owningCollaboration", cascade = CascadeType.ALL)
    private Set<DirectedFlow> ownedDirectedFlows =new HashSet<DirectedFlow>();
    @ManyToOne
    private Role initiatorRole;
    @ManyToOne
    private Role plannerRole;

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

    public Set<Role> getCollaborationRoles() {
        return collaborationRoles;
    }

    public Set<SupplyingStore> getSupplyingStores() {
        return supplyingStores;
    }

    public Set<BusinessItemDefinition> getBusinessItemDefinitions() {
        return businessItemDefinitions;
    }

    public Role getInitiatorRole() {
        return initiatorRole;
    }

    public void setInitiatorRole(Role initiatorRole) {
        this.initiatorRole = initiatorRole;
    }

    public Role getPlannerRole() {
        return plannerRole;
    }

    public void setPlannerRole(Role plannerRole) {
        this.plannerRole = plannerRole;
    }

    @Override
    public Collection<Measure> getMeasures() {
        return Collections.emptySet();
    }
}
