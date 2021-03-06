package org.jbpm.designer.uml.codegen.codemodel;

import static org.jbpm.designer.uml.codegen.util.NameConverter.capitalize;
import static org.jbpm.designer.uml.codegen.util.NameConverter.decapitalize;
import static org.jbpm.designer.uml.codegen.util.NameConverter.toUnderscoreStyle;
import static org.jbpm.designer.uml.codegen.util.NameConverter.toValidVariableName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;
import org.jbpm.designer.extensions.util.NameConverter;
import org.jbpm.designer.uml.code.metamodel.AssociationCollectionTypeReference;
import org.jbpm.designer.uml.code.metamodel.CodeClass;
import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodeCollectionKind;
import org.jbpm.designer.uml.code.metamodel.CodeConstructor;
import org.jbpm.designer.uml.code.metamodel.CodeEnumeration;
import org.jbpm.designer.uml.code.metamodel.CodeEnumerationLiteral;
import org.jbpm.designer.uml.code.metamodel.CodeExpression;
import org.jbpm.designer.uml.code.metamodel.CodeField;
import org.jbpm.designer.uml.code.metamodel.CodeMethod;
import org.jbpm.designer.uml.code.metamodel.CodePackage;
import org.jbpm.designer.uml.code.metamodel.CodeParameter;
import org.jbpm.designer.uml.code.metamodel.CodePrimitiveTypeKind;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;
import org.jbpm.designer.uml.code.metamodel.CodeVisibilityKind;
import org.jbpm.designer.uml.code.metamodel.CollectionTypeReference;
import org.jbpm.designer.uml.code.metamodel.PrimitiveTypeReference;
import org.jbpm.designer.uml.code.metamodel.documentdb.IDocumentElement;
import org.jbpm.designer.uml.code.metamodel.expressions.BinaryOperatorExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.IsNullExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.LiteralPrimitiveExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.MappedExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.NewInstanceExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.NotExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.NullExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.PortableExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.PrimitiveDefaultExpression;
import org.jbpm.designer.uml.code.metamodel.expressions.ReadFieldExpression;
import org.jbpm.designer.uml.code.metamodel.relationaldb.IRelationalElement;
import org.jbpm.designer.uml.code.metamodel.statements.*;
import org.jbpm.designer.uml.codegen.util.EmfClassifierUtil;
import org.jbpm.designer.uml.codegen.util.EmfParameterUtil;
import org.jbpm.designer.uml.codegen.util.EmfPropertyUtil;

public class CodeModelBuilder extends DefaultCodeModelBuilder {
    private boolean useAssociationCollections = false;
    private DocumentUtil documentUtil = new DocumentUtil();

    public boolean useAssociationCollections() {
        return useAssociationCollections;
    }

    public CodeModelBuilder(boolean useAssociationCollections) {
        super();
        this.useAssociationCollections = useAssociationCollections;
    }

    public CodeModelBuilder() {
        this(false);
    }

    @Override
    public void visitProperty(Property p, CodeClassifier codeClass) {
        String fieldName = toValidVariableName(p.getName());
        CodeField cf = new CodeField(codeClass, fieldName);
        cf.setType(calculateType(p));
        cf.putData(IRelationalElement.class, RelationalUtil.buildRelationalElement(p));
        cf.putData(IDocumentElement.class, documentUtil.buildDocumentElement(p));
        String capitalized = toValidVariableName(capitalize(p.getName()));
        String getterName = generateGetterName(p, cf, capitalized);

        CodeMethod getter = new CodeMethod(codeClass, getterName, cf.getType());
        if (useAssociationCollections && p.getOtherEnd() != null && EmfPropertyUtil.isNavigable(p.getOtherEnd()) && EmfPropertyUtil.isMany(p) && p.isUnique()) {
            getter.setResultInitialValue(new ReadFieldExpression(fieldName + "Wrapper"));
        } else {
            getter.setResultInitialValue(new ReadFieldExpression(fieldName));
        }
        CodeMethod setter = new CodeMethod("set" + capitalized);
        if (codeClass instanceof CodeEnumeration) {
            setter.setVisibility(CodeVisibilityKind.PRIVATE);
        }
        CodeParameter param = new CodeParameter("new" + capitalized, setter, cf.getType());
        setter.setDeclaringClass(codeClass);
        if (p.getOtherEnd() != null && EmfPropertyUtil.isNavigable(p.getOtherEnd())) {
            if (EmfPropertyUtil.isManyToMany(p)) {
                new AssignmentStatement(setter.getBody(), "${self}." + fieldName, new PortableExpression(param.getName()));
            } else if (EmfPropertyUtil.isOneToMany(p)) {
                NotExpression notNull = new NotExpression(new IsNullExpression(new PortableExpression(param.getName())));
                CodeIfStatement ifNewNotNull = new CodeIfStatement(setter.getBody(), notNull);
                new PortableStatement(ifNewNotNull.getThenBlock(), param.getName() + ".get" + capitalize(p.getOtherEnd().getName()) + "().add(this)");
                NotExpression oldNotNull = new NotExpression(new IsNullExpression(new PortableExpression("${self}." + fieldName)));
                CodeIfStatement ifOldNotNull = new CodeIfStatement(ifNewNotNull.getElseBlock(), oldNotNull);
                new PortableStatement(ifOldNotNull.getThenBlock(), "${self}." + fieldName + ".get" + capitalize(p.getOtherEnd().getName()) + "().remove(this)");
                new AssignmentStatement(setter.getBody(), "${self}." + fieldName, new PortableExpression(param.getName()));
            } else if (EmfPropertyUtil.isManyToOne(p)) {
                CodeTypeReference type = cf.getType().getElementTypes().get(0).getType();
                CodeField old=new CodeField(setter.getBody(), "oldValues",cf.getType());
                old.setInitialization(cf.getInitialization());
                new MethodCallStatement(setter.getBody(),"oldValues.addAll",new ReadFieldExpression(fieldName));
                CodeForStatement forOld = new CodeForStatement(setter.getBody(), "cur", type, new PortableExpression("oldValues"));
                new MethodCallStatement(forOld.getBody(), "cur.set" + capitalize(p.getOtherEnd().getName()), new NullExpression());
                CodeIfStatement ifNotNull = new CodeIfStatement(setter.getBody(), new NotExpression(new IsNullExpression(new PortableExpression(param.getName()))));
                CodeForStatement forNew = new CodeForStatement(ifNotNull.getThenBlock(), "cur", type, new PortableExpression(param.getName()));
                new PortableStatement(forNew.getBody(), "cur.set" + capitalize(p.getOtherEnd().getName()) + "(${self})");

            } else if (EmfPropertyUtil.isOneToOne(p)) {
                new CodeField(setter.getBody(), "oldValue", param.getType()).setInitExp("${self}." + fieldName);
                NotExpression notEquals = new NotExpression(new BinaryOperatorExpression(new PortableExpression(param.getName()), "${equals}",
                        new PortableExpression("oldValue")));
                BinaryOperatorExpression nullOrNotEquals = new BinaryOperatorExpression(new IsNullExpression(new PortableExpression(param.getName())), "||",
                        notEquals);
                CodeIfStatement ifNotEquals = new CodeIfStatement(setter.getBody(), nullOrNotEquals);
                new AssignmentStatement(ifNotEquals.getThenBlock(), "${self}." + fieldName, new PortableExpression(param.getName()));
                CodeIfStatement ifOldNotNull = new CodeIfStatement(ifNotEquals.getThenBlock(), new NotExpression(new IsNullExpression(new PortableExpression(
                        "oldValue"))));
                String otherCappedName = toValidVariableName(capitalize(p.getOtherEnd().getName()));
                new MethodCallStatement(ifOldNotNull.getThenBlock(), "oldValue.set" + otherCappedName, new NullExpression());
                CodeIfStatement ifNewNotNull = new CodeIfStatement(ifNotEquals.getThenBlock(), new NotExpression(new IsNullExpression(new PortableExpression(
                        param.getName()))));
                NotExpression otherNotEquals = new NotExpression(new BinaryOperatorExpression(new PortableExpression("${self}"), "${equals}",
                        new PortableExpression(param.getName() + ".get" + otherCappedName + "()")));
                CodeIfStatement ifOtherNotEquals = new CodeIfStatement(ifNewNotNull.getThenBlock(), otherNotEquals);
                new PortableStatement(ifOtherNotEquals.getThenBlock(), param.getName() + ".set" + otherCappedName + "(${self})");
            }
        } else {
            new AssignmentStatement(setter.getBody(), "${self}." + fieldName, new PortableExpression(param.getName()));
        }
    }

    protected String generateGetterName(Property p, CodeField cf, String capitalized) {
        String getterName = "get" + capitalized;

        return getterName;
    }

    private CodeTypeReference calculateType(TypedElement te) {
        CodeTypeReference result = null;
        if (EmfPropertyUtil.isMany(te)) {
            MultiplicityElement me = (MultiplicityElement) te;
            if (useAssociationCollections && me instanceof Property && ((Property) me).getOtherEnd() != null
                    && EmfPropertyUtil.isNavigable(((Property) me).getOtherEnd())) {
                Property otherEnd = ((Property) me).getOtherEnd();
                result = calculateAssociationType(me, otherEnd);
                AssociationCollectionTypeReference associationCollectionTypeReference = (AssociationCollectionTypeReference) result;
                if (EmfPropertyUtil.isMany(otherEnd)) {
                    AssociationCollectionTypeReference otherType = calculateAssociationType(otherEnd, (Property) me);
                    associationCollectionTypeReference.setOtherFieldType(otherType);
                    otherType.setOtherFieldType(associationCollectionTypeReference);
                } else {
                    associationCollectionTypeReference.setOtherFieldType(calculateType(otherEnd));
                }
            } else {
                if (me.isUnique() && me.isOrdered()) {
                    result = new CollectionTypeReference(CodeCollectionKind.ORDERED_SET);
                } else if (me.isUnique()) {
                    result = new CollectionTypeReference(CodeCollectionKind.SET);
                } else if (me.isOrdered()) {
                    result = new CollectionTypeReference(CodeCollectionKind.SEQUENCE);
                } else {
                    result = new CollectionTypeReference(CodeCollectionKind.BAG);
                }
                result.addToElementTypes(calculateTypeReference(te.getType()));
            }
        } else if (te.getType() instanceof PrimitiveType) {
            CodePrimitiveTypeKind primitiveTypeKind = getPrimitiveTypeKind(te);
            if(primitiveTypeKind==null){
                result = calculateTypeReference(te.getType());
            }else{
                result = new PrimitiveTypeReference(primitiveTypeKind, EmfClassifierUtil.getMappings(te.getType()));
            }
        } else {
            result = calculateTypeReference(te.getType());
        }
        return result;
    }

    protected AssociationCollectionTypeReference calculateAssociationType(MultiplicityElement me, Property otherEnd) {
        AssociationCollectionTypeReference result;
        String otherFieldName = decapitalize(otherEnd.getName());

        Property thisEnd = (Property) me;
        if (me.isUnique() && me.isOrdered()) {
            result = new AssociationCollectionTypeReference(CodeCollectionKind.ORDERED_SET, otherFieldName, thisEnd.isComposite());
        } else if (me.isUnique()) {
            result = new AssociationCollectionTypeReference(CodeCollectionKind.SET, otherFieldName, thisEnd.isComposite());
        } else if (me.isOrdered()) {
            result = new AssociationCollectionTypeReference(CodeCollectionKind.SEQUENCE, otherFieldName, thisEnd.isComposite());
        } else {
            result = new AssociationCollectionTypeReference(CodeCollectionKind.BAG, otherFieldName, thisEnd.isComposite());
        }
        result.addToElementTypes(calculateTypeReference(thisEnd.getType()));

        return result;
    }

    private CodePrimitiveTypeKind getPrimitiveTypeKind(TypedElement te) {
        return getPrimitiveTypeKind((PrimitiveType) te.getType());
    }

    private CodePrimitiveTypeKind getPrimitiveTypeKind(PrimitiveType type) {
        try {
            if(type==null || type.eIsProxy()){
                return null;
            }
            return CodePrimitiveTypeKind.valueOf(type.getName().toUpperCase());
        } catch (IllegalArgumentException e) {
            if (type.getGenerals().size() > 0) {
                return getPrimitiveTypeKind((PrimitiveType) type.getGenerals().get(0));
            } else {
                return null;
            }
        }
    }

    @Override
    public CodePackage visitModel(Package model) {
        CodePackage result = new CodePackage(NameConverter.toValidVariableName(model.getName()).toLowerCase(), codeModel);
        result.setPackageReference(this.calculatePackageReference(model));
        return result;
    }

    @Override
    public void visitOperation(Operation operation, CodeClassifier codeClass) {
        CodeMethod cm = new CodeMethod(operation.getName());
        for (Parameter parameter : EmfParameterUtil.getArgumentParameters(operation)) {
            cm.addParam(toValidVariableName(parameter.getName()), calculateType(parameter));
        }
        Parameter returnParameter = EmfParameterUtil.getReturnParameter(operation);
        if (returnParameter != null) {
            cm.setReturnType(calculateType(returnParameter));
        }
        if (hasBodyButNotOclOcl(operation)) {
            OpaqueExpression oe = (OpaqueExpression) operation.getBodyCondition().getSpecification();
            Map<String, String> map = new HashMap<String, String>();
            EList<String> bodies = oe.getBodies();
            for (int i = 0; i < bodies.size(); i++) {
                map.put(oe.getLanguages().get(i), bodies.get(i));
            }
            new MappedStatement(cm.getBody(), map);
        } else if (returnParameter != null) {
            if (cm.getReturnType() instanceof CollectionTypeReference) {
                cm.setResultInitialValue(new NewInstanceExpression(cm.getReturnType()));
            } else if (cm.getReturnType() instanceof PrimitiveTypeReference) {
                cm.setResultInitialValue(new PrimitiveDefaultExpression(((PrimitiveTypeReference) cm.getReturnType()).getKind()));
            } else {
                cm.setResultInitialValue(new NullExpression());
            }

        }
        cm.setDeclaringClass(codeClass);
    }

    protected boolean hasBodyButNotOclOcl(Operation operation) {
        if (operation.getBodyCondition() != null && operation.getBodyCondition().getSpecification() instanceof OpaqueExpression) {
            OpaqueExpression oe = (OpaqueExpression) operation.getBodyCondition().getSpecification();
            return !(oe.getLanguages().contains("ocl") || oe.getLanguages().contains("OCL"));
        } else {
            return false;
        }
    }

    @Override
    public CodePackage visitPackage(Package pkg, CodePackage parent) {
        CodePackage result = parent.findOrCreatePackage(pkg.getName());
        result.setPackageReference(this.calculatePackageReference(pkg));
        return result;
    }

    private String toCodeLiteral(EnumerationLiteral lit) {
        return toUnderscoreStyle(toValidVariableName(lit.getName())).toUpperCase();
    }

    @Override
    public void visitEnumerationLiteral(EnumerationLiteral el, CodeClassifier parent) {
        CodeEnumeration codeEnumeration = (CodeEnumeration) parent;
        CodeEnumerationLiteral codeLiteral = new CodeEnumerationLiteral(codeEnumeration, toCodeLiteral(el));
        EList<Slot> slots = el.getSlots();
        for (Slot slot : slots) {
            if (slot.getDefiningFeature() != null) {
                CodeExpression value = null;
                if (EmfPropertyUtil.isMany(slot.getDefiningFeature())) {
                    // TODO: ampie
                } else {
                    if (slot.getValues().size() == 0) {
                        value = new NullExpression();
                    } else if (slot.getValues().size() == 1) {
                        ValueSpecification valueSpecification = slot.getValues().get(0);
                        if (valueSpecification instanceof LiteralSpecification) {
                            LiteralSpecification literal = (LiteralSpecification) valueSpecification;
                            if (literal instanceof LiteralString) {
                                value = new LiteralPrimitiveExpression(CodePrimitiveTypeKind.STRING, literal.stringValue() + "");
                            } else if (literal instanceof LiteralBoolean) {
                                value = new LiteralPrimitiveExpression(CodePrimitiveTypeKind.BOOLEAN, literal.booleanValue() + "");
                            } else if (literal instanceof LiteralInteger) {
                                value = new LiteralPrimitiveExpression(CodePrimitiveTypeKind.INTEGER, literal.integerValue() + "");
                            } else if (literal instanceof LiteralNull) {
                                value = new NullExpression();
                                // } else if (literal instanceof LiteralReal) {
                                // value = new
                                // LiteralPrimitiveExpression(CodePrimitiveTypeKind.REAL,
                                // literal.realValue() + "");
                            } else {
                                value = new LiteralPrimitiveExpression(CodePrimitiveTypeKind.REAL, literal.stringValue() + "");
                            }
                        }else if(valueSpecification instanceof OpaqueExpression){
                            OpaqueExpression oe = (OpaqueExpression) valueSpecification;
                            MappedExpression me=new MappedExpression();
                            EList<String> languages = oe.getLanguages();
                            for(int i=0; i <languages.size() ; i++){
                                if(oe.getBodies().size()>i){
                                    me.addExpression(languages.get(i), oe.getBodies().get(i));
                                }
                            }
                            value=me;
                        }
                    } else {
                        throw new IllegalStateException("Property '" + slot.getDefiningFeature().getName() + "' can only have one value");
                    }
                }
                if (value == null) {
                    value = new NullExpression();
                }
                CodeField field = codeEnumeration.getFields().get(toValidVariableName(slot.getDefiningFeature().getName()));
                codeLiteral.addToFieldValues(field, value);
            }
        }
    }

    protected MappedExpression buildMappedExpression(OpaqueExpression oe) {
        MappedExpression me=new MappedExpression();
        EList<String> languages = oe.getLanguages();
        for(int i=0; i <languages.size() ; i++){
            if(oe.getBodies().size()>i){
                me.addExpression(languages.get(i), oe.getBodies().get(i));
            }
        }
        return me;
    }

    @Override
    public CodeEnumeration visitEnum(Enumeration en, CodePackage parent) {
        CodeEnumeration codeEnum = new CodeEnumeration(toValidVariableName(en.getName()), parent);
        codeEnum.setTypeReference(this.calculateTypeReference(en));
        codeEnum.putData(Model.class, en.getModel());
        return codeEnum;
    }

    @Override
    public CodeClass visitClass(Class c, CodePackage codePackage) {
        CodeClass codeClass = new CodeClass(toValidVariableName(c.getName()), codePackage);
        EList<Class> superClasses = c.getSuperClasses();
        if (superClasses.size() == 1) {
            codeClass.setSuperClass(calculateTypeReference(superClasses.get(0)));
        }
        EList<Interface> implementedInterfaces = c.getImplementedInterfaces();
        for (Interface interface1 : implementedInterfaces) {
            codeClass.addToImplementedInterfaces(calculateTypeReference(interface1));
        }
        codeClass.putData(Model.class, c.getModel());
        codeClass.setTypeReference(this.calculateTypeReference(c));
        codeClass.putData(IRelationalElement.class, RelationalUtil.buildRelationalElement(c));
        codeClass.putData(IDocumentElement.class, documentUtil.getDocumentNode(c));
        Property endToComposite = EmfPropertyUtil.getEndToComposite(c);
        new CodeConstructor(codeClass);
        // CodeField id = new CodeField(codeClass, "id", new
        // PrimitiveTypeReference(CodePrimitiveTypeKind.STRING));
        // id.putData(IRelationalElement.class, new
        // RelationalKey(IdStrategy.AUTO_ID));
        // DocumentProperty uuid = new DocumentProperty("id",
        // documentUtil.buildNamespace(c), PropertyType.STRING, false, false);
        // uuid.setUuid(true);
        // id.setInitialization(new NullExpression());
        // id.putData(IDocumentElement.class, uuid);// (IdStrategy.AUTO_ID));
        // CodeMethod getId = new CodeMethod(codeClass, "getId", new
        // PrimitiveTypeReference(CodePrimitiveTypeKind.STRING));
        // getId.setResultInitialValue(new ReadFieldExpression("id"));
        // CodeMethod setId = new CodeMethod("setId");
        // setId.addParam("id", new
        // PrimitiveTypeReference(CodePrimitiveTypeKind.STRING));
        // setId.setDeclaringClass(codeClass);
        // new AssignmentStatement(setId.getBody(), "${self}.id", new
        // PortableExpression("id"));
        // if (!c.isAbstract() && endToComposite == null) {
        // // TODO put in a OcmCodeModelBuilder
        // CodeField path = new CodeField(codeClass, "path", new
        // PrimitiveTypeReference(CodePrimitiveTypeKind.STRING));
        // DocumentProperty prop = new DocumentProperty("path",
        // documentUtil.getNamespaceOf(c), PropertyType.STRING, true, false);
        // prop.setPath(true);
        // path.putData(IDocumentElement.class, prop);
        // path.setInitialization("\"/" + codeClass.getName() + "Collection\"");
        // new CodeMethod(codeClass, "getPath",
        // path.getType()).setResultInitialValue("${self}.path");
        // CodeMethod setter = new CodeMethod("setPath");
        // setter.addParam("path", path.getType());
        // setter.setDeclaringClass(codeClass);
        // new PortableStatement(setter.getBody(), "${self}.path=path");
        // CodeConstructor constr = new CodeConstructor();
        // constr.addParam("path", new
        // PrimitiveTypeReference(CodePrimitiveTypeKind.STRING));
        // new AssignmentStatement(constr.getBody(), "${self}.path", new
        // PortableExpression("path"));
        // constr.setDeclaringClass(codeClass);
        // } else
        if (endToComposite != null) {
            CodeConstructor constr = new CodeConstructor();
            constr.addParam("owner", calculateType(endToComposite));
            constr.setDeclaringClass(codeClass);
            new MethodCallStatement(constr.getBody(), "${self}.set" + toValidVariableName(capitalize(endToComposite.getName())),
                    new PortableExpression("owner"));
        }
        return codeClass;
    }
}
