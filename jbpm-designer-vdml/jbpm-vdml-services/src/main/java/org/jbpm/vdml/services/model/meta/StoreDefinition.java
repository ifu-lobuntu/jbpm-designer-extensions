package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class StoreDefinition implements MetaEntity,MeasurableElement {
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private StoreDefinition extendedStoreDefinition;
    @ManyToOne
    private BusinessItemDefinition resource;
    @ManyToMany
    private Set<Measure> measures = new HashSet<Measure>();

    public StoreDefinition() {

    }

    public StoreDefinition(String uri) {
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

    public StoreDefinition getExtendedStoreDefinition() {
        return extendedStoreDefinition;
    }

    public void setExtendedStoreDefinition(StoreDefinition superCapability) {
        this.extendedStoreDefinition = superCapability;
    }

    public BusinessItemDefinition getResource() {
        return resource;
    }

    public void setResource(BusinessItemDefinition resource) {
        this.resource = resource;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }
}
