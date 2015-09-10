package org.jbpm.vdml.services.impl;

import org.jbpm.vdml.services.model.meta.Collaboration;
import org.jbpm.vdml.services.model.meta.Activity;
import org.jbpm.vdml.services.model.meta.Role;
import org.jbpm.vdml.services.model.meta.DeliverableFlow;

public class CollaborationBuilder extends MetaBuilder {
    public Collaboration buildCollaboration(org.omg.vdml.Collaboration c) {
        Collaboration result = findOrCreate(c, Collaboration.class);
        findOrCreate(c.getCollaborationRole(),Role.class,result);
        findOrCreate(c.getActivity(),Activity.class,result);
        findOrCreate(c.getFlow(),DeliverableFlow.class,result);
        return result;
    }
}
