package org.jbpm.vdml.services.impl.model.runtime;

import org.jbpm.vdml.services.impl.model.meta.Collaboration;
import org.jbpm.vdml.services.impl.model.meta.ResourceUse;
import org.jbpm.vdml.services.impl.model.meta.Role;

import javax.persistence.*;

@Entity
public class ExchangeConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Collaboration collaborationToUse;
    @ManyToOne
    private Role supplierRole;
    @ManyToOne
    private ResourceUse poolBooking;

    public Long getId() {
        return id;
    }

    public Collaboration getCollaborationToUse() {
        return collaborationToUse;
    }

    public void setCollaborationToUse(Collaboration collaborationToUse) {
        this.collaborationToUse = collaborationToUse;
    }

    public ResourceUse getPoolBooking() {
        return poolBooking;
    }

    public void setPoolBooking(ResourceUse poolBooking) {
        this.poolBooking = poolBooking;
    }

    public Role getSupplierRole() {
        return supplierRole;
    }

    public void setSupplierRole(Role supplierRole) {
        this.supplierRole = supplierRole;
    }
}
