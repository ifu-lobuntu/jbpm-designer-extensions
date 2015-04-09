package org.jbpm.designer.uml.code.metamodel;

public enum OclStandardLibrary {
	COLLECTIONS("OclCollections"), PRIMITIVES("OclPrimitives"), FORMATTER("OclFormatter"), MATH("OclMath");
	private String physicalName;

	private OclStandardLibrary(String name) {
		physicalName = name;
	}

	public String getPhysicalName() {
		return physicalName;
	}
}
