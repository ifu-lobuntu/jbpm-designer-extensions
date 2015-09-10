package org.jbpm.vdml.services.impl;


import org.jbpm.vdml.services.model.runtime.*;

public class AccountingService {
    public void doCollaborationAccounting(CollaborationObservation collaboration) {
        for (ActivityObservation a : collaboration.getObservedActivities()) {
            for (DeliverableFlowObservation flow : a.getObservedInput()) {
                if (flow.getFromPortContainer() instanceof RoleStorePerformance) {
                    RoleStorePerformance rsp = (RoleStorePerformance) flow.getFromPortContainer();
                    if (flow.getQuantity() != null) {
                        Measurement q = flow.getQuantity();
                        if (q.getValue() != null) {
                            rsp.setInventoryLevel(rsp.getInventoryLevel() - q.getValue());
                        }
                    }
                }
            }
            for (DeliverableFlowObservation flow : a.getObservedOutput()) {
                if (flow.getToPortContainer() instanceof RoleStorePerformance) {
                    RoleStorePerformance rsp = (RoleStorePerformance) flow.getToPortContainer();
                    if (flow.getQuantity() != null) {
                        Measurement q = flow.getQuantity();
                        if (q.getValue() != null) {
                            rsp.setInventoryLevel(rsp.getInventoryLevel() + q.getValue());
                        }
                    }
                }
            }
        }
    }
}
