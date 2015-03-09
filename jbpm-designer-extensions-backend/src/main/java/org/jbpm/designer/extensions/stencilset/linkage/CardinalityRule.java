package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CardinalityRule {
    private String role;
    private List<EdgeMultiplicity> incomingEdges=new ArrayList<EdgeMultiplicity>();
    private List<EdgeMultiplicity> outgoingEdges=new ArrayList<EdgeMultiplicity>();

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<EdgeMultiplicity> getIncomingEdges() {
        return incomingEdges;
    }

    public void setIncomingEdges(List<EdgeMultiplicity> incomingEdges) {
        this.incomingEdges = incomingEdges;
    }

    public List<EdgeMultiplicity> getOutgoingEdges() {
        return outgoingEdges;
    }

    public void setOutgoingEdges(List<EdgeMultiplicity> outgoingEdges) {
        this.outgoingEdges = outgoingEdges;
    }

}
