package org.jbpm.designer.uml.codegen.codemodel;

import java.util.SortedSet;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.jbpm.designer.uml.code.metamodel.CodeClass;
import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodeEnumeration;
import org.jbpm.designer.uml.code.metamodel.CodeModel;
import org.jbpm.designer.uml.code.metamodel.CodePackage;
import org.jbpm.designer.uml.code.metamodel.CodePackageReference;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;
import org.jbpm.designer.uml.codegen.AbstractBuilder;
import org.jbpm.designer.uml.codegen.StdlibMap;
import org.jbpm.designer.uml.codegen.UmlToCodeReferenceMap;

/**
 * A default implementation of the callbacks that are invoked from the UmlCodeModelVisitor. To be subclassed by
 * CodeModelBuilders that add CodeModel elements to the resultingCodeModel
 * 
 * @author ampie
 * 
 */
public class DefaultCodeModelBuilder extends AbstractBuilder<CodePackage, CodeClassifier> {
	protected CodeModel codeModel;
	private UmlToCodeReferenceMap umlToCodeReferenceMap = new UmlToCodeReferenceMap();

	public DefaultCodeModelBuilder() {
		super();
	}

	protected CodeTypeReference calculateTypeReference(Type type) {
	    if(type==null){
	        return StdlibMap.javaStringType;
	    }
		return umlToCodeReferenceMap.classifierPathname(type);
	}

	protected CodePackageReference calculatePackageReference(Namespace pkg) {
		return umlToCodeReferenceMap.packagePathname(pkg);
	}

	@Override
	public CodeClass visitClass(Class c, CodePackage codePackage) {
		return (CodeClass) codePackage.getClassifiers().get(c.getName());
	}

	@Override
	public CodePackage visitPackage(Package pkg, CodePackage parent) {
		return parent.getChildren().get(pkg.getName());
	}

	@Override
	public CodePackage visitModel(Package model) {
		return codeModel.getChildren().get(model.getName());
	}

	@Override
	public void visitProperty(Property property, CodeClassifier codeClass) {

	}

	@Override
	public void initialize(SortedSet<Package> models, CodePackage codeModel) {
		this.codeModel = (CodeModel) codeModel;
	}

	@Override
	public void visitOperation(Operation operation, CodeClassifier codeClass) {

	}

	@Override
	public CodeEnumeration visitEnum(Enumeration en, CodePackage parent) {
		return (CodeEnumeration) parent.getClassifiers().get(en.getName());
	}

	@Override
	public void visitEnumerationLiteral(EnumerationLiteral el, CodeClassifier parent) {
	}

}