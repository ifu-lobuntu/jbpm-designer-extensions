package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Layout {
    private String type;
    private List<LayoutOption> options;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<LayoutOption> getOptions() {
        return options;
    }
    public void setOptions(List<LayoutOption> options) {
        this.options = options;
    }

}
