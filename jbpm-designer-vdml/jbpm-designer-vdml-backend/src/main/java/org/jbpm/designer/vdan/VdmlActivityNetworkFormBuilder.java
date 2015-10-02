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
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.api.model.wrappers.I18nSet;
import org.jbpm.formModeler.fieldTypes.lookup.EnumLookupFieldType;
import org.jbpm.formModeler.fieldTypes.lookup.TimeIntervalFieldType;
import org.jbpm.formModeler.vdml.model.ActivityValueDataHolder;
import org.jbpm.formModeler.vdml.model.VdmlFieldWrapper;
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
        if (eobject instanceof Activity) {
            Activity a = (Activity) eobject;
            ActivityValueDataHolder dh = new ActivityValueDataHolder(a, a.getName());
            for (VdmlFieldWrapper dfh : dh.getFieldWrappers()) {
                Field field = form.getField(dfh.getField().getId());
                String typeCode = null;
                if (dfh.getField().getClassName().equals("java.lang.Double")) {
                    typeCode = "InputTextDouble";
                } else if (dfh.getField().getClassName().equals("org.joda.time.Interval")) {
                    typeCode = TimeIntervalFieldType.CODE;
                } else {
                    typeCode = EnumLookupFieldType.CODE;
                }
                if (field == null) {
                    field = formManager.addFieldToForm(form, dfh.getField().getId(), fieldTypeManager.getTypeByCode(typeCode), null);
                }
                field.setInputBinding(dh.getInputId() +"/" + dfh.getField().getId());
                field.setOutputBinding(dh.getOuputId() +"/" + dfh.getField().getId());
                I18nSet set = new I18nSet();
                String name = dfh.getField().getId();
                if (dfh.getMeasure() instanceof DimensionalMeasure && ((DimensionalMeasure) dfh.getMeasure()).getUnit() != null) {
                    UnitOfMeasure u = ((DimensionalMeasure) dfh.getMeasure()).getUnit();
                    name= name + "(" + u.getName() + ")";
                }
                set.setValue(Locale.getDefault().getLanguage(), NameConverter.separateWords(NameConverter.capitalize(name)));
                if (dfh.getMeasure() instanceof GradeMeasure || dfh.getMeasure() instanceof RankingMeasure) {
                    List<? extends Interval> intervals;
                    if (dfh.getMeasure() instanceof GradeMeasure) {
                        intervals = ((GradeMeasure) dfh.getMeasure()).getInterval();
                    } else {
                        intervals = ((RankingMeasure) dfh.getMeasure()).getInterval();
                    }
                    StringBuilder sb = new StringBuilder();
                    for (Interval l : intervals) {
                        sb.append(l.getName());
                        sb.append(",");
                    }
                    field.setParam5(VdmlHelper.getClassName(dfh.getMeasure()));
                    field.setParam4(sb.toString());
                    field.setReadonly(false);
                }else if(dfh.getMeasure() instanceof  DirectMeasure){
                    field.setReadonly(false);
                }else{
                    field.setReadonly(true);
                }
                field.setLabel(set);


            }
        }
        return results;
    }


    @Override
    public DataHolder buildDataHolderFor(String name, EObject eobject) {
        if (eobject instanceof Activity) {
            // Because we are detached from the origin request from here on
            EcoreUtil.resolveAll(eobject);
            return new ActivityValueDataHolder((Activity) eobject, name);
        } else {
            return null;
        }
    }
}
