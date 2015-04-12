package org.jbpm.designer.extensions.diagram;

import javax.enterprise.util.AnnotationLiteral;

public class ProfileNameLiteral extends AnnotationLiteral<ProfileNameLiteral> implements ProfileName{
    private static final long serialVersionUID = 5723072009815148972L;
    private String name;
    
    public ProfileNameLiteral(String name) {
        super();
        this.name = name;
    }

    @Override
    public String value() {
        return name;
    }

}
