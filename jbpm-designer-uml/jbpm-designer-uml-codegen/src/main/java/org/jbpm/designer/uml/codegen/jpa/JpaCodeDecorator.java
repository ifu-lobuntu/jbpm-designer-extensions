package org.jbpm.designer.uml.codegen.jpa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.jbpm.designer.uml.code.metamodel.CodeClass;
import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodeField;
import org.jbpm.designer.uml.code.metamodel.CodePrimitiveTypeKind;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;
import org.jbpm.designer.uml.code.metamodel.CollectionTypeReference;
import org.jbpm.designer.uml.code.metamodel.PrimitiveTypeReference;
import org.jbpm.designer.uml.code.metamodel.relationaldb.IRelationalElement;
import org.jbpm.designer.uml.code.metamodel.relationaldb.IdStrategy;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalColumn;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalInverseLink;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalKey;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalLink;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalLinkTable;
import org.jbpm.designer.uml.code.metamodel.relationaldb.RelationalTable;
import org.jbpm.designer.uml.codegen.java.JavaCodeGenerator;
import org.jbpm.designer.uml.codegen.util.NameConverter;

public class JpaCodeDecorator extends AbstractJavaCodeDecorator {
	Map<CodeTypeReference, JpaDataTypeStrategy> dataTypeStrategies = new HashMap<CodeTypeReference, JpaDataTypeStrategy>();
	{
		dataTypeStrategies.put(new PrimitiveTypeReference(CodePrimitiveTypeKind.INTEGER), JpaRelationalDataType.INT);
		dataTypeStrategies.put(new PrimitiveTypeReference(CodePrimitiveTypeKind.STRING), JpaRelationalDataType.STRING);
		dataTypeStrategies.put(new PrimitiveTypeReference(CodePrimitiveTypeKind.BOOLEAN), JpaRelationalDataType.BOOLEAN);
		dataTypeStrategies.put(new PrimitiveTypeReference(CodePrimitiveTypeKind.REAL), JpaRelationalDataType.DOUBLE);
		dataTypeStrategies.put(new CodeTypeReference(false, "cmmntypes", "DateTime"), JpaRelationalDataType.DATETIME);
		dataTypeStrategies.put(new CodeTypeReference(false, "cmmntypes", "Date"), JpaRelationalDataType.DATE);
		dataTypeStrategies.put(new CodeTypeReference(false, "cmmntypes", "Time"), JpaRelationalDataType.TIME);
		dataTypeStrategies.put(new CodeTypeReference(false, "cmmntypes", "LargeText"), JpaRelationalDataType.TEXT);
		dataTypeStrategies.put(new CodeTypeReference(false, "cmmntypes", "Base64Bomary"), JpaRelationalDataType.BINARY);
	}
	private boolean softDelete = true;

	@Override
	public void appendAdditionalFields(JavaCodeGenerator sb, CodeClassifier cc) {
		IRelationalElement element = cc.getData(IRelationalElement.class);
		if (element instanceof RelationalTable) {
			RelationalTable relationalTable = (RelationalTable) element;
			if (!hasPkField(cc, relationalTable)) {
				sb.append("  @Id\n");
				sb.append("  @GeneratedValue\n");
				sb.append("  Long ");
				sb.append(getPkFieldName(relationalTable));
				sb.appendLineEnd();
			}
		}
	}

	protected boolean hasPkField(CodeClassifier cc, RelationalTable relationalTable) {
		return cc.getFields().get(getPkFieldName(relationalTable)) != null;
	}

	protected String getPkFieldName(RelationalTable relationalTable) {
		return relationalTable.getPrimaryKeyField() == null ? "id" : relationalTable.getPrimaryKeyField();
	}

	@Override
	public void appendAdditionalMethods(JavaCodeGenerator sb, CodeClassifier cc) {
		IRelationalElement element = cc.getData(IRelationalElement.class);
		if (element instanceof RelationalTable) {
			RelationalTable relationalTable = (RelationalTable) element;
			if (!hasPkField(cc, relationalTable)) {
				String pkFieldName = getPkFieldName(relationalTable);
				sb.append("  public Long get");
				sb.append(NameConverter.capitalize(pkFieldName));
				sb.append("(){\n");
				sb.append("    return this.");
				sb.append(pkFieldName);
				sb.appendLineEnd();
				sb.append("  }\n");
				sb.append("  public void set");
				sb.append(NameConverter.capitalize(pkFieldName));
				sb.append("(Long value){\n");
				sb.append("    this.");
				sb.append(pkFieldName);
				sb.append("=value");
				sb.appendLineEnd();
				sb.append("  }\n");
			}
		}
	}

	@Override
	public void appendAdditionalImports(JavaCodeGenerator sb, CodeClassifier cc) {
		sb.append("import javax.persistence.Entity;\n");
		sb.append("import javax.persistence.Table;\n");
		SortedSet<String> imports = new TreeSet<String>();
		Set<Entry<String, CodeField>> entrySet = cc.getFields().entrySet();
		IRelationalElement d = cc.getData(IRelationalElement.class);
		if (d instanceof RelationalTable) {
			RelationalTable relationalTable = (RelationalTable) d;
			if (!hasPkField(cc, relationalTable)) {
				imports.add("javax.persistence.Id");
				imports.add("javax.persistence.GeneratedValue");
			}
		}
		for (Entry<String, CodeField> entry : entrySet) {
			CodeField field = entry.getValue();
			IRelationalElement data = field.getData(IRelationalElement.class);
			if (data instanceof RelationalInverseLink) {
				if (((RelationalInverseLink) data).isManyToMany()) {
					imports.add("javax.persistence.ManyToMany");
				} else if (((RelationalInverseLink) data).isOneToMany()) {
					imports.add("javax.persistence.OneToMany");
				} else if (((RelationalInverseLink) data).isOneToOne()) {
					imports.add("javax.persistence.OneToOne");
				}
				if (((RelationalInverseLink) data).isChild()) {
					imports.add("javax.persistence.CascadeType");
				}
			} else if (data instanceof RelationalLink && !(field.getType() instanceof CollectionTypeReference)) {
				if (((RelationalLink) data).isOneToOne()) {
					imports.add("javax.persistence.OneToOne");
				} else {
					imports.add("javax.persistence.ManyToOne");

				}
				imports.add("javax.persistence.JoinColumns");
				imports.add("javax.persistence.JoinColumn");
			} else if (data instanceof RelationalLinkTable) {
				imports.add("javax.persistence.ManyToMany");
				imports.add("javax.persistence.JoinTable");
				imports.add("javax.persistence.JoinColumn");
			} else if (data instanceof RelationalKey) {
				imports.add("javax.persistence.Id");
				if (((RelationalKey) data).getStrategy() == IdStrategy.AUTO_ID) {
					imports.add("javax.persistence.GeneratedValue");
				}
			} else if (data instanceof RelationalColumn) {
				if (((RelationalColumn) data).isEnumeration()) {
					imports.add("javax.persistence.Enumerated");
				} else {
					JpaDataTypeStrategy jpaDataTypeStrategy = dataTypeStrategies.get(field.getType());
					if (jpaDataTypeStrategy != null) {
						imports.addAll(jpaDataTypeStrategy.getImports());
					}
				}
			}
		}
		for (String string : imports) {
			sb.append("import ");
			sb.append(string);
			sb.appendLineEnd();
		}
	}

	@Override
	public void decorateClassDeclaration(JavaCodeGenerator sb, CodeClass cc) {
		IRelationalElement element = cc.getData(IRelationalElement.class);
		if (element instanceof RelationalTable) {
			sb.append("@Entity(name=\"");
			sb.append(cc.getName());
			sb.append("\")\n");
			sb.append("@Table(name=\"");
			sb.append(((RelationalTable) element).getTableName());
			sb.append("\")\n");
		}
	}

	@Override
	public void decorateFieldDeclaration(JavaCodeGenerator sb, CodeField field) {
		if (field.getOwner() instanceof CodeClass) {
			IRelationalElement element = field.getData(IRelationalElement.class);
			if (element instanceof RelationalLink) {
				RelationalLink relationalLink = (RelationalLink) element;
				if (relationalLink.isOneToOne()) {
					sb.append("  @OneToOne()\n");
				} else {
					sb.append("  @ManyToOne()\n");
				}
				Map<String, String> columnMap = relationalLink.getColumnMap();
				if (columnMap.size() > 0) {
					sb.append("  @JoinColumns(value=");
					appendJoinColumns(sb, columnMap);
					sb.append("  )\n");
				}
			} else if (element instanceof RelationalLinkTable) {
				RelationalLinkTable relationalLink = (RelationalLinkTable) element;
				sb.append("  @ManyToMany()\n");
				sb.append("  @JoinTable(name=\"");
				sb.append(relationalLink.getTableName());
				Map<String, String> fromColumnMap = relationalLink.getFromColumnMap();
				if (fromColumnMap.size() > 0) {
					sb.append("\",");
					sb.append("joinColumns=");
					appendJoinColumns(sb, fromColumnMap);
				}
				Map<String, String> toColumnMap = relationalLink.getToColumnMap();
				if (toColumnMap.size() > 0) {
					sb.append("            , inverseJoinColumns=");
					appendJoinColumns(sb, toColumnMap);
				}
				sb.append("    )\n");
			} else if (element instanceof RelationalInverseLink) {
				RelationalInverseLink relationalInverseLink = (RelationalInverseLink) element;
				if (relationalInverseLink.isManyToMany()) {
					sb.append("  @ManyToMany(mappedBy=\"");
				} else if (relationalInverseLink.isOneToMany()) {
					sb.append("  @OneToMany(mappedBy=\"");
				} else {
					sb.append("  @OneToOne(mappedBy=\"");
				}
				sb.append(relationalInverseLink.getLinkProperty());
				sb.append("\"");
				if (relationalInverseLink.isChild()) {
					sb.append(",cascade=CascadeType.ALL");
					if (softDelete == false) {
						sb.append(",orphanRemoval=true");
					}
				}
				sb.append(")\n");
			} else if (element instanceof RelationalKey) {
				sb.append("  @Id()\n");
				if (((RelationalKey) element).getStrategy() == IdStrategy.AUTO_ID) {
					sb.append("  @GeneratedValue()\n");
				}

			} else if (element instanceof RelationalColumn) {
				if (((RelationalColumn) element).isEnumeration()) {
					sb.append("  @Enumerated()\n");
				} else {
					JpaDataTypeStrategy jpaDataTypeStrategy = dataTypeStrategies.get(field.getType());
					if (jpaDataTypeStrategy != null) {
						jpaDataTypeStrategy.beforeField("  ", sb, field, (RelationalColumn) element);
					}
				}

			}
		}
	}

	protected void appendJoinColumns(JavaCodeGenerator sb, Map<String, String> columnMap) {
		sb.append("{\n");
		Set<Entry<String, String>> entrySet = columnMap.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			sb.append("        ");
			sb.append("@JoinColumn(name=\"");
			sb.append(entry.getKey());
			sb.append("\",referencedColumnName=\"");
			sb.append(entry.getValue());
			sb.append("\")");
			if (iterator.hasNext()) {
				sb.append(",");
				sb.append("\n");
			}
		}
		sb.append("}\n");
	}
}
