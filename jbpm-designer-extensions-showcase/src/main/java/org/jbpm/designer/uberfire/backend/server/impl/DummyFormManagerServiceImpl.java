package org.jbpm.designer.uberfire.backend.server.impl;

import javax.enterprise.context.ApplicationScoped;

import org.jbpm.kie.services.impl.FormManagerServiceImpl;
/**
 * Hack to avoiddependency on entire jBPM infrastructure
 *
 */
@ApplicationScoped
public class DummyFormManagerServiceImpl extends FormManagerServiceImpl{
    
}
