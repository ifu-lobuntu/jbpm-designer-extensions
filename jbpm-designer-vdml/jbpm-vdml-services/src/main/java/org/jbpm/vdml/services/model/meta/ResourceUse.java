package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ResourceUse implements MetaEntity{
    @Id
    private String uri;
    @ManyToOne
    private Activity activity;
    @ManyToOne
    private DeliverableFlow input;
    @ManyToOne
    private DeliverableFlow output;
    @ManyToOne
    private Measure quantity;
    @ManyToOne
    private Measure duration;

    private String name;

    public ResourceUse() {
    }

    public ResourceUse(String uri, Activity activity) {
        this.uri = uri;
        this.activity = activity;
        this.activity.getResourceUses().add(this);
    }

    @Override
    public String getUri() {
        return uri;
    }

    public Activity getActivity() {
        return activity;
    }

    public DeliverableFlow getInput() {
        return input;
    }

    public void setInput(DeliverableFlow input) {
        this.input = input;
    }

    public DeliverableFlow getOutput() {
        return output;
    }

    public void setOutput(DeliverableFlow output) {
        this.output = output;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
