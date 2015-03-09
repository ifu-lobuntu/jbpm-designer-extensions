package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StencilSet {
    private String title;
    private String description;
    private String namespace;
    private String modelElementBinding;
    private String edgeSourceBinding;
    private String edgeTargetBinding;
    private List<PropertyPackage> propertyPackages;
    private List<Stencil> stencils;
    private Rules rules;

    public List<Stencil> getStencils() {
        return stencils;
    }

    public void setStencils(List<Stencil> stencils) {
        this.stencils = stencils;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<PropertyPackage> getPropertyPackages() {
        return propertyPackages;
    }

    public void setPropertyPackages(List<PropertyPackage> propertyPackages) {
        this.propertyPackages = propertyPackages;
    }

    public String getModelElementBinding() {
        return modelElementBinding;
    }

    public void setModelElementBinding(String modelElementBinding) {
        this.modelElementBinding = modelElementBinding;
    }

    public String getEdgeSourceBinding() {
        return edgeSourceBinding;
    }

    public void setEdgeSourceBinding(String edgeSourceBinding) {
        this.edgeSourceBinding = edgeSourceBinding;
    }

    public String getEdgeTargetBinding() {
        return edgeTargetBinding;
    }

    public void setEdgeTargetBinding(String edgeTargetBinding) {
        this.edgeTargetBinding = edgeTargetBinding;
    }

}
