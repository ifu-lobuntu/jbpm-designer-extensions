package org.jbpm.vdml.services.impl.model.runtime;

import javax.persistence.*;
import java.util.Date;

@Entity
//TODO investigate OptaPlanner
public class ParticipantScheduleEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Participant participant;
    @Enumerated
    private TimeCycle cycle;
    @Temporal(TemporalType.TIMESTAMP)
    private Date from;
    @Temporal(TemporalType.TIMESTAMP)
    private Date to;
    private double poolSize;

    public ParticipantScheduleEntry(Participant participant) {
        this.participant = participant;
    }

    public ParticipantScheduleEntry() {
    }

    public Long getId() {
        return id;
    }

    public Participant getParticipant() {
        return participant;
    }

    public TimeCycle getCycle() {
        return cycle;
    }

    public void setCycle(TimeCycle cycle) {
        this.cycle = cycle;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public double getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(double poolSize) {
        this.poolSize = poolSize;
    }
}
