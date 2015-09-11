package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MappedExpression extends CodeExpression {
    private Map<String,String> languageExpressionMap=new HashMap<String, String>();
    public void addExpression(String language, String expression){
        this.languageExpressionMap.put(language, expression);
    }
    public String getExpressionIn(String language){
        return this.languageExpressionMap.get(language);
    }
}
