package org.jbpm.vdml.services.model.runtime;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class RuntimePortContainer implements RuntimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy = "toPortContainer")
    private Set<DeliverableFlowObservation> observedInput = new HashSet<DeliverableFlowObservation>();
    @OneToMany(mappedBy = "fromPortContainer")
    private Set<DeliverableFlowObservation> observedOutput = new HashSet<DeliverableFlowObservation>();

    public RuntimePortContainer() {
    }


    @Override
    public Long getId() {
        return id;
    }
    public Set<DeliverableFlowObservation> getObservedInput() {
        return observedInput;
    }


    public Set<DeliverableFlowObservation> getObservedOutput() {
        return observedOutput;
    }




}
