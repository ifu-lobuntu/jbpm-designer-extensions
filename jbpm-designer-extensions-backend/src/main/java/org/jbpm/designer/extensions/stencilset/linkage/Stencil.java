package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stencil {

    private String type;
    private String id;
    private String title;
    private String description;
    private List<String> groups;
    private String view;
    private String icon;
    private List<String> propertyPackages;
    private List<String> roles;
    private List<Property> properties;
    private List<Layout> layout;
    private Boolean hidden;
    private Boolean mayBeRoot;
    private String sourceBinding;
    private String targetBinding;
    private String boundaryBinding;
    private String childBinding;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<String> getPropertyPackages() {
        return propertyPackages;
    }

    public void setPropertyPackages(List<String> propertyPackages) {
        this.propertyPackages = propertyPackages;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getMayBeRoot() {
        return mayBeRoot;
    }

    public void setMayBeRoot(Boolean mayBeRoot) {
        this.mayBeRoot = mayBeRoot;
    }

    public String getSourceBinding() {
        return sourceBinding;
    }

    public void setSourceBinding(String sourceBinding) {
        this.sourceBinding = sourceBinding;
    }

    public String getTargetBinding() {
        return targetBinding;
    }

    public void setTargetBinding(String targetBinding) {
        this.targetBinding = targetBinding;
    }

    public String getBoundaryBinding() {
        return boundaryBinding;
    }

    public void setBoundaryBinding(String boundaryBinding) {
        this.boundaryBinding = boundaryBinding;
    }

    public String getChildBinding() {
        return childBinding;
    }

    public void setChildBinding(String childBinding) {
        this.childBinding = childBinding;
    }
    @Override
    public String toString() {
        return "Stencil[" + getId() + "]";
    }
}
