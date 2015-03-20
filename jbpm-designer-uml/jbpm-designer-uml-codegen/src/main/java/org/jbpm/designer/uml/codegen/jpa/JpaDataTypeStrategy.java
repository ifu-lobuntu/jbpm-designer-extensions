package org.jbpm.designer.uml.codegen.jpa;

import java.util.Set;

import org.jbpm.designer.uml.code.metamodel.CodeField;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalColumn;
import org.jbpm.designer.uml.codegen.java.JavaCodeGenerator;

public interface JpaDataTypeStrategy {
	Set<String> getImports();

	void beforeField(String padding, JavaCodeGenerator sb, CodeField field, RelationalColumn col);
}
