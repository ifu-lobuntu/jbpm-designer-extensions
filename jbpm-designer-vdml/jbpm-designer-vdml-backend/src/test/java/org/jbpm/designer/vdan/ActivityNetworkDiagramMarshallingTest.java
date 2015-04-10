package org.jbpm.designer.vdan;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.vdml.VdmlHelper;
import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
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
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.VdmlElement;

public class ActivityNetworkDiagramMarshallingTest extends AbstractVdanDiagramMarshallingTest {
    @Test
    public void testValueAdd() throws Exception {
        Role role = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        ValuePropositionComponent vpc1 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        ValueProposition vp = addValueProposition(role, role2, false);
        vp.getComponent().add(vpc1);
        vpc1.setName("ploopla");
        ValuePropositionComponent vpc2 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        vp.getComponent().add(vpc2);
        vpc2.setName("paapla");
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        role.getPerformedWork().add(activity1);
        collaboration.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        ValueAdd valueAdd = VDMLFactory.eINSTANCE.createValueAdd();
        valueAdd.setName("myValueAdd");
        OutputPort op = (OutputPort) activity1.getContainedPort().get(1);
        op.getValueAdd().add(valueAdd);
        addShapeFor(op, valueAdd);
        valueAdd.setValueMeasurement(VDMLFactory.eINSTANCE.createMeasuredCharacteristic());
        valueAdd.getValueMeasurement().setCharacteristicDefinition(super.characteristic1);
        valueAdd.getAggregatedTo().add(vpc1);
        saveCollaborationResource();

        super.assertOutputValid();
        Diagram json = unmarshaller.convert(diagramResource);
        String valueMeasure = json.findChildShapeById(valueAdd.getId()).getProperty("valueMeasure");
        assertTrue(valueMeasure.contains(measure1.getName()));
        String aggregatedTo = json.findChildShapeById(valueAdd.getId()).getProperty("aggregatedTo");
        assertTrue(aggregatedTo.contains(vpc1.getName()));
        
        json.findChildShapeById(valueAdd.getId()).putProperty("valueMeasure", measure2.getName() + "|" + measure2.eResource().getURI().toPlatformString(true));
        json.findChildShapeById(valueAdd.getId()).putProperty("aggregatedTo", vpc2.getName() +"|" + collaborationResource.getURI().toPlatformString(true));
        
        XMLResource outputResource = marshaller.convert(json);
        Collaboration foundCollaboration=VdmlHelper.getCollaboration(outputResource);
        ValueAdd foundValueAdd= (ValueAdd) foundCollaboration.eResource().getEObject(valueAdd.getId());
        assertEquals(characteristic2.getName(), foundValueAdd.getValueMeasurement().getCharacteristicDefinition().getName());
        assertEquals(vpc2.getId(), foundValueAdd.getAggregatedTo().get(0).getId());
    }

    @Test
    public void testResourceUse() throws Exception {
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        role.getPerformedWork().add(activity1);
        collaboration.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        InputPort ip = (InputPort) activity1.getContainedPort().get(0);
        OutputPort op = (OutputPort) activity1.getContainedPort().get(1);
        ResourceUse resourceUse = VDMLFactory.eINSTANCE.createResourceUse();
        resourceUse.setDeliverable(op);
        resourceUse.getResource().add(ip);
        resourceUse.setQuantity(VDMLFactory.eINSTANCE.createMeasuredCharacteristic());
        resourceUse.getQuantity().setCharacteristicDefinition(characteristic1);
        activity1.getResourceUse().add(resourceUse);
        
        addEdge(resourceUse, ip, op);
        saveCollaborationResource();
        super.assertOutputValid();

        Diagram json = unmarshaller.convert(diagramResource);
        String valueMeasure = json.findChildShapeById(resourceUse.getId()).getProperty("quantityMeasure");
        assertTrue(valueMeasure.contains(measure1.getName()));
        
        json.findChildShapeById(resourceUse.getId()).putProperty("quantityMeasure", measure2.getName() + "|" + measure2.eResource().getURI().toPlatformString(true));
        
        Collaboration foundCollaboration = VdmlHelper.getCollaboration(marshaller.convert(json));
        ResourceUse foundResourceUse=(ResourceUse) foundCollaboration.eResource().getEObject(resourceUse.getId());
        assertEquals(characteristic2.getName(), foundResourceUse.getQuantity().getCharacteristicDefinition().getName());
    
    }

    @Test
    public void testPortContainersAndDeliverableFlows() throws Exception {
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        Store store = VDMLFactory.eINSTANCE.createStore();
        store.setName("MyStore");
        store.setDescription("My store description");
        OrgUnit orgUnit = VDMLFactory.eINSTANCE.createOrgUnit();
        valueDeliveryModel.getCollaboration().add(orgUnit);
        orgUnit.setName(collaboration.getName() + "OrgUnit");
        orgUnit.getOwnedStore().add(store);
        addShapeFor(role, store);
        addPorts("MyStore", role, store);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        collaboration.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        role.getPerformedWork().add(activity1);
        addPorts("MyCollaboration", role, collaboration);
        DeliverableFlow deliverableFlow1 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow1.setName("Safd");
        deliverableFlow1.setProvider((OutputPort) store.getContainedPort().get(1));
        deliverableFlow1.setRecipient((InputPort) activity1.getContainedPort().get(0));
        deliverableFlow1.setDeliverable(VDMLFactory.eINSTANCE.createBusinessItem());
        deliverableFlow1.getDeliverable().setDefinition(businessItemDefinition1);
        deliverableFlow1.getDeliverable().setName(businessItemDefinition1.getName());
        collaboration.getFlow().add(deliverableFlow1);
        addEdge(deliverableFlow1, store.getContainedPort().get(1), activity1.getContainedPort().get(0));
        DeliverableFlow deliverableFlow2 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow2.setName("Safd");
        deliverableFlow2.setProvider((OutputPort) activity1.getContainedPort().get(1));
        deliverableFlow2.setRecipient((InputPort) store.getContainedPort().get(0));
        collaboration.getFlow().add(deliverableFlow2);
        addEdge(deliverableFlow2, activity1.getContainedPort().get(1), store.getContainedPort().get(0));
        saveCollaborationResource();
        super.assertOutputValid();
        Diagram json = unmarshaller.convert(diagramResource);
        String deliverable = json.findChildShapeById(deliverableFlow1.getId()).getProperty("deliverableDefinition");
        assertTrue(deliverable.contains(businessItemDefinition1.getQualifiedName()));
        
        json.findChildShapeById(deliverableFlow1.getId()).putProperty("deliverableDefinition", businessItemDefinition2.getQualifiedName() + "|" + businessItemDefinition2.eResource().getURI().toPlatformString(true));
        
        Collaboration foundCollaboration = VdmlHelper.getCollaboration(marshaller.convert(json));
        DeliverableFlow foundDeliverableFlow=(DeliverableFlow) foundCollaboration.eResource().getEObject(deliverableFlow1.getId());
        assertEquals(businessItemDefinition2.getQualifiedName(), foundDeliverableFlow.getDeliverable().getDefinition().getQualifiedName());

    }

    @Test
    public void testPool() throws Exception {
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        Pool store = VDMLFactory.eINSTANCE.createPool();
        store.setName("MyPool");
        store.setDescription("My store description");
        OrgUnit orgUnit = VDMLFactory.eINSTANCE.createOrgUnit();
        valueDeliveryModel.getCollaboration().add(orgUnit);
        orgUnit.setName(collaboration.getName() + "OrgUnit");
        orgUnit.getOwnedStore().add(store);
        addShapeFor(role, store);
        addPorts("MyStore", role, store);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        collaboration.getActivity().add(activity1);
        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        role.getPerformedWork().add(activity1);
        addPorts("MyCollaboration", role, collaboration);
        DeliverableFlow deliverableFlow1 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow1.setName("Safd");
        deliverableFlow1.setProvider((OutputPort) store.getContainedPort().get(1));
        deliverableFlow1.setRecipient((InputPort) activity1.getContainedPort().get(0));
        collaboration.getFlow().add(deliverableFlow1);
        addEdge(deliverableFlow1, store.getContainedPort().get(1), activity1.getContainedPort().get(0));
        DeliverableFlow deliverableFlow2 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow2.setName("Safd");
        deliverableFlow2.setProvider((OutputPort) activity1.getContainedPort().get(1));
        deliverableFlow2.setRecipient((InputPort) store.getContainedPort().get(0));
        collaboration.getFlow().add(deliverableFlow2);
        addEdge(deliverableFlow2, activity1.getContainedPort().get(1), store.getContainedPort().get(0));
        saveCollaborationResource();
        super.assertOutputValid();
    }

    @Test
    public void testDelegations() throws Exception {
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        addPorts("MyCollaboration", role, collaboration);
        Activity activity2 = VDMLFactory.eINSTANCE.createActivity();
        activity2.setName("MyActivity2");
        activity2.setDescription("My Activity2's description");
        role.getPerformedWork().add(activity2);
        collaboration.getActivity().add(activity2);
        addShapeFor(role, activity2);
        addPorts("MyActivity2", role, activity2);
        InputDelegation inputDelegation = VDMLFactory.eINSTANCE.createInputDelegation();
        inputDelegation.setSource((InputPort) collaboration.getContainedPort().get(0));
        inputDelegation.setTarget((InputPort) activity2.getContainedPort().get(0));
        collaboration.getInternalPortDelegation().add(inputDelegation);
        addEdge(inputDelegation, collaboration.getContainedPort().get(0), activity2.getContainedPort().get(0));

        OutputDelegation outputDelegation = VDMLFactory.eINSTANCE.createOutputDelegation();
        outputDelegation.setSource((OutputPort) activity2.getContainedPort().get(1));
        outputDelegation.setTarget((OutputPort) collaboration.getContainedPort().get(1));
        collaboration.getInternalPortDelegation().add(outputDelegation);
        addEdge(outputDelegation, activity2.getContainedPort().get(1), collaboration.getContainedPort().get(1));
        saveCollaborationResource();
        super.assertOutputValid();
    }

    private void addPorts(String prefix, VdmlElement parent, PortContainer pc) {
        addInputPort(parent, pc, prefix + "InputPort");
        addOutputPort(parent, pc, prefix + "OutputPort");
    }
}
