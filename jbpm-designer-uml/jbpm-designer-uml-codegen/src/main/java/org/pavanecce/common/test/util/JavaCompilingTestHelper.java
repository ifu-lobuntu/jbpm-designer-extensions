package org.pavanecce.common.test.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodeModel;
import org.jbpm.designer.uml.code.metamodel.CodePackage;
import org.jbpm.designer.uml.codegen.AbstractCodeGenerator;
import org.jbpm.designer.uml.codegen.codemodel.CodeModelBuilder;
import org.jbpm.designer.uml.codegen.codemodel.DefaultCodeModelBuilder;
import org.jbpm.designer.uml.codegen.codemodel.UmlCodeModelVisitorAdaptor;
import org.jbpm.designer.uml.codegen.java.JavaCodeGenerator;
import org.jbpm.designer.uml.codegen.jpa.AbstractJavaCodeDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class JavaCompilingTestHelper {
	private ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
	protected Logger logger = LoggerFactory.getLogger(getClass());
	private AbstractCodeGenerator javaCodeGenerator;
	private ScriptEngine javaScriptEngine;
	private ScriptContext javaScriptContext;
	private ClassLoader classLoader;
	private UmlCodeModelVisitorAdaptor adaptor;
	protected DefaultCodeModelBuilder[] builders;
	protected UmlExample example;
	private AbstractJavaCodeDecorator[] decorators;

	public JavaCompilingTestHelper(UmlExample example) {
		super();
		this.example=example;
	}

	public void after() {
		Thread.currentThread().setContextClassLoader(oldContextClassLoader);
	}

	public ClassLoader getOldContextClassLoader() {
		return oldContextClassLoader;
	}

	public void initScriptingEngine() {
		Thread.currentThread().setContextClassLoader(getClassLoader());
		ScriptEngineManager manager = new ScriptEngineManager();
		setJavaScriptEngine(manager.getEngineByName("js"));
		setJavaScriptContext(getJavaScriptEngine().getContext());
	}

	protected File calculateTextOutputRoot() {
		File f = new File(System.getProperty("user.home"), "tmp/" + getTestName() + "/");
		f.mkdirs();
		return f;
	}

	public File calculateBinaryOutputRoot() {
		File cp = new File(System.getProperty("user.home"), "tmp/" + getTestName() + "/classes");
		cp.mkdirs();
		return cp;
	}

	protected String getTestName(){
		return example.getTestName();
	}

	protected ClassLoader compile(Set<File> set) throws IOException {
		ClassLoader newClassLoader = null;
		File destination = calculateBinaryOutputRoot();
		FileUtil.deleteAllChildren(destination);
		newClassLoader = compileInStandalone(set, destination);
		return newClassLoader;
	}

	protected ClassLoader compileInStandalone(Set<File> set, File destination) throws IOException {
		StringBuilder cp = new StringBuilder();
		URLClassLoader urlClassLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
		appendClassPath(cp, urlClassLoader);
		try {
			JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager sjfm = jc.getStandardFileManager(null, null, null);
			Iterable<? extends JavaFileObject> codeObjecten = sjfm.getJavaFileObjects(set.toArray(new File[set.size()]));
			String[] opties = new String[] { "-d", destination.getCanonicalPath(), "-classpath", cp.toString() };
			CompilationTask task = jc.getTask(new OutputStreamWriter(System.out), sjfm, null, Arrays.asList(opties), null, codeObjecten);
			// CompilationTask task = jc.getTask(new
			// OutputStreamWriter(System.out), sjfm ,null,
			// Arrays.asList(opties), null, codeObjecten);
			task.call();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		List<URL> list = new ArrayList<URL>(Arrays.asList(urlClassLoader.getURLs()));
		list.add(0, destination.toURI().toURL());
		return new URLClassLoader(list.toArray(new URL[list.size()]), urlClassLoader);
	}

	protected void appendClassPath(StringBuilder cp, URLClassLoader urlClassLoader) {
		URL[] urLs = urlClassLoader.getURLs();
		for (URL url : urLs) {
			logger.info("adding class path entry:" + url);
			cp.append(url.toExternalForm());
			cp.append(File.pathSeparatorChar);
		}
		if (urlClassLoader.getParent() instanceof URLClassLoader) {
			appendClassPath(cp, (URLClassLoader) urlClassLoader.getParent());
		}
	}

	public ScriptEngine getJavaScriptEngine() {
		return javaScriptEngine;
	}

	public void setJavaScriptEngine(ScriptEngine javaScriptEngine) {
		this.javaScriptEngine = javaScriptEngine;
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}

	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
		oldContextClassLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(classLoader);
	}

	public AbstractCodeGenerator getCodeGenerator() {
		return javaCodeGenerator;
	}

	public void setJavaCodeGenerator(AbstractCodeGenerator javaCodeGenerator) {
		this.javaCodeGenerator = javaCodeGenerator;
	}

	public ScriptContext getJavaScriptContext() {
		return javaScriptContext;
	}

	public void setJavaScriptContext(ScriptContext javaScriptContext) {
		this.javaScriptContext = javaScriptContext;
	}

	public UmlCodeModelVisitorAdaptor getAdaptor() {
		return adaptor;
	}

	public void setAdaptor(UmlCodeModelVisitorAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public void setBuilders(DefaultCodeModelBuilder ... builders){
		this.builders=builders;
	}
	public void setDecorators(AbstractJavaCodeDecorator ... decorators){
		this.decorators=decorators;
	}
	public void generateCode(AbstractCodeGenerator codeGenerator) throws Exception {
		setBuilders(new CodeModelBuilder(false));
		setup(codeGenerator);
	}

	public void setup(AbstractCodeGenerator codeGenerator) throws Exception {
		FileUtil.deleteAllChildren(calculateTextOutputRoot());
		this.setJavaCodeGenerator(codeGenerator);
		if (codeGenerator instanceof JavaCodeGenerator) {
			JavaCodeGenerator jcg = (JavaCodeGenerator) codeGenerator;
			// jcg.addDecorator(new AssociationCollectionCodeDecorator());
			for (AbstractJavaCodeDecorator cd : decorators) {
				jcg.addDecorator(cd);
			}
		}
		setAdaptor(new UmlCodeModelVisitorAdaptor());
		for (DefaultCodeModelBuilder b : this.builders) {
			this.getAdaptor().startVisiting(b, example.getModel());
		}
		generateSourceCode(this.getAdaptor().getCodeModel());
	}

	protected Object generateSourceCode(CodeModel codeModel) throws IOException {
	    File tmpDir = new File(System.getProperty("java.io.tmpdir")); 
	    File rootDir = new File(tmpDir,this.getTestName());
        rootDir.delete();
        rootDir.mkdirs();
        Set<File> files= new HashSet<File>();
        createText(codeModel, rootDir, files);
        setClassLoader(compile(files));
		return  files;
	}
    protected void createText(CodePackage codeModel, File sf, Set<File> files) {
        Collection<CodeClassifier> values = codeModel.getClassifiers().values();
        for (CodeClassifier codeClassifier : values) {
            String javaSource = getCodeGenerator().toClassifierDeclaration(codeClassifier);
            List<String> path = codeClassifier.getPackage().getPath();
            File file = sf;
            for (String string : path) {
                file=new File(file,string);
                file.mkdirs();
            }
            try {
                file=new File(file,codeClassifier.getName() + getExtension());
                System.out.println("writing " + file.getCanonicalPath());
                FileWriter w = new FileWriter(file);
                w.write(javaSource);
                w.flush();
                w.close();
                files.add(file);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (CodePackage codePackage : codeModel.getChildren().values()) {
            createText(codePackage, sf,files);
        }
    }

    public String getExtension() {
        return ".java";
    }


}