package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Activity;
import org.jbpm.vdml.services.model.meta.Collaboration;
import org.jbpm.vdml.services.model.meta.MetaEntity;
import org.jbpm.vdml.services.model.meta.Role;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ActivityObservation extends RuntimePortContainer {
    @ManyToOne
    private Activity activity;
    @ManyToOne
    private RolePerformance performingRole;
    @ManyToOne
    private CollaborationObservation collaboration;
    @OneToMany(mappedBy = "activity")
    private Set<ResourceUseObservation> resourceUseObservation = new HashSet<ResourceUseObservation>();
    @OneToMany(mappedBy = "activity")
    private Set<ActivityMeasurement> measurements = new HashSet<ActivityMeasurement>();

    public ActivityObservation() {
    }

    public ActivityObservation(Activity activity, CollaborationObservation collaboration, RolePerformance performingRole) {
        super();
        this.activity = activity;
        this.collaboration = collaboration;
        this.performingRole=performingRole;
        this.collaboration.getActivities().add(this);
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
