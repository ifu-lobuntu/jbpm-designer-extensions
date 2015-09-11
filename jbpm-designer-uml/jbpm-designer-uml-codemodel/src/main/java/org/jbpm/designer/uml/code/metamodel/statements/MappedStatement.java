package org.jbpm.designer.uml.code.metamodel.statements;

import org.jbpm.designer.uml.code.metamodel.CodeBlock;

import java.util.Map;


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
