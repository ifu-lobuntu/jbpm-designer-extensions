package org.jbpm.designer.uml.code.metamodel.documentdb;

public interface IDocumentProperty {
	public String getFullName();

	public PropertyType getPropertyType();

	public boolean isMandatory();

	public boolean isMultiple();
}
