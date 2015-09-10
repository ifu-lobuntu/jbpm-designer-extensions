package org.jbpm.vdml.services.model.runtime;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class RuntimePortContainer implements RuntimeEntity{
    @ManyToOne
    private RolePerformance responsibleRole;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public RuntimePortContainer(RolePerformance responsibleRole) {
        this.responsibleRole = responsibleRole;
    }

    public RuntimePortContainer() {
    }

    @Override
    public Long getId() {
        return id;
    }


    public RolePerformance getResponsibleRole() {
        return responsibleRole;
    }
}
