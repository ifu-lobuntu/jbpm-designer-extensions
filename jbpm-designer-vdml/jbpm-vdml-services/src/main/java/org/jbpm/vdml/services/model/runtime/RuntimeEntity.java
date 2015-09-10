package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.MetaEntity;

public interface RuntimeEntity {
    Long getId();
    MetaEntity getMetaEntity();
}
