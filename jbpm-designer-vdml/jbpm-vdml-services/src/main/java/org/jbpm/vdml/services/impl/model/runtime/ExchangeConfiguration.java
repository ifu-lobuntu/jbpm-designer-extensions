package org.jbpm.vdml.services.impl.model.runtime;

import org.jbpm.vdml.services.impl.model.meta.Collaboration;
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
    private Role requestorRole;
    @ManyToOne
    private Role supplierRole;

    public Long getId() {
        return id;
    }

    public Collaboration getCollaborationToUse() {
        return collaborationToUse;
    }

    public void setCollaborationToUse(Collaboration collaborationToUse) {
        this.collaborationToUse = collaborationToUse;
    }

    public Role getRequestorRole() {
        return requestorRole;
    }

    public void setRequestorRole(Role requestorRole) {
        this.requestorRole = requestorRole;
    }

    public Role getSupplierRole() {
        return supplierRole;
    }

    public void setSupplierRole(Role supplierRole) {
        this.supplierRole = supplierRole;
    }
}
