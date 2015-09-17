package org.jbpm.vdml.services;

import org.eclipse.emf.common.util.EList;
import org.jbpm.vdml.services.impl.ExchangeService;
import org.jbpm.vdml.services.impl.MetaBuilder;
import org.jbpm.vdml.services.impl.ParticipantService;
import org.jbpm.vdml.services.impl.VdmlImporter;
import org.jbpm.vdml.services.impl.model.meta.*;
import org.jbpm.vdml.services.impl.model.runtime.*;
import org.jbpm.vdml.services.impl.model.runtime.ExchangeConfiguration;
import org.junit.Test;
import org.omg.smm.Characteristic;
import org.omg.vdml.*;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.Capability;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Milestone;
import org.omg.vdml.PortContainer;
import org.omg.vdml.Role;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.SupplyingStore;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExchangeTest extends MetaEntityImportTest {
    @Test
    public void testCapabilityExchange() throws Exception{
        ValueDeliveryModel vdm = buildModel();
        org.jbpm.vdml.services.impl.model.meta.Collaboration collaboration = buildDefaultCapabilityExchange(vdm);
        ParticipantService participantService = new ParticipantService(getEntityManager());
        IndividualParticipant consumerParticipant = participantService.createIndividualParticipant("Consumer");
        IndividualParticipant supplierParticipant = participantService.createIndividualParticipant("CapabilityProvider");
        EList<Capability> capabilities = vdm.getCapabilitylibrary().get(0).getCapability();

        participantService.setCapabilities(supplierParticipant.getId(),Arrays.asList(MetaBuilder.buildUri(findByName(capabilities, "DoWork"))));
        ExchangeService exchangeService = new ExchangeService(getEntityManager());

        //WHEN
        CollaborationObservation exchange = exchangeService.startExchangeForService(consumerParticipant.getId(), supplierParticipant.getCapabilityOffers().iterator().next().getId());
        //THEN
        assertEquals(2, exchange.getActivities().size());
        assertNotNull(exchange.findActivity(collaboration.findActivity("DefineWork")));
        assertNotNull(exchange.findActivity(collaboration.findActivity("DoWork")));
        assertEquals(2, exchange.getCollaborationRoles().size());
        assertNotNull(exchange.findRole(collaboration.findRole("Consumer")));
        assertNotNull(exchange.findRole(collaboration.findRole("Provider")));
        assertEquals(2, exchange.getSupplyingStores().size());
        assertNotNull(exchange.findSupplyingStore(collaboration.findSupplyingStore("FromAccount")));
        assertNotNull(exchange.findSupplyingStore(collaboration.findSupplyingStore("ToAccount")));
        assertEquals(consumerParticipant.getId(), exchange.findRole(collaboration.findRole("Consumer")).getParticipant().getId());
        assertEquals(supplierParticipant.getId(), exchange.findRole(collaboration.findRole("Provider")).getParticipant().getId());
        assertEquals(consumerParticipant.getId(), exchange.findSupplyingStore(collaboration.findSupplyingStore("FromAccount")).getStore().getOwner().getId());
        assertEquals(supplierParticipant.getId(), exchange.findSupplyingStore(collaboration.findSupplyingStore("ToAccount")).getStore().getOwner().getId());
        assertEquals(consumerParticipant.getId(), exchange.findActivity(collaboration.findActivity("DefineWork")).getCapabilityOffer().getParticipant().getId());
        assertEquals(supplierParticipant.getId(), exchange.findActivity(collaboration.findActivity("DoWork")).getCapabilityOffer().getParticipant().getId());
    }
    @Test
    public void testCommit() throws Exception{
        CollaborationObservation exchange = startExchangeAndProvideQuantities();
        ParticipantService participantService;
        new ExchangeService(getEntityManager()).commitToExchange(exchange.getId());
        //THEN
        participantService=new ParticipantService(getEntityManager());
        StorePerformance fromAccount = participantService.findIndividualParticipant("Consumer").getOfferedStores().iterator().next();
        StorePerformance toAccount = participantService.findIndividualParticipant("CapabilityProvider").getOfferedStores().iterator().next();
        assertEquals(1000d, fromAccount.getInventoryLevel(),0.01);
        assertEquals(2000d, toAccount.getInventoryLevel(),0.01);
        assertEquals(900d, fromAccount.getProjectedInventoryLevel(),0.01);
        assertEquals(2100d, toAccount.getProjectedInventoryLevel(),0.01);
    }
    @Test
    public void testFulfill() throws Exception{
        CollaborationObservation exchange = startExchangeAndProvideQuantities();
        ParticipantService participantService;
        ExchangeService exchangeService = new ExchangeService(getEntityManager());
        exchangeService.commitToExchange(exchange.getId());
        exchangeService.fulfillExchange(exchange.getId());
        //THEN
        participantService=new ParticipantService(getEntityManager());
        StorePerformance fromAccount = participantService.findIndividualParticipant("Consumer").getOfferedStores().iterator().next();
        StorePerformance toAccount = participantService.findIndividualParticipant("CapabilityProvider").getOfferedStores().iterator().next();
        assertEquals(900d, fromAccount.getInventoryLevel(),0.01);
        assertEquals(2100d, toAccount.getInventoryLevel(),0.01);
        assertEquals(900d, fromAccount.getProjectedInventoryLevel(),0.01);
        assertEquals(2100d, toAccount.getProjectedInventoryLevel(),0.01);
    }

    protected CollaborationObservation startExchangeAndProvideQuantities() throws IOException {
        ValueDeliveryModel vdm = buildModel();
        org.jbpm.vdml.services.impl.model.meta.Collaboration collaboration = buildDefaultCapabilityExchange(vdm);
        ParticipantService participantService = new ParticipantService(getEntityManager());
        IndividualParticipant consumerParticipant = participantService.createIndividualParticipant("Consumer");
        IndividualParticipant supplierParticipant = participantService.createIndividualParticipant("CapabilityProvider");
        EList<Capability> capabilities = vdm.getCapabilitylibrary().get(0).getCapability();

        participantService.setCapabilities(supplierParticipant.getId(), Arrays.asList(MetaBuilder.buildUri(findByName(capabilities, "DoWork"))));
        ExchangeService exchangeService = new ExchangeService(getEntityManager());
        CollaborationObservation exchange = exchangeService.startExchangeForService(consumerParticipant.getId(), supplierParticipant.getCapabilityOffers().iterator().next().getId());
        exchange.findSupplyingStore(collaboration.findSupplyingStore("FromAccount")).getStore().setProjectedInventoryLevel(1000d);
        exchange.findSupplyingStore(collaboration.findSupplyingStore("ToAccount")).getStore().setProjectedInventoryLevel(2000d);
        exchange.findSupplyingStore(collaboration.findSupplyingStore("FromAccount")).getStore().setInventoryLevel(1000d);
        exchange.findSupplyingStore(collaboration.findSupplyingStore("ToAccount")).getStore().setInventoryLevel(2000d);
        //WHEN
        for (DirectedFlowObservation flow : exchange.getOwnedDirectedFlows()) {
            if(flow.getDeliverable().getBusinessItemDefinition().getName().equals("Money")){
                flow.getQuantity().setValue(100d);
            }
        }
        exchangeService.flush();
        return exchange;
    }

    protected org.jbpm.vdml.services.impl.model.meta.Collaboration buildDefaultCapabilityExchange(ValueDeliveryModel vdm) throws IOException {
        BusinessItemLibrary bl = vdm.getBusinessItemLibrary().get(0);
        BusinessItemDefinition money = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        bl.getBusinessItemLibraryElement().add(money);
        money.setName("Money");
        BusinessItemDefinition workDefinition = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        bl.getBusinessItemLibraryElement().add(workDefinition);
        workDefinition.setName("WorkDefinition");


        StoreLibrary sl = vdm.getStoreLibrary().get(0);
        StoreDefinition account = VDMLFactory.eINSTANCE.createStoreDefinition();
        sl.getStoreDefinitions().add(account);
        account.setName("Account");
        account.setResource(money);
        Characteristic amount = super.buildDirectMeasure(vdm);
        account.setInventoryLevel(amount);

        CapabilityLibrary cl = vdm.getCapabilitylibrary().get(0);
        CapabilityDefinition doWorkDef = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cl.getCapability().add(doWorkDef);
        doWorkDef.setName("DoWork");

        CapabilityDefinition defineWorkDef = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cl.getCapability().add(defineWorkDef);
        defineWorkDef.setName("DefineWork");

        CapabilityMethod cp = VDMLFactory.eINSTANCE.createCapabilityMethod();
        vdm.getCollaboration().add(cp);
        cp.setName("DoWorkExchange");
        BusinessItem workBusinessItem = addBusinessItem(workDefinition, cp);
        BusinessItem moneyBusinessItem = addBusinessItem(money, cp);


        Role capabilityProvider= VDMLFactory.eINSTANCE.createPerformer();
        cp.getCollaborationRole().add(capabilityProvider);
        capabilityProvider.setName("Provider");

        Role consumer= VDMLFactory.eINSTANCE.createPerformer();
        cp.getCollaborationRole().add(consumer);
        consumer.setName("Consumer");

        SupplyingStore fromAccount = VDMLFactory.eINSTANCE.createSupplyingStore();
        cp.getSupplyingStore().add(fromAccount);
        fromAccount.setName("FromAccount");
        fromAccount.setStoreRequirement(account);
        fromAccount.setSupplyingRole(consumer);
        fromAccount.setInventoryLevel(VDMLFactory.eINSTANCE.createMeasuredCharacteristic());
        fromAccount.getInventoryLevel().setName("amount");
        fromAccount.getInventoryLevel().setCharacteristicDefinition(amount);

        SupplyingStore toAccount = VDMLFactory.eINSTANCE.createSupplyingStore();
        cp.getSupplyingStore().add(toAccount);
        toAccount.setName("ToAccount");
        toAccount.setStoreRequirement(account);
        toAccount.setSupplyingRole(capabilityProvider);
        toAccount.setInventoryLevel(VDMLFactory.eINSTANCE.createMeasuredCharacteristic());
        toAccount.getInventoryLevel().setName("amount");
        toAccount.getInventoryLevel().setCharacteristicDefinition(amount);

        Activity defineWork = VDMLFactory.eINSTANCE.createActivity();
        defineWork.setName("DefineWork");
        defineWork.setCapabilityRequirement(defineWorkDef);
        cp.getActivity().add(defineWork);
        defineWork.setPerformingRole(consumer);


        Activity doWork = VDMLFactory.eINSTANCE.createActivity();
        doWork.setName("DoWork");
        doWork.setCapabilityRequirement(doWorkDef);
        cp.getActivity().add(doWork);
        doWork.setPerformingRole(capabilityProvider);


        Milestone workComplete = VDMLFactory.eINSTANCE.createMilestone();
        workComplete.setName("WorkComplete");
        cp.getMilestone().add(workComplete);

        doWorkDef.setExchangeConfiguration(VDMLFactory.eINSTANCE.createExchangeConfiguration());
        doWorkDef.getExchangeConfiguration().setExchangeMethod(cp);
        doWorkDef.getExchangeConfiguration().setExchangeMilestone(workComplete);
        doWorkDef.getExchangeConfiguration().setSupplierRole(capabilityProvider);


        addDeliverableFlow(cp, workBusinessItem, defineWork, doWork, "providedWorkDefinition", "receivedWorkDefinition", null);
        addDeliverableFlow(cp, moneyBusinessItem, fromAccount, doWork, "paidMoney", "receivedMoney", amount).setMilestone(workComplete);
        addDeliverableFlow(cp, moneyBusinessItem, doWork, toAccount, "receivedMoney", "savedMoney", amount).setMilestone(workComplete);

        vdm.eResource().save(new ByteArrayOutputStream(), null);
        VdmlImporter vi = new VdmlImporter(getEntityManager());
        vi.buildModel(vdm);
        org.jbpm.vdml.services.impl.model.meta.Collaboration collaboration = vi.buildCollaboration(cp);
        return collaboration;
    }


}
