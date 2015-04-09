package org.jbpm.designer.uml.code.metamodel.statements;

import org.jbpm.designer.uml.code.metamodel.CodeBlock;
import org.jbpm.designer.uml.code.metamodel.CodeExpression;

public class SetResultStatement extends AssignmentStatement {

	public SetResultStatement(CodeBlock block, CodeExpression value) {
		super(block, "result", value);
	}

	public SetResultStatement(CodeExpression value) {
		super("result", value);

	}

}
