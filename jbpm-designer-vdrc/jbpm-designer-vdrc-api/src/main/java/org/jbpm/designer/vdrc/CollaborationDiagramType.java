package org.jbpm.designer.vdrc;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class CollaborationDiagramType {
    private String profileName;
    private String description;
    private CollaborationType defaultForCollaborationType;
    
    public String getProfileName() {
        return profileName;
    }
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public CollaborationType getDefaultForCollaborationType() {
        return defaultForCollaborationType;
    }
    public void setDefaultForCollaborationType(CollaborationType defaultForCollaborationType) {
        this.defaultForCollaborationType = defaultForCollaborationType;
    }
    
}
