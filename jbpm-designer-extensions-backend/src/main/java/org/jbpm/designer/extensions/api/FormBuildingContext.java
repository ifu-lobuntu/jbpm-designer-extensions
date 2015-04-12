package org.jbpm.designer.extensions.api;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.jbpm.designer.taskforms.TaskFormInfo;

public class FormBuildingContext {
    private String repository;

    private Map<String, TaskFormInfo> forms = new HashMap<String, TaskFormInfo>();
    private ResourceSet resourceSet;

    public FormBuildingContext(String repository, ResourceSet resourceSet) {
        super();
        this.repository = repository;
        this.resourceSet = resourceSet;
    }

    public String getRepository() {
        return repository;
    }

    public Map<String, TaskFormInfo> getForms() {
        return forms;
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }
}
