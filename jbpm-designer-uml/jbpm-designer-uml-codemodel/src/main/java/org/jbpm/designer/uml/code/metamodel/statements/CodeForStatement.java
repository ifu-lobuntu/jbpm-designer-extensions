package org.jbpm.designer.uml.code.metamodel.statements;

import org.jbpm.designer.uml.code.metamodel.CodeBlock;
import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;

public class CodeForStatement extends CodeStatement {
	private CodeBlock body;
	private CodeExpression collectionExpression;
	private CodeTypeReference elemType;
	private String elemName;

	public CodeForStatement(CodeBlock block) {
		super(block);
	}

	public CodeForStatement(CodeBlock block, String varName, CodeTypeReference elementType, CodeExpression source) {
		this(block);
		this.elemName = varName;
		this.elemType = elementType;
		this.collectionExpression = source;

	}

	public CodeBlock getBody() {
		return body == null ? body = new CodeBlock() : body;
	}

	public CodeExpression getCollectionExpression() {
		return collectionExpression;
	}

	public CodeTypeReference getElemType() {
		return elemType;
	}

	public String getElemName() {
		return elemName;
	}

}
