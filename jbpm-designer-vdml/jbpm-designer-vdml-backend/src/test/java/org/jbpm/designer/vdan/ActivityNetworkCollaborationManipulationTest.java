package org.jbpm.designer.vdan;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.vdml.VdmlHelper;
import org.junit.Test;
import org.omg.vdml.*;

public class ActivityNetworkCollaborationManipulationTest extends AbstractVdanDiagramMarshallingTest {
    @Test
    public void testValueAdd() throws Exception{
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
        ValueAdd valueAdd = VDMLFactory.eINSTANCE.createValueAdd();
        valueAdd.setName("myValueAdd");
        OutputPort op= (OutputPort) activity1.getContainedPort().get(1);
        op.getValueAdd().add(valueAdd);
        addShapeFor(op, valueAdd);
        saveCollaborationResource();
        saveDiagramResource();//to generate ids
        Diagram json = unmarshaller.convert(diagramResource);
        Shape outputPortShape = json.findChildShapeById(op.getId());
        outputPortShape.deleteShape(outputPortShape.findChildShapeById(valueAdd.getId()));
        XMLResource xml = marshaller.convert(json);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertNull(c.eResource().getEObject(valueAdd.getId()));
    }
    @Test
    public void testResourceUse() throws Exception{
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
        InputPort ip= (InputPort) activity1.getContainedPort().get(0);
        OutputPort op= (OutputPort) activity1.getContainedPort().get(1);
        ResourceUse resourceUse = VDMLFactory.eINSTANCE.createResourceUse();
        resourceUse.setDeliverable(op);
        resourceUse.getResource().add(ip);
        activity1.getResourceUse().add(resourceUse);
        addEdge(resourceUse, ip, op);
        saveCollaborationResource();
        saveDiagramResource();//to generate ids

        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(resourceUse.getId()));
        XMLResource xml = marshaller.convert(json);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertNull(c.eResource().getEObject(resourceUse.getId()));
        assertNotNull(c.eResource().getEObject(op.getId()));
        assertNotNull(c.eResource().getEObject(ip.getId()));
    }
    @Test
    public void testRole() throws Exception{
        Role role1 = VDMLFactory.eINSTANCE.createPerformer();
        role1.setName("myRole");
        role1.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role1);
        addShapeFor(collaboration, role1);
        
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        collaboration.getActivity().add(activity1);
        addShapeFor(role1, activity1);
        addPorts("MyActivity1", role1, activity1);
        role1.getPerformedWork().add(activity1);
        addPorts("MyCollaboration",role1,  collaboration);

        Role role2 = VDMLFactory.eINSTANCE.createPerformer();
        role2.setName("YourRole");
        role2.setDescription("YourRole's Description");
        collaboration.getCollaborationRole().add(role2);
        addShapeFor(collaboration, role2);
        
        Activity activity2 = VDMLFactory.eINSTANCE.createActivity();
        activity2.setName("YourActivity2");
        activity2.setDescription("asdfasdf");
        collaboration.getActivity().add(activity2);
        addShapeFor(role2, activity2);
        role2.getPerformedWork().add(activity2);
        addPorts("YourActivity2", role2, activity2);

        DeliverableFlow deliverableFlow1 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow1.setName("deliverableFlow1");
        deliverableFlow1.setProvider((OutputPort) activity2.getContainedPort().get(1));
        deliverableFlow1.setRecipient((InputPort) activity1.getContainedPort().get(0));
        collaboration.getFlow().add(deliverableFlow1);
        addEdge(deliverableFlow1, activity2.getContainedPort().get(1), activity1.getContainedPort().get(0));

        DeliverableFlow deliverableFlow2 = VDMLFactory.eINSTANCE.createDeliverableFlow();
        deliverableFlow2.setName("deliverableFlow2");
        deliverableFlow2.setProvider((OutputPort) activity1.getContainedPort().get(1));
        deliverableFlow2.setRecipient((InputPort) activity2.getContainedPort().get(0));
        collaboration.getFlow().add(deliverableFlow2);
        addEdge(deliverableFlow2, activity1.getContainedPort().get(1), activity2.getContainedPort().get(0));
        
        saveCollaborationResource();
        saveDiagramResource();//To generate IDs
        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(role1.getId()));
        XMLResource xml = marshaller.convert(json);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertNull(c.eResource().getEObject(role1.getId()));
        assertNull(c.eResource().getEObject(activity1.getId()));
        assertNull(c.eResource().getEObject(deliverableFlow2.getId()));
        assertNull(c.eResource().getEObject(deliverableFlow1.getId()));
        assertNotNull(c.eResource().getEObject(((InputPort) activity2.getContainedPort().get(0)).getId()));
        assertNotNull(c.eResource().getEObject(((OutputPort) activity2.getContainedPort().get(1)).getId()));
        assertDiagramElementPresent(role2,diagramResource);
        assertDiagramElementPresent(activity2,diagramResource);
        assertDiagramElementPresent(activity2.getContainedPort().get(0),diagramResource);
        assertDiagramElementPresent(activity2.getContainedPort().get(1),diagramResource);
    }
    @Test
    public void testDeliverableFlow() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        Store store = VDMLFactory.eINSTANCE.createStore();
        store.setName("MyStore");
        store.setDescription("My store description");
        OrgUnit orgUnit=VDMLFactory.eINSTANCE.createOrgUnit();
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
        saveDiagramResource();//to generate ids

        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(deliverableFlow1.getId()));
        XMLResource xml = marshaller.convert(json);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertNull(c.eResource().getEObject(deliverableFlow1.getId()));
        assertNotNull(c.eResource().getEObject(deliverableFlow2.getId()));
        assertNotNull(c.eResource().getEObject(((OutputPort) store.getContainedPort().get(1)).getId()));
        assertNotNull(c.eResource().getEObject(((InputPort) activity1.getContainedPort().get(0)).getId()));
    }
    @Test
    public void testSupplyingStores() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createPerformer();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        SupplyingPool store = VDMLFactory.eINSTANCE.createSupplyingPool();
        store.setName("MyPool");
        store.setDescription("My store description");
        OrgUnit orgUnit=VDMLFactory.eINSTANCE.createOrgUnit();
        valueDeliveryModel.getCollaboration().add(orgUnit);
        orgUnit.setName(collaboration.getName() + "OrgUnit");
        collaboration.getSupplyingStore().add(store);
        role.getSupplyingStore().add(store);
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
        saveDiagramResource();//to generate ids

        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(store.getId()));
        XMLResource xml = marshaller.convert(json);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertNull(c.eResource().getEObject(store.getId()));
        assertNull(c.eResource().getEObject(deliverableFlow1.getId()));
        assertNull(c.eResource().getEObject(deliverableFlow2.getId()));
        assertNull(c.eResource().getEObject(((OutputPort) store.getContainedPort().get(1)).getId()));
        assertNull(c.eResource().getEObject(((InputPort) store.getContainedPort().get(0)).getId()));
    }
    @Test
    public void testDelegations() throws Exception{
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
        addPorts("MyActivity2",role,  activity2);
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
        saveDiagramResource();//to generate ids

        Diagram json = unmarshaller.convert(diagramResource);
        json.deleteShape(json.findChildShapeById(inputDelegation.getId()));
        XMLResource xml = marshaller.convert(json);
        Collaboration c = VdmlHelper.getCollaboration(xml);
        assertNull(c.eResource().getEObject(inputDelegation.getId()));
        assertNotNull(c.eResource().getEObject(outputDelegation.getId()));
        assertNotNull(c.eResource().getEObject(((OutputPort) activity2.getContainedPort().get(1)).getId()));
        assertNotNull(c.eResource().getEObject(((OutputPort) collaboration.getContainedPort().get(1)).getId()));
    }

    private void addPorts(String prefix,VdmlElement parent, PortContainer pc) {
        addInputPort(parent, pc, prefix +  "InputPort");
        addOutputPort(parent, pc, prefix+ "OutputPort");
    }
}
