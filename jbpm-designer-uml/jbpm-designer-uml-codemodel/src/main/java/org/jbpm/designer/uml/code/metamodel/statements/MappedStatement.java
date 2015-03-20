package org.jbpm.designer.uml.code.metamodel.statements;

import java.util.Map;

import org.jbpm.designer.uml.code.metamodel.CodeBlock;

public class MappedStatement extends CodeStatement {
	private Map<String, String> statementInLanguages;

	public MappedStatement(CodeBlock block, Map<String, String> statementInLanguages) {
		super(block);
		this.statementInLanguages = statementInLanguages;
	}

	public String getStatementInLanguage(String language) {
		return statementInLanguages.get(language);
	}

}
