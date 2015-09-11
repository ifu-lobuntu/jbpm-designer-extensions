package org.jbpm.vdml.services;


import bitronix.tm.resource.ResourceRegistrar;
import bitronix.tm.resource.common.XAResourceProducer;
import bitronix.tm.resource.jdbc.PoolingDataSource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jbpm.vdml.services.impl.CollaborationBuilder;
import org.jbpm.vdml.services.model.meta.Collaboration;
import org.junit.Before;
import org.junit.Test;
import org.omg.vdml.*;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.omg.vdml.util.VDMLResourceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.InitialContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;

import java.io.ByteArrayOutputStream;
import java.util.Set;

import static org.junit.Assert.*;

public class CollaborationBuilderTest {
    private static Logger logger = LoggerFactory.getLogger(CollaborationBuilderTest.class);
    private EntityManagerFactory emf;

    @Test
    public void testIt() throws Exception {
        UserTransaction ut = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
        ut.begin();
        ResourceSet rst = new ResourceSetImpl();
        rst.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdml", new VDMLResourceFactoryImpl());
        VDMLResourceImpl resource = (VDMLResourceImpl) rst.createResource(URI.createPlatformResourceURI("test/test/test.vdml", true));
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        resource.getContents().add(vdm);

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

        SuppliedStore suppliedStore = VDMLFactory.eINSTANCE.createSuppliedStore();
        suppliedStore.setName("SupplyStuff");
        suppliedStore.setStoreRequirement(sd);
        cp.getSuppliedStore().add(suppliedStore);
        suppliedStore.setSupplyingRole(role);

        DeliverableFlow flow = VDMLFactory.eINSTANCE.createDeliverableFlow();
        cp.getFlow().add(flow);
        flow.setName("GoWithTheFlow");
        flow.setProvider(VDMLFactory.eINSTANCE.createOutputPort());
        flow.getProvider().setName("from");
        activity.getContainedPort().add(flow.getProvider());
        flow.setRecipient(VDMLFactory.eINSTANCE.createInputPort());
        flow.getRecipient().setName("to");
        suppliedStore.getContainedPort().add(flow.getRecipient());

        resource.save(new ByteArrayOutputStream(), null);
        //WHEN
        Collaboration collaboration = new CollaborationBuilder(emf.createEntityManager()).buildCollaboration(cp);
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

        assertEquals(1, collaboration.getSuppliedStores().size());
        assertSame(collaboration.getRoles().iterator().next(), collaboration.getSuppliedStores().iterator().next().getSupplyingRole());
        assertEquals("SupplyStuff", collaboration.getSuppliedStores().iterator().next().getName());
        assertSame(collaboration, collaboration.getSuppliedStores().iterator().next().getCollaboration());
        assertEquals("MyRole", collaboration.getSuppliedStores().iterator().next().getSupplyingRole().getName());

        assertEquals(1, collaboration.getFlows().size());
        assertEquals("GoWithTheFlow", collaboration.getFlows().iterator().next().getName());
        assertSame(collaboration.getActivities().iterator().next(), collaboration.getFlows().iterator().next().getProvidingPortContainer());
        assertSame(collaboration.getSuppliedStores().iterator().next(), collaboration.getFlows().iterator().next().getReceivingPortContainer());
        assertEquals("from", collaboration.getFlows().iterator().next().getProviderName());
        assertEquals("to", collaboration.getFlows().iterator().next().getRecipientName());

        ut.commit();
    }

    @Before
    public void setup() throws Exception {
        if (emf == null) {
            setupPoolingDataSource();
            emf = Persistence.createEntityManagerFactory("org.jbpm.vdml.jpa");
        }
    }

    protected PoolingDataSource setupPoolingDataSource() {
        PoolingDataSource pds = new PoolingDataSource();
        pds.setUniqueName("jdbc/jbpm-ds");
        pds.setClassName("bitronix.tm.resource.jdbc.lrc.LrcXADataSource");
        pds.setMaxPoolSize(5);
        pds.setAllowLocalTransactions(true);
        pds.getDriverProperties().put("user", "sa");
        pds.getDriverProperties().put("password", "");
        pds.getDriverProperties().put("url", "jdbc:h2:mem:jbpm-db;MVCC=true");
        pds.getDriverProperties().put("driverClassName", "org.h2.Driver");
        try {
            pds.init();
        } catch (Exception e) {
            logger.warn("DBPOOL_MGR:Looks like there is an issue with creating db pool because of " + e.getMessage() + " cleaing up...");
            Set<String> resources = ResourceRegistrar.getResourcesUniqueNames();
            for (String resource : resources) {
                XAResourceProducer producer = ResourceRegistrar.get(resource);
                producer.close();
                ResourceRegistrar.unregister(producer);
                logger.debug("DBPOOL_MGR:Removed resource " + resource);
            }
            logger.debug("DBPOOL_MGR: attempting to create db pool again...");
            pds = new PoolingDataSource();
            pds.setUniqueName("jdbc/jbpm-ds");
            pds.setClassName("bitronix.tm.resource.jdbc.lrc.LrcXADataSource");
            pds.setMaxPoolSize(5);
            pds.setAllowLocalTransactions(true);
            pds.getDriverProperties().put("user", "sa");
            pds.getDriverProperties().put("password", "");
            pds.getDriverProperties().put("url", "jdbc:h2:mem:jbpm-db;MVCC=true");
            pds.getDriverProperties().put("driverClassName", "org.h2.Driver");
            pds.init();
            logger.debug("DBPOOL_MGR:Pool created after cleanup of leftover resources");
        }
        return pds;
    }
}
