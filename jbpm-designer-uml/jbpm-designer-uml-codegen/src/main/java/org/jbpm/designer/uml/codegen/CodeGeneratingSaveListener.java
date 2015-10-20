package org.jbpm.designer.uml.codegen;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.jbpm.designer.dd.jbpmdd.SaveResourceListener;
import org.jbpm.designer.extensions.diagram.ProfileName;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.AssetBuilderFactory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.impl.AssetBuilder;
import org.jbpm.designer.uml.code.metamodel.CodeClassifier;
import org.jbpm.designer.uml.code.metamodel.CodePackage;
import org.jbpm.designer.uml.code.metamodel.CodePackageReference;
import org.jbpm.designer.uml.codegen.codemodel.CodeModelBuilder;
import org.jbpm.designer.uml.codegen.codemodel.DefaultCodeModelBuilder;
import org.jbpm.designer.uml.codegen.codemodel.UmlCodeModelVisitorAdaptor;
import org.jbpm.designer.uml.codegen.java.JavaCodeGenerator;
import org.jbpm.designer.uml.codegen.jpa.AbstractJavaCodeDecorator;
import org.jbpm.designer.uml.codegen.jpa.JpaCodeDecorator;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;

@RequestScoped
@ProfileName("ucd")
public class CodeGeneratingSaveListener implements SaveResourceListener {
    private UmlCodeModelVisitorAdaptor adaptor = new UmlCodeModelVisitorAdaptor();
    private DefaultCodeModelBuilder[] builders = { new CodeModelBuilder(false) };
    private AbstractCodeGenerator codeGenerator = new JavaCodeGenerator();
    private AbstractJavaCodeDecorator[] decorators = { new JpaCodeDecorator() };
    @Inject
    private Repository repository;

    public CodeGeneratingSaveListener() {
        if (codeGenerator instanceof JavaCodeGenerator) {
            JavaCodeGenerator jcg = (JavaCodeGenerator) codeGenerator;
            for (AbstractJavaCodeDecorator cd : decorators) {
                jcg.addDecorator(cd);
            }
        }
    }

    @Override
    public void onSave(XMLResource resource) {
        try {
            String ps = resource.getURI().toPlatformString(true);
            String packageName = getPackageName(ps);

            for (DefaultCodeModelBuilder b : this.builders) {
                for (EObject o : resource.getContents()) {
                    if (o instanceof Package) {
                        //Replace Package
                        if (packageName != null) {
                            b.getUmlToCodeReferenceMap().registerPathname((Namespace) o,
                                    new CodePackageReference(null, "", Collections.singletonMap("java", packageName)));
                        }
                        this.adaptor.startVisiting(b, (Package) o);
                    }
                }
            }
            String start = EMFVFSURIConverter.getProjectName(resource.getURI()) + "src/main/java/";
            if(packageName!=null){
                start=start + packageName.replace('.', '/');
            }
            for (CodePackage codePackage : adaptor.getCodeModel().getChildren().values()) {
                //immaterial because we only do one package per resource
                createText(codePackage, start);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    protected static String getPackageName(String ps) {
        String resourcePath = "src/main/resources";
        int indexOf = ps.indexOf(resourcePath);
        CodePackageReference cp = null;
        String packageName = null;
        if (indexOf > 0) {
            packageName = ps.substring(indexOf + resourcePath.length()+1, ps.lastIndexOf("/")).replace('/', '.');
        }
        return packageName;
    }

    @SuppressWarnings({ "rawtypes" })
    private void cleanDirectory(String start) {
        for (Asset asset : repository.listAssets(start)) {
            asset = repository.loadAsset(asset.getUniqueId());
            if (asset.getAssetContent().toString().startsWith(JavaCodeGenerator.MARKER_COMMENT)) {
                repository.deleteAsset(asset.getUniqueId());
            }
        }
    }

    private void createText(CodePackage codeModel, String start) {
        Collection<CodeClassifier> values = codeModel.getClassifiers().values();
        String packageLocation = start;
        if (repository.directoryExists(packageLocation)) {
            cleanDirectory(packageLocation);
        } else {
            repository.createDirectory(packageLocation);
        }
        for (CodeClassifier codeClassifier : values) {
            String javaSource = codeGenerator.toClassifierDeclaration(codeClassifier);
            try {
                AssetBuilder b = AssetBuilderFactory.getAssetBuilder(Asset.AssetType.Text);
                @SuppressWarnings("unchecked")
                Asset<String> asset = b.location(packageLocation).name(codeClassifier.getName()).type("java").content(javaSource).getAsset();
                repository.createAsset(asset);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (CodePackage codePackage : codeModel.getChildren().values()) {
            createText(codePackage, packageLocation + "/");
        }
    }
}