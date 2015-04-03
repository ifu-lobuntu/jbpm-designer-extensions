package org.jbpm.designer.extensions.stencilset.linkage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EObjectReference {
    private String targetProfile;
    private String nameFeature;
    private String allowedElementTypes;
    private boolean multiSelect=false;
    public String getTargetProfile() {
        return targetProfile;
    }
    public void setTargetProfile(String targetProfile) {
        this.targetProfile = targetProfile;
    }
    public String getNameFeature() {
        return nameFeature;
    }
    public void setNameFeature(String nameFeature) {
        this.nameFeature = nameFeature;
    }
    public String getAllowedElementTypes() {
        return allowedElementTypes;
    }
    public void setAllowedElementTypes(String allowedElementTypes) {
        this.allowedElementTypes = allowedElementTypes;
    }
    public boolean isMultiSelect() {
        return multiSelect;
    }
    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }
    
}
