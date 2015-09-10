package org.jbpm.vdml.services.model.runtime;

import org.jbpm.vdml.services.model.meta.EnumeratedMeasure;
import org.jbpm.vdml.services.model.meta.Measure;
import org.jbpm.vdml.services.model.meta.MetaEntity;

import javax.persistence.*;

@MappedSuperclass
public abstract class Measurement implements RuntimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double value;
    private String rating;
    @ManyToOne
    private Measure measure;

    public Measurement() {
    }

    public Measurement(Measure measure) {
        this.measure = measure;
    }

    public Measure getMeasure() {
        return measure;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Enum<?> getRating() {
        if (getMeasure() instanceof EnumeratedMeasure) {
            Class enumClass = ((EnumeratedMeasure) getMeasure()).getEnumClass();
           return Enum.valueOf(enumClass, rating);
        }
        return null;
    }

    public void setRating(Enum<?> rating) {
        this.rating = rating.name();
    }

    public Long getId() {
        return id;
    }

    @Override
    public MetaEntity getMetaEntity() {
        return getMeasure();
    }
}
