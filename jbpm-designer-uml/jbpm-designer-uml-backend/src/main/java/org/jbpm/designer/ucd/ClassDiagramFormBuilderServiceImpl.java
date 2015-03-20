/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.designer.ucd;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TypedElement;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.api.model.wrappers.I18nSet;
import org.jbpm.formModeler.core.config.FieldTypeManager;
import org.jbpm.formModeler.core.config.FormManager;
import org.jbpm.formModeler.core.config.FormSerializationManager;
import org.jbpm.formModeler.fieldTypes.lookup.CaseFileItemLookupFieldType;
import org.jbpm.formModeler.fieldTypes.lookup.EnumLookupFieldType;
import org.jbpm.formModeler.fieldTypes.lookup.MultiCaseFileItemLookupFieldType;
import org.jbpm.formModeler.uml.model.UmlClassDataHolder;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.io.IOService;

@ApplicationScoped
public class ClassDiagramFormBuilderServiceImpl {
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
    @Inject
    @Named("ioStrategy")
    private IOService ioService;

    @Inject
    private FormManager formManager;

    @Inject
    private FormSerializationManager formSerializationManager;
    @Inject
    private FieldTypeManager fieldTypeManager;
    public Collection<TaskFormInfo> generateAllForms(Path modelPath, XMLResource resource) {
        TreeIterator<EObject> allContents = resource.getAllContents();
        Collection<TaskFormInfo> result = new HashSet<TaskFormInfo>();
        while (allContents.hasNext()) {
            EObject eObject = (EObject) allContents.next();
            if(eObject instanceof Class ){
                result.add(generateForm(modelPath, (Class)eObject));
            }
        }
        return result;
    }

    public TaskFormInfo generateFormFor(Path modelPath, XMLResource resource, String classId) {
        return generateForm(modelPath, (Class) resource.getEObject(classId));
    }

    private TaskFormInfo generateForm(Path modelPath, Class source) {
        try {
            String modelUri = modelPath.toURI();
            String folder=modelUri.substring(0, modelUri.length()-modelPath.getFileName().length());
            TaskFormInfo result = new TaskFormInfo();
            result.setId(source.getName());
            String formFileName = result.getId() + ".form";
            result.setMetaOutput("empty");
            Path formPath = PathFactory.newPath(formFileName, folder + formFileName);
            Form form;
            org.uberfire.java.nio.file.Path kiePath=Paths.convert(formPath);
            if (ioService.exists(kiePath)) {
                form = formSerializationManager.loadFormFromXML(ioService.readAllString(kiePath).trim());
                addFields(form, source);
            } else {
                form = formManager.createForm(formFileName);
                addFields(form, source);
            }
            result.setPkgName(folder);
            result.setModelerOutput(formSerializationManager.generateFormXML(form));
            return result;
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private void addFields(Form form, Classifier cls) throws Exception {
        String name=Character.toLowerCase(cls.getName().charAt(0)) +  cls.getName().substring(1);
        form.setDataHolder(new UmlClassDataHolder(name, name+"In", name+"Out", (Class)cls, "#0099FF"));

        for (Property property : cls.getAllAttributes()) {
            Field field = form.getField(property.getName());
            if (field == null) {
                field = formManager.addFieldToForm(form, property.getName(), fieldTypeManager.getTypeByCode(getTypeCode(property)), null);
            }
            field.setInputBinding(name +"In/" + property.getName());
            field.setOutputBinding(name +"Out/" + property.getName());
            I18nSet set = new I18nSet();
            set.setValue(Locale.getDefault().getLanguage(), property.getName());
            field.setLabel(set);
            field.setFieldRequired(property.getLower()==1);
            if (property.isComposite()) {
                field.setDefaultSubform(property.getType().getName() + ".form");
            }
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
        }
        return cmmnTypeMap.get(property.getType().getName());
    }
}
