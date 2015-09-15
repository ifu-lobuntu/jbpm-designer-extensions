package org.jbpm.vdml.services.impl.model.runtime;

import org.jbpm.vdml.services.impl.model.meta.PoolDefinition;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PoolPerformance extends StorePerformance{
    private double currentPoolSize;
    @OneToMany(mappedBy = "pool", cascade = CascadeType.ALL)
    private Set<PoolScheduleEntry> schedule =new HashSet<PoolScheduleEntry>();
    @ManyToMany
    private Set<ReusableBusinessItemPerformance> nonFungibleResources=new HashSet<ReusableBusinessItemPerformance>();
    public PoolPerformance() {
    }

    public PoolPerformance(PoolDefinition storeDefinition, Participant owner) {
        super(storeDefinition, owner);
    }

    public double getCurrentPoolSize() {
        return currentPoolSize;
    }

    public Set<PoolScheduleEntry> getSchedule() {
        return schedule;
    }

    public Set<ReusableBusinessItemPerformance> getNonFungibleResources() {
        return nonFungibleResources;
    }


}
