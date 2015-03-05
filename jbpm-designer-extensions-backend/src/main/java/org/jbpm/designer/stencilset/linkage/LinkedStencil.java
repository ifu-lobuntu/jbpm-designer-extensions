package org.jbpm.designer.stencilset.linkage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedStencil {
    private Stencil stencil;
    private Map<String, Property> properties = new HashMap<String, Property>();
    private Set<LinkedStencil> allowableParents=new HashSet<LinkedStencil>();

    public LinkedStencil(Stencil stencil) {
        super();
        this.stencil = stencil;
        for (Property p : this.stencil.getProperties()) {
            properties.put(p.getId(), p);
        }
    }

    public Stencil getStencil() {
        return stencil;
    }

    public Map<String, Property> getProperties() {
        return properties;
    }
    public Set<LinkedStencil> getAllowableParents(){
        return allowableParents;
    }
}
