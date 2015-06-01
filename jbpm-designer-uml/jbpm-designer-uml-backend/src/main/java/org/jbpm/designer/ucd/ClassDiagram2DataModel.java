package org.jbpm.designer.ucd;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.kie.api.definition.type.Description;
import org.kie.api.definition.type.Label;
import org.kie.api.definition.type.Position;
import org.kie.workbench.common.services.datamodeller.core.AnnotationDefinition;
import org.kie.workbench.common.services.datamodeller.core.DataModel;
import org.kie.workbench.common.services.datamodeller.core.impl.AnnotationImpl;
import org.kie.workbench.common.services.datamodeller.core.impl.DataModelImpl;
import org.kie.workbench.common.services.datamodeller.core.impl.DataObjectImpl;
import org.kie.workbench.common.services.datamodeller.core.impl.ObjectPropertyImpl;
/**
 * Just an experiment. 
 * @author ampie
 *
 */
public class ClassDiagram2DataModel {
    private Map<String, AnnotationDefinition> annotationDefinitions;
    private XMLResource umlResource;
    private String modelUri;
    public ClassDiagram2DataModel(Map<String, AnnotationDefinition> annotationDefinitions,XMLResource umlResource, String modelUri) {
        this.annotationDefinitions = annotationDefinitions;
        this.umlResource=umlResource;
        this.modelUri=modelUri;
    }
    public String getProjectName(){
        String projectName = modelUri.substring(modelUri.indexOf("@") + 1);
        projectName = projectName.substring(projectName.indexOf("/") + 1);
        projectName = projectName.substring(0, projectName.indexOf("/"));
        return projectName;
    }
    public DataModel toDataModel() {
        DataModelImpl dm = new DataModelImpl();
        String projectName = modelUri.substring(modelUri.indexOf("@") + 1);
        projectName = projectName.substring(projectName.indexOf("/") + 1);
        projectName = projectName.substring(0, projectName.indexOf("/"));
        String packageName = modelUri.substring(modelUri.indexOf("src/main/resources/") + "src/main/resources/".length());
        if (packageName.indexOf("/") > 0) {
            packageName = packageName.substring(0, packageName.indexOf("/")).replace('/', '.');
        } else {
            packageName = null;
        }
        Package pkg = (Package) umlResource.getContents().get(0);
        if (packageName == null) {
            packageName = pkg.getName();
        } else {
            pkg.setName(packageName);
        }
        for (Type type : pkg.getOwnedTypes()) {
            if (type instanceof Class) {
                DataObjectImpl current = new DataObjectImpl(type.getName(), packageName);
                dm.getDataObjects().add(current);
                EList<Property> ownedAttributes = ((Class) type).getOwnedAttributes();
                for (Property property : ownedAttributes) {
                    if (property.getType() instanceof PrimitiveType || property.getType() instanceof Class) {
                        String typeName = getType(property);
                        if (property.getType().getPackage() == pkg) {
                            typeName = packageName + "." + property.getType().getName();
                        }
                        ObjectPropertyImpl op = new ObjectPropertyImpl(property.getName(), typeName, property.isMultivalued());
                        AnnotationImpl position = new AnnotationImpl(annotationDefinitions.get(Position.class.getName()));
                        position.setValue("value", (ownedAttributes.indexOf(property) + 1) + "");
                        op.getAnnotations().add(position);
                        AnnotationImpl label = new AnnotationImpl(annotationDefinitions.get(Label.class.getName()));
                        label.setValue("value", property.getName());
                        op.getAnnotations().add(label);
                        AnnotationImpl desc = new AnnotationImpl(annotationDefinitions.get(Description.class.getName()));
                        desc.setValue("value", property.getName());
                        op.getAnnotations().add(desc);
                        current.getProperties().add(op);
                    }
                }
            }
        }
        return dm;
    }

    private String getType(TypedElement property) {
        String qualifiedName = property.getType().getQualifiedName();
        return UmlTypeMap.get(qualifiedName);
    }
}
