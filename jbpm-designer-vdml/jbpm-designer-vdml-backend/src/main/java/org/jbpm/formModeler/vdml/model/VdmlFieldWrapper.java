package org.jbpm.formModeler.vdml.model;

import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.api.model.Field;
import org.omg.smm.GradeMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RankingMeasure;
import org.omg.vdml.*;

public class VdmlFieldWrapper {
    private DataFieldHolder field;
    private Port introducingPort;
    private VdmlElement parentElement;
    private Measure measure;

    public VdmlFieldWrapper(DataHolder holder, Port introducingPort, VdmlElement parentElement, String localName, Measure measure) {
        this.introducingPort = introducingPort;
        this.parentElement = parentElement;
        this.measure = measure;
        String typeName="java.lang.Double";
        if(measure instanceof GradeMeasure || measure instanceof RankingMeasure){
            typeName=VdmlHelper.getClassName(measure);
        }else if(localName.equals("duration")){
            //TODO rather check for the UnitOfMeassure
            typeName="org.joda.time.Interval";
        }
        this.field=new DataFieldHolder(holder,fieldName(introducingPort, parentElement, localName),typeName);
    }
    private String fieldName(Port introducingPort, VdmlElement parent, String name) {
        if (parent instanceof InputPort) {
            return "Input" + parent.getName() + name;
        } else if (parent instanceof OutputPort) {
            return "Output" + parent.getName() + name;
        } else if (parent instanceof ResourceUse) {
            return "ResourceUse" + parent.getName() + name;
        } else if (parent instanceof ResourceUse) {
            return "ResourceUse" + parent.getName() + name;
        } else if (parent instanceof BusinessItem) {
            if (introducingPort instanceof InputPort) {
                return "Input" + introducingPort.getName() + "Deliverable" + name;
            } else if (introducingPort instanceof OutputPort) {
                return "Output" + introducingPort.getName() + "Deliverable" + name;
            }
        } else if (parent instanceof ValueAdd) {
            if (introducingPort instanceof InputPort) {
                return "Input" + introducingPort.getName() + "ValueAdd" + parent.getName() + name;
            } else if (introducingPort instanceof OutputPort) {
                return "Output" + introducingPort.getName() + "ValueAdd" + parent.getName() + name;
            }
        } else if (parent instanceof SupplyingStore) {
            if (introducingPort instanceof InputPort) {
                return "Input" + introducingPort.getName() + "Supplying" + parent.getName() + name;
            } else if (introducingPort instanceof OutputPort) {
                return "Output" + introducingPort.getName() + "Supplying" + parent.getName() + name;
            }
        }
        return parent.getName() + name;
    }

    public DataFieldHolder getField() {
        return field;
    }

    public Port getIntroducingPort() {
        return introducingPort;
    }

    public VdmlElement getParentElement() {
        return parentElement;
    }

    public Measure getMeasure() {
        return measure;
    }
}
