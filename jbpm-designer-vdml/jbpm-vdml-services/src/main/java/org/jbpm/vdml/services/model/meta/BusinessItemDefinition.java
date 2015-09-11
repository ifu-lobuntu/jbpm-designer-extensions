package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class BusinessItemDefinition implements MetaEntity{
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private BusinessItemDefinition extendedBusinessItemDefinition;
    @ManyToMany(mappedBy = "businessItemDefinitions")
    private Set<Collaboration> collaborations=new HashSet<Collaboration>();
    @ManyToMany
    private Set<Measure> measures=new HashSet<Measure>();

    public BusinessItemDefinition() {
    }

    public BusinessItemDefinition(String uri, Collaboration collaboration) {
        this.uri = uri;
        this.collaborations.add(collaboration);
        collaboration.getBusinessItemDefinitions().add(this);
    }
    public BusinessItemDefinition(String uri) {
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

    public Set<Measure> getMeasures() {
        return measures;
    }

    public BusinessItemDefinition getExtendedBusinessItemDefinition() {
        return extendedBusinessItemDefinition;
    }

    public void setExtendedBusinessItemDefinition(BusinessItemDefinition extendedBusinessItemDefinition) {
        this.extendedBusinessItemDefinition = extendedBusinessItemDefinition;
    }
}
