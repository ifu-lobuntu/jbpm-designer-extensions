package org.jbpm.vdml.services;

import bitronix.tm.resource.ResourceRegistrar;
import bitronix.tm.resource.common.XAResourceProducer;
import bitronix.tm.resource.jdbc.PoolingDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.omg.smm.Measure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import java.util.Collection;
import java.util.Set;

/**
 * Created by ampie on 2015/09/12.
 */
public class AbstractVdmlServiceTest {
    protected static EntityManagerFactory emf;
    private static Logger logger = LoggerFactory.getLogger(CollaborationImportTest.class);

    @BeforeClass
    public static void setup() throws Exception {
        if (emf == null) {
            setupPoolingDataSource();
            emf = Persistence.createEntityManagerFactory("org.jbpm.vdml.jpa");
        }
    }

    protected static PoolingDataSource setupPoolingDataSource() {
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

    @Before
    public void beginTx() throws Exception{
        UserTransaction ut = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
        ut.begin();
    }

    @After
    public void afterTx() {
        try {
            UserTransaction ut = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            ut.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
