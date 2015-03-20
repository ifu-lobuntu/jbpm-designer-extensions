package org.jbpm.designer.uml.code.metamodel.statements;

import org.jbpm.designer.uml.code.metamodel.CodeBlock;
import org.jbpm.designer.uml.code.metamodel.CodeExpression;

public class CodeWhileStatement extends CodeStatement {
	private CodeExpression condition;
	private CodeBlock body = new CodeBlock();

	public CodeWhileStatement(CodeBlock block, CodeExpression condition) {
		super("");
		block.getStatements().add(this);
		this.condition = condition;
	}

	public CodeExpression getCondition() {
		return condition;
	}

	public CodeBlock getBody() {
		return body;
	}

}
