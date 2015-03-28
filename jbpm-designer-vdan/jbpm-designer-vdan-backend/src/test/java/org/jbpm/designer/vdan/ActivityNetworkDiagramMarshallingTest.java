package org.jbpm.designer.vdan;

import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.PortContainer;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.VdmlElement;

public class ActivityNetworkDiagramMarshallingTest extends AbstractVdmlDiagramMarshallingTest {
    @Test
    public void testValueAdd() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createRole();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role);
        addShapeFor(capabilityMethod, role);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        role.getPerformedWork().add(activity1);
        capabilityMethod.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        ValueAdd valueAdd = VDMLFactory.eINSTANCE.createValueAdd();
        valueAdd.setName("myValueAdd");
        OutputPort op= (OutputPort) activity1.getContainedPort().get(1);
        op.getValueAdd().add(valueAdd);
        addShapeFor(op, valueAdd);
        super.assertOutputValid();
    }
    @Test
    public void testResourceUse() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createRole();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role);
        addShapeFor(capabilityMethod, role);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        role.getPerformedWork().add(activity1);
        capabilityMethod.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        InputPort ip= (InputPort) activity1.getContainedPort().get(0);
        OutputPort op= (OutputPort) activity1.getContainedPort().get(1);
        ResourceUse resourceUse = VDMLFactory.eINSTANCE.createResourceUse();
        resourceUse.setDeliverable(op);
        resourceUse.getResource().add(ip);
        activity1.getResourceUse().add(resourceUse);
        addEdge(resourceUse,ip,op);
        super.assertOutputValid();
    }
    @Test
    public void testPortContainersAndDeliverableFlows() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createRole();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role);
        addShapeFor(capabilityMethod, role);
        Store store = VDMLFactory.eINSTANCE.createStore();
        store.setName("MyStore");
        store.setDescription("My store description");
        OrgUnit orgUnit=VDMLFactory.eINSTANCE.createOrgUnit();
        valueDeliveryModel.getCollaboration().add(orgUnit);
        orgUnit.setName(capabilityMethod.getName()+"OrgUnit");
        orgUnit.getOwnedStore().add(store);
        addShapeFor(role, store);
        addPorts("MyStore", role, store);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        capabilityMethod.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        role.getPerformedWork().add(activity1);
        addPorts("MyCollaboration",role,  capabilityMethod);
        DeliverableFlow deliverableFlow1 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow1.setName("Safd");
        deliverableFlow1.setProvider((OutputPort) store.getContainedPort().get(1));
        deliverableFlow1.setRecipient((InputPort) activity1.getContainedPort().get(0));
        capabilityMethod.getFlow().add(deliverableFlow1);
        addEdge(deliverableFlow1, store.getContainedPort().get(1), activity1.getContainedPort().get(0));
        DeliverableFlow deliverableFlow2 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow2.setName("Safd");
        deliverableFlow2.setProvider((OutputPort) activity1.getContainedPort().get(1));
        deliverableFlow2.setRecipient((InputPort) store.getContainedPort().get(0));
        capabilityMethod.getFlow().add(deliverableFlow2);
        addEdge(deliverableFlow2, activity1.getContainedPort().get(1), store.getContainedPort().get(0));
        super.assertOutputValid();
    }
    @Test
    public void testPool() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createRole();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role);
        addShapeFor(capabilityMethod, role);
        Pool store = VDMLFactory.eINSTANCE.createPool();
        store.setName("MyPool");
        store.setDescription("My store description");
        OrgUnit orgUnit=VDMLFactory.eINSTANCE.createOrgUnit();
        valueDeliveryModel.getCollaboration().add(orgUnit);
        orgUnit.setName(capabilityMethod.getName()+"OrgUnit");
        orgUnit.getOwnedStore().add(store);
        addShapeFor(role, store);
        addPorts("MyStore", role, store);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        capabilityMethod.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        role.getPerformedWork().add(activity1);
        addPorts("MyCollaboration",role,  capabilityMethod);
        DeliverableFlow deliverableFlow1 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow1.setName("Safd");
        deliverableFlow1.setProvider((OutputPort) store.getContainedPort().get(1));
        deliverableFlow1.setRecipient((InputPort) activity1.getContainedPort().get(0));
        capabilityMethod.getFlow().add(deliverableFlow1);
        addEdge(deliverableFlow1, store.getContainedPort().get(1), activity1.getContainedPort().get(0));
        DeliverableFlow deliverableFlow2 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow2.setName("Safd");
        deliverableFlow2.setProvider((OutputPort) activity1.getContainedPort().get(1));
        deliverableFlow2.setRecipient((InputPort) store.getContainedPort().get(0));
        capabilityMethod.getFlow().add(deliverableFlow2);
        addEdge(deliverableFlow2, activity1.getContainedPort().get(1), store.getContainedPort().get(0));
        super.assertOutputValid();
    }
    @Test
    public void testDelegations() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createRole();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        capabilityMethod.getCollaborationRole().add(role);
        addShapeFor(capabilityMethod, role);
        addPorts("MyCollaboration", role, capabilityMethod);
        Activity activity2 = VDMLFactory.eINSTANCE.createActivity();
        activity2.setName("MyActivity2");
        activity2.setDescription("My Activity2's description");
        role.getPerformedWork().add(activity2);
        capabilityMethod.getActivity().add(activity2);
        addShapeFor(role, activity2);
        addPorts("MyActivity2",role,  activity2);
        InputDelegation inputDelegation = VDMLFactory.eINSTANCE.createInputDelegation();
        inputDelegation.setSource((InputPort) capabilityMethod.getContainedPort().get(0));
        inputDelegation.setTarget((InputPort) activity2.getContainedPort().get(0));
        capabilityMethod.getInternalPortDelegation().add(inputDelegation);
        addEdge(inputDelegation, capabilityMethod.getContainedPort().get(0), activity2.getContainedPort().get(0));

        OutputDelegation outputDelegation = VDMLFactory.eINSTANCE.createOutputDelegation();
        outputDelegation.setSource((OutputPort) activity2.getContainedPort().get(1));
        outputDelegation.setTarget((OutputPort) capabilityMethod.getContainedPort().get(1));
        capabilityMethod.getInternalPortDelegation().add(outputDelegation);
        addEdge(outputDelegation, activity2.getContainedPort().get(1), capabilityMethod.getContainedPort().get(1));
        super.assertOutputValid();
    }

    private void addPorts(String prefix,VdmlElement parent, PortContainer pc) {
        addInputPort(parent, pc, prefix +  "InputPort");
        addOutputPort(parent, pc, prefix+ "OutputPort");
    }
}
