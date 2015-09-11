package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Activity extends RoleBasedPortContainer {


    @OneToMany(mappedBy = "activity")
    private Set<ResourceUse> resourceUses=new HashSet<ResourceUse>();
    @ManyToOne
    private Capability capabilityRequirement;
    @ManyToOne
    private Role performingRole;
    @ManyToOne
    private Collaboration collaboration;
    @ManyToMany
    private Set<Measure> measures=new HashSet<Measure>();

    public Activity(String uri, Role performingRole) {
        super(uri);
        this.performingRole = performingRole;
        this.collaboration= performingRole.getCollaboration();
        this.getPerformingRole().getPerformedActitivities().add(this);
        this.getCollaboration().getActivities().add(this);
    }

    public Activity() {
    }

    public Collaboration getCollaboration() {
        return collaboration;
    }

    public Role getPerformingRole() {
        return performingRole;
    }
    public Capability getCapabilityRequirement() {
        return capabilityRequirement;
    }

    public void setCapabilityRequirement(Capability capabilityRequirement) {
        this.capabilityRequirement = capabilityRequirement;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }

    public Set<ResourceUse> getResourceUses() {
        return resourceUses;
    }
}
