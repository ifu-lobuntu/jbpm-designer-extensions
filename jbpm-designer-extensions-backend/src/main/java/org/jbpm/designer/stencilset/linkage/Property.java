package org.jbpm.designer.stencilset.linkage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Property {
    private String id;
    private String type;
    private String title;
    private String value;
    private String description;
    private boolean readonly;
    private boolean optional;
    private int length;
    private boolean wrapLines;
    private boolean directlyEditable;
    private String binding;
    private List<String> refToView;
    private List<Item> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWrapLines() {
        return wrapLines;
    }

    public void setWrapLines(boolean wrapLines) {
        this.wrapLines = wrapLines;
    }

    public List<String> getRefToView() {
        return refToView;
    }

    public void setRefToView(List<String> refToView) {
        this.refToView = refToView;
    }

    public boolean isDirectlyEditable() {
        return directlyEditable;
    }

    public void setDirectlyEditable(boolean directlyEditable) {
        this.directlyEditable = directlyEditable;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }


}
