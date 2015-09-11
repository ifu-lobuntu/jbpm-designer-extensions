package org.jbpm.designer.uml.code.metamodel.expressions;

import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StaticMethodCallExpression extends CodeExpression {
	private String methodName;
	private List<CodeExpression> arguments = new ArrayList<CodeExpression>();
	private CodeTypeReference type;

	public StaticMethodCallExpression(CodeTypeReference type, String methodName, CodeExpression... argument) {
		this.type = type;
		this.methodName = methodName;
		this.arguments.addAll(Arrays.asList(argument));
	}

	public StaticMethodCallExpression(CodeTypeReference type, String methodName, List<CodeExpression> args) {
		this.type = type;
		this.methodName = methodName;
		this.arguments.addAll(args);
	}

	public CodeTypeReference getType() {
		return type;
	}

	public String getMethodName() {
		return methodName;
	}

	public List<CodeExpression> getArguments() {
		return arguments;
	}

}
