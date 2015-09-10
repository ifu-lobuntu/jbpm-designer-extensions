package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Role;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class RolePerformance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Role role;
    @ManyToOne
    private RolePerformance extendedRolePerformance;
    @ManyToOne
    private Participant participant;
    @OneToMany(mappedBy = "provider",cascade = CascadeType.ALL)
    private Set<ValuePropositionPerformance> providedValuePropositions=new HashSet<ValuePropositionPerformance>();
    @OneToMany(mappedBy = "provider",cascade = CascadeType.ALL)
    private Set<ProvidedValuePropositionPerformance> overallProvidedValuePropositions=new HashSet<ProvidedValuePropositionPerformance>();
    @OneToMany(mappedBy = "receiver",cascade = CascadeType.ALL)
    private Set<ValuePropositionPerformance> receivedValuePropositions=new HashSet<ValuePropositionPerformance>();
    @OneToMany(mappedBy = "responsibleRole")
    private Set<RoleStorePerformance> stores=new HashSet<RoleStorePerformance>();

    public RolePerformance() {
    }

    public RolePerformance(Role role, Participant participant) {
        this.role = role;
        this.participant = participant;
        participant.getRolePerformances().add(this);
    }

    public Role getRole() {
        return role;
    }

    public Participant getParticipant() {
        return participant;
    }

    public Set<ValuePropositionPerformance> getProvidedValuePropositions() {
        return providedValuePropositions;
    }

    public Set<ValuePropositionPerformance> getReceivedValuePropositions() {
        return receivedValuePropositions;
    }

    public Set<ProvidedValuePropositionPerformance> getOverallProvidedValuePropositions() {
        return overallProvidedValuePropositions;
    }

    public Set<RoleStorePerformance> getStores() {
        return stores;
    }

    public RolePerformance getExtendedRolePerformance() {
        return extendedRolePerformance;
    }

    public void setExtendedRolePerformance(RolePerformance extendedRolePerformance) {
        this.extendedRolePerformance = extendedRolePerformance;
    }

    public Long getId() {
        return id;
    }
}
