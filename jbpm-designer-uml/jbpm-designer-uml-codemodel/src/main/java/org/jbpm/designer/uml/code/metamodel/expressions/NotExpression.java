package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;

public class NotExpression extends CodeExpression {
	private CodeExpression source;

	public NotExpression(CodeExpression source) {
		super();
		this.source = source;
	}

	public CodeExpression getSource() {
		return source;
	};
}
