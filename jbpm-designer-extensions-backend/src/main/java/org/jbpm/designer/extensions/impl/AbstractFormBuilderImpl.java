package org.jbpm.designer.extensions.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.IEmfBasedFormBuilder;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.api.model.Form;
import org.jbpm.formModeler.core.config.FieldTypeManager;
import org.jbpm.formModeler.core.config.FormManager;
import org.jbpm.formModeler.core.config.FormSerializationManager;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.io.IOService;

public abstract class AbstractFormBuilderImpl implements IEmfBasedFormBuilder {
    // TODO load this from CDI info, maybe
    // IEmfBasedFormBuilder.supportedEClasses
    private static Map<String, String> profileNameMap = new HashMap<String, String>();
    static {
        profileNameMap.put("THumanTask", "cmmn");
        profileNameMap.put("TPlanItem", "cmmn");
        profileNameMap.put("Store", "vdcm");
        profileNameMap.put("Pool", "vdcm");
        profileNameMap.put("OrgUnit", "vdcm");
        profileNameMap.put("CapabilityOffer", "vdcm");
        profileNameMap.put("InputPort", "vdan");
        profileNameMap.put("OutputPort", "vdan");
        profileNameMap.put("Activity", "vdan");
        profileNameMap.put("Class", "ucd");
        profileNameMap.put("Interface", "ucd");
    }
    @Inject
    @Named("ioStrategy")
    private IOService ioService;

    @Inject
    protected FormManager formManager;

    @Inject
    protected FormSerializationManager formSerializationManager;
    @Inject
    protected FieldTypeManager fieldTypeManager;

    @Inject
    @Any
    private Instance<IEmfBasedFormBuilder> otherFormBuilder;

    protected abstract boolean hasForm(EObject eObject);

    protected Map<String, TaskFormInfo> generateForm(Path modelPath, EObject source, String formType, boolean modify) {
        try {
            Map<String, TaskFormInfo> results = new HashMap<String, TaskFormInfo>();

            String modelUri = modelPath.toURI();
            String repositoryInfo = EMFVFSURIConverter.getRepositoryInfo(modelPath.toURI());
            String folder = modelUri.substring(0, modelUri.length() - modelPath.getFileName().length());
            TaskFormInfo result = new TaskFormInfo();
            char[] formName = getFormName(source).toCharArray();
            for (int i = 0; i < formName.length; i++) {
                char c = formName[i];
                if (!(Character.isJavaIdentifierPart(c) || c== '-' || c == '.')) {
                    formName[i] = '_';
                }
            }
            result.setId(new String(formName));
            String formFileName = result.getId() + ".form";
            result.setMetaOutput("empty");
            Path formPath = PathFactory.newPath(formFileName, folder + formFileName);
            Form form;
            org.uberfire.java.nio.file.Path kiePath = Paths.convert(formPath);
            if (ioService.exists(kiePath)) {
                form = formSerializationManager.loadFormFromXML(ioService.readAllString(kiePath).trim());
                if (modify) {
                    results.putAll(addFields(repositoryInfo, form, source, formType));
                }
            } else {
                form = formManager.createForm(formFileName);
                results.putAll(addFields(repositoryInfo, form, source, formType));
            }
            result.setPkgName(folder);
            result.setModelerOutput(formSerializationManager.generateFormXML(form));
            String id = JBPMECoreHelper.getID(source);
            results.put(id, result);
            return results;
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getFormName(EObject source) {
        return (String) source.eGet(source.eClass().getEStructuralFeature("name"));
    }

    public Collection<TaskFormInfo> generateAllForms(Path modelPath, XMLResource resource) {
        Collection<TaskFormInfo> result = new HashSet<TaskFormInfo>();
        EcoreUtil.resolveAll(resource);
        EList<Resource> resources = resource.getResourceSet().getResources();
        for (Resource resource2 : resources) {
            TreeIterator<EObject> allContents = resource2.getAllContents();
            while (allContents.hasNext()) {
                EObject eObject = (EObject) allContents.next();
                if (hasForm(eObject)) {
                    result.addAll(generateForm(modelPath, eObject, "default", true).values());
                }
            }
        }
        return result;
    }

    @Override
    public Map<String, TaskFormInfo> generateFormFor(Path modelPath, XMLResource resource, String elementId, String formType) {
        EObject eObject = JBPMECoreHelper.findEObject(resource.getResourceSet(), elementId);
        if (eObject != null) {
            return generateForm(modelPath, eObject, formType, true);
        }
        return Collections.emptyMap();
    }

    @Override
    public Map<String, TaskFormInfo> ensureFormExistsFor(Path modelPath, XMLResource resource, String elementId, String formType) {
        return generateForm(modelPath, resource.getEObject(elementId), formType, false);
    }

    protected Map<String, TaskFormInfo> prepareSubform(String repositoryInfo, Field field, EObject ref, boolean addDataHolder) {
        if (ref != null && !ref.eIsProxy()) {
            String profileName = profileNameMap.get(ref.eClass().getName());
            if (profileName != null) {
                IEmfBasedFormBuilder found = getOtherFormBuilder(profileName);
                if (found != null) {
                    if(addDataHolder) {
                        field.getForm().setDataHolder(found.buildDataHolderFor(field.getFieldName(), ref));
                    }
                    if (ref.eResource() instanceof XMLResource) {
                        XMLResource xr = (XMLResource) ref.eResource();
                        Path targetModelPath = PathFactory.newPath(xr.getURI().lastSegment(), repositoryInfo + xr.getURI().toPlatformString(true));
                        String refId = JBPMECoreHelper.getID(ref);
                        Map<String, TaskFormInfo> generatedSubForms = found.ensureFormExistsFor(targetModelPath, xr, refId, "");
                        TaskFormInfo subForm = generatedSubForms.get(refId);
                        // TODO check what the formEditor expects
                        field.setDefaultSubform(subForm.getId() + ".form");
                        return generatedSubForms;
                    }
                }
            }
        }
        return Collections.emptyMap();
    }

    public IEmfBasedFormBuilder getOtherFormBuilder(String profileName) {
        Instance<IEmfBasedFormBuilder> otherFormBuilder2 = this.otherFormBuilder;
        for (IEmfBasedFormBuilder b : otherFormBuilder2) {
            if (b.getProfileName().equals(profileName)) {
                return b;
            }
        }
        return null;
    }
}
