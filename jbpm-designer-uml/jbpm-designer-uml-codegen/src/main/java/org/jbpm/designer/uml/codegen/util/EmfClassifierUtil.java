package org.jbpm.designer.uml.codegen.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

public class EmfClassifierUtil {

    public static boolean conformsTo(Classifier from, Classifier to) {
        if (from.getName().equals("OclVoid")) {
            return true;
        }
//        if (from instanceof CollectionType && to instanceof CollectionType) {
//            return conformsTo((CollectionType) from, (CollectionType) to);
//        }
        if (from instanceof PrimitiveType && to instanceof PrimitiveType) {
            return comformsToLibraryType(from, to.getName());
        }
        if (from.equals(to)) {
            return true;
        } else if (from.allParents().contains(to)) {
            return true;
        } else if (from instanceof BehavioredClassifier) {
            for (Interface i : ((BehavioredClassifier) from).getAllImplementedInterfaces()) {
                if (i.equals(to) || i.allParents().contains(to)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isPersistentComplexStructure(Type type) {
        return isPersistent(type) && isComplexStructure(type);
    }


    public static boolean comformsToLibraryType(Type type, String string) {
        if (type.getName() != null && type.getName().equalsIgnoreCase(string)) {
            return true;
        } else if (type instanceof Classifier) {
            for (Classifier g : ((Classifier) type).getGenerals()) {
                if (comformsToLibraryType(g, string)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSimpleType(Type type) {
        return type instanceof PrimitiveType
                || (type.eClass().equals(UMLPackage.eINSTANCE.getDataType()) && StereotypesHelper.hasStereotype(type, StereotypeNames.VALUE_TYPE));
    }

    public static boolean isPersistent(Type type) {
        if (!isComplexStructure(type) || type instanceof Stereotype) {
            return false;
        } else {
            return type instanceof Class || type instanceof Actor || (type instanceof Association && EmfAssociationUtil.isClass((Association) type))
                    || isStructuredDataType(type);
        }

    }

    private static boolean isComplexStructure(Type type) {
        if (type instanceof PrimitiveType) {
            return false;
        }
//        if (type instanceof Signal || type instanceof Enumeration || type instanceof Class || type instanceof Actor || type instanceof Collaboration
//                || type instanceof MessageType || isStructuredDataType(type) || (type instanceof Association && EmfAssociationUtil.isClass((Association) type))) {
//            return true;
//        }
        if (type instanceof Signal || type instanceof Enumeration || type instanceof Class || type instanceof Actor || type instanceof Collaboration
                || isStructuredDataType(type) || (type instanceof Association && EmfAssociationUtil.isClass((Association) type))) {
            return true;
        }
        return false;
    }

    private static boolean isStructuredDataType(Type type) {
        return type.eClass().equals(UMLPackage.eINSTANCE.getDataType()) && !isSimpleType(type);
    }

    public static Map<String, String> getMappings(NamedElement e) {
        EList<EObject> sas = e.getStereotypeApplications();
        Map<String, String> typeMappings = new HashMap<String, String>();
        for (EObject eObject : sas) {
            for (EStructuralFeature feat : eObject.eClass().getEAllStructuralFeatures()) {
                if (feat.getEType().getName().equals("Mapping")) {
                    @SuppressWarnings("unchecked")
                    EList<EObject> mappings = (EList<EObject>) eObject.eGet(feat);
                    for (EObject mapping : mappings) {
                        typeMappings.put((String) mapping.eGet(mapping.eClass().getEStructuralFeature("language")),
                                (String) mapping.eGet(mapping.eClass().getEStructuralFeature("mapping")));
                    }
                }
            }
        }
        return typeMappings;
    }

    @SuppressWarnings("unchecked")
    public static <T extends Classifier> T getRootClass(T classifier) {
        for (Classifier c : classifier.getGenerals()) {
            if (classifier.eClass().isInstance(c)) {
                return getRootClass((T) c);
            }
        }
        return classifier;
    }

	public static Object getTagValue(Classifier dt, String mappedImplementationType) {
		EList<Stereotype> appliedStereotypes = dt.getAppliedStereotypes();
		for (Stereotype st : appliedStereotypes) {
			if (st.getDefinition().getEStructuralFeature(mappedImplementationType) != null) {
				return dt.getValue(st, mappedImplementationType);
			}
		}
		return null;
	}
}
