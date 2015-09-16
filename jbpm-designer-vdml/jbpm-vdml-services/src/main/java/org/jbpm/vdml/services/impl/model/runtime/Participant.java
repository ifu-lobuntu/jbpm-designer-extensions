package org.jbpm.vdml.services.impl.model.runtime;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.Type;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Type(type="org.hibernate.spatial.GeometryType")
    private Point location;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "participant")
    private Set<RolePerformance> rolePerformances =new HashSet<RolePerformance>();
    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private Set<ParticipantScheduleEntry> schedule=new HashSet<ParticipantScheduleEntry>();
    @OneToMany(mappedBy = "participant")
    private Set<CapabilityPerformance> capabilityOffers =new HashSet<CapabilityPerformance>();

    @OneToMany(mappedBy = "owner")
    private Set<StorePerformance> offeredStores =new HashSet<StorePerformance>();

    public Participant() {
    }

    public Long getId() {
        return id;
    }

    public Set<StorePerformance> getOfferedStores() {
        return offeredStores;
    }

    public Set<ParticipantScheduleEntry> getSchedule() {
        return schedule;
    }

    public Set<RolePerformance> getRolePerformances() {
        return rolePerformances;
    }

    public Set<CapabilityPerformance> getCapabilityOffers() {
        return capabilityOffers;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
