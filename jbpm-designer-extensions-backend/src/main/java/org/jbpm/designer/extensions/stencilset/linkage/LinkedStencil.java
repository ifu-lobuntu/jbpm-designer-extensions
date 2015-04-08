package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedStencil {
    private Stencil stencil;
    private Map<String, LinkedProperty> properties = new HashMap<String, LinkedProperty>();
    private Set<LinkedStencil> allowableParents = new HashSet<LinkedStencil>();
    private Set<ConnectionRule> connectionRules = new HashSet<ConnectionRule>();
    private Set<ContainmentRule> containmentRules = new HashSet<ContainmentRule>();

    public LinkedStencil(Stencil stencil) {
        super();
        this.stencil = stencil;
        for (Property p : this.stencil.getProperties()) {
            putProperty(p);
        }
    }

    public void putProperty(Property p) {
        properties.put(p.getId(), new LinkedProperty(p));
    }

    public Stencil getStencil() {
        return stencil;
    }

    public Map<String, LinkedProperty> getProperties() {
        return properties;
    }

    public Set<LinkedStencil> getAllowableParents() {
        return allowableParents;
    }

    public Set<ConnectionRule> getConnectionRules() {
        return connectionRules;
    }

    public Set<ContainmentRule> getContainmentRules() {
        return containmentRules;
    }

    @Override
    public String toString() {
        return "LinkedStencil[" + stencil.getId() + "]";
    }
}
