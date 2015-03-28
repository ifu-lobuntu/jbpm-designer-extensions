package org.jbpm.designer.uml.codegen.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;

public class EmfAssociationUtil {

    public static Map<AssociationClass, Property> getEffectiveAssociationClasses(Classifier c) {
        Map<AssociationClass, Property> result = new HashMap<AssociationClass, Property>();
        addAssociations(c, result);
        return result;
    }

    private static void addAssociations(Classifier c, Map<AssociationClass, Property> result) {
        if (c instanceof BehavioredClassifier) {
            for (Interface i : ((BehavioredClassifier) c).getImplementedInterfaces()) {
                addAssociations(i, result);
            }
        }
        for (Classifier g : c.getGenerals()) {
            addAssociations(g, result);
        }
        for (Association association : c.getAssociations()) {
            if (association instanceof AssociationClass) {
                EList<Property> memberEnds = association.getMemberEnds();
                for (Property property : memberEnds) {
                    if (EmfClassifierUtil.conformsTo((Classifier) property.getType(), c)) {
                        result.put((AssociationClass) association, property.getOtherEnd());
                    }
                }
            }
        }
    }

    public static boolean isClass(Association a) {
        if (a == null) {
            return false;
        } else {
            for (Property property : a.getMemberEnds()) {
                if (EmfPropertyUtil.isDerived(property)) {
                    return false;
                }
            }
            if (a instanceof AssociationClass) {
                return true;
            } else {
                if (a.getMembers().size() < 2) {// happens during deletions
                    return false;
                }
                if (a.getMemberEnds().size() > 2) {
                    return true;
                }
                for (Property property : a.getMemberEnds()) {
                    if (EmfPropertyUtil.isMany(property) && (property.getType() instanceof Interface || property.getOtherEnd().getType() instanceof Interface)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

}
