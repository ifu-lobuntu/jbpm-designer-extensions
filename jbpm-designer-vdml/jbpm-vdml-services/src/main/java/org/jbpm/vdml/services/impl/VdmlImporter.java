package org.jbpm.vdml.services.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.vdml.services.model.meta.*;
import org.jbpm.vdml.services.model.meta.Activity;
import org.jbpm.vdml.services.model.meta.Capability;
import org.jbpm.vdml.services.model.meta.Collaboration;
import org.jbpm.vdml.services.model.meta.DeliverableFlow;
import org.jbpm.vdml.services.model.meta.OutputDelegation;
import org.jbpm.vdml.services.model.meta.PortContainer;
import org.jbpm.vdml.services.model.meta.Role;
import org.jbpm.vdml.services.model.meta.StoreDefinition;
import org.jbpm.vdml.services.model.meta.SupplyingStore;
import org.jbpm.vdml.services.model.meta.ResourceUse;
import org.jbpm.vdml.services.model.meta.BusinessItemDefinition;
import org.jbpm.vdml.services.model.meta.ValueProposition;
import org.jbpm.vdml.services.model.meta.ValuePropositionComponent;
import org.jbpm.vdml.services.model.meta.InputDelegation;
import org.omg.vdml.*;

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
        importCapabilities(vdm);
        importStoreDefinitions(vdm);
        importBusinessItemDefinitions(vdm);
        entityManager.flush();
    }

    private void importBusinessItemDefinitions(ValueDeliveryModel vdm) {
        for (BusinessItemLibrary library : vdm.getBusinessItemLibrary()) {
            for (BusinessItemLibraryElement from : library.getBusinessItemLibraryElement()) {
                BusinessItemDefinition to = findOrCreate(from, BusinessItemDefinition.class);
                to.setName(from.getName());
                measureBuilder.fromCharacteristics(to.getMeasures(), from.getCharacteristicDefinition());
            }
        }
    }

    private void importStoreDefinitions(ValueDeliveryModel vdm) {
        for (StoreLibrary library : vdm.getStoreLibrary()) {
            for (org.omg.vdml.StoreDefinition from : library.getStoreDefinitions()) {
                StoreDefinition to = findOrCreate(from, StoreDefinition.class);
                to.setName(from.getName());
                measureBuilder.fromCharacteristics(to.getMeasures(), from.getCharacteristicDefinition());
            }
        }
    }

    private void importCapabilities(ValueDeliveryModel vdm) {
        for (CapabilityLibrary l: vdm.getCapabilitylibrary()) {
            for (org.omg.vdml.Capability from : l.getCapability()) {
                Capability to = findOrCreate(from, Capability.class);
                to.setName(from.getName());
                measureBuilder.fromCharacteristics(to.getMeasures(), from.getCharacteristicDefinition());
            }
        }
    }

    public Collaboration buildCollaboration(org.omg.vdml.Collaboration c) {
        Collaboration result = findOrCreate(c, Collaboration.class);
        result.setName(c.getName());
        importBusinessItems(c, result);
        importRoles(c, result);
        importActivities(c, result);
        importSupplyingStores(c, result);
        importDeliverableFlows(c, result);
        importValuePropositions(c);
        importPortDelegations(result, c.getInternalPortDelegation());
        importContextBasedPortDelegations(c, result);
        importResourceUses(c);
        entityManager.flush();
        return result;
    }

    private void importContextBasedPortDelegations(org.omg.vdml.Collaboration c, Collaboration result) {
        for (org.omg.vdml.Activity activity : c.getActivity()) {
            for (DelegationContext delegationContext : activity.getDelegationContext()) {
                Collaboration contextCollaboration =findCollaboration(buildUri(delegationContext.getContextCollaboration()));
                if(contextCollaboration==null){
                    buildCollaboration(delegationContext.getContextCollaboration());
                }
                importPortDelegations(result, delegationContext.getContextBasedPortDelegation());
            }
        }
    }

    private void importValuePropositions(org.omg.vdml.Collaboration c) {
        for (org.omg.vdml.Role fromRole : c.getCollaborationRole()) {
            Role role=findRole(buildUri(fromRole));
            for (org.omg.vdml.ValueProposition fromVp : fromRole.getProvidedProposition()) {
                ValueProposition toVp=findOrCreate(fromVp, ValueProposition.class, role, findRole(buildUri(fromVp.getRecipient())));
                toVp.setName(fromVp.getName());
                for (org.omg.vdml.ValuePropositionComponent fromVpc : fromVp.getComponent()) {
                    ValuePropositionComponent toVpc=findOrCreate(fromVp,ValuePropositionComponent.class,toVp);
                    toVpc.setName(fromVpc.getName());
                    measureBuilder.fromMeasuredCharacteristics(toVpc.getMeasures(),fromVpc.getMeasuredCharacteristic());
                }
            }
        }
    }

    private void importResourceUses(org.omg.vdml.Collaboration c) {
        for (org.omg.vdml.Activity fromActivity : c.getActivity()) {
            Activity toActivity = find(fromActivity, Activity.class);
            for (org.omg.vdml.ResourceUse from : fromActivity.getResourceUse()) {
                ResourceUse to = findOrCreate(from, ResourceUse.class,toActivity);
                to.setName(from.getName());
                to.setDuration(measureBuilder.findOrCreateMeasure(from.getDuration()));
                to.setQuantity(measureBuilder.findOrCreateMeasure(from.getQuantity()));
                if(from.getResource().size()==1) {
                    InputPort inputPort = from.getResource().get(0);
                    if(inputPort.getInput()==null){
                        if(inputPort.getDelegatedInput().size()==1){
                            to.setInput(find(inputPort.getDelegatedInput().get(0), InputDelegation.class));
                        }
                    }else {
                        to.setInput(find(inputPort.getInput(), DeliverableFlow.class));
                    }
                }
                OutputPort outputPort = from.getDeliverable();
                if(outputPort.getOutput()==null){
                    if(outputPort.getOutputDelegation().size()==1){
                        to.setInput(find(outputPort.getOutputDelegation().get(0), OutputDelegation.class));
                    }
                }else{
                    to.setOutput(find(outputPort.getOutput(), DeliverableFlow.class));
                }
            }
        }
    }

    private void importDeliverableFlows(org.omg.vdml.Collaboration c, Collaboration result) {
        for (org.omg.vdml.DeliverableFlow from : c.getFlow()) {
            DeliverableFlow to = findOrCreate(from, DeliverableFlow.class, result);
            to.setName(from.getName());
            to.setTargetName(from.getRecipient().getName());
            to.setSourceName(from.getProvider().getName());
            to.setSourcePortContainer(find(from.getProvider().eContainer(), PortContainer.class));
            to.setTargetPortContainer(find(from.getRecipient().eContainer(), PortContainer.class));
            BusinessItem d = from.getDeliverable();
            if(d.getDefinition()==null){
                to.setDeliverable(find(d, BusinessItemDefinition.class));
            }else {
                to.setDeliverable(find(d.getDefinition(), BusinessItemDefinition.class));
            }
            addValueAdds(to, from.getProvider().getValueAdd());
        }
    }

    private void addValueAdds(DirectedFlow to, EList<ValueAdd> valueAdd) {
        for (ValueAdd fromValueAdd : valueAdd) {
            Measure toValueAdd=measureBuilder.findOrCreateMeasure(fromValueAdd.getValueMeasurement());
            if(toValueAdd!=null) {
                to.getValueAdds().add(toValueAdd);
            }
        }
    }

    private void importPortDelegations(Collaboration result, EList<org.omg.vdml.PortDelegation> delegations) {
        for (org.omg.vdml.PortDelegation d : delegations) {
            if(d instanceof org.omg.vdml.InputDelegation) {
                org.omg.vdml.InputDelegation from = (org.omg.vdml.InputDelegation) d;
                InputDelegation to = findOrCreate(from, InputDelegation.class, result);
                to.setName(from.getName());
                to.setTargetName(from.getSource().getName());
                to.setSourceName(from.getTarget().getName());
                to.setSourcePortContainer(find(from.getSource().eContainer(), PortContainer.class));
                to.setTargetPortContainer(find(from.getTarget().eContainer(), PortContainer.class));
                BusinessItemLibraryElement bid = from.getSource().getInputDefinition();
                if (bid == null) {
                    bid = from.getTarget().getInputDefinition();
                }
                if (bid != null) {
                    to.setDeliverable(find(bid, BusinessItemDefinition.class));
                }
            }else {
                org.omg.vdml.OutputDelegation from = (org.omg.vdml.OutputDelegation) d;
                OutputDelegation to = findOrCreate(from, OutputDelegation.class, result);
                to.setName(from.getName());
                to.setTargetName(from.getSource().getName());
                to.setSourceName(from.getTarget().getName());
                to.setSourcePortContainer(find(from.getSource().eContainer(), PortContainer.class));
                to.setTargetPortContainer(find(from.getTarget().eContainer(), PortContainer.class));
                BusinessItemLibraryElement bid = from.getSource().getOutputDefinition();
                if(bid==null){
                    bid=from.getTarget().getOutputDefinition();
                }
                if(bid!=null){
                    to.setDeliverable(find(bid, BusinessItemDefinition.class));
                }
                addValueAdds(to, from.getSource().getValueAdd());
            }
        }
    }

    private void importSupplyingStores(org.omg.vdml.Collaboration c, Collaboration result) {
        for (org.omg.vdml.SupplyingStore from : c.getSupplyingStore()) {
            SupplyingStore to = findOrCreate(from, SupplyingStore.class, findOrCreate(from.getSupplyingRole(), Role.class, result));
            to.setName(from.getName());
            to.setStoreRequirement(findOrCreate(from.getStoreRequirement(), StoreDefinition.class));
            measureBuilder.fromMeasuredCharacteristics(to.getMeasures(), from.getMeasuredCharacteristic());
            to.setStoreRequirement(findOrCreate(from.getStoreRequirement(), StoreDefinition.class));
        }
    }

    private void importActivities(org.omg.vdml.Collaboration c, Collaboration result) {
        for (org.omg.vdml.Activity from : c.getActivity()) {
            Activity to = findOrCreate(from, Activity.class, findOrCreate(from.getPerformingRole(), Role.class, result));
            to.setName(from.getName());
            to.setCapabilityRequirement(findOrCreate(from.getCapabilityRequirement(), Capability.class));
            measureBuilder.fromMeasuredCharacteristics(to.getMeasures(), from.getMeasuredCharacteristic());
            to.setCapabilityRequirement(findOrCreate(from.getCapabilityRequirement(),Capability.class));
        }
    }

    private void importRoles(org.omg.vdml.Collaboration c, Collaboration result) {
        for (org.omg.vdml.Role from : c.getCollaborationRole()) {
            Role to = findOrCreate(from, Role.class, result);
            to.setName(from.getName());
        }
    }

    private void importBusinessItems(org.omg.vdml.Collaboration c, Collaboration result) {
        for (BusinessItem from: c.getBusinessItem()) {
            BusinessItemDefinition to=findOrCreate(from,BusinessItemDefinition.class,result);
            if(from.getDefinition()!=null){
                to=findOrCreate(from.getDefinition(), BusinessItemDefinition.class, result);
            }else{
                to=findOrCreate(from,BusinessItemDefinition.class,result);
            }
            measureBuilder.fromMeasuredCharacteristics(to.getMeasures(), from.getMeasuredCharacteristic());
        }
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

    public Collaboration findCollaboration(String s) {
        return entityManager.find(Collaboration.class,s);
    }

    public Role findRole(String s) {
        return entityManager.find(Role.class,s);
    }
}
