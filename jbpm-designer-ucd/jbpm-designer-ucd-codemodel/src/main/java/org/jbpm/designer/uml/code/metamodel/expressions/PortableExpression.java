package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;

public class PortableExpression extends CodeExpression {
	private String expression;

	public PortableExpression(String expression) {
		super();
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}
}
