package org.jbpm.designer.vdan;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.vdml.AbstractVdmlDiagramMarshallingTest;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.junit.Test;
import org.omg.smm.Characteristic;
import org.omg.vdml.*;

public class ActivityNetworkDiagramMarshallingTest extends AbstractVdanDiagramMarshallingTest {
    @Test
    public void testValueAdd() throws Exception {
        final Role role = addRole("MyRole", true);
        final Role role2 = addRole("YourRole", true);
        final ValuePropositionComponent vpc1 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        final ValueProposition vp = addValueProposition(role, role2, false);
        vp.getComponent().add(vpc1);
        vpc1.setName("ploopla");
        final ValuePropositionComponent vpc2 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
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
        Characteristic characteristic = super.characteristic1;
        valueAdd.setValueMeasurement(buildMeasuredCharacteristic(characteristic));
        valueAdd.getAggregatedTo().add(vpc1);
        saveCollaborationResource();

        super.assertOutputValid(new CollaborationInitializer() {
            @Override
            public void initialize(ValueDeliveryModel vdm) {
                Collaboration c = vdm.getCollaboration().get(0);
                Role tmpRole = addRole("MyRole", c);
                tmpRole.setId(role.getId());
                Role tmpRole2 = addRole("YourRole", c);
                tmpRole2.setId(role2.getId());
                ValueProposition tmpVp = addValueProposition(tmpRole, tmpRole2, false);
                tmpVp.setId(vp.getId());
                ValuePropositionComponent tmpvpc1 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
                tmpVp.getComponent().add(tmpvpc1);
                tmpvpc1.setName(vpc1.getName());
                tmpvpc1.setId(vpc1.getId());
                ValuePropositionComponent tmpVpc2= VDMLFactory.eINSTANCE.createValuePropositionComponent();
                tmpVp.getComponent().add(tmpVpc2);
                tmpVpc2.setName(vpc2.getName());
                tmpVpc2.setId(vpc2.getId());

            }
        });
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
        resourceUse.setQuantity(buildMeasuredCharacteristic(characteristic1));
        activity1.getResourceUse().add(resourceUse);
        
        addEdge(resourceUse, ip, op);
        saveCollaborationResource();
        super.assertOutputValid(null);

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
        addMeasuredCharacteristic(this.characteristic1, activity1.getMeasuredCharacteristic());

        addShapeFor(role, activity1);
        addPorts("MyActivity1", role, activity1);
        role.getPerformedWork().add(activity1);
        addPorts("MyCollaboration", role, collaboration);
        DeliverableFlow deliverableFlow1 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow1.setProvider((OutputPort) store.getContainedPort().get(1));
        deliverableFlow1.setRecipient((InputPort) activity1.getContainedPort().get(0));
        deliverableFlow1.setDeliverable(VDMLFactory.eINSTANCE.createBusinessItem());
        deliverableFlow1.getDeliverable().setDefinition(businessItemDefinition1);
        deliverableFlow1.getDeliverable().setName(businessItemDefinition1.getName());
        deliverableFlow1.setName(businessItemDefinition1.getName());
        collaboration.getFlow().add(deliverableFlow1);
        collaboration.getBusinessItem().add(deliverableFlow1.getDeliverable());
        addEdge(deliverableFlow1, store.getContainedPort().get(1), activity1.getContainedPort().get(0));
        DeliverableFlow deliverableFlow2 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow2.setName("Flow2");
        deliverableFlow2.setProvider((OutputPort) activity1.getContainedPort().get(1));
        deliverableFlow2.setRecipient((InputPort) store.getContainedPort().get(0));
        collaboration.getFlow().add(deliverableFlow2);
        addEdge(deliverableFlow2, activity1.getContainedPort().get(1), store.getContainedPort().get(0));
        saveCollaborationResource();

        super.assertOutputValid(new MyCollaborationInitializer(orgUnit, store));
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
        final Pool store = VDMLFactory.eINSTANCE.createPool();
        store.setName("MyPool");
        store.setDescription("My store description");
        final OrgUnit orgUnit = VDMLFactory.eINSTANCE.createOrgUnit();
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
        super.assertOutputValid(new MyCollaborationInitializer(orgUnit, store));
    }
    @Test
    public void testSupplingStore() throws Exception {
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        SupplyingStore store = VDMLFactory.eINSTANCE.createSupplyingStore();
        store.setName("MySupplyingStore");
        store.setDescription("My store description");
        collaboration.getSupplyingStore().add(store);
        store.setSupplyingRole(role);
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
        super.assertOutputValid(null);
    }
    @Test
    public void testSupplingPool() throws Exception {
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        SupplyingPool store = VDMLFactory.eINSTANCE.createSupplyingPool();
        store.setName("MySupplyingPool");
        store.setDescription("My store description");
        collaboration.getSupplyingStore().add(store);
        store.setSupplyingRole(role);
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
        super.assertOutputValid(null);
    }
    @Test
    public void testInternalDelegations() throws Exception {
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
        super.assertOutputValid(null);
    }
    @Test
    public void testDelegationContext() throws Exception {
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
        Resource externalCollaborationResource = resourceSet.createResource(URI.createPlatformResourceURI("/jbpm-designer-vdml-backend/target/calledCollaboration.vdcol", true));
        ValueDeliveryModel externalVdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        externalCollaborationResource.getContents().add(externalVdm);
        CapabilityMethod externalCapabilityMethod = VDMLFactory.eINSTANCE.createCapabilityMethod();
        externalCapabilityMethod.setName("externalCapabilityMethod");
        externalVdm.getCollaboration().add(externalCapabilityMethod);
        Role externalRole = addRole("TargetRole", externalCapabilityMethod);
        addInputPort(externalCapabilityMethod, "externalIn");
        addOutputPort(externalCapabilityMethod, "externalOut");
        addShapeFor(role, activity2);
        addPorts("MyActivity2", role, activity2);
        DelegationContext dc = VDMLFactory.eINSTANCE.createDelegationContext();
        dc.setName(activity2.getName() + "DelegationContext");
        VdmlUmlHelper.findOrCreateDefaultScenario(valueDeliveryModel).getDelegationtContext().add(dc);
        dc.setContextCollaboration(externalCapabilityMethod);
        dc.setDelegatedActivity(activity2);
        InputDelegation inputDelegation = VDMLFactory.eINSTANCE.createInputDelegation();
        inputDelegation.setTarget((InputPort) externalCapabilityMethod.getContainedPort().get(0));
        inputDelegation.setSource((InputPort) activity2.getContainedPort().get(0));
        dc.getContextBasedPortDelegation().add(inputDelegation);

        OutputDelegation outputDelegation = VDMLFactory.eINSTANCE.createOutputDelegation();
        outputDelegation.setTarget((OutputPort) activity2.getContainedPort().get(1));
        outputDelegation.setSource((OutputPort) externalCapabilityMethod.getContainedPort().get(1));
        dc.getContextBasedPortDelegation().add(outputDelegation);
        Assignment assignment = VDMLFactory.eINSTANCE.createAssignment();
        assignment.setParticipant(role);
        assignment.setAssignedRole(externalRole);
        dc.getContextBasedAssignment().add(assignment);
        saveCollaborationResource();
        externalCollaborationResource.save(profile.buildDefaultResourceOptions());
        super.assertOutputValid(null);
    }

    private void addPorts(String prefix, VdmlElement parent, PortContainer pc) {
        addInputPort(parent, pc, prefix + "InputPort");
        addOutputPort(parent, pc, prefix + "OutputPort");
    }

    private class MyCollaborationInitializer implements CollaborationInitializer {
        private final OrgUnit orgUnit;
        private final Store store;

        public MyCollaborationInitializer(OrgUnit orgUnit, Store store) {
            this.orgUnit = orgUnit;
            this.store = store;
        }

        @Override
        public void initialize(ValueDeliveryModel vdm) {
            Store tmpStore = this.store instanceof Pool? VDMLFactory.eINSTANCE.createPool():VDMLFactory.eINSTANCE.createStore();
            tmpStore.setName("MyPool");
            tmpStore.setDescription("My tmpStore description");
            tmpStore.setId(store.getId());
            final OrgUnit tmpOrgUnit = VDMLFactory.eINSTANCE.createOrgUnit();
            tmpOrgUnit.setId(orgUnit.getId());
            vdm.getCollaboration().add(tmpOrgUnit);
            tmpOrgUnit.setName(collaboration.getName() + "OrgUnit");
            tmpOrgUnit.getOwnedStore().add(tmpStore);
        }
    }
}
