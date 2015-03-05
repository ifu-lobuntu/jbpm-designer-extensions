package org.jbpm.designer.cmmn1.impl;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CaseParameterJson {
    private String name;
    private String id;
    private String binding;
    private String bindingRefinement;
    private String bindingRefinementLanguage;
    private String mappedParameter;
    private String expectedType;

    public String getMappedParameter() {
        return mappedParameter;
    }

    public void setMappedParameter(String mappedParameter) {
        this.mappedParameter = mappedParameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBindingRefinement() {
        return bindingRefinement;
    }

    public void setBindingRefinement(String bindingRefinement) {
        this.bindingRefinement = bindingRefinement;
    }

    public String getBindingRefinementLanguage() {
        return bindingRefinementLanguage;
    }

    public void setBindingRefinementLanguage(String bindingRefinementLanguage) {
        this.bindingRefinementLanguage = bindingRefinementLanguage;
    }

    public String getExpectedType() {
        return expectedType;
    }

    public void setExpectedType(String expectedType) {
        this.expectedType = expectedType;
    }


}
