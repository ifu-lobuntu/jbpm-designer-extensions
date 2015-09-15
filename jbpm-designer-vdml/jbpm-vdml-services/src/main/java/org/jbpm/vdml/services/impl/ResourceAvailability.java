package org.jbpm.vdml.services.impl;

import java.io.Serializable;
import java.util.Date;

public class ResourceAvailability implements Serializable{
    private Date startDate;
    private Date endDate;
    private Double quantity;

    public ResourceAvailability() {
    }

    public ResourceAvailability(Date startDate, Date endDate, Double quantity) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantity = quantity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Double getQuantity() {
        return quantity;
    }
}
