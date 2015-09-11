package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.Capability;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CapabilityPerformance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CapabilityPerformance extendedCapabilityPerformance;
    @ManyToOne
    private Participant participant;
    @ManyToOne
    private Capability capability;
    @OneToMany()
    private Set<CapabilityMeasurement> measurements=new HashSet<CapabilityMeasurement>();//Aggregated from ActivityObservation.measurements

    public CapabilityPerformance() {
    }

    public CapabilityPerformance(Participant participant, Capability capability) {
        this.participant = participant;
        this.participant.getCapabilityOffers().add(this);
        this.capability = capability;
    }

    public Long getId() {
        return id;
    }

    public Participant getParticipant() {
        return participant;
    }

    public Capability getCapability() {
        return capability;
    }

    public Set< CapabilityMeasurement> getMeasurements() {
        return measurements;
    }

    public CapabilityPerformance getExtendedCapabilityPerformance() {
        return extendedCapabilityPerformance;
    }

    public void setExtendedCapabilityPerformance(CapabilityPerformance extendedCapabilityPerformance) {
        this.extendedCapabilityPerformance = extendedCapabilityPerformance;
    }
}
