package org.jbpm.designer.extensions.api;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.formModeler.api.model.DataHolder;
import org.jbpm.formModeler.api.model.Form;
import org.uberfire.backend.vfs.Path;

public interface IEmfBasedFormBuilder {
    String getProfileName();
    Collection<TaskFormInfo> generateAllForms(Path modelPath, XMLResource resource);

    Map<String, TaskFormInfo> generateFormFor(Path modelPath, XMLResource resource, String elementId, String formType);

    Map<String, TaskFormInfo>  ensureFormExistsFor(Path modelPath, XMLResource resource, String elementId, String formType);

    DataHolder buildDataHolderFor(String name, EObject eobject);
    
    Map<String, TaskFormInfo>  addFields(String repositoryInfo, Form form, EObject eobject, String formType) throws Exception;


    // Field buildFieldFor(EObject eobject); //TODO think this through, but
    // currently the subform level seems good enough
}
