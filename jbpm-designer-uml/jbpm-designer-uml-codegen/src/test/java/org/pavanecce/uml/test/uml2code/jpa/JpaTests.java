package org.pavanecce.uml.test.uml2code.jpa;

import java.util.Collection;
import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.script.ScriptContext;

import org.hibernate.ejb.HibernatePersistence;
import org.jbpm.cmmn.casefile.jpa.JpaCaseFilePersistence;
import org.jbpm.designer.uml.code.metamodel.CodeClass;
import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodePackage;
import org.jbpm.designer.uml.codegen.AbstractCodeGenerator;
import org.jbpm.designer.uml.codegen.java.JavaCodeGenerator;
import org.jbpm.designer.uml.codegen.jpa.JpaCodeDecorator;
import org.junit.Before;
import org.pavanecce.common.test.util.ConstructionCaseExample;

public class JpaTests extends AbstractPersistenceTest {

	public JpaTests() {
		super("JpaPersistence");
	}

	@Before
	public void setup() throws Exception {
		example = new ConstructionCaseExample("JpaPersistence");
		helper.setDecorators(new JpaCodeDecorator());
		helper.generateCode(new JavaCodeGenerator());
		Thread.currentThread().setContextClassLoader(helper.getClassLoader());
		TestPersistenceUnitInfo pui = new TestPersistenceUnitInfo("construction", helper.getClassLoader());
		addMappedClasses(pui, helper.getAdaptor().getCodeModel(), helper.getCodeGenerator());
		HibernatePersistence hibernatePersistence = new HibernatePersistence();
		EntityManagerFactory emf = hibernatePersistence.createContainerEntityManagerFactory(pui, new HashMap<String, String>());
		helper.initScriptingEngine();
		helper.getJavaScriptContext().setAttribute("p", new JpaCaseFilePersistence(emf,null), ScriptContext.ENGINE_SCOPE);
	}

	protected static void addMappedClasses(TestPersistenceUnitInfo pui, CodePackage codePackage, AbstractCodeGenerator jcg) {
		for (CodeClassifier cc : codePackage.getClassifiers().values()) {
			if (cc instanceof CodeClass) {
				pui.getManagedClassNames().add(jcg.toQualifiedName(cc.getTypeReference()));
			}
		}
		Collection<CodePackage> values = codePackage.getChildren().values();
		for (CodePackage child : values) {
			addMappedClasses(pui, child, jcg);
		}
	}

}
