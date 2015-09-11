package org.jbpm.vdml.services.model.meta;

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

    @OneToMany(mappedBy = "supplyingRole", cascade = CascadeType.ALL)
    private Set<SuppliedStore> suppliedStores = new HashSet<SuppliedStore>();
    @OneToMany(mappedBy = "fromRole", cascade = CascadeType.ALL)
    private Set<ValueProposition> providedValuePropositions = new HashSet<ValueProposition>();
    @OneToMany(mappedBy = "toRole")
    private Set<ValueProposition> receivedValuePropositions = new HashSet<ValueProposition>();
    @OneToMany(mappedBy = "performingRole", cascade = CascadeType.ALL)
    private Set<Activity> performedActitivities = new HashSet<Activity>();

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

    public Set<SuppliedStore> getSuppliedStores() {
        return suppliedStores;
    }

    public Set<Activity> getPerformedActitivities() {
        return performedActitivities;
    }

    public void setPerformedActitivities(Set<Activity> performedActitivities) {
        this.performedActitivities = performedActitivities;
    }
}
