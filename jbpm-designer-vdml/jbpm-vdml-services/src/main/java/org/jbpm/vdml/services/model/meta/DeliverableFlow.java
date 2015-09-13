package org.jbpm.vdml.services.model.meta;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("DeliverableFlow")
public class DeliverableFlow extends DirectedFlow{
    public DeliverableFlow() {
    }

    public DeliverableFlow(String uri, Collaboration owningCollaboration) {
        super(uri, owningCollaboration);
    }
}
