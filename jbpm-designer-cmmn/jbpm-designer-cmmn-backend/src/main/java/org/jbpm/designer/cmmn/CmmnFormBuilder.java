package org.jbpm.designer.cmmn;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.cmmn.jbpmext.JbpmextPackage;
import org.jbpm.designer.extensions.api.IEmfBasedFormBuilder;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.extensions.emf.util.VFSURIHandler;
import org.jbpm.designer.extensions.impl.AbstractFormBuilderImpl;
import org.jbpm.designer.extensions.util.NameConverter;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.api.model.wrappers.I18nSet;
import org.omg.cmmn.*;

@ApplicationScoped
@ProfileName("cmmn")
public class CmmnFormBuilder extends AbstractFormBuilderImpl {
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
        return "cmmn";
    }
    @Override
    protected boolean hasForm(EObject eObject) {
        return eObject instanceof TPlanItem && ((TPlanItem) eObject).getDefinitionRef() instanceof THumanTask || eObject instanceof TCase;
    }
    @Override
    public String getFormName(EObject source) {
        if(source instanceof TPlanItem){
            TPlanItem pi=(TPlanItem) source;
            if(pi.getDefinitionRef()!=null){
                return pi.getDefinitionRef().getName() + "-taskform";
            }
        }else if(source instanceof TDiscretionaryItem){
            TDiscretionaryItem di=(TDiscretionaryItem) source;
            if(di.getDefinitionRef()!=null){
                return di.getDefinitionRef().getName()+ "-taskform";
            }
        }else if(source instanceof TCase){
            TCase di=(TCase) source;
            return di.getId()+ "-taskform";
        }
            
        return super.getFormName(source);
    }

    @Override
    public Map<String, TaskFormInfo> addFields(String repositoryInfo, Form form, EObject eobject, String formType) throws Exception {
        Map<String, TaskFormInfo> results= new HashMap<String, TaskFormInfo>();
        if (eobject instanceof TPlanItem && ((TPlanItem) eobject).getDefinitionRef() instanceof THumanTask) {
            TPlanItem planItem=(TPlanItem) eobject;
            THumanTask task = (THumanTask) planItem.getDefinitionRef();
            for (TCaseParameter parameter : task.getInputs()) {
                Field field = form.getField(parameter.getName());
                if (field == null) {
                    field = formManager.addFieldToForm(form, parameter.getName(), fieldTypeManager.getTypeByCode(getTypeCode(parameter)), null);
                }
                field.setInputBinding(parameter.getName()+"In");
                field.setOutputBinding(parameter.getName()+"Out");
                maybePrepareSubform(repositoryInfo, field, parameter,results);
                I18nSet set = new I18nSet();
                set.setValue(Locale.getDefault().getLanguage(), NameConverter.separateWords(parameter.getName()));
                field.setLabel(set);
                // field.setFieldRequired(?);
            }
            if(planItem.getAnyAttribute()!=null && planItem.getAnyAttribute().get(JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement(), true)!=null){
                EObject vdmlActivity=(EObject) planItem.getAnyAttribute().get(JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement(), true);
                IEmfBasedFormBuilder vdan = super.getOtherFormBuilder("vdan");
                if(vdan!=null){
                    results.putAll(vdan.addFields(repositoryInfo, form, vdmlActivity, formType));
                }
            }
        }else if(eobject instanceof TCase){
            TCase tCase = (TCase) eobject;
            for (TCaseParameter parameter : tCase.getInput()) {
                Field field = form.getField(parameter.getName());
                if (field == null) {
                    field = formManager.addFieldToForm(form, parameter.getName(), fieldTypeManager.getTypeByCode(getTypeCode(parameter)), null);
                }
                field.setInputBinding(parameter.getName()+"In");
                field.setOutputBinding(parameter.getName()+"Out");
                maybePrepareSubform(repositoryInfo, field, parameter,results);
                I18nSet set = new I18nSet();
                set.setValue(Locale.getDefault().getLanguage(), NameConverter.separateWords(parameter.getName()));
                field.setLabel(set);
            }

        }
        return results;
    }

    protected void maybePrepareSubform(String repositoryInfo, Field field, TCaseParameter parameter, Map<String, TaskFormInfo> results) {
        TCaseFileItem br = parameter.getBindingRef();
        if (br != null && br.getDefinitionRef() != null && br.getDefinitionRef().getImportRef() != null  && br.getDefinitionRef().getStructureRef()!=null) {
            TImport tImport = br.getDefinitionRef().getImportRef();
            URI uri = URI.createURI(br.getDefinitionRef().getImportRef().getLocation());
            EObject cls= UriHelper.resolveEObject(parameter.eResource().getResourceSet(), new String[]{br.getDefinitionRef().getStructureRef().getLocalPart(), uri.toPlatformString(true)}, UMLPackage.eINSTANCE.getNamedElement_Name(), UMLPackage.eINSTANCE.getClass_());
            results.putAll(prepareSubform(repositoryInfo, field, cls));
        }
    }

    private String getTypeCode(TCaseParameter parameter) {
        TCaseFileItem br = parameter.getBindingRef();
        if (br == null || br.getMultiplicity() == MultiplicityEnum.EXACTLY_ONE || br.getMultiplicity() == MultiplicityEnum.ZERO_OR_ONE
                || parameter.getBindingRefinement() != null) {
            return "Subform";
        } else {
            return "MultipleSubform";
        }
    }

    @Override
    public DataHolder buildDataHolderFor(String name, EObject eobject) {
        return null;
    }
}
