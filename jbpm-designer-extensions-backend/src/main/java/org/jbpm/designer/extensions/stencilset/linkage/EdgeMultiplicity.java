package org.jbpm.designer.extensions.stencilset.linkage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EdgeMultiplicity {
    private String role;
    private int maximum;
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getMaximum() {
        return maximum;
    }
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

}
