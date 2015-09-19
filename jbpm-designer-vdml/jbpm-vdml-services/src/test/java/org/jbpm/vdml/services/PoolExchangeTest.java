package org.jbpm.vdml.services;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.eclipse.emf.common.util.EList;
import org.geotools.geometry.jts.JTSFactoryFinder;
import org.jbpm.vdml.services.api.model.LinkedExternalObject;
import org.jbpm.vdml.services.api.model.ReusableBusinessItemAvailability;
import org.jbpm.vdml.services.api.model.ReusableBusinessItemRequirement;
import org.jbpm.vdml.services.impl.ExchangeService;
import org.jbpm.vdml.services.impl.MetaBuilder;
import org.jbpm.vdml.services.impl.ParticipantService;
import org.jbpm.vdml.services.impl.VdmlImporter;
import org.jbpm.vdml.services.impl.model.runtime.Address;
import org.jbpm.vdml.services.impl.model.runtime.CollaborationObservation;
import org.jbpm.vdml.services.impl.model.runtime.IndividualParticipant;
import org.jbpm.vdml.services.impl.scheduling.SchedulingUtil;
import org.jbpm.vdml.services.scheduling.SchedulingUtilTest;
import org.joda.time.DateTime;
import org.junit.Test;
import org.omg.smm.Characteristic;
import org.omg.vdml.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by ampie on 2015/09/19.
 */
public class PoolExchangeTest extends AbstractExchangeTest {
    GeometryFactory geometryFactory= JTSFactoryFinder.getGeometryFactory(null);
    //Test scenario where we have ReusableBusinessItemPerformances to track, eg. Tuk Tuk
    //First find the best booking if possible, in to steps
    // A. Find BusinessItemPerformance
    // 1. In the area
    // 2. In the PoolPerformance (optional?)
    // 3. Meeting Quality Requirements (Maybe later)
    // B. Use OptaPlanner to find best mathc
    // 1. Use location
    // 2. Use schedule
    // 3. Use PlannedUnavailability
    // 4. Use most likely location
    @Test
    public void testFind() throws Exception {
        ValueDeliveryModel vdm = buildModel();
        org.jbpm.vdml.services.impl.model.meta.Collaboration collaboration = buildDefaultStoreExchange(vdm);
        ParticipantService participantService = new ParticipantService(getEntityManager());
        IndividualParticipant consumerParticipant = participantService.createIndividualParticipant("Consumer");
        EList<StoreDefinition> storeDefs = vdm.getStoreLibrary().get(0).getStoreDefinitions();
        List<String> storeDefIds = Arrays.asList(MetaBuilder.buildUri(findByName(storeDefs, "ResourcePool")));
        String tukTukDefinitionId = MetaBuilder.buildUri(findByName(vdm.getBusinessItemLibrary().get(0).getBusinessItemLibraryElement(), "TukTukDefinition"));
        IndividualParticipant supplier1 = createSupplier1(participantService, storeDefIds, tukTukDefinitionId);

        ExchangeService exchangeService = new ExchangeService(getEntityManager());

        //WHEN
        ReusableBusinessItemAvailability availability = exchangeService.findAvailability(buildRequirement(tukTukDefinitionId));
        assertNotNull(availability);

    }

    protected IndividualParticipant createSupplier1(ParticipantService participantService, List<String> storeDefIds, String tukTukDefinitionId) {
        IndividualParticipant supplier1 = participantService.createIndividualParticipant("TooFar");
        participantService.setAddress(supplier1.getId(), new Address(geometryFactory.createPoint(new Coordinate(0d, 0d))));
        participantService.setStores(supplier1.getId(), storeDefIds);
        Long bipId=participantService.addResourceToStore(participantService.findParticipant(supplier1.getId()).getOfferedStores().iterator().next().getId(), new LinkedExternalObject(tukTukDefinitionId,"TukTuk","TooFar"));
        participantService.setResourceSchedule(bipId,SchedulingUtilTest.buildSchedule());
        return supplier1;
    }

    protected ReusableBusinessItemRequirement buildRequirement(String tukTukDefinitionId) {
        ReusableBusinessItemRequirement r = new ReusableBusinessItemRequirement();
        r.setBusinessItemDefinitionId(tukTukDefinitionId);
        r.setDuration(3d);
        r.setDurationTimeUnit(TimeUnit.HOURS);
        r.setMaxDistanceInMeter(15000d);
        r.setNotBefore(new DateTime(2015, 10, 1, 10, 0, 0, 0));
        r.setNotAfter(new DateTime(2015, 10, 2, 18, 0, 0, 0));
        r.setLattitude(0d);
        r.setLongitude(0d);
        return r;
    }


    //Schedule the booking
    // 1. Create PlannedUnavailability
    // 2. Associate PlannedUnavailability ProvidingPool and BusinessItemPerformance with ResourceUse,

    //Cancel booking
    // 1. Remove PlannedUnavailability
    // 2. Unassociate PlannedUnavailability ProvidingPool and BusinessItemPerformance with ResourceUse,
    // 3. If PoolExchange then kill the exchange.

    //Commit to the booking
    // 1. Becomes contractually binding - could be automated X hours before, use Scheduler
    // 2. Allocate resource flows from non-pool stores - i.e. ProjectedInventoryLevels


    //Start - could be automated
    // 1. decrement InventoryLevel
    // 2. maybe some payments need to be made (deposit?

    // Fullfill - could be automated
    // 1. Increment InventoryLevel
    // 2. Delete PlannedUnavailability
    // 3. Effect payments
    protected org.jbpm.vdml.services.impl.model.meta.Collaboration buildDefaultStoreExchange(ValueDeliveryModel vdm) throws IOException {
        BusinessItemDefinition money = createMoney(vdm);


        StoreDefinition account = createAccount(vdm, money);
        Characteristic amount = createAmount(vdm);
        account.setInventoryLevel(amount);

        BusinessItemDefinition productDefinition = createBusinessItemDefinition(vdm, "TukTukDefinition");

        PoolDefinition pool = createPool(vdm, productDefinition, "ResourcePool");
        pool.setInventoryLevel(buildDirectMeasure(vdm, "InventoryLevel"));
        pool.setPoolSize(buildDirectMeasure(vdm, "PoolSize"));

        BusinessItemDefinition orderDefinition = createBusinessItemDefinition(vdm, "OrderDefinition");

        CapabilityDefinition requestDef = createCapabilityDefinition(vdm, "Request");

        CapabilityDefinition provideDef = createCapabilityDefinition(vdm, "Provide");

        CapabilityDefinition receiveDef = createCapabilityDefinition(vdm, "Use");

        CapabilityMethod cp = VDMLFactory.eINSTANCE.createCapabilityMethod();
        vdm.getCollaboration().add(cp);
        cp.setName("ProvidePoolResourceExchange");
        BusinessItem productBusinessItem = addBusinessItem(productDefinition, cp);
        BusinessItem orderBusinessItem = addBusinessItem(orderDefinition, cp);
        BusinessItem moneyBusinessItem = addBusinessItem(money, cp);

        Role storeOwner = createRole(cp, "Provider");

        Role consumer = createRole(cp, "Consumer");

        SupplyingStore fromAccount = createFromAccount(account, cp, consumer);

        SupplyingStore toAccount = createToAccount(account, cp, storeOwner);

        SupplyingStore productStore = createSupplyingStore(pool, cp, storeOwner, "ResourcePool", "inventoryLevel");

        Activity requestProduct = addActivity(requestDef, cp, consumer, "Request");

        Activity provideProduct = addActivity(provideDef, cp, storeOwner, "Provide");


        Activity useProduct = addActivity(receiveDef, cp, consumer, "Use");

        Milestone productComplete = VDMLFactory.eINSTANCE.createMilestone();
        productComplete.setName("ProductComplete");
        cp.getMilestone().add(productComplete);

        pool.setExchangeConfiguration(VDMLFactory.eINSTANCE.createExchangeConfiguration());
        pool.getExchangeConfiguration().setExchangeMethod(cp);
        pool.getExchangeConfiguration().setExchangeMilestone(productComplete);
        pool.getExchangeConfiguration().setSupplierRole(storeOwner);


        addDeliverableFlow(cp, orderBusinessItem, requestProduct, provideProduct, "providedWorkDefinition", "receivedWorkDefinition");
        addDeliverableFlow(cp, moneyBusinessItem, fromAccount, provideProduct, "paidMoney", "receivedMoney").setMilestone(productComplete);
        addDeliverableFlow(cp, moneyBusinessItem, provideProduct, toAccount, "receivedMoney", "savedMoney").setMilestone(productComplete);
        addDeliverableFlow(cp, productBusinessItem, productStore, useProduct, "productSold", "productUsed").setMilestone(productComplete);

        ResourceUse resourceUse = VDMLFactory.eINSTANCE.createResourceUse();
        useProduct.getResourceUse().add(resourceUse);
        resourceUse.setName("UseTukTuk");
        resourceUse.getResource().add((InputPort) findByName(useProduct.getContainedPort(), "productUsed"));
        resourceUse.setLocation(ResourceUseLocation.ROLE_PARTICIPANT);
        resourceUse.setResourceIsConsumed(false);

        vdm.eResource().save(new ByteArrayOutputStream(), null);
        VdmlImporter vi = new VdmlImporter(getEntityManager());
        vi.buildModel(vdm);
        org.jbpm.vdml.services.impl.model.meta.Collaboration collaboration = vi.buildCollaboration(cp);
        return collaboration;
    }

}
