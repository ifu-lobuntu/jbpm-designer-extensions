package org.jbpm.vdml.services.model.meta;

import org.jbpm.vdml.services.model.runtime.RolePerformance;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role implements MetaEntity {
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private Collaboration collaboration;
    @ManyToOne
    private Role extendedRole;

    @OneToMany(mappedBy = "owningRole", cascade = CascadeType.ALL)
    private Set<RoleStore> ownedStores = new HashSet<RoleStore>();
    @OneToMany(mappedBy = "fromRole", cascade = CascadeType.ALL)
    private Set<ValueProposition> providedValuePropositions = new HashSet<ValueProposition>();
    @OneToMany(mappedBy = "toRole")
    private Set<ValueProposition> receivedValuePropositions = new HashSet<ValueProposition>();

    public Role(String uri, Collaboration collaboration) {
        this.uri = uri;
        this.collaboration = collaboration;
        this.collaboration.getRoles().add(this);
    }

    public Role() {
    }


    public Collaboration getCollaboration() {
        return collaboration;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ValueProposition> getProvidedValuePropositions() {
        return providedValuePropositions;
    }

    public Set<ValueProposition> getReceivedValuePropositions() {
        return receivedValuePropositions;
    }

    public Set<RoleStore> getOwnedStores() {
        return ownedStores;
    }

    public Role getExtendedRole() {
        return extendedRole;
    }

    public void setExtendedRole(Role extendedRole) {
        this.extendedRole = extendedRole;
    }
}
