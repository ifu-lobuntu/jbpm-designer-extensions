package org.jbpm.designer.cmmn1.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CaseParametersJson {
    private List<CaseParameterJson> parameters;

    public List<CaseParameterJson> getParameters() {
        return parameters;
    }

    public void setParameters(List<CaseParameterJson> parameters) {
        this.parameters = parameters;
    }
}