package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodePrimitiveTypeKind;

public class PrimitiveDefaultExpression extends CodeExpression {
	private CodePrimitiveTypeKind primitiveTypeKind;

	public PrimitiveDefaultExpression(CodePrimitiveTypeKind primitiveTypeKind) {
		super();
		this.primitiveTypeKind = primitiveTypeKind;
	}

	public CodePrimitiveTypeKind getPrimitiveTypeKind() {
		return primitiveTypeKind;
	}
}
