package org.jbpm.designer.uml.codegen.codemodel;

import org.eclipse.uml2.uml.Property;
import org.jbpm.designer.uml.code.metamodel.CodeField;
import org.jbpm.designer.uml.code.metamodel.CodePrimitiveTypeKind;
import org.jbpm.designer.uml.code.metamodel.PrimitiveTypeReference;
import org.jbpm.designer.uml.codegen.util.NameConverter;

public class EmfCodeModelBuilder extends CodeModelBuilder {
	@Override
	protected String generateGetterName(Property p, CodeField cf, String capitalized) {
		String getterName = "get" + capitalized;
		if (cf.getType() instanceof PrimitiveTypeReference && ((PrimitiveTypeReference) cf.getType()).getKind() == CodePrimitiveTypeKind.BOOLEAN) {
			if (p.getName().startsWith("is")) {
				getterName = p.getName();
			} else {
				getterName = "is" + NameConverter.capitalize(p.getName());
			}
		}
		return getterName;
	}
}
