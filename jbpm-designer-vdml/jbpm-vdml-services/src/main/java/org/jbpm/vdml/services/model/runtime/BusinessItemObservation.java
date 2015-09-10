package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.BusinessItem;
import org.jbpm.vdml.services.model.meta.MetaEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class BusinessItemObservation implements RuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private BusinessItem businessItem;
    @ManyToOne
    private CollaborationObservation collaboration;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<BusinessItemMeasurement> measurements = new HashSet<BusinessItemMeasurement>();

    public BusinessItemObservation() {
    }

    public BusinessItemObservation(BusinessItem businessItem, CollaborationObservation collaboration) {
        this.businessItem = businessItem;
        this.collaboration = collaboration;
        this.collaboration.getBusinessItemObservations().add(this);
    }

    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getBusinessItem();
    }

    public BusinessItem getBusinessItem() {
        return businessItem;
    }

    public CollaborationObservation getCollaboration() {
        return collaboration;
    }

    public Set<BusinessItemMeasurement> getMeasurements() {
        return measurements;
    }
}
