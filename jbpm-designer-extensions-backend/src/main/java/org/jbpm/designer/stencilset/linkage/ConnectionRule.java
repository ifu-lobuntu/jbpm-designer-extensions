package org.jbpm.designer.stencilset.linkage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionRule {
    private String role;
    private List<Connects> connects;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Connects> getConnects() {
        return connects;
    }

    public void setConnects(List<Connects> connects) {
        this.connects = connects;
    }

}
