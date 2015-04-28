package org.jbpm.designer.uml.code.metamodel.expressions;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;

public class MappedExpression extends CodeExpression {
    private Map<String,String> languageExpressionMap=new HashMap<String, String>();
    public void addExpression(String language, String expression){
        this.languageExpressionMap.put(language, expression);
    }
    public String getExpressionIn(String language){
        return this.languageExpressionMap.get(language);
    }
}
