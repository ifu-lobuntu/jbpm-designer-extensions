package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DeliverableFlow implements  MetaEntity{
    @Id
    private String uri;
    private String name;
    private String recipientName;
    private String providerName;
    @ManyToOne
    private Collaboration collaboration;
    @ManyToOne
    private RoleBasedPortContainer providingPortContainer;
    @ManyToOne
    private RoleBasedPortContainer receivingPortContainer;
    @ManyToOne
    private Measure quantity;
    @ManyToOne
    private Measure duration;
    @ManyToOne
    private BusinessItemDefinition deliverable;
    @ManyToMany
    private Set<Measure> valueAdds=new HashSet<Measure>();

    public DeliverableFlow(String uri, Collaboration collaboration) {
        this.uri=uri;
        this.collaboration = collaboration;
        this.collaboration.getFlows().add(this);
    }

    public DeliverableFlow() {
    }

    public Measure getQuantity() {
        return quantity;
    }

    public void setQuantity(Measure quantity) {
        this.quantity = quantity;
    }

    public Measure getDuration() {
        return duration;
    }

    public void setDuration(Measure duration) {
        this.duration = duration;
    }

    public Set<Measure> getValueAdds() {
        return valueAdds;
    }

    public BusinessItemDefinition getDeliverable() {
        return deliverable;
    }

    public RoleBasedPortContainer getProvidingPortContainer() {
        return providingPortContainer;
    }

    public void setDeliverable(BusinessItemDefinition deliverable) {
        this.deliverable = deliverable;
    }

    public void setProvidingPortContainer(RoleBasedPortContainer fromRoleBasedPortContainer) {
        this.providingPortContainer = fromRoleBasedPortContainer;
    }

    public RoleBasedPortContainer getReceivingPortContainer() {
        return receivingPortContainer;
    }

    public void setReceivingPortContainer(RoleBasedPortContainer toRoleBasedPortContainer) {
        this.receivingPortContainer = toRoleBasedPortContainer;
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

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String inputName) {
        this.recipientName = inputName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String outputName) {
        this.providerName = outputName;
    }
}
