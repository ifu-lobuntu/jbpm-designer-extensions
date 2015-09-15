package org.jbpm.vdml.services.impl.model.runtime;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class Location {
    private String longitude;
    private String lattitude;

    public Location() {
    }

    public Location(String longitude, String lattitude) {
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLattitude() {
        return lattitude;
    }
}
