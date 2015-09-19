package org.jbpm.vdml.services.impl.model.runtime;

import org.jbpm.vdml.services.impl.model.meta.PoolDefinition;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PoolPerformance extends StorePerformance{
    @OneToMany
    private Set<ReusableBusinessItemPerformance> pooledResources =new HashSet<ReusableBusinessItemPerformance>();
    public PoolPerformance() {
    }

    public PoolPerformance(PoolDefinition storeDefinition, Participant owner) {
        super(storeDefinition, owner);
    }


    public Set<ReusableBusinessItemPerformance> getPooledResources() {
        return pooledResources;
    }


}
