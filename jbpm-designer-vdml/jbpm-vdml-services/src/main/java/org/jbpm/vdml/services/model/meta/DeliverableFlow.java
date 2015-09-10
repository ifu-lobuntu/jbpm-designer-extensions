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
    private String inputName;
    private String outputName;
    @ManyToOne
    private Collaboration collaboration;
    @ManyToOne
    private PortContainer fromPortContainer;
    @ManyToOne
    private PortContainer toPortContainer;
    @ManyToOne
    private Measure quantity;
    @ManyToOne
    private Measure duration;
    @ManyToOne
    private BusinessItem deliverable;
    @ManyToMany
    private Set<Measure> valueAdds=new HashSet<Measure>();

    public DeliverableFlow(String uri, Collaboration collaboration) {
        this.uri=uri;
        this.collaboration = collaboration;
        this.collaboration.getDeliverableFlows().add(this);
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

    public BusinessItem getDeliverable() {
        return deliverable;
    }

    public PortContainer getFromPortContainer() {
        return fromPortContainer;
    }

    public void setDeliverable(BusinessItem deliverable) {
        this.deliverable = deliverable;
    }

    public void setFromPortContainer(PortContainer fromPortContainer) {
        this.fromPortContainer = fromPortContainer;
    }

    public PortContainer getToPortContainer() {
        return toPortContainer;
    }

    public void setToPortContainer(PortContainer toPortContainer) {
        this.toPortContainer = toPortContainer;
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

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }
}
