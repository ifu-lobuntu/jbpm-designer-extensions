package org.jbpm.vdml.services.impl;


import org.eclipse.emf.ecore.EObject;
import org.jbpm.vdml.services.model.meta.*;
import org.jbpm.vdml.services.model.meta.Activity;
import org.jbpm.vdml.services.model.meta.Capability;
import org.jbpm.vdml.services.model.meta.Collaboration;
import org.jbpm.vdml.services.model.meta.DeliverableFlow;
import org.jbpm.vdml.services.model.meta.Role;
import org.jbpm.vdml.services.model.meta.StoreDefinition;
import org.jbpm.vdml.services.model.meta.SupplyingStore;
import org.jbpm.vdml.services.model.meta.ResourceUse;
import org.jbpm.vdml.services.model.meta.BusinessItemDefinition;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.CapabilityLibrary;
import org.omg.vdml.StoreLibrary;

import javax.persistence.EntityManager;

public class VdmlImporter extends MetaBuilder {
    public MeasureBuilder measureBuilder;

    public VdmlImporter() {
    }

    public VdmlImporter(EntityManager entityManager) {
        super(entityManager);
        this.measureBuilder = new MeasureBuilder(entityManager);
    }
    public void buildModel(org.omg.vdml.ValueDeliveryModel vdm) {
        for (CapabilityLibrary l: vdm.getCapabilitylibrary()) {
            for (org.omg.vdml.Capability from : l.getCapability()) {
                Capability to = findOrCreate(from, Capability.class);
                to.setName(from.getName());
                measureBuilder.fromCharacteristics(to.getMeasures(), from.getCharacteristicDefinition());
            }
        }
        for (StoreLibrary library : vdm.getStoreLibrary()) {
            for (org.omg.vdml.StoreDefinition from : library.getStoreDefinitions()) {
                StoreDefinition to = findOrCreate(from, StoreDefinition.class);
                to.setName(from.getName());
                measureBuilder.fromCharacteristics(to.getMeasures(), from.getCharacteristicDefinition());
            }
        }
        for (BusinessItemLibrary library : vdm.getBusinessItemLibrary()) {
            for (org.omg.vdml.BusinessItemLibraryElement from : library.getBusinessItemLibraryElement()) {
                BusinessItemDefinition to = findOrCreate(from, BusinessItemDefinition.class);
                to.setName(from.getName());
                measureBuilder.fromCharacteristics(to.getMeasures(), from.getCharacteristicDefinition());
            }
        }
        entityManager.flush();
    }

    public Collaboration buildCollaboration(org.omg.vdml.Collaboration c) {
        Collaboration result = findOrCreate(c, Collaboration.class);
        result.setName(c.getName());
        for (BusinessItem from: c.getBusinessItem()) {
            BusinessItemDefinition to=findOrCreate(from,BusinessItemDefinition.class,result);
            if(from.getDefinition()!=null){
                to=findOrCreate(from.getDefinition(), BusinessItemDefinition.class, result);
            }else{
                to=findOrCreate(from,BusinessItemDefinition.class,result);
            }
            measureBuilder.fromMeasuredCharacteristics(to.getMeasures(), from.getMeasuredCharacteristic());
        }
        for (org.omg.vdml.Role from : c.getCollaborationRole()) {
            Role to = findOrCreate(from, Role.class, result);
            to.setName(from.getName());
        }
        for (org.omg.vdml.Activity from : c.getActivity()) {
            Activity to = findOrCreate(from, Activity.class, findOrCreate(from.getPerformingRole(), Role.class, result));
            to.setName(from.getName());
            to.setCapabilityRequirement(findOrCreate(from.getCapabilityRequirement(), Capability.class));
            measureBuilder.fromMeasuredCharacteristics(to.getMeasures(), from.getMeasuredCharacteristic());
            to.setCapabilityRequirement(findOrCreate(from.getCapabilityRequirement(),Capability.class));
        }
        for (org.omg.vdml.SupplyingStore from : c.getSupplyingStore()) {
            SupplyingStore to = findOrCreate(from, SupplyingStore.class, findOrCreate(from.getSupplyingRole(), Role.class, result));
            to.setName(from.getName());
            to.setStoreRequirement(findOrCreate(from.getStoreRequirement(), StoreDefinition.class));
            measureBuilder.fromMeasuredCharacteristics(to.getMeasures(), from.getMeasuredCharacteristic());
            to.setStoreRequirement(findOrCreate(from.getStoreRequirement(), StoreDefinition.class));
        }
        for (org.omg.vdml.DeliverableFlow from : c.getFlow()) {
            DeliverableFlow to = findOrCreate(from, DeliverableFlow.class, result);
            to.setName(from.getName());
            to.setRecipientName(from.getRecipient().getName());
            to.setProviderName(from.getProvider().getName());
            to.setProvidingPortContainer(find(from.getProvider().eContainer(), RoleBasedPortContainer.class));
            to.setReceivingPortContainer(find(from.getRecipient().eContainer(), RoleBasedPortContainer.class));
            BusinessItem d = from.getDeliverable();
            if(d.getDefinition()==null){
                to.setDeliverable(find(d, BusinessItemDefinition.class));
            }else {
                to.setDeliverable(find(d.getDefinition(), BusinessItemDefinition.class));
            }
        }
        for (org.omg.vdml.Activity fromActivity : c.getActivity()) {
            Activity toActivity = find(fromActivity,Activity.class);
            for (org.omg.vdml.ResourceUse from : fromActivity.getResourceUse()) {
                ResourceUse to = findOrCreate(from, ResourceUse.class);
                to.setName(from.getName());
                to.setDuration(measureBuilder.findOrCreateMeasure(from.getDuration()));
                to.setQuantity(measureBuilder.findOrCreateMeasure(from.getQuantity()));
                if(from.getResource().size()==1) {
                    to.setInput(find(from.getResource().get(0), DeliverableFlow.class));
                }
                to.setOutput(find(from.getDeliverable(), DeliverableFlow.class));
            }
        }
        return result;
    }

    private <T extends MetaEntity> T find(EObject eObject, Class<T> rt) {
        return entityManager.find(rt, buildUri(eObject));
    }

    public BusinessItemDefinition findBusinessItemDefinition(String s) {
        return entityManager.find(BusinessItemDefinition.class,s);
    }

    public StoreDefinition findStoreDefinition(String s) {
        return entityManager.find(StoreDefinition.class,s);
    }

    public Capability findCapabilityDefinition(String s) {
        return entityManager.find(Capability.class,s);
    }
}
