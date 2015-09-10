package org.jbpm.vdml.services.model.meta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class BusinessItem implements MetaEntity{
    @Id
    private String uri;
    private String name;
    @ManyToOne
    private BusinessItem extendedBusinessItem;
    @ManyToOne
    private Collaboration collaboration;
    @ManyToMany
    private Set<Measure> measures=new HashSet<Measure>();

    public BusinessItem() {
    }

    public BusinessItem(String uri, Collaboration collaboration) {
        this.uri = uri;
        this.collaboration = collaboration;
        this.collaboration.getBusinessItems().add(this);
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

    public BusinessItem getExtendedBusinessItem() {
        return extendedBusinessItem;
    }

    public void setExtendedBusinessItem(BusinessItem extendedBusinessItem) {
        this.extendedBusinessItem = extendedBusinessItem;
    }
}
