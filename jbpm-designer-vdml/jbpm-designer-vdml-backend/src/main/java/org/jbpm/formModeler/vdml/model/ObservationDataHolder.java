package org.jbpm.formModeler.vdml.model;


import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.emf.EmfBasedDataHolder;
import org.jbpm.vdml.services.impl.model.meta.EnumeratedMeasure;
import org.jbpm.vdml.services.impl.model.runtime.Measurement;
import org.jbpm.vdml.services.impl.model.runtime.RuntimeEntity;
import org.omg.vdml.VdmlElement;

import java.util.Collection;

public abstract class ObservationDataHolder<T extends VdmlElement> extends EmfBasedDataHolder<T> {

    public ObservationDataHolder(T eobject, String uniqueId) {
        super(eobject, uniqueId);
    }

    protected void setMeasurement(String name, Object value, Collection<? extends Measurement>... measurements) {
        Measurement m = lookupElement(name, measurements);
        if (m != null) {
            if (value instanceof Double) {
                m.setValue((Double) value);
            } else if (value instanceof Number) {
                m.setValue(((Number) value).doubleValue());
            } else if (value instanceof Enum) {
                m.setRating((Enum<?>) value);
            }
        }
    }
    @Override
    public Object createInstance(FormRenderContext context) throws Exception {
        throw new IllegalStateException();
    }

    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        throw new IllegalStateException();
    }


    protected Object getMeasurement(String name, Collection<? extends Measurement>... measurements) {
        Measurement m = lookupElement(name, measurements);
        if (m != null) {
            if (m.getMeasure() instanceof EnumeratedMeasure) {
                return m.getRating();
            } else {
                return m.getValue();
            }
        }
        return null;
    }

    protected <T extends RuntimeEntity> T lookupElement(String name, Collection<? extends T>... measurements) {
        for (Collection<? extends T> collection : measurements) {
            for (T measurement : collection) {
                if (measurement.getMetaEntity().equals(name)) {
                    return measurement;
                }
            }
        }
        return null;
    }
}
