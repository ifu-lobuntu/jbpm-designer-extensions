package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Activity extends PortContainer{
    @ManyToOne
    private Collaboration collaboration;
    @ManyToMany
    private Set<Measure> measures=new HashSet<Measure>();

    @OneToMany(mappedBy = "activity")
    private Set<ResourceUse> resourceUses=new HashSet<ResourceUse>();
    @ManyToOne
    private Capability capabilityRequirement;

    public Activity(String uri, Collaboration collaboration) {
        super(uri);
        this.collaboration = collaboration;
        this.collaboration.getActivities().add(this);
    }

    public Activity() {
    }

    public Collaboration getCollaboration() {
        return collaboration;
    }


    public Capability getCapabilityRequirement() {
        return capabilityRequirement;
    }

    public void setCapabilityRequirement(Capability capabilityRequirement) {
        this.capabilityRequirement = capabilityRequirement;
    }

    public Set<ResourceUse> getResourceUses() {
        return resourceUses;
    }
}
