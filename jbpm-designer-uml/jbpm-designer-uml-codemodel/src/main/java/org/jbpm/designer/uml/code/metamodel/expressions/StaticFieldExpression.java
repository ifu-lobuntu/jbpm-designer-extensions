package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;

public class StaticFieldExpression extends CodeExpression {
	private String fieldName;
	private CodeTypeReference type;

	public StaticFieldExpression(CodeTypeReference type, String fieldName) {
		this.fieldName = fieldName;
		this.type = type;
	}

	public CodeTypeReference getType() {
		return type;
	}

	public String getFieldName() {
		return fieldName;
	}
}
