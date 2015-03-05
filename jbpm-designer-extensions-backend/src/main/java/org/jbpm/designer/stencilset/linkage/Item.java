package org.jbpm.designer.stencilset.linkage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
    private String id;
    private String title;
    private String value;
    private String icon;
    private String refToView;


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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRefToView() {
        return refToView;
    }

    public void setRefToView(String refToView) {
        this.refToView = refToView;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
