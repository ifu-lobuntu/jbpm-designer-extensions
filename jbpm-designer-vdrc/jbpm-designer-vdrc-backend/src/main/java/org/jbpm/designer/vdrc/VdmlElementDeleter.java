package org.jbpm.designer.vdrc;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.omg.vdml.Activity;
import org.omg.vdml.Assignment;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.PortDelegation;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.util.VDMLSwitch;

public class VdmlElementDeleter extends VDMLSwitch<Object> {
    private Collaboration collaboration;
    private Set<EClass> representedTypes;

    public VdmlElementDeleter(Collaboration collaboration, Set<EClass> managedTypes) {
        super();
        this.representedTypes = managedTypes;
        this.collaboration = collaboration;
    }

    @Override
    public Object caseRole(Role role) {
        for (Activity activity : new ArrayList<Activity>(role.getPerformedWork())) {
            caseActivity(activity);
        }
        for (ValueProposition vp : new ArrayList<ValueProposition>(role.getProvidedProposition())) {
            caseValueProposition(vp);
        }
        for (Assignment a : new ArrayList<Assignment>(role.getAssignment())) {
            caseAssignment(a);
        }
        role.setRoleDefinition(null);
        role.getReceivedProposition().clear();
        role.getPort().clear();
        collaboration.getCollaborationRole().remove(role);
        return super.caseRole(role);
    }

    @Override
    public Object caseActivity(Activity activity) {
        for (Port port : new ArrayList<Port>(activity.getContainedPort())) {
            doSwitch(port);
        }
        collaboration.getActivity().remove(activity);
        activity.setPerformingRole(null);
        activity.setCapabilityRequirement(null);
        activity.setAppliedCapabilityOffer(null);
        return super.caseActivity(activity);
    }

    @Override
    public Object caseInputPort(InputPort ip) {
        DeliverableFlow input = ip.getInput();
        ip.setInput(null);
        ip.setHandler(null);
        doSwitch(input);
        if (ip.eContainer() != null) {
            ((PortContainer) ip.eContainer()).getContainedPort().remove(ip);
        }

        for (InputDelegation inputDelegation : new ArrayList<InputDelegation>(ip.getDelegatedInput())) {
            caseInputDelegation(inputDelegation);
        }
        for (ResourceUse ru : new ArrayList<ResourceUse>(ip.getResourceUse())) {
            caseResourceUse(ru);
        }
        return super.caseInputPort(ip);
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
        ((Activity) object.eContainer()).getResourceUse().remove(object);
        object.setDeliverable(null);
        object.getResource().clear();
        return super.caseResourceUse(object);
    }

    @Override
    public Object caseStore(Store object) {
        for (Port port : new ArrayList<Port>(object.getContainedPort())) {
            doSwitch(port);
        }
        object.setResource(null);
        object.setStoreOwner(null);
        object.getSupportedCapability().clear();
        return super.caseStore(object);
    }

    @Override
    public Object casePool(Pool object) {
        for (Port port : new ArrayList<Port>(object.getContainedPort())) {
            doSwitch(port);
        }
        object.getPosition().clear();
        object.setResource(null);
        object.setStoreOwner(null);
        object.getSupportedCapability().clear();
        return super.caseStore(object);
    }

    @Override
    public Object caseCapabilityOffer(CapabilityOffer object) {
        object.setCapability(null);
        object.setCapabilityProvider(null);
        object.getCapabilityResource().clear();
        object.getApplyingActivity().clear();
        object.getMethod().clear();
        return super.caseCapabilityOffer(object);
    }

    @Override
    public Object caseValueAdd(ValueAdd object) {
        ((OutputPort) object.eContainer()).getValueAdd().remove(object);
        object.getAggregatedFrom().clear();
        object.getAggregatedTo().clear();
        return super.caseValueAdd(object);
    }

    @Override
    public Object caseValueProposition(ValueProposition object) {
        object.setProvider(null);
        object.setRecipient(null);
        for (ValuePropositionComponent c : new ArrayList<ValuePropositionComponent>(object.getComponent())) {
            caseValuePropositionComponent(c);
        }
        return super.caseValueProposition(object);
    }

    @Override
    public Object caseValuePropositionComponent(ValuePropositionComponent object) {
        ((ValueProposition) object.eContainer()).getComponent().remove(object);
        object.getAggregatedFrom().clear();
        object.getAggregatedTo().clear();
        return super.caseValuePropositionComponent(object);
    }

    @Override
    public Object caseInputDelegation(InputDelegation object) {
        object.setTarget(null);
        object.setSource(null);
        collaboration.getInternalPortDelegation().remove(object);
        // TODO in future, do delegation contexts
        return super.caseInputDelegation(object);
    }

    @Override
    public Object caseOutputDelegation(OutputDelegation object) {
        object.setTarget(null);
        object.setSource(null);
        collaboration.getInternalPortDelegation().remove(object);
        // TODO in future, do delegation contexts
        return super.caseOutputDelegation(object);
    }

    public Object caseDeliverableFlow(DeliverableFlow flow) {
        OutputPort provider = flow.getProvider();
        flow.setProvider(null);
        InputPort recipient = flow.getRecipient();
        flow.setRecipient(null);
        if (!representedTypes.contains(VDMLPackage.eINSTANCE.getInputPort())) {
            doSwitch(recipient);
        }
        if (!representedTypes.contains(VDMLPackage.eINSTANCE.getOutputPort())) {
            doSwitch(provider);
        }
        collaboration.getFlow().remove(flow);
        return super.caseDeliverableFlow(flow);
    }

    @Override
    public Object caseOutputPort(OutputPort op) {
        DeliverableFlow output = op.getOutput();
        op.setOutput(null);
        doSwitch(output);
        if (op.eContainer() != null) {
            ((PortContainer) op.eContainer()).getContainedPort().remove(op);
        }
        for (OutputDelegation inputDelegation : new ArrayList<OutputDelegation>(op.getDelegatedOutput())) {
            caseOutputDelegation(inputDelegation);
        }
        for (ValueAdd va : new ArrayList<ValueAdd>(op.getValueAdd())) {
            caseValueAdd(va);
        }
        for (ResourceUse ru : new ArrayList<ResourceUse>(op.getResourceUse())) {
            caseResourceUse(ru);
        }
        return super.caseOutputPort(op);
    }

    public void deleteOrphanedEdges() {
        // Required because source/target bindings may already have done most of
        // the work for us, and we don't like unbounded edges
        for (DeliverableFlow df : new ArrayList<DeliverableFlow>(collaboration.getFlow())) {
            if (df.getProvider() == null || df.getRecipient() == null) {
                doSwitch(df);
            }
        }
        for (PortDelegation df : new ArrayList<PortDelegation>(collaboration.getInternalPortDelegation())) {
            if (df instanceof InputDelegation) {
                InputDelegation id = (InputDelegation) df;
                if (id.getSource() == null || id.getTarget() == null) {
                    doSwitch(df);
                }
            }else{
                OutputDelegation id = (OutputDelegation) df;
                if (id.getSource() == null || id.getTarget() == null) {
                    doSwitch(df);
                }
            }
        }
    }
}
