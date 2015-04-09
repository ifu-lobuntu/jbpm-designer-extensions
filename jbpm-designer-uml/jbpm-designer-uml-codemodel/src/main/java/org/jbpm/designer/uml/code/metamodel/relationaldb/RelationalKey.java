package org.jbpm.designer.uml.code.metamodel.relationaldb;

public class RelationalKey implements IRelationalElement {
	private IdStrategy strategy;

	public RelationalKey(IdStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public IdStrategy getStrategy() {
		return strategy;
	}
}
