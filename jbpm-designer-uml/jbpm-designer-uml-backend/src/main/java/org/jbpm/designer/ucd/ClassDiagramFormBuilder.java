package org.jbpm.designer.ucd;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TypedElement;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.extensions.impl.AbstractFormBuilderImpl;
import org.jbpm.designer.extensions.util.NameConverter;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.api.model.wrappers.I18nSet;
import org.jbpm.formModeler.fieldTypes.lookup.CaseFileItemLookupFieldType;
import org.jbpm.formModeler.fieldTypes.lookup.EnumLookupFieldType;
import org.jbpm.formModeler.fieldTypes.lookup.MultiCaseFileItemLookupFieldType;
import org.jbpm.formModeler.uml.model.UmlClassDataHolder;

@ApplicationScoped
@ProfileName("ucd")
public class ClassDiagramFormBuilder extends AbstractFormBuilderImpl {
    private static Map<String, String> cmmnTypeMap = new HashMap<String, String>();
    static {
        cmmnTypeMap.put("String", "InputText");
        cmmnTypeMap.put("Date", "InputDate");
        cmmnTypeMap.put("DateTime", "InputDate");
        cmmnTypeMap.put("Boolean", "CheckBox");
        cmmnTypeMap.put("Integer", "InputTextInteger");
        cmmnTypeMap.put("Float", "InputTextFloat");
        cmmnTypeMap.put("Double", "InputTextDouble");
    }

    @Override
    public String getProfileName() {
        return "ucd";
    }

    @Override
    public Map<String, TaskFormInfo> addFields(String repositoryInfo, Form form, EObject eobject, String formType) throws Exception {
        Map<String, TaskFormInfo> results = new HashMap<String, TaskFormInfo>();
        Classifier cls = (Classifier) eobject;
        String name = Character.toLowerCase(cls.getName().charAt(0)) + cls.getName().substring(1);
        form.setDataHolder(new UmlClassDataHolder(name, name + "In", name + "Out", (Class) cls, "#0099FF"));

        for (Property property : cls.getAllAttributes()) {
            Field field = form.getField(property.getName());
            if (field == null) {
                field = formManager.addFieldToForm(form, property.getName(), fieldTypeManager.getTypeByCode(getTypeCode(property)), null);
            }
            field.setInputBinding(name + "In/" + property.getName());
            field.setOutputBinding(name + "Out/" + property.getName());
            I18nSet set = new I18nSet();
            set.setValue(Locale.getDefault().getLanguage(), NameConverter.separateWords(property.getName()));
            field.setLabel(set);
            field.setFieldRequired(property.getLower() == 1);
            if(property.getType() instanceof Enumeration){
                Enumeration en=(Enumeration) property.getType();
                StringBuilder sb = new StringBuilder();
                for (EnumerationLiteral l : en.getOwnedLiterals()) {
                    sb.append(l.getName());
                    sb.append(",");
                }
                field.setParam4(sb.toString());
                field.setParam5(en.getQualifiedName().replaceAll("\\:\\:", "."));
            }
            maybePrepareSubform(repositoryInfo, field, property, results);
        }
        return results;
    }

    protected void maybePrepareSubform(String repositoryInfo, Field field, Property property, Map<String, TaskFormInfo> forms) {
        if (property.isComposite() && property.getType() != null) {
            forms.putAll(prepareSubform(repositoryInfo, field, property.getType()));
        }
    }

    private String getTypeCode(TypedElement property) {
        if (property.getType() instanceof Enumeration) {
            return EnumLookupFieldType.CODE;
        } else if (property.getType() instanceof Class) {
            if (((Property) property).isComposite()) {
                if (((MultiplicityElement) property).isMultivalued()) {
                    return "MultipleSubform";
                } else {
                    return "Subform";
                }
            } else {
                if (((MultiplicityElement) property).isMultivalued()) {
                    return MultiCaseFileItemLookupFieldType.CODE;
                } else {
                    return CaseFileItemLookupFieldType.CODE;
                }
            }
        } else if (property.getType() != null) {
            return cmmnTypeMap.get(property.getType().getName());
        } else {
            return cmmnTypeMap.get("String");
        }
    }

    @Override
    public DataHolder buildDataHolderFor(String name, EObject cls) {
        return new UmlClassDataHolder(name, name + "In", name + "Out", (Class) cls, "#0099FF");
    }

    @Override
    protected boolean hasForm(EObject eObject) {
        return eObject instanceof Class;
    }

}
