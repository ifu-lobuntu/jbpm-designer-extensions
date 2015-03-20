package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;

public class NewInstanceExpression extends CodeExpression {
	private CodeTypeReference type;

	public NewInstanceExpression(CodeTypeReference type) {
		super();
		this.type = type;
	}

	public CodeTypeReference getType() {
		return type;
	}
}
