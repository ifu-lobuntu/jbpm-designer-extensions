package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;

public class IsNullExpression extends CodeExpression {
	private CodeExpression source;

	public IsNullExpression(CodeExpression arg1) {
		this.source = arg1;
	}

	public CodeExpression getSource() {
		return source;
	}
}
