package org.jbpm.designer.server.diagram.json;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShapeReference {
    private String resourceId;

    public ShapeReference(String resourceId2) {
        this.resourceId = resourceId2;
    }

    public ShapeReference() {
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

}
