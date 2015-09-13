package org.jbpm.vdml.services;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jbpm.vdml.services.impl.MetaBuilder;
import org.jbpm.vdml.services.impl.VdmlImporter;
import org.jbpm.vdml.services.model.meta.*;
import org.jbpm.vdml.services.model.meta.Collaboration;
import org.junit.Test;
import org.omg.smm.MeasureLibrary;
import org.omg.vdml.*;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.SupplyingStore;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.omg.vdml.util.VDMLResourceImpl;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class CollaborationImportTest extends MetaEntityImportTest {


    @Test
    public void testActivityNetwork() throws Exception {
        ValueDeliveryModel vdm = buildModel();

        StoreLibrary sl = VDMLFactory.eINSTANCE.createStoreLibrary();
        vdm.getStoreLibrary().add(sl);
        StoreDefinition sd = VDMLFactory.eINSTANCE.createStoreDefinition();
        sl.getStoreDefinitions().add(sd);
        sd.setName("SupplyStuffDef");

        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        vdm.getCapabilitylibrary().add(cl);
        CapabilityDefinition cd = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cl.getCapability().add(cd);
        cd.setName("DoStuffDef");

        CapabilityMethod cp = VDMLFactory.eINSTANCE.createCapabilityMethod();
        vdm.getCollaboration().add(cp);
        cp.setName("MyCapabilityMethod");


        Role role = VDMLFactory.eINSTANCE.createPerformer();
        cp.getCollaborationRole().add(role);
        role.setName("MyRole");

        Activity activity = VDMLFactory.eINSTANCE.createActivity();
        activity.setName("DoStuff");
        activity.setCapabilityRequirement(cd);
        cp.getActivity().add(activity);
        activity.setPerformingRole(role);

        SupplyingStore suppliedStore = VDMLFactory.eINSTANCE.createSupplyingStore();
        suppliedStore.setName("SupplyStuff");
        suppliedStore.setStoreRequirement(sd);
        cp.getSupplyingStore().add(suppliedStore);
        suppliedStore.setSupplyingRole(role);

        DeliverableFlow flow = VDMLFactory.eINSTANCE.createDeliverableFlow();
        cp.getFlow().add(flow);
        flow.setDeliverable(VDMLFactory.eINSTANCE.createBusinessItem());
        cp.getBusinessItem().add(flow.getDeliverable());
        flow.setName("GoWithTheFlow");
        flow.setProvider(VDMLFactory.eINSTANCE.createOutputPort());
        flow.getProvider().setName("from");
        activity.getContainedPort().add(flow.getProvider());
        flow.setRecipient(VDMLFactory.eINSTANCE.createInputPort());
        flow.getRecipient().setName("to");
        suppliedStore.getContainedPort().add(flow.getRecipient());

        vdm.eResource().save(new ByteArrayOutputStream(), null);
        //WHEN
        Collaboration collaboration = new VdmlImporter(emf.createEntityManager()).buildCollaboration(cp);
        //THEN
        assertEquals(cp.getName(), collaboration.getName());
        assertEquals(1, collaboration.getRoles().size());
        assertEquals("MyRole", collaboration.getRoles().iterator().next().getName());
        assertSame(collaboration, collaboration.getRoles().iterator().next().getCollaboration());

        assertEquals(1, collaboration.getActivities().size());
        assertEquals("DoStuff", collaboration.getActivities().iterator().next().getName());
        assertSame(collaboration, collaboration.getActivities().iterator().next().getCollaboration());
        assertEquals("MyRole", collaboration.getActivities().iterator().next().getPerformingRole().getName());
        assertSame(collaboration.getRoles().iterator().next(), collaboration.getActivities().iterator().next().getPerformingRole());

        assertEquals(1, collaboration.getSupplyingStores().size());
        assertSame(collaboration.getRoles().iterator().next(), collaboration.getSupplyingStores().iterator().next().getSupplyingRole());
        assertEquals("SupplyStuff", collaboration.getSupplyingStores().iterator().next().getName());
        assertSame(collaboration, collaboration.getSupplyingStores().iterator().next().getCollaboration());
        assertEquals("MyRole", collaboration.getSupplyingStores().iterator().next().getSupplyingRole().getName());

        assertEquals(1, collaboration.getFlows().size());
        assertEquals("GoWithTheFlow", collaboration.getFlows().iterator().next().getName());
        assertSame(collaboration.getActivities().iterator().next(), collaboration.getFlows().iterator().next().getSourcePortContainer());
        assertSame(collaboration.getSupplyingStores().iterator().next(), collaboration.getFlows().iterator().next().getTargetPortContainer());
        assertEquals("from", collaboration.getFlows().iterator().next().getSourceName());
        assertEquals("to", collaboration.getFlows().iterator().next().getTargetName());

    }
    @Test
    public void testResourceUse() throws Exception {
        ValueDeliveryModel vdm = buildModel();

        StoreLibrary sl = VDMLFactory.eINSTANCE.createStoreLibrary();
        vdm.getStoreLibrary().add(sl);
        StoreDefinition sd = VDMLFactory.eINSTANCE.createStoreDefinition();
        sl.getStoreDefinitions().add(sd);
        sd.setName("SupplyStuffDef");

        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        vdm.getCapabilitylibrary().add(cl);
        CapabilityDefinition cd = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cl.getCapability().add(cd);
        cd.setName("DoStuffDef");

        CapabilityMethod cp = VDMLFactory.eINSTANCE.createCapabilityMethod();
        vdm.getCollaboration().add(cp);
        cp.setName("MyCapabilityMethod");
        InputPort capabilityMethodInputPort=VDMLFactory.eINSTANCE.createInputPort();
        capabilityMethodInputPort.setName("capabilityMethodInputPort");
        cp.getContainedPort().add(capabilityMethodInputPort);

        Role role = VDMLFactory.eINSTANCE.createPerformer();
        cp.getCollaborationRole().add(role);
        role.setName("MyRole");

        Activity activity = VDMLFactory.eINSTANCE.createActivity();
        activity.setName("DoStuff");
        activity.setCapabilityRequirement(cd);
        cp.getActivity().add(activity);
        activity.setPerformingRole(role);
        InputPort activityInputPort=VDMLFactory.eINSTANCE.createInputPort();
        activityInputPort.setName("activityInputPort");
        activity.getContainedPort().add(activityInputPort);

        ResourceUse  resourceUse=VDMLFactory.eINSTANCE.createResourceUse();
        resourceUse.setName("resourceUse");
        resourceUse.setDuration(VDMLFactory.eINSTANCE.createMeasuredCharacteristic());
        resourceUse.getDuration().setCharacteristicDefinition(buildDirectMeasure(vdm.getMetricsModel().get(0).getLibraries().get(0)));
        resourceUse.setQuantity(VDMLFactory.eINSTANCE.createMeasuredCharacteristic());
        resourceUse.getQuantity().setCharacteristicDefinition(buildDirectMeasure(vdm.getMetricsModel().get(0).getLibraries().get(0)));
        activity.getResourceUse().add(resourceUse);


        SupplyingStore suppliedStore = VDMLFactory.eINSTANCE.createSupplyingStore();
        suppliedStore.setName("SupplyStuff");
        suppliedStore.setStoreRequirement(sd);
        cp.getSupplyingStore().add(suppliedStore);
        suppliedStore.setSupplyingRole(role);

        DeliverableFlow flow = VDMLFactory.eINSTANCE.createDeliverableFlow();
        cp.getFlow().add(flow);
        flow.setDeliverable(VDMLFactory.eINSTANCE.createBusinessItem());
        cp.getBusinessItem().add(flow.getDeliverable());
        flow.setName("GoWithTheFlow");
        flow.setProvider(VDMLFactory.eINSTANCE.createOutputPort());
        flow.getProvider().setName("from");
        activity.getContainedPort().add(flow.getProvider());
        flow.setRecipient(VDMLFactory.eINSTANCE.createInputPort());
        flow.getRecipient().setName("to");
        suppliedStore.getContainedPort().add(flow.getRecipient());

        InputDelegation inputDelegation=VDMLFactory.eINSTANCE.createInputDelegation();
        cp.getInternalPortDelegation().add(inputDelegation);
        inputDelegation.setName("inputDelegation");
        inputDelegation.setSource(capabilityMethodInputPort);
        inputDelegation.setTarget(activityInputPort);

        resourceUse.getResource().add(inputDelegation.getTarget());
        resourceUse.setDeliverable(flow.getProvider());

        vdm.eResource().save(new ByteArrayOutputStream(), null);
        //WHEN
        Collaboration collaboration = new VdmlImporter(emf.createEntityManager()).buildCollaboration(cp);
        //THEN
        assertEquals(cp.getName(), collaboration.getName());

        assertEquals(1, collaboration.getActivities().size());
        assertEquals("DoStuff", collaboration.getActivities().iterator().next().getName());
        assertEquals(1, collaboration.getActivities().iterator().next().getResourceUses().size());
        assertSame(collaboration.getActivities().iterator().next().getConcludedFlows().iterator().next(), collaboration.getActivities().iterator().next().getResourceUses().iterator().next().getInput());
        assertSame(collaboration.getActivities().iterator().next().getCommencedFlows().iterator().next(), collaboration.getActivities().iterator().next().getResourceUses().iterator().next().getOutput());
    }
}
