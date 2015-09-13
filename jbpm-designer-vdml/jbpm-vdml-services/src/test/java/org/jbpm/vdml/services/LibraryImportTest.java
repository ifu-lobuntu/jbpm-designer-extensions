package org.jbpm.vdml.services;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.vdml.services.impl.MetaBuilder;
import org.jbpm.vdml.services.impl.VdmlImporter;
import org.junit.Test;
import org.omg.smm.*;
import org.omg.smm.Accumulator;
import org.omg.smm.BinaryFunctor;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.CountingMeasure;
import org.omg.smm.DirectMeasure;
import org.omg.smm.RescaledMeasure;
import org.omg.vdml.*;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.omg.vdml.util.VDMLResourceImpl;
import test.TestGradeMeasure;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class LibraryImportTest extends MetaEntityImportTest {

    @Test
    public void testIt() throws Exception {
        ValueDeliveryModel vdm = buildModel();
        MeasureLibrary ml=vdm.getMetricsModel().get(0).getLibraries().get(0);
        StoreLibrary sl = VDMLFactory.eINSTANCE.createStoreLibrary();
        vdm.getStoreLibrary().add(sl);
        StoreDefinition sd = VDMLFactory.eINSTANCE.createStoreDefinition();
        sl.getStoreDefinitions().add(sd);
        sd.setName("SupplyStuffDef");
        addCharacteristics(ml, sd.getCharacteristicDefinition());

        BusinessItemDefinition bd = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        vdm.getBusinessItemLibrary().get(0).getBusinessItemLibraryElement().add(bd);
        bd.setName("StuffDef");
        addCharacteristics(ml, bd.getCharacteristicDefinition());

        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        vdm.getCapabilitylibrary().add(cl);
        CapabilityDefinition cd = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cl.getCapability().add(cd);
        cd.setName("DoStuffDef");
        addCharacteristics(ml, cd.getCharacteristicDefinition());


        vdm.eResource().save(new ByteArrayOutputStream(), null);
        //WHEN
        VdmlImporter importer = new VdmlImporter(emf.createEntityManager());
        importer.buildModel(vdm);
        //THEN
        VdmlImporter importer2 = new VdmlImporter(emf.createEntityManager());
        org.jbpm.vdml.services.model.meta.StoreDefinition foundSd = importer2.findStoreDefinition(MetaBuilder.buildUri(sd));
        assertEquals("SupplyStuffDef", foundSd.getName());
        assertMeasures(foundSd.getMeasures());
        org.jbpm.vdml.services.model.meta.BusinessItemDefinition foundBd = importer2.findBusinessItemDefinition(MetaBuilder.buildUri(bd));
        assertEquals("StuffDef", foundBd.getName());
        assertMeasures(foundBd.getMeasures());
        org.jbpm.vdml.services.model.meta.Capability foundCd = importer2.findCapabilityDefinition(MetaBuilder.buildUri(cd));
        assertEquals("DoStuffDef", foundCd.getName());
        assertMeasures(foundCd.getMeasures());

    }

}
