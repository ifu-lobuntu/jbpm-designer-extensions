package org.jbpm.designer.vdan;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.extensions.impl.AbstractFormBuilderImpl;
import org.jbpm.designer.extensions.util.NameConverter;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.api.model.wrappers.I18nSet;
import org.jbpm.formModeler.fieldTypes.lookup.EnumLookupFieldType;
import org.jbpm.formModeler.vdml.model.DeliverableFlowDataHolder;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.DimensionalMeasure;
import org.omg.smm.DirectMeasure;
import org.omg.smm.GradeMeasure;
import org.omg.smm.Interval;
import org.omg.smm.Measure;
import org.omg.smm.RankingMeasure;
import org.omg.smm.UnitOfMeasure;
import org.omg.smm.util.SmmHelper;
import org.omg.vdml.*;

@ApplicationScoped
@ProfileName("vdan")
public class VdmlActivityNetworkFormBuilder extends AbstractFormBuilderImpl {
    @Override
    protected boolean hasForm(EObject eObject) {
        return eObject instanceof Port && !(eObject.eContainer() instanceof Collaboration);
    }

    @Override
    public String getFormName(EObject source) {
        if (source instanceof Port) {
            PortContainer pc = (PortContainer) source.eContainer();
            return pc.getName() + "_" + ((Port) source).getName();
        }
        return super.getFormName(source);
    }

    @Override
    public String getProfileName() {
        return "vdan";
    }

    @Override
    public Map<String, TaskFormInfo> addFields(String repositoryInfo, Form form, EObject eobject, String formType) throws Exception {
        Map<String, TaskFormInfo> results = new HashMap<String, TaskFormInfo>();
        if (eobject instanceof Port) {
            Port port = (Port) eobject;
            if (port.getName() == null) {
                port.setName("anonymous");
            }
            EList<ValueAdd> vas = VdmlHelper.getValueAdds(port);
            String portName = NameConverter.decapitalize(port.getName());
            form.setDataHolder(buildDataHolderFor(portName, port));
            for (ValueAdd parameter : vas) {
                if (VdmlHelper.hasValueMeasure(parameter)) {
                    Measure measure = VdmlHelper.getValueMeasure(parameter);
                    String fieldName = parameter.getName();
                    addField(form, portName, measure, fieldName);
                }
            }
            if (SmmHelper.hasMeasure(port.getBatchSize())) {
                addField(form, portName, SmmHelper.getMeasure(port.getBatchSize()), "Quantity");
            }
            // TODO resourceUse
            // TODO field.setParam1(whoGetsToUpdate- receiver or provider or
            // both), or maybe use formType
        } else if (eobject instanceof Activity) {
            Activity a = (Activity) eobject;
            for (Port port : a.getContainedPort()) {
                Field field = form.getField(port.getName());
                if (field == null) {
                    field = formManager.addFieldToForm(form, port.getName(), fieldTypeManager.getTypeByCode("Subform"), null);
                }
                field.setInputBinding(port.getName());
                field.setOutputBinding(port.getName());
                results.putAll(prepareSubform(repositoryInfo, field, port,true));
                I18nSet set = new I18nSet();
                set.setValue(Locale.getDefault().getLanguage(), NameConverter.capitalize(port.getName()));
                field.setLabel(set);
                // field.setFieldRequired(?);
            }
        }
        return results;
    }

    public void addField(Form form, String portName, Measure measure, String fieldName) throws Exception {
        Field field = form.getField(fieldName);
        if (field == null) {
            field = formManager.addFieldToForm(form, fieldName, fieldTypeManager.getTypeByCode(getTypeCode(measure)), null);
        }
        field.setInputBinding(portName + "/" + fieldName);
        field.setOutputBinding(portName + "/" + fieldName);
        I18nSet labelSet = new I18nSet();
        if (measure instanceof DimensionalMeasure && ((DimensionalMeasure) measure).getUnit() != null) {
            UnitOfMeasure u = ((DimensionalMeasure) measure).getUnit();
            labelSet.setValue(Locale.getDefault().getLanguage(), fieldName + "(" + u.getName() + ")");
        } else {
            labelSet.setValue(Locale.getDefault().getLanguage(), fieldName);
        }
        if (measure instanceof BinaryMeasure) {
            // TODO set formula if other measures present in
            // ValueAdd or in BusinessItemDefinition
        } else if (measure instanceof CollectiveMeasure) {
            // TODO set formula if other measures present in
            // ValueAdd or in BusinessItemDefinition
        } else if (measure instanceof GradeMeasure || measure instanceof RankingMeasure) {
            List<? extends Interval> intervals;
            if (measure instanceof GradeMeasure) {
                intervals = ((GradeMeasure) measure).getInterval();
            } else {
                intervals = ((RankingMeasure) measure).getInterval();
            }
            StringBuilder sb = new StringBuilder();
            for (Interval l : intervals) {
                sb.append(l.getName());
                sb.append(",");
            }
            field.setParam5(measure.getName());//TODO calculate class
            field.setParam4(sb.toString());
        }
        field.setLabel(labelSet);
    }

    private String getTypeCode(Measure valueMeasure) {
        if (valueMeasure instanceof DirectMeasure) {
            return "InputTextDouble";
        } else if (valueMeasure instanceof GradeMeasure || valueMeasure instanceof RankingMeasure) {
            return EnumLookupFieldType.CODE;
        }
        return "InputTextDouble";
    }

    @Override
    public DataHolder buildDataHolderFor(String name, EObject eobject) {
        if (eobject instanceof DeliverableFlow) {
            // Because we are detached from the origin request from here on
            EcoreUtil.resolveAll(eobject);
            return new DeliverableFlowDataHolder((DeliverableFlow) eobject,name);
        } else {
            return null;
        }
    }
}
