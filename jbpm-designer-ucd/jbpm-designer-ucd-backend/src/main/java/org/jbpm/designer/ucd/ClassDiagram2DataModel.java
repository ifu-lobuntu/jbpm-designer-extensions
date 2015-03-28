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
import org.kie.workbench.common.screens.datamodeller.model.AnnotationDefinitionTO;
import org.kie.workbench.common.screens.datamodeller.model.AnnotationTO;
import org.kie.workbench.common.screens.datamodeller.model.DataModelTO;
import org.kie.workbench.common.screens.datamodeller.model.DataModelTO.TOStatus;
import org.kie.workbench.common.screens.datamodeller.model.DataObjectTO;
import org.kie.workbench.common.screens.datamodeller.model.ObjectPropertyTO;
/**
 * Just an experiment. 
 * @author ampie
 *
 */
public class ClassDiagram2DataModel {
    private Map<String, AnnotationDefinitionTO> annotationDefinitions;
    public ClassDiagram2DataModel(Map<String, AnnotationDefinitionTO> annotationDefinitions) {
        this.annotationDefinitions = annotationDefinitions;
    }

    public DataModelTO toDataModel(XMLResource umlResource, String modelUri) {
        DataModelTO dm = new DataModelTO();
        String projectName = modelUri.substring(modelUri.indexOf("@") + 1);
        projectName = projectName.substring(projectName.indexOf("/") + 1);
        projectName = projectName.substring(0, projectName.indexOf("/"));
        String packageName = modelUri.substring(modelUri.indexOf("src/main/resources/") + "src/main/resources/".length());
        if (packageName.indexOf("/") > 0) {
            packageName = packageName.substring(0, packageName.indexOf("/")).replace('/', '.');
        } else {
            packageName = null;
        }
        dm.setParentProjectName(projectName);
        Package pkg = (Package) umlResource.getContents().get(0);
        if (packageName == null) {
            packageName = pkg.getName();
        } else {
            pkg.setName(packageName);
        }
        for (Type type : pkg.getOwnedTypes()) {
            if (type instanceof Class) {
                DataObjectTO current = new DataObjectTO(type.getName(), packageName, null);
                current.setStatus(TOStatus.PERSISTENT_EXTERNALLY_MODIFIED);
                dm.getDataObjects().add(current);
                EList<Property> ownedAttributes = ((Class) type).getOwnedAttributes();
                for (Property property : ownedAttributes) {
                    if (property.getType() instanceof PrimitiveType || property.getType() instanceof Class) {
                        String typeName = getType(property);
                        if (property.getType().getPackage() == pkg) {
                            typeName = packageName + "." + property.getType().getName();
                        }
                        ObjectPropertyTO op = new ObjectPropertyTO(property.getName(), typeName, property.isMultivalued(),
                                property.getType() instanceof PrimitiveType);
                        AnnotationTO position = new AnnotationTO(annotationDefinitions.get(Position.class.getName()));
                        position.setValue("value", (ownedAttributes.indexOf(property) + 1) + "");
                        op.getAnnotations().add(position);
                        AnnotationTO label = new AnnotationTO(annotationDefinitions.get(Label.class.getName()));
                        label.setValue("value", property.getName());
                        op.getAnnotations().add(label);
                        AnnotationTO desc = new AnnotationTO(annotationDefinitions.get(Description.class.getName()));
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
