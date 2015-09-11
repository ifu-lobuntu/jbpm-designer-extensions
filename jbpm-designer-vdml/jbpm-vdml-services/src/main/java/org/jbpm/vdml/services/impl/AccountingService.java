package org.jbpm.vdml.services.impl;


import org.jbpm.vdml.services.model.runtime.*;

public class AccountingService {
    public void doCollaborationAccounting(CollaborationObservation collaboration) {
        for (ActivityObservation a : collaboration.getActivities()) {
            for (DeliverableFlowObservation flow : a.getObservedInput()) {
                if (flow.getFromPortContainer() instanceof SuppliedStoreObservation) {
                    SuppliedStoreObservation rsp = (SuppliedStoreObservation) flow.getFromPortContainer();
                    if (flow.getQuantity() != null) {
                        Measurement q = flow.getQuantity();
                        if (q.getValue() != null) {
                            rsp.getStore().setInventoryLevel(rsp.getStore().getInventoryLevel() - q.getValue());
                        }
                    }
                }
            }
            for (DeliverableFlowObservation flow : a.getObservedOutput()) {
                if (flow.getToPortContainer() instanceof SuppliedStoreObservation) {
                    SuppliedStoreObservation rsp = (SuppliedStoreObservation) flow.getToPortContainer();
                    if (flow.getQuantity() != null) {
                        Measurement q = flow.getQuantity();
                        if (q.getValue() != null) {
                            rsp.getStore().setInventoryLevel(rsp.getStore().getInventoryLevel() + q.getValue());
                        }
                    }
                }
            }
        }
    }
}
