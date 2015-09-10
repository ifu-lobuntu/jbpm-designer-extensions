package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Activity;
import org.jbpm.vdml.services.model.meta.MetaEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ActivityObservation extends RuntimePortContainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CollaborationObservation collaboration;
    @ManyToOne
    private Activity activity;
    @OneToMany(mappedBy = "toPortContainer")
    private Set<DeliverableFlowObservation> observedInput = new HashSet<DeliverableFlowObservation>();
    @OneToMany(mappedBy = "fromPortContainer")
    private Set<DeliverableFlowObservation> observedOutput = new HashSet<DeliverableFlowObservation>();
    @OneToMany(mappedBy = "activity")
    private Set<ResourceUseObservation> resourceUseObservation = new HashSet<ResourceUseObservation>();
    @OneToMany(mappedBy = "activity")
    private Set<ActivityMeasurement> measurements = new HashSet<ActivityMeasurement>();

    public ActivityObservation() {
    }

    public ActivityObservation(Activity activity, CollaborationObservation collaboration, RolePerformance performer) {
        super(performer);
        this.activity = activity;
        this.collaboration = collaboration;
        this.collaboration.getObservedActivities().add(this);

    }

    public Set<DeliverableFlowObservation> getObservedInput() {
        return observedInput;
    }


    public Set<DeliverableFlowObservation> getObservedOutput() {
        return observedOutput;
    }


    public Set<ResourceUseObservation> getResourceUseObservation() {
        return resourceUseObservation;
    }


    public Set<ActivityMeasurement> getMeasurements() {
        return measurements;
    }


    @Override
    public MetaEntity getMetaEntity() {
        return getActivity();
    }

    public Activity getActivity() {
        return activity;
    }
}
