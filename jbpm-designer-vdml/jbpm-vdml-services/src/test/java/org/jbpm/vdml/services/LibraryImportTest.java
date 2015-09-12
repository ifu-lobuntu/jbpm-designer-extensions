package org.jbpm.vdml.services;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.vdml.services.impl.MetaBuilder;
import org.jbpm.vdml.services.impl.VdmlImporter;
import org.jbpm.vdml.services.model.meta.*;
import org.junit.Test;
import org.omg.smm.*;
import org.omg.smm.Accumulator;
import org.omg.smm.BinaryFunctor;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.CountingMeasure;
import org.omg.smm.DirectMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.util.SMMAdapterFactory;
import org.omg.vdml.*;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.StoreDefinition;
import org.omg.vdml.util.VDMLResourceFactoryImpl;
import org.omg.vdml.util.VDMLResourceImpl;
import test.TestGradeMeasure;

import java.io.ByteArrayOutputStream;
import java.util.Set;

import static org.junit.Assert.*;

public class LibraryImportTest extends AbstractVdmlServiceTest {

    @Test
    public void testIt() throws Exception {
        ResourceSet rst = new ResourceSetImpl();
        rst.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdml", new VDMLResourceFactoryImpl());
        VDMLResourceImpl resource = (VDMLResourceImpl) rst.createResource(URI.createPlatformResourceURI("/test/src/main/resources/test/test.vdml", true));
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        resource.getContents().add(vdm);

        MeasureLibrary ml = SMMFactory.eINSTANCE.createMeasureLibrary();
        SmmModel smm = SMMFactory.eINSTANCE.createSmmModel();
        vdm.getMetricsModel().add(smm);
        smm.getLibraries().add(ml);
        StoreLibrary sl = VDMLFactory.eINSTANCE.createStoreLibrary();
        vdm.getStoreLibrary().add(sl);
        StoreDefinition sd = VDMLFactory.eINSTANCE.createStoreDefinition();
        sl.getStoreDefinitions().add(sd);
        sd.setName("SupplyStuffDef");
        addMeasures(ml, sd.getCharacteristicDefinition());

        BusinessItemLibrary bl = VDMLFactory.eINSTANCE.createBusinessItemLibrary();
        vdm.getBusinessItemLibrary().add(bl);
        BusinessItemDefinition bd = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        bl.getBusinessItemLibraryElement().add(bd);
        bd.setName("StuffDef");
        addMeasures(ml, bd.getCharacteristicDefinition());

        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        vdm.getCapabilitylibrary().add(cl);
        CapabilityDefinition cd = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cl.getCapability().add(cd);
        cd.setName("DoStuffDef");
        addMeasures(ml, cd.getCharacteristicDefinition());


        resource.save(new ByteArrayOutputStream(), null);
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

    private void assertMeasures(Set<org.jbpm.vdml.services.model.meta.Measure> foundSdMeasures) {
        assertEquals(6, foundSdMeasures.size());
        for (org.jbpm.vdml.services.model.meta.Measure measure : foundSdMeasures) {
            if (measure instanceof org.jbpm.vdml.services.model.meta.DirectMeasure) {
                assertEquals("DirectMeasure", measure.getName());
            } else if (measure instanceof org.jbpm.vdml.services.model.meta.CountingMeasure) {
                assertEquals("CountingMeasure", measure.getName());
                org.jbpm.vdml.services.model.meta.CountingMeasure found = (org.jbpm.vdml.services.model.meta.CountingMeasure) measure;
                assertEquals("value > 1000", found.getValuesToCount());
                assertNotNull(found.getMeasureToCount());
            } else if (measure instanceof org.jbpm.vdml.services.model.meta.BinaryMeasure) {
                assertEquals("BinaryMeasure", measure.getName());
                org.jbpm.vdml.services.model.meta.BinaryMeasure found = (org.jbpm.vdml.services.model.meta.BinaryMeasure) measure;
                assertNotNull(found.getMeasureA());
                assertNotNull(found.getMeasureB());
                assertEquals(org.jbpm.vdml.services.model.meta.BinaryFunctor.DIVIDE, found.getFunctor());
            } else if (measure instanceof org.jbpm.vdml.services.model.meta.CollectiveMeasure) {
                assertEquals("CollectiveMeasure", measure.getName());
                org.jbpm.vdml.services.model.meta.CollectiveMeasure found = (org.jbpm.vdml.services.model.meta.CollectiveMeasure) measure;
                assertNotNull(found.getAggregatedMeasures());
                assertEquals(org.jbpm.vdml.services.model.meta.Accumulator.PRODUCT, found.getAccumulator());
            } else if (measure instanceof org.jbpm.vdml.services.model.meta.EnumeratedMeasure) {
                assertEquals("TestGradeMeasure", measure.getName());
                org.jbpm.vdml.services.model.meta.EnumeratedMeasure found = (org.jbpm.vdml.services.model.meta.EnumeratedMeasure) measure;
                assertEquals(TestGradeMeasure.class, found.getEnumClass());
            } else if (measure instanceof org.jbpm.vdml.services.model.meta.RescaledMeasure) {
                assertEquals("RescaledMeasure", measure.getName());
                org.jbpm.vdml.services.model.meta.RescaledMeasure found = (org.jbpm.vdml.services.model.meta.RescaledMeasure) measure;
                assertNotNull(found.getRescaledMeasure());
                assertEquals(2d, found.getMultiplier().doubleValue(), 0.0001);
                assertEquals(100d, found.getOffset().doubleValue(),0.0001);
            } else {
                fail("Unexpected Measure Type: " + measure.getClass().getSimpleName());
            }
        }

    }

    private void addMeasures(MeasureLibrary l, EList<Characteristic> characteristicDefinition) {
        DirectMeasure directMeasure = SMMFactory.eINSTANCE.createDirectMeasure();
        directMeasure.setName("DirectMeasure");
        addToLibrary(l, characteristicDefinition, directMeasure);

        CountingMeasure countingMeasure = SMMFactory.eINSTANCE.createCountingMeasure();
        countingMeasure.setName("CountingMeasure");
        countingMeasure.setOperation(SMMFactory.eINSTANCE.createOperation());
        countingMeasure.getOperation().setBody("value > 1000");
        CountingMeasureRelationship countingMeasureRelationship = SMMFactory.eINSTANCE.createCountingMeasureRelationship();
        countingMeasure.setCountedMeasureTo(countingMeasureRelationship);
        countingMeasure.getCountedMeasureTo().setToCountedMeasure(countingMeasure);
        l.getMeasureElements().add(countingMeasure.getOperation());
        addToLibrary(l, characteristicDefinition, countingMeasure);


        BinaryMeasure binaryMeasure = SMMFactory.eINSTANCE.createBinaryMeasure();
        binaryMeasure.setName("BinaryMeasure");
        Base1MeasureRelationship base1 = SMMFactory.eINSTANCE.createBase1MeasureRelationship();
        Base2MeasureRelationship base2 = SMMFactory.eINSTANCE.createBase2MeasureRelationship();
        binaryMeasure.setBaseMeasure1To(base1);
        binaryMeasure.setBaseMeasure2To(base2);
        binaryMeasure.setFunctor(BinaryFunctor.DIVIDE);
        base1.setToDimensionalMeasure(directMeasure);
        base2.setToDimensionalMeasure(countingMeasure);
        addToLibrary(l, characteristicDefinition, binaryMeasure);

        CollectiveMeasure collectiveMeasure = SMMFactory.eINSTANCE.createCollectiveMeasure();
        collectiveMeasure.setName("CollectiveMeasure");
        BaseNMeasureRelationship baseN = SMMFactory.eINSTANCE.createBaseNMeasureRelationship();
        collectiveMeasure.getBaseMeasureTo().add(baseN);
        baseN.setToDimensionalMeasure(directMeasure);
        collectiveMeasure.setAccumulator(Accumulator.PRODUCT);
        addToLibrary(l, characteristicDefinition, collectiveMeasure);

        GradeMeasure gradeMeasure = SMMFactory.eINSTANCE.createGradeMeasure();
        gradeMeasure.setName("TestGradeMeasure");
        addToLibrary(l, characteristicDefinition, gradeMeasure);

        RescaledMeasure rescaledMeasure = SMMFactory.eINSTANCE.createRescaledMeasure();
        RescaledMeasureRelationship rescaledMeasureRelationship = SMMFactory.eINSTANCE.createRescaledMeasureRelationship();
        rescaledMeasureRelationship.setFromDimensionalMeasure(directMeasure);
        rescaledMeasure.getRescalesFrom().add(rescaledMeasureRelationship);
        rescaledMeasure.setName("RescaledMeasure");
        rescaledMeasure.setMultiplier(2d);
        rescaledMeasure.setOffset(100d);
        addToLibrary(l, characteristicDefinition, rescaledMeasure);
    }

    private void addToLibrary(MeasureLibrary l, EList<Characteristic> characteristicDefinition, org.omg.smm.Measure m) {
        Characteristic characteristic = SMMFactory.eINSTANCE.createCharacteristic();
        characteristicDefinition.add(characteristic);
        characteristic.setName(m.getName());
        characteristic.getMeasure().add(m);
        l.getMeasureElements().add(characteristic);
        l.getMeasureElements().add(m);
        ((VDMLResourceImpl)m.eResource()).setID(m, EcoreUtil.generateUUID());
    }

}
