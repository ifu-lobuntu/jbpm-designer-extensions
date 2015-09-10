package org.jbpm.vdml.services.model.runtime;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "participant")
    private Set<RolePerformance> rolePerformances =new HashSet<RolePerformance>();

    @OneToMany(mappedBy = "participant")
    private Set<CapabilityPerformance> providedCapabilities=new HashSet<CapabilityPerformance>();

    public Participant() {
    }



    public Set<RolePerformance> getRolePerformances() {
        return rolePerformances;
    }

    public Set<CapabilityPerformance> getProvidedCapabilities() {
        return providedCapabilities;
    }
}
