package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;

public class TypeExpression extends CodeExpression {
	private CodeTypeReference type;
	private TypeExpressionKind kind;
	private CodeExpression arg;

	public TypeExpression(CodeTypeReference type, TypeExpressionKind kind, CodeExpression arg) {
		super();
		this.type = type;
		this.kind = kind;
		this.arg = arg;
	}

	public CodeTypeReference getType() {
		return type;
	}

	public TypeExpressionKind getKind() {
		return kind;
	}

	public CodeExpression getArg() {
		return arg;
	}

}
