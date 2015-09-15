package org.jbpm.vdml.services.impl.model.meta;

import javax.persistence.*;

@Entity
@DiscriminatorValue("DeliverableFlow")
public class DeliverableFlow extends DirectedFlow{
    public DeliverableFlow() {
    }

    public DeliverableFlow(String uri, Collaboration owningCollaboration) {
        super(uri, owningCollaboration);
    }
}
