package org.jbpm.designer.uml.codegen;

import java.util.SortedSet;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

public abstract class AbstractBuilder<PACKAGE, CLASSIFIER> {
	public abstract PACKAGE visitModel(Package model);

	public abstract void initialize(SortedSet<Package> models, PACKAGE p);

	public abstract PACKAGE visitPackage(Package model, PACKAGE parent);

	public abstract CLASSIFIER visitClass(Class cl, PACKAGE parent);

	public abstract CLASSIFIER visitEnum(Enumeration en, PACKAGE parent);

	public abstract void visitProperty(Property p, CLASSIFIER parent);

	public abstract void visitOperation(Operation o, CLASSIFIER parent);

	public abstract void visitEnumerationLiteral(EnumerationLiteral el, CLASSIFIER parent);
}
