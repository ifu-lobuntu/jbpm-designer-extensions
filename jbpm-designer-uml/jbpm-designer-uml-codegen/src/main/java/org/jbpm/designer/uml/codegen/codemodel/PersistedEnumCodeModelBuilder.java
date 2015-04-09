package org.jbpm.designer.uml.codegen.codemodel;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodeEnumeration;
import org.jbpm.designer.uml.code.metamodel.CodePackage;

public class PersistedEnumCodeModelBuilder extends CodeModelBuilder {
	@Override
	public CodeEnumeration visitEnum(Enumeration en, CodePackage parent) {
		CodeEnumeration result = super.visitEnum(en, parent);
		result.setName(result.getName()+"Enum");
		return result;
	}

	@Override
	public void visitEnumerationLiteral(EnumerationLiteral el, CodeClassifier parent) {
		super.visitEnumerationLiteral(el, parent);
	}
}
