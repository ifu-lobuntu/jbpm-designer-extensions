package org.jbpm.vdml.services.impl;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.services.model.meta.*;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.Characteristic;
import org.omg.smm.GradeMeasure;
import org.omg.smm.RankingMeasure;
import org.omg.vdml.MeasuredCharacteristic;

import javax.persistence.EntityManager;
import java.util.Collection;

public class MeasureBuilder extends MetaBuilder{
    public MeasureBuilder() {
    }

    public MeasureBuilder(EntityManager entityManager) {
        super(entityManager);
    }
    public void fromMeasuredCharacteristics(Collection<Measure> measures, Collection<MeasuredCharacteristic> characteristics){
        for (MeasuredCharacteristic characteristic : characteristics) {
            Measure m = buildMeasure(characteristic);
            if(m!=null) {
                measures.add(m);
            }
        }

    }
    public void fromCharacteristics(Collection<Measure> measures, Collection<Characteristic> characteristics){
        for (Characteristic characteristic : characteristics) {
            if(characteristic.getMeasure().size()==1) {
                Measure m = buildMeasure(characteristic.getMeasure().get(0));
                if (m != null) {
                    measures.add(m);
                }
            }
        }

    }
    public Measure  buildMeasure(MeasuredCharacteristic mc) {
        if (VdmlHelper.hasMeasure(mc)) {
            org.omg.smm.Measure measure = VdmlHelper.getMeasure(mc);

            return buildMeasure(measure);
        }
        return null;
    }

    private Measure buildMeasure(org.omg.smm.Measure measure) {
        Measure result;
        if (measure instanceof org.omg.smm.DirectMeasure) {
            DirectMeasure directMeasure = new DirectMeasure();
            result = directMeasure;
        } else if (measure instanceof GradeMeasure || measure instanceof RankingMeasure) {
            EnumeratedMeasure enumeratedMeasure = new EnumeratedMeasure();
            result = enumeratedMeasure;
        } else if (measure instanceof org.omg.smm.BinaryMeasure) {
            BinaryMeasure binaryMeasurement = new BinaryMeasure();
            org.omg.smm.BinaryMeasure binaryMeasure = (org.omg.smm.BinaryMeasure) measure;
            binaryMeasurement.setMeasureA(buildReference(binaryMeasure.getBaseMeasure1To().getToDimensionalMeasure()));
            binaryMeasurement.setMeasureA(buildReference(binaryMeasure.getBaseMeasure2To().getToDimensionalMeasure()));
            binaryMeasurement.setFunctor(BinaryFunctor.valueOf(binaryMeasure.getFunctor().name()));
            result = binaryMeasurement;
        } else if (measure instanceof org.omg.smm.CollectiveMeasure) {
            CollectiveMeasure collectiveMeasurement = new CollectiveMeasure();
            org.omg.smm.CollectiveMeasure collectiveMeasure = (org.omg.smm.CollectiveMeasure) measure;
            EList<BaseNMeasureRelationship> baseMeasureTo = collectiveMeasure.getBaseMeasureTo();
            for (BaseNMeasureRelationship relationship : baseMeasureTo) {
                collectiveMeasurement.getAggregatedMeasures().add(buildReference(relationship.getToDimensionalMeasure()));
            }
            collectiveMeasurement.setAccumulator(Accumulator.valueOf(collectiveMeasure.getAccumulator().name()));
            result = collectiveMeasurement;
        } else if (measure instanceof org.omg.smm.RescaledMeasure) {
            RescaledMeasure rescaledMeasure = new RescaledMeasure();
            rescaledMeasure.setMultiplier(((org.omg.smm.RescaledMeasure) measure).getMultiplier());
            rescaledMeasure.setOffset(((org.omg.smm.RescaledMeasure) measure).getOffset());
            result = rescaledMeasure;
        } else if (measure instanceof org.omg.smm.CountingMeasure) {
            org.omg.smm.CountingMeasure source=(org.omg.smm.CountingMeasure)measure;
            CountingMeasure cm = new CountingMeasure();
            org.omg.smm.Measure countedMeasure= source.getCountedMeasureTo().getToCountedMeasure();
            cm.setMeasureToCount(buildReference(countedMeasure));
            if(countedMeasure instanceof RankingMeasure || countedMeasure instanceof GradeMeasure){
                cm.setValuesToCount(source.getOperation().getBody().replaceAll("\\bvalue\\b","rating"));
            }else {
                cm.setValuesToCount(source.getOperation().getBody());
            }
            result = cm;
        } else {
            throw new IllegalArgumentException(measure.eClass().getName() + " not supported");
        }
        return result;
    }

}
