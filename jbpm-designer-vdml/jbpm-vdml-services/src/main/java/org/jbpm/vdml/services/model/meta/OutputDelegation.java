package org.jbpm.vdml.services.model.meta;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("OutputDelegation")
public class OutputDelegation extends DirectedFlow {

    public OutputDelegation() {
    }

    public OutputDelegation(String uri, Collaboration owningCollaboration) {
        super(uri, owningCollaboration);
    }


}
