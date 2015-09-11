package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Capability implements  MetaEntity{
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private Capability extendedCapability;
    @ManyToMany
    private Set<Measure> measures=new HashSet<Measure>();

    public Capability() {

    }

    public Capability(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Capability getExtendedCapability() {
        return extendedCapability;
    }

    public void setExtendedCapability(Capability superCapability) {
        this.extendedCapability = superCapability;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }
}
