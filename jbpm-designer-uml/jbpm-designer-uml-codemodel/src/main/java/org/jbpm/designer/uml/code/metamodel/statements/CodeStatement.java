package org.jbpm.designer.uml.code.metamodel.statements;

import org.jbpm.designer.uml.code.metamodel.CodeBlock;
import org.jbpm.designer.uml.code.metamodel.CodeElement;

public class CodeStatement extends CodeElement {

	public CodeStatement(String string, CodeBlock block) {
		super(string);
		block.getStatements().add(this);
	}

	public CodeStatement(CodeBlock block) {
		this("", block);
	}

	public CodeStatement(String string) {
		super(string);
	}

}
